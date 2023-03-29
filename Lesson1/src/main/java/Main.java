import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        AnagramApplication anagramApplication = new AnagramApplication();

        String [] words = anagramApplication.splitPhrase(anagramApplication.startApplication());

        for (int i = 0; i < words.length; i++){

            String result = anagramApplication.reverseWord(words[i]);

            while(i != words.length){
                System.out.print(result + " ");
                break;
            }
        }
    }
}