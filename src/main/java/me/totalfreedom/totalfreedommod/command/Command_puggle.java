package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.OP, source = SourceType.BOTH)
@CommandParameters(description = "Joke command", usage = "/<command> <player>")
public class Command_smite extends FreedomCommand
{

    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Please use the correct arguments: ");
            sender.sendMessage(ChatColor.RED + "/puggle <player>");
        }

       if (!(sender instanceof Player)) {
        sender.sendMessage(ChatColor.RED + "Only players can give other players puggles!");
        return true;
    }
    
    @SuppressWarnings("deprecation")
	  Player target = Bukkit.getServer().getPlayer(args[0]);
    
    
   if (target == null) {
        sender.sendMessage(args[0] + " is not currently online.");
        return true;
    }
    
    FUtils.bcastMsg(ChatColor.RED + "" + sender.getName() + " " + ChatColor.BLUE + " has puggled " + ChatColor.RED + args[0] + " !");
    return true;
    }
       
    }
       
