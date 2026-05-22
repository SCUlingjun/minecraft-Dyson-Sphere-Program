# worldgen/structure

大型世界结构生成目录。

使用 Minecraft 的 `Structure` / `StructurePiece` 系统生成预制建筑，为玩家提供探索目标和初期资源。

典型结构：
- `AbandonedOutpostStructure.java` — 废弃前哨站，包含部分损坏的机器和战利品箱
- `AncientLaunchSiteStructure.java` — 古代发射台遗迹，暗示世界背景故事
- `CrashSiteStructure.java` — 坠毁飞船，含稀有零件战利品

每个结构类包含：
1. `Structure` 子类 — 定义结构生成位置（地表/地下/海面）和拼装规则
2. `StructurePiece` 子类 — 使用 `.nbt` 模板文件（存放在 `resources/data/dysonsphereprogram/structures/`）放置方块

结构通过 BiomeModifier 注入到指定生物群系，并设置生成概率。
