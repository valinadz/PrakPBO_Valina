public class Anggota23 {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // Constructor
    public Anggota23(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; // Initial amount of loan is 0
    }

    // Getter for nomorKTP
    public String getNomorKTP() {
        return nomorKTP;
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Getter for limitPinjaman
    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    // Getter for jumlahPinjaman
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method for borrowing money
    public void pinjam(int jumlah) {
        if (jumlah > 0) {
            if (jumlahPinjaman + jumlah <= limitPinjaman) {
                jumlahPinjaman += jumlah;
                System.out.println("Pinjaman berhasil sebesar " + formatRupiah(jumlah));
            } else {
                System.out.println("Pinjaman melebihi limit peminjaman.");
            }
        } else {
            System.out.println("Jumlah pinjaman harus lebih dari 0.");
        }
    }

    // Method for repaying the loan
    public void angsur(int jumlah) {
        if (jumlah > 0) {
            double minimalAngsuran = 0.10 * jumlahPinjaman; // 10% dari jumlah pinjaman saat ini
            if (jumlah >= minimalAngsuran) {
                if (jumlahPinjaman - jumlah >= 0) {
                    jumlahPinjaman -= jumlah;
                    System.out.println("Angsuran berhasil sebesar " + formatRupiah(jumlah));
                } else {
                    System.out.println("Jumlah angsuran melebihi jumlah pinjaman.");
                }
            } else {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
            }
        } else {
            System.out.println("Jumlah angsuran harus lebih dari 0.");
        }
    }

    // Helper method to format currency
    private String formatRupiah(int amount) {
        return String.format("Rp %,d", amount);
    }
}