package iterator.ejercicio.empresaSoftware;

public class ListaSegundaEmpresa implements IList {

    private NombreEmpleado[] nombresEmpleados;
    private int checkPosition;

    public ListaSegundaEmpresa(){
        checkPosition =0;
        nombresEmpleados =new NombreEmpleado[5];
    }

    public void add(NombreEmpleado value){
        nombresEmpleados[checkPosition]=value;
        checkPosition++;
    }
    @Override
    public IteratorConcreteSegundaEmpresa iterator() {
        return new IteratorConcreteSegundaEmpresa(this.nombresEmpleados);
    }
}
