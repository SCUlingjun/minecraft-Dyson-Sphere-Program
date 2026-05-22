# research/tree

科技树节点定义目录。

每个科技项对应一个 `ResearchNode` 实例（数据驱动，可由 JSON 加载，也可硬编码）。

`ResearchNode` 包含：
- `id` — 唯一标识符（如 `"electromagnetic_matrix"`）
- `prerequisites` — 前置科技 ID 列表
- `cost` — 所需矩阵及数量（如 `[{type: INFO, amount: 1000}]`）
- `unlocks` — 解锁内容列表（配方 ID、方块 ID、能力标志）
- `position` — 在 GUI 科技树面板中的坐标（用于渲染）

核心类：
- `ResearchNode.java` — 单个科技节点数据类
- `ResearchTree.java` — 全局科技树图，负责校验前置依赖、计算可解锁状态
- `ResearchTreeLoader.java` — 从 `data/dysonsphereprogram/research/` 目录加载 JSON 数据文件
