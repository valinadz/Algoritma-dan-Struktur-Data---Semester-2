public class fungsi22 {
    public static void main(String[] args) {

        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        kurangiStock(stockBunga, 1, 1); 
        kurangiStock(stockBunga, 2, 0); 
        kurangiStock(stockBunga, 3, 3); 

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        hitungPendapatan(stockBunga, hargaBunga);

        cekStock(stockBunga);
    }

    public static void kurangiStock(int[][] stockBunga, int cabang, int indeksBunga) {
        if (cabang >= 0 && cabang < stockBunga.length && indeksBunga >= 0 && indeksBunga < stockBunga[0].length) {
            stockBunga[cabang][indeksBunga]--;
        } else {
            System.out.println("Cabang atau indeks bunga tidak valid");
        }
    }

    public static void hitungPendapatan(int[][] stockBunga, int[] hargaBunga) {
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Cabang " + (i + 1) + ": " + pendapatan);
        }
    }

    public static void cekStock(int[][] stockBunga) {
        System.out.println("\nJumlah stock setiap jenis bunga pada cabang RoyalGarden:");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int j = 0; j < stockBunga[0].length; j++) {
            int totalStock = 0;
            for (int i = 0; i < stockBunga.length; i++) {
                totalStock += stockBunga[i][j];
            }
            System.out.println(jenisBunga[j] + ": " + totalStock);
        }
    }
}
