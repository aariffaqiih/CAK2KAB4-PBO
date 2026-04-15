public class Mahasiswa {
    private String NIM, Nama;

    public Mahasiswa(String no, String nm) {
        this.NIM = no;
        this.Nama = nm;
    }

    public String GetNIM() {
        return (NIM);
    }

    public String GetNama() {
        return (Nama);
    }
}