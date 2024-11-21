package exercicio05;

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bobby", 5, "Pastor Alemao");

        Cachorro cachorro1 = new Cachorro("layla", 6, "pincher");

        System.out.println(cachorro1.toString());
        cachorro1.Latir();
        cachorro1.Correr();
        System.out.println(cachorro.toString());
        cachorro.Latir();
    }
}
