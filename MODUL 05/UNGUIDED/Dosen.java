public class Dosen {
    private final String nidn;
    private final String nama;
    private final String mataKuliah;
    private final String email;
    private Prodi prodi;

    public Dosen(String nidn, String nama, String mataKuliah, String email) {
        this.nidn = nidn;
        this.nama = nama;
        this.mataKuliah = mataKuliah;
        this.email = email;
        this.prodi = null;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public Prodi getProdi() {
        return prodi;
    }

    public String getNama() {
        return nama;
    }

    public String getNidn() {
        return nidn;
    }

    public void mengajar() {
        if (prodi != null) {
            System.out.println("\nDosen " + nama + " mengajar " + mataKuliah);
            System.out.println("Prodi: " + prodi.getNamaProdi());
        } else {
            System.out.println("\nDosen " + nama + " mengajar " + mataKuliah);
            System.out.println("Tapi belum terdaftar di prodi");
        }
    }

    public String getInfoDosen() {
        String namaProdi = (prodi != null) ? prodi.getNamaProdi() : "Belum ada";
        return "\nNIDN        : " + nidn + "\n" +
               "Nama        : " + nama + "\n" +
               "Mata Kuliah : " + mataKuliah + "\n" +
               "Email       : " + email + "\n" +
               "Prodi       : " + namaProdi;
    }
}
