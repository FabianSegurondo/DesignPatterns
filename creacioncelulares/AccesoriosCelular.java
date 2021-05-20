package ejemplos.protype.creacioncelulares;

public class AccesoriosCelular {
    private String cargadores;
    private String audifonos;
    private String otros;

    public AccesoriosCelular(String cargadores, String audifonos, String otros){
        this.cargadores = cargadores;
        this.audifonos= audifonos;
        this.otros = otros;
    }

    public String getCargadores() {
        return cargadores;
    }

    public void setCargadores(String cargadores) {
        this.cargadores = cargadores;
    }

    public String getAudifonos() {
        return audifonos;
    }
    public void setAudifonos(String audifonos) {
        this.audifonos = audifonos;
    }
    public String getOtros() {
        return otros;
    }
    public void setOtros(String otros) {
        this.otros = otros;
    }
}
