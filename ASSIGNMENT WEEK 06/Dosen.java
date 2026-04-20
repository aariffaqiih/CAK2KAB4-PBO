package com.pbo.tup.collection.crud;

public class Dosen {
    String nip;
    String nama;
    String prodi;
    int lamaMengajar;

    public Dosen(String nip, String nama, String prodi, int lamaMengajar) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        this.lamaMengajar = lamaMengajar;
    }

    public void tampil() {
        System.out.println("NIP: " + nip + " | Nama: " + nama + " | Prodi: " + prodi + " | Lama mengajar: " + lamaMengajar + " tahun");
    }
}