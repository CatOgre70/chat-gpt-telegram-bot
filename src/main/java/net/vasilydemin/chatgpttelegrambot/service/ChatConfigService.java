package net.vasilydemin.chatgpttelegrambot.service;

import net.vasilydemin.chatgpttelegrambot.entity.ChatConfig;
import net.vasilydemin.chatgpttelegrambot.repository.ChatConfigRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChatConfigService {

    private final ChatConfigRepository chatConfigRepository;
    /**
     * event recording process
     */
    private final Logger logger = LoggerFactory.getLogger(ChatConfigRepository.class);

    public ChatConfigService (ChatConfigRepository chatConfigRepository) {
        this.chatConfigRepository = chatConfigRepository;
    }
    /**
     * saving the chat in the database
     * the repository method is used {@link JpaRepository#save(Object)}
     * event recording process
     * param chatConfig, must not be null
     * return the chat stored in the database
     */
    public ChatConfig addChatConfig(ChatConfig chatConfig) {
        // logger.info("Method \"ChatConfigService.addChatConfig()\" was called");
        return chatConfigRepository.save(chatConfig);
    }
    /**
     * edit for an editChatConfig by ID in the database
     * the repository method is used {@link JpaRepository#findById(Object)}
     * event recording process
     * fetching data from the database and modifying it
     * return ChatConfig  object saved in the database
     */
    public Optional<ChatConfig> editChatConfig(ChatConfig chatConfig) {
        // logger.info("Method \"ChatConfigService.editChatConfig()\" was called");
        Optional<ChatConfig> result = chatConfigRepository.findById(chatConfig.getId());
        if(result.isEmpty()) {
            return Optional.empty();
        }
        else {
            chatConfig.setId(result.get().getId());
            return Optional.of(chatConfigRepository.save(chatConfig));
        }
    }
    /**
     * find for an dailyReport by ID in the database
     * the repository method is used
     * event recording process
     * param chatId , must not be null
     * return found chat
     */
    public Optional<ChatConfig> findByChatId(Long chatId) {
        // logger.info("Method \"ChatConfigService.findByChatId()\" was called");
        return chatConfigRepository.findByChatId(chatId);
    }


}
