package eu.ensup.client_project.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.ensup.client_project.domaine.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The type User controller test.
 */
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private UserController userController;

    @Autowired
    private MockMvc mockMvc;
    /**
     * The Session.
     */
    @Autowired
    MockHttpSession session;

    /**
     * View create user page.
     *
     * @throws Exception the exception
     */
    @Test
    void viewCreateUserPage() throws Exception {
        mockMvc.perform(get("/CreatedUser")).andExpect(status().isOk());

    }

    /**
     * Login page.
     *
     * @throws Exception the exception
     */
    @Test
    void loginPage() throws Exception {
        mockMvc.perform(get("/login")).andExpect(status().isOk());
    }

    /**
     * Sets attribute.
     *
     * @throws Exception the exception
     */
    @Test
    void setAttribute() throws Exception {
        session.setAttribute("error", "value");
        assertEquals(session.getAttribute("error"),"value");
    }

    /**
     * Remove session.
     */
    @Test
    void removeSession(){
        session.setAttribute("rem", "value");
        session.removeAttribute("rem");
        Assertions.assertNull(session.getAttribute("rem"));
    }

    /**
     * Save user.
     *
     * @throws Exception the exception
     */
    @Test
    void saveUser() throws Exception {
        //mockMvc.perform(post("/save")).andExpect(status().isOk()).andExpect(status().isOk());
        mockMvc.perform( MockMvcRequestBuilders
                .post("/save")
                .content(asJsonString(new Student(1l,  "name",  "adress",  "email",  "phone",  "lastName",  LocalDate.now())))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200));
    }

    /**
     * Validate email.
     */
    @Test
    void validateEmail(){
        Assertions.assertTrue(userController.validate("flavien@gmail.com"));
    }

    /**
     * As json string string.
     *
     * @param obj the obj
     * @return the string
     */
    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}