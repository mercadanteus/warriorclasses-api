package com.castlehill.classes.api;

public enum WarriorClass {
    BASTION("Bastion"),
    BARBARIAN("Barbarian"),
    ASSASSIN("Assassin"),
    SORCERER("Sorcerer"),
    CLERIC("Cleric");

    private final String defaultName;

    WarriorClass(String defaultName) {
        this.defaultName = defaultName;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public static WarriorClass fromString(String text) {
        if (text == null) return null;
        for (WarriorClass wc : values()) {
            if (wc.name().equalsIgnoreCase(text) || wc.defaultName.equalsIgnoreCase(text)) {
                return wc;
            }
        }
        return null;
    }
}