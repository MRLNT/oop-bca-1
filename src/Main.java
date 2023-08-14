import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== PROGRAM MENGHITUNG BANGUN ===");
            System.out.println("1. Persegi & Kubus");
            System.out.println("2. Lingkaran & Bola");
            System.out.println("3. Persegi Panjang & Balok");
            System.out.println("0. Keluar");
            System.out.print("Input pilihan Anda: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih!");
                break;
            }

            InterfaceBangunDatar bangunDatar = null;
            InterfaceBangunRuang bangunRuang = null;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisiPersegi = scanner.nextDouble();
                    bangunDatar = new Persegi(sisiPersegi);
                    bangunRuang = new Kubus(sisiPersegi);
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = scanner.nextDouble();
                    bangunDatar = new Lingkaran(jariJari);
                    bangunRuang = new Bola(jariJari);
                    break;
                case 3:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebar = scanner.nextDouble();
                    bangunDatar = new PersegiPanjang(panjang, lebar);
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    bangunRuang = new Balok(panjang, lebar, tinggiBalok);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            if (bangunDatar != null && bangunRuang != null) {
                System.out.println(bangunDatar.karakteristikBangun());
                bangunDatar.menggambarBangun();
                System.out.println("Keliling: " + bangunDatar.getKeliling());
                System.out.println("Luas: " + bangunDatar.getLuas());
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
