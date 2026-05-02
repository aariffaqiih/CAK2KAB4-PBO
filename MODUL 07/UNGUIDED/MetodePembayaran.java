import java.util.ArrayList;
import java.util.List;

public abstract class MetodePembayaran implements Pembayaran {
    protected String namaMetode;
    protected double saldo;
    protected List<String> riwayatTransaksi;

    public MetodePembayaran(String namaMetode, double saldoAwal) {
        this.namaMetode = namaMetode;
        this.saldo = saldoAwal;
        this.riwayatTransaksi = new ArrayList<>();
    }

    protected abstract boolean validasiPembayaran(double jumlah);

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
                ", saldo sekarang Rp" + String.format("%,.0f", saldo)
            );
            return true;
        }

        riwayatTransaksi.add(
            "GAGAL - Bayar Rp" + String.format("%,.0f", jumlah) +
            ", saldo/tagihan tidak memenuhi aturan"
        );
        return false;
    }

    protected void prosesPembayaran(double jumlah) {
        saldo -= jumlah;
    }

    @Override
    public double cekSaldo() {
        return saldo;
    }

    @Override
    public void getRiwayat() {
        System.out.println("Riwayat " + namaMetode + ":");
        if (riwayatTransaksi.isEmpty()) {
            System.out.println("- Belum ada transaksi");
            return;
        }

        for (int i = 0; i < riwayatTransaksi.size(); i++) {
            System.out.println((i + 1) + ". " + riwayatTransaksi.get(i));
        }
    }
}
