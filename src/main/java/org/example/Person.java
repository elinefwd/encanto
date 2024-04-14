package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Person {
        private String name;
        private String middleName;
        private String lastName;
        private String sex;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> siblings;
        private List<Person> children;
        private List<Pet> pets;

        // Constructor with name, lastName, age, and sex
        public Person(String name, String lastName, int age, String sex) {
                this.name = name;
                this.lastName = lastName;
                this.age = age;
                this.sex = sex;
                siblings = new ArrayList<>();
                children = new ArrayList<>();
                pets = new ArrayList<>();
                // Initialize other lists or objects as needed
        }

        public void addParents(Person mother, Person father) {
                this.mother = mother;
                this.father = father;
        }

        public void addChild(Person child) {
                children.add(child);
        }

        public void addPet(Pet pet) {
                pets.add(pet);
        }

        public void addSibling(Person sibling) {
                siblings.add(sibling);
        }


        public List<Person> getGrandChildren() {
                List<Person> grandChildren = new ArrayList<>();
                for (Person child : children) {
                        grandChildren.addAll(child.getChildren());
                }
                return grandChildren;
        }

        public List<Person> getChildren() {
                return children;
        }



        // Constructor with name, middleName, lastName, age, and sex
        public Person(String name, String middleName, String lastName, int age, String sex) {
                this(name, lastName, age, sex);
                this.middleName = middleName;
                // Initialize other lists or objects as needed
        }

        // Getters, setters, and other methods can be added here

        // Getters and Setters for attributes
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getMiddleName() {
                return middleName;
        }

        public void setMiddleName(String middleName) {
                this.middleName = middleName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getSex() {
                return sex;
        }

        public void setSex(String sex) {
                this.sex = sex;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }



        public Person getMother() {
                return this.mother;
        }

        public Person getFather() {
                return this.father;
        }
}

