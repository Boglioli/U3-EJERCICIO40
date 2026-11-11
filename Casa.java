public class Casa extends  Inmueble {
    double SuperficiePatio;
    int cantidadPlantas;
    public Casa(String direccion, double superficieMetros2, double precioBase, double SuperficiePatio, int cantidadPlantas) {
        super(direccion, superficieMetros2, precioBase);
        this.SuperficiePatio = SuperficiePatio;
        this.cantidadPlantas = cantidadPlantas;
    }
    @Override
    public double calcularTasacion() {
        return (superficieMetros2 * precioBase) + (SuperficiePatio * precioBase * 0.3) + (cantidadPlantas * 10000);
    }
}
