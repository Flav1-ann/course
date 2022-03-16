package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Teacher test.
 */
class TeacherTest {
    private static Teacher teacher = new Teacher(1l,  "name",  "adress",  "email",  "phone",  "lastName");

    /**
     * Test to string.
     */
    @Test
    void testToString() {
        Assertions.assertNotNull(teacher.toString());
    }
}