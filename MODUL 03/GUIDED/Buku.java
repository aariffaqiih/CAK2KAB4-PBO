public class Buku {
    private String pengarang;
    private String judul;

    private Buku() {
        this("Judul 1", "Pengarang 1");
    }

    private Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    private void Print() {
        System.out.println("Judul     : " + judul + "\nPengarang : " + pengarang);
    }

    public static void main(String[] args) {
        Buku a, b;

        a = new Buku("Judul 2", "Pengarang 2");
        b = new Buku();

        a.Print();
        b.Print();
    }
}
