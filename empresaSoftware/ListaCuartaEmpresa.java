package iterator.ejercicio.empresaSoftware;

import java.util.Stack;

public class ListaCuartaEmpresa implements IList{

    private Stack<NombreEmpleado> nombresEmpleados;
    private int checkPosition;

    public ListaCuartaEmpresa(){
        checkPosition=0;
        nombresEmpleados = new Stack<>();
    }
    public void add(NombreEmpleado value){
        nombresEmpleados.add(checkPosition++, value);
    }


    @Override
    public IteratorConcreteCuartaEmpresa iterator() {
        return new IteratorConcreteCuartaEmpresa(this.nombresEmpleados) ;
    }
}
