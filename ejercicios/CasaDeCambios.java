package ejercicios;


    public class CasaDeCambios {
        private static CasaDeCambios instance = null;
        // private double cambio;
        // private double cambio2;

        private CasaDeCambios() {

            System.out.println("INFO> monto de cambio: ");
        }

        public static synchronized void makeInstance() {
            if (instance == null)
                instance = new CasaDeCambios();
        }

        public static CasaDeCambios getInstance() {
            if (instance == null)
                makeInstance();
            return instance;
        }

        public synchronized void getMoney(String tipomoneda, double amount) {

            if (amount > 0 && tipomoneda == "dolares") {
                System.out.println("*****monto: " + amount);
                System.out.println("Cambio a bolivianos");
                amount = amount * 6.96;
                System.out.println(" moneda cambiada a bolivianos -->: " + amount);

            } else if (amount > 0 && tipomoneda == "bolivianos") {


                System.out.println("***** monto: " + amount);
                System.out.println("Cambio a dolares");
                amount = amount / 6.96;
                System.out.println("moneda cambiada a dolares -->: " + amount);

            } else if (amount > 0 && tipomoneda == "euros") {


                System.out.println("***** monto: " + amount);
                System.out.println("Cambio a dolares");
                amount = amount * 1.293;
                System.out.println("INFOR > moneda cambiada a dolares -->: " + amount);
            } else {
                System.out.println("WARN >--- No existe la cantidad: " + amount + "no hay cambio: " + amount);
            }
        }
    }
