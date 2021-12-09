
import factorys.FabricaVehiculosGasolina;

public class Main {
    public static void main(String[] args) {
        FabricaVehiculosGasolina fabricaVehiculosGasolina = new FabricaVehiculosGasolina();
        fabricaVehiculosGasolina.createAutomovil("EF201","Negro",240,4).mostrarCarateristicas();
        fabricaVehiculosGasolina.createScooter("AXS01", "Blanco", 456).mostrarCarateristicas();
    }
}