package ejericiciosPractica.builder;


public  abstract class  BuilderParrillas {
    protected ParrillaCarne parrillaCarne;

    public ParrillaCarne getParrillaCarne() {

        return parrillaCarne;
    }

    public void createParrillaCarne(){
        parrillaCarne = new ParrillaCarne();
    }

    public abstract void buildtipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();

}
