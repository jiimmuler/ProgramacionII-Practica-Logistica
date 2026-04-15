public class CamionAutonomo extends Vehiculo{

    public CamionAutonomo() {
        super();
    }

    @Override
    public void patronMovimiento() {
        System.out.println("El camion circula por la ruta con sincronización de su GPS interno.");
    }
}