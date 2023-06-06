package net.vasilydemin.chatgpttelegrambot.constant;

/**
 * this class contains a list of responses to correct and incorrect user requests
 */
public enum Messages {

    THERE_IS_NO_SUCH_COMMAND("Команда не распознана"),
    WELCOME_TO_THE_CHATBOT("Добро пожаловать в наш самый распрекрасный чат-бот..."),

    NO_RESPONSE("Прошу прощения, но ответа от ChatGPT нет!"),

    WELL_ONE_MORE_TIME("Хорошо, давайте еще раз начнем все с чистого листа!"),

    HELP("Используйте, пожалуйста, следующие команды:\n" +
            "/menu - для вызова контекстного меню,\n" +
            "/up - для того, чтобы перейти к предыдущему меню\n" +
            "/help - для того, чтобы вывести список доступных команд\n" +
            "/callvolunteers - для того, чтобы связаться с нашими волонтерами\n" +
            "/tobevolunteer - если вы хотите стать нашим волонтером\n" +
            "А еще можно просто выбирать соответствующие пункты контекстного меню"),
    CONTEXT_MENU("Выберите, пожалуйста, действие или введите команду.\n" +
            "/help - для списка команд\n/menu - для повторного вывода меню");

    public final String messageText;

    Messages(String str) {
        this.messageText = str;
    }

}
