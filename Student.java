public class Student {
    private int ID;
    private String name;
    private int admissionYear;
    private double GPA;

    public Student(int ID, String name, int admissionYear, double GPA) {
        this.ID = ID;
        this.name = name;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }

    public void showDetails() {
        System.out.println("Student ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("GPA: " + GPA);
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public double getGPA() {
        return GPA;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}