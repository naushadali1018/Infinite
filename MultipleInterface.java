interface Pet1 {
    void cuddle();
    void guardDuty();
}

interface ServiceAnimal {
    void helpCivilians();
    void guardDuty();
}

abstract class Animal1 {
    public abstract void eat();
}

class Dog1 extends Animal1 implements Pet1, ServiceAnimal{

    @Override
    public void cuddle() {
        System.out.println("Trying to look cute for more cuddles!");
    }

    @Override
    public void helpCivilians() {
        System.out.println("Taking civilians to a nearby shelter.");
    }

    /*
     * As you can see, there is one common function in both the interfaces,
     * void guardDuty(). To implement it, we just Override the method in the Dog
     * class.
     */
    @Override
    public void guardDuty() {
        System.out.println("Guarding the perimeter.");
    }

    @Override
    public void eat() {
        System.out.println("Munching on treats.");
    }

}
public class MultipleInterface {
    public static void main(String[] args) {
        Dog1 d=new Dog1();
        d.cuddle();
        d.guardDuty();
        d.eat();
        d.helpCivilians();
    }
}
