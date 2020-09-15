public class PhoneModel {
    public static void main(String[] args) {
        String model = "LG";
        System.out.println("Модель " + model);
        Phone phone = new Phone();
        phone.receiveCall("Марк");
        //  System.out.println("Звонит " + name);

        phone.getNumber("LG");
        // return model;
    }
}
