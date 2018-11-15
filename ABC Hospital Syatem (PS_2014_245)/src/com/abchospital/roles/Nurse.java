package com.abchospital.roles;

public class Nurse extends Employee
{

    private double workingHours;
    private int sectionNo;


    //Assign final value for the NurseTaxRate
    private final static double NurseTaxRate = 0.05;

    //Default empty constructor
    public Nurse()
    {

    }

    //Constructor for add nurse details with four parameters
    public Nurse(String fname, String lname, double workHours, int secNo)
    {
        firstName = fname;
        lastName = lname;
        workingHours = workHours;
        sectionNo = secNo;

    }


    //Overriding method in polymorphism (same method (with different body) in different kinds in different classes)
    public void setSalary(double payment)
    {
        if(payment > 50000)
        {
            this.salary = payment - payment*NurseTaxRate;
        }
        else
            this.salary = payment;
    }
}
