public class Main {
    public static void main(String[] args) {
        DompetDigital dompetDigital = new DompetDigital(500000);
        KartuKredit kartuKredit = new KartuKredit(3000000);
        RekeningBank rekeningBank = new RekeningBank(1000000);

        System.out.println("=== Simulasi Dompet Digital ===");
        dompetDigital.bayar(200000);
        dompetDigital.bayar(400000); // Gagal

        System.out.println("\n=== Simulasi Kartu Kredit ===");
        kartuKredit.bayar(1000000);
        kartuKredit.bayar(2500000); // Gagal (melebihi limit)

        System.out.println("\n=== Simulasi Rekening Bank ===");
        rekeningBank.bayar(300000);
        rekeningBank.bayar(800000); // Gagal (termasuk biaya admin)

        System.out.println("\n=== RIWAYAT SELURUH TRANSAKSI ===");
        dompetDigital.getRiwayat();
        System.out.println("Saldo Dompet Digital: Rp" + String.format("%,.0f", dompetDigital.cekSaldo()));

        System.out.println();
        kartuKredit.getRiwayat();
        System.out.println("Sisa Limit Kartu Kredit: Rp" + String.format("%,.0f", kartuKredit.cekSaldo()));

        System.out.println();
        rekeningBank.getRiwayat();
        System.out.println("Saldo Rekening Bank: Rp" + String.format("%,.0f", rekeningBank.cekSaldo()));
    }
}
