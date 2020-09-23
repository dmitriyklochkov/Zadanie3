public class Student {
    protected String firstName = "Иван";
    protected String lastName = "Иванов";
    protected int group = 1;
    protected double averageMark = 5.0;
    protected int scholarship;

     int getScholarship() {
        if (averageMark == 5.0) {
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        return scholarship;
    }
}

