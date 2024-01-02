import java.util.*;
public class ProcessingPurchase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for(int i = 1; i <= 3; i++){
            double total = 0;
            System.out.print("Enter amount: ");
            double amount = inp.nextDouble();
            System.out.print("Taxable? (True/False) :");
            boolean Taxable = inp.nextBoolean();
            if(Taxable){
                total = amount * 1.05;
            } else{
                total += amount;
            }
            System.out.println("Total : " + total);
        }
    }
}