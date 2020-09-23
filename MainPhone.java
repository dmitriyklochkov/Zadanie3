public class MainPhone {

    public static void main(String[] args) {

       Phone phone1 = new Phone();//"Марк","876543",2);
       phone1.model = "Samsung";
phone1.receiveCall("Mark","876543");
phone1.getNumber("876543");
        System.out.println("Модель " + phone1.model);

        Phone phone2 = new Phone();//"Марк","876543",2);
        phone2.weight = 2;
        phone2.receiveCall("Tom","765432");
        phone2.getNumber("765432");
        System.out.println("Вес " + phone2.weight);

        Phone phone3 = new Phone();//"Марк","876543",2);
        phone3.weight = 3;
        phone3.receiveCall("Иван","654321");
        phone3.getNumber("654321");
        System.out.println("Вес " + phone3.weight);
    }
}
