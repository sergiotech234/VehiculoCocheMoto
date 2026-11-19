public class Coche extends Vehiculo {
    int numeroPuertas;

    public Coche(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: "+numeroPuertas);
    }

    /*
    @Override
    public String descripcionCorta() {
        return marca + " " + modelo + " - Coche";
    }
    Resultado al ejecutar el codigo
    java: descripcionCorta() in Coche cannot override descripcionCorta() in Vehiculo
  overridden method is final

    La palabra reservada final impide que un método pueda sobrescribirse (@Override) en las clases hijas.
    Por tanto, Coche y Moto pueden utilizar descripcionCorta() heredado de Vehiculo, pero no pueden modificar su implementación.

   */
}
