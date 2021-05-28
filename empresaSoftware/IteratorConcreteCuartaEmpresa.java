package iterator.ejercicio.empresaSoftware;

import java.util.Stack;

public class IteratorConcreteCuartaEmpresa implements IteratorEmpresas {

    private Stack<NombreEmpleado> nombresEmpleados;
    private int checkPosition;

    public IteratorConcreteCuartaEmpresa(Stack<NombreEmpleado> nombresEmpleados){
        this.nombresEmpleados = nombresEmpleados;
        checkPosition = 0;
    }


    @Override
    public Object next() {
        return nombresEmpleados.get(checkPosition++).getNombre();
    }

    @Override
    public boolean hasNext() {
        return this.nombresEmpleados.size() != 0  && checkPosition<this.nombresEmpleados.size();
    }
}
