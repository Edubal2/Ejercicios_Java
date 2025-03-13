public class Ejer8_6 {
    public static void main(String[] args) {
        String cadena = "aaa@bbb.ccc";

        int antes = cadena.indexOf('@');
        int entre = cadena.indexOf('@');
        int despues = cadena.indexOf('.');
        int espacio = cadena.indexOf(' ');

        System.out.println("Esta es nuestra cadena: " + cadena);


        if (antes > 0){
            String cadAntes = cadena.substring(0, antes);
            System.out.println("Antes del arroba hay: " + cadAntes);
        } else{
            System.out.println("No hay nada antes del arroba");
        }

        if (entre < despues){
            String cadEntre = cadena.substring(entre+1, despues);
            System.out.println("Entre el arroba y el punto hay: " + cadEntre);
        }else {
            System.out.println("No hay nada entre el arroba y el punto");
        }

        if (cadena.length()>despues){
            String cadDespues = cadena.substring(despues+1, cadena.length());
            System.out.println("Despues del punto hay: " + cadDespues);
        } else {
            System.out.println("No hay nada despues del punto");
        }

        if (espacio >= 0) {
            System.out.println("Hay un espacio");
        } else {
            System.out.println("No hay ningun espacio");
        }

    }
}
