# research/unlock

科技解锁事件处理目录。

当玩家完成某项科技研究时，`ResearchManager` 触发对应的解锁处理器，将实际效果应用到游戏中。

解锁类型与处理类：
- `RecipeUnlockHandler.java` — 将新配方动态添加到玩家已知配方列表（`Player#awardRecipes`）
- `BlockUnlockHandler.java` — 解锁特定方块的放置权限（通过权限标志位）
- `StatUnlockHandler.java` — 解锁被动属性提升（如移速、背包格数、能量上限）
- `FeatureUnlockHandler.java` — 解锁系统级功能（如物流网络、星际传送、戴森球建造模式）

所有处理器实现 `IUnlockHandler` 接口，由 `ResearchManager` 在解锁时统一调用。
