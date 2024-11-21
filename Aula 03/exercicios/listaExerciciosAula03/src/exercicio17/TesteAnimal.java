package exercicio17;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", 2, "6kg");

        System.out.println(animal.toString());
        animal.alimentar();
        animal.dormir();
    }
}
