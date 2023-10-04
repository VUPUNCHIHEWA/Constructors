public class StudentCons {
    private String name;
    private int age;
    private char grade;

    // Task 2: Implement default constructor
    public StudentCons(String aliceSmith, int i) {
        // Initialize with default values
        name = "Unknown";
        age = 0;
        grade = 'N';
    }
    // Task 2: Implement parameterized constructor
    public StudentCons(String name, int age, char grade) {
        // Assign values passed as arguments
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    // Task 3: Implement displayInfo() method
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}