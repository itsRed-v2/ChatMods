package fr.xenocraft.chatmods;

public class YmlConfig {

    private final Main plugin;

    public YmlConfig(Main plugin) {
        this.plugin = plugin;
    }

    public String getJoinMessage() {
        return plugin.getConfig().getString("join_msg");
    }

    public String getLeaveMessage() {
        return plugin.getConfig().getString("leave_msg");
    }

    public String getChatFormat() {
        return plugin.getConfig().getString("chat_format");
    }

    public boolean areChatColorCodesAllowed() {
        return plugin.getConfig().getBoolean("allow_chat_color_codes");
    }
}
