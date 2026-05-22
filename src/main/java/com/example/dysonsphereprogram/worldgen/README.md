# worldgen

世界生成相关代码根目录。

负责将 mod 的矿石、地质特征和特殊结构注入到 Minecraft 的世界生成管线（NeoForge BiomeModifier 系统）。

顶层类：
- `ModWorldGenRegistration.java` — 统一注册所有矿脉配置和生物群系修改器

子目录：
- `ore/` — 矿脉/矿石特征配置（分布层级、频率、簇大小）
- `structure/` — 大型结构模板（废弃前哨站、古代发射台等）

世界生成数据（JSON 格式）存放在 `resources/data/dysonsphereprogram/` 的各子目录中，Java 代码负责逻辑触发和动态生成。
