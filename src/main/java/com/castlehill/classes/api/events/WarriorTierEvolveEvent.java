package com.castlehill.classes.api.events;

import com.castlehill.classes.api.WarriorClass;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WarriorTierEvolveEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final WarriorClass warriorClass;
    private final int oldTier;
    private final int newTier;

    public WarriorTierEvolveEvent(Player player, WarriorClass warriorClass, int oldTier, int newTier) {
        this.player = player;
        this.warriorClass = warriorClass;
        this.oldTier = oldTier;
        this.newTier = newTier;
    }

    public Player getPlayer() {
        return player;
    }

    public WarriorClass getWarriorClass() {
        return warriorClass;
    }

    public int getOldTier() {
        return oldTier;
    }

    public int getNewTier() {
        return newTier;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}