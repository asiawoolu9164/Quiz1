public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(6514887, "Lala", 2022, 4.0);

        student1.showDetails();

        student1.setID(6543568);
        student1.setName("Tinkie Winkie");
        student1.setAdmissionYear(2022);
        student1.setGPA(3.5);

        student1.showDetails();
    }
}