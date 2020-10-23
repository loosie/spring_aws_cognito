package project.bluelogin.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping
    public String getIndexPage(Model model, Authentication authentication) {
//        if (authentication != null && authentication.isAuthenticated()) {
//            if (authentication
//                    .getAuthorities()
//                    .stream()
//                    .anyMatch(a -> a.getAuthority().equals("ADMIN"))) {
//                model.addAttribute("secretMessage", "Lorem ipsum dolor sit amet");
//            }
//        }

        model.addAttribute("message", "AWS Cognito with Spring Security");

        return "home";

    }

}
