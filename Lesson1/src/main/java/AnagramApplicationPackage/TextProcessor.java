package AnagramApplicationPackage;

import java.util.Scanner;

public class TextProcessor {

    public String readText(){
        System.out.println("Write a text for reverse");
        Scanner console = new Scanner(System.in);

        String phrase = console.nextLine();

        return phrase;
    }

	public void outputResult(String result) {
		if (result == null) {
			throw new NullPointerException("Result must not be null");
		}
		System.out.println(result);
	}


}
