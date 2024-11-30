class AsuransiJiwa extends JenisAsuransi implements LayananAsuransi {
    public AsuransiJiwa(String namaProduk, String paket, double premi, double totalKlaim) {
        super(namaProduk, paket, premi, totalKlaim);
    }

    @Override
    public double hitungLimitKlaim() {
        return totalKlaim;
    }

    @Override
    public void daftarPolis() {
        System.out.println("Polis untuk Asuransi Jiwa telah terdaftar.");
    }

    @Override
    public void klaim(double nilaiKlaim) {
        if (nilaiKlaim <= totalKlaim) {
            System.out.println("Klaim jiwa sebesar " + totalKlaim + " disetujui.");
            System.out.println();
        } else {
            System.out.println("Klaim jiwa ditolak. Nilai klaim melebihi total klaim.");
        }
    }

    public static double hitungPremi(int usia, int paketPilihan) {
        double basePremi = paketPilihan == 1 ? 400000 : 800000;
        double faktorUsia = usia > 50 ? 1.3 : 1.0; // Premi naik 30% untuk usia > 50
        return basePremi * faktorUsia;
    }
}