// ==========================================
// 11.4.2.2 Variabel
// ==========================================
var a;
console.log(a); // undefined

var nama = "Budi";
console.log(nama); // Budi

nama = "Anton";
console.log(nama); // Anton

nama = 1;
console.log(nama); // 1

// ==========================================
// 11.4.2.3 Array
// ==========================================
var data = ["satu", 2, true];
console.log(data); // ["satu", 2, true]

var arr2 = [
  ["satu", "dua"],
  ["tiga", "empat"],
];
console.log(arr2);

console.log(data[2]); // true
console.log(arr2[0][1]); // "dua"
console.log(data[10]); // undefined

var data = ["a", "b", "c"];
console.log(data.length); // 3

console.log(data.push("d")); // 4
console.log(data); // ["a", "b", "c", "d"]

console.log(data.pop()); // "d"
console.log(data); // ["a", "b", "c"]

// ==========================================
// 11.4.2.4 Pengendalian Struktur
// ==========================================
var gelar;
var pendidikan = "S2";

if (pendidikan === "S1") {
  gelar = "Sarjana";
} else if (pendidikan === "S2") {
  gelar = "Master";
} else if (pendidikan === "S3") {
  gelar = "Doktor";
} else {
  gelar = "Tidak Diketahui";
}

console.log(gelar); // Master

// while (true) {
//   console.log("Loop tanpa akhir");
// }

// Contoh do while
function get_input() {
  return "valid";
}

function inputIsNotValid(input) {
  return false;
}

var input;

do {
  input = get_input();
  console.log(input);
} while (inputIsNotValid(input));

// Contoh for
for (var i = 0; i < 5; i++) {
  console.log("Perulangan ke-" + i);
}

// ==========================================
// 11.4.3.1 Pembuatan Object pada Javascript
// ==========================================
var objek_kosong = {};
console.log(objek_kosong);

var mobil = {
  "warna-badan": "merah",
  "nomor-polisi": "BK1234AB",
};

console.log(mobil);

var jadwal = {
  platform: 34,
  telah_berangkat: false,
  tujuan: "Medan",
  asal: "Jakarta",
};

console.log(jadwal);

var jadwal = {
  platform: 34,
  telah_berangkat: false,
  asal: {
    kode_kota: "MDN",
    nama_kota: "Medan",
    waktu: "2013-12-29 14:00",
  },
  tujuan: {
    kode_kota: "JKT",
    nama_kota: "Jakarta",
    waktu: "2013-12-29 17.30",
  },
};

console.log(jadwal);

// ==========================================
// 11.4.3.2 Akses Nilai Property
// ==========================================
console.log(mobil["warna-badan"]); // merah
console.log(jadwal.platform); // 34
console.log(jadwal.nomor_kursi); // undefined
console.log(mobil["jumlah-roda"]); // undefined

mobil["jumlah-roda"] = 4;
console.log(mobil["jumlah-roda"]); // 4

mobil.bahan_bakar = "Bensin";
console.log(mobil.bahan_bakar); // Bensin

console.log(mobil);

// ==========================================
// 11.4.3.3 Prototype pada Javascript
// ==========================================
var mobil = {
  nama: "Mobil",
  jumlahBan: 4,
};

console.log(mobil);

var truk = Object.create(mobil);

console.log(truk.nama); // Mobil
console.log(truk.jumlahBan); // 4

// ==========================================
// 11.4.4.1 Pembuatan Fungsi pada Javascript
// ==========================================
function tambah(a, b) {
  hasil = a + b;
  return hasil;
}

console.log(tambah(3, 5)); // 8

var tambah = function (a, b) {
  hasil = a + b;
  return hasil;
};

console.log(tambah(10, 2)); // 12

// ==========================================
// 11.4.4.2 Pemanggilan Fungsi
// ==========================================
var tambah = function (a, b) {
  hasil = a + b;
  return hasil;
};

console.log(tambah(3, 5)); // 8

var simpan = tambah(3, 5);
console.log(simpan); // 8

console.log(tambah(simpan, 2)); // 10
console.log(tambah(tambah(3, 5), 2)); // 10
console.log(tambah(tambah(2, 3), 4)); // 9

var naikkan = function (n) {
  var hasil = n + 10;
  return hasil;

  hasil = hasil * 100;
};

console.log(naikkan(10)); // 20
console.log(naikkan(25)); // 35

var naikkan = function (n) {
  return n + 10;
};

var tambah = function (a, b) {
  return a + b;
};

console.log(tambah(4, 4)); // 8
console.log(naikkan(10)); // 20
console.log(tambah(naikkan(5), 7)); // 22
