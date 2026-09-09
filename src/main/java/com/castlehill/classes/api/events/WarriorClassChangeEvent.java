package com.castlehill.classes.api.events;

import com.castlehill.classes.api.WarriorClass;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WarriorClassChangeEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final WarriorClass oldClass;
    private final WarriorClass newClass;

    public WarriorClassChangeEvent(Player player, WarriorClass oldClass, WarriorClass newClass) {
        this.player = player;
        this.oldClass = oldClass;
        this.newClass = newClass;
    }

    public Player getPlayer() {
        return player;
    }

    public WarriorClass getOldClass() {
        return oldClass;
    }

    public WarriorClass getNewClass() {
        return newClass;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}