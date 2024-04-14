import org.example.Pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PetTest {

    @Test
    void testGettersAndSetters() {
        // Create a Pet object
        Pet pet = new Pet("Fluffy", 5, "Dog");

        // Test getters
        assertEquals("Fluffy", pet.getName());
        assertEquals(5, pet.getAge());
        assertEquals("Dog", pet.getSpecies());

        // Test setters
        pet.setName("Max");
        assertEquals("Max", pet.getName());

        pet.setAge(6);
        assertEquals(6, pet.getAge());
    }

    // Add more test methods for other functionalities as needed
}
