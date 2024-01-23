package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String login() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registerUser(int id, int credit_card_number, String username, String password) {
        userService.createUser(id, credit_card_number, username, password);
        return "logins";
    }


}
