package net.vasilydemin.chatgpttelegrambot.constant;

import java.util.HashMap;
import java.util.Map;

public enum UpdateType {

    MESSAGE(0L), COMMAND(1L), PHOTO(2L), CALL_BACK_QUERY(3L), ERROR(5L);

    public final Long updateType;

    private static Map<Long, UpdateType> BY_UPDATE_TYPE = new HashMap<>();

    UpdateType(Long updateType) {
        this.updateType = updateType;
    }

    static {
        for(UpdateType ut : values()){
            BY_UPDATE_TYPE.put(ut.updateType, ut);
        }
    }

    public static UpdateType valueOfUpdateType(Long updateType) {
        return BY_UPDATE_TYPE.get(updateType);
    }

}
