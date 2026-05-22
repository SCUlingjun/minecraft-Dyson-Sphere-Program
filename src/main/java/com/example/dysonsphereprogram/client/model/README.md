# client/model

自定义模型加载器目录（仅客户端）。

当原版 JSON 模型格式无法满足需求时（如程序化生成模型、OBJ 导入、动态模型切换），在此目录实现自定义模型加载器。

核心类：
- `DynamicMachineModelLoader.java` — 根据 BlockState（如运行状态、朝向）动态切换模型变体，避免为每个状态组合预先生成 JSON
- `ObjModelWrapper.java` — 将 `.obj` 三维模型文件转换为 BakedModel，用于精细机器模型
- `ConnectedTextureModel.java` — 实现导线方块的连接纹理（根据相邻方块自动拼接贴图）

模型加载器在 `ModelEvent.RegisterGeometryLoaders` 事件中注册。
