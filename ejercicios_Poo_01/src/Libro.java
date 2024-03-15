public class Libro {

    //atributos
    private String titulo;
    private String autor;
    private String fechaPublicacion;
    private boolean prestado;

    //constructor
    public Libro(String titulo, String autor, String fechaPublicacion, boolean prestado){
        this.titulo=titulo;
        this.autor=autor;
        this.fechaPublicacion=fechaPublicacion;
        this.prestado=prestado;
    }

    //metodos
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getFechaPublicacion(){
        return this.fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion){
        this.fechaPublicacion=fechaPublicacion;
    }
    public boolean getPrestado(){
        return this.prestado;
    }
    public void setPrestado(boolean prestado){
        this.prestado=prestado;
    }
    public  void cambiarEstadoPrestado(){
        this.prestado=!this.prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
