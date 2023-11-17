import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        Libro libroBuscado = null;

        String[] titulosLibros = {
                "Cien años de soledad",
                "El señor de los anillos",
                "Introducción a la inteligencia artificial",
                "Matar a un ruiseñor",
                "Principios de Economía"
        };

        String[] nombresAutores = {
                "Gabriel García Márquez",
                "J.R.R. Tolkien",
                "Stuart Russell",
                "Harper Lee",
                "N. Gregory Mankiw"
        };

        int[] preciosLibros = { 15000, 12000, 25000, 8000, 20000 };
        int[] tipo = {1, 1, 2, 1, 3};

        String[] adicional = {
                "Fantasia",
                "Fantasia medieval",
                "Informatica",
                "Dramatica",
                "Economia y Comercio"
        };

        for(int i = 0 ; i<5 ; i++){
            libro.insertarDatos(titulosLibros[i], nombresAutores[i], preciosLibros[i], i+1, tipo[i], adicional[i]);
        }

        libroBuscado = libro.buscarLibro(2);
        System.out.println(libroBuscado.imprimirDatos());

    }
}