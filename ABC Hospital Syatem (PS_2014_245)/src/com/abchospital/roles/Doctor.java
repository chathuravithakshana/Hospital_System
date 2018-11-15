package com.abchospital.roles;

public class Doctor extends Employee
{
    //Attributes of doctor
    private int docNumber;
    private String specialty;
    private double doctorFee;

    //Assign final value for the DocTaxRate
    private final static double DocTaxRate = 0.08;

    //Default empty constructor
    public Doctor()
    {

    }

    //Constructor for add doctor details with four parameters
    public Doctor(String fname, String lname, String specialIn, int docFee)
    {
        super.firstName = fname; //use "super" for get attributes from super(employee) class
        super.lastName = lname;
        this.specialty = specialIn;  //use "this" for get attributes from this class
        this.doctorFee = docFee;
    }

    //Constructor for add doctor details with one parameter
    public Doctor(String fname)
    {
        firstName = fname;
    }

    public int getDocNumber()
    {
        return docNumber;
    }

    public void setDocNumber(int docNumber)
    {
        this.docNumber = docNumber;
    }

    public String getSpecialty()
    {
        return specialty;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    public double getDoctorFee()
    {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee)
    {
        this.doctorFee = doctorFee;
    }


    //Overriding method in polymorphism (same method (with different body) in different kinds in different classes)
    public void setSalary(double payment)
    {
        if(payment > 50000)
        {
            this.salary = payment - payment*DocTaxRate;
        }
        else
            this.salary = payment;
    }
}
