package net.vasilydemin.chatgpttelegrambot.constant;

import java.util.HashMap;
import java.util.Map;

public enum Buttons {

    // Main menu "Chose shelter"
    DOG_SHELTER("Приют для собак", "DogShelter", ButtonType.CALLBACK, null),
    CAT_SHELTER("Приют для кошек", "CatShelter", ButtonType.CALLBACK, null),

    // Default root menu
    SHELTER_INFO("Информация о приюте", "ShelterInfo", ButtonType.CALLBACK, null),
    ANIMAL_INFO("Как взять животное", "AnimalInfo", ButtonType.CALLBACK, null),
    DAILY_REPORT("Отправить отчет о питомце", "DailyReport", ButtonType.CALLBACK, null),

    // Service buttons
    HELP("Справка - как работать с ботом", "help", ButtonType.CALLBACK, null);


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
