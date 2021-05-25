package Builder.ejercicios.pizzeria;


import Builder.ejercicios.pizzeria.BuilderPizza;
import Builder.ejercicios.pizzeria.Pizza;

public class Restaurante {
    private BuilderPizza builderPizza;
    public void setBuilderPizza(BuilderPizza builderPizza){
        this.builderPizza = builderPizza;
    }
    public Pizza getPizza(){
        return builderPizza.getPizza();
    }

    public void armarPizza(){
        this.builderPizza.createPizza();
        this.builderPizza.buildIngredientes();
        this.builderPizza.buildTipoQueso();
        this.builderPizza.buildTipoMasa();
    }
}
