package net.pgfmc.modtools.tools;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


/**
 * Forcefully force a player to execute a command or message
 * @author bk
 *
 */
public class Sudo implements CommandExecutor {
	
	/**
	 * Must include a valid player and message or /command, (include the slash for commands)
	 */
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (args.length != 2) { return false; }
		
		if (Bukkit.getPlayer(args[0]) == null)
		{
			sender.sendMessage("�cCould not find player �6�n" + args[0] + "�r�c.");
			return true;
		}
		
		Player target = Bukkit.getPlayer(args[0]);
		String msg = args[1];
		
		target.chat(msg);
		sender.sendMessage("�aCommand successfully ran!");
		
		return true;
	}
	
	

}
