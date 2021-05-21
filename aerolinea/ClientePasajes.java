package factoryMethod.ejercicios.aerolinea;


public class ClientePasajes {
    public  static void main (String[]args) {
        PasajeStandar pasajeStandares = new CreatorPasajeStandar().create();
        System.out.println("XXXXXXXXXXXXXXXXXX");
        pasajeStandares.setNumeroAsiento("25");
        pasajeStandares.getPasajero().setCi("68564654");
        pasajeStandares.getPasajero().setNombre("FabianSegu");
        pasajeStandares.crear();

        PasajeStandar pasajeStandares2 = new CreatorPasajeStandar().create();
        System.out.println("XXXXXXXXXXXXXXXXXX");
        pasajeStandares2.setNumeroAsiento("85");
        pasajeStandares2.getPasajero().setCi("123456");
        pasajeStandares2.getPasajero().setNombre("chechu ascarrunz");
        pasajeStandares2.crear();

        PasajeInfante pasajeInfante1 = new CreatorPasajeInfante().create();
        System.out.println("XXXXXXXXXXXXXXXXXX");
        pasajeInfante1.setNumeroAsiento("15");
        pasajeInfante1.getPasajero().setCi("465798132");
        pasajeInfante1.getPasajero().setNombre("Fachito del pozo");
        pasajeInfante1.setFechaNacimiento("28/05/2005");
        pasajeInfante1.crear();

        PasajeInfante pasajeInfante2 = new CreatorPasajeInfante().create();
        System.out.println("XXXXXXXXXXXXXXXXXX");
        pasajeInfante2.setNumeroAsiento("2");
        pasajeInfante2.getPasajero().setCi("66694456");
        pasajeInfante2.getPasajero().setNombre("Max martins");
        pasajeInfante2.setFechaNacimiento("15/12/2009");
        pasajeInfante2.crear();

        PasajeSolidario pasajeSolidario1 = new CreatorPasajeSolidario().create();
        System.out.println("XXXXXXXXXXXXXXXXXX");
        pasajeSolidario1.setNumeroAsiento("205");
        pasajeSolidario1.getPasajero().setCi("111222333");
        pasajeSolidario1.getPasajero().setNombre("Sebita blacutt");
        pasajeSolidario1.crear();

        PasajeSolidario pasajeSolidario2 = new CreatorPasajeSolidario().create();
        System.out.println("XXXXXXXXXXXXXXXXXX");
        pasajeSolidario2.setNumeroAsiento("75");
        pasajeSolidario2.getPasajero().setCi("789123456");
        pasajeSolidario2.getPasajero().setNombre("joaquito rios");
        pasajeSolidario2.crear();


    }

}
