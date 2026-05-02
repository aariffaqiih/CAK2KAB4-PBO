import java.util.ArrayList;

public class Fakultas {
    private final String kodeFakultas;
    private final String namaFakultas;
    private final String namaDekan;
    private final String gedung;
    private final ArrayList<Prodi> daftarProdi;

    public Fakultas(String kodeFakultas, String namaFakultas, String namaDekan, String gedung) {
        this.kodeFakultas = kodeFakultas;
        this.namaFakultas = namaFakultas;
        this.namaDekan = namaDekan;
        this.gedung = gedung;
        this.daftarProdi = new ArrayList<>();
    }

    public void tambahProdi(Prodi prodi) {
        daftarProdi.add(prodi);
    }

    public void hapusProdi(Prodi prodi) {
        daftarProdi.remove(prodi);
    }

    public void tampilkanDaftarProdi() {
        System.out.println("\nDaftar prodi di Fakultas " + namaFakultas + ":");
        if (daftarProdi.isEmpty()) {
            System.out.println("Belum ada prodi\n");
            return;
        }

        for (Prodi prodi : daftarProdi) {
            System.out.println("- " + prodi.getNamaProdi() + " (" + prodi.getKodeProdi() + ")");
        }
    }

    public String getInfoFakultas() {
        return "\nKode Fakultas : " + kodeFakultas + "\n" +
               "Nama Fakultas : " + namaFakultas + "\n" +
               "Dekan         : " + namaDekan + "\n" +
               "Gedung        : " + gedung + "\n" +
               "Jumlah Prodi  : " + daftarProdi.size();
    }
}
