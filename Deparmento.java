public class Deparmento extends Inmueble {
    double expensasMnesuales;
    int piso;
    public Deparmento(String direccion, double superficieMetros2, double precioBase, double expensasMnesuales, int piso) {
        super(direccion, superficieMetros2, precioBase);
        this.expensasMnesuales = expensasMnesuales;
        this.piso = piso;
    }
    @Override
    public double calcularTasacion() {
        return (superficieMetros2 * precioBase) + (expensasMnesuales * 12) + (piso * 5000);
    }
}
