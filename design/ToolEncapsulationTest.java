import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ToolEncapsulationTest {

    private ToolEncapsulation unit;

    @BeforeEach
    void setup() {
        unit = new ToolEncapsulation();
    }

    @Test
    void getToolName() {
        assertEquals("", unit.getToolName());
    }

    @Test
    void getToolVersion() {
        assertEquals("", unit.getToolVersion());
    }

    @Test
    void isConnected() {
        assertFalse(unit.isConnected());
    }

    @Test
    void invokeCommand() {
        String cmd = "";
        unit.invokeCommand(cmd);
    }

}
