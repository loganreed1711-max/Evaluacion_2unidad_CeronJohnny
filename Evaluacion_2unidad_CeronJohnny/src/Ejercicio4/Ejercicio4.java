package Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    static int calcularHoras(int minutos) {return (int) Math.floor(minutos / 60.0);
    }

    static double calcularTotal(int horas, char tipo) {
        double precioHora = 0.50;
      if (tipo == 'A' || tipo == 'a') {
            precioHora = 1.00;
     }

        double total = horas * precioHora;
 if (horas > 10) {
    total = total * 0.80;
        }
        return total;
    }

    public static void main(String[] args) {
       
Scanner sc = new Scanner(System.in);
 System.out.print("Minutos estacionado: ");
 int minutos = sc.nextInt();
System.out.print("Tipo de vehiculo (A/M): ");
        char tipo = sc.next().charAt(0);
        if (minutos >= 1 && minutos <= 1440
                && (tipo == 'A' || tipo == 'a' || tipo == 'M' || tipo == 'm')) {
            int horas = calcularHoras(minutos);
            double total = calcularTotal(horas, tipo);
            System.out.println("Horas: " + horas);
            System.out.println("Total: $" + total);
        } else {
            System.out.println("Datos no validos.");
        }

        sc.close();
    }
}
