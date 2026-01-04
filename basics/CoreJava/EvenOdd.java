package CoreJava;
import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int num)
    {
        return num % 2 == 0;
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num = sc.nextInt();

        if (isEven(num)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
