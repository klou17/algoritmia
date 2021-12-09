package interfaces;

import abstracts.Automovil;
import abstracts.Scooter;

public interface FabricaVehiculo {

    Automovil createAutomovil( String model,String color, int  potencia, double espacio);
    Scooter createScooter( String model, String color,int potencia);
}
