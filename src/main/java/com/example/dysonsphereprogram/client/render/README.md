# client/render

自定义渲染器目录（仅客户端）。

用于实现无法用静态模型表达的动态视觉效果。

分类：
- **方块实体渲染器（BESR）**：继承 `BlockEntityRenderer`，每帧调用，用于渲染旋转天线、能量光柱、悬浮动画等
- **实体渲染器**：继承 `EntityRenderer`，用于渲染物流无人机、运输船等自定义实体
- **粒子渲染**：自定义粒子类型的渲染逻辑

典型渲染器：
- `DysonSphereRenderer.java` — 在天空渲染戴森球外壳的半透明光环（远景 LOD）
- `EnergyBeamRenderer.java` — 渲染机器之间的能量传输光束
- `DroneRenderer.java` — 物流无人机的飞行姿态和旋翼动画

所有渲染器在 `FMLClientSetupEvent` 中通过 `BlockEntityRenderers.register` / `EntityRenderers.register` 注册。
