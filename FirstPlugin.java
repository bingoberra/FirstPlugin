/**
 * Created by Berra on 2016-12-14.
 */

import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {

    //Fired when the server Enables the plugin
    @Override
    public void onEnable(){

        this.getCommand("test").setExecutor(new CommandTest());
        this.getCommand("diamonds").setExecutor(new CommandDiamonds());
        this.getCommand("elytra").setExecutor(new CommandElytra());

    }
    @Override
    //Fired when the server stops and disables all plugins
    public void onDisable(){



    }


}

