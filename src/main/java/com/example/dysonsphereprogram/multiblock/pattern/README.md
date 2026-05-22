# multiblock/pattern

多方块结构模板定义目录。

每种大型设备对应一个模板类，描述该结构在三维空间中每个位置应放置什么方块。

核心类：
- `MultiblockPattern.java` — 模板数据类，持有三维字符层数组和字符→方块标签的映射表
- `PatternBuilder.java` — 流式 API，用于在代码中以可读方式逐层定义结构形状
- `BlockMatcher.java` — 接口，定义"某位置的方块是否满足要求"（支持精确匹配、标签匹配、任意方块）

示例（3层×3×3 的冶炼炉结构）：
```java
MultiblockPattern.builder()
  .layer("CCC", "CCC", "CCC")  // 顶层：控制器 + 外壳
  .layer("C C", "   ", "C C")  // 中层：空腔
  .layer("CCC", "CCC", "CCC")  // 底层：外壳
  .where('C', BlockMatcher.tag(ModTags.SMELTER_CASING))
  .build();
```

各设备模板实例作为静态常量定义在对应的控制器类中。
