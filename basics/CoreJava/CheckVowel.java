package CoreJava;
import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character :");
        int Alphabet = sc.next().charAt(0);

        // only for checking vowel and consonent
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(Alphabet) != -1) {
            System.out.println("Character is Vowel");
        } else{
            System.out.println("Character is Consonant ");
        }

        sc.close();
    }
}
