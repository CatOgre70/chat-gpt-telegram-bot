package net.vasilydemin.chatgpttelegrambot.constant;

/**
 * this class contains a list of responses to correct and incorrect user requests
 */
public enum Messages {

    THERE_IS_NO_SUCH_COMMAND("Telegram Bot: Команда не распознана!"),
    WELCOME_TO_THE_CHATBOT("Telegram Bot: Добро пожаловать в чат-бот, выполняющий тяжелую работу посредника в " +
            "переговорах между вами и OpenAI ChatGPT.\nМожно просто написать сообщение и оно будет передано в " +
            "ChatGPT, после чего ИскИн ответит вам. Продолжайте в том же духе, пока вам не надоест или во Вселенной " +
            "не погаснут все звезды :)\nМожно вызвать меню командой /menu\nМожно попросить Telegram бота о помощи " +
            "командой /help, а уж он подумает, помогать или нет :)"),

    NO_RESPONSE("Telegram Bot: Прошу прощения, но ответа от ChatGPT нет! Он, случайно не внес вас в черный список " +
            "за ваше поведение?"),

    WELL_ONE_MORE_TIME("Telegram Bot: Хорошо, давайте еще раз начнем все с чистого листа!"),

    OH_SOMETHING_GOT_WRONG("Telegram Bot: Ой! Что пошло не так! Вот что именно: \n"),

    YOU_NEED_TO_CALL_SUPPORT("\nНаверное надо сообщить в поддержку!"),

    HELP("""
            Используйте, пожалуйста, следующие команды:
            /menu - для вызова меню,
            /help - для того, чтобы вывести список доступных команд
            /safety - информация о том, какие ваши данные использует для работы этот бот, и как мы их храним и обрабатываем
            /support - для того, чтобы связаться с поддержкой
            А еще можно просто выбирать соответствующие пункты меню"""),
    CONTEXT_MENU("""
            Выберите, пожалуйста, действие или введите команду.
            /help - для списка команд
            /menu - для повторного вывода меню""");

    public final String messageText;

    Messages(String str) {
        this.messageText = str;
    }

}
