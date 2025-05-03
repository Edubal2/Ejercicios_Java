package Ejercicios.Ejer10_8;

class Estudiante {
    String nombre;
    float[] notas;

    public Estudiante(String nombre, float[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    boolean actualizarNota(float nota, int numeroDeAsignatura){
        if (nota < 0 || nota > 10){
            return false;
        }else {
            notas[numeroDeAsignatura] = nota;
            return true;
        }
    }

    String obtenerDetalles(){
        float media = 0;
        for (int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        media = media / notas.length;

        String notasSrc = "";
        for (int i = 0; i < notas.length; i++){
            notasSrc += notas[i] + ", ";
        }

        if (!notasSrc.isEmpty()){
            notasSrc = notasSrc.substring(0, notasSrc.length() - 2);
        }

        return "\nNombre: " + nombre + "\nNotas: " + notasSrc + "\nMedia: " + media;
    }
}

public class Ejer10_8_1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", new float[]{3, 2, 4, 5});
        System.out.println(estudiante1.obtenerDetalles());
        estudiante1.actualizarNota(7,2);
        System.out.println(estudiante1.obtenerDetalles());

    }
}
