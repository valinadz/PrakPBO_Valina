public class TestKoperasi23 {
    public static void main(String[] args) {
        Anggota23 anggota1 = new Anggota23("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Limit Pinjaman: " + formatRupiah(anggota1.getLimitPinjaman()));

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + formatRupiah(anggota1.getJumlahPinjaman()));

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + formatRupiah(anggota1.getJumlahPinjaman()));

        System.out.println("\nMembayar angsuran 500.000");
        anggota1.angsur(500000); // This should trigger the minimal angsuran check
        System.out.println("Jumlah pinjaman saat ini: " + formatRupiah(anggota1.getJumlahPinjaman()));

        System.out.println("\nMembayar angsuran 1.000.000");
        anggota1.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + formatRupiah(anggota1.getJumlahPinjaman()));
    }

    // Helper method to format currency
    private static String formatRupiah(int amount) {
        return String.format("Rp %,d", amount);
    }
}