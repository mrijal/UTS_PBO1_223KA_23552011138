abstract class JenisAsuransi {
    protected String namaProduk;
    protected double premi;
    protected String paket;
    protected double totalKlaim;

    public JenisAsuransi(String namaProduk, String paket, double premi, double totalKlaim) {
        this.namaProduk = namaProduk;
        this.paket = paket;
        this.premi = premi;
        this.totalKlaim = totalKlaim;
    }

    public abstract double hitungLimitKlaim();

    public String getDetail() {
        return String.format("Produk: %s\nPaket: %s\nPremi: %.2f\nLimit Klaim: %.2f\n",
                namaProduk, paket, premi, hitungLimitKlaim());
    }

    public abstract void klaim(double nilaiKlaim);
}