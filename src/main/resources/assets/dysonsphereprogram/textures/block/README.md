# assets/dysonsphereprogram/textures/block

方块贴图目录。

存放所有方块的 `.png` 纹理文件，默认尺寸 16×16，高分辨率版本可使用 32×32 或 64×64（需在 `pack.mcmeta` 中声明）。

动态纹理（如发光流体、旋转风扇）使用 `.png.mcmeta` 文件定义帧序列和帧率。

命名规范：
- 多面方块：`machine_top.png`、`machine_side.png`、`machine_front_active.png`
- 连接纹理：`wire_straight.png`、`wire_corner.png`（由 `client/model/ConnectedTextureModel.java` 拼接）

发光贴图（emissive）以 `_emissive` 后缀命名，在着色器管线中叠加到基础贴图上。
