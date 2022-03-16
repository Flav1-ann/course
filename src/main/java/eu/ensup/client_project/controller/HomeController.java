package eu.ensup.client_project.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.stream.Collectors;


/**
 * The type Home controller.
 */
@Log4j2
@Controller
public class HomeController {


    /**
     * View base string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/")
    public String viewBase(Model model) {
            return "redirect:/login";
    }

    /**
     * View home string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/home")
    public String viewHome(Model model, HttpSession session) {
        session.removeAttribute("error");
        return "home";
    }

    /**
     * Homepage string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/homepage")
    public String homepage(Model model) {

        return "home";
    }


}
