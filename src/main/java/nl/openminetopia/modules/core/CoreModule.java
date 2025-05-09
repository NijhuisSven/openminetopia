package nl.openminetopia.modules.core;

import com.jazzkuh.modulemanager.spigot.SpigotModule;
import com.jazzkuh.modulemanager.spigot.SpigotModuleManager;
import nl.openminetopia.OpenMinetopia;
import nl.openminetopia.modules.core.commands.OpenMinetopiaCommand;
import org.jetbrains.annotations.NotNull;

public class CoreModule extends SpigotModule<@NotNull OpenMinetopia> {
    public CoreModule(SpigotModuleManager<@NotNull OpenMinetopia> moduleManager) {
        super(moduleManager);
    }

    @Override
    public void onEnable() {
        registerComponent(new OpenMinetopiaCommand());
    }
}
