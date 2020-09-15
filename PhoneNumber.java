public class PhoneNumber {
    public static void main(String[] args) {
        String number = "987654";
        System.out.println("Номер "+number);
    Phone phone = new Phone();
     phone.receiveCall ("Марк");
       // System.out.println("Звонит " + name);

  phone.getNumber ("987654");
        //return number;
        phone.receiveCall("Том","123456");
        phone.sendMessage("");
    }
}

