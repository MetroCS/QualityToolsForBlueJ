import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class HelloWorldTest {
 
	@Test
	public void testingHelloWorld() {
		assertEquals("Here is test for Hello World String: ", "Hello World", HelloWorld());
	}
}