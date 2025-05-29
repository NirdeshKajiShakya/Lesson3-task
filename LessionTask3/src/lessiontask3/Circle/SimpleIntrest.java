/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessiontask3.Circle;

/**
 *
 * @author zenusha
 */
public class SimpleIntrest{
    // 2. Write a Java program to create a class called “Simple Interest” with a 
    // data fields principle, time and rate, using setter getter method and print 
    // the values.
    private int radius;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public double calculateArea(){
 
       return (22 / 7) * radius * radius;
    }
    public double calculateCircumference(){
        return 2 * (22 / 7) * radius;
    }
    
}
