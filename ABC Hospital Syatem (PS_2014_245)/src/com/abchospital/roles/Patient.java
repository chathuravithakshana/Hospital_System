package com.abchospital.roles;

public class Patient
{
    //Attributes of patient
    private String firstName;
    private String lastName;
    private String DOB;
    private String illness;

    public Patient()
    {

    }

    public Patient(String fname, String lname, String dob, String ill)
    {
        firstName = fname;
        lastName = lname;
        DOB = dob;
        illness = ill;

    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
