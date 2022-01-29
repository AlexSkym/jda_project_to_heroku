package com.discord.bots.commands.help;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

import java.awt.*;

public class Botinfo implements CommandExecutor
{
    @Command(aliases = "botInfo", description = "sends bot information")
    public void OnBotInfo(MessageCreateEvent message)
    {
        message.getChannel().sendMessage(CreateEmbed(message));
    }

    private EmbedBuilder CreateEmbed(MessageCreateEvent message)
    {
        return new EmbedBuilder()
                .setTitle("**Bot information:**")
                .setDescription("This bot was created by Game Glide as\na tutorial series on youtube!")
                .setColor(new Color(182, 35, 95))
                .setFooter(message.getMessageAuthor().getDisplayName(), message.getMessageAuthor().getAvatar());
    }
}
