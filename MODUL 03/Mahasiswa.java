// menurutku, class itu seperti cetakan
// jadi class itu digunakan sebagai template untuk membuat object
// atribut di dalam class itu adalah data yang nanti akan dimiliki oleh setiap object
class Mahasiswa {
    // ada 2 atribut yaitu nama dan nim, keduanya bertipe data String
    // atribut ini nanti akan menyimpan data untuk setiap object Mahasiswa
    String nama;
    String nim;

    // ini namanya method, method itu adalah perilaku / aksi yang bisa dilakukan oleh object
    // misalnya di sini, object Mahasiswa bisa melakukan aksi menyapa lewat method Haimahasiswa
    void Haimahasiswa() {
        System.out.println("Hai, nama saya " + nama + " dengan NIM " + nim);
    }
}

// ini adalah class utama (main class)
// class ini yang akan dijalankan pertama kali oleh program (karena ada method main)
// biasanya nama class ini sama dengan nama file
public class TestPBO {
    public static void main(String[] args) {
        // di sini kita membuat object dari class Mahasiswa
        // ada beberapa komponen penting:
        // 1. Mahasiswa = nama class (blueprint)
        // 2. mhs1 = nama variabel yang menyimpan object
        // 3. new = keyword untuk membuat object baru
        // 4. Mahasiswa() = constructor (di sini memakai default constructor dari Java)
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        // setelah object dibuat, kita bisa mengisi nilai atributnya
        // caranya: nama_object.nama_atribut = nilai;
        mhs1.nama = "Bahlil";   // mengisi atribut nama untuk object mhs1
        mhs1.nim = "12345";     // mengisi atribut nim untuk object mhs1

        // mhs2 belum diisi atributnya, jadi nilainya masih default (null)
        // setelah itu kita bisa menjalankan method dari object
        // method dipanggil dengan tanda titik
        mhs1.Haimahasiswa();  // akan menampilkan data dari mhs1
        mhs2.Haimahasiswa();  // karena belum diisi, akan menampilkan null
    }
}
