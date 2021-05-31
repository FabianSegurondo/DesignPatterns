package ejericiciosPractica.factorymethod;

public class Libro {
    private String tipo;
    private String autor;

    public Libro(){

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void showDatos(){
        System.out.println("El tipo de libro es: " + tipo);
        System.out.println("El autor del libro es: " + autor);
    }
}
