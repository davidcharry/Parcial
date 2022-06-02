package examenfinal;
//    static Scanner tc = new (System.in);

import java.util.Scanner;

public class ExamenFinal1 {

    static Scanner sc = new Scanner(System.in);

    public static void imprmirMatriz(char[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void llenarMatriz(char[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[1].length; j++) {
                x[i][j] = '-';
                x[0][0] = ' ';
                x[0][1] = ' ';
                x[0][2] = ' ';
                x[0][3] = ' ';
                x[0][4] = ' ';
                x[0][5] = ' ';
                x[0][6] = ' ';
                x[0][7] = ' ';
                x[0][8] = ' ';
                x[0][9] = ' ';
                x[0][10] = ' ';
                x[0][11] = ' ';
                x[0][12] = ' ';
                x[0][13] = ' ';
                x[0][14] = ' ';
                x[0][15] = ' ';
                x[0][16] = ' ';
                x[0][17] = ' ';
                x[0][18] = ' ';
                x[0][19] = ' ';
                x[0][20] = ' ';
                x[1][0] = 'A';
                x[2][0] = 'B';
                x[3][0] = 'C';
                x[4][0] = 'D';
                x[5][0] = 'E';
                x[6][0] = 'F';
                x[7][0] = 'G';
                x[8][0] = 'H';
                x[6][1] = '0';
                x[6][2] = '0';
                x[6][3] = '0';
                x[6][4] = '0';
                x[6][5] = '0';
                x[6][6] = '0';
                x[6][7] = '0';
                x[6][8] = '0';
                x[6][9] = '0';
                x[6][10] = '0';
                x[6][11] = '0';
                x[6][12] = '0';
                x[6][13] = '0';
                x[6][14] = '0';
                x[6][15] = '0';
                x[6][16] = '0';
                x[6][17] = '0';
                x[6][18] = '0';
                x[6][19] = '0';
                x[6][20] = '0';
                x[8][1] = '0';
                x[8][2] = '0';
                x[8][3] = '0';
                x[8][4] = '0';
                x[8][5] = '0';
                x[8][6] = '0';
                x[8][7] = '0';
                x[8][8] = '0';
                x[8][9] = '0';
                x[8][10] = '0';
                x[8][11] = '0';
                x[8][12] = '0';
                x[8][13] = '0';
                x[8][14] = '0';
                x[8][15] = '0';
                x[8][16] = '0';
                x[8][17] = '0';
                x[8][18] = '0';
                x[8][19] = '0';
                x[8][20] = '0';

            }
        }
    }

    public static void main(String[] args) {
        int opcion = 0;
        double ocupacion = 0;
        double suma = 0;
        double porcentaje = 0;
        double totals = 0;
        char[][] matriz1 = new char[9][21];
        llenarMatriz(matriz1);
        do {
            System.out.println("1. Ver Sala");
            System.out.println("2. Reservar Boletos");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Pocentaje de Ocupacion de la Sala");
            System.out.println("5. Salir");

            System.out.println("Seleccione una opcion");
            opcion = Integer.parseInt(sc.next());
            switch (opcion) {
                case 1:
                    System.out.println("\u001B[31m                       Estado de la sala                      ");
                    System.out.println();
                    System.out.println("\u001B[31m   1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20");
                    imprmirMatriz(matriz1);
                    System.out.println("\u001B[31m***************************Pantalla***************************");
                    break;
                case 2:
                    System.out.println("\u001B[31mSeleccione silla a reservar fila&columna");

                    String posicion = sc.next();
                    String[] valores = posicion.split("&");
                    int fila = Integer.parseInt(valores[0]);
                    int columna = Integer.parseInt(valores[1]);

                    if ((matriz1[fila][columna]) != '-') {
                        System.out.println("\u001B[31mEste puesto ya esta reservado");

                    } else {
                        matriz1[fila][columna] = '0';
                        suma = suma + 1;
                        ocupacion = suma;
                        System.out.println("\u001B[31mReserva Exitosa");

                        System.out.println("\u001B[31m                       Estado de la sala                      ");
                        System.out.println();
                        System.out.println("\u001B[31m   1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20");
                        imprmirMatriz(matriz1);
                        System.out.println("\u001B[31m***************************Pantalla***************************");
                    }
                    break;
                case 3:
                    System.out.println("\u001B[31mSeleccione silla a cancelar fila&columna");
                    String posicionA = sc.next();
                    String[] valoresA = posicionA.split("&");
                    int filaA = Integer.parseInt(valoresA[0]);
                    int columnaA = Integer.parseInt(valoresA[1]);
                    if ((matriz1[filaA][columnaA]) != '0') {
                        System.out.println("\u001B[31mEste puesto no esta reservado");

                    } else {
                        matriz1[filaA][columnaA] = '-';
                        suma = suma - 1;
                        ocupacion = suma;
                        System.out.println("\u001B[31mCancelación Exitosa");
                    }
                    System.out.println("\u001B[31m                       Estado de la sala                      ");
                    System.out.println();
                    System.out.println("\u001B[31m   1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20");
                    imprmirMatriz(matriz1);
                    System.out.println("\u001B[31m***************************Pantalla***************************");
                    break;
                case 4:
                    totals = 40 + ocupacion;
                    porcentaje = (((totals) * 100) / 160);
                    System.out.println("El porcentaje de ocupación es: " + (totals)+ " " + (porcentaje)+"%");
                    System.out.println("\u001B[31m                       Estado de la sala                      ");
                    System.out.println();
                    System.out.println("\u001B[31m  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20");
                    imprmirMatriz(matriz1);
                    System.out.println("\u001B[31m***************************Pantalla***************************");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\u001B[31mOpcion no disponible");
            }
        } while (opcion != 5);
    }
}
