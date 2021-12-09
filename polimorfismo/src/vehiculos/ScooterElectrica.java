package vehiculos;

import abstracts.Scooter;

public class ScooterElectrica extends Scooter {

    StringBuffer salida = new StringBuffer();

    public ScooterElectrica(String modelo, String color, int      potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCarateristicas() {

        salida.append("Scooter  electrico  modelo: ");
        salida.append(modelo);
        salida.append("\nde color: ");
        salida.append(color);
        salida.append("\nde potencia: ");
        salida.append(potencia);
        System.out.println(salida);

    }
}