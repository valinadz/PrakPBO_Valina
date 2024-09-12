public class Motor23 {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;
    private final int KECEPATAN_MAKSIMAL = 100; // Batas kecepatan maksimal

    public void displayInfo() {
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Status Mesin: " + (this.isMesinOn ? "On" : "Off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("===========================");
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean getIsMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off.");
        } else if (kecepatan > KECEPATAN_MAKSIMAL) {
            System.out.println("Kecepatan tidak boleh lebih dari " + KECEPATAN_MAKSIMAL + " km/h.");
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif.");
        } else {
            this.kecepatan = kecepatan;
        }
    }
}