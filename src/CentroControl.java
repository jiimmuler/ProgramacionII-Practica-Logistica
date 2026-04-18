import java.util.ArrayList;

/**
 * Clase encargada de gestionar y supervisar todos los vehículos.
 * Funciona como una base de datos temporal donde se almacenan las unidades
 * y se controlan sus acciones de forma conjunta.
 *
 * @author Jimena Pintos
 * @author Ashlee Bogado
 */
public class CentroControl {

    /**
     * Constructor del Centro de Control.
     * Inicializa la lista dinámica para poder empezar a guardar vehículos.
     */
    public CentroControl() {
        this.listaVehiculos = new ArrayList<>();
    }

    /**
     * Añade un nuevo vehículo a la flota del centro de control.
     * Puede recibir cualquier objeto que sea un Vehiculo.
     *
     * @param v El vehículo (camión, dron, etc.) que se desea registrar.
     */
    public void registrarUnidad(Vehiculo v) {
        listaVehiculos.add(v);
        System.out.println("Unidad registrada exitosamente. ID: " + v.getId());
    }

    /**
     * Recorre toda la lista de vehículos y ejecuta el patrón de movimiento de cada uno.
     */
    public void monitorearFlota() {
        System.out.println("\n   MONITOREO DE FLOTA   ");
        for (Vehiculo v : listaVehiculos) {
            v.patronMovimiento();
        }
    }

    //Lista donde se guardan todos los vehículos que se registran.
    private ArrayList<Vehiculo> listaVehiculos;
}