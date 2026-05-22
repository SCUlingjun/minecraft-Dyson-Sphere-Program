# recipe

自定义配方类型目录。

原版 Minecraft 配方系统只支持有序/无序合成和熔炉配方，本 mod 需要机器配方（多输入、流体输入/输出、能耗、时间）。此目录实现这些自定义配方类型。

每种配方类型需要：
1. `XxxRecipe.java` — 配方数据类，实现 `Recipe<?>` 接口
2. `XxxRecipeSerializer.java` — JSON 序列化/反序列化
3. 对应的 `RecipeType` 注册入口（在 `registry/ModRecipeTypes.java`）

典型配方类型：
- `SmeltingRecipe` — 冶炼机配方（矿石 → 金属板，消耗 X MJ，耗时 Y tick）
- `AssemblingRecipe` — 组装机配方（多种组件 → 成品）
- `RefineryRecipe` — 精炼厂配方（流体输入 → 流体/物品输出）
- `MatrixRecipe` — 矩阵合成配方（多种矩阵 → 研究点）

配方 JSON 数据文件存放在 `resources/data/dysonsphereprogram/recipe/`。
