# assets/dysonsphereprogram/blockstates

方块状态定义文件目录。

每个方块对应一个同名 `.json` 文件，将方块的 `BlockState` 属性组合映射到 `models/block/` 中的具体模型。

两种格式：
- **variants**：为每种属性组合单独指定模型（适合状态数量少的方块）
- **multipart**：用条件规则叠加多个模型部件（适合连接纹理、管道方块）

示例（机器朝向 + 激活状态）：
```json
{
  "variants": {
    "facing=north,active=true": { "model": "dysonsphereprogram:block/smelter_active" },
    "facing=north,active=false": { "model": "dysonsphereprogram:block/smelter" }
  }
}
```
