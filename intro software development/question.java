// 1 Here is an example of how to specify a variable named welcomeToJavaString to be the caller of a method named toUpperCase(). Review the code and then select Run to view the output.
public class string {
	public static void main(String[] args) {
 
    	String welcomeToJavaString = "Welcome java";
    	// “welcomeToJavaStringInUpperCase” will be “WELCOME JAVA”
    	String welcomeToJavaStringInUpperCase = welcomeToJavaString.toUpperCase();
 
    	System.out.println("The string  " + welcomeToJavaString  + " in upper case is : " + welcomeToJavaStringInUpperCase );
	}
}

// 2. Here is an example of how to specify a String to be the caller of a method named toUpperCase(). Review the code and then select Run to view the output.

public class Main {
	public static void main(String[] args) {
    	// “welcomeUseDirectString” is now "Welcome java"
    	String welcomeUseDirectString = "Welcome java".toUpperCase();
 
    	System.out.println("The string Welcome java in upper case is : " + welcomeUseDirectString );
 
	}
}

// 3. First, use the method startsWith(String prefix) to explore how to identify if a String starts with another String like in the example below. Review the code and then select Run to view the output.
public class Main {
	public static void main(String[] args) {
    	String testString = "This is a test";
 
    	boolean result1 = testString.startsWith("test"); // false
    	boolean result2 = testString.startsWith("This"); // true
 
        System.out.println("testString.startsWith(\"test\") : " + testString.startsWith("test"));
        System.out.println("testString.startsWith(\"This\") : " + testString.startsWith("This"));
 
	}
}

// 4 Checking for empty Strings
public class Main {
	public static void main(String[] args) {
    	String testString1 = "This is a test";
    	String testString2 = "";
 
    	boolean stringEmpty1 = testString1.isEmpty(); // false
    	boolean stringEmpty2 = testString2.isEmpty();  // true
 
 
        System.out.println("testString1.isEmpty() : " + testString1.isEmpty());
        System.out.println("testString2.isEmpty() : " + testString2.isEmpty());
 
	}
}

//5 Manipulate a String with index numbers
public class Main {
	public static void main(String[] args) {
    	String testString = "This is a test which is nice";
    	int indexOfSearch1= testString.indexOf("Java"); // returns -1
    	int indexOfSearch2 = testString.indexOf("is"); // returns 2
    	int indexOfSearch3 = testString.indexOf("est"); // returns 11
 
        System.out.println("testString.indexOf(\"Java\") : " + testString.indexOf("Java"));
        System.out.println("testString.indexOf(\"is\") : " + testString.indexOf("is"));
        System.out.println("testString.indexOf(\"est\") : " + testString.indexOf("est"));
 
	}
}

//Program 1:  Create a String that contains a substring "good". Query the String whether it contains the substring "good". If it does, the output should display "You get a gift from Santa". If the substring is not present, the output should display "Next year, please
public class Main {
    public static void main(String[] args) {


        //set the default string value
        String stringToBeDisplayed = "Next year, please";

        //set string that is set by you
        String howWasLastYear = "he was good in his activities";

        //check if the string "howWasLastYear" has the word "good" in it (it is case sensitive)
        if(howWasLastYear.contains("good")) {

            //if the word "good" is found change the value to be displayed
            stringToBeDisplayed = "You get a gift from Santa";

        }

        // this area is the common area after the "if" condition
	// which is always executed 
        System.out.println("Santa's Result: " + stringToBeDisplayed);
    }
}
//Program 2:  Create two Strings with different first names but the same last name. Compare the two Strings, irrespective of the case.
public class Main {
    public static void main(String[] args) {


        String name1= "santa";
        String name2 ="Santa";

        if(name1.equalsIgnoreCase(name2)) {
            System.out.println("The names are the same.");
        }

    }
}
