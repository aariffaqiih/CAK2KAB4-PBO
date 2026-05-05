public class Coba {
    public void tampil() throws Exception {
        int x = 0;

        System.out.println("Memeriksa nilai x...");

        if (x < 5) {
            throw new Exception("Nilai lebih kecil dari 5");
        }

        System.out.println("Nilai valid");
    }
}