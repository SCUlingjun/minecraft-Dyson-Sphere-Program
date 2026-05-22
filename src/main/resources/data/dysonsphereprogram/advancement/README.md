# data/dysonsphereprogram/advancement

成就（Advancement）JSON 数据文件目录。

成就系统引导玩家按科技路线推进，同时作为教程。此目录存放所有成就的数据定义。

成就树结构：
```
root.json               进入戴森球计划世界（根成就）
├── first_ore.json      采集到第一块硅矿
├── first_machine.json  放置第一台机器
│   ├── power_grid.json 建立第一个能源网络
│   └── research.json   完成第一项科技研究
│       └── dyson_sphere.json  完成戴森球（最终成就）
```

每个 `.json` 文件指定：
- `parent` — 父成就 ID
- `criteria` — 触发条件（物品获取、方块放置、自定义触发器）
- `rewards` — 奖励（可选，如解锁配方）
- `display` — 图标、标题、描述、框架类型（task/goal/challenge）
