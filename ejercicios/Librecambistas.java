package ejercicios;


public class Librecambistas {
    public Librecambistas(){

    }
    public void cambiarDinero(String moneda,double cantidad){
        System.out.println("lugar de cambio: Librecambistas" );
        CasaDeCambios.getInstance().getMoney(moneda, cantidad);
    }

}
