import java.util.Scanner;

public class Circle{
    //1. Write a Java program to create a class called "Circle" with a radius attribute. 
    // You can access this attribute using setter and getter method. 
    // Calculate the area and circumference of the circle.
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
    public static void main(String[] args) {
        Circle circle = new Circle();
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