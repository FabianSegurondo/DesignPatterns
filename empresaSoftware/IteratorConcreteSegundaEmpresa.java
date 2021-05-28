package iterator.ejercicio.empresaSoftware;

public class IteratorConcreteSegundaEmpresa  implements IteratorEmpresas {

    private NombreEmpleado[] nombresEmpleados;
    private int checkPosition;

    public IteratorConcreteSegundaEmpresa(NombreEmpleado[]nombresEmpleados){
        this.nombresEmpleados = nombresEmpleados;
    }

    @Override
    public Object next() {
        return nombresEmpleados[checkPosition++].getNombre();
    }

    @Override
    public boolean hasNext() {
        return nombresEmpleados.length !=0 && checkPosition < nombresEmpleados.length;
    }
}
