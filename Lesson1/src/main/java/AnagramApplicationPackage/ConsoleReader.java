package AnagramApplicationPackage;

import java.util.Scanner;

public class ConsoleReader {

    public String waitForText(){
        System.out.println("Write a text for reverse");
        Scanner console = new Scanner(System.in);

        String phrase = console.nextLine();

        return phrase;
    }

}
