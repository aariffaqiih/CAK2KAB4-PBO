public class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Karyawan Tetap ===");
        System.out.println("Nama       : " + nama);
        System.out.println("NIP        : " + nip);
        System.out.println("Gaji Pokok : Rp" + String.format("%,.0f", gajiPokok));
        System.out.println("Tunjangan  : Rp" + String.format("%,.0f", tunjangan));
        System.out.println("Total Gaji : Rp" + String.format("%,.0f", hitungGaji()));
    }
}
