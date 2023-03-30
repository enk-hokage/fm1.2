package AnagramApplicationPackage;


public class AnagramApplication {

    public void startApplication(){
        TextProcessor textProcessor = new TextProcessor();
        AnagramProcessor anagramProcessor = new AnagramProcessor();
        String text = textProcessor.waitForText();

        String [] words = anagramProcessor.splitPhrase(text);

        textProcessor.outputResult(anagramProcessor.process(words));

    }
}
