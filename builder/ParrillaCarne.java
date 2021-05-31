package ejericiciosPractica.builder;

public class ParrillaCarne {
    private String tipoDeCarne;
    private String SaborRefresco;
    private String Guarniciones;

    public ParrillaCarne(){

    }

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborRefresco() {
        return SaborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        SaborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return Guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        Guarniciones = guarniciones;
    }
    public void showEspecialidades(){
        System.out.println("El tipo de carne es: " + tipoDeCarne);
        System.out.println("El sabor del refresco es: " + SaborRefresco);
        System.out.println("Las guarniciones de este plato son: " + Guarniciones);
    }
}
