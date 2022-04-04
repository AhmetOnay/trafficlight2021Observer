import trafficlight.ctrl.TrafficLightCtrl;

//https://github.com/AhmetOnay/trafficlight2021Observer
public class MCP {
    public static void main(String[] args) {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.run();
    }
}