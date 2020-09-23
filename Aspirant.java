public class Aspirant extends Student {
    private String scientificWork;
   private String firstName = "Петр";
    private String lastName = "Петров";
    private  int group =2;
    private double averageMark = 4.0;
    @Override
    public int getScholarship() {
        if (averageMark == 5.0) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        return scholarship;
    }


}
