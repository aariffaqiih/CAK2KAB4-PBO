public class DemoFinally {
    public static void main(String[] args) {
        System.out.println("Demo Finally");

        int x = 3;
        int[] arr = {10, 11, 12};

        try {
            System.out.println("Mengakses array index ke-" + x);
            System.out.println(arr[x]); // error

            System.out.println("Tidak terjadi eksepsi");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi pada try");
            
            // sengaja menimbulkan error baru
            System.out.println("Mencoba akses index negatif...");
            System.out.println(arr[x - 4]);
        } finally {
            System.out.println("Blok finally tetap dijalankan");
        }

        // baris ini kemungkinan tidak tercapai jika error di catch
        System.out.println("Program selesai (akhir)");
    }
}