public class Student {
   static String firstName;
        static String lastName;
        static int group;
         static double averageMark;
      static int scholarship;
        Student student = new Aspirant();

       public  int getScholarship(double averageMark) {
       if (averageMark == 5.0) {
           scholarship = 100;
       }
else {
    scholarship = 80;
       }
    return scholarship;
   }
     }
