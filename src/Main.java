public class Main {
    // Task 4: Create main method
    public static void main(String[] args) {
        // Task 5: Create Student Instances with default constructor
        StudentCons student1 = new StudentCons("Kamal", 22);
        System.out.println("Student 1 Information:");
        student1.displayInfo();
        System.out.println();

        // Task 6: Create Parameterized Student Instances
        StudentCons student2 = new StudentCons("Lakmali", 20, 'A');
        System.out.println("Student 2 Information:");
        student2.displayInfo();
        System.out.println();

        /*
         Task 7: Challenge - Overloading Constructors
         Create an instance using the constructor with name and age only
        */
        StudentCons student3 = new StudentCons("Kamali", 22);
        System.out.println("Student 3 Information:");
        student3.displayInfo();
    }
}
