package EduMailApplication;
import java.io.*;
import java.util.*;

public class EduMail {
    public Scanner sc = new Scanner(System.in); //global Scanner class
    //set some private variable to not give direct access
    private String firstName;
    private String lastName;
    private String catagory;
    private String email;
    private String password;
    private int emailCapacity = 500;
    private String alter_email;

    public EduMail(String firstname, String lastname){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Addition: "+this.firstName+" "+this.lastName);
        //calling methods
        this.catagory = this.setCatagory(); //department
        this.password = this.random_password(8); //password
        this.email = this.create_email(); //email generating

    }
    //creating email method
    private String create_email(){
        return this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.catagory.toLowerCase()+".versity.com";
    }
    //ask for catagory
    private String setCatagory(){
        System.out.println("Department Catagory \n1. For Student \n2. For Teacher \n3. For Accountant \n4. For Administrator \n0. For None");
        boolean flag = false;
        do{
            System.out.println("Enter the Department Code: ");
            int choice = sc.nextInt(); //take user input
            switch (choice){
                case 1:
                    return "Student";
                case 2:
                    return "Teacher";
                case 3:
                    return "Accountant";
                case 4:
                    return "Administrator";
                case 0:
                    return "None";
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        while(!flag);
        return null;
    }
    //create random password method
    private String random_password(int length){
        Random r = new Random();
        String capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_char = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&?";
        String values = capital_char+small_char+symbols+numbers;
        String password = "";
        for(int i=0;i<length;i++){
            password = password+values.charAt(r.nextInt(values.length()));
        }
        return password;
    }
    //change password method
    public void set_password(){
        boolean flag = false;
        do {
            System.out.println("Do you want to change your password? (Y/N)");
            char choice = sc.next().charAt(0);
            if(choice == 'Y'|| choice=='y'){
                flag = true;
                System.out.println("Enter current password: ");
                String temp = sc.next();
                if(temp.equals(this.password)){
                    System.out.println("Enter new password:");
                    this.password = sc.next();
                    System.out.println("Password changed successfully.");
                }
                else{
                    System.out.println("Incorrect password!");
                }
            }
            else if (choice == 'N'|| choice=='n'){
                flag = true;
                System.out.println("Password changed option cancelled!");
            }
            else{
                System.out.println("Enter valid choice.");
            }
        }
        while(!flag);
    }
    //set mailbox capacity method
    public void set_mailCap(){
        System.out.println("Current capacity = "+this.emailCapacity+" mb");
        System.out.println("Enter new mailbox capacity: ");
        this.emailCapacity = sc.nextInt();
        System.out.println("Mailbox capacity is successfully changed.");
    }
    //set alternate email
    public void alternate_email(){
        System.out.println("Enter new alternate email: ");
        this.alter_email = sc.next();
        System.out.println("Alternate email is set.");

    }
    //Display user info method
    public void getInfo(){
        System.out.println("New: "+this.firstName+" "+this.lastName);
        System.out.println("Catagory: "+this.catagory);
        System.out.println("Email: "+this.email);
        System.out.println("Password: "+this.password);
        System.out.println("Mail Capacity: "+this.emailCapacity+"mb");
        System.out.println("Alternate email: "+this.alter_email);

    }

}
