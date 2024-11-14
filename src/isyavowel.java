import java.util.Scanner;

public class isyavowel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int countYVowel = 0;
        int countVowel = 0;

        for(int i = 0; i<word.length(); i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                countVowel++;
            }

            if (word.charAt(i) == 'y'){
                countYVowel++;
            }
        }
        countYVowel += countVowel;
        System.out.print(countVowel + " " + countYVowel);


    }
}
