package ejericiciosPractica.protoype;

public class Docente {
    private String nombreDocente;
    private String apellidoDocente;

    public Docente (String nombreDocente, String apellidoDocente){
        this.nombreDocente = nombreDocente;
        this.apellidoDocente = apellidoDocente;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }
}
