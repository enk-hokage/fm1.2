package AnagramApplicationPackage;


public class AnagramApplication {

    public void startApplication(){
        ConsoleReader consoleReader = new ConsoleReader();
        String text = consoleReader.waitForText();

        WordSplitter wordSplitter = new WordSplitter();
        String [] words = wordSplitter.splitPhrase(text);

        AnagramProcessor anagramProcessor = new AnagramProcessor();
        anagramProcessor.process(words);

    }
}
