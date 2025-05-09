package nl.openminetopia.modules.portal;

import com.jazzkuh.modulemanager.spigot.SpigotModule;
import com.jazzkuh.modulemanager.spigot.SpigotModuleManager;
import nl.openminetopia.OpenMinetopia;
import nl.openminetopia.modules.data.DataModule;
import nl.openminetopia.modules.portal.commands.LinkCommand;
import org.jetbrains.annotations.NotNull;

public class PortalModule extends SpigotModule<@NotNull OpenMinetopia> {

    public PortalModule(SpigotModuleManager<@NotNull OpenMinetopia> moduleManager, DataModule dataModule) {
        super(moduleManager);
    }

    @Override
    public void onEnable() {
        if (OpenMinetopia.getDefaultConfiguration().isPortalEnabled()) {
            registerComponent(new LinkCommand());
        }
    }



    public String getPortalUrl() {
        return OpenMinetopia.getDefaultConfiguration().getPortalUrl();
    }

    public String getPortalApiUrl() {
        return "https://" + getPortalUrl() + "/api";
    }
}
