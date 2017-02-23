package me.themajesticmagician.bot;
 
import javax.security.auth.login.LoginException;
 
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
 
public class Bot {
 
    public static JDA jda;
 
    public static final String BOT_TOKEN = "Mjc5Njc3NTk4MTUyNTIzNzc3.C4-0zg.AhHXdM__AEKjdHxCvkrg5h3D6OE";
 
    public static void main(String[] args) {
 
        try {
            jda = new JDABuilder(AccountType.BOT).addListener(new BotListener()).setToken(BOT_TOKEN).buildBlocking();
            jda = new JDABuilder(AccountType.CLIENT).addListener(new Client)
        } catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
            e.printStackTrace();
        }
    }
 
}