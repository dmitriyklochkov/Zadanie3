public class Aspirant extends Student {
    static String scientificWork;

    @Override
    public int getScholarship() {
        if (averageMark == 5.0) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        return scholarship;
    }

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
