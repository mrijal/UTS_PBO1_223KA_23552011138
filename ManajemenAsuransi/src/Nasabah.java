class Nasabah {
    private String nama;
    private String alamat;
    private JenisAsuransi asuransi;
    private String noPolis;

    public Nasabah(String nama, String alamat, String noPolis) {
        this.nama = nama;
        this.alamat = alamat;
        this.noPolis = noPolis;
    }

    public void pilihAsuransi(JenisAsuransi asuransi) {
        this.asuransi = asuransi;
    }

    public void tampilkanPolis() {
        System.out.println("=== Detail Polis ===");
        System.out.println("No. Polis: " + noPolis);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        if (asuransi != null) {
            System.out.println(asuransi.getDetail());
        } else {
            System.out.println("Belum memilih jenis asuransi.");
        }
    }

    public String getNoPolis() {
        return noPolis;
    }

    public void ajukanKlaim(double nilaiKlaim) {
        if (asuransi != null) {
            asuransi.klaim(nilaiKlaim);
        } else {
            System.out.println("Anda belum memiliki polis untuk mengajukan klaim.");
        }
    }

    public JenisAsuransi getJenisAsuransi() {
        return asuransi;
    }
}