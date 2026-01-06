import java.util.Scanner;

public class CountVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an String : ");
        String s = sc.nextLine();
        char ch[] = s.toLowerCase().toCharArray();
        int vcount = 0;
        int scount = 0;
        int dcount= 0;
        for(int i = 0 ; i < ch.length; i++){
            switch (ch[i]) {
                case 'a','e','i','o','u':
                    vcount++ ;                  
                    break;
                case ' ':
                    scount++;
                    break;
                case '1','2','3','4','5','6','7','8','9':
                    dcount++;
                    break;
                default:
                    break;
            }
            
        }

        System.out.println("Vowel Count is : " +vcount);
        System.out.println("space Count is : " +scount);
        System.out.println("digit Count is : " +dcount);
       
        sc.close();

        //anothe rway of finding counts of vowel, digit, space ,special char. ,consonant
        // int vowel = 0, consonant = 0, space = 0, digit = 0, special = 0;

        // for (char ch : s.toCharArray()) {

        //     if (ch >= 'a' && ch <= 'z') {
        //         if ("aeiou".indexOf(ch) != -1)
        //             vowel++;
        //         else
        //             consonant++;
        //     } 
        //     else if (ch == ' ') {
        //         space++;
        //     } 
        //     else if (ch >= '0' && ch <= '9') {
        //         digit++;
        //     } 
        //     else {
        //         special++;
        //     }
        // }

        // System.out.println("Vowels      : " + vowel);
        // System.out.println("Consonants  : " + consonant);
        // System.out.println("Spaces      : " + space);
        // System.out.println("Digits      : " + digit);
        // System.out.println("Special Ch. : " + special);

    }
}


