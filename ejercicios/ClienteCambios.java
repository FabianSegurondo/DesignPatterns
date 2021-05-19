package ejercicios;


public class ClienteCambios {
    public static void main (String [] argumento ){

        Thread cliente1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco bancoLapaz = new Banco();
                bancoLapaz.cambiarDinero("dolares", 10);
            }
        });
        Thread cliente2 = new Thread(new Runnable() {
            @Override
            public void run() {
                CambioDeMonedas moneyGram = new CambioDeMonedas();
                moneyGram.cambiarDinero("bolivianos",100);

            }
        });
        Thread cliente3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Librecambistas esquinaCaja= new Librecambistas();
                esquinaCaja.cambiarDinero("euros",300);
            }
        });
        cliente1.start();
        cliente3.start();
        cliente2.start();
    }
}
