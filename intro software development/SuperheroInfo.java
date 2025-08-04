public class SuperheroInfo {
    public static void main(String[] args) {
        // Arrays for superhero names and their introduction years
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
        int[] years = {1939, 1938, 1941, 1962, 1963};

        // Display superhero names
        System.out.println("Superhero Names:");
        for (String hero : superheroes) {
            System.out.println(hero);
        }

        // Display introduction years
        System.out.println("Introduction Years:");
        for (int year : years) {
            System.out.println(year);
        }

        // Access and modify superhero at position 3 (index 2)
        System.out.println("Original superhero name at position 3: " + superheroes[2]);
        superheroes[2] = "Thor";
        System.out.println("Modified superhero name at position 3: " + superheroes[2]);

        // Access and modify year at position 3 (index 2)
        System.out.println("Original introduction year for superhero at position 3: " + years[2]);
        years[2] = 2011;
        System.out.println("Modified introduction year for superhero at position 3: " + years[2]);
    }
}
