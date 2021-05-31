package ejericiciosPractica.protoype;

public class Contrato implements  IContrato{
    private int Sueldo;
    private int Carga_Horaria;
    private boolean Curso_Educacion_Superior;
    private boolean AccesoPlataforma;
    private boolean Marcado_Biometrico;
    private String Marcado_Hora_de_Entrada;
    private String  Marcado_hora_de_Salida;
    private Docente docente;

    public Contrato (){

    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    public int getCarga_Horaria() {
        return Carga_Horaria;
    }

    public void setCarga_Horaria(int carga_Horaria) {
        Carga_Horaria = carga_Horaria;
    }

    public boolean isCurso_Educacion_Superior() {
        return Curso_Educacion_Superior;
    }

    public void setCurso_Educacion_Superior(boolean curso_Educacion_Superior) {
        Curso_Educacion_Superior = curso_Educacion_Superior;
    }

    public boolean isAccesoPlataforma() {
        return AccesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        AccesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcado_Biometrico() {
        return Marcado_Biometrico;
    }

    public void setMarcado_Biometrico(boolean marcado_Biometrico) {
        Marcado_Biometrico = marcado_Biometrico;
    }

    public String getMarcado_Hora_de_Entrada() {
        return Marcado_Hora_de_Entrada;
    }

    public void setMarcado_Hora_de_Entrada(String marcado_Hora_de_Entrada) {
        Marcado_Hora_de_Entrada = marcado_Hora_de_Entrada;
    }

    public String getMarcado_hora_de_Salida() {
        return Marcado_hora_de_Salida;
    }

    public void setMarcado_hora_de_Salida(String marcado_hora_de_Salida) {
        Marcado_hora_de_Salida = marcado_hora_de_Salida;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public Object clone() {
        Contrato objContrato = new Contrato();
        objContrato.setSueldo(this.Sueldo);
        objContrato.setCarga_Horaria(this.Carga_Horaria);
        objContrato.setAccesoPlataforma(this.AccesoPlataforma);
        objContrato.setCurso_Educacion_Superior(this.Curso_Educacion_Superior);
        objContrato.setMarcado_Biometrico(this.Marcado_Biometrico);
        objContrato.setMarcado_Hora_de_Entrada(this.Marcado_Hora_de_Entrada);
        objContrato.setMarcado_hora_de_Salida(this.Marcado_hora_de_Salida);
        objContrato.setDocente(this.docente);
        return objContrato;
    }
    public void showInfo(){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Sueldo del docente: " + Sueldo);
        System.out.println("Carga horaria del docente: " + Carga_Horaria);
        System.out.println("Curso de eduacion superior del docente: " + Curso_Educacion_Superior);
        System.out.println("Acceso a la plataforma del docente: " + AccesoPlataforma);
        System.out.println("Marcado biometrico del docente: " + Marcado_Biometrico);
        System.out.println("Marcado hora de entrada del docente: " + Marcado_Hora_de_Entrada);
        System.out.println("Marcado hora de salida del docente: " + Marcado_hora_de_Salida);
        System.out.println("Datos personales del docente (nombres y apellidos): " + docente.getNombreDocente() +" " +  docente.getApellidoDocente());
    }
}
