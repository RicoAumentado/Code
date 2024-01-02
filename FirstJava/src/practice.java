import java.util.*;
public class practice {
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("Grocery Store");

        String check = "";
        boolean a = true;
        boolean B = true;
        String username = "", password = "";
        while(a){
        System.out.println("Menu");
        System.out.println("1. Log in \n2. Create an Account\n3.Exit");
        System.out.print("Select an Option (1-3): ");
        int option = input.nextInt();
        if(option > 3){
            System.out.println("Invalid choice.");
        }

        switch(option){
            case 2: 
            System.out.print("Username : ");
            username = input.next();
            System.out.print("Password: ");
            password = input.next();
            System.out.println("Account created successfully!\n");
            break;
            case 1: 
            System.out.println("Please log in to continue");
            System.out.print("Username: ");
            String Username = input.next();
            System.out.print("Password: ");
            String Password = input.next();
            if (Username.equals(username) && password.equals(Password)){
                System.out.println("Welcome," + username);
            a = false;
            } else{
                a = false;
            }
            break;
            default :
            System.out.println("Exit");
            input.close();
            a = false;
            B = false;
                }
            }    
            while(B){
            System.out.println("Item Menu");
            System.out.println("1. Milk - $50");
            System.out.println("2. Bread - $15");
            System.out.println("3. Egg - $9");
            System.out.println("4. Chocolate - $85");
            System.out.println("5. Tide - $8");
            System.out.println("6. Rice - $12");
            System.out.println("7. Checkout");
            System.out.println("8. View Cart");
            System.out.println("9. Remove Item");
            System.out.println("10 Log out");

            int m = 0 , b= 0 , e= 0, c = 0, t = 0, r = 0 ;
            String milk = "milk,",bread = "bread", egg= "egg", chocolate = "chocolate", tide = "tide", rice = "rice";  
                
            System.out.print("Please select an option \"1-10\": ");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                m = m +50;
                break;

                case 2:
                b = +15;
                break;
                
                case 3:
                e =  +9;
                break;
                case 4: 
                c = + 85;
                break;
                case 5:
                t = +8;
                break;
                case 6:
                r = +12;
                break;  
                case 7:
                
                B = false;

                System.out.println("Cart summary: ");
                if ( m > 0){
                    check = check + milk; 
                    System.out.println(check);
                
                }  


                }
            }
    }
}

