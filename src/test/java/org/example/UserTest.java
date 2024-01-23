package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserTest {


    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    void testCreateUser() {
        User createdUser = userService.createUser(13, 353, "jack@jack.com", "chw");
        User retrievedUser = userRepository.findById(13).orElse(null);

        assertEquals(createdUser.getId(), retrievedUser.getId());
        assertEquals(createdUser.getCreditCardNumber(), retrievedUser.getCreditCardNumber());
        assertEquals(createdUser.getEmail(), retrievedUser.getEmail());
        assertEquals(createdUser.getPassword(), retrievedUser.getPassword());
    }

    @Test
    void testFindUser() {
        User retrievedUser = userService.findUser("jack@jack.com","chw" );
        assertEquals(retrievedUser.getEmail(), "jack@jack.com");
        assertEquals(retrievedUser.getPassword(), "chw");
    }
}
