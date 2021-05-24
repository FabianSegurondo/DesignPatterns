package abstractFactory.ejercicios.heladeriaAbstract;


public class FactoryHelado {
    public enum typeHelado {
        HELADO_AGUA, HELADO_CREMA, HELADO_MIXTO
    }
    public static IHelado make (typeHelado type){
        IHelado helado;
        switch (type){
            case HELADO_AGUA:
                helado = new HeladoAgua();
                ((HeladoAgua) helado).setFruta(new Fruta("Tropical", "Mango", "10 bs", "grande"));
                ((HeladoAgua) helado).setBase(new Base("Galleta", "Mediana", "Comestible", "5 bs"));
                break;
            case HELADO_CREMA:
                helado = new HeladoCrema();
                break;
            case HELADO_MIXTO:
                helado = new HeladoMixto();
                break;
            default:
                helado = new HeladoMixto();
                break;
        }
        return helado;
        }
    }

