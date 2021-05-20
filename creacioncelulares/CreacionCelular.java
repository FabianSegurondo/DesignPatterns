package ejemplos.protype.creacioncelulares;

public class CreacionCelular {
    public static void main(String[] args) {
        CelularCaracteristicas celularSamsung = new CelularCaracteristicas();
        celularSamsung.setBluetooth("tiene bluetooth");
        celularSamsung.setCamara("camara de 20 megapixeles");
        celularSamsung.setTipoBateria("baterias de litio");

        CelularCaracteristicas celularSamsungTipo1 = (CelularCaracteristicas) celularSamsung.clone();
        celularSamsungTipo1.setTamano("5.8 x 6 inches");
        celularSamsungTipo1.setCpu("quadcore - snapdragon");
        celularSamsungTipo1.setMemoriasExternas("no tiene");
        celularSamsungTipo1.setVersionAndroid("Llolipo 4.6");
        celularSamsungTipo1.setSimCelular(new SimCelular("VIVA", "789465132"));
        celularSamsungTipo1.setAccesoriosCelular(new AccesoriosCelular("tiene", "tiene", "no tiene"));

        CelularCaracteristicas celularSamsungTipo2 = (CelularCaracteristicas) celularSamsung.clone();
        celularSamsungTipo2.setTamano("6.8 x  inches");
        celularSamsungTipo2.setCpu("octacore - qualcom");
        celularSamsungTipo2.setMemoriasExternas("tiene memoria externa de 65 gigabytes");
        celularSamsungTipo2.setVersionAndroid("gingerbread 6.6");
        celularSamsungTipo2.setSimCelular(new SimCelular("TIGO", "78944652"));
        celularSamsungTipo2.setAccesoriosCelular(new AccesoriosCelular("tiene", " no tiene", "no tiene"));

        CelularCaracteristicas celularSamsungTipo3 = (CelularCaracteristicas) celularSamsung.clone();
        celularSamsungTipo3.setTamano("4.8 x 5 inches");
        celularSamsungTipo3.setCpu("dualcore - intel");
        celularSamsungTipo3.setMemoriasExternas("no tiene");
        celularSamsungTipo3.setVersionAndroid("oreo 3.7");
        celularSamsungTipo3.setSimCelular(new SimCelular("ENTEL", "68951651"));
        celularSamsungTipo3.setAccesoriosCelular(new AccesoriosCelular("tiene", "tiene, pero son incomodos", "no tiene"));

        celularSamsungTipo1.showDatos();
        celularSamsungTipo2.showDatos();
        celularSamsungTipo3.showDatos();
    }
}
