import java.util.*;

public class Phone {
    String name;
    String number;
    String model;
    int weight;

    public static void main(String[] args) {
       // Scanner s = new Scanner(System.in);

    }

    public Phone() {
    }

    public Phone(String name, String number) {
    }

    public Phone(String number, String model, int weight) {
        this("Mark", "876543");

    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber(String number) {
        return number;
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name+" Номер " + number);

    }
int i = 0;
    public void sendMessage(String ...numbers) {
       Scanner s = new Scanner(System.in);

       for (i=0;i< numbers.length;i++) {
           numbers[i] = s.nextLine();
       }
    System.out.println("Номера телефонов, на которые нужно отправить сообщение: " + Arrays.toString(numbers));
   }

}