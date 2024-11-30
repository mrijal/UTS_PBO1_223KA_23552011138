import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array List untuk menyimpan data nasabah dan produk asuransi yang dipilih
        // beserta detailnya
        ArrayList<Nasabah> listNasabah = new ArrayList<>();

        // Menu CLI :
        // 1. Daftar Asuransi
        // 2. Registrasi Polis
        // 3. Klaim Polis
        // 4. Keluar

        // Code :

        boolean isRunning = true;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Daftar Asuransi");
            System.out.println("2. Registrasi Polis");
            System.out.println("3. Klaim Polis");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");

            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    // Daftar Asuransi
                    System.out.println("\nDaftar Asuransi:");
                    System.out.println("1. Asuransi Kesehatan");
                    System.out.println("2. Asuransi Jiwa");
                    System.out.println(" =============== ");
                    System.out.println("");
                    break;
                case "2":
                    // Registrasi Nasabah
                    System.out.print("Masukkan nama nasabah: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan alamat nasabah: ");
                    String alamat = scanner.nextLine();

                    // Generate no polis POLIS-(urutan pada listNasabah 4 digit)
                    String noPolis = "POLIS-" + String.format("%04d", listNasabah.size() + 1);

                    Nasabah nasabah = new Nasabah(nama, alamat, noPolis);

                    // Memilih jenis asuransi
                    System.out.println("\nPilih jenis asuransi:");
                    System.out.println("1. Asuransi Kesehatan");
                    System.out.println("2. Asuransi Jiwa");
                    System.out.print("Pilihan Anda: ");
                    int pilihan = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character

                    System.out.print("Masukkan usia nasabah: ");
                    int usia = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character

                    if (pilihan == 1) {
                        // Memilih paket asuransi kesehatan
                        System.out.println("\nPilih paket Asuransi Kesehatan:");
                        System.out.println("1. Basic (Limit Klaim: 10000000, Plafon 6 Bulan: 5000000)");
                        System.out.println("2. Premium (Limit Klaim: 20000000, Plafon 6 Bulan: 10000000)");
                        System.out.print("Pilihan Paket: ");
                        int paketPilihan = scanner.nextInt();
                        scanner.nextLine(); // Clear the newline character

                        double premi = AsuransiKesehatan.hitungPremi(usia, paketPilihan);

                        if (paketPilihan == 1) {
                            nasabah.pilihAsuransi(
                                    new AsuransiKesehatan("Asuransi Kesehatan", "Basic", premi, 10000000, 5000000));
                        } else if (paketPilihan == 2) {
                            nasabah.pilihAsuransi(
                                    new AsuransiKesehatan("Asuransi Kesehatan", "Premium", premi, 20000000, 10000000));
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    } else if (pilihan == 2) {
                        // Memilih paket asuransi jiwa
                        System.out.println("\nPilih paket Asuransi Jiwa:");
                        System.out.println("1. Basic (Limit Klaim: 15000000)");
                        System.out.println("2. Premium (Limit Klaim: 30000000)");
                        System.out.print("Pilihan Paket: ");
                        int paketPilihan = scanner.nextInt();
                        scanner.nextLine(); // Clear the newline character

                        double premi = AsuransiJiwa.hitungPremi(usia, paketPilihan);

                        if (paketPilihan == 1) {
                            nasabah.pilihAsuransi(new AsuransiJiwa("Asuransi Jiwa", "Basic", premi, 15000000));
                        } else if (paketPilihan == 2) {
                            nasabah.pilihAsuransi(new AsuransiJiwa("Asuransi Jiwa", "Premium", premi, 30000000));
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }

                    System.out.println("  ");

                    // Menampilkan detail polis
                    nasabah.tampilkanPolis();

                    // Save nasabah to list
                    listNasabah.add(nasabah);

                    break;

                case "3":
                    // Masukkan No Polis
                    System.out.print("Masukkan No. Polis: ");
                    String noPolisKlaim = scanner.nextLine();

                    // Cari nasabah dengan no polis yang sesuai
                    Nasabah nasabahKlaim = null;
                    for (Nasabah n : listNasabah) {
                        if (n.getNoPolis().equals(noPolisKlaim)) {
                            nasabahKlaim = n;
                            break;
                        }
                    }

                    if (nasabahKlaim != null) {
                        // if nasabah JIWA, klaim sesuai total klaim
                        // if nasabah KESEHATAN, klaim sesuai plafon 6 bulan

                        double nilaiKlaim = 0;

                        if (nasabahKlaim.getJenisAsuransi() instanceof AsuransiKesehatan) {
                            System.out.print("Masukkan nilai klaim: ");
                            nilaiKlaim = scanner.nextDouble();
                            scanner.nextLine(); // Clear the newline character
                        }

                        System.out.println("");

                        nasabahKlaim.ajukanKlaim(nilaiKlaim);

                        System.out.println("============== ");
                        System.out.println("");

                    } else {
                        System.out.println("No. Polis tidak ditemukan.");
                        System.out.println("");
                    }
                    break;
                case "4":
                    isRunning = false;
                    break;

                default:
                    System.out.println("Menu tidak valid.");
                    System.out.println("");
                    break;
            }

        } while (isRunning);

        scanner.close();
    }
}
