package matriz;

public class Tomas {

    public static void main(String[] args) {

        int[][] primos = new int[17][10];
        int j;
        int k;
        for (j = 1; j <= 1000; j++) {
            for (k = j - 1; k >= 1; k--) {
                if (j % k != 0) {
                    for (int z = 0; z < 17; z++) {
                        for (int y = 0; y < 10; y++) {
                            primos[z][y] = j;
                            System.out.println(primos[z][y]);
                        }
                    }
                }
            }
        }
        for (j = 0; j < 17; j++) {
            for (k = 0; k < 10; k++) {
                System.out.println(primos[j][k]);
            }
        }
    }

}


