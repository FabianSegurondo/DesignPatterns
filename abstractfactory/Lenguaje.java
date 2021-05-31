package ejericiciosPractica.abstractfactory;

public class Lenguaje implements ICursoInscripcion {
    private String creditos;
    private int notaDeAprobacion;
    private Estudiante estudiante = new Estudiante();

    public Lenguaje(){

    }
    @Override
    public void crear() {
        System.out.println("Curso de lENGUAJE");
        System.out.println("Creditos de la materia: " + creditos);
        System.out.println("Nota de aprobacion de la materia: " + notaDeAprobacion);
        estudiante.showInfo();

    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public int getNotaDeAprobacion() {
        return notaDeAprobacion;
    }

    public void setNotaDeAprobacion(int notaDeAprobacion) {
        this.notaDeAprobacion = notaDeAprobacion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}