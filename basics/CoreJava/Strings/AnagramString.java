import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Stirng : ");
        String s1 = sc.nextLine();

        System.out.print("Enter second Stirng : ");
        String s2 = sc.nextLine();

        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 != len2)
        {
            System.out.println("String is not Anagram");
        }
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = s1.toCharArray();
        Arrays.sort(arr2);

         if (Arrays.equals(arr1, arr2)){
            System.out.println("String is Anagram");
         }else{
            System.out.println("String is not Anagram");
         }
         sc.close();

       
    }
}
