package ejericiciosPractica.builder;

public class Lomito extends BuilderParrillas {
    @Override
    public void buildtipoDeCarne() {
        parrillaCarne.setTipoDeCarne("Lomito");
    }

    @Override
    public void buildSaborRefresco() {
        parrillaCarne.setSaborRefresco("Pecpsi");
    }

    @Override
    public void buildGuarniciones() {
        parrillaCarne.setGuarniciones("arrouz");
    }
}
