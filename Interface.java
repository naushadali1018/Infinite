public class Interface {
}
interface Pet {
    public String cuddle();
    default public void eat(){
        System.out.println("from interface Pet");
    }
    static public void eat1(){
        System.out.println("from static interface Pet");
    }
    void func(); //all methods are in interface are public and abstract
}

interface ABC{
    default public void eat(){
        System.out.println("from ABC");
    }
}


class Dog implements Pet, ABC {

    public String cuddle() {
        return "Purring sounds";
    }

    public void eat() {
        System.out.println("Eating stereotypical bones");
    }
    public void func(){
        System.out.println("from func");
    }


    public static void main(String[] args) {
        Dog d = new Dog();
        Pet.eat1();
        d.eat();
    }

}
class Cat implements Pet {

    public String cuddle() {
        return "Yawning sounds";
    }

    public void eat() {
        System.out.println("Eating stereotypical fish");
    }

    @Override
    public void func() {
        System.out.println("from method");
    }
}

class PetAdoptionCenter {
    public static void adoptPet(Pet pet) {
        System.out.println("You have successfully adopted the pet.");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        adoptPet(dog1);
        Cat cat1 = new Cat();
        adoptPet(cat1);
    }
}