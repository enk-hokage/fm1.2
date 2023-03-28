public class AnnogramApplication {

    public String reverseWord(String wordForReverse){
        int lengthOfWord = wordForReverse.length();

        char[] letters = new char[lengthOfWord];        //массив чаров(букв) по длине пришедшего слова
        boolean [] isLetter = new boolean[lengthOfWord]; //массив булевых значений для каждого символа, где true - чар=буква
        for(int i = 0; i < lengthOfWord; i++){          //проходимся по всему слову
            char c = wordForReverse.charAt(i);
            if(Character.isLetter(c)){                  //ниже: если буква - вносим в массив чаров, и булов - true, если c не буква, то только записываем на его же позицию
                letters[i] = c;
                isLetter[i] = true;
            } else {
                letters [i] = c;
            }
        }

        int left = 0, right = lengthOfWord - 1;         //будем сравнивать чары, и двигать их на встречу друг другу
        while (left < right){
            if(isLetter [left] && isLetter [right]){    //если оба элементы - буквы, то меняем их значения местами, и +/- значения на 1
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            } else if (!isLetter [left]){               //если меньший элемент не буква, то движемся дальше, местами не меняем
                left++;
            } else if (!isLetter [right]){              //в другой ситуации больший элемент двигаем в сторону малого.
                right--;
            } else {                                    //либо сразу оба, если они - не буквы
                left++;
                right--;
            }
        }
        StringBuilder result = new StringBuilder();      //с помощью билдера соединяем образующиея элементы
        for(int i = 0; i < letters.length; i++){
            result.append(letters[i]);
        }
        return result.toString();
    }


    public String[] splitPhrase(String phraseToSplite){
        String [] words = phraseToSplite.split(" ");
        return words;
    }

}
