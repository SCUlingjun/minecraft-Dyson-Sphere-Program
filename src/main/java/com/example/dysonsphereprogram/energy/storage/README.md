# energy/storage

能源存储容器实现目录。

提供不同容量和特性的能量存储实现，供 BlockEntity 和物品（如喷气背包）挂载。

核心类：
- `ModEnergyStorage.java` — 基础实现，扩展自 NeoForge `EnergyStorage`，添加变更通知回调
- `TieredBatteryStorage.java` — 分级蓄电池（MK1~MK5），容量和充放电速率随等级提升
- `ItemEnergyStorage.java` — 物品内置能量存储，将 MJ 序列化到 NBT `DataComponent`
- `SuperCapacitorStorage.java` — 超级电容，极高充放电速率但容量较小，用于削峰填谷

所有实现均暴露 `IEnergyStorage` capability，由 NeoForge capability 系统注入到对应方块/物品。
