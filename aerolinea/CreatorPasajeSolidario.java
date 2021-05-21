package factoryMethod.ejercicios.aerolinea;


public class CreatorPasajeSolidario extends CreatorPasajes {


    @Override
    public PasajeSolidario create() {
        Avion avionBoeing= new Avion();
        avionBoeing.setCapacidad("200 personas");
        avionBoeing.setMarca("avion boeing");
        avionBoeing.setModelo("boeing 787");
        avionBoeing.setNumeroAsientos("250 asientos");

        Origen ciudadOrigen = new Origen();
        ciudadOrigen.setPais("BOlivia");
        ciudadOrigen.setCiudad("Santa cruz");
        ciudadOrigen.setAeropuerto("aeropuerto de viru viru");


        Destino ciudadDestino = new Destino();
        ciudadDestino.setPais("EEUU");
        ciudadDestino.setCiudad("Miami");
        ciudadDestino.setAeropuerto("International Miami Airport");

        //Pasajero pasajeroDatos = new Pasajero();
        //pasajeroDatos.setNombre(" ");
        //pasajeroDatos.setCi(" ");

        PasajeSolidario pasajeSolidario = new PasajeSolidario();
        pasajeSolidario.setAvion(avionBoeing);
        pasajeSolidario.setOrigen(ciudadOrigen);
        pasajeSolidario.setDestino(ciudadDestino);
        pasajeSolidario.setNumeroVuelo("BOA365");
        pasajeSolidario.setCostoDePasaje("1000 bs");
        pasajeSolidario.setDescuento("3500 bs");
        pasajeSolidario.setMotivoDelDescuento("Vuelo solidario para paciente con cancer");

        return pasajeSolidario;

    }
}
