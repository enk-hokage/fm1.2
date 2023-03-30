package AnagramApplicationPackage;

public class WordSplitter {

    public String[] splitPhrase(String phraseToSplite){

        String [] words = phraseToSplite.split(" ");
        return words;
    }

}
