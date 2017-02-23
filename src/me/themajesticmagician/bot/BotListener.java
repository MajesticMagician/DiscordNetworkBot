package me.themajesticmagician.bot;
 
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
 
public class BotListener extends ListenerAdapter {
 
	String command = "/";
	
	
    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        if (e.getMessage().getRawContent().equalsIgnoreCase(command + "ping")) {
            e.getChannel().sendMessage(e.getAuthor().getAsMention() + " Command Received!").queue();
        }else if (e.getMessage().getRawContent().equalsIgnoreCase("ping")) {
            e.getChannel().sendMessage(e.getAuthor().getAsMention() + " Pong!").queue();
        }else if()
        {
        	
        }
        
    }
 
}