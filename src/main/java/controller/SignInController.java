package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

@Controller
public class SignInController {
    @Autowired
    private UserService userService;
    @RequestMapping("toSignIn")
    public String tosignIn(){
        return "signIn";
    }
    @RequestMapping("signIn")
    public String signIn(User user) {
        userService.signIn(user);
        return "redirect:login";
    }
}
