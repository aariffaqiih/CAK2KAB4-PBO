public class Dosen {
    private String kodeDosen;
    private String namaDosen;

    // Setter
    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    // Getter
    public String getKodeDosen() {
        return this.kodeDosen;
    }

    public String getNamaDosen() {
        return this.namaDosen;
    }

    public void giveScore(Mahasiswa s, int nilai) {
        // ini asosiasi, method milik class Student dipanggil di class Dosen,
        // tp objek Student tidak menjadi atribut dr class Lecture
        s.setNilai(nilai);
    }

    public int getScore(Mahasiswa s) {
        // ini asosiasi, method milik class Student dipanggil di class Lecture,
        // tp objek Student tidak menjadi atribut dr class Lecture
        return s.getNilai();
    }
}