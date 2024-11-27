public class Ejer4_9 {
    public static void main(String[] args) {

        int suma = 1, producto = 1;
        System.out.println("Suma de los primeros 10 numeros ");
        for(int i = 1; i <11; i++){
            suma = suma + i;
            System.out.println(i + ". " + suma);
        }
        System.out.println("Producto de los primeros 10 numeros ");
        for(int i = 1; i <11; i++){
            producto = producto * i;
            System.out.println(i + ". " + producto);
        }
    }
}
