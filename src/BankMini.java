import java.util.Scanner;

public class BankMini {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create one Rekening object
        Rekening rekening =
                new Rekening("001", "Ani", 100000);

        System.out.println("============ BANK MINI ============");

        rekening.cetakInfo();

        int pilihan;

    }
}