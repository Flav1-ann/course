package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Person test.
 */
class PersonTest {

    private static Person personGet =  new Person(1l,"name","adress","email","025874");
    private static Person personSet =  new Person(2l,"name","adress","email","025874");

    /**
     * Gets id.
     */
    @Test
    void getId() {
        Assertions.assertEquals(personGet.getId(),1l);
    }

    /**
     * Gets name.
     */
    @Test
    void getName() {
        Assertions.assertEquals(personGet.getName(),"name");

    }

    /**
     * Gets adress.
     */
    @Test
    void getAdress() {
        Assertions.assertEquals(personGet.getAdress(),"adress");

    }

    /**
     * Gets email.
     */
    @Test
    void getEmail() {
        Assertions.assertEquals(personGet.getEmail(),"email");

    }

    /**
     * Gets phone.
     */
    @Test
    void getPhone() {
        Assertions.assertEquals(personGet.getPhone(),"025874");

    }

    /**
     * Sets id.
     */
    @Test
    void setId() {
        personSet.setId(3l);
        Assertions.assertEquals(personSet.getId(),3l);

    }

    /**
     * Sets name.
     */
    @Test
    void setName() {
        personSet.setName("test");

        Assertions.assertEquals(personSet.getName(),"test");

    }

    /**
     * Sets adress.
     */
    @Test
    void setAdress() {
        personSet.setAdress("a");

        Assertions.assertEquals(personSet.getAdress(),"a");

    }

    /**
     * Sets email.
     */
    @Test
    void setEmail() {
        personSet.setEmail("é");

        Assertions.assertEquals(personSet.getEmail(),"é");

    }

    /**
     * Sets phone.
     */
    @Test
    void setPhone() {
        personSet.setPhone("02");

        Assertions.assertEquals(personSet.getPhone(),"02");

    }

    /**
     * Test to string.
     */
    @Test
    void testToString() {
        Assertions.assertNotNull(personGet.toString());

    }
}