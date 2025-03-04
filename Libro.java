
public class Libro{

    String titulo;
    String autor;
    int numEjemplar;           
    int numEjemplarPrestado;
    

    public Libro(){

    }

    public Libro(String titulo, String autor,int numEjemplar, int numEjemplarPrestado){
    this.titulo = titulo;
    this.autor = autor;
    this.numEjemplar = numEjemplar;
    this.numEjemplarPrestado = numEjemplarPrestado;
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

public int getnumEjemplar() {
    return numEjemplar;
}

public void setnumEjemplar(int numEjemplar) {
    this.numEjemplar = numEjemplar;
}

public int getnumEjemplarPrestado() {
    return numEjemplarPrestado;
}

public void setnumPrestado(int numEjemplarPrestado) {
    this.numEjemplarPrestado = numEjemplarPrestado;
}

public int consulta(){
    return numEjemplar;
}

public void realizarPrestamo(int numEjemplarPrestado){
    if (numEjemplarPrestado > 0){
       numEjemplar -= numEjemplarPrestado;
       }
}

public void realizarDevolucion(int numEjemplarPrestado){
  if (numEjemplarPrestado > 0){
      numEjemplar += numEjemplarPrestado;
 }

  }

  public void mostrarDatos(){
    System.out.println("Titulo: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Ejemplares totales: " + consulta());
  }

  public static void main(String[] args) { 
     

    Libro libro1 = new Libro("El señor de los anillos", "Sara Lucia", 20, 2);
    
    libro1.realizarPrestamo(4);
    libro1.realizarDevolucion(3);

    libro1.mostrarDatos();

  }


}