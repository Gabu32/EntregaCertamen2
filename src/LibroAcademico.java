public class LibroAcademico extends Libro{
    private String categoria;

    public LibroAcademico(){

    }
    public LibroAcademico(String titulo, String autor, int precio, int ID, String categoria) {
        super(titulo, autor, precio, ID);
        this.categoria = categoria;
    }

    public void insertarDatos(){
        super.libros.add(this);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String imprimirDatos(){
        return super.imprimirDatos() + "Categoria: "+categoria;
    }
}
