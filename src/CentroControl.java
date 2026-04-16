import java.util.ArrayList;

public class CentroControl {

    private ArrayList<Vehiculo> listaVehiculos;

    public CentroControl() {
        this.listaVehiculos = new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v) {
        listaVehiculos.add(v);
        System.out.println("Unidad registrada exitosamente. ID: " + v.getId());
    }

    public void monitorearFlota() {
        System.out.println("\n   MONITOREO DE FLOTA   ");
        for (Vehiculo v : listaVehiculos) {
            v.patronMovimiento();
        }
    }
}