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


        do {
            System.out.print(
                    "Menu (1 setor, 2 tarik, 3 info, 0 keluar): "
            );

            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.print("Jumlah: ");
                    int jumlahSetor = input.nextInt();

                    if (rekening.setor(jumlahSetor)) {
                        System.out.println("  Berhasil");
                    } else {
                        System.out.println("  Ditolak");
                    }
                    break;

                case 2:
                    System.out.print("Jumlah: ");
                    int jumlahTarik = input.nextInt();

                    if (rekening.tarik(jumlahTarik)) {
                        System.out.println("  Berhasil");
                    } else {
                        System.out.println("  Ditolak");
                    }
                    break;

            }

        } while (pilihan != 0);
    }
}