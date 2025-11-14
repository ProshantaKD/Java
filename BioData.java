public class Student {
    static String universityName = "AIUB";
    String name;
    int id;
    double cgpa;
    
    Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    void displayInfo() {
        String status;  // Local Variable

        if (cgpa >= 3.5) {
            status = "Excellent";
        } else {
            status = "Good";
        }

        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {

        int studentCount = 2; 

        Student s1 = new Student("Rahim", 101, 3.75);
        Student s2 = new Student("Karim", 102, 3.20);

        System.out.println("Total Students: " + studentCount); 

        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
    }
}
