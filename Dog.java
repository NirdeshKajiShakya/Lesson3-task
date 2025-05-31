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
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Beagle");

        System.out.println("Dog 1: Name = " + dog1.getName() + ", Breed = " + dog1.getBreed());
        System.out.println("Dog 2: Name = " + dog2.getName() + ", Breed = " + dog2.getBreed());

        // Modifying attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");
        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        System.out.println("After modification:");
        System.out.println("Dog 1: Name = " + dog1.getName() + ", Breed = " + dog1.getBreed());
        System.out.println("Dog 2: Name = " + dog2.getName() + ", Breed = " + dog2.getBreed());
    }
}
