package AnagramApplicationPackage;

public class AnagramProcessor {

	public String process(String text) {
		if (text == null || text.trim().isEmpty()) {
			return text;
		}
		String[] words = splitPhrase(text);
		String[] reversedWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			if (words[i].isEmpty()) {
				reversedWords[i] = words[i];
			} else {
				reversedWords[i] = reverseWord(words[i]);
			}
		}
		return String.join("", reversedWords);
	}



	public String[] splitPhrase(String text) {
		return text.split("(?<=\\s)|(?=\\s)");
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
