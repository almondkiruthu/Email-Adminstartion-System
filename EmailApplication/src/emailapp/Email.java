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
//    Generate Random password method
    private String generatePassword(int length){
       Random r = new Random();
       String capitalChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String smallChar = "abcdefghijklmnopqrstuvwxyz";
       String numbers = "0123456789";
       String symbols = "!@#$%&?";
       String values = capitalChar+smallChar+numbers+symbols;

       String password = "";
       for(int i =0; i<length; i++){
           password = password+values.charAt(r.nextInt(values.length()));
       }

       return password;

    }
//    Change password method
    public void setPassword(){
        boolean f = false;
        do{
            System.out.println("Do you want to change your password! (Y/N)");
            char choice = scanner.next().charAt(0);
            if(choice == 'Y'|| choice =='y'){
                f = true;
                System.out.println("Enter current password:");
                String temp = scanner.next();
                if(temp.equals(this.password)){
                    System.out.println("Enter new password: ");
                    this.password = scanner.next();
                    System.out.println("Password changed successfully");
                }
                else{
                    System.out.println("Incorrect password");
                }
            }
            else if(choice== 'N' || choice=='n'){
               f = true;
               System.out.println("Password changing option cancelled!");
            }
            else{
                System.out.println("Enter valid choice");
            }
        }while(!f);
    }
}


