package Builder.ejercicios.pizzeria;

public class Pizza {
    private String tipoMasa;
    private String tipoQueso;
    private String ingredientes;

    public Pizza(){}

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void showData(){
        System.out.println("ingredientes de la pizza: " + ingredientes);
        System.out.println("Tipo de queso en  la pizza: " + tipoQueso);
        System.out.println("Tipo de masa en  la pizza: " + tipoMasa);
    }
}
