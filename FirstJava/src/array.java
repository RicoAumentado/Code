import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        
        /*System.out.print("Enter number of inputs: ");
        int inputs = inp.nextInt();
        int num[] = new int[inputs];

        for(int i = 0; i < num.length; i++){
            System.out.printf("Enter value for num [%d] : ", i);
            num[i] = inp.nextInt();
        }
        for (int i : num) {
            System.out.println("The values are " + i);
        }*/
        System.out.println("Enter number of inputs: ");
        int inputs = inp.nextInt();

        int num[] = new int [inputs];
        for(int i = 0; i < num.length; i++){
            System.out.printf("Enter name [%d] : ", i);
            num[i] = inp.nextLine();
        }
        for (int i : num) {
            System.out.println("The last name is "  + i);
        }
        

    }
}
