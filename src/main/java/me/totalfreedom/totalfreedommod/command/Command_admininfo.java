package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.NON_OP, source = SourceType.BOTH)
@CommandParameters(description = "Shows how to apply for admin", usage = "/<command>", aliases = "ai")
public class Command_admininfo extends FreedomCommand
{

    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.BLUE + "Hello, " + sender.getName());
        sender.sendMessage(ChatColor.RED + "Looking to apply for admin?! Well, this is how!");
        sender.sendMessage(ChatColor.GOLD + "Head on over to pugfreedomrevamp.boards.net");
        sender.sendMessage(ChatColor.YELLOW + "Make an account, and apply " + ChatColor.BOLD + "using the template");
        sender.sendMessage(ChatColor.BLUE + "which is in the Admin Applications board. Thanks for reading!");
        return true;
    }
}