package emailapp;
import java.util.*;
import java.io.*;
public class Email {
     Scanner scanner = new Scanner(System.in); //Scanner class
//     Setting our variables
//    We have set our variables to private to implement abstraction
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int mail_Capacity = 500;
    private String alterEmail;

//    The Class constructor to receive first name  and last name
   public Email(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;

       System.out.println("New Employee: " + this.firstName+" " +this.lastName);



   }
//   Generate mail method
   private String generateEmail(){
       return this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department.toLowerCase()+".company.com";
   }

//   Asking for department
    private String setDepartment(){
       System.out.println("Department codes \n1 for sales \n2 for Development \n3 for Accounting \n0 for none");
       boolean flag = false;
       do{
           System.out.println("Enter Department code");
           int choice = scanner.nextInt();
           switch (choice){
               case 1:
                   return "Sales";
               case 2:
                   return "Development";
               case 3:
                   return "Accounting";
               case 0:
                   return "None";
               default:
                   System.out.println("Invalid choice please chose the department again");
           }
       }
       while (!flag);
       return null;
    }
}

