package net.vasilydemin.chatgpttelegrambot.service;

import net.vasilydemin.chatgpttelegrambot.entity.User;
import net.vasilydemin.chatgpttelegrambot.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * event recording process
     */
    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    /**
     * saving the user in the database
     * the repository method is used {@link JpaRepository#save(Object)}
     * event recording process
     * param user, must not be null
     * return the user stored in the database
     */
    public User addUser(User user) {
        logger.info("Method \"UserService.addUser()\" was called");
        return userRepository.save(user);
    }

    /**
     * find for a user by ID in the database
     * the repository method is used {@link JpaRepository#findById(Object)}
     * event recording process
     * param id user, must not be null
     * return found user
     */
    public Optional<User> findUser(long id) {
        logger.info("Method \"UserService.findUser()\" was called");
        return userRepository.findById(id);
    }

    /**
     * edit user in the database
     * the repository method is used {@link JpaRepository#findById(Object)}
     * fetching data from the database and modifying it
     * @param user - user we would like to edit in the database
     * @return making changes to the database
     */
    public Optional<User> editUser(User user) {
        logger.info("Method \"UserService.editUser()\" was called");
        Optional<User> optional = userRepository.findById(user.getId());
        if(optional.isEmpty()) {
            return Optional.empty();
        }
        else {
            user.setId(optional.get().getId());
            return Optional.of(userRepository.save(user));
        }
    }
    /**
     * delete user from the database
     * the repository method is used {@link JpaRepository#deleteById(Object)}
     * event recording process
     * @param id, must not be null
     */
    public Optional<User> deleteUser(long id) {
        logger.info("Method \"UserService.deleteStudent()\" was called");
        Optional<User> optional = userRepository.findById(id);
        userRepository.deleteById(id);
        return optional;
    }

    /**
     * find for a user  in the database
     * the repository method is used {@link JpaRepository#findAll}
     * event recording process
     * @return found user
     */
    public Collection<User> getAllUser() {
        logger.info("Method \"UserService.getAllUser()\" was called");
        return userRepository.findAll();
    }

    /**
     * find for a user  in the database
     * the repository method is used {@link  JpaRepository}
     * event recording process
     * @return found NickName
     */
    public boolean checkByChatId(Long chatId) {
        logger.info("Method \"UserService.checkByChatId()\" was called");
        return userRepository.existsByChatId(chatId);
    }

    /**
     * find user by chatId in database
     * the repository method is used {@link  JpaRepository}
     * event recording process
     * return found User
     */
    public Optional<User> findByChatId(Long chatId) {
        return userRepository.findByChatId(chatId);
    }

    /**
     *
     * find user by three substrings in database
     * the repository method is used {@link  JpaRepository}
     * event recording process
     * return found User
     */
    public List<User> findByThreeSubstrings(String firstName, String secondName, String nickName) {
        logger.info("Method \"findByThreeSubstrings()\" was called");
        return userRepository.findByThreeSubstrings(firstName, secondName, nickName);
    }
}
