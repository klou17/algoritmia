
package factorys;

import abstracts.Automovil;
import abstracts.Scooter;
import interfaces.FabricaVehiculo;
import vehiculos.AutomovilElectrico;
import vehiculos.ScooterElectrica;

public class FabricaVehiculosElectricos  implements FabricaVehiculo {

    @Override
    public Automovil createAutomovil(String model, String color, int potencia, double espacio) {
        return new AutomovilElectrico(  model, color, potencia,  espacio);
    }

    @Override
    public Scooter createScooter(String model, String color, int potencia) {
        return new ScooterElectrica( model, color, potencia);
    }
}