package iterator.ejercicio.empresaSoftware;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Client {
    public static void main(String[]args){

        NombreEmpleado empleado1=new NombreEmpleado("Fabo segu");
        NombreEmpleado empleado2=new NombreEmpleado("sebita blakcy");
        NombreEmpleado empleado3=new NombreEmpleado("felipe felipao");
        NombreEmpleado empleado4=new NombreEmpleado("darien max");
        NombreEmpleado empleado5=new NombreEmpleado("welascatto");
        NombreEmpleado empleado6=new NombreEmpleado("Lucilla");
        NombreEmpleado empleado7=new NombreEmpleado("blanquita suarez");
        NombreEmpleado empleado8=new NombreEmpleado("jechus jebus");
        NombreEmpleado empleado9=new NombreEmpleado("piggy arteaga");
        NombreEmpleado empleado10=new NombreEmpleado("lucio gabriel");
        NombreEmpleado empleado11=new NombreEmpleado("Josepe riber");
        NombreEmpleado empleado12=new NombreEmpleado("Juanito mamani");
        NombreEmpleado empleado13=new NombreEmpleado("fredo ojas");
        NombreEmpleado empleado14=new NombreEmpleado("isita bella");
        NombreEmpleado empleado15=new NombreEmpleado("chechu schroder");
        NombreEmpleado empleado16=new NombreEmpleado("oscar mobster");
        NombreEmpleado empleado17=new NombreEmpleado("aldito oca");
        NombreEmpleado empleado18=new NombreEmpleado("canelo alveraz");
        NombreEmpleado empleado19=new NombreEmpleado("steve pizzas");
        NombreEmpleado empleado20=new NombreEmpleado("chechu ascarrunz");



        Map<String,Object> mapaDeEmpleadosEmpresaSoftware =new HashMap<String,Object>();

        ListaPrimeraEmpresa listaEmpleadosPrimeraEmpresa=new ListaPrimeraEmpresa();
        listaEmpleadosPrimeraEmpresa.add(empleado1);
        listaEmpleadosPrimeraEmpresa.add(empleado2);
        listaEmpleadosPrimeraEmpresa.add(empleado3);
        listaEmpleadosPrimeraEmpresa.add(empleado4);
        listaEmpleadosPrimeraEmpresa.add(empleado5);

        ListaSegundaEmpresa listaEmpleadosSegundaEmpresa=new ListaSegundaEmpresa();
        listaEmpleadosSegundaEmpresa.add(empleado6);
        listaEmpleadosSegundaEmpresa.add(empleado7);
        listaEmpleadosSegundaEmpresa.add(empleado8);
        listaEmpleadosSegundaEmpresa.add(empleado9);
        listaEmpleadosSegundaEmpresa.add(empleado10);

        ListaTerceraEmpresa listaEmpleadosTerceraEmpresa=new ListaTerceraEmpresa();
        listaEmpleadosTerceraEmpresa.add(empleado11);
        listaEmpleadosTerceraEmpresa.add(empleado12);
        listaEmpleadosTerceraEmpresa.add(empleado13);
        listaEmpleadosTerceraEmpresa.add(empleado14);
        listaEmpleadosTerceraEmpresa.add(empleado15);

        ListaCuartaEmpresa listaEmpleadosCuartaEmpresa=new ListaCuartaEmpresa();
        listaEmpleadosCuartaEmpresa.add(empleado16);
        listaEmpleadosCuartaEmpresa.add(empleado17);
        listaEmpleadosCuartaEmpresa.add(empleado18);
        listaEmpleadosCuartaEmpresa.add(empleado19);
        listaEmpleadosCuartaEmpresa.add(empleado20);

        int count=1;
        System.out.println("Lista de Empleados de primera empresa empleando una lista");
        IteratorEmpresas iterator=listaEmpleadosPrimeraEmpresa.iterator();
        while (iterator.hasNext()){
            Object nombreEmpleado =iterator.next();
            mapaDeEmpleadosEmpresaSoftware .put(Integer.toString(count++),nombreEmpleado);
            System.out.println("Nombre del empleado: "+ nombreEmpleado);
        }

        System.out.println("Lista de Empleados de segunda empresa empleando un Array");
        IteratorEmpresas iterator2=listaEmpleadosSegundaEmpresa.iterator();
        while (iterator2.hasNext()){
            Object nombreEmpleado=iterator2.next();
            mapaDeEmpleadosEmpresaSoftware .put(Integer.toString(count++),nombreEmpleado);
            System.out.println("Nombre del empleado: "+nombreEmpleado);
        }

        System.out.println("Lista de Empleados de tercera empresa empleando un vector");
        IteratorEmpresas iterator3=listaEmpleadosTerceraEmpresa.iterator();
        while (iterator3.hasNext()){
            Object nombreEmpleado=iterator3.next();
            mapaDeEmpleadosEmpresaSoftware .put(Integer.toString(count++),nombreEmpleado);
            System.out.println("Nombre del empleado: "+nombreEmpleado);
        }

        System.out.println("Lista de Empleados de cuarta empresa empleando un stack");
        IteratorEmpresas iterator4=listaEmpleadosCuartaEmpresa.iterator();
        while (iterator4.hasNext()){
            Object nombreEmpleado=iterator4.next();
            mapaDeEmpleadosEmpresaSoftware .put(Integer.toString(count++),nombreEmpleado);
            System.out.println("Nombre del empleado: "+nombreEmpleado);
        }

    }
}
