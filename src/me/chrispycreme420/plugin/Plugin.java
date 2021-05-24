package me.chrispycreme420.plugin;

import me.chrispycreme420.plugin.events.MessageEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
    getServer().getPluginManager().registerEvents(new MessageEvent(), this);
    getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[Plugin]This Plugin is now enabled!");
    }

    
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[Plugin]This Plugin is now disabled");

    }
}
