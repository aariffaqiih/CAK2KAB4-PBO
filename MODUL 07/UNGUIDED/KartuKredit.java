public class KartuKredit extends MetodePembayaran {
    private double limitKredit;

    public KartuKredit(double limitKredit) {
        super("Kartu Kredit", 0);
        this.limitKredit = limitKredit;
    }

    @Override
    protected boolean validasiPembayaran(double jumlah) {
        return (saldo + jumlah) <= limitKredit;
    }

    @Override
    protected void prosesPembayaran(double jumlah) {
        saldo += jumlah;
    }

    @Override
    public double cekSaldo() {
        return limitKredit - saldo;
    }
}
