public class Veterinar {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        Animal animal = new Animal();
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Horse();

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    animal.food = " кости";
                    animal.location = " в конуре";
                    animal.type = " cобака";
                    animal.sound = " ррр";
                    treatAnimal(animal);
                    break;
                case 1:
                    animal.food = " рыбу";
                    animal.location = " дома";
                    animal.type = " кошка";
                    animal.sound = " мяу";
                    treatAnimal(animal);
                    break;
                case 2:
                    animal.food = " овес";
                    animal.location = " в конюшне";
                    animal.type = " лошадь";
                    animal.sound = " игого";
                    treatAnimal(animal);
                default:
                    break;
            }
        }

    }

    static void treatAnimal(Animal animal) {
        System.out.println(animal.type + " - прием у ветеринара - " + "рекомендация: поесть " + animal.food + " " + animal.location);
    }
}










