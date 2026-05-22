# worldgen/ore

矿脉配置与矿石世界生成目录。

每种矿石有独立的配置类，指定：
- 生成层级（`minY` / `maxY`）
- 每区块尝试生成次数（`count`）
- 矿脉大小（`size`）
- 出现的生物群系（通过 BiomeModifier 过滤）

典型矿石：
- `SiliconOreGen.java` — 硅矿（沙漠/沙石层，y 0~80）
- `TitaniumOreGen.java` — 钛矿（深层石头，y -64~0）
- `FireIceGen.java` — 可燃冰晶体（冰川生物群系地表）
- `OpticalFiberGen.java` — 光纤矿（地下深岩，y -128~-20）
- `KimberliteGen.java` — 金伯利岩（携带钻石，极稀有）

矿脉 JSON 数据在 `resources/data/dysonsphereprogram/worldgen/` 中，Java 类负责程序化覆盖（如动态难度缩放）。
