package ejericiciosPractica.factorymethod;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        CreatorKits kitescolar = new KitEscolarCreator();
        kitescolar.create().crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        CreatorKits kitcolegial = new KitColegialCreator();
        kitcolegial.create().crear();
    }
}
