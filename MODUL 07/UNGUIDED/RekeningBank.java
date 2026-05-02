public class RekeningBank extends MetodePembayaran {
    private static final double BIAYA_ADMIN = 2500;

    public RekeningBank(double saldoAwal) {
        super("Rekening Bank", saldoAwal);
    }

    @Override
    protected boolean validasiPembayaran(double jumlah) {
        return saldo >= (jumlah + BIAYA_ADMIN);
    }

    @Override
    protected void prosesPembayaran(double jumlah) {
        saldo -= (jumlah + BIAYA_ADMIN);
    }

    @Override
    public boolean bayar(double jumlah) {
        if (jumlah <= 0) {
            riwayatTransaksi.add("GAGAL - Nominal harus lebih dari 0");
            return false;
        }

        if (validasiPembayaran(jumlah)) {
            prosesPembayaran(jumlah);
            riwayatTransaksi.add(
                "SUKSES - Bayar Rp" + String.format("%,.0f", jumlah) +
                " + admin Rp" + String.format("%,.0f", BIAYA_ADMIN) +
                ", saldo sekarang Rp" + String.format("%,.0f", saldo)
            );
            return true;
        }

        riwayatTransaksi.add(
            "GAGAL - Bayar Rp" + String.format("%,.0f", jumlah) +
            " + admin Rp" + String.format("%,.0f", BIAYA_ADMIN) +
            ", saldo tidak cukup"
        );
        return false;
    }
}
