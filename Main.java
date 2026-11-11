public class Main {
    public static void main(String[] args) {
        Inmueble inmueble1 = new LocalCoMERCIAL("Calle Falsa 123", 100, 2000, true, "comercial");
        Inmueble inmueble2 = new Casa("Calle Verdadera 456", 150, 3000, 50, 2);
        Inmueble inmueble3 = new Deparmento("Calle Imaginaria 789", 80, 2500, 500, 3);

        System.out.println("Tasación del Local Comercial: " + inmueble1.calcularTasacion());
        System.out.println("Tasación de la Casa: " + inmueble2.calcularTasacion());
        System.out.println("Tasación del Departamento: " + inmueble3.calcularTasacion());
    }
}
