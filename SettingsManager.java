/**
 * Created by Anton on 2016-12-14.
 */


public class SettingsManager {


	try {
		if(!getDataFolder().exists()) {
			getDataFolder()mkdirs();
		}
		File file new File(getDataFolder(), "config.yml");
		
		if(!file.exists()) {
			getLogger().info("Config.yml not found, creating!");
			saveDefaultConfig();
		} else {
			getLogger().info("Config.yml found, loading!");
		}
	} catch (Exception e) {
		e.printStackTrace();
		
	}


}


