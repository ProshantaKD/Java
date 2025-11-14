public class Student {

    // Class Variable (Static Variable)
    static String universityName = "AIUB";

    // Instance Variables
    String name;
    int id;
    double cgpa;

    // Constructor
    Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    // Method with Local Variables
    void displayInfo() {
        String status;  // Local Variable

        if (cgpa >= 3.5) {
            status = "Excellent";
        } else {
            status = "Good";
        }

        // Printing all types of variables
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {

        int studentCount = 2; // Local Variable

        Student s1 = new Student("Rahim", 101, 3.75);
        Student s2 = new Student("Karim", 102, 3.20);

        System.out.println("Total Students: " + studentCount); // Local

        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
    }
}
