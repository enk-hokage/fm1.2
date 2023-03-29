import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        AnnogramApplication annogramApplication = new AnnogramApplication();

        String [] words = annogramApplication.splitPhrase(annogramApplication.startApplication());

        for (int i = 0; i < words.length; i++){

            String result = annogramApplication.reverseWord(words[i]);

            while(i != words.length){
                System.out.print(result + " ");
                break;
            }
        }
    }
}