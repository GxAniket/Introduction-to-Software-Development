abstract public class Animal implements Eat {

    // property representing name of the animal
    private String nameOfAnimal;

    // property representing weight
    private int weight;

    // property representing the height
    private int height;

    // property representing the age
    private int age;

    public Animal() {
        nameOfAnimal = "Unknown Animal";
    }

    public Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;

        // set default weight 200 and height 2 feet and age to 5 years
        this.weight = 200;
        this.height = 2;
        this.age = 5;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /** TODO 3 Solution **/
    @Override
    public void eatingFood() {
        System.out.println("The animal: " + nameOfAnimal + " is eating.");
    }
    /** TODO 3 Solution End **/

}
