class ContohLagu {
    private String pencipta;
    private String judul;

    public void param(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void print() {
        if (judul == null && pencipta == null) return;
        System.out.println("Judul    : " + judul + "\nPencipta : " + pencipta);
    }
}

class Lagu {
    public static void main(String[] args) {
        ContohLagu a = new ContohLagu();
        a.param("Judul 1", "Pencipta 1");
        a.print();
    }
}