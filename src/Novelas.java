public class Novelas extends Libro{
    String tipo;

    public Novelas(){

    }
    public Novelas(String titulo, String autor, int precio, int ID, String tipo) {
        super(titulo, autor, precio, ID);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String imprimirDatos(){
        return super.imprimirDatos() + "Tipo: "+tipo;
    }
}
