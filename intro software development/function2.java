public class Main {
// Area of a square = side * side
    static double sideOfSquare;

// method to set the side of the square
    public static void setSquareSide() {
        sideOfSquare = 5.2;
    }

// method to calculate the area of the square
    public static double calculateAreaOfSquare() {
        return sideOfSquare * sideOfSquare;
    }

// the main method
    public static void main(String[] args) {
// set the side of square
        setSquareSide();

// call the method to calculate the area of the square
// And store the result given back by the method in a variable
        double areaOfSquare = calculateAreaOfSquare();

// print the result, using the values from the variables
        System.out.println("Area of the square with side " + sideOfSquare + " is: " + areaOfSquare);
    }
}


//output
//Area of the square with side 5.2 is: 27.040000000000003
