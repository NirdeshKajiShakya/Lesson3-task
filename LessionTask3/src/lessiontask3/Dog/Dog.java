/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessiontask3.Dog;

/**
 *
 * @author zenusha
 */
public class Dog {
    // 3. Write a Java program to create a class called "Dog" with a name and breed 
    // attribute. Create two instances of the "Dog" class, set their attributes using 
    // the constructor and modify the attributes using the setter methods and print the 
    // updated values.
    private String name;
    private String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
