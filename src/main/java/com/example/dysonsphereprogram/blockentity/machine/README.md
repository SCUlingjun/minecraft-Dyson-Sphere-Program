# blockentity/machine

机器方块实体目录，包含所有机器的核心运行逻辑。

每个类对应 `block/machine/` 中的同名方块，实现 `ITickable`（服务端每刻运行）。

通用职责：
1. 从输入槽取出原料，匹配配方（`recipe/` 中定义）
2. 消耗能量（通过 `energy/` 模块扣除）
3. 按配方进度累计，完成后产出物品到输出槽
4. 将状态同步给客户端（通过 `network/` 数据包）

典型实现：
- `SmelterBlockEntity` — 冶炼机逻辑
- `AssemblerBlockEntity` — 组装机逻辑（支持多输入槽）
- `MinerBlockEntity` — 采矿机逻辑（扫描下方矿脉）
- `GeneratorBlockEntity` — 发电机逻辑（燃烧燃料产能）
- `RefineryBlockEntity` — 精炼厂逻辑（流体输入输出）
