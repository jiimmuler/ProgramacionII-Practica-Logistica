public class Main {

    public static void main (String[] args){

        CentroControl centro = new CentroControl();

        DronTransporte dron1 = new DronTransporte();
        DronTransporte dron2 = new DronTransporte();
        CamionAutonomo camion = new CamionAutonomo();

        centro.registrarUnidad(dron1);
        centro.registrarUnidad(dron2);
        centro.registrarUnidad(camion);

        centro.monitorearFlota();

    }
}