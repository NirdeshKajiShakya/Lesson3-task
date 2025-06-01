public class Employee{
    // 4. Write a Java program to create a class called "Employee" with a name, 
    //job title, and salary attributes, and methods to calculate and update salary.
    private String name;
    private String job;
    private int salary;
    public Employee(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void updateSalary(int percentage) {
        this.salary += this.salary * percentage / 100;
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Ram Bam", "Software Developer", 60000);
        System.out.println("Name: " + emp.getName());
        System.out.println("Job: " + emp.getJob());
        System.out.println("Salary: $" + emp.getSalary());
        
        emp.updateSalary(10);
        System.out.println("Updated Salary: $" + emp.getSalary());
    }
}