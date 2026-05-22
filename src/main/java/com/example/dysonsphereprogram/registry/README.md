# registry

注册表持有者目录。

集中管理所有 mod 对象的 `DeferredRegister` 和 `DeferredHolder`，是各系统查找已注册对象的唯一入口。

文件列表：
- `ModBlocks.java` — 所有方块的 `DeferredBlock` 注册
- `ModItems.java` — 所有物品的 `DeferredItem` 注册（含方块物品）
- `ModBlockEntityTypes.java` — 所有 BlockEntityType 注册
- `ModMenuTypes.java` — 所有 MenuType 注册
- `ModRecipeTypes.java` — 所有自定义 RecipeType 和 RecipeSerializer 注册
- `ModFluids.java` — 所有 FluidType 和 Fluid 注册
- `ModEntities.java` — 所有 EntityType 注册
- `ModSounds.java` — 所有 SoundEvent 注册
- `ModCreativeTabs.java` — 创造模式标签页注册
- `ModDataComponents.java` — 物品 DataComponent 类型注册（NeoForge 1.21+）

各注册类在主 mod 类 `DysonSphereProgram.java` 的构造函数中调用 `.register(modEventBus)` 激活。
