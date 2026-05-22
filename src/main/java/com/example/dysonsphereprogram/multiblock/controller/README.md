# multiblock/controller

多方块结构控制器目录。

控制器是整个多方块结构的驱动核心，以 BlockEntity 形式存在于控制器方块中。

基础抽象类：
- `AbstractMultiblockController.java` — 公共父类，封装以下职责：
  - 持有对应的 `MultiblockPattern` 引用
  - 调用 `validation/` 执行结构检测，缓存检测结果
  - 维护运行状态（`IDLE` / `FORMED` / `RUNNING` / `ERROR`）
  - 监听组成方块的破坏事件，自动解除成型状态
  - 提供 `tick()` 钩子供子类实现具体运行逻辑

各设备控制器（继承上述基类）：
- `DysonLaunchSiloController.java` — 戴森球发射井控制器（分阶段发射组件入轨）
- `MatrixLabController.java` — 矩阵研究站控制器（消耗矩阵推进科技进度）
- `PlanetaryEngineController.java` — 行星发动机控制器（消耗燃料积累推力值）
- `FusionReactorController.java` — 核聚变反应堆控制器（消耗氘输出大量能量）
