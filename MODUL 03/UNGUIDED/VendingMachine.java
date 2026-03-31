// SOAL CERITA
// Telkom University Purwokerto ingin membuat simulasi mesin penjual minuman otomatis, dimana setiap mesin menjual teh, kopi dan susu. Mesin memiliki beberapa jenis minuman dengan harga dan stok berbeda. Dengan kebutuhan system sebagai berikut:
// 1. Mesin dapat Menerima uang
// 2. Mesin dapat Memilih minuman
// 3. Mesin dapat Mengurangi stok
// 4. Mesin dapat Mengembalikan kembalian
// 5. Mesin dapat Menolak transaksi jika syarat tidak terpenuhi

// Spesifikasi Mesin
// Setiap vending machine memiliki:
// 1. kodeMesin
// 2. saldoMasuk (uang yang dimasukkan user)
// 3. stokTeh
// 4. stokKopi
// 5. stokSusu
// 6. hargaTeh
// 7. hargaKopi
// 8. hargaSusu
// 9. totalPenjualan

// Aturan Sistem
// 1. User harus memasukkan uang terlebih dahulu
// 2. Jika uang kurang → transaksi gagal
// 3. Jika stok habis → transaksi gagal
// 4. Jika transaksi berhasil:
//    a. stok berkurang 1
//    b. saldoMasuk sejumlah harga
//    c. totalPenjualan bertambah
//    d. Mesin mengembalikan kembalian
//    e. Jika tidak jadi beli → bisa membatalkan transaksi dan uang dikembalikan
//    f. Saldo tidak boleh negative

// TUGAS MAHASISWA
// 1. Buat 1 class bernama VendingMachine
// 2. Semua atribut harus private
// 3. Gunakan constructor dengan parameter
// 4. Buat method:
//    a. masukkanUang(double jumlah)
//    b. pilihMinuman(String jenis)
//    c. batalkanTransaksi()
//    d. tampilkanStatus()
// 5. Simulasikan di kelas main:
//    a. Masukkan uang
//    b. Pilih minuman
//    c. Coba beli saat stok habis
//    d. Coba beli dengan uang kurang
//    e. Batalkan transaksi

class VendingMachine {
    private static final String TEH = "teh";
    private static final String KOPI = "kopi";
    private static final String SUSU = "susu";

    private String kodeMesin;
    private double saldoMasuk;
    private int stokTeh;
    private int stokKopi;
    private int stokSusu;
    private double hargaTeh;
    private double hargaKopi;
    private double hargaSusu;
    private double totalPenjualan;

    public VendingMachine(
        String kodeMesin,
        int stokTeh,
        int stokKopi,
        int stokSusu,
        double hargaTeh,
        double hargaKopi,
        double hargaSusu) {

        this.kodeMesin = kodeMesin;
        this.stokTeh = stokTeh;
        this.stokKopi = stokKopi;
        this.stokSusu = stokSusu;
        this.hargaTeh = hargaTeh;
        this.hargaKopi = hargaKopi;
        this.hargaSusu = hargaSusu;
        this.saldoMasuk = 0;
        this.totalPenjualan = 0;
    }

    public void masukkanUang(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Uang harus lebih dari 0");
            return;
        }

        saldoMasuk += jumlah;
        System.out.println("Uang masuk: " + jumlah);
    }

    public void pilihMinuman(String jenis) {
        if (jenis == null) {
            System.out.println("Masukkan jenis minuman dulu!");
            return;
        }

        jenis = jenis.trim().toLowerCase();

        double harga = getHarga(jenis);
        if (harga == -1) {
            System.out.println("Jenis minuman tidak valid!");
            return;
        }

        if (saldoMasuk <= 0) {
            System.out.println("Masukkan uang dulu!");
            return;
        }

        int stok = getStok(jenis);
        if (stok <= 0) {
            System.out.println("Stok habis!");
            return;
        }

        if (saldoMasuk < harga) {
            System.out.println("Uang kurang!");
            return;
        }

        kurangiStok(jenis);
        saldoMasuk -= harga;
        totalPenjualan += harga;

        double kembalian = saldoMasuk;
        saldoMasuk = 0;

        System.out.println("Berhasil membeli " + jenis);
        System.out.println("Kembalian: " + kembalian);
    }

    private double getHarga(String jenis) {
        switch (jenis) {
            case TEH:
                return hargaTeh;
            case KOPI:
                return hargaKopi;
            case SUSU:
                return hargaSusu;
            default:
                return -1;
        }
    }

    private int getStok(String jenis) {
        switch (jenis) {
            case TEH:
                return stokTeh;
            case KOPI:
                return stokKopi;
            case SUSU:
                return stokSusu;
            default:
                return -1;
        }
    }

    private void kurangiStok(String jenis) {
        switch (jenis) {
            case TEH:
                stokTeh--;
                break;
            case KOPI:
                stokKopi--;
                break;
            case SUSU:
                stokSusu--;
                break;
        }
    }

    public void batalkanTransaksi() {
        if (saldoMasuk <= 0) {
            System.out.println("Tidak ada transaksi");
            return;
        }

        double uang = saldoMasuk;
        saldoMasuk = 0;

        System.out.println("Transaksi dibatalkan");
        System.out.println("Uang kembali: " + uang);
    }

    public void tampilkanStatus() {
        System.out.println("Kode Mesin      : " + kodeMesin);
        System.out.println("Saldo Masuk     : " + saldoMasuk);
        System.out.println("Stok Teh        : " + stokTeh);
        System.out.println("Stok Kopi       : " + stokKopi);
        System.out.println("Stok Susu       : " + stokSusu);
        System.out.println("Total Penjualan : " + totalPenjualan);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine("TUP_VM_1", 1, 1, 1, 3000, 5000, 7000);

        System.out.println("\nSimulasi Vending Machine TUP\n");
        vm.tampilkanStatus();

        System.out.println("Membeli teh");
        vm.masukkanUang(10000);
        vm.pilihMinuman("teh");
        vm.tampilkanStatus();

        System.out.println("Stok teh habis");
        vm.masukkanUang(5000);
        vm.pilihMinuman("teh");
        vm.batalkanTransaksi();
        vm.tampilkanStatus();

        System.out.println("Uang kurang");
        vm.masukkanUang(1000);
        vm.pilihMinuman("kopi");
        vm.tampilkanStatus();

        System.out.println("Membeli kopi");
        vm.masukkanUang(5000);
        vm.pilihMinuman("kopi");
        vm.tampilkanStatus();

        System.out.println("Membeli susu");
        vm.masukkanUang(10000);
        vm.pilihMinuman("susu");
        vm.tampilkanStatus();

        System.out.println("Membatalkan transaksi");
        vm.masukkanUang(5000);
        vm.batalkanTransaksi();
        vm.tampilkanStatus();

        System.out.println("Minuman tidak valid");
        vm.masukkanUang(5000);
        vm.pilihMinuman("matcha");
        vm.batalkanTransaksi();
        vm.tampilkanStatus();
    }
}
