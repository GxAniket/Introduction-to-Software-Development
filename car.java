import java.util.Scanner;

public class Car {
    private boolean isEngineOn = false;
    private String gear = "P";
    private int speed = 0;

    // Turn engine on/off
    public void turnEngineOnOff() {
        if (isEngineOn) {
            isEngineOn = false;
            speed = 0; // safety: when engine off, speed becomes 0
            System.out.println("Engine turned off.");
        } else {
            isEngineOn = true;
            System.out.println("Engine started.");
        }
    }

    // Change gear
    public void changeGear(String newGear) {
        if (isEngineOn) {
            if (newGear.equals("P") || newGear.equals("D") || newGear.equals("R")) {
                gear = newGear;
                System.out.println("Gear changed to: " + gear);
            } else {
                System.out.println("Error: Invalid gear. Use P, D, or R.");
            }
        } else {
            System.out.println("Error: Cannot change gear when engine is OFF.");
        }
    }

    // Accelerate (TODO 3)
    public void accelerate() {
        if (isEngineOn && !gear.equals("P")) {
            speed += 10;
            System.out.println("Accelerating... Current speed: " + speed + " km/h");
        } else {
            if (!isEngineOn) {
                System.out.println("Error: Cannot accelerate, the engine is OFF.");
            } else if (gear.equals("P")) {
                System.out.println("Error: Cannot accelerate while in Park gear.");
            }
        }
    }

    // Brake (TODO 4)
    public void brake() {
        if (isEngineOn && speed > 5) {
            speed -= 5;
            System.out.println("Braking... Current speed: " + speed + " km/h");
        } else {
            if (!isEngineOn) {
                System.out.println("Error: Cannot apply brakes, the engine is OFF.");
            } else if (speed <= 5) {
                System.out.println("Error: Cannot apply brakes, speed is too low.");
            }
        }
    }

    // Exit Simulation (TODO 5)
    public void exitSimulation() {
        System.out.println("Exiting the car simulation... Goodbye! 👋");
        System.exit(0);
    }

    // Display Dashboard
    public void displayDashboard() {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed);
        System.out.println("Engine: " + (isEngineOn ? "On" : "Off"));
        System.out.println("Gear: " + gear);
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
    }

    // Main method
    public static void main(String[] args) {
        Car car = new Car();
        Scanner sc = new Scanner(System.in);

        while (true) {
            car.displayDashboard();
            System.out.print("Enter your choice from above menu: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    car.turnEngineOnOff();
                    break;
                case 2:
                    System.out.print("Enter gear (P, D, R): ");
                    String newGear = sc.next();
                    car.changeGear(newGear.toUpperCase());
                    break;
                case 3:
                    car.accelerate();
                    break;
                case 4:
                    car.brake();
                    break;
                case 5:
                    car.exitSimulation();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}
