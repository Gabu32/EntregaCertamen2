public class LibroPUCV extends Libro{
    private String escuela;

    public LibroPUCV(){

    }
    public LibroPUCV(String titulo, String autor, int precio, int ID, String escuela) {
        super(titulo, autor, precio, ID);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String imprimirDatos(){
        return super.imprimirDatos() + "Escuela de "+escuela;
    }
}
