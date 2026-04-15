public class Jurusan {
    private String KodeJurusan, NamaJurusan;
    private Mahasiswa[] Daftar = new Mahasiswa[10];

    public Jurusan(String kode, String nama) {
        this.KodeJurusan = kode;
        this.NamaJurusan = nama;
    }

    private static int JmlMhs = 0;

    public void AddMahasiswa(Mahasiswa m) {
        this.Daftar[JmlMhs] = m;
        this.JmlMhs++;
    }

    public void DisplayMahasiswa() {
        int i;
        System.out.println("Kode Jurusan : " + this.KodeJurusan);
        System.out.println("Nama Jurusan : " + this.NamaJurusan);
        System.out.println("Daftar Mahasiswa :");
        for (i = 0; i < JmlMhs; i++)
            System.out.println(Daftar[i].GetNIM() + " " + Daftar[i].GetNama());
    }
}