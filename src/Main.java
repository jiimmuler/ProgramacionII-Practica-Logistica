public class Main {

    public static void main (String[] args){
        //Instanciación del centro de control
        CentroControl centro = new CentroControl();

        //Instanciación de los drones y del camión autónomo
        DronTransporte dron1 = new DronTransporte();
        DronTransporte dron2 = new DronTransporte();
        CamionAutonomo camion = new CamionAutonomo();

        //Registro y monitoreo de los vehículos en el centro de control
        centro.registrarUnidad(dron1);
        centro.registrarUnidad(dron2);
        centro.registrarUnidad(camion);

        centro.monitorearFlota();

    }
}