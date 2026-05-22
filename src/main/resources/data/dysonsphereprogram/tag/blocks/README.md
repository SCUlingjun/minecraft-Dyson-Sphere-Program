# data/dysonsphereprogram/tag/blocks

方块标签（Block Tag）JSON 文件目录。

标签将多个方块归为一类，供配方、世界生成、工具判断等系统使用，避免硬编码方块列表。

典型标签文件：
- `machines.json` — 所有机器方块（用于扳手工具判断）
- `energy_cables.json` — 所有导线方块（用于能源网络拓扑扫描）
- `mineable/wrench.json` — 扳手可拆卸的方块（工具类标签）
- `ore_bearing_ground.json` — 采矿机可采矿的地面方块

也可覆盖原版/NeoForge 标签（将本 mod 方块追加到已有标签）：
- `minecraft:mineable/pickaxe.json` — 将机器方块加入镐子可挖范围
- `forge:ores/silicon.json` — 将硅矿加入通用矿石标签
