package ejericiciosPractica.factorymethod;

public class KitEscolarConcreteProduct implements IKits  {
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;

    public KitEscolarConcreteProduct(){
        mochila = new Mochila();
        deportivo = new Deportivo();
        cuaderno = new Cuaderno();
    }
    @Override
    public void crear() {
        mochila.showDatos();
        deportivo.showDatos();
        cuaderno.showDatos();
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }
}
