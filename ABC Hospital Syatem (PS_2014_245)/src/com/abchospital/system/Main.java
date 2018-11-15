package com.abchospital.system;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.abchospital.roles.Employee;
import com.abchospital.roles.Doctor;
import com.abchospital.roles.Patient;


public class Main
{
    //Attributes of main
    private double registerFee;
    private static int appointmentNo = 1;
    /*private static int i;*/


    public void setRegisterFee(double registerFee)
    {
        this.registerFee = registerFee;
    }

    public double getRegisterFee()
    {
        return registerFee;
    }



    //Main method with create appointment
    public static void main(String args[])
    {
        boolean stop = false;
        while(!stop)
        {
            Scanner insert = new Scanner(System.in);
            System.out.print("Is there patient to register (Y/N)? ");
            String answer = insert.next();
            if(answer.equalsIgnoreCase("Y"))
            {
                Patient patient1 = new Patient();

                Main main = new Main();

                /*
                Employee emp = new Employee() {
                    @Override
                    public void setFirstName(String fname) {
                        super.setFirstName(String fname);
                    }
                }*/

                //Set register fees to the hospital
                main.setRegisterFee(500);

                //Set current date with the format
                Date date = Calendar.getInstance().getTime();
                DateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
                String today = formatter.format(date);

                /*
                //Set DOB with the format
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy", Locale.getDefault());
                cal.setTime(sdf.parse(uDate));
                */

                /*
                //Set doctor1 details
                Doctor doctor1 = new Doctor();
                doctor1.setDocNumber(1);
                doctor1.setFirstName("Sunil");
                doctor1.setLastName("Kariyawasam");
                doctor1.setSpecialty("heart");
                doctor1.setDoctorFee(3000);

                //Set doctor2 details
                Doctor doctor2 = new Doctor();
                doctor2.setDocNumber(2);
                doctor2.setFirstName("Dayarathne");
                doctor2.setLastName("Wijethunga");
                doctor2.setSpecialty("eye");
                doctor2.setDoctorFee(2500);

                //Set doctor3 details
                Doctor doctor3 = new Doctor();
                doctor3.setDocNumber(3);
                doctor3.setFirstName("Kirthi");
                doctor3.setLastName("Darmasiri");
                doctor3.setSpecialty("neural");
                doctor3.setDoctorFee(2000);
                */


                /*
                //Add doctors to an ArrayList
                ArrayList<Employee> doctors = new ArrayList<>();
                doctors.add(doctor1);
                doctors.add(doctor2);
                doctors.add(doctor3);*/


                ArrayList<Doctor> doctors = new ArrayList<Doctor>();

                //Add values using constructor
                Doctor doctor1 = new Doctor("Sunil", "Kariyawasam", "heart", 3000);
                Doctor doctor2 = new Doctor("Dayarathne", "Wijethunga", "eye", 2500);
                Doctor doctor3 = new Doctor("Kirthi", "Darmasiri", "neural", 2000);
                doctors.add(doctor1);
                doctors.add(doctor2);
                doctors.add(doctor3);

                Doctor doctor4 = new Doctor("Saman");
                doctors.add(doctor4);


                /*
                //Add patients to an ArrayList
                ArrayList<Patient> patients = new ArrayList<>();
                while(!(i<0))
                {
                    patients.addAll(patient1[i]);
                }
                */


                System.out.println();
                System.out.println("-------------Patient Personal Details:-------------");
                System.out.println();

                //Set the patient's first name
                System.out.print("First Name: ");
                String firstName = insert.next();
                if(firstName.matches("[a-zA-Z_]+"))
                    patient1.setFirstName(firstName);
                else
                    System.out.println("Invalid first name !!!");

                //Set the patient's last name
                System.out.print("Last Name: ");
                String lastName = insert.next();
                if(lastName.matches("[a-zA-Z_]+"))
                    patient1.setLastName(lastName);
                else
                    System.out.println("Invalid last name !!!");

                //Set the patient's date of birth
                System.out.print("Date of Birth (DD/MM/YYYY): ");
                patient1.setDOB(insert.next());

                //Set the patient's illness details
                System.out.println("-------------Patient Illness Details:-------------");
                System.out.print("Patient Illness (Base on: heart/eye/neural/other):");
                String illness = insert.next();
                if(illness.matches("[a-zA-Z_]+"))
                    patient1.setIllness(illness);
                else
                    System.out.println("Invalid illness !!!");

                System.out.println();
                System.out.println("------------------------Select a doctor:------------------------");
                System.out.println();
                System.out.println("Doctor Number\t    Doctor Name\t\t Specialties\t Doctor Fees");
                System.out.println("\t" + doctor1.getDocNumber() + "\t\t\t Dr." + Character.toUpperCase(doctor1.getFirstName().charAt(0)) + "." + " " + doctor1.getLastName() + "\t\t" + doctor1.getSpecialty() + "\t\t\t" + doctor1.getDoctorFee());
                System.out.println("\t" + doctor2.getDocNumber() + "\t\t\t Dr." + Character.toUpperCase(doctor2.getFirstName().charAt(0)) + "." + " " + doctor2.getLastName() + "\t\t" + doctor2.getSpecialty() + "\t\t\t\t" + doctor2.getDoctorFee());
                System.out.println("\t" + doctor3.getDocNumber() + "\t\t\t Dr." + Character.toUpperCase(doctor3.getFirstName().charAt(0)) + "." + " " + doctor3.getLastName() + "\t\t" + doctor3.getSpecialty() + "\t\t\t" + doctor3.getDoctorFee());
                System.out.println();

                //Choose a particular doctor from the list
                System.out.print("Enter the doctor number from above list: ");
                int choice = insert.nextInt();

                System.out.println();
                System.out.println();
                System.out.println("------------APPOINTMENT INVOICE------------");
                System.out.println();
                System.out.println("\t Date: " + today + "\t Appointment No: " + appointmentNo);
                System.out.println("\t Patient Name: " + (patient1.getFirstName().substring(0, 1).toUpperCase() + patient1.getFirstName().substring(1)) + " " + (patient1.getLastName().substring(0, 1).toUpperCase()+ patient1.getLastName().substring(1)));
                System.out.println("\t Patient Date of Birth: " + patient1.getDOB());
                System.out.println("\t Patient Illness: " + patient1.getIllness());
                System.out.println();
                System.out.println("--------------------------------------------");
                System.out.println();

                //Doctor choices
                switch(choice)
                {
                    case 1:
                        System.out.println("\t Doctor Name: Dr. " + doctor1.getFirstName() + " " + doctor1.getLastName());
                        System.out.println("\t Doctor Specialties in: " + doctor1.getSpecialty());
                        System.out.println("\t Payment:");
                        System.out.println("\t\t Register Fee: " + main.getRegisterFee());
                        System.out.println("\t\t Doctor Fee: " + doctor1.getDoctorFee());
                        System.out.println();
                        System.out.println("\t\t Full Payment: Rs. " + (main.getRegisterFee() + doctor1.getDoctorFee()));
                        break;
                    case 2:
                        System.out.println("\t Doctor Name: Dr. " + doctor2.getFirstName() + " " + doctor2.getLastName());
                        System.out.println("\t Doctor Specialties in: " + doctor2.getSpecialty());
                        System.out.println("\t Payment:");
                        System.out.println("\t\t Register Fee: " + main.getRegisterFee());
                        System.out.println("\t\t Doctor Fee: " + doctor2.getDoctorFee());
                        System.out.println();
                        System.out.println("\t\t Full Payment: Rs. "  + (main.getRegisterFee() + doctor2.getDoctorFee()));
                        break;
                    case 3:
                        System.out.println("\t Doctor Name: Dr. " + doctor3.getFirstName() + " " + doctor3.getLastName());
                        System.out.println("\t Doctor Specialties in: " + doctor3.getSpecialty());
                        System.out.println("\t Payment:");
                        System.out.println("\t\t Register Fee: " + main.getRegisterFee());
                        System.out.println("\t\t Doctor Fee: " + doctor3.getDoctorFee());
                        System.out.println();
                        System.out.println("\t\t Full Payment: Rs. "  + (main.getRegisterFee() + doctor3.getDoctorFee()));
                        break;
                    default:
                        System.out.println("Wrong choice. Please enter a doctor number only from 1 to 3");
                }
                System.out.println("--------------------------------------------");
                appointmentNo++;
                /*i++;*/
                stop = false;

            }
            else if(answer.equalsIgnoreCase("N"))
            {
                System.out.println("---------------------------------------------");
                System.out.println();
                System.out.println("-----Thank you for using the system !!!------");
                System.out.println();
                System.out.println("---------------------------------------------");
                stop = true;
            }
            else
            {
                System.out.println("---------------------------------------------");
                System.out.println();
                System.out.println("-----Please select either y/Y or n/N !!!-----");
                System.out.println();
                System.out.println("---------------------------------------------");
                stop = false;
            }
        }

    }
}
