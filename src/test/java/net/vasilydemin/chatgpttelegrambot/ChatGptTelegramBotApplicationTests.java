package net.vasilydemin.chatgpttelegrambot;

import com.pengrad.telegrambot.TelegramBot;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ChatGptTelegramBotApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TelegramBot telegramBot;
    @Test
    void contextLoads() {
        Assertions.assertThat(telegramBot).isNotNull();
    }

}
