import java.util.Scanner;

class MenuDrivenApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n1. Add\n2. Subtract\n3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter 2 numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Sum = " + (a+b));
            }
            else if (choice == 2) {
                System.out.print("Enter 2 numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Diff = " + (a-b));
            }
            
        } while (choice != 3);
        
        System.out.println("Exited");
    }
}