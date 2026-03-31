class Mahasiswa {
    String nama;
    String nim;

    void setNamaMahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void getNamaMahasiswa() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNamaMahasiswa("Bahlil", "12345");
        m.getNamaMahasiswa();
    }
}