public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel Core i5", 3200);
        Monitor monitor = new Monitor("LG 24");
        Mouse mouse = new Mouse("Logitech", "Wireless");

        System.out.println("CPU:");
        cpu.DisplaySpecCPU();
        System.out.println("Monitor:");
        monitor.DisplaySpecMonitor();
        System.out.println("Mouse:");
        mouse.DisplaySpecMouse();
    }
}
