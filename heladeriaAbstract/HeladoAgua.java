package abstractFactory.ejercicios.heladeriaAbstract;


public class HeladoAgua implements IHelado {

    private String tamano;
    private String forma;
    private Fruta  fruta;
    private Base base;

    public HeladoAgua(){

    }
    @Override
    public void crear() {
        System.out.println("helado agua - tamano: "+ tamano);
        System.out.println("helado agua - forma: "+ forma);
        fruta.showInfo();
        base.showInfo();
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}
