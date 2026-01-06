import java.util.Scanner;

public class PalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String : ");
        String str = sc.next();
        String s = "";

        int len = str.length();
        for (int i = len - 1; i >= 0 ;i--) {
            s += str.charAt(i);
        }
        if (str.equals(s)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
        sc.close();
        
    }
}