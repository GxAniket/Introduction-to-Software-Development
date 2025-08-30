interface Animal {
    void eat();
}

interface Pet {
    void play();
}

interface Guard {
    void guard();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void play() {
        System.out.println("Dog is playing...");
    }
}

class GuardDog extends Dog implements Guard {
    public void guard() {
        System.out.println("Guard Dog is guarding...");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        GuardDog gd = new GuardDog();
        gd.eat();
        gd.play();
        gd.guard();
    }
}
