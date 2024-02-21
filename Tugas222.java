import java.util.Scanner;

public class Tugas222 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Kecepatan, Jarak, dan Waktu ===");
        System.out.println("Pilih rumus yang akan dihitung:");
        System.out.println("1. Rumus Kecepatan (v = s / t)");
        System.out.println("2. Rumus Jarak (s = v * t)");
        System.out.println("3. Rumus Waktu (t = s / v)");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }

    public static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Rumus Kecepatan (v = s / t) ===");
        System.out.print("Masukkan jarak (s) dalam meter: ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan waktu (t) dalam detik: ");
        double waktu = input.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v) = " + kecepatan + " m/s");

        input.close();
    }

    public static void hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Rumus Jarak (s = v * t) ===");
        System.out.print("Masukkan kecepatan (v) dalam m/s: ");
        double kecepatan = input.nextDouble();
        System.out.print("Masukkan waktu (t) dalam detik: ");
        double waktu = input.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak (s) = " + jarak + " meter");

        input.close();
    }

    public static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Rumus Waktu (t = s / v) ===");
        System.out.print("Masukkan jarak (s) dalam meter: ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan kecepatan (v) dalam m/s: ");
        double kecepatan = input.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t) = " + waktu + " detik");

        input.close();
    }
}
