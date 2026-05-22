# client/gui

机器 GUI 屏幕（`AbstractContainerScreen` 子类）目录。

每个 Screen 类对应 `menu/` 中同名的 Menu 类，负责将菜单数据渲染为玩家可见的界面。

职责：
- 绘制背景贴图（`renderBg`）
- 绘制动态元素：进度条、能量条、流体液位显示（`renderFg`）
- 渲染物品槽工具提示
- 处理按钮点击（发送 `CustomPacketPayload` 到服务端）

典型 Screen：
- `SmelterScreen.java` — 冶炼机界面，显示燃烧进度和能量消耗
- `AssemblerScreen.java` — 组装机界面，显示合成配方预览
- `ResearchScreen.java` — 科技树全屏界面，支持缩放和拖拽
- `StorageScreen.java` — 大型仓库界面，带搜索框和排序按钮

GUI 贴图存放在 `resources/assets/dysonsphereprogram/textures/gui/`。
