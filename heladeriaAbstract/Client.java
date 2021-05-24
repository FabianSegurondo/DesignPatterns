package abstractFactory.ejercicios.heladeriaAbstract;


public class Client {
    public static void main (String []args){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        HeladoAgua h1= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        h1.setTamano("Helado Grande");
        h1.setForma("EN CONO");
        h1.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        HeladoAgua h2= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        h2.setTamano("Helado chico");
        h2.setFruta(new Fruta("Bosque", "Moras", "15 bs", "mediano"));
        h2.setForma("En VASITO");
        h2.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        HeladoAgua h3= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        h3.setTamano("Helado Mediano");
        h3.setForma("EN TAPPER");
        h3.setBase(new Base("Gallteon", "Mediano", "Comestible", "12 bs"));
        h3.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        HeladoCrema h11= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        h11.setTamano("Helado Grande");
        h11.setForma("EN CONO");
        h11.setCrema(new Crema("Dulce de leche", "15 bs", "Donofrio"));
        h11.setFruta(new Fruta("Topical", "Nranaja", "10 bs", "grande"));
        h11.setBase(new Base("Galleton", "grande", "comestible", "10 bs"));
        h11.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        HeladoCrema h12= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        h12.setTamano("Helado Chico");
        h12.setForma("EN VASITO");
        h12.setCrema(new Crema("Manjar", "5 bs", "Pil"));
        h12.setFruta(new Fruta("Enlatada", "Durazno", "13 bs", "Medianao"));
        h12.setBase(new Base("plastico", "grande", "no comestible", "10 bs"));
        h12.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        HeladoCrema h13= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        h13.setTamano("Helado Mediano");
        h13.setForma("EN VASITO DE GALLETA");
        h13.setCrema(new Crema("Limon", "3 bs", "SOYMILK"));
        h13.setFruta(new Fruta("Tropical", "LIMA", "7 bs", "Grande"));
        h13.setBase(new Base("Galleta", "Grande", "comestible", "17 bs"));
        h13.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        HeladoMixto h21= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        h21.setCosto("12 bs");
        h21.setTamano("Helado Grande");
        h21.setForma("EN CONO");
        h21.setCrema(new Crema("Dulce de leche", "15 bs", "Donofrio"));
        h21.setFruta(new Fruta("Tropical", "LIMON", "9 bs", "Grande"));
        h21.setBase(new Base("Galleta", "Grande", "comestible", "17 bs"));
        h21.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        HeladoMixto h22= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        h22.setCosto("3 bs");
        h22.setTamano("Helado Chico");
        h22.setForma("EN VASO PLASTICO");
        h22.setBase(new Base("VASO plastico", "Chico", "plastico", "1 bs"));
        h22.setFruta(new Fruta("Tropical", "MANDARINA", "2 bs", "Grande"));
        h22.setCrema(new Crema("Limon", "3 bs", "SOYMILK"));
        h22.crear();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        HeladoMixto h23= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        h23.setCosto("52 bs");
        h23.setTamano("Helado Familiar");
        h23.setForma("EN TAPPER COMESTIBLE");
        h23.setCrema(new Crema("Esencia de vainilla", "35 bs", "Donofrio"));
        h23.setFruta(new Fruta("Del bosque", "Frutos rojos", "18 bs", "mediano"));
        h23.setBase(new Base("VASO ", "MEDIANO", "NORMAL", "1 bs"));
        h23.crear();

    }
}
