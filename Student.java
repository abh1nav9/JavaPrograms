public class Student {
    private int id;
    private String name;
    private String branch;
    private String city;
    private String university;

    // Constructor with one argument
    public Student(int id) {
        this(id, "", "", "", "");
    }

    // Constructor with two arguments
    public Student(int id, String name) {
        this(id, name, "", "", "");
    }

    // Constructor with three arguments
    public Student(int id, String name, String branch) {
        this(id, name, branch, "", "");
    }

    // Constructor with four arguments
    public Student(int id, String name, String branch, String city) {
        this(id, name, branch, city, "");
    }

    // Constructor with five arguments (fully initialized)
    public Student(int id, String name, String branch, String city, String university) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.city = city;
        this.university = university;
    }

    // Display method to print student information
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("City: " + city);
        System.out.println("University: " + university);
    }

    public static void main(String[] args) {
        // Example usage of the Student class with different constructors
        Student student1 = new Student(1);
        Student student2 = new Student(2, "Alice");
        Student student3 = new Student(3, "Bob", "Computer Science");
        Student student4 = new Student(4, "Carol", "Electronics", "New York");
        Student student5 = new Student(5, "David", "Mechanical", "Los Angeles", "XYZ University");

        // Display student information
        System.out.println("Student 1:");
        student1.displayInfo();
        System.out.println();

        System.out.println("Student 2:");
        student2.displayInfo();
        System.out.println();

        System.out.println("Student 3:");
        student3.displayInfo();
        System.out.println();

        System.out.println("Student 4:");
        student4.displayInfo();
        System.out.println();

        System.out.println("Student 5:");
        student5.displayInfo();
    }
}
