import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Bukkit.getLogger;

/**
 * Created by Anton on 2016-12-14.
 */
public class CommandElytra implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command elytra, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            sender.sendMessage("Du fick en elytra :)");
            ItemStack elytraItem = new ItemStack(Material.ELYTRA, 1);

            player.getInventory().addItem(elytraItem);


        } else getLogger().info("This command cannot be run from the console!");

        return true;
    }
}
