package eu.ensup.client_project.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private UserController userController;

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    MockHttpSession session;
    @Test
    void viewCreateUserPage() throws Exception {
        mockMvc.perform(get("/CreatedUser")).andExpect(status().isOk());

    }

    @Test
    void loginPage() throws Exception {
        mockMvc.perform(get("/login")).andExpect(status().isOk());
    }
    @Test
    void setSession() throws Exception {
        session.setAttribute("error", "value");
        assertEquals(session.getAttribute("error"),"value");
    }

    @Test
    void remouveSession(){
        session.setAttribute("rem", "value");
        session.removeAttribute("rem");
        Assertions.assertNull(session.getAttribute("rem"));
    }

    @Test
    void saveUser() throws Exception {
        mockMvc.perform(get("/save")).andExpect(status().is(405)).andExpect(status().is(405));

    }
    @Test
    void validateEmail(){
        Assertions.assertTrue(userController.validate("flavien@gmail.com"));
    }
}