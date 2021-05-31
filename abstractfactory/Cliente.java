package ejericiciosPractica.abstractfactory;

import abstractFactory.ejemplos.boletosAvion.FactoryPasaje;
import abstractFactory.ejemplos.boletosAvion.PasajeStandart;
import abstractFactory.ejemplos.boletosAvion.Pasajero;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Matematica  inscripcion1 = (Matematica) FactoryInscripcion.make(FactoryInscripcion.typeInscripcion.INSCRIPCION_MATEMATICA);
        inscripcion1.setEstudiante(new Estudiante("fabian","chechu", 25, "doctorado" ));
        inscripcion1.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Lenguaje inscripcion2 = (Lenguaje) FactoryInscripcion.make(FactoryInscripcion.typeInscripcion.INSCRIPCION_LENGUAJE);
        inscripcion2.setEstudiante(new Estudiante("Mnolinn","gumuciios", 20, "pregrado" ));
        inscripcion2.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Ingles  inscripcion3 = (Ingles) FactoryInscripcion.make(FactoryInscripcion.typeInscripcion.INSCRIPCION_INGLES);
        inscripcion3.setEstudiante(new Estudiante("ALVAro","taquichru", 28, "master" ));
        inscripcion3.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Historia  inscripcion4 = (Historia) FactoryInscripcion.make(FactoryInscripcion.typeInscripcion.INSCRIPCION_HISTORIA);
        inscripcion4.setEstudiante(new Estudiante("Maximus","salita", 15, "estudiante de colegio" ));
        inscripcion4.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Historia  inscripcion5 = (Historia) FactoryInscripcion.make(FactoryInscripcion.typeInscripcion.INSCRIPCION_HISTORIA);
        inscripcion5.setEstudiante(new Estudiante("Mfelis","coquita", 19, "pregrado" ));
        inscripcion5.crear();
    }
}
