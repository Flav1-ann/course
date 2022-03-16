package eu.ensup.client_project.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private UserController userController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void viewCreateUserPage() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().is(302));

    }

    @Test
    void loginPage() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().is(302));

    }

    @Test
    void saveUser() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().is(302));

    }
}