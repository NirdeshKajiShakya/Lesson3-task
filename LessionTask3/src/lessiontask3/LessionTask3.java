/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lessiontask3;

import java.util.Scanner;
import lessiontask3.Dog.Dog;

/**
 *
 * @author zenusha
 */
public class LessionTask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<2; i++){
            System.out.println("Enter name of dog here: ");
            String nameDog = sc.next();
            System.out.println("Enter the breed of the dog: ");
            String breedDog = sc.next();
            Dog dog= new Dog(nameDog,breedDog);
            System.out.println("\nThe name of the dog is "+dog.getName()+" and the breed is "+dog.getBreed());
        }
    }
    
}
