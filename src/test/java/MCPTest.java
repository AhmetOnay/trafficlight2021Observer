import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MCPTest {
    TrafficLightCtrl trafficLightCtrl = TrafficLightCtrl.getInstance();

    @Test
    void stateGreenTest() {
        String actual = trafficLightCtrl.getGreenState().getColor();
        String expected = "green";
        assertEquals(expected,actual);
    }

    @Test
    void stateRedTest() {
        String actual = trafficLightCtrl.getRedState().getColor();
        String expected = "red";
        assertEquals(expected,actual);
    }

    @Test
    void stateYellowTest() {
        String actual = trafficLightCtrl.getYellowState().getColor();
        String expected = "yellow";
        assertEquals(expected,actual);
    }

}