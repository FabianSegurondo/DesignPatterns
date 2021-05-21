package factoryMethod.ejercicios.aerolinea;



public class PasajeInfante implements  IPasajes{
    private String numeroVuelo;
    private String numeroAsiento;
    private String costoEspecial;
    private String fechaNacimiento;
    private Avion avion;
    private Destino destino;
    private Origen origen;
    private Pasajero pasajero;

    public PasajeInfante (){
        avion = new Avion();
        destino = new Destino();
        origen = new Origen();
        pasajero = new Pasajero();
    }
    @Override
    public void crear() {
        System.out.println("Pasaje infante - numero de vuelo: "+ numeroVuelo);
        System.out.println("Pasaje infante - numero de asiento: "+ numeroAsiento);
        System.out.println("Pasaje infante - costo especial: "+ costoEspecial);
        System.out.println("Pasaje infante - fecha de nacimiento: "+ fechaNacimiento);
        avion.showInfo();
        destino.showInfo();
        origen.showInfo();
        pasajero.showInfo();
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(String costoEspecial) {
        this.costoEspecial = costoEspecial;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
