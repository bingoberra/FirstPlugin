import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Bukkit.getLogger;
import static org.bukkit.Bukkit.getPluginCommand;

/**
 * Created by Anton on 2016-12-14.
 */
public class CommandDiamonds implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command diamonds, String label, String [] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            sender.sendMessage("Du fick en pickaxe :)");
            ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE, 1);

            player.getInventory().addItem(pickaxe);

        }  else getLogger().info("This command cannot be run from the console!");

        return true;
    }


}
