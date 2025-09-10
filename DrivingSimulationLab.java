/* Graded Lab: Writing Methods I
Coursera course: Introduction to Software Development
Tu ne DrivingSimulationLab.java file mein methods implement kiye jaise:
- toggleEngine()
- changeGear(String direction)
- accelerate()
- brake()
- exitSimulation()
Aur test file DrivingSimulationLabTest.java ke saare test cases pass kiye — including:
- testInitialSpeed
- testUpdatedSpeed
- testDistanceTraveled
- testEngineToggle
- testBrakeBehavior
*/



public class DrivingSimulationLab {

    public static boolean isEngineOn = false;
    public static String gear = "P"; // "P", "D", "R"
    public static int speed = 0;

    public static void toggleEngine() {
        isEngineOn = !isEngineOn;
        if (isEngineOn) {
            System.out.println("Engine turned ON.");
        } else {
            System.out.println("Engine turned OFF.");
        }
    }

    public static void changeGear(String direction) {
        if (!isEngineOn) {
            System.out.println("Cannot change gear. Engine is OFF.");
            return;
        }

        if (direction.equals("D")) {
            gear = "D";
            System.out.println("Gear shifted to Drive.");
        } else if (direction.equals("R")) {
            gear = "R";
            System.out.println("Gear shifted to Reverse.");
        } else if (direction.equals("P")) {
            gear = "P";
            System.out.println("Gear shifted to Park.");
        } else {
            System.out.println("Invalid gear direction.");
        }
    }

    public static void accelerate() {
        if (!isEngineOn) {
            System.out.println("Cannot accelerate. Engine is OFF.");
            return;
        }

        if (gear.equals("D")) {
            speed += 10;
            System.out.println("Accelerating. Current speed: " + speed);
        } else {
            System.out.println("Cannot accelerate. Gear is not in Drive.");
        }
    }

    public static void brake() {
        if (!isEngineOn) {
            System.out.println("Cannot brake. Engine is OFF.");
            return;
        }

        if (speed == 0) {
            System.out.println("Car is already stopped.");
        } else {
            speed = Math.max(0, speed - 5);
            System.out.println("Braking. Current speed: " + speed);
        }
    }

    public static void exitSimulation() {
        System.out.println("Exiting simulation...");
    }
}
