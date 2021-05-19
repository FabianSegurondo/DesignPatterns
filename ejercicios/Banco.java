package ejercicios;

public class Banco {
    public Banco( ){

    }
    public void cambiarDinero(String moneda,double cantidad){
        System.out.println("lugar de cambio: Banco" );
        CasaDeCambios.getInstance().getMoney(moneda, cantidad);
    }
}

