# fluid

自定义流体目录。

本 mod 引入多种工业流体，参与机器配方和能源生产流程。

每种流体需要注册：
- `FluidType`（NeoForge）— 流体物理属性（密度、粘度、温度）和渲染属性（颜色、纹理）
- `Fluid`（源头流体 + 流动流体）
- 对应的桶物品（`BucketItem`）

典型流体：
- `HydrogenFluid` — 氢气，燃料电池和核聚变原料
- `DeuteriumFluid` — 氘，核聚变主要燃料
- `SulfuricAcidFluid` — 硫酸，化工处理用溶剂
- `CrudeOilFluid` — 原油，精炼厂输入原料
- `RefinedOilFluid` — 精炼油，高效燃料

流体注册在 `registry/ModFluids.java`，渲染（颜色叠加）在 `client/render/FluidRenderer.java`。
