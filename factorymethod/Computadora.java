package ejericiciosPractica.factorymethod;

public class Computadora {
    private String marca;
    private String OperatingSystem;

    public Computadora(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }
    public void showDatos(){
        System.out.println("La marca de la computadora es: " + marca);
        System.out.println("El sistema operativo es: " + OperatingSystem);
    }
}
