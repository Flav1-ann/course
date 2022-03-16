package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Student test.
 */
class StudentTest {

    private static Student studentSet = new Student(1l,  "name",  "adress",  "email",  "phone",  "lastName",  LocalDate.now());
    private static Student studentGet = new Student(2l,  "name",  "adress",  "email",  "phone",  "lastName",  LocalDate.now());

    /**
     * Gets bithday.
     */
    @Test
    void getBithday() {
        studentSet.setBithday(LocalDate.now());
        Assertions.assertEquals(studentSet.getBithday(),LocalDate.now());
    }

    /**
     * Sets bithday.
     */
    @Test
    void setBithday() {
        studentGet.setBithday(null);
        Assertions.assertEquals(studentGet.getBithday(),null);
    }

    /**
     * Test to string.
     */
    @Test
    void testToString() {
        Assertions.assertNotNull(studentGet.toString());
    }
}