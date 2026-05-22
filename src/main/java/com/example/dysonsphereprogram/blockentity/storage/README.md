# blockentity/storage

存储类方块实体目录。

负责管理物品、流体或能量的持久化存储，以及与物流网络的数据交换。

典型实现：
- `ItemStorageBlockEntity` — 大型物品仓库，支持物品过滤规则和优先级
- `FluidTankBlockEntity` — 流体储罐，实现 `IFluidHandler` capability
- `BatteryBlockEntity` — 蓄电池，实现 `IEnergyStorage` capability，接入能源网络
- `LogisticsChestBlockEntity` — 物流箱，向物流网络暴露物品槽

所有存储类 BlockEntity 必须正确实现 `saveAdditional` / `loadAdditional` 以保证存档不丢失数据。
