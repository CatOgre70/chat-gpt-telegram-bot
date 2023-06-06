package net.vasilydemin.chatgpttelegrambot.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Listing the stages of the user's path
 * It is planned to transfer depending on chatState in the @Entity(name = "chat_config") in PostgreSQL.
 */
public enum ChatState {

    NEW_USER(0L),
    EXISTING_USER(1L),
    ZERO_STATE(2L);
    public final Long status;

    private static final Map<Long, ChatState> BY_STATUS = new HashMap<>();

    static {
        for(ChatState bs : values()) {
            BY_STATUS.put(bs.status, bs);
        }
    }
    ChatState(Long status) {
        this.status = status;
    }

    public static ChatState valueOfStatus(Long status) {
        return BY_STATUS.get(status);
    }

}
