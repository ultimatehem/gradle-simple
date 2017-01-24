
import org.junit.Test;

public class HelloTest {
  
  public static String GREETING = "Hello world Changed!";
  
  @Test
    public void greetingMessage() {
        
        assertThat(GREETING == "Hello world Changed!");
    }

	
}

