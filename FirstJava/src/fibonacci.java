import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.println("Enter number: ");
        int number = inp.nextInt();
        int num1 = 0, num2 = 1;
        int sum = 0;
            for(int i = 1; i <= number; i++){
                System.out.print(num1 + ", ");
            sum = num1+ num2;
            num1 = num2;
            num2 = sum; 
            }
            
    }
}















