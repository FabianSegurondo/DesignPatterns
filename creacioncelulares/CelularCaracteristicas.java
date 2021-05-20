package ejemplos.protype.creacioncelulares;


import ejemplos.protype.boletosdepartido.EntradaFisica;

public class CelularCaracteristicas implements ICelular {
    private String tamano;
    private String cpu;
    private String versionAndroid;
    private String camara;
    private String bluetooth;
    private String memoriasExternas;
    private String tipoBateria;
    private SimCelular simCelular;
    private AccesoriosCelular accesoriosCelular;

    public CelularCaracteristicas(){

    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getMemoriasExternas() {
        return memoriasExternas;
    }

    public void setMemoriasExternas(String memoriasExternas) {
        this.memoriasExternas = memoriasExternas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public SimCelular getSimCelular() {
        return simCelular;
    }

    public void setSimCelular(SimCelular simCelular) {
        this.simCelular = simCelular;
    }

    public AccesoriosCelular getAccesoriosCelular() {
        return accesoriosCelular;
    }

    public void setAccesoriosCelular(AccesoriosCelular accesoriosCelular) {
        this.accesoriosCelular = accesoriosCelular;
    }

    @Override
    public Object clone() {
        CelularCaracteristicas objClone = new CelularCaracteristicas ();
        objClone.setTamano(this.tamano);
        objClone.setCpu(this.cpu);
        objClone.setVersionAndroid(this.versionAndroid);
        objClone.setCamara(this.camara);
        objClone.setBluetooth(this.bluetooth);
        objClone.setMemoriasExternas(this.memoriasExternas);
        objClone.setTipoBateria(this.tipoBateria);
        objClone.setSimCelular(this.simCelular);
        objClone.setAccesoriosCelular(this.accesoriosCelular);
        return objClone;

    }
    public void showDatos(){
        System.out.println("***********************");
        System.out.println("tamano celular: "+ tamano);
        System.out.println("cpu celular: "+ cpu);
        System.out.println("version android: "+ versionAndroid);
        System.out.println("camara del celular: "+ camara);
        System.out.println("tiene bluetooth?: "+ bluetooth);
        System.out.println("memorias externas: "+ memoriasExternas);
        System.out.println("tipo bateria celular: "+ tipoBateria);
        System.out.println("Sim nombre de la empresa de telefono: "+ simCelular.getNombreEmpresaTelefono());
        System.out.println("Sim numero de telefono: "+ simCelular.getNumeroTelefono());
        System.out.println("Accesorios tiene cargadores ?:"+ accesoriosCelular.getCargadores());
        System.out.println("Accesorios tiene audifonos ?: "+ accesoriosCelular.getAudifonos());
        System.out.println("Accesorios tiene otros ?: "+ accesoriosCelular.getOtros());
    }
}
