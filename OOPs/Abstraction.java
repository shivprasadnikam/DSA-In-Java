package OOPs;

public class Abstraction {

    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.walks();
        
        Chicken chicken = new Chicken();
        chicken.eats();
        chicken.walks();

    }

}

abstract class Animal {
    void eats() {
        System.out.println("Abstract class");
    }

    abstract void walks();

}

class Horse extends Animal {
    void walks() {
        System.out.println("Walks on four legs !");
    }
}

/**
 * InnerAbstraction
 */
class Chicken extends Animal {
    void walks() {
        System.out.println("Walks on two legs");
    }

}
