package factoryMethod.ejercicios.aerolinea;

public class PasajeStandar implements IPasajes{
    private String numeroVuelo;
    private String numeroAsiento;
    private String costo;
    private Avion avion;
    private Destino destino;
    private Origen origen;
    private Pasajero pasajero;

    public PasajeStandar (){
        avion = new Avion();
        destino = new Destino();
        origen = new Origen();
        pasajero = new Pasajero();
    }

    @Override
    public void crear() {
        System.out.println("Pasaje standar - numero de vuelo: " + numeroVuelo);
        System.out.println("Pasaje standar - numero de asiento: " + numeroAsiento);
        System.out.println("Pasaje standar - costo: " + costo);
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

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo= costo;
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
}
