package ejericiciosPractica.builder;

public class Tira  extends BuilderParrillas{
    @Override
    public void buildtipoDeCarne() {
        parrillaCarne.setTipoDeCarne("Tira");
    }

    @Override
    public void buildSaborRefresco() {
        parrillaCarne.setSaborRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        parrillaCarne.setGuarniciones("Fidesucho");
    }
}
