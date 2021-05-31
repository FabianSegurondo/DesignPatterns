package ejericiciosPractica.factorymethod;

public class Cuaderno {
    private String tipo;
    private int numeroHojas;
    public Cuaderno(){

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }
    public void showDatos(){
        System.out.println("El tipod de cuaderno es: " + tipo);
        System.out.println("El numero de hoja es de: " + numeroHojas);

    }
}
