package eu.ensup.client_project.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;


@Log4j2
@Controller
public class HomeController {




    @GetMapping("/")
    public String viewBase(Model model) {
        log.info("viewHome");
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

//            return "home";
//        else
            return "redirect:/login";
    }
    @PostMapping("/home")
    public String viewHome(Model model) {
        log.info("viewHome");
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

            return "home";
//        else
//        return "redirect:/login";
    }
    @GetMapping("/homepage")
    public String homepage(Model model) {
        log.info("homepage");
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return "home";
//        else
//        return "redirect:/login";
    }


}
