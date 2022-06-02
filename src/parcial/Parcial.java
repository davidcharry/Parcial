package parcial;

import java.util.Scanner;

public class Parcial {

    static String Estacion;
    static double Cobro = 0;
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        float Kilometros;
        String Mes;
        System.out.println("Digite el mes en el que alquilo el automovil");
        Mes = tc.nextLine();
        System.out.println("Digite la cantidad de kilometros recorridos");
        Kilometros = tc.nextFloat();
        Clima(Mes);
        Costo(Kilometros);
        Descuento();
    }

    public static String Clima(String Mes) {
        if (("Enero".equalsIgnoreCase(Mes) || "Febrero".equalsIgnoreCase(Mes)) || "Marzo".equalsIgnoreCase(Mes)) {
            Estacion = "Primavera";
        } else if (("Abril".equalsIgnoreCase(Mes) || "Mayo".equalsIgnoreCase(Mes)) || "Junio".equalsIgnoreCase(Mes)) {
            Estacion = "Verano";
        } else if (("Julio".equalsIgnoreCase(Mes) || "Agosto".equalsIgnoreCase(Mes)) || "Septiembre".equalsIgnoreCase(Mes)) {
            Estacion = "Otoño";
        } else if (("Octubre".equalsIgnoreCase(Mes) || "Noviembre".equalsIgnoreCase(Mes)) || "Diciembre".equalsIgnoreCase(Mes)) {
            Estacion = "Invierno";
        } else {
            System.out.println("Mes Invalido");
        }
        return Estacion;
    }

    public static double Costo(float Kilometros) {
        System.out.println("Este mes pertenece a la estación: " + Estacion);
        if (Kilometros > 0 && Kilometros <= 300) {
            Cobro = 30;
        } else if (Kilometros > 300 && Kilometros <= 1000) {
            Cobro = ((30) + (Kilometros * 0.15));
        } else {
            Cobro = ((30) + (Kilometros * 0.10));
        }
        System.out.println("El costo por kilometros recorridos es: $" + Cobro);
        return Cobro;
    }

    public static double Descuento() {
        double Des = 0;
        if ("Primavera".equalsIgnoreCase(Estacion)) {
            Des = (Cobro * 0.02);
        } else if ("Verano".equalsIgnoreCase(Estacion)) {
            Des = (Cobro * 0.01);
        } else if ("Otoño".equalsIgnoreCase(Estacion)) {
            Des = (Cobro * 0.05);
        } else if ("Invierno".equalsIgnoreCase(Estacion)) {
            Des = (Cobro * 0.10);
        } else {
            System.out.println("Invalido");
        }
        System.out.println("El descuento es de: $" + Des);
        System.out.println("El costo total con el descuento es de: $" + (Cobro - Des));
        System.out.println("La estación climática en la que se alquiló el automóvil es: " + Estacion);
        return Des;
    }
}
