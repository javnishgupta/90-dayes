import java.util.Scanner;
class helloworld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Step 1: Create a Scanner object
        System.out.println("Enter something:");  // Step 2: Prompt user for input
        String str = sc.nextLine();  // Step 3: Store user input in a string variable
        System.out.println("You entered:"+str);  // Step 4: Output the entered string
        sc.close();  // Step 5: Close the scanner to prevent resource leaks
    }
}
