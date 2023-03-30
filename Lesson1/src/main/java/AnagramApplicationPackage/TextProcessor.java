package AnagramApplicationPackage;

import java.util.Scanner;

public class TextProcessor {

    public String waitForText(){
        System.out.println("Write a text for reverse");
        Scanner console = new Scanner(System.in);

        String phrase = console.nextLine();

        return phrase;
    }

    public void outputResult(String words[]){

        for (int i = 0; i < words.length; i++){
            AnagramProcessor anagramProcessor = new AnagramProcessor();

            String result = anagramProcessor.reverseWord(words[i]);

            while(i != words.length){
                System.out.print(result + " ");
                break;
            }
        }
    }

}
