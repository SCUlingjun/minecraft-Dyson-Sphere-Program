# network

客户端-服务端网络通信目录。

NeoForge 1.21.1 使用 `CustomPacketPayload` + `IPayloadHandler` 模式处理双向数据包。

目录内容：
- 每个数据包对应一个 `record` 实现 `CustomPacketPayload`，包含数据字段和 `TYPE` 常量
- 对应的 Handler 类（或 `IPayloadHandler` lambda）处理接收端逻辑

典型数据包：
- `C2S_MachineActionPacket` — 客户端发送机器操作（切换模式、清空槽位）
- `C2S_ResearchSelectPacket` — 客户端选择要研究的科技
- `S2C_MachineUpdatePacket` — 服务端推送机器状态（能量、进度）到客户端
- `S2C_EnergyNetworkPacket` — 服务端推送能源网络统计数据
- `S2C_ResearchCompletePacket` — 服务端通知客户端科技完成（播放音效/粒子）

所有数据包在 `PayloadRegistrar`（`RegisterPayloadsEvent`）中注册。
