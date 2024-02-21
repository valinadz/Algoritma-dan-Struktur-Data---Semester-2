import java.util.Scanner;

public class pemilihan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Perhitungan Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int uas = sc.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");

        double nA = hitungNilaiAkhir(tugas, kuis, uts, uas);
        System.out.println("Nilai Akhir : " + nA);

        String nilaiHuruf = konversiNilaiHuruf(nA);
        System.out.println("Nilai Huruf : " + nilaiHuruf);

        System.out.println("===============================");
        if (nilaiHuruf.equals("E")) {
            System.out.println("Maaf, Anda Tidak Lulus");
        } else {
            System.out.println("Selamat, Anda Lulus");
        }

        sc.close();
    }

    public static double hitungNilaiAkhir(int tugas, int kuis, int uts, int uas) {
        double nilaiAkhir = tugas * 0.2 + kuis * 0.2 + uts * 0.3 + uas * 0.4;
        return nilaiAkhir;
    }

    public static String konversiNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir > 80) {
            return "A";
        } else if (nilaiAkhir > 73) {
            return "B+";
        } else if (nilaiAkhir > 65) {
            return "B";
        } else if (nilaiAkhir > 60) {
            return "C+";
        } else if (nilaiAkhir > 50) {
            return "C";
        } else if (nilaiAkhir > 39) {
            return "D";
        } else {
            return "E";
        }
    }
}
