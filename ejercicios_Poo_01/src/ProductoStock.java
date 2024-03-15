public class ProductoStock {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;



    //constructor
    public ProductoStock(int id, String nombre, String descripcion, double precio, int stock){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.stock=stock;
    }
    //metodos

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void añadirStock(int cantidad){
        this.stock+=cantidad;
    }
    public  void retirarStock(int cantidad){
        this.stock-=cantidad;
    }
    @Override
    public String toString() {
        return "ProductoStock{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
