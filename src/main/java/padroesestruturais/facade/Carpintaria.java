package padroesestruturais.facade;

public class Carpintaria extends Setor {

    private static Carpintaria carpintaria = new Carpintaria();

    private Carpintaria() {};

    public static Carpintaria getInstance() {
        return carpintaria;
    }
}
