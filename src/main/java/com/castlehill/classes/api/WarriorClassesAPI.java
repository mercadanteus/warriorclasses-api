package com.castlehill.classes.api;

import org.bukkit.entity.Player;
import java.util.UUID;

public class WarriorClassesAPI {

    private static Provider provider;

    public interface Provider {
        IWarriorProfile getProfile(UUID uuid);
    }

    public static void registerProvider(Provider newProvider) {
        provider = newProvider;
    }

    public static IWarriorProfile getProfile(Player player) {
        if (player == null) return null;
        return getProfile(player.getUniqueId());
    }

    public static IWarriorProfile getProfile(UUID uuid) {
        if (provider == null) {
            throw new IllegalStateException("WarriorClassesAPI provider is not registered yet.");
        }
        return provider.getProfile(uuid);
    }

    public static boolean isRegistered() {
        return provider != null;
    }
}