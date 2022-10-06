interface Mammal {
    void run();
}

interface Cat1 extends Mammal {
    void eat();
}

interface Lion extends Cat1{}
class Animal implements Lion {

    public void run() {
        System.out.println("Pouncing around");
    }

    public void eat() {
        System.out.println("Too full to eat!");
    }
}

class InterfaceTryOut {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.run();
    }

}