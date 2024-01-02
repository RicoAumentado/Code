import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        String palindrome = "";
        System.out.println("Enter text: ");
        String text = inp.nextLine();

        for(int i = text.length()-1; i >= 0;i--){
            palindrome += text.charAt(i);
        }
        System.out.println("The original word is " + text);
        System.out.println("The original word is " + palindrome);

        if(palindrome.equals(text)){
            System.out.println("The word " + text + " and " +  palindrome + " is palindrome");
        } else {
            System.out.println("The word " + text + " and " +  palindrome + " is not palindrome");
        } 
    }
}
