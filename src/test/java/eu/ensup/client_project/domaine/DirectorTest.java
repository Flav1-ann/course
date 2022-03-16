package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Sort.Direction;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {
    private static Director director =  new Director();

    @Test
    void testToString() {
        Assertions.assertNotNull(director.toString());
    }
}