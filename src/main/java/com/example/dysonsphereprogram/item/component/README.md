# item/component

中间合成组件物品目录。

这些物品通常是机器生产的中间产物，不直接使用，而是作为更高级配方的原料。

典型组件：
- `CircuitBoardItem` — 电路板（初级 / 高级 / 量子）
- `MagneticCoilItem` — 磁性线圈
- `ProcessorItem` — 处理器芯片
- `GearItem` — 齿轮（铁 / 钢 / 钛）
- `DysonSphereComponentItem` — 戴森球组件（发射入轨用）

部分组件物品包含 NBT 数据，用于记录合成参数或品质等级，此类逻辑在对应的 Item 子类中实现。
