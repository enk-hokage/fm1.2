import AnagramApplicationPackage.AnagramProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramProcessorTest {

	private AnagramProcessor anagramProcessor;

	@BeforeEach
	public void setUp() {
		anagramProcessor = new AnagramProcessor();
	}

	@ParameterizedTest
	@CsvSource({
		",",
		"' ', ' '",
		"'    ', '    '",
		"a, a",
		"aaa, aaa",
		"'!@#$%^&*()_+', '!@#$%^&*()_+'",
		"'hello world', 'olleh dlrow'"
	})
	public void process_whenInputIsValid_shouldReturnReversedText(String input, String expectedOutput) {
		String actualOutput = anagramProcessor.process(input);
		assertEquals(expectedOutput, actualOutput);
	}

	@ParameterizedTest
	@CsvSource({
		"'a2Cs9 12JJk', 's2Ca9 12kJJ'",
		"'hello', 'olleh'"
	})
	public void process_whenInputContainsMixedCaseCharsOrDifferentLetters_shouldReturnReversedTextWithSameCase(String input, String expectedOutput) {
		String actualOutput = anagramProcessor.process(input);
		assertEquals(expectedOutput, actualOutput);
	}
}
