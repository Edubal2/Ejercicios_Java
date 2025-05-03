class Producto {
    private String nombre;
    private double precio;
    private int stock;

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setPrecio(double precio){
        this.precio = precio;
    }

    void setStock(int stock){
        this.stock = stock;
    }

    String getNombre(){
        return nombre;
    }

    double grtPrecio(){
        return precio;
    }

    int getStock(){
        return stock;
    }

    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " | Precio: " + precio + " € | Stock: " + stock + " unidades" );
    }
}



public class Getters_y_Setters {
    public static void main(String[] args) {

        Producto producto = new Producto();

        producto.setNombre("juan");
        producto.setPrecio(2);
        producto.setStock(10);

        producto.mostrarInformacion();


    }
}
