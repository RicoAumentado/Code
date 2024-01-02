import java.util.*;

public class ICTSO_BANK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("  ********************************");
        System.out.println(" *       Welcome to ICTSO         *");
        System.out.println("*               Bank               *");
        System.out.println("*************************************");
        System.out.println("Bank on us for your financial success");
        System.out.println("*************************************");
        System.out.println("Your financial is our top priority");

        boolean a = true;
        
        String AccountName = "";
        String AccountPassword = "";

        while(a){
            System.out.println("Please select what you want to do:");
            System.out.println("1. Create an account");
            System.out.println("2. Log in");
            System.out.println("3. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Create Account Name: ");
                    AccountName = input.next();
                    System.out.print("Create a password: ");
                    AccountPassword = input.next();               
                    System.out.println("Account created successfully!");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter Account: ");
                    String Account = input.next();
                    System.out.print("Enter a password: ");
                    String password = input.next();
                    if(AccountName.equals(Account) && AccountPassword.equals(password)){
                        System.out.println("Log in successfully!");
                        System.out.println();
                        a = false;
                    } else{
                        System.out.println("Login Failed.");
                    }
                    break;
                default:
                input.close();
            
            }
        }
            int withdraw = 0;
            int deposit = 0;
            int balance = 0;
        boolean b = true;
        while (b){
            System.out.println("Please select what you want to do: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. View transaction history ");
            System.out.println("5. Log out");

            System.out.print("Enter your choice: ");
            int Choice = input.nextInt();

            switch(Choice){
                case 1:
                System.out.print("Enter amount to deposit: ");
                deposit = input.nextInt();
                System.out.println("Deposit Successful.");
                System.out.println("New balance is " + deposit + "\n");
                break;
                case 2: 
                System.out.print("Enter amount to withdraw: ");
                withdraw = input.nextInt();
                System.out.println("Withdrawal successful.");
                balance = deposit - withdraw;
                System.out.println("New balanace is " + balance );
                break;
                case 3:
                System.out.println("Your current balance is " + withdraw  + "\n");
                break;
                case 4:
                System.out.println("Transaction history:");
                System.out.println("Deposit of " + deposit);
                System.out.println("Withdrawal of " + withdraw);
                break;
                default:
                b = false;
                input.close();
            }

        }

        
    }
}
