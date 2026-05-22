# block/machine

机器方块类目录。

机器方块继承自 `BaseEntityBlock`，具有对应的 `BlockEntity`（位于 `blockentity/machine/`）用于存储状态和运行逻辑。

典型机器包括：
- `SmelterBlock` — 冶炼机，将矿石熔炼为金属板
- `AssemblerBlock` — 组装机，合成复杂零件
- `MinerBlock` — 采矿机，自动采集地下资源
- `GeneratorBlock` — 发电机，产生能量（MJ/t）
- `RefineryBlock` — 精炼厂，处理流体原料

每个方块类只处理：方块外形、放置/破坏事件、朝向 BlockState，具体运行逻辑在对应的 BlockEntity 中。
