/**
 * Created by Anton on 2016-12-14.
 */

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class CommandTest implements CommandExecutor{


    // This method is called whenever someone runs your command!
    public boolean onCommand(CommandSender sender, Command test, String label, String [] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            // Here we give items to player

            ItemStack diamonds = new ItemStack(Material.DIAMOND, 5);

            ItemStack bricks = new ItemStack(Material.BRICK, 20);


            player.getInventory().addItem(bricks, diamonds);

        }
        return true;
    }

}
