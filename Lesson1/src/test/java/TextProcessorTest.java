import AnagramApplicationPackage.AnagramProcessor;
import AnagramApplicationPackage.TextProcessor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {

	@Test
	void readText_shouldReturnNotNull_whenItGetTextFromConsole(){
		var expectedText = "Hello, world!";
		var inputStream = new ByteArrayInputStream(expectedText.getBytes());
		System.setIn(inputStream);

		var textProcessor = new TextProcessor();
		var actualText = textProcessor.readText();

		assertNotNull(actualText, () -> "Text should be not null");
		assertEquals(expectedText, actualText);
	}

	@Test
	public void reverseString_whenInputIsEmpty_shouldReturnEmptyString() {
		AnagramProcessor anagramProcessor = new AnagramProcessor();
		String input = "";
		String actualOutput = anagramProcessor.process(input);
		String expectedOutput = "";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void reverseText_whenInputIsSingleSpace_shouldReturnSingleSpace() {
		AnagramProcessor anagramProcessor = new AnagramProcessor();
		String input = " ";
		String actualOutput = anagramProcessor.process(input);
		String expectedOutput = " ";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void reverseText_whenInputHasMultipleSpaces_shouldReturnSameNumberOfSpaces() {
		AnagramProcessor anagramProcessor = new AnagramProcessor();
		String input = "    ";
		String actualOutput = anagramProcessor.process(input);
		String expectedOutput = "    ";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testProcess_singleCharacterInput_returnsSameCharacter() {
		AnagramProcessor anagramProcessor = new AnagramProcessor();
		String input = "a";
		String actualOutput = anagramProcessor.process(input);
		String expectedOutput = "a";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void reverseText_whenInputIsMultipleSameLetter_shouldReturnSameLetter() {
		AnagramProcessor anagramProcessor = new AnagramProcessor();
		String input = "aaa";
		String actualOutput = anagramProcessor.process(input);
		String expectedOutput = "aaa";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void reverseText_whenInputContainsMixedCaseChars_shouldReturnReversedTextWithSameCase() {
		AnagramProcessor anagramProcessor = new AnagramProcessor();
		String input = "a2Cs9 12JJk";
		String expectedOutput = "s2Ca9 12kJJ";
		String actualOutput = anagramProcessor.process(input);
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void reverseText_whenInputIsWordWithDifferentLetters_shouldReturnReversedWordWithSameLetters() {
		AnagramProcessor anagramProcessor = new AnagramProcessor();
		String input = "hello";
		String actualOutput = anagramProcessor.process(input);
		String expectedOutput = "olleh";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void reverseText_whenInputIsOnlySymbols_shouldReturnSameSymbolsInReverseOrder() {
		AnagramProcessor anagramProcessor = new AnagramProcessor();
		String input = "!@#$%^&*()_+";
		String actualOutput = anagramProcessor.process(input);
		String expectedOutput = "!@#$%^&*()_+";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void reverseText_whenInputIsMultipleWords_shouldReturnReversedMultipleWords() {
		AnagramProcessor anagramProcessor = new AnagramProcessor();
		String input = "hello world";
		String actualOutput = anagramProcessor.process(input);
		String expectedOutput = "olleh dlrow";
		assertEquals(expectedOutput, actualOutput);
	}





}
