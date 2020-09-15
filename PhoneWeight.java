public class PhoneWeight {
    public static void main(String[] args) {
        int weight = 1;

        System.out.println("Вес " + weight);
        Phone phone = new Phone();
        phone.receiveCall("Марк");
        //System.out.println("Звонит " + name);

        phone.getNumber("986543");
    }
}
