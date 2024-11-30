class AsuransiKesehatan extends JenisAsuransi implements LayananAsuransi {
    private double plafon6Bulan;

    public AsuransiKesehatan(String namaProduk, String paket, double premi, double totalKlaim, double plafon6Bulan) {
        super(namaProduk, paket, premi, totalKlaim);
        this.plafon6Bulan = plafon6Bulan;
    }

    @Override
    public double hitungLimitKlaim() {
        return totalKlaim;
    }

    @Override
    public void daftarPolis() {
        System.out.println("Polis untuk Asuransi Kesehatan telah terdaftar.");
    }

    @Override
    public void klaim(double nilaiKlaim) {
        if (nilaiKlaim <= plafon6Bulan) {
            plafon6Bulan -= nilaiKlaim;
            System.out.println("Klaim kesehatan sebesar " + nilaiKlaim + " disetujui.");
            System.out.println("Sisa plafon klaim 6 bulan: " + plafon6Bulan);
        } else {
            System.out.println("Klaim kesehatan ditolak. Nilai klaim melebihi plafon klaim 6 bulan.");
        }
    }

    public static double hitungPremi(int usia, int paketPilihan) {
        double basePremi = paketPilihan == 1 ? 300000 : 600000;
        double faktorUsia = usia > 40 ? 1.2 : 1.0; // Premi naik 20% untuk usia > 40
        return basePremi * faktorUsia;
    }
}