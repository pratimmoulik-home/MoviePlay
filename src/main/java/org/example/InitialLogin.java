package org.example;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InitialLogin {
    @RequestMapping(method = RequestMethod.GET, value="/")
    public String index() {
        return "index";
    }
}
