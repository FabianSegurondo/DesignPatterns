package ejericiciosPractica.singletonitis;

public class Cliente {
    public static void main(String[] args) {
        Colegio calvert = new Colegio();
        calvert.setCajero(new Cajero("PEDRO FEO", "JOAQUITO CHUQIMIQIMA"));

        calvert.pagarMatricula(2555555, new Estudiante("2520", "JUAN OXA"));
    }
}
