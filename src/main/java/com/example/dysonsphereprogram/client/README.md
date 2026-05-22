# client

客户端专属代码根目录。

此目录下的所有类仅在客户端（物理客户端）运行，必须用 `@Mod.EventBusSubscriber(value = Dist.CLIENT)` 或在 `FMLClientSetupEvent` 中注册，**禁止在服务端加载**。

职责范围：
- 注册 GUI Screen 到对应 MenuType
- 注册自定义方块/实体渲染器
- 注册粒子效果、声音事件监听
- 处理客户端输入（快捷键绑定）

子目录：
- `gui/` — 机器 GUI 屏幕（Screen 子类）
- `render/` — 自定义方块实体渲染器（BESR）和实体渲染器
- `model/` — 自定义方块/物品模型加载器
