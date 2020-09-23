import java.util.*;

public class Phone {

    private String number;
 protected    String model;
   protected int weight;

    Phone(String name, String number) {
        model = "LG";
        System.out.println(model);
    }

    Phone() {
        int weight = 4;
    }

    Phone(String name, String number, int weight) {
        this("Сергей", "1357");


    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getNumber(String number) {
        return number;
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " Номер " + number);
    }

    int i = 0;

    void sendMessage(String... numbers) {
        Scanner s = new Scanner(System.in);

        for (i = 0; i < numbers.length; i++) {
            numbers[i] = s.nextLine();
        }
        System.out.println("Номера телефонов, на которые нужно отправить сообщение: " + Arrays.toString(numbers));
    }

}
