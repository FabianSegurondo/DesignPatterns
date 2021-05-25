package Builder.ejercicios;

public class PizzaClasica  extends BuilderPizza{

    @Override
    public void buildTipoQueso() {
        pizza.setTipoQueso("doble queso mozzarella tipo3");
    }

    @Override
    public void buildTipoMasa() {
        pizza.setTipoMasa("masa especial tipo 1");
    }

    public void buildIngredientes(){
        pizza.setIngredientes("salsa de tomate, otros");
    }

}
