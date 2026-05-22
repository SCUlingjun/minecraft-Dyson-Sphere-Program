# item/tool

工具与装备物品目录。

包含玩家可装备或手持使用的高科技设备。

典型工具：
- `ElectromagneticRifleItem` — 电磁步枪，消耗能量发射高速弹丸
- `MechArmorItem` — 机甲护甲套装（头/胸/腿/脚），提供能量护盾
- `JetpackItem` — 喷气背包，消耗燃料实现飞行
- `ScannerItem` — 资源扫描仪，显示附近矿脉密度
- `WrenchItem` — 扳手，用于拆卸机器并保留内容物

带能量消耗的物品通过 NeoForge 的 `IEnergyStorage` capability 存储能量，在 `capability/` 目录中实现。
