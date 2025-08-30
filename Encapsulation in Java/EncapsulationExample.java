class Student {
    // Private data members (hidden)
    private String name;
    private int age;

    // Public setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        if(a > 0) {       // validation example
            age = a;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Public getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aniket");
        s.setAge(21);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
