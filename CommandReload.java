import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.BlockCommandSender;

import static org.bukkit.Bukkit.getLogger;

public class CommandReload implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof BlockCommandSender)) {
			
			reloadConfig();
			
			if (sender instanceof player) sender.sendMessage("Config reloaded!")

			getLogger().info("Config reloaded!")

        } else getLogger().info("This command cannot be run in a command block!");

        return true;
    }
}
