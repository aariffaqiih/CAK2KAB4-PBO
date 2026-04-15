public class Main {
    public static void main(String[] args) {
        Jurusan ti = new Jurusan("IF", "Teknik Informatika");
        ti.AddMahasiswa(new Mahasiswa("103112430182", "Aarif"));
        ti.AddMahasiswa(new Mahasiswa("103112430182", "Faqiih"));
        ti.DisplayMahasiswa();
    }
}
