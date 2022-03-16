package eu.ensup.client_project.controller;

import eu.ensup.client_project.domaine.Student;
import eu.ensup.client_project.repository.StudentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@Log4j2
public class UserController {


    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/CreatedUser")
    public String viewCreateUserPage(Model model) {
        model.addAttribute("student", new Student());
        return "createdUser";
    }

    @GetMapping("/login")
    public String loginPage(Model model,HttpSession session,@RequestParam(value = "error", defaultValue = "false") boolean loginError) {
        session.removeAttribute("error");
        if (loginError) {
            session.setAttribute("error", "Mauvais login ou mot de passe!");
        }
            return "login";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute Student user,HttpSession session) {
        session.removeAttribute("success");
        if (!"".equals(user.getEmail()) && !"".equals(user.getLastName())  && !"".equals(user.getName())  && !"".equals(user.getAdress())&& null != user.getBithday() && !"".equals(user.getPhone()))
            if (validate(user.getEmail()))
            {
                studentRepository.save(user);
                session.setAttribute("success", "L'étudiant à été créé.");
            }
            else
                session.setAttribute("error", "L'adresse mail n'est pas sous le bon format");
        else
            session.setAttribute("error", "Tout les champs ne sont pas remplis");

        return "createdUser";
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}
