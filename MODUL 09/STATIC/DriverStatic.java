public class DriverStatic {
    public static void main(String args[]) {
        // Test Static Variable
        Share s1 = new Share(4, 4);
        System.out.println(s1.toString());
        Share s2 = new Share(8, 2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        
        // Test Static Method
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                CounterMachine.count();
            }
        }
        System.out.println("Counter: " + CounterMachine.counter);
    }
}