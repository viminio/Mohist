package org.bukkit.craftbukkit.v1_19_R1.boss;

import net.minecraft.server.bossevents.CustomBossEvent;
import org.bukkit.NamespacedKey;
import org.bukkit.boss.KeyedBossBar;
import org.bukkit.craftbukkit.v1_19_R1.util.CraftNamespacedKey;

public class CraftKeyedBossbar extends CraftBossBar implements KeyedBossBar {

    public CraftKeyedBossbar(CustomBossEvent bossBattleCustom) {
        super(bossBattleCustom);
    }

    @Override
    public NamespacedKey getKey() {
        return CraftNamespacedKey.fromMinecraft(getHandle().getTextId());
    }

    @Override
    public CustomBossEvent getHandle() {
        return (CustomBossEvent) super.getHandle();
    }
}
