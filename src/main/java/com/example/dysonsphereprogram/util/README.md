# util

工具类目录。

存放各系统共用的纯工具方法，无游戏状态依赖，可安全地从任意线程调用（标注线程安全要求）。

典型工具类：
- `MultiblockHelper.java` — 多方块结构验证（按给定模板扫描方块位置）
- `EnergyMath.java` — 能量单位换算、效率计算公式
- `FluidHelper.java` — 流体搬运、罐体填充/排空的通用操作
- `InventoryHelper.java` — 物品栏搜索、物品转移、堆叠合并工具
- `NBTHelper.java` — NBT 读写的类型安全封装
- `LogisticsPathfinder.java` — 无人机 A* 路径计算（三维坐标空间）
- `VectorMath.java` — 三维向量运算（用于渲染和路径规划）

工具类不应持有静态可变状态；若需要按世界分区的状态，请使用 `SavedData` 或 capability。
