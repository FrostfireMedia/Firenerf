package io.frostfire.firetweaks;

import io.frostfire.firetweaks.listeners.FireworkDamageListener;
import io.frostfire.firetweaks.metrics.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class FiretweaksPlugin extends JavaPlugin {
    public static FiretweaksPlugin plugin;

    public FiretweaksPlugin() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this);

        getServer().getPluginManager().registerEvents(new FireworkDamageListener(), this);
    }

    @Override
    public void onDisable() {

    }
}
