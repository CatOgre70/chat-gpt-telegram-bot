package net.vasilydemin.chatgpttelegrambot.constant;

/**
 * this class contains a list of responses to correct and incorrect user requests
 */
public enum Messages {

    THERE_IS_NO_SUCH_COMMAND("Команда не распознана"),
    WELCOME_TO_THE_CHATBOT("Добро пожаловать в наш самый распрекрасный чат-бот..."),

    NO_RESPONSE("Прошу прощения, но ответа от ChatGPT нет!"),

    WELL_ONE_MORE_TIME("Хорошо, давайте еще раз начнем все с чистого листа!"),

    HELP("""
            Используйте, пожалуйста, следующие команды:
            /menu - для вызова контекстного меню,
            /up - для того, чтобы перейти к предыдущему меню
            /help - для того, чтобы вывести список доступных команд
            /callvolunteers - для того, чтобы связаться с нашими волонтерами
            /tobevolunteer - если вы хотите стать нашим волонтером
            А еще можно просто выбирать соответствующие пункты контекстного меню"""),
    CONTEXT_MENU("""
            Выберите, пожалуйста, действие или введите команду.
            /help - для списка команд
            /menu - для повторного вывода меню""");

    public final String messageText;

    Messages(String str) {
        this.messageText = str;
    }

}
