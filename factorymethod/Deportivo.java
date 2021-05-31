package ejericiciosPractica.factorymethod;

public class Deportivo {
    private String talla;
    private String color;
    private int numeroPrendas;

    public Deportivo(){

    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPrendas() {
        return numeroPrendas;
    }

    public void setNumeroPrendas(int numeroPrendas) {
        this.numeroPrendas = numeroPrendas;
    }
    public void showDatos(){
        System.out.println("La talla del deportivo es: " + talla);
        System.out.println("El color es: " + color);
        System.out.println("El numero de prendas es: " + numeroPrendas);
    }
}