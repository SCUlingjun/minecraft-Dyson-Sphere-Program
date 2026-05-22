# assets/dysonsphereprogram/models/block

方块模型 JSON 文件目录。

每个方块对应一个或多个 `.json` 模型文件，引用 `textures/block/` 中的贴图。模型由 `blockstates/` 目录中的 BlockState 定义文件根据方块状态（朝向、是否激活等）选择调用。

文件命名规范：
- 简单方块：`block_name.json`
- 带朝向变体：`block_name_north.json`、`block_name_active.json` 等

对于复杂机器，推荐使用 `client/model/` 中的自定义模型加载器替代纯 JSON，以减少文件数量。
