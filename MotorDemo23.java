public class MotorDemo23 {
    public static void main(String[] args) {
        Motor23 motor1 = new Motor23();
        motor1.displayInfo();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setIsMesinOn(true);  // Menyalakan mesin
        motor1.setKecepatan(-20);   // Kecepatan negatif, tidak akan diizinkan
        motor1.displayInfo();

        motor1.setKecepatan(80);    // Kecepatan di bawah 100, diizinkan
        motor1.displayInfo();

        Motor23 motor2 = new Motor23();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40);
        motor2.displayInfo();

        Motor23 motor3 = new Motor23();
        motor3.setPlatNomor("D 8343 cv");
        motor3.setKecepatan(60);
        motor3.displayInfo();
    }
}
