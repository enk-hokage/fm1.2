import java.util.Scanner;


public class AnagramApplication {

    public void startApplication(){
        String [] words = splitPhrase(waitForText());

        for (int i = 0; i < words.length; i++){

            String result = reverseWord(words[i]);

            while(i != words.length){
                System.out.print(result + " ");
                break;
            }
        }
    }

    private String waitForText(){
        System.out.println("Write a text for reverse");
        Scanner console = new Scanner(System.in);

        String phrase = console.nextLine();

        return phrase;
    }

    private String[] splitPhrase(String phraseToSplite){

        String [] words = phraseToSplite.split(" ");
        return words;
    }

    private String reverseWord(String wordForReverse){
        int lengthOfWord = wordForReverse.length();

        char[] letters = new char[lengthOfWord];
        boolean [] isLetter = new boolean[lengthOfWord];
        for(int i = 0; i < lengthOfWord; i++){
            char c = wordForReverse.charAt(i);
            if(Character.isLetter(c)){
                letters[i] = c;
                isLetter[i] = true;
            } else {
                letters [i] = c;
            }
        }

        int left = 0, right = lengthOfWord - 1;
        while (left < right){
            if(isLetter [left] && isLetter [right]){
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            } else if (!isLetter [left]){
                left++;
            } else if (!isLetter [right]){
                right--;
            } else {
                left++;
                right--;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < letters.length; i++){
            result.append(letters[i]);
        }
        return result.toString();
    }

}
