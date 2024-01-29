package OOPs;

public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eats();
        Animal animal = new Animal();
        animal.eats();

    }

}

/**
 * Animal
 */
class Animal {
    void eats() {
        System.out.println("Eats everything !");
    }
}

/**
 * InnerMethodOverriding
 */
class Deer extends Animal {
    void eats() {
        System.out.println("Eats grass !");
    }

}
