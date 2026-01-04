package CoreJava;
import java.util.Scanner;

public class LoopPrintNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a starting Number : ");
        int start = sc.nextInt();

        System.out.println("Enter a ending Number : ");

        int end = sc.nextInt();
        System.out.println();
        for(int i = start ; i <= end ; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
