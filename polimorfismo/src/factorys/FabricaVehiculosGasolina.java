
package factorys;

import abstracts.Automovil;
import abstracts.Scooter;
import interfaces.FabricaVehiculo;
import vehiculos.AutomovilGasolina;
import vehiculos.ScooterGasolina;

public class FabricaVehiculosGasolina implements FabricaVehiculo {

    @Override
    public Automovil createAutomovil(String model, String color, int potencia, double espacio) {
        return new AutomovilGasolina( model, color, potencia,espacio);
    }

    @Override
    public Scooter createScooter(String model, String color, int potencia) {
        return new ScooterGasolina(  model, color,potencia );
    }
}
