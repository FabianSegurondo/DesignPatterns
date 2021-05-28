package iterator.ejercicio.empresaSoftware;

import java.util.ArrayList;
import java.util.List;

public class ListaPrimeraEmpresa  implements IList {

    private List<NombreEmpleado> nombresEmpleados;

    public ListaPrimeraEmpresa(){

        nombresEmpleados = new ArrayList<NombreEmpleado>();
    }

    public void add(NombreEmpleado value){

        nombresEmpleados.add(value);
    }

    @Override
    public IteratorConcretePrimeraEmpresa iterator() {
        return new IteratorConcretePrimeraEmpresa(nombresEmpleados);
    }
}
