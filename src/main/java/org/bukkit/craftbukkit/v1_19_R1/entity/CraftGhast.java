package org.bukkit.craftbukkit.v1_19_R1.entity;

import org.bukkit.craftbukkit.v1_19_R1.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;

public class CraftGhast extends CraftFlying implements Ghast {

    public CraftGhast(CraftServer server, net.minecraft.world.entity.monster.Ghast entity) {
        super(server, entity);
    }

    @Override
    public net.minecraft.world.entity.monster.Ghast getHandle() {
        return (net.minecraft.world.entity.monster.Ghast) entity;
    }

    @Override
    public String toString() {
        return "CraftGhast";
    }

    @Override
    public EntityType getType() {
        return EntityType.GHAST;
    }

    @Override
    public boolean isCharging() {
        return getHandle().isCharging();
    }

    @Override
    public void setCharging(boolean flag) {
        getHandle().setCharging(flag);
    }
}
