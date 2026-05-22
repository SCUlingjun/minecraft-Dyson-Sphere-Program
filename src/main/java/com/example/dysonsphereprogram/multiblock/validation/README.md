# multiblock/validation

多方块结构完整性检测目录。

负责将控制器周围的实际方块与 `pattern/` 定义的模板进行逐位比对，并在检测失败时给出精确的错误位置反馈。

核心类：
- `MultiblockValidator.java` — 主检测器，接受控制器位置和朝向，枚举模板的每个相对坐标，调用 `BlockMatcher` 逐一验证，返回 `ValidationResult`
- `ValidationResult.java` — 检测结果数据类，包含：
  - `isValid` — 是否完整成型
  - `errorPositions` — 不满足要求的方块坐标列表（用于高亮显示）
  - `errorMessage` — 本地化错误提示文本
- `StructureHighlighter.java`（客户端）— 在玩家手持扳手靠近控制器时，将错误位置渲染为红色轮廓，辅助玩家定位拼装错误

检测触发时机：
- 控制器方块被放置时
- 玩家右键点击控制器时（手动重新检测）
- 相邻方块发生变化时（`neighborChanged` 事件）
