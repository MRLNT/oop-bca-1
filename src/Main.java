import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== PROGRAM MENGHITUNG BANGUN ===");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Kubus");
            System.out.println("5. Tabung");
            System.out.println("6. Balok");
            System.out.println("0. Keluar");
            System.out.print("Input pilihan Anda: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih!");
                break;
            }
            //constructornya
            //InterfaceBangunDatar bangunDatar = new Persegi(sisiPersegi);
            InterfaceBangunDatar bangunDatar = null;
            InterfaceBangunRuang bangunRuang = null;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisiPersegi = scanner.nextDouble();
                    bangunDatar = new Persegi(sisiPersegi);
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = scanner.nextDouble();
                    bangunDatar = new Lingkaran(jariJari);
                    break;
                case 3:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebar = scanner.nextDouble();
                    bangunDatar = new PersegiPanjang(panjang, lebar);
                    break;
                case 4:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisiKubus = scanner.nextDouble();
                    bangunDatar = new Persegi(sisiKubus);
                    bangunRuang = new Kubus(sisiKubus);
                    break;
                case 5:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJarii = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabungg = scanner.nextDouble();
                    bangunDatar = new Lingkaran(jariJarii);
                    bangunRuang = new Tabung(jariJarii, tinggiTabungg);
                    break;
                case 6:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangg = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarr = scanner.nextDouble();
                    bangunDatar = new PersegiPanjang(panjangg, lebarr);
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    bangunRuang = new Balok(panjangg, lebarr, tinggiBalok);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            if (pilihan>=1 && pilihan <=3) {
                System.out.println(bangunDatar.karakteristikBangun());
                bangunDatar.menggambarBangun();
                System.out.println("Keliling: " + bangunDatar.getKeliling());
                System.out.println("Luas: " + bangunDatar.getLuas());
            }
            if (pilihan>=4 && pilihan <=6) {
                System.out.println(bangunDatar.karakteristikBangun());
                bangunDatar.menggambarBangun();
                System.out.println("Bangun ini memiliki Volume: " + bangunRuang.getVolume());
            }

            System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
            String lanjut = scanner.next();
            if (!lanjut.equalsIgnoreCase("ya")) {
                System.out.println("Terima kasih!");
                break;
            }
        }

        scanner.close();
    }
}
