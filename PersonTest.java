import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person();

    @BeforeEach
    void setUp() {
        person.setFirstName("Grace");
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        assertEquals("Grace", person.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        assertEquals("Hanssen", person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(10, person.getAge());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        assertEquals("Grace", person.getFirstName());
        person.setFirstName("Per");
        assertEquals("Per", person.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        assertEquals("Hanssen", person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        assertEquals(10, person.getAge());
        person.setAge(21);
        assertEquals(21, person.getAge());
    }

    @org.junit.jupiter.api.Test
    void isTeen() {
        assertFalse(person.isTeen());
        person.setAge(21);
        assertTrue(person.isTeen());
        person.setAge(21);
        assertFalse(person.isTeen());
    }

    @org.junit.jupiter.api.Test
    void getFullName() {
        assertEquals("Grace Hanssen", person.getFullName());
        person.setFirstName("");
        person.setLastName("");
        assertEquals("", person.getFullName());
        person.setFirstName("Grace");
        assertEquals("Grace", person.getFullName());
        person.setFirstName("");
        person.setLastName("Hanssen");
        assertEquals("Hanssen", person.getFullName());

    }

}