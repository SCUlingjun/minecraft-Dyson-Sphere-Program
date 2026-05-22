# menu

容器菜单（AbstractContainerMenu 子类）目录。

菜单类是服务端与客户端 GUI 之间的数据桥梁，负责：
- 定义物品槽（`Slot`）的布局和访问权限
- 处理玩家与槽位的交互（快捷键转移、拖拽分配）
- 通过 `ContainerData`/`DataSlot` 将机器状态（进度、能量）实时同步到客户端

对应的客户端 Screen 类位于 `client/gui/`。

典型菜单：
- `SmelterMenu.java` — 冶炼机菜单（1输入 + 1输出槽 + 燃料槽）
- `AssemblerMenu.java` — 组装机菜单（6输入 + 1输出槽）
- `StorageMenu.java` — 大型仓库菜单（支持翻页的多行物品槽）
- `ResearchMenu.java` — 矩阵研究站菜单（6矩阵输入槽）

菜单类型（`MenuType`）在 `registry/ModMenuTypes.java` 注册，并通过 `NetworkHooks.openScreen` 打开。
