package fr.xenocraft.chatmods.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import fr.xenocraft.chatmods.Main;

public class ChatInputListener implements Listener {

    private final Main plugin;

    public ChatInputListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onChatInput(AsyncPlayerChatEvent event) {
        event.setFormat(plugin.config.getChatFormat());
        
        if (plugin.config.areChatColorCodesAllowed())
            event.setMessage(ChatColor.translateAlternateColorCodes('&', event.getMessage()));
    }
}
