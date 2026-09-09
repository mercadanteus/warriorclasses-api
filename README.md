# WarriorClasses API

Public API and custom events for the **WarriorClasses** RPG Bukkit/Paper plugin.

This library allows third-party plugin developers to access player warrior profiles, listen to progression events, and integrate class mechanics without requiring access to the core engine.

---

## 📦 Integration via Maven (JitPack)

### 1. Add Repository
Add the JitPack repository to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>[https://jitpack.io](https://jitpack.io)</url>
    </repository>
</repositories>
```

### 2. Add Dependency
Add `warriorclasses-api` as a dependency:

```xml
<dependency>
    <groupId>com.github.mercadanteus</groupId>
    <artifactId>warriorclasses-api</artifactId>
    <version>v1.0.0</version>
    <scope>provided</scope>
</dependency>
```

---

## 🛠️ Usage Examples

### Fetching a Player Profile
```java
import com.castlehill.classes.api.WarriorClassesAPI;
import com.castlehill.classes.api.IWarriorProfile;

IWarriorProfile profile = WarriorClassesAPI.getProfile(player);

if (profile != null) {
    String className = profile.getCurrentClass().getDefaultName();
    int tier = profile.getTier();
    int grade = profile.getGrade();
    int kills = profile.getEliteMobKills();
}
```

### Listening to Custom Events
```java
import com.castlehill.classes.api.events.WarriorThreatGainEvent;
import com.castlehill.classes.api.events.WarriorClassChangeEvent;
import com.castlehill.classes.api.events.WarriorTierEvolveEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MyEventListener implements Listener {

    @EventHandler
    public void onThreatGain(WarriorThreatGainEvent event) {
        Player player = event.getPlayer();
        int gained = event.getAmountGained();
        int total = event.getNewTotal();
    }

    @EventHandler
    public void onClassChange(WarriorClassChangeEvent event) {
        Player player = event.getPlayer();
        WarriorClass newClass = event.getNewClass();
    }

    @EventHandler
    public void onTierEvolve(WarriorTierEvolveEvent event) {
        Player player = event.getPlayer();
        int newTier = event.getNewTier();
    }
}
```

---

## 📜 License

Distributed under the **MIT License**.

```