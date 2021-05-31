package ejericiciosPractica.builder;



public class  Restaurante {
    private BuilderParrillas builderParrillas;
    public void setBuilderParrillas(BuilderParrillas builderParrillas){
        this.builderParrillas = builderParrillas;
    }
    public ParrillaCarne getParrillaCarne(){
        return builderParrillas.getParrillaCarne();
    }

    public void especialidadArmado(){
        this.builderParrillas.createParrillaCarne();
        this.builderParrillas.buildtipoDeCarne();
        this.builderParrillas.buildSaborRefresco();
        this.builderParrillas.buildGuarniciones();
    }
}
