package maquinadecafe_cod;

import java.util.Scanner;
/**
 * Clase que contiene el menu de opciones de la maquina
 * @author ssahuquilloembade
 */
public class Botonera {
    /**
     * Visualiza un menu con las opciones disponibles y contiene un switch para
     * realizar las funciones de la maquina
     * @param bebidas Array que contiene las bebidas disponibles
     */
    public static void menu(Producto bebidas[]) {
        int op;
        System.out.println("*******MENU*******\n"
                + "1)Listado de bebidas\n"
                + "2)Introduzca el dinero\n"
                + "3)Escoja una bebida\n"
                + "4)Recoja su cambio\n"
                + "5)Salir");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nSeleccione una opcion:");
        op = sc.nextInt();
        while (op !=5) {
            switch (op) {
                case 1:
                    Display.lista(bebidas);
                    break;
                case 2:
                    Monedero.introducirCredito(bebidas);
                    break;
                case 3:
                    Cafetera.escogerBebida(bebidas);
                    break;
                case 4:
                    Monedero.devolverCredito();
                    //System.out.println("Su cambio ya ha sido devuelto");
                   
                    break;
                case 5:
                    System.exit(op);
                    break;
                default:
                    Display.darMensaje("Opción no válida, escoge una de las anteriores");
            }
            System.out.println("*******MENU*******\n"
                    + "1)Listado de bebidas\n"
                    + "2)Introduzca el dinero\n"
                    + "3)Escoja una bebida\n"
                    + "4)Recoja su cambio\n"
                    + "5)Salir\n");

            System.out.println("\nSeleccione una opcion:");
            op = sc.nextInt();
        }
    }
}
