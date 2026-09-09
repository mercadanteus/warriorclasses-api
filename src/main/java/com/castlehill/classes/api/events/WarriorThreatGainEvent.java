package com.castlehill.classes.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WarriorThreatGainEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final int amountGained;
    private final int newTotal;

    public WarriorThreatGainEvent(Player player, int amountGained, int newTotal) {
        this.player = player;
        this.amountGained = amountGained;
        this.newTotal = newTotal;
    }

    public Player getPlayer() {
        return player;
    }

    public int getAmountGained() {
        return amountGained;
    }

    public int getNewTotal() {
        return newTotal;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}