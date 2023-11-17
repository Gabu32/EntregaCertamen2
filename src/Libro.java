import java.util.ArrayList;

class Libro {
    private String titulo;
    private String autor;
    private int precio;
    private int ID;
    public ArrayList<Libro> libros = new ArrayList<>();

    public Libro(){
    };
    public Libro(String titulo, String autor, int precio, int ID) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Libro buscarLibro(int IDBuscado) {
        for (Libro libro : libros) {
            if(libro.ID == IDBuscado) {
                return libro;
            }
        }
        return null;
    }

    public void insertarDatos(String titulo, String autor, int precio, int ID, int tipo, String adicional){
        Libro nuevoLibro = null;

        switch (tipo){
            case 1:
                nuevoLibro = new LibroAcademico(titulo, autor, precio, ID, adicional);
                break;

            case 2:
                nuevoLibro = new Novelas(titulo, autor, precio, ID, adicional);
                break;

            case 3:
                nuevoLibro = new LibroPUCV(titulo, autor, precio, ID, adicional);
                break;
        }
        libros.add(nuevoLibro);
    }

    public String imprimirDatos() {
        return ID+ " Libro: " + titulo + " | Autor: " + autor + " | Precio: $" + precio + " |";
    }
}

