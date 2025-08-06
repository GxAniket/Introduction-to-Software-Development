public class Main {
    public static void main(String[] args) {
        
        int totalTrash = 22;
        int trashToCarry =5;

        while (totalTrash > 0) {
            
            if (totalTrash < 5) {
                trashToCarry = totalTrash;
            }
            
            totalTrash = totalTrash - trashToCarry;

            System.out.println("Carrying: " + trashToCarry + " | Remaining: " + totalTrash);
        }
    }
}
