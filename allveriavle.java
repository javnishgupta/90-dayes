import java.util.Scanner;

class allveriavle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer type: age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Float type: height
        System.out.print("Enter your height (in meters): ");
        float height = sc.nextFloat();

        // Double type: salary
        System.out.print("Enter your monthly salary: ");
        double salary = sc.nextDouble();
       
        // String type: name
         System.out.print("Enter your name: ");
         
         sc.nextLine();  // Consume the newline character left by nextDouble()
         String name = sc.nextLine();

        // Boolean type: student status
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

       

        // Display the values
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Monthly Salary: $" + salary);
        System.out.println("Student: " + isStudent);

        sc.close();  // Close the scanner
    }
}
