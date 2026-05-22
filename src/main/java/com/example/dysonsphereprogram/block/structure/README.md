# block/structure

多方块结构（Multiblock）的组成部件方块。

戴森球计划中许多大型设备（戴森球框架、行星发动机、矩阵研究站）都由多个方块拼装而成。此目录存放这些结构的各类零件方块。

关键设计模式：
- 控制器方块（Controller Block）负责验证结构完整性并驱动整体逻辑
- 框架方块（Frame Block）仅作为结构占位，无独立逻辑
- 结构检测逻辑由 `util/MultiblockHelper.java` 提供

典型部件：
- `DysonSphereFrameBlock` — 戴森球框架节点
- `PlanetaryEngineBlock` — 行星发动机推进段
- `MatrixLabBlock` — 矩阵研究站单元
