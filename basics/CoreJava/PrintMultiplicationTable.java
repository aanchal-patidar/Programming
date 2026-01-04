package CoreJava;
import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        System.out.println();
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("Multiplication of "+ num + " X " + i + " is: "+ num * i);
        }
        
        sc.close();
    }
}
