/**
 * Clase abstracta que define la estructura base para cualquier vehículo del sistema.
 * Maneja la identificación automática de cada objeto mediante un contador estático.
 *
 * @author Jimena Pintos
 * @author Ashlee Bogado
 */
public abstract class Vehiculo {

    /**
     * Constructor de la clase Vehiculo.
     * Se encarga de llamar al método que asigna el ID único al crear la instancia.
     */
    public Vehiculo(){
        setId();
    }

    /**
     * @return El identificador único del vehículo.
     */
    public int getId(){
        return id;
    }

    /**
     * Asigna el valor actual de nextId al vehículo y luego incrementa
     * el contador para la próxima instancia.
     */
    private void setId(){
        this.id=getNextId();
        nextId++;
    }

    /**
     * @return El valor que tendrá el ID del próximo vehículo que se cree.
     */
    public static int getNextId(){
        return nextId;
    }

    /**
     * Método abstracto que define cómo se mueve el vehículo.
     */
    public abstract void patronMovimiento();

    //Atributos privados.
    private int id;     // ID específico de la instancia
    private static int nextId=0;    // Contador global de la clase
}