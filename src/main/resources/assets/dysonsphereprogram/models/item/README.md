# assets/dysonsphereprogram/models/item

物品模型 JSON 文件目录。

物品模型定义物品在手持、掉落、物品框中的外观。大多数物品使用 `item/generated` 父模型（2D 平面贴图）；工具类物品使用 `item/handheld`。

特殊情况：
- 带 `DataComponent` 的物品（如能量充满/耗尽的电池）通过 `overrides` 字段根据 NBT 切换模型
- 需要 3D 显示的物品（如机器方块的物品形态）引用 `models/block/` 中对应的方块模型

文件名与物品注册 ID 一致（如 `circuit_board.json`）。
