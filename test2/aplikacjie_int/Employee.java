public class Employee {


   private String name;

   private String surName;
   private int phoneNumber;
   private double salary;
}

public Employee () {}

public Employee (String name, String surName) {
    this.name = name;
    this.surName = surName;
}


public Employee(String name, String surName, int phoneNumber, double salary) {
    this.name = name;
    this.surName = surName;
    this.phoneNumber = phoneNumber;
    this.salary = salary;




public void raiseSalary(double precent){
    double raise = this.salary = (precent/100);
    this.salary = this.salary + raise;


    }


public void  wpiszDane () {
    System.out.println("pracownik"+ this.name + " " + this.surName );
}