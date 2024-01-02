import java.util.*;
public class pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for spaces before the asterisks
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }


            // Inner loop for printing asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
            }
            
        

            /*System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            for(int i = 1; i <= rows;i++){//row
                // i = 2
                for(int j = 1; j<= rows - i + 1; j++){//column
                    System.out.print("*");
                    //*****
                    //****
                }
                System.out.println();
            }*/
    }
}






