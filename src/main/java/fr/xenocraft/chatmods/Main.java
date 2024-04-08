package fr.xenocraft.chatmods;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.xenocraft.chatmods.listeners.ChatInputListener;
import fr.xenocraft.chatmods.listeners.JoinLeaveListener;

public final class Main extends JavaPlugin {

    public YmlConfig config;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        this.config = new YmlConfig(this);

        Bukkit.getPluginManager().registerEvents(new JoinLeaveListener(this), this);
        Bukkit.getPluginManager().registerEvents(new ChatInputListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
