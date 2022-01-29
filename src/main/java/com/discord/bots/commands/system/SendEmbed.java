package com.discord.bots.commands.system;

import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

import java.awt.*;

public class SendEmbed implements CommandExecutor
{
    @Command(aliases = "sendEmbed", description = "Sends an embed to the channel.")
    public void OnSendEmbed(MessageCreateEvent message)
    {
        message.getChannel().sendMessage(CreateEmbed(message));
    }

    private EmbedBuilder CreateEmbed(MessageCreateEvent message)
    {
        return new EmbedBuilder()
                .setTitle("Hello from sdcf4j!")
                .setDescription("This embed was sent from sdcf4j!")
                .setColor(new Color(69, 198, 116))
                .setFooter(message.getMessageAuthor().getDisplayName(), message.getMessageAuthor().getAvatar());
    }
}
