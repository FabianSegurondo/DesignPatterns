package ejericiciosPractica.abstractfactory;

public class FactoryInscripcion {
    public enum typeInscripcion{
        INSCRIPCION_MATEMATICA, INSCRIPCION_LENGUAJE, INSCRIPCION_INGLES, INSCRIPCION_HISTORIA
    }
    public static ICursoInscripcion make(typeInscripcion type){
        ICursoInscripcion inscripcion;
        switch (type){
            case INSCRIPCION_INGLES:
                inscripcion = new Ingles();
                ((Ingles) inscripcion).setCreditos("25 creditos");
                ((Ingles) inscripcion).setNotaDeAprobacion(65);
                ((Ingles) inscripcion).setEstudiante(new Estudiante());
                break;
            case INSCRIPCION_HISTORIA:
                inscripcion = new Historia();
                ((Historia) inscripcion).setCreditos("15 creditos");
                ((Historia) inscripcion).setNotaDeAprobacion(62);
                ((Historia) inscripcion).setEstudiante(new Estudiante());
                break;
            case INSCRIPCION_LENGUAJE:
                inscripcion = new Lenguaje();
                ((Lenguaje) inscripcion).setCreditos("18 creditos");
                ((Lenguaje) inscripcion).setNotaDeAprobacion(72);
                ((Lenguaje) inscripcion).setEstudiante(new Estudiante());
                break;
            case INSCRIPCION_MATEMATICA:
                inscripcion = new Matematica();
                ((Matematica) inscripcion).setCreditos("35 creditos");
                ((Matematica) inscripcion).setNotaDeAprobacion(78);
                ((Matematica) inscripcion).setEstudiante(new Estudiante());
                break;
            default:
                inscripcion = new Matematica();
                break;
        }
        return inscripcion;
    }
}
