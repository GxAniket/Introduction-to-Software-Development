public class Main {

    public static int calculatePinchDamage(int strength) {
        return strength * 2; // damage = strength ka 2x
    }

    public static void main(String[] args) {
      
        System.out.println("Hello, World!");

        
        int damage = calculatePinchDamage(1);

    
        System.out.println("Pinch damage for strength 5: " + damage);
    }
}
