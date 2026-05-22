# data/dysonsphereprogram/tag/items

物品标签（Item Tag）JSON 文件目录。

将物品归类，供配方输入（支持同类物品替代）、JEI/REI 过滤、物流网络分类等系统使用。

典型标签文件：
- `ingots/iron.json` — 铁锭类物品（兼容其他 mod 的铁锭）
- `ingots/titanium.json` — 钛锭
- `circuits.json` — 所有等级的电路板（用于通配配方）
- `gears.json` — 所有材质的齿轮
- `matrix_items.json` — 六种矩阵物品（科技界面过滤用）
- `wrench.json` — 扳手类物品（控制物品使用权限）

通过将本 mod 物品追加到 NeoForge 通用标签（`neoforge:ingots/copper` 等），使本 mod 物品在其他 mod 的配方中可以互通替代。
