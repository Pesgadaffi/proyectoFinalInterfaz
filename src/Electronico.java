public class Electronico extends Producto {
    private int garantiaMeses;

    public Electronico(int id, String nombre, int cantidad, double precio, int garantiaMeses) {
        super(id, nombre, cantidad, precio);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantia() {
    return garantiaMeses;
}


    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }
}
