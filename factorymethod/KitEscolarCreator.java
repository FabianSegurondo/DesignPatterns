package ejericiciosPractica.factorymethod;

public class KitEscolarCreator extends CreatorKits{

    @Override
    public KitEscolarConcreteProduct create() {
        Mochila mochilaescolar = new Mochila();
        mochilaescolar.setNumeroBolsillos("7 bolsillos");
        mochilaescolar.setTamano("mediana");

        Deportivo deportivoescolar = new Deportivo();
        deportivoescolar.setTalla("talla xl");
        deportivoescolar.setColor("Color caki");
        deportivoescolar.setNumeroPrendas(5);

        Cuaderno cuadernoescolar = new Cuaderno();
        cuadernoescolar.setTipo("matematica");
        cuadernoescolar.setNumeroHojas(120);

        KitEscolarConcreteProduct kitescolar = new KitEscolarConcreteProduct();
        kitescolar.setMochila(mochilaescolar);
        kitescolar.setDeportivo(deportivoescolar);
        kitescolar.setCuaderno(cuadernoescolar);

        return kitescolar;
    }
}
