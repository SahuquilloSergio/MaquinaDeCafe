package maquinadecafe_cod;

import java.util.Scanner;
/**
 * Esta clase implementa los metodos relacionados con el credito y el pago de las bebidas
 * @author mbacelofernandez
 */

public class Monedero {

    private static float credito;
    private static float cambio;

    public static float getCredito() {
        return credito;
    }

    public static float getCambio() {
        return cambio;
    }

    public static void setCambio(float cambio) {
        Monedero.cambio = cambio;
    }

    public static void setCredito(float credito) {
        Monedero.credito = credito;
    }
    /**
     * Permite al usuario introducir el dinero y te dice de cuanto saldo dispone
     * @param bebidas Array que contiene las bebidas disponibles
     */
    public static void introducirCredito(Producto bebidas[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte dinero:");
        credito = sc.nextFloat();
        System.out.println("Tiene un crédito de " + credito + " euros");

    }
    /**
     * Calcula el cambio del servicio y devuelve las monedas
     * @param bebidas Array que contiene las bebidas disponibles
     */
    public static void devolverCambio(Producto bebidas[]) {

        cambio = credito - bebidas[Cafetera.getEscoger() - 1].getPrecio();
        System.out.println("Recoja el cambio: " + cambio + " €");
        Cafetera.finalizaPedido();

    }
    /**
     * Devuelve el dinero si no has pedido ninguna bebida
     */
    public static void devolverCredito() {
        System.out.println("Son " + credito + " euros");
        Monedero.setCredito(0);
    }
}
