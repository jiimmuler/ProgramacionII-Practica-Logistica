public class DronTransporte extends Vehiculo{
    @Override
    public void patronMovimiento() {
        System.out.println("ID: "+getId()+"Dron: Despegando verticalmente en linea recta");
    }
    @Override
    public void sincronizarGPS(){
        System.out.println("ID: "+getId()+"Conectando a la red satelital para actualización de coordenadas");
    }
}
