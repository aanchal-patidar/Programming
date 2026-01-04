package CoreJava;
import java.util.Scanner;

public class SumOfNutualNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0 ;

        System.out.println();
        for(int i = 1 ; i <= num ; i++){
            sum += i;
        }
        System.out.println("Sum of first "+ num + " natural Number : "+ sum);
        sc.close();
    }
}


