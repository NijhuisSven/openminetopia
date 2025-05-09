package nl.openminetopia.modules.staff.mod.commands.subcommands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import nl.openminetopia.api.player.PlayerManager;
import nl.openminetopia.api.player.objects.MinetopiaPlayer;
import nl.openminetopia.utils.ChatUtils;
import org.bukkit.entity.Player;

@CommandAlias("mod")
public class ModChatSpyCommand extends BaseCommand {

    @Subcommand("chatspy")
    @CommandPermission("openminetopia.mod.chatspy")
    @Description("Enables or disables ChatSpy")
    public void chatSpy(Player player) {
        MinetopiaPlayer minetopiaPlayer = PlayerManager.getInstance().getOnlineMinetopiaPlayer(player);
        if (minetopiaPlayer == null) return;

        minetopiaPlayer.setChatSpyEnabled(!minetopiaPlayer.isChatSpyEnabled());
        player.sendMessage(ChatUtils.color("<gold>Je hebt <yellow>ChatSpy <gold>" + (minetopiaPlayer.isChatSpyEnabled() ? "aangezet" : "uitgezet") + "!"));
    }
}
