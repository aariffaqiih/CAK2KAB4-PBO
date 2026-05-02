public class DompetDigital extends MetodePembayaran {
    public DompetDigital(double saldoAwal) {
        super("Dompet Digital", saldoAwal);
    }

    @Override
    protected boolean validasiPembayaran(double jumlah) {
        return saldo >= jumlah;
    }
}
