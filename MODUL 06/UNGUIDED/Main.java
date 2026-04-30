public class Main {
    public static void main(String[] args) {
        KaryawanTetap karyawanTetap = new KaryawanTetap("Andi Pratama", "KT001", 6000000, 1500000);
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak("Budi Santoso", "KK001", 4500000, 6, 500000);

        karyawanTetap.tampilInfo();
        System.out.println();
        karyawanKontrak.tampilInfo();
    }
}
