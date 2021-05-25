package Builder.ejercicios;



public class Client {
  public static void main(String[] args) {
        Restaurante pizzaCozzolizi = new Restaurante();
        PizzaCarnivora pizzaCarnivora = new PizzaCarnivora();
        PizzaClasica pizzaClasica = new PizzaClasica();
        PizzaHawaiina pizzaHawaiina = new PizzaHawaiina();

      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
      pizzaCozzolizi.setBuilderPizza(pizzaCarnivora);
      pizzaCozzolizi.armarPizza();

      Pizza PizzaCarnivora = pizzaCozzolizi.getPizza();
      PizzaCarnivora.showData();

      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
      pizzaCozzolizi.setBuilderPizza(pizzaClasica);
      pizzaCozzolizi.armarPizza();

      Pizza PizzaClasica = pizzaCozzolizi.getPizza();
      PizzaClasica.showData();

      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
      pizzaCozzolizi.setBuilderPizza(pizzaHawaiina);
      pizzaCozzolizi.armarPizza();

      Pizza PizzaHawaiina = pizzaCozzolizi.getPizza();
      PizzaHawaiina.showData();
    }
}
