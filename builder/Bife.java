package ejericiciosPractica.builder;

public class Bife extends BuilderParrillas {

    @Override
    public void buildtipoDeCarne() {
        parrillaCarne.setTipoDeCarne("BIFE");
    }

    @Override
    public void buildSaborRefresco() {
        parrillaCarne.setSaborRefresco("CocaCola");
    }

    @Override
    public void buildGuarniciones() {
        parrillaCarne.setGuarniciones("Papas Fritas");
    }
}
