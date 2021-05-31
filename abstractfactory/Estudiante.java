package ejericiciosPractica.abstractfactory;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String gradoDeEducacion;
    public Estudiante(){

    }
    public  Estudiante (String nombre, String apellido, int edad, String gradoDeEducacion){
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.gradoDeEducacion= gradoDeEducacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGradoDeEducacion() {
        return gradoDeEducacion;
    }

    public void setGradoDeEducacion(String gradoDeEducacion) {
        this.gradoDeEducacion = gradoDeEducacion;
    }
    public void showInfo(){
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Apellido del estudiante: " + apellido);
        System.out.println("edad del estudiante: " + edad);
        System.out.println("grado de educacion del estudiante: " + gradoDeEducacion);

    }
}
