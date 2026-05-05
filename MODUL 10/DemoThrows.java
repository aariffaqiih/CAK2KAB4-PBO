public class DemoThrows {
    public static void main(String[] args) {
        System.out.println("Demo Throws");

        Coba c = new Coba();

        try {
            c.tampil();
        } catch (Exception e) {
            System.out.println("Exception ditangkap:");
            System.out.println(e.getMessage());
        }

        System.out.println("Program selesai");
    }
}