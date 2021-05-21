package factoryMethod.ejercicios.aerolinea;

public class Avion {
    private String marca;
    private String capacidad;
    private String modelo;
    private String numeroAsientos;


    public Avion(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(String numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public void showInfo() {
        System.out.println("Marca del avion: " + marca);
        System.out.println("Capacidad del avion: " + capacidad);
        System.out.println("Modelo del avion: " + modelo);
        System.out.println("Numero de asientos del avion: " + numeroAsientos);

    }
}
