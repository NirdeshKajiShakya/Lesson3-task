/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lessiontask3;

import java.util.Scanner;
import lessiontask3.Circle.SimpleIntrest;

/**
 *
 * @author zenusha
 */
public class LessionTask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleIntrest circle = new SimpleIntrest();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        circle.setRadius(radius);
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        sc.close();
    }
    
}
