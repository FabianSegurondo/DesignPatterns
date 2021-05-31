package ejericiciosPractica.factorymethod;

public class Mochila {
    private String numeroBolsillos;
    private String tamano;

    public Mochila(){

    }

    public String getNumeroBolsillos() {
        return numeroBolsillos;
    }

    public void setNumeroBolsillos(String numeroBolsillos) {
        this.numeroBolsillos = numeroBolsillos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public void showDatos(){
        System.out.println("el numero de bolsillos de la mochila es: " + numeroBolsillos);
        System.out.println("El tamano de la mochila es: " + tamano);
    }
}
