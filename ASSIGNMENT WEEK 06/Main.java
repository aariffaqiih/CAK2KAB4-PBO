package com.pbo.tup.collection.crud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static ArrayList<Dosen> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Data awal
        list.add(new Dosen("103112430182", "Aarif", "Informatika", 2));
        list.add(new Dosen("103112430172", "Rahmaan", "Informatika", 4));
        list.add(new Dosen("103112430162", "Faqiih", "Data Science", 6));

        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Semua");
            System.out.println("2. Tambah");
            System.out.println("3. Cari by NIP");
            System.out.println("4. Update");
            System.out.println("5. Hapus");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan) {
                case 1 -> tampilSemua();
                case 2 -> tambah();
                case 3 -> cari();
                case 4 -> update();
                case 5 -> hapus();
                case 0 -> System.out.println("Sampai jumpa!");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    // CREATE
    static void tambah() {
        System.out.print("NIP           : "); String nip = sc.nextLine();
        System.out.print("Nama          : "); String nama = sc.nextLine();
        System.out.print("Prodi         : "); String prodi = sc.nextLine();
        System.out.print("Lama Mengajar : "); int lamaMengajar = Integer.parseInt(sc.nextLine());

        // Cek NIP duplikat
        for (Dosen d : list) {
            if (d.nip.equals(nip)) {
                System.out.println("NIP sudah ada!");
                return;
            }
        }

        list.add(new Dosen(nip, nama, prodi, lamaMengajar));
        System.out.println("Dosen berhasil ditambahkan!");
    }

    // READ - tampil semua
    static void tampilSemua() {
        if (list.isEmpty()) {
            System.out.println("Data kosong.");
            return;
        }
        System.out.println("\n--- Daftar Dosen ---");
        for (Dosen d : list) {
            d.tampil();
        }
    }

    // READ - cari by NIP
    static void cari() {
        System.out.print("Masukkan NIP: ");
        String nip = sc.nextLine();

        for (Dosen d : list) {
            if (d.nip.equals(nip)) {
                d.tampil();
                return;
            }
        }
        System.out.println("Dosen tidak ditemukan.");
    }

    // UPDATE
    static void update() {
        System.out.print("Masukkan NIP yang akan diupdate: ");
        String nip = sc.nextLine();

        for (Dosen d : list) {
            if (d.nip.equals(nip)) {
                System.out.print("Nama baru           : "); d.nama = sc.nextLine();
                System.out.print("Prodi baru          : "); d.prodi = sc.nextLine();
                System.out.print("Lama Mengajar baru  : "); d.lamaMengajar = Integer.parseInt(sc.nextLine());
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }
        System.out.println("Dosen tidak ditemukan.");
    }

    // DELETE
    static void hapus() {
        System.out.print("Masukkan NIP yang akan dihapus: ");
        String nip = sc.nextLine();

        Iterator<Dosen> iterator = list.iterator();
        while (iterator.hasNext()) {
            Dosen d = iterator.next();
            if (d.nip.equals(nip)) {
                iterator.remove();
                System.out.println("Dosen berhasil dihapus!");
                return;
            }
        }
        System.out.println("Dosen tidak ditemukan.");
    }
}