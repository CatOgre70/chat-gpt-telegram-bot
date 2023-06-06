package net.vasilydemin.chatgpttelegrambot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    /**
     * userId - User identifier, primary key of the users table in PostgreSQL
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * User first name
     */
    private String firstName;

    /**
     * User second name
     */
    private String secondName;

    /**
     * User nickname
     */
    private String nickName;

    /**
     * User chatId from Telegram
     */
    private Long chatId;

    /**
     * ChatConfig class constructor for using in the AnimalShelterBotApplication
     */
    public User(String firstName, String lastName, String nickName, Long chatId) {
        this.id = 0L;
        this.firstName = firstName;
        this.secondName = lastName;
        this.nickName = nickName;
        this.chatId = chatId;
    }


}
