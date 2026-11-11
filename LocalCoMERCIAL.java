public class LocalCoMERCIAL extends Inmueble {
    boolean vidriera;
    String zonificacion;
    public LocalCoMERCIAL(String direccion, double superficieMetros2, double precioBase,
                            boolean vidriera, String zonificacion) {
            super(direccion, superficieMetros2, precioBase);
            this.vidriera = vidriera;
            this.zonificacion = zonificacion;
        }
    @Override
    public double calcularTasacion() {
        double tasacion = superficieMetros2 * precioBase;
        if (vidriera) {
            tasacion = tasacion +(tasacion * 0.20);
        }
        if (zonificacion.equals("comercial")) {
            tasacion = tasacion + (tasacion * 0.15);
        }
        return tasacion;
    }
}
