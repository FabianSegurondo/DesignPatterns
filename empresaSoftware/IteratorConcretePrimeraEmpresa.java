package iterator.ejercicio.empresaSoftware;


import java.util.List;

public class IteratorConcretePrimeraEmpresa implements IteratorEmpresas {
    private List<NombreEmpleado> nombresEmpleados;
    private int checkPosition;

    public IteratorConcretePrimeraEmpresa(List<NombreEmpleado> nombresEmpleados){
        this.nombresEmpleados =nombresEmpleados;
        this.checkPosition =0;
    }


    @Override
    public Object next() {
        return this.nombresEmpleados.get(checkPosition++).getNombre();
    }

    @Override
    public boolean hasNext() {
        return this.nombresEmpleados.size() !=0 && this.nombresEmpleados.size() > checkPosition;
    }
}
