package examenfinal;
//    static Scanner tc = new (System.in);

import java.util.Scanner;

public class ExamenFinal {

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
                x[i][j] = ' ';
            }
        }
        for (int i = 1; i < x.length; i++) {
            for (int j = 0; j < x[1].length; j++) {
                x[i][j] = '-';
                x[1][0] = 'A';
                x[2][0] = 'B';
                x[3][0] = 'C';
                x[4][0] = 'D';
                x[5][0] = 'E';
            }
        }
        for (int i = 6; i < x.length; i++) {
            for (int j = 0; j < x[1].length; j++) {
                x[i][j] = '0';
            }
        }
        for (int i = 7; i < x.length; i++) {
            for (int j = 0; j < x[1].length; j++) {
                x[i][j] = '-';
            }
        }
        for (int i = 8; i < x.length; i++) {
            for (int j = 0; j < x[1].length; j++) {
                x[i][j] = '0';
                x[6][0] = 'F';
                x[7][0] = 'G';
                x[8][0] = 'H';
            }
        }
    }

    public static void main(String[] args) {
        char[][] matriz1 = new char[9][21];
        int opcion = 0;
        double ocupacion = 0;
        double suma = 0;
        double porcentaje = 0;
        double totals = 0;
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
                    System.out.println("El porcentaje de ocupación es: " + (totals) + " " + (porcentaje) + "%");
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
