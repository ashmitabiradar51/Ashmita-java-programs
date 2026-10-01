public class BreakContinue {
    public static void main(String[] args) {
        
        // --- Example of break ---
        System.out.println("Break Example: Stop at 5");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exit loop completely when i is 5
            }
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // --- Example of continue ---
        System.out.println("Continue Example: Skip 5");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skip this iteration when i is 5
            }
            System.out.print(i + " ");
        }
    }
}