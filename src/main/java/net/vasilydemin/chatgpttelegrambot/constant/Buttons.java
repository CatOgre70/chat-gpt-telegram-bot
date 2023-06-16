package net.vasilydemin.chatgpttelegrambot.constant;

import java.util.HashMap;
import java.util.Map;

public enum Buttons {

    // Default root menu
    HELP("Справка - как работать с ботом", "help", ButtonType.CALLBACK, null),
    SAFETY("Информация о ваших данных", "safety", ButtonType.CALLBACK, null),
    SUPPORT("Поговорить с поддержкой", "support", ButtonType.CALLBACK, null);

    public final String bText, bCallBack, url;
    public final ButtonType bType;

    Buttons(String bText, String bCallBack, ButtonType bType, String url) {
        this.bText = bText;
        this.bCallBack = bCallBack;
        this.bType = bType;
        this.url = url;
    }

    private static final Map<String, Buttons> BUTTON_BY_CALLBACK = new HashMap<>();

    static {
        for (Buttons b: values()) {
            BUTTON_BY_CALLBACK.put(b.bCallBack, b);
        }
    }

    public static Buttons getButtonByCallback(String bCallBack) {
        return BUTTON_BY_CALLBACK.get(bCallBack);
    }


}
