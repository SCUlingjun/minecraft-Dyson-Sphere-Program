# energy/network

能源网络拓扑管理与流量调度目录。

能源网络由导线方块连通的一组生产者/消费者/存储节点构成，每个维度（World）维护独立的网络图。

核心类：
- `EnergyNetwork.java` — 单个能源网络实例，持有所有节点列表，每刻执行产能→存储→消费的分配流程
- `EnergyNetworkManager.java` — 按维度管理所有 EnergyNetwork，处理节点加入/离开/网络合并分裂
- `EnergyNode.java` — 节点接口，由发电机/蓄电池/机器的 BlockEntity 实现
- `WireBlock.java`（引用自 `block/`）— 导线方块连通时触发网络重新拓扑

网络数据以 `SavedData` 形式持久化在服务端，确保重载后不断电。
