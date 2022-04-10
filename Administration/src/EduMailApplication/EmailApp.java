package EduMailApplication;
import java.util.*;
public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user information
        System.out.println("Enter your first name: ");
        String f_name = sc.next();
        System.out.println("Enter your last name: ");
        String l_name = sc.next();
        //creating object for EduMail class
        EduMail email1 = new EduMail(f_name,l_name);
        int choice = -1;
        do {
            System.out.println("\n******\nEnter you choice\n1. Show info\n2. Change password\n3. Change mailbox capacity\n4. Set alternate mail\n5. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    email1.getInfo();
                    break;
                case 2:
                    email1.set_password();
                    break;
                case 3:
                    email1.set_mailCap();
                    break;
                case 4:
                    email1.alternate_email();
                    break;
                case 5:
                    System.out.println("Thank you for using the app :)");
                    break;
                default:
                    System.out.println("Invalid choice!\nChoice again...");
            }
        }
        while(choice != 5);
    }
}
