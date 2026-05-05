public class DemoUncheckedException {
    public static void main(String[] args) {
        System.out.println("Demo RuntimeException (ArrayIndexOutOfBounds)");

        int[] arr = new int[1];

        // tanpa try-catch (sesuai konsep: tidak wajib ditangani)
        System.out.println("Mengakses index ke-1...");
        System.out.println(arr[1]); // akan error

        // baris ini tidak akan dieksekusi
        System.out.println("Selesai");
    }
}