public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(int id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setPrecio(double precio) { this.precio = precio; }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: $" + precio);
    }
}