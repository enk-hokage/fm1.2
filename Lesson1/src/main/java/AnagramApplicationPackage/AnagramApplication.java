package AnagramApplicationPackage;


public class AnagramApplication {

    public void startApplication(){
        TextProcessor textProcessor = new TextProcessor();
        AnagramProcessor anagramProcessor = new AnagramProcessor();

        String text = textProcessor.readText();

        textProcessor.outputResult(anagramProcessor.process(text));
    }
}
