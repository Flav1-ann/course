package eu.ensup.client_project.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The type Course test.
 */
class CourseTest {

    private static Course courseGet =  new Course(1l,12,"dev");
    private static Course courseSet=  new Course(2l,22,"Droit");

    /**
     * Gets id.
     */
    @Test
    void getId() {
        Assertions.assertEquals(courseGet.getId(),1);
    }

    /**
     * Gets hours.
     */
    @Test
    void getHours() {
        Assertions.assertEquals(courseGet.getHours(),12);
    }

    /**
     * Gets theme.
     */
    @Test
    void getTheme() {
        Assertions.assertEquals(courseGet.getTheme(),"dev");
    }

    /**
     * Sets id.
     */
    @Test
    void setId() {
        courseSet.setId(3l);
        Assertions.assertEquals(courseSet.getId(),3l);

    }

    /**
     * Sets hours.
     */
    @Test
    void setHours() {
        courseSet.setHours(12);
        Assertions.assertEquals(courseSet.getHours(),12);

    }

    /**
     * Sets theme.
     */
    @Test
    void setTheme() {
        courseSet.setTheme("dev");
        Assertions.assertEquals(courseSet.getTheme(),"dev");

    }

    /**
     * Test to string.
     */
    @Test
    void testToString() {
       Assertions.assertNotNull( courseGet.toString());

    }
}