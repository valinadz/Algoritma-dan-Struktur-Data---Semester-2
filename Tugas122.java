import java.util.Scanner;

public class Tugas122 {
    public static void main(String[] args) {
        String[] kodePlat = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[] namaKota = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil (huruf besar): ");
        String kode = input.nextLine().toUpperCase();

        String kota = cariKota(kodePlat, namaKota, kode);

        if (kota != null) {
            System.out.println("Kota dengan kode plat " + kode + " adalah: " + kota);
        } else {
            System.out.println("Kode plat tidak ditemukan");
        }

        input.close();
    }

    public static String cariKota(String[] plat, String[] kota, String kode) {
        for (int i = 0; i < plat.length; i++) {
            if (plat[i].equals(kode)) {
                return kota[i];
            }
        }
        return null;
    }
}
