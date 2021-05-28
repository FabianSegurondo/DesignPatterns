package iterator.ejercicio.empresaSoftware;

import java.util.Vector;

public class IteratorConcreteTerceraEmpresa  implements IteratorEmpresas {

    private Vector<NombreEmpleado> nombresEmpleados ;
    private int checkPosition;

    public IteratorConcreteTerceraEmpresa(Vector<NombreEmpleado> nombresEmpleados){
        this.nombresEmpleados = nombresEmpleados;
        this.checkPosition =0;
    }

    @Override
    public Object next() {
        return this.nombresEmpleados.get(checkPosition++).getNombre();
    }

    @Override
    public boolean hasNext() {
        return this.nombresEmpleados.size() != 0 && this.nombresEmpleados.size() > checkPosition;
    }
}
