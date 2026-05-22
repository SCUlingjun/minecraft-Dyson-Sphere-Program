# item

所有自定义物品类（`Item` 子类）的根目录。

物品类定义物品的使用行为、耐久、工具等级、附魔兼容性等属性。物品注册入口统一在 `registry/ModItems.java` 中。

子目录：
- `component/` — 中间合成组件（电路板、齿轮、线圈等）
- `tool/` — 工具与装备（电磁步枪、护甲等）
- `resource/` — 原材料和资源物品（矿石、晶体、气体瓶等）

不需要特殊行为的简单物品（如金属板、螺丝）直接在 `registry/ModItems.java` 中用 `DeferredItem` 注册，不单独建类。
