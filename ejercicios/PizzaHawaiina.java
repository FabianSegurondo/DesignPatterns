package Builder.ejercicios;

public class PizzaHawaiina  extends BuilderPizza{

    @Override
    public void buildTipoQueso() {
        pizza.setTipoQueso("queso mozzarella tipo normal");
    }

    @Override
    public void buildTipoMasa() {
        pizza.setTipoMasa("masa especial con doble crust");
    }

    public void buildIngredientes(){
        pizza.setIngredientes("jamon, pinas, salsa de tomate, otros");
    }

}
