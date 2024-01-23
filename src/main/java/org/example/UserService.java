package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(int id, int credit_card_number, String email, String password) {
        User user = new User(id,credit_card_number,email, password);
        return userRepository.save(user);
    }

    public User findUser(String email, String password) {
        List<User> userList = userRepository.findAll();
        for(int i = 0; i < userList.size(); i++) {
            if(userList.get(i).getEmail().equals(email) && userList.get(i).getPassword().equals(password)) {
                return userList.get(i);
            }
        }
        return null;
    }
}
