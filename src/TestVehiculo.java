public class TestVehiculo {
    public static void main() {

        Coche coche = new Coche("Citroen", "C5", 2001,4);
        Moto moto =new Moto("Suzuki", "SV-7S",2027,645);

        System.out.println("=== INFORMACIÓN DEL COCHE ===");
        coche.mostrarInformacion();

        System.out.println("\n=== INFORMACIÓN DE LA MOTO ===");
        moto.mostrarInformacion();

        System.out.println("\n=== DESCRIPCIÓN CORTA ===");
        System.out.println(coche.descripcionCorta());
        System.out.println(moto.descripcionCorta());

    }
}