public class KaryawanKontrak extends Karyawan {
    private int durasiKontrak;
    private double bonusPerBulan;

    public KaryawanKontrak(String nama, String nip, double gajiPokok, int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (durasiKontrak * bonusPerBulan);
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Karyawan Kontrak ===");
        System.out.println("Nama            : " + nama);
        System.out.println("NIP             : " + nip);
        System.out.println("Gaji Pokok      : Rp" + String.format("%,.0f", gajiPokok));
        System.out.println("Durasi Kontrak  : " + durasiKontrak + " bulan");
        System.out.println("Bonus per Bulan : Rp" + String.format("%,.0f", bonusPerBulan));
        System.out.println("Total Gaji      : Rp" + String.format("%,.0f", hitungGaji()));
    }
}
