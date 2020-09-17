public class Aspirant extends Student {
     private static String scientificWork;

    @Override
    public int getScholarship(double averageMark) {
        if (averageMark == 5.0) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        return scholarship;
    }

    Student[] students = new Student[2];
    Student student = new Student();


  /*  ;;//firstName, lastName, group, averageMark, scientificWork) {
      /* this firstName= firstName;
           this.lastName = lastName;
           group = group;
           averageMark =averageMark;
           scientificWork = scientificWork;

    students[1]=new Aspirant();

    students[0]=new

    Student();

getScholarship( );
*/
            public static void main(String[] args) {
        firstName = "Иван ";
        lastName = "Иванов ";
        group = 1;
       averageMark = 5.0;
        scientificWork = " научная работа отсутствует";
                System.out.println(firstName+ lastName+"группа " +group+ " оценка"+averageMark+scientificWork);


        Aspirant aspirant = new Aspirant();
        firstName = "Петр ";
        lastName = "Петров ";
        group = 2;
        averageMark = 4.0;
        scientificWork = " научная работа есть";
                System.out.println(firstName+ lastName+"группа " +group+ " оценка"+averageMark+scientificWork);
    }
}
