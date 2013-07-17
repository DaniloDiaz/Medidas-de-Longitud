package Trabajo_Extraclase5_Metodos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio3_Modificacion_ej_2 {

    private static int valor;
    private static int valor2;
    

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int opcion;
        String continuar;

        System.out.println("Algoritmo para realizar conversiones");


        do {
            System.out.println("Elige la unidad que vas a convertit"
                    + "\n1.Metros"
                    + "\n2.Pulgadas"
                    + "\n3.Yardas"
                    + "\n4.Pies");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    Ingresar_Valores();
                    System.out.println("Metros\t\tPulgadas\t\t\tYardas\t\t\t\tPies");
                    for (int i = valor; i <= valor2; i++) {
                        System.out.println(i + "\t\t" + calcular_Metros_a_Pulgadas(i) + "\t\t"
                                + calcular_Pies_a_Yardas(calcular_Pulgadas_a_Pies(
                                calcular_Metros_a_Pulgadas(i))) + "\t\t"
                                + calcular_Pulgadas_a_Pies(calcular_Metros_a_Pulgadas(i)));
                    }
                    break;
                case 2:
                    Ingresar_Valores();
                    System.out.println("Pulgadas\tMetros\t\tYardas\t\tPies");
                    for (int i = valor; i <= valor2; i++) {
                        System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", (double) i, 
                                calcular_Pulgadas_a_Metros((double) i),
                                calcular_Pies_a_Yardas(calcular_Pulgadas_a_Pies((double) i)), 
                                calcular_Pulgadas_a_Pies((double) i));
                    }
                    break;
                case 3:
                    Ingresar_Valores();
                    System.out.println("Yardas\tMetros\t\tPulgadas\t\tPies");
                    for (int i = valor; i <= valor2; i++) {
                        System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", (double) i,
                                calcular_Yardas_a_Pies(calcular_Pies_a_Pulgadas(calcular_Pulgadas_a_Metros((double) i))),
                                calcular_Yardas_a_Pies(calcular_Pies_a_Pulgadas((double) i)),
                                calcular_Yardas_a_Pies((double) i));
                    }
                    break;
                case 4:
                    Ingresar_Valores();
                    System.out.println("Pies\tMetros\t\tPulgadas\t\tYardas");
                    for (int i = valor; i <= valor2; i++) {
                        System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", (double) i,
                                calcular_Pies_a_Pulgadas(calcular_Pulgadas_a_Metros((double) i)),
                                calcular_Pies_a_Pulgadas((double) i),
                                calcular_Pies_a_Yardas((double) i));
                    }
                    break;
                default:
                    System.out.println(opcion + " no es una opcion valida");
            }
            System.out.println("Desea continuar S/N");
            continuar = lector.next();
            continuar = continuar.toLowerCase();
        } while (continuar.equals("s"));

    }

    private static void Ingresar_Valores() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el limite inferior");
        valor = lector.nextInt();
        System.out.println("Ingrese el limite superior");
        valor2=lector.nextInt();
    }

    private static double calcular_Metros_a_Pulgadas(double valor) {
        double pulgadas;
        pulgadas = valor * 100 / 2.54;
        return pulgadas;
    }

    private static double calcular_Pulgadas_a_Pies(double valor) {
        double pies;

        pies = valor / 12.0;
        return pies;
    }

    private static double calcular_Pies_a_Yardas(double valor) {
        double yardas;

        yardas = valor / 3.0;
        return yardas;
    }

    private static double calcular_Pulgadas_a_Metros(double valor) {
        double metros;

        metros = valor * 0.0254;
        return metros;
    }

    private static double calcular_Pies_a_Pulgadas(double valor) {
        double pulgadas;

        pulgadas = valor * 12;
        return pulgadas;
    }

    private static double calcular_Yardas_a_Pies(double valor) {
        double pies;

        pies = 3 * valor;
        return pies;
    }
}
