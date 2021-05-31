package ejericiciosPractica.protoype;

public class ClienteDocente {
    public static void main(String[] args) {
        Contrato contratoDeDocente = new Contrato();
        contratoDeDocente.setSueldo(5000);
        contratoDeDocente.setCarga_Horaria(80);
        contratoDeDocente.setCurso_Educacion_Superior(true);
        contratoDeDocente.setAccesoPlataforma(true);
        contratoDeDocente.setMarcado_Biometrico(false);
        contratoDeDocente.setMarcado_Hora_de_Entrada("08:00");
        contratoDeDocente.setMarcado_hora_de_Salida("18:00");

        Contrato docente1 = (Contrato) contratoDeDocente.clone();
        docente1.setDocente(new Docente("Fabito", "papitus"));

        Contrato docente2 = (Contrato) contratoDeDocente.clone();
        docente2.setDocente(new Docente("priruj", "amigo"));

        Contrato docente3 = (Contrato) contratoDeDocente.clone();
        docente3.setDocente(new Docente("sbeas", "maussan"));

        Contrato docente4 = (Contrato) contratoDeDocente.clone();
        docente4.setDocente(new Docente("cheto", "papitus"));

        Contrato docente5 = (Contrato) contratoDeDocente.clone();
        docente5.setDocente(new Docente("alvaro", "reina"));

        Contrato docente6 = (Contrato) contratoDeDocente.clone();
        docente6.setDocente(new Docente("alechi", "gjss"));

        Contrato docente7 = (Contrato) contratoDeDocente.clone();
        docente7.setDocente(new Docente("oskar", "flowers"));

        Contrato docente8 = (Contrato) contratoDeDocente.clone();
        docente8.setDocente(new Docente("pedro", "papitus"));

        Contrato docente9 = (Contrato) contratoDeDocente.clone();
        docente9.setDocente(new Docente("rotis", "alegno"));

        Contrato docente10 = (Contrato) contratoDeDocente.clone();
        docente10.setDocente(new Docente("Fachito", "montes"));

        Contrato docente11 = (Contrato) contratoDeDocente.clone();
        docente11.setDocente(new Docente("Felipao", "mertens"));

        Contrato docente12 = (Contrato) contratoDeDocente.clone();
        docente12.setDocente(new Docente("Edagar", "favareto"));

        Contrato docente13 = (Contrato) contratoDeDocente.clone();
        docente13.setDocente(new Docente("spoopy", "taboada"));

        Contrato docente14 = (Contrato) contratoDeDocente.clone();
        docente14.setDocente(new Docente("Drake", "aubrey"));

        Contrato docente15 = (Contrato) contratoDeDocente.clone();
        docente15.setDocente(new Docente("cristofer", "medinacialli"));

        docente1.showInfo();
        docente2.showInfo();
        docente3.showInfo();
        docente4.showInfo();
        docente5.showInfo();
        docente6.showInfo();
        docente7.showInfo();
        docente8.showInfo();
        docente9.showInfo();
        docente10.showInfo();
        docente11.showInfo();
        docente12.showInfo();
        docente13.showInfo();
        docente14.showInfo();
        docente15.showInfo();


    }
}
