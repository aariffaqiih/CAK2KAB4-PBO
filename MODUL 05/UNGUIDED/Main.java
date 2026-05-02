public class Main {
    public static void main(String[] args) {
        Fakultas fakultasTeknik = new Fakultas("FIF", "Informatika", "Elon Musk", "Rektorat");

        Prodi informatika = new Prodi("IF", "Informatika", "S1", 2020);
        Prodi dataScience = new Prodi("DS", "Data Science", "S1", 2022);

        fakultasTeknik.tambahProdi(informatika);
        fakultasTeknik.tambahProdi(dataScience);

        Dosen dosen1 = new Dosen("103112430182", "Aarif", "DKA", "aarif@tup.ac.id");
        Dosen dosen2 = new Dosen("103112430182", "Rahmaan", "IMK", "rahmaan@tup.ac.id");
        Dosen dosen3 = new Dosen("103112430182", "Faqiih", "PBO", "faqiih@tup.ac.id");

        informatika.tambahDosen(dosen1);
        informatika.tambahDosen(dosen2);
        // ini saya sengaja ya dosen yang ke 3 ga dibuat biar keliatan data yang tidak terdaftar

        System.out.println("\n---------- DATA FAKULTAS ----------");
        System.out.println(fakultasTeknik.getInfoFakultas());
        fakultasTeknik.tampilkanDaftarProdi();

        System.out.println("\n---------- DATA PRODI ----------");
        System.out.println(informatika.getInfoProdi());
        informatika.tampilkanDaftarDosen();

        System.out.println("\n---------- DATA DOSEN ----------");
        System.out.println(dosen1.getInfoDosen());
        System.out.println(dosen2.getInfoDosen());
        System.out.println(dosen3.getInfoDosen());

        System.out.println("\n---------- AKTIVITAS MENGAJAR ----------");
        dosen1.mengajar();
        dosen2.mengajar();
        dosen3.mengajar();
        System.out.println("\n");
    }
}
