package fr.xenocraft.chatmods.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import fr.xenocraft.chatmods.Main;

public class JoinLeaveListener implements Listener {

    private final Main plugin;

    public JoinLeaveListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        String name = event.getPlayer().getDisplayName();
        String joinMessageFormat = plugin.config.getJoinMessage();
        event.setJoinMessage(joinMessageFormat.formatted(name));
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        String name = event.getPlayer().getDisplayName();
        String joinMessageFormat = plugin.config.getLeaveMessage();
        event.setQuitMessage(joinMessageFormat.formatted(name));
    }
}
