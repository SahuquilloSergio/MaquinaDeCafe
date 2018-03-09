package maquinadecafe_cod;

import javax.swing.JOptionPane;
/**
 * Clase que contiene la visualización del array
 * @author ssahuquilloembade
 */

public class Display {
    /**
     * Devuelve la lista de bebidas
     * @param bebidas Array que contiene las bebidas disponibles
     */
    public static void lista(Producto bebidas[]) {
        System.out.println("**********BEBIDAS**********");
        for (int i = 0; i < bebidas.length; i++) {
            System.out.println((i + 1) + ")" + bebidas[i]);
        }
        System.out.println();
    }
    /**
     * Mensaje que aparece en caso de escoger una opción incorrecta en el menu
     * @param mensaje que muestra el menu
     */
    public static void darMensaje(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);
    }

}
