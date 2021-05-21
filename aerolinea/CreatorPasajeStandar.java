package factoryMethod.ejercicios.aerolinea;

public class CreatorPasajeStandar extends CreatorPasajes {
    @Override
    public PasajeStandar create() {
        Avion avionBoeing= new Avion();
        avionBoeing.setCapacidad("120 personas");
        avionBoeing.setMarca("avion Boeing");
        avionBoeing.setModelo("Boeing jet class 125");
        avionBoeing.setNumeroAsientos("120 asientos");

        Origen ciudadOrigen = new Origen();
        ciudadOrigen.setPais("Alemania");
        ciudadOrigen.setCiudad("Berlin");
        ciudadOrigen.setAeropuerto("aeropuerto de Berlin");


        Destino ciudadDestino = new Destino();
        ciudadDestino.setPais("EEUU");
        ciudadDestino.setCiudad("Atlanta");
        ciudadDestino.setAeropuerto("Hartsfield Jackson Airport");

        Pasajero pasajeroDatos = new Pasajero();
        pasajeroDatos.setNombre(" fabo");
        pasajeroDatos.setCi("123 ");

        Pasajero pasajeroDatos2 = new Pasajero();
        pasajeroDatos2.setNombre(" fabo5");
        pasajeroDatos2.setCi("12345 ");

        PasajeStandar pasajeStandar = new PasajeStandar();
        pasajeStandar.setAvion(avionBoeing);
        pasajeStandar.setOrigen(ciudadOrigen);
        pasajeStandar.setDestino(ciudadDestino);
        pasajeStandar.setNumeroVuelo("Lufthansa-333");
        pasajeStandar.setCosto("7000 $ dolares");


        return pasajeStandar;

    }
}
