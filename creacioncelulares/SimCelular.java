package ejemplos.protype.creacioncelulares;

public class SimCelular {
    private String nombreEmpresaTelefono;
    private String numeroTelefono;

    public SimCelular(String nombreEmpresaTelefono, String numeroTelefono){
        this.nombreEmpresaTelefono = nombreEmpresaTelefono;
        this.numeroTelefono= numeroTelefono;
    }

    public String getNombreEmpresaTelefono() {
        return nombreEmpresaTelefono;
    }

    public void setNombreEmpresaTelefono(String nombreEmpresaTelefono) {
        this.nombreEmpresaTelefono = nombreEmpresaTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
        public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
     }
}

