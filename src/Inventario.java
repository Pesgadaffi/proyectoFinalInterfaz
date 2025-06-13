public class Inventario {
    private Producto[] productos;
    private int contador;

    public Inventario(int tamaño) {
        productos = new Producto[tamaño];
        contador = 0;
    }

    public void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            productos[contador++] = producto;
            System.out.println("Producto agregado exitosamente.");
        } else {
            System.out.println("Inventario lleno.");
        }
    }

    public Producto[] getProductos() {
    return productos;
}


    public void mostrarProductos() {
        for (int i = 0; i < contador; i++) {
            productos[i].mostrarInformacion();
            System.out.println("-----------");
        }
    }

    public boolean eliminarProducto(int id) {
    for (int i = 0; i < contador; i++) {
        if (productos[i].getId() == id) {
            
            for (int j = i; j < contador - 1; j++) {
                productos[j] = productos[j + 1];
            }
            productos[contador - 1] = null; // Eliminar el último (se duplicaban al eliminar un objeto)
            contador--;
            return true;
        }
    }
    return false;
}

    public Producto buscarProducto(int id) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getId() == id) return productos[i];
        }
        return null;
    }
}
