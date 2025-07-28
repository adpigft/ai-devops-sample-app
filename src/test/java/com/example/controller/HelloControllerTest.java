import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.controller.HelloController;

public class HelloControllerTest {

    private HelloController createController() {
        return new HelloController();
    }

    @Test
    public void HelloController_sayHello_ShouldReturnExpectedGreeting() {
        HelloController controller = createController();
        String result = controller.sayHello();
        assertEquals("Hello, DevOps AI!", result, "The greeting message should be 'Hello, DevOps AI!'");
    }
}
