package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Sort.Direction;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Director test.
 */
class DirectorTest {
    private static Director director =  new Director();

    /**
     * Test to string.
     */
    @Test
    void testToString() {
        Assertions.assertNotNull(director.toString());
    }
}