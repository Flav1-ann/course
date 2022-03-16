package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    private static Teacher teacher = new Teacher(1l,  "name",  "adress",  "email",  "phone",  "lastName");
    @Test
    void testToString() {
        Assertions.assertNotNull(teacher.toString());
    }
}