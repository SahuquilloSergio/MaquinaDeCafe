package maquinadecafe_cod;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase implementa los métodos para preparar las bebidas
 * 
 * @author mbacelofernandez
 */

public class Cafetera {

    private static int escoger;

    public Cafetera() {
    }

    public static int getEscoger() {
        return escoger;
    }
    /**
     * Permite al usuario escoger la bebida deseada y combrueba que haiga credito
     * suficiente, si no hay te insta a que lo insertes
     * @param bebidas Array que contiene las bebidas disponibles
     */
    public static void escogerBebida(Producto bebidas[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge número de bebida:");
        escoger = sc.nextInt();
        System.out.println("Escogiste " + bebidas[escoger - 1].getBebida());

        if (Monedero.getCredito() >= bebidas[escoger - 1].getPrecio()) {
            Cafetera.prepararBebida(bebidas);
        } else {
            System.out.println("Dinero insuficiente, vuelva a intentarlo");
            System.out.println("Recoja su dinero");
        }
    }
    /**
     * Permite modificar la cantidad de azucar deseada para la bebida
     * @param bebidas Array que contiene las bebidas disponibles
     */
    public static void añadirAzucar(Producto bebidas[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de azúcar: " + Producto.getAzucar());
        System.out.println("¿Desea añadir o quitar azucar? (si/no)");
        String respuesta = sc.next();
        if (respuesta.equals("si")) {

            System.out.println("¿Deseas añadir o quitar?(añadir/quitar)");
            String respuesta2 = sc.next();
            if (respuesta2.equals("añadir")) {
                Producto.añadirAzucar();
            } else {
                Producto.quitarAzucar();
            }
        }
        Cafetera.servirBebida(bebidas);
    }
    /**
     * Prepara la bebida escogida
     * @param bebidas Array que contiene las bebidas disponibles
     */
    public static void prepararBebida(Producto bebidas[]) {
        System.out.println("Preparando su " + bebidas[escoger - 1].getBebida());
        System.out.println("Por favor, espere...");
        Cafetera.dispensarVaso(bebidas);
    }
     /**
     * Dispensa el vaso para la bebida
     * @param bebidas Array que contiene las bebidas disponibles
     */
    public static void dispensarVaso(Producto bebidas[]) {

        System.out.println("Dispensando vaso...");
        Cafetera.añadirAzucar(bebidas);
    }
    /**
     * Sirve la bebida
     * @param bebidas Array que contiene las bebidas disponibles
     */
    public static void servirBebida(Producto bebidas[]) {
        System.out.println("Su bebida esta lista");
        Monedero.devolverCambio(bebidas);

    }
    /**
     * Finaliza el servicio prestado
     */
    public static void finalizaPedido(){
    System.out.println("Que tenga un buen dia!");
    Monedero.setCredito(0);
    
    }
    
}
