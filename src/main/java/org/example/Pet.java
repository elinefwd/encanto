package org.example;
public class Pet {
    private String name;
    private int age;
    private String species;
    private Person owner;

    // Constructor with all attributes except owner
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        // Initialize other attributes as needed
    }

    // Getters, setters, and additional methods can be added here

    // Getters and Setters for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }


}
