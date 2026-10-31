
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Rekening {

    // Private fields
    private String nomor;
    private String pemilik;
    private int saldo;

    // Constructor
    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    // Read-only method
    public int getSaldo() {
        return saldo;
    }

    // Deposit method
    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }

        saldo += jumlah;
        return true;
    }

    // Withdraw method
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }

        saldo -= jumlah;
        return true;
    }

    // Private method to format rupiah
    private String formatRupiah(int jumlah) {
        DecimalFormatSymbols simbol =
                new DecimalFormatSymbols();

        simbol.setGroupingSeparator('.');

        DecimalFormat format =
                new DecimalFormat("#,##0", simbol);

        return "Rp" + format.format(jumlah);
    }

    // Display account information
    public void cetakInfo() {
        System.out.printf(
                "%s | %-5s | %s%n",
                nomor,
                pemilik,
                formatRupiah(saldo)
        );
    }
}
