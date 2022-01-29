package com.discord.bots.commands.system;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

public class Ping implements CommandExecutor
{
    @Command(aliases = "ping", description = "Displays a pong message.")
    public String OnPingCommand()
    {
        return "pong!";
    }
}
