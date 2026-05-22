# block/storage

存储类方块目录。

包含用于存储物品、流体或能量的方块，均带有对应的 `BlockEntity`（位于 `blockentity/storage/`）。

典型存储方块：
- `ItemStorageBlock` — 大容量物品仓库，支持物品过滤
- `FluidTankBlock` — 流体储罐，支持多种流体
- `BatteryBlock` — 蓄电池，以 MJ 为单位存储能量
- `LogisticsChestBlock` — 物流箱，接入物流网络

方块类负责破坏时掉落存储内容（`onRemove` 方法），以及对应的 `BlockEntityType` 绑定。
