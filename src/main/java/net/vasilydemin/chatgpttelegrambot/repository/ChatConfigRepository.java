package net.vasilydemin.chatgpttelegrambot.repository;

import net.vasilydemin.chatgpttelegrambot.entity.ChatConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * ChatConfigRepository is the interface to storage for Telegram bot chat statuses.
 * Corresponds to the chat_config table in PostgreSQL. Extends {@link JpaRepository}
 * @see ChatConfig ChatConfig
 */
@Repository
public interface ChatConfigRepository extends JpaRepository<ChatConfig, Long> {

    Optional<ChatConfig> findByChatId(Long chatId);

}
