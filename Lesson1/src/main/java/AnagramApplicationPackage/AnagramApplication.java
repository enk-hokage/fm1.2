package AnagramApplicationPackage;


public class AnagramApplication {

    public void startApplication(){
        TextProcessor textProcessor = new TextProcessor();
        String text = textProcessor.waitForText();

        WordSplitter wordSplitter = new WordSplitter();
        String [] words = wordSplitter.splitPhrase(text);

        textProcessor.outputResult(words);

    }
}
