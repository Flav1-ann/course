package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private static Person personGet =  new Person(1l,"name","adress","email","025874");
    private static Person personSet =  new Person(2l,"name","adress","email","025874");

    @Test
    void getId() {
        Assertions.assertEquals(personGet.getId(),1l);
    }

    @Test
    void getName() {
        Assertions.assertEquals(personGet.getName(),"name");

    }

    @Test
    void getAdress() {
        Assertions.assertEquals(personGet.getAdress(),"adress");

    }

    @Test
    void getEmail() {
        Assertions.assertEquals(personGet.getEmail(),"email");

    }

    @Test
    void getPhone() {
        Assertions.assertEquals(personGet.getPhone(),"025874");

    }

    @Test
    void setId() {
        personSet.setId(3l);
        Assertions.assertEquals(personSet.getId(),3l);

    }

    @Test
    void setName() {
        personSet.setName("test");

        Assertions.assertEquals(personSet.getName(),"test");

    }

    @Test
    void setAdress() {
        personSet.setAdress("a");

        Assertions.assertEquals(personSet.getAdress(),"a");

    }

    @Test
    void setEmail() {
        personSet.setEmail("é");

        Assertions.assertEquals(personSet.getEmail(),"é");

    }

    @Test
    void setPhone() {
        personSet.setPhone("02");

        Assertions.assertEquals(personSet.getPhone(),"02");

    }

    @Test
    void testToString() {
        Assertions.assertNotNull(personGet.toString());

    }
}