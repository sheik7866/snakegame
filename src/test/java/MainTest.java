import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Check the main program")
    public void testMain() {
        Main m = new Main();
        m.main(null);
    }
}