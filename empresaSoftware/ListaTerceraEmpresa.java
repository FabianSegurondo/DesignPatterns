package iterator.ejercicio.empresaSoftware;

import java.util.Vector;

public class ListaTerceraEmpresa implements IList {
    private Vector<NombreEmpleado> nombresEmpleados ;

    public ListaTerceraEmpresa(){
        nombresEmpleados = new Vector<>();
    }
    public void add(NombreEmpleado value){
        nombresEmpleados.add(value);
    }

    @Override
    public IteratorConcreteTerceraEmpresa iterator() {
        return new IteratorConcreteTerceraEmpresa(this.nombresEmpleados);
    }
}
