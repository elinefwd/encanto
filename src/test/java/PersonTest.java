

import org.example.Person;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testGettersAndSetters() {
        // Create a Person object
        Person person = new Person("Alice", "Smith", 30, "Female");

        // Test getters
        assertEquals("Alice", person.getName());
        assertEquals("Smith", person.getLastName());
        assertEquals(30, person.getAge());
        assertEquals("Female", person.getSex());

        // Test setters
        person.setName("Bob");
        assertEquals("Bob", person.getName());

        person.setAge(35);
        assertEquals(35, person.getAge());
    }

    @Test
    void testAddParents() {
        Person mother = new Person("Mary", "Jones", 50, "Female");
        Person father = new Person("John", "Smith", 55, "Male");
        Person child = new Person("Alice", "Smith", 30, "Female");

        child.addParents(mother, father);

        assertEquals(mother, child.getMother());
        assertEquals(father, child.getFather());
    }

    // Add more test methods for other functionalities as needed
}

