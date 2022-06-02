package examenfinal;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
