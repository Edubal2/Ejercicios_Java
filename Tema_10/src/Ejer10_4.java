class Alumno  {
    private String nombre;
    private int edad;
    private float nota;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad debe ser un valor positivo");
        } else {
            this.edad = edad;
        }
    }

    public void setNota(float nota) {
       if (nota >= 0 && nota <= 10) {
           this.nota = nota;
       } else {
           System.out.println("Nota Invalida introduce un valor entre 0 y 10");
       }
    }
}

public class Ejer10_4 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();

        alumno1.setNombre("Juan");
        alumno1.setEdad(18);
        alumno1.setNota(3.5f);

        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Edad: " + alumno1.getEdad());
        System.out.println("Nota: " + alumno1.getNota());
    }
}