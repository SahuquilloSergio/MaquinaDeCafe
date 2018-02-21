package maquinadecafe_cod;
import java.util.ArrayList;

/**
 * Clase que contiene la funcion main
 * 
 * @author mbacelofernandez
 */
public class MaquinaDeCafe_COD {

    /**
     * Este programa ejecuta el funcionamiento de una cafetera
     * Contiene el array de bebidas y accede al menu
     * @param args argumentos de la clase principal
     */
    public static void main(String[] args) {

        Producto bebidas[] = {new Producto("Cafe con leche", 0.50f),
        new Producto("Colacao", 0.75f), new Producto("Chocolate", 0.7f)};

        Botonera.menu(bebidas);

    }

}
