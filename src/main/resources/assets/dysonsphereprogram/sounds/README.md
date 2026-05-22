# assets/dysonsphereprogram/sounds

音效文件目录。

存放所有 `.ogg` 格式的音频文件（Minecraft 仅支持 OGG Vorbis）。`sounds.json`（位于 `assets/dysonsphereprogram/`）将音效 ID 映射到此目录中的文件。

分类建议：
- `machine/` — 机器运行音（循环）、启动/停止音
- `ambient/` — 能源网络电流声、戴森球背景音
- `item/` — 物品使用音（步枪射击、扳手敲击）
- `ui/` — 科技解锁音效、GUI 操作反馈音

音效规格：
- 采样率：44100 Hz
- 声道：单声道（环境音可用立体声）
- 时长：循环音效建议无缝循环（首尾波形衔接）
