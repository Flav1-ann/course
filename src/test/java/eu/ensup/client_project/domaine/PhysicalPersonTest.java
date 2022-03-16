package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhysicalPersonTest {

    private static PhysicalPerson physicalPersonGet = new PhysicalPerson(1l,  "name",  "adress",  "email",  "phone",  "lastName");
    private static PhysicalPerson physicalPersonSet = new PhysicalPerson(2l,  "name",  "adress",  "email",  "phone",  "lastName");
    @Test
    void getLastName() {
        Assertions.assertEquals(physicalPersonGet.getLastName(),"lastName");
    }

    @Test
    void setLastName() {
        physicalPersonSet.setLastName("l");
        Assertions.assertEquals(physicalPersonSet.getLastName(),"l");

    }

    @Test
    void testToString() {
        Assertions.assertNotNull(physicalPersonGet.toString());

    }
}