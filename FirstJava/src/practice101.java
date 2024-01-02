import java.util.Scanner;
public class practice101 {
    public static void main(String[] args) {
      int total = 0;
        Scanner david = new Scanner (System.in);
        System.out.println("Enter number:");
        int num1 = david.nextInt();
        System.out.println("enter number:");
        int num2 = david.nextInt();
        System.out.println("num3 ");
        int num3 = david.nextInt();
        
        total = num1 + num2 + num3;
        System.out.println("total is " + total);

        //Datatypes
        String name = "David";
        int number = 1;
        boolean choice = true;
        double decimal = 1.00;
        float dec = 1.00f;
        char charcter = 'B';
        System.out.println(dec);
    }
}
