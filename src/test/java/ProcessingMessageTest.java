import org.junit.Assert;
import org.junit.Test;
import ru.urfu.ProcessingMessage;

/**
 * Тесты для класса ProcessingMessage
 */
public class ProcessingMessageTest {

    /**
     * Тестировать обработку сообщения пользователя
     */
    @Test
    public void processTest() {
        ProcessingMessage processingMessage = new ProcessingMessage();
        String expected = "Ваше сообщение: 'My message'";
        String actual = processingMessage.process("My message");

        Assert.assertEquals(expected, actual);
        Assert.assertNotNull(actual);
    }
}
