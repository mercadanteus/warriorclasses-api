package com.castlehill.classes.api;

import java.util.UUID;

public interface IWarriorProfile {
    UUID getPlayerUUID();
    WarriorClass getCurrentClass();
    int getTier();
    int getGrade();
    int getXp();
    int getEliteMobKills();
    int getDungeonsCompleted();
    boolean hasBossTrophy();
}