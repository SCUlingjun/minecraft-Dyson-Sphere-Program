# data/dysonsphereprogram/recipe

配方 JSON 数据文件目录。

每个配方对应一个 `.json` 文件，由 `recipe/` 目录中对应的 `RecipeSerializer` 解析。

子目录建议按配方类型分组：
```
recipe/
├── smelting/       冶炼机配方
├── assembling/     组装机配方
├── refinery/       精炼厂配方
├── matrix/         矩阵合成配方
└── crafting/       工作台配方（原版格式）
```

命名规范：`{output_item}.json`，若同一产物有多个配方则加序号：`iron_plate_1.json`。

配方 JSON 示例（冶炼机）：
```json
{
  "type": "dysonsphereprogram:smelting",
  "input": { "item": "minecraft:iron_ore", "count": 2 },
  "output": { "item": "dysonsphereprogram:iron_plate", "count": 1 },
  "energy_cost": 360,
  "process_time": 60
}
```
