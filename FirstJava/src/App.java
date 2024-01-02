import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner (System.in);
        System.out.println("Welcome to BSIT BANK");
        boolean a = true;

        String Account_names = null;
        String Pass = null;
        double depositAmount = 0;
        double deposit = 0;
        double withdraw = 0;
        while (a) {
            System.out.println("Please select what you want to do:");
            System.out.println("1: Create an account ");
            System.out.println("2: Log in");
            System.out.println("3: Exit");

            System.out.print("Enter your choice: 1/2/3: ");
            int choice = inp.nextInt();
            boolean A = true;
                while(A){
                    if (choice >3){               
                        break;
                    } else {
                        A = false;
                    }
                }
            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String Account_name = inp.next();
                    System.out.print("Enter a password: ");
                    String pass = inp.next();
                    System.out.println("Account created successfully!");

                    Account_names = Account_name;
                    Pass = pass;
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = inp.next();
                    System.out.print("Enter your password: ");
                    String pass2 = inp.next();
                    if (Account_names != null && Pass != null && Account_names.equals(name) && Pass.equals(pass2)) {
                        System.out.println("Logged in successfully!");

                        a = false; // Break out na ung loop.
                    } else {
                        System.out.println("Login failed. Please try again!");
                    }
                    break;
                case 3:
                   inp.close(); // Exit na yung program.
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
                    break;
            }
        }



        boolean b = true;
        while(b){
            System.out.println("Please select you want to do: ");
            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Check balance");
            System.out.println("4: Transaction history");
            System.out.println("5: Log out");

            System.out.print("Enter your choice: 1/2/3: ");
            int choice3 = inp.nextInt();
            switch (choice3){
                case 1: 

                    System.out.print("Enter amount to deposit: ");
                    //5000
                    deposit = inp.nextDouble();
                    depositAmount += deposit;
                    System.out.println("Deposit successful");
                    System.out.println("New balance is $" + deposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    //3000
                    withdraw = inp.nextDouble();
                    depositAmount -= withdraw;
                    System.out.println("Withdrawal succesful");
                    System.out.println("Your current balance is $" + depositAmount);
                    
                    break;
                case 3:
                System.out.println("Your current balance is " + depositAmount);
                    break;
                    /* enter your choice: 3
                    Your current balance is $ 2000
                    */
                case 4:
                    System.out.println("View Transaction history: ");
                    
                    System.out.println("Transaction histry is: ");
                    System.out.println("Deposit of $" + deposit );
                    System.out.println("Withdrawal of $ " + withdraw);
                    break;
                    /*
                    view transcation history
                    transaction history is:
                        deposit of $ 5000
                        withdrawal of $ 3000
                    */

                default: 
                    System.out.println("Log Out");
                    inp.close();
            }
        }

    }
}
