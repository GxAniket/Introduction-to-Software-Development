/** TODO 2 Solution creates the class Dolphin:
 *          extend the class Animal to create a new
 *          water based animal named "Dolphin" which
 *          extends Animal
 *          Extra properties of class "Dolphin" include:
 *          1. color of dolphin
 *          2. swimming speed
 **/

/** TODO 7 Solution is the implementation of the interface
 *         "Swim" and the implementation of the method
 *         "swimming" inside the class.
 *         The todo  states:
 *                          implement the "Swim" interface
 *                          in the "Dolphin" class and the
 *                          "swimming" method in its implementation
 *                          should display the swimming speed as
 *                          "Dolphin: I am swimming at the speed ...."
 *                           where .... is the value of the variable
 *                          "swimmingSpeed"
 **/
public class Dolphin extends Animal implements Swim{

    // property for color of dolphin
    String color;

    // property for speed of dolphin
    int swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    /** TODO 3 Solution :implement the unimplemented methods of
     *                   "Eat" interface in the class
     *                   "Tiger" class created in the TODO 1
     *                   and also in the
     *                  "Dolphin" class created in TODO 2.
     */
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }

    /** TODO 3 Solution End **/

    /** TODO 7 Solution **/
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed);
    }
    /** TODO 7 Solution End **/

}
