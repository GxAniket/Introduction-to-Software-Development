class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from dog
        p.weep();  // from Puppy
    }
}
