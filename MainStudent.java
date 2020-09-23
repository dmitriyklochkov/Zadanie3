public class MainStudent {
    public static void main(String[] args) {
        Student student;
        student = new Aspirant();

        Student[] staff = new Student[2];
        staff[0] = new Student();
        staff[1] = new Aspirant();
        for (Student e : staff) {

            System.out.println(e.getScholarship());
        }
    }
}
