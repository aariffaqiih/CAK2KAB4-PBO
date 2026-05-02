public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("103112430182");
        m.setNama("Faqiih");

        Dosen d = new Dosen();
        d.giveScore(m, 90);

        System.out.println("\n");
        System.out.println("Nim   :" + m.getNim());
        System.out.println("Nama  :" + m.getNama());
        System.out.println("Nilai :" + d.getScore(m));
        System.out.println("\n");
    }
}
