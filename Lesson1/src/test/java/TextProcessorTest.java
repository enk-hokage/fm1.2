import AnagramApplicationPackage.AnagramProcessor;
import AnagramApplicationPackage.TextProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {

	private TextProcessor textProcessor;

	@BeforeEach
	public void setUp() {
		textProcessor = new TextProcessor();
	}

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
	public void outputResult_shouldReturnNotNull_whenMethodOutputResultToConsole() {
		assertThrows(NullPointerException.class, () -> {
			textProcessor.outputResult(null);
		});
	}
}
