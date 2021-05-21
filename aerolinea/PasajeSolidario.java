package factoryMethod.ejercicios.aerolinea;

public class PasajeSolidario implements IPasajes {
    private String numeroVuelo;
    private String numeroAsiento;
    private String costoDePasaje;
    private String descuento;
    private String motivoDelDescuento;
    private Avion avion;
    private Destino destino;
    private Origen origen;
    private Pasajero pasajero;

    public PasajeSolidario(){
        avion = new Avion();
        destino = new Destino();
        origen = new Origen();
        pasajero = new Pasajero();
    }
    @Override
    public void crear() {
        System.out.println("Pasaje solidario - numero de vuelo: "+ numeroVuelo);
        System.out.println("Pasaje solidario - numero de asiento: "+ numeroAsiento);
        System.out.println("Pasaje solidario - costo: "+ costoDePasaje);
        System.out.println("Pasaje solidario - motivo del descuento: "+ motivoDelDescuento);
        System.out.println("Pasaje solidario - descuento: "+ descuento);
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

    public String getCostoDePasaje() {
        return costoDePasaje;
    }

    public void setCostoDePasaje(String costoDePasaje) {
        this.costoDePasaje = costoDePasaje;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDelDescuento() {
        return motivoDelDescuento;
    }

    public void setMotivoDelDescuento(String motivoDelDescuento) {
        this.motivoDelDescuento = motivoDelDescuento;
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
