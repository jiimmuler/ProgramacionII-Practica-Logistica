public abstract class CamionAutonomo extends Vehiculo{
    public CamionAutonomo(){
        super();
    }
    @Override
    public void patronMovimiento() {
        System.out.println("ID: " + getId() + "Arrancando motor y sincronizando ruta con el GPS interno.");
    }
}