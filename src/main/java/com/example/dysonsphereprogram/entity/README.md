# entity

自定义实体目录。

包含本 mod 引入的非玩家实体，主要是自动化物流和战斗单位。

典型实体：
- `LogisticsDroneEntity.java` — 物流无人机，在仓库和机器之间自动运输物品，沿路径点飞行
- `ConstructionBotEntity.java` — 建造机器人，自动放置玩家规划的蓝图方块
- `EnemyDroneEntity.java` — 敌对无人机（黑雾），周期性攻击玩家设施
- `ProjectileEntity.java` — 电磁步枪弹丸，直线飞行并触发爆炸

每个实体类包含 AI 目标（`Goal`）或自定义运动控制器，渲染器在 `client/render/` 中实现。

实体类型（`EntityType`）在 `registry/ModEntities.java` 注册。
