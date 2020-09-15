import java.util.Scanner;

public class Phone {
    String name ="Tom";
    String number;
    String model;
    int weight;

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        String number = s.nextLine();
    }
public Phone (){
}
    public Phone (String name, String number) {
    }
        public   Phone (String number, String model,int weight) {
            this("Mark", "876543");

        }
            public void receiveCall (String name){
                System.out.println("Звонит " + name);
            }

           public String getNumber(String number) {
               return number;

           }

}
