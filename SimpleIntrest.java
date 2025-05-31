import java.util.Scanner;

public class SimpleIntrest {
    // 2. Write a Java program to create a class called “Simple Interest” with a 
    // data fields principle, time and rate, using setter getter method and print 
    // the values.
    private double principle;
    private double time;
    private double rate;
    public void setPrinciple(double principle) {
        this.principle = principle;
    }
    public double getPrinciple() {
        return principle;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public double getTime() {
        return time;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getRate() {
        return rate;
    }
    public double calculateSimpleInterest() {
        return (principle * rate * time) / 100;
    }
    public static void main(String[] args) {
        SimpleIntrest si = new SimpleIntrest();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double principle = sc.nextDouble();
        si.setPrinciple(principle);
        System.out.print("Enter the time (in years): ");
        double time = sc.nextDouble();
        si.setTime(time);
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        si.setRate(rate);
        sc.close();
        System.out.println("Simple Interest: " + si.calculateSimpleInterest());
    }
}
