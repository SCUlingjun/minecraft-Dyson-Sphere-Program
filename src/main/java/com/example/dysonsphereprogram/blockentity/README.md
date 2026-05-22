
# blockentity

方块实体（BlockEntity，旧称 TileEntity）根目录。

方块实体为方块附加可持久化的服务端状态，并在每个游戏刻（tick）运行逻辑。所有机器的实际运行逻辑（配方处理、能量计算、物品搬运）均在此目录的类中实现。

基础抽象类：
- `BaseMachineBlockEntity` — 公共父类，封装能量存储、物品栏、进度计时器
- `BaseStorageBlockEntity` — 存储类公共父类，封装容量和序列化

方块实体类型（`BlockEntityType`）统一在 `registry/ModBlockEntityTypes.java` 注册。

子目录：
- `machine/` — 机器方块实体
- `storage/` — 存储方块实体

