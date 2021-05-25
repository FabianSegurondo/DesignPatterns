package Builder.ejercicios.pizzeria;

import Builder.ejercicios.pizzeria.BuilderPizza;

public class PizzaCarnivora  extends BuilderPizza {

    @Override
    public void buildTipoQueso() {
    pizza.setTipoQueso("queso mozzarella tipo2");
    }

    @Override
    public void buildTipoMasa() {
    pizza.setTipoMasa("masa especial");
    }

    public void buildIngredientes(){
        pizza.setIngredientes("carne, salsa de tomate, otros");
    }


}
