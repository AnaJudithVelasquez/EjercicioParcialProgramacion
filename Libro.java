
import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.numEjemplares = 0;
        this.numEjemplaresPrestados = 0;
    }

   
    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    
    public boolean prestar(int cantidad) {
        if (cantidad > 0 && numEjemplares >= cantidad) {
            numEjemplares -= cantidad;
            numEjemplaresPrestados += cantidad;
            return true;
        }
        return false;
    }

  
    public boolean devolver(int cantidad) {
        if (cantidad > 0 && numEjemplaresPrestados >= cantidad) {
            numEjemplares += cantidad;
            numEjemplaresPrestados -= cantidad;
            return true;
        }
        return false;
    }


    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ejemplares: " + numEjemplares + ", Prestados: " + numEjemplaresPrestados;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 10, 2);
        
        
        System.out.println("Ingrese el título del libro2: ");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro2: ");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el número de ejemplares del libro2: ");
        int numEjemplares = scanner.nextInt();
        System.out.println("Ingrese el número de ejemplares prestados del libro2: ");
        int numEjemplaresPrestados = scanner.nextInt();
        
        Libro libro2 = new Libro(titulo, autor, numEjemplares, numEjemplaresPrestados);
        
      
        System.out.println(libro1);
        System.out.println(libro2);
        
        
        System.out.println("Ingrese la cantidad de ejemplares a prestar de libro1: ");
        int cantidadPrestar1 = scanner.nextInt();
        System.out.println("Prestando libro1: " + libro1.prestar(cantidadPrestar1));
        System.out.println(libro1);
        
        System.out.println("Ingrese la cantidad de ejemplares a devolver de libro1: ");
        int cantidadDevolver1 = scanner.nextInt();
        System.out.println("Devolviendo libro1: " + libro1.devolver(cantidadDevolver1));
        System.out.println(libro1);
        
      
        System.out.println("Ingrese la cantidad de ejemplares a prestar de libro2: ");
        int cantidadPrestar2 = scanner.nextInt();
        System.out.println("Prestando libro2: " + libro2.prestar(cantidadPrestar2));
        System.out.println(libro2);
        
        System.out.println("Ingrese la cantidad de ejemplares a devolver de libro2: ");
        int cantidadDevolver2 = scanner.nextInt();
        System.out.println("Devolviendo libro2: " + libro2.devolver(cantidadDevolver2));
        System.out.println(libro2);
        
        scanner.close();
    }
}

