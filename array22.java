import java.util.Scanner;

public class array22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP semester");
        System.out.println("==============================");

        String[] mataKuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double[] nilaiAngka = new double[mataKuliah.length];
        double[] bobotNilai = { 3.50, 4.00, 3.00, 4.00, 4.00, 2.50, 2.50, 4.00 };

        // Input nilai angka untuk setiap mata kuliah
        System.out.println("MASUKKAN NILAI PADA SETIAP MATA KULIAH!");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + " : ");
            nilaiAngka[i] = scanner.nextDouble();
        }

        // Output hasil konversi nilai
        System.out.println("\nMK\t\t\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai");
        System.out.println("========================================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilaiAngkaKeHuruf(nilaiAngka[i]);
            String nilaiSetara = konversiNilaiHurufKeNilaiSetara(nilaiHuruf);
            System.out.printf("%-35s%.2f\t\t%-8s\t\t%.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf, Double.parseDouble(nilaiSetara));
        }

        // Hitung IP Semester
        double totalNilaiSetaraSKS = 0;
        double totalBobotNilai = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            double nilaiSetara = Double.parseDouble(konversiNilaiHurufKeNilaiSetara(konversiNilaiAngkaKeHuruf(nilaiAngka[i])));
            totalNilaiSetaraSKS += nilaiSetara * bobotNilai[i];
            totalBobotNilai += bobotNilai[i];
        }
        double ipSemester = totalNilaiSetaraSKS / totalBobotNilai;

        // Output IP Semester
        System.out.printf("\n%-35s%.2f\n", "IP Semester Anda:", ipSemester);

        scanner.close();
    }

    private static String konversiNilaiAngkaKeHuruf(double nilaiAngka) {
        if (nilaiAngka > 80 && nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka > 73 && nilaiAngka <= 80) {
            return "B+";
        } else if (nilaiAngka > 65 && nilaiAngka <= 73) {
            return "B";
        } else if (nilaiAngka > 60 && nilaiAngka <= 65) {
            return "C+";
        } else if (nilaiAngka > 50 && nilaiAngka <= 60) {
            return "C";
        } else if (nilaiAngka > 39 && nilaiAngka <= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    private static String konversiNilaiHurufKeNilaiSetara(String nilaiHuruf) {
        if (nilaiHuruf.equals("A")) {
            return "4.00";
        } else if (nilaiHuruf.equals("B+")) {
            return "3.50";
        } else if (nilaiHuruf.equals("B")) {
            return "3.00";
        } else if (nilaiHuruf.equals("C+")) {
            return "2.50";
        } else if (nilaiHuruf.equals("C")) {
            return "2.00";
        } else if (nilaiHuruf.equals("D")) {
            return "1.00";
        } else {
            return "0.00";
        }
    }
}
