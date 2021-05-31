package ejericiciosPractica.builder;



public class Cliente {
    public static void main(String[] args) {
        Restaurante parrillasDelTioPipo = new Restaurante();
        Bife platoBife = new Bife();
        Lomito platoLomito = new Lomito();
        Tira platoTira = new Tira();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        parrillasDelTioPipo.setBuilderParrillas(platoBife);
        parrillasDelTioPipo.especialidadArmado();

        ParrillaCarne platobife = parrillasDelTioPipo.getParrillaCarne();
        platobife.showEspecialidades();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        parrillasDelTioPipo.setBuilderParrillas(platoLomito);
        parrillasDelTioPipo.especialidadArmado();

        ParrillaCarne platolomito = parrillasDelTioPipo.getParrillaCarne();
        platolomito.showEspecialidades();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        parrillasDelTioPipo.setBuilderParrillas(platoTira);
        parrillasDelTioPipo.especialidadArmado();

        ParrillaCarne platotira = parrillasDelTioPipo.getParrillaCarne();
        platotira.showEspecialidades();
    }
}
