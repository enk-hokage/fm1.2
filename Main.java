import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        AnnogramApplication annogramApplication = new AnnogramApplication();


        System.out.println("Write a text for reverse");
        Scanner console = new Scanner(System.in);
        String phrase = console.nextLine();
        String [] words = annogramApplication.splitPhrase(phrase);

        for (int i = 0; i < words.length; i++){

            String result = annogramApplication.reverseWord(words[i]);

            while(i != words.length){
                System.out.print(result + " ");
                break;
            }
        }
    }
}