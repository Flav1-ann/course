package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Physical person test.
 */
class PhysicalPersonTest {

    private static PhysicalPerson physicalPersonGet = new PhysicalPerson(1l,  "name",  "adress",  "email",  "phone",  "lastName");
    private static PhysicalPerson physicalPersonSet = new PhysicalPerson(2l,  "name",  "adress",  "email",  "phone",  "lastName");

    /**
     * Gets last name.
     */
    @Test
    void getLastName() {
        Assertions.assertEquals(physicalPersonGet.getLastName(),"lastName");
    }

    /**
     * Sets last name.
     */
    @Test
    void setLastName() {
        physicalPersonSet.setLastName("l");
        Assertions.assertEquals(physicalPersonSet.getLastName(),"l");

    }

    /**
     * Test to string.
     */
    @Test
    void testToString() {
        Assertions.assertNotNull(physicalPersonGet.toString());

    }
}