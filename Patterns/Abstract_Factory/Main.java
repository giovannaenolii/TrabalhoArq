package Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        Fabricas fabricaAndroid = new FabricaAndroid();
        Aplicacao appAndroid = new Aplicacao(fabricaAndroid);
        appAndroid.renderizar();

        Fabricas fabricaIOS = new FabricaIOS();
        Aplicacao appIOS = new Aplicacao(fabricaIOS);
        appIOS.renderizar();
    }
}
