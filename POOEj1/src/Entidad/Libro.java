package Entidad;
public class Libro {            //ISBN, Título, Autor, Número de páginas,
    
    private int ISBN;
    public String Título;
    public String Autor;
    public int Npáginas;
    private int energia;
    
    public Libro() {
        energia = 1000;
    }

    public Libro(int ISBN, String Título, String Autor, int Npáginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Npáginas = Npáginas;
        this.energia = 1000; 
    }
    
    public int getISBN(){
    
       return ISBN;
    }
    
    public void setISBN(int ISBN){
    
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNpáginas() {
        return Npáginas;
    }

    public void setNpáginas(int Npáginas) {
        this.Npáginas = Npáginas;
    }
    
    public int leer(int energiaRestar){
        energia-= energiaRestar;
        return energia;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", Np\u00e1ginas=" + Npáginas + ", energia=" + energia + '}';
    }
    

   
    
    
    

    
    
    
    
    
    
    
}
