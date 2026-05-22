# assets/dysonsphereprogram/textures/gui

GUI 界面贴图目录。

存放机器 GUI 背景图和 UI 元素图集（sprite sheet）。推荐使用图集将同一界面的所有元素合并为一张大图，减少渲染调用次数。

典型文件：
- `smelter_gui.png` — 冶炼机背景（176×166 标准容器尺寸）
- `assembler_gui.png` — 组装机背景（256×222 大型界面）
- `research_gui.png` — 科技树全屏背景（512×512）
- `widgets.png` — 通用 UI 控件图集（进度条、能量条、按钮、图标）

坐标约定：所有贴图以左上角为原点，与 `GuiGraphics.blit` 的 uOffset/vOffset 参数对应。
