package maquinadecafe_cod;
/**
 * Contine las variables del producto
 * @author mbacelofernandez
 */
public class Producto {

    private String bebida;
    private float precio;
    private static int azucar = 3;

    public Producto() {
    }

    public Producto(String bebida, float precio) {
        this.bebida = bebida;
        this.precio = precio;
    }

    public String getBebida() {
        return bebida;
    }

    public float getPrecio() {
        return precio;
    }

    public static int getAzucar() {
        return azucar;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static void setAzucar(int azucar) {
        Producto.azucar = azucar;
    }

    public static void añadirAzucar() {
        azucar++;
    }

    public static void quitarAzucar() {
        azucar--;
    }

    @Override
    public String toString() {
        return bebida + "-------> precio: " + precio + "€";
    }

}
