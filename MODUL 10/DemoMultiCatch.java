public class DemoMultiCatch {
    public static void main(String[] args) {
        System.out.println("Demo Multi Catch");

        try {
            int x = args.length;
            System.out.println("Jumlah parameter: " + x);

            int y = 100 / x; // bisa ArithmeticException

            int[] arr = {10, 11};
            y = arr[x]; // bisa ArrayIndexOutOfBoundsException

            System.out.println("Tidak terjadi eksepsi");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi eksepsi: pembagian dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi: indeks array di luar batas");
        }

        System.out.println("Setelah blok try-catch");
    }
}