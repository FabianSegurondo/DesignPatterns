package ejercicios;


public class CambioDeMonedas {
    public CambioDeMonedas(){

    }
    public void cambiarDinero(String moneda, double cantidad){
        System.out.println("lugar de cambio: CambioCasadeMonedas" );
        CasaDeCambios.getInstance().getMoney(moneda, cantidad);
    }

}
