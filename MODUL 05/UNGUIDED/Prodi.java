import java.util.ArrayList;

public class Prodi {
    private final String kodeProdi;
    private final String namaProdi;
    private final String jenjang;
    private final int tahunBerdiri;
    private final ArrayList<Dosen> daftarDosen;

    public Prodi(String kodeProdi, String namaProdi, String jenjang, int tahunBerdiri) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
        this.jenjang = jenjang;
        this.tahunBerdiri = tahunBerdiri;
        this.daftarDosen = new ArrayList<>();
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public String getKodeProdi() {
        return kodeProdi;
    }

    public void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
        dosen.setProdi(this);
    }

    public void hapusDosen(Dosen dosen) {
        if (daftarDosen.remove(dosen)) {
            dosen.setProdi(null);
        }
    }

    public void tampilkanDaftarDosen() {
        System.out.println("\nDaftar dosen Prodi " + namaProdi + ":");
        if (daftarDosen.isEmpty()) {
            System.out.println("Belum ada dosen terdaftar\n");
            return;
        }

        for (Dosen dosen : daftarDosen) {
            System.out.println("- " + dosen.getNama() + " (" + dosen.getNidn() + ")");
        }
    }

    public String getInfoProdi() {
        return "\nKode Prodi    : " + kodeProdi + "\n" +
               "Nama Prodi    : " + namaProdi + "\n" +
               "Jenjang       : " + jenjang + "\n" +
               "Tahun Berdiri : " + tahunBerdiri + "\n" +
               "Jumlah Dosen  : " + daftarDosen.size();
    }
}
