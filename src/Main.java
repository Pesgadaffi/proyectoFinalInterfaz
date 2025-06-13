import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(100);
        int opcion;

        do {
            System.out.println("\n--- MENÚ INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Buscar producto");
            System.out.println("5. Salir");

            opcion = Utilidades.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    int id = Utilidades.leerEntero("ID: ");
                    String nombre = leerTexto("Nombre: ");
                    int cantidad = Utilidades.leerEntero("Cantidad: ");
                    double precio = Utilidades.leerDouble("Precio: ");
                    int tipo = Utilidades.leerEntero("¿Es electrónico? (1 = Sí, 0 = No): ");

                    if (tipo == 1) {
                        int garantia = Utilidades.leerEntero("Meses de garantía: ");
                        inventario.agregarProducto(new Electronico(id, nombre, cantidad, precio, garantia));
                    } else {
                        inventario.agregarProducto(new Producto(id, nombre, cantidad, precio));
                    }
                    break;
                case 2:
                    inventario.mostrarProductos();
                    break;
                case 3:
                    int idEliminar = Utilidades.leerEntero("ID del producto a eliminar: ");
                    inventario.eliminarProducto(idEliminar);
                    break;
                case 4:
                    int idBuscar = Utilidades.leerEntero("ID del producto a buscar: ");
                    Producto prod = inventario.buscarProducto(idBuscar);
                    if (prod != null) prod.mostrarInformacion();
                    else System.out.println("Producto no encontrado.");
                    break;
                case 5:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return new Scanner(System.in).nextLine();
    }
}