package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public String login() {
        return "logins";
    }

    @PostMapping("/login")
    public String login(String username, String password) {
        if (userService.findUser(username, password) != null) {
            return "nextpage"; // Redirect to a dashboard or home page
        } else {
            return "logins";
        }
    }

}
