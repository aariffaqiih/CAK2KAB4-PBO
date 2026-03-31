// menurutku, class itu ibaratnya kaya tabel, dan atribut nya itu adalah kolom, jadi class itu untuk meletakkan data, dan data nya sesuai dengan template yang sudah di class
class Mahasiswa {
    // ada 2 atribut yaitu nama dan nim, nama dan nim pake tipe data string
    String nama;
    String nim;

    // ini namanya method, ibaratnya method itu hal yang bisa dia lakuin, misalnya ini, class ini bisa melakukan hal yaitu Haimahasiswa, perliku ini adalah menyapa mahasiswa
    void Haimahasiswa() {
        System.out.println("Hai, nama saya " + nama + " dengan NIM " + nim);
    }
}

// ini namanya class utama, nama class nya sama persis sama nama file nya, jadi class ini adalah class yang akan dijalankan oleh program ini
public class TestPBO {
    public static void main(String[] args) {
        // tadi aku bilang bahwa class itu ibarat tabel, nah ini adalah isi tabel yang bakal mengisi atribut-atribut di class Mahasiswa
        // di sini ada 4 hal, yaitu Mahasiswa, mhs1, new, dan Mahasiswa(), arti dari masing-masing komponen ini adalah:
        // 1. Mahasiswa: ini adalah nama class atau tabel yang tadi dibuat di awal
        // 2. mhs1: ini adalah nama objek yang nanti datanya akan mengisi atribut-atribut di class Mahasiswa, ibaratnya kode mhs1 ini kaya primary key di setiap baris
        // 3. new: ini adalah keyword (keyword bawaan java) yang gunanya untuk membuat objek baru
        // 4. Mahasiswa(): ini adlah constructor, constructor itu gampangnya buat menginisialisasi objek yang udah dibuat tadi pake keyword new
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        // tadi kita sudah buat objek mhs1, nah ini adalah cara untuk mengisi data nama dari objek mhs1 tadi
        // formatnnya adalah kode objek + panggil atribut nya
        // jadi, obbjek mhs1 kemudian dipisah dengan . untuk memanggil atributnya, kemudian atribut nama, setelah itu tinggal = dan isi namanya
        mhs1.nama = "Bahlil";
        // ini untuk isi data nim
        mhs1.nim = "12345";

        // setelah tadi mengisi data, sekarang tinggal ditampilin, ini yang ditampilin adalah method atau perilaku Haimahasiswa
        mhs1.Haimahasiswa();
        mhs2.Haimahasiswa();
    }
}
