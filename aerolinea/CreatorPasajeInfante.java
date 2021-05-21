package factoryMethod.ejercicios.aerolinea;

public class CreatorPasajeInfante extends CreatorPasajes {


    @Override
    public PasajeInfante create() {
        Avion avionAirbus= new Avion();
        avionAirbus.setCapacidad("320 personas");
        avionAirbus.setMarca("avion AIRBUS");
        avionAirbus.setModelo("airbus 380");
        avionAirbus.setNumeroAsientos("350 asientos");

        Origen ciudadOrigen = new Origen();
        ciudadOrigen.setPais("Argentina");
        ciudadOrigen.setCiudad("Buenos Aires");
        ciudadOrigen.setAeropuerto("aeropuerto de xeneiza");


        Destino ciudadDestino = new Destino();
        ciudadDestino.setPais("Canada");
        ciudadDestino.setCiudad("Toronto");
        ciudadDestino.setAeropuerto("International Toronto Airport");

        //Pasajero pasajeroDatos = new Pasajero();
        //pasajeroDatos.setNombre(" ");
        //pasajeroDatos.setCi(" ");

        PasajeInfante pasajeInfante = new PasajeInfante();
        pasajeInfante.setAvion(avionAirbus);
        pasajeInfante.setOrigen(ciudadOrigen);
        pasajeInfante.setDestino(ciudadDestino);
        pasajeInfante.setNumeroVuelo("LAN-965");
        pasajeInfante.setCostoEspecial("3500 pesos");

        return pasajeInfante;

    }

}
