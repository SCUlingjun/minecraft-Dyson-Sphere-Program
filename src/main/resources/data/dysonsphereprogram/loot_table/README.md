# data/dysonsphereprogram/loot_table

战利品表（Loot Table）JSON 数据文件目录。

定义方块破坏、实体击杀、箱子开启时的掉落物。

子目录规范（遵循原版约定）：
```
loot_table/
├── blocks/     方块掉落（文件名 = 方块注册 ID）
├── entities/   实体掉落（文件名 = 实体注册 ID）
└── chests/     生成结构中的战利品箱内容
    ├── abandoned_outpost.json
    └── crash_site.json
```

方块战利品表注意事项：
- 含 `BlockEntity` 数据的方块（机器、存储箱）需要 `copy_nbt` 函数将 NBT 复制到掉落物
- 使用扳手（`WrenchItem`）破坏时触发 `dysonsphereprogram:player_used_wrench` 条件，保留内容物

结构箱战利品表使用 `weight` 权重控制物品稀有度，确保稀有零件（如古代芯片）掉落率合理。
