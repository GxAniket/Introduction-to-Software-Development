/** TODO 9 Solution is provided by creting the penguin class
 *          the todo states:
 *                          create a class "Penguin" from the "Animal" class
 *                          also implementation of the Walk and Swim interfaces
 **/

/** TODO 9(d) Solution is implemented by implementing the Walk and Swim interfaces
 *            and implementing their methods within the class
 **/
public class Penguin extends Animal implements Walk, Swim{

    /** TODO 9(a) Solution: Create a property isSwimming of boolean  type to indicate
     *                       if the penguin is swimming or walking.
     *                       Also create properties walkSpeed and swimSpeed.
     **/


    boolean isSwimming;
    int walkSpeed;
    int swimSpeed;

    /** TODO 9(a) Solution End **/


    /** TODO 9(b) Solution: Create the setters and getters of the properties. **/
    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
    /** TODO 9(b) Solution End **/

     /** TODO 9(c) Solution: Ensure that when the default constructor of the Penguin is called,
     *                      the name of the animal Penguin is passed to the constructor of the
     *                      parent class Animal.
     **/
    public Penguin() {
        super("Penguin");
    }
    /** TODO 9(c) Solution End **/


    /** TODO 9(d) Solution: Override the eatingFood() method and implement the method
     *                      "eatingCompleted()" of the Eat interface like the
     *                      Dolphin class.
     **/

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }
    /** TODO 9(d) Solution End **/


    /** TODO 9(e) Solution: Implement both the Walk and the Swim interfaces **/


    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }
    /** TODO 9(e) Solution End **/


}
/** TODO 9 Solution End **/