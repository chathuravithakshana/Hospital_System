package com.abchospital.roles;

public abstract class Employee //"abstract" is use to hide the details from the system. Here Employee class is hidden.
{
    //Common attributes for Doctor, Patient, & Nurse
    protected String firstName;
    protected String lastName;
    protected String DOB;
    protected double salary;

    public Employee()
    {

    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getDOB()
    {
        return DOB;
    }

    public void setDOB(String DOB)
    {
        this.DOB = DOB;
    }


    //Overriding in polymorphism
    public void setSalary(double payment)
    {
        this.salary = payment;
    }


    /*
    //Create abstract method
    abstract void getContactDetails();*/
}
