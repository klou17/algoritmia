package vehiculos;

import abstracts.Automovil;

public class AutomovilElectrico extends Automovil {

    StringBuffer salida =  new StringBuffer();

    public AutomovilElectrico(String model, String color, int   potencia, double espacio) {
        super(model, color, potencia, espacio);
    }

    @Override
    public void mostrarCarateristicas() {

        salida.append("Automovil  electrico  modelo: ");
        salida.append(model);
        salida.append("\nde color: ");
        salida.append(color);
        salida.append("\nde potencia: ");
        salida.append(potencia);
        salida.append("\nde espacio: ");
        salida.append(espacio);
        System.out.println(espacio);
    }
}
