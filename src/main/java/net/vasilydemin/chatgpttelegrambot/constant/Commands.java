package net.vasilydemin.chatgpttelegrambot.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Class containing all commands available to the user, depending on the stage of the user's path
 * Used in @see TelegramBotUpdatesListener
 */
public enum Commands {

    START("/start"),
    HELP("/help"),
    MENU("/menu");

    public final String commandText;

    Commands (String s) {
        this.commandText = s;
    }

    private static Map<String, Commands> BY_TEXT = new HashMap<>();

    static {
        for(Commands c : values()) {
            BY_TEXT.put(c.commandText, c);
        }
    }

    public static Commands valueOfCommandText(String cText) {
        return BY_TEXT.get(cText);
    }

}
