package net.vasilydemin.chatgpttelegrambot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.vasilydemin.chatgpttelegrambot.constant.ChatState;

/**
 * Chat state class corresponds to the @Entity(name = "chat_config") in PostgreSQL.
 * Model for the ChatConfigsRepository interface
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chat_config")
public class ChatConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * chatId - Chat with user identifier from Telegram
     */
    private Long chatId;

    /**
     * chatState - State of chat with user: enum BotStatus
     * { DEFAULT, CONSULT_NEW_USER, CONSULT_POTENTIAL_OWNER, KEEPING_a_PET, CHAT_WITH_VOLUNTEER }
     */
    private ChatState chatState;

    private ChatState previousChatState;

    /**
     * ChatConfig class constructor for using in the AnimalShelterBotApplication
     */
    public ChatConfig(Long chatId, ChatState chatState) {
        this.id = 0L;
        this.chatId = chatId;
        this.chatState = chatState;
        this.previousChatState = ChatState.ZERO_STATE;
    }

}
