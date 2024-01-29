package OOPs;

public class ConstructorCalling {

    public static void main(String[] args) {
        Mustang mustang = new Mustang();

    }

}

abstract class Animal {
    Animal() {
        System.out.println("Animal Constructor called !");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Construcotr called !");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Construcotr called !");
    }
}