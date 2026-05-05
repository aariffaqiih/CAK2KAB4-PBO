public class DemoTryCatch {
    public static void main(String[] args) {
        System.out.println("Demo Try-Catch");

        try {
            int[] arr = new int[1];
            System.out.println("Mengakses index ke-1...");
            System.out.println(arr[1]);

            System.out.println("Baris ini tidak akan dieksekusi...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi: indeks di luar kapasitas array");
            System.out.println("Detail error: " + e);
        }

        System.out.println("Sesudah blok try-catch");
    }
}