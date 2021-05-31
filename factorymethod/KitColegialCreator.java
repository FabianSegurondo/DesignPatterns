package ejericiciosPractica.factorymethod;

public class KitColegialCreator extends CreatorKits {

    @Override
    public  KitColegialConcreteProduct create() {
        Mochila mochilacolegial = new Mochila();
        mochilacolegial.setNumeroBolsillos("12");
        mochilacolegial.setTamano("Grande");

        Libro libroscolegial = new Libro();
        libroscolegial.setTipo("Literatura cientifica");
        libroscolegial.setAutor("steven pinker");

        Computadora computadoracolegia = new Computadora();
        computadoracolegia.setMarca("Apple");
        computadoracolegia.setOperatingSystem("mac os x ubuntu");

        KitColegialConcreteProduct kitdeColegial = new KitColegialConcreteProduct();
        kitdeColegial.setMochila(mochilacolegial);
        kitdeColegial.setLibro(libroscolegial);
        kitdeColegial.setComputadora(computadoracolegia);

        return kitdeColegial;
    }
}
