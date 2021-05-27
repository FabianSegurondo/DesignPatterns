package interpreter.ejercicio;

public class Client {
    public static void main(String[] args) {

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        String interpretarNumerosNaturales="1 2 3 4 5 6 7 8 9 10";
        InterpreterOperaciones numerosRomanos = new InterpreterOperaciones(interpretarNumerosNaturales);
        String interpretado = numerosRomanos.interpretar();
        System.out.println("Interpretacion: "+ interpretarNumerosNaturales);
        System.out.println("Interpretado: "+ interpretado);



        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        String interpretarNumerosNaturales2="10 9 8 7 6 5 4 3 2 1";
        InterpreterOperaciones numerosRomanos2 = new InterpreterOperaciones(interpretarNumerosNaturales2);
        String interpretado1 = numerosRomanos2.interpretar();
        System.out.println("Interpretacion: "+ interpretarNumerosNaturales2);
        System.out.println("Interpretado: "+ interpretado1);


    }
}
