# api

公共 API 目录，供附加 mod（Addon）调用。

此目录中的接口和类构成本 mod 的稳定外部 API，遵循语义化版本控制——此目录之外的类属于内部实现，可随时变更。

内容：
- `IDSPEnergyStorage.java` — 能源存储接口（扩展自 NeoForge `IEnergyStorage`，添加本 mod 特有方法）
- `IResearchProvider.java` — 查询玩家科技解锁状态的接口
- `ILogisticsNetwork.java` — 物流网络接入接口（注册物流节点、请求物品运输）
- `DSPCapabilities.java` — 本 mod 所有 capability 的 token 常量（供外部 mod 查询）
- `DSPRecipeTypes.java` — 本 mod 配方类型的只读引用（供 JEI/REI 插件使用）

外部 mod 应通过 `ModList.get().isLoaded("dysonsphereprogram")` 检查本 mod 存在后再调用 API。
