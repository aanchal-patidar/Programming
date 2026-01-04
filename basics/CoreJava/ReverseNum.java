package CoreJava;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        String store = "";
        while (num > 0) {
              int x = num % 10;
              store = store + x ;
              num = num / 10;          
        }
        System.out.println("Reverse Number is : "+ store);
        sc.close();
    }
}
