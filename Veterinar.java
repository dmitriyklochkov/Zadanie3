public class Veterinar {

    public static void treatAnimal(Animal animal) {
        System.out.println("рекомендация: поесть " + Animal.food + " " + Animal.lokation);
   }

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        Animal animal = new Animal();
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Horse();
        for (Animal e : animals){
            System.out.print(e.type + " на прием к ветеринару - ");
            treatAnimal(animal);
        }
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    animal.food = " кости";
                    animal.lokation = " в конуре";
                    animal.type = " cобака";
                    animal.sound = " ррр";
                    System.out.print(animal.type + " на прием к ветеринару - ");
                    treatAnimal(animal);
                    break;
                case 1:
                    animal.food = " рыбу";
                    animal.lokation = " дома";
                    animal.type = " кошка";
                    animal.sound = " мяу";
                    System.out.print(animal.type + " на прием к ветеринару - ");
                    treatAnimal(animal);
                    break;
                case 2:
                    Animal.food = " овес";
                    animal.lokation = " в конюшне";
                    animal.type = " лошадь";
                    animal.sound = " игого";
                    System.out.print(animal.type + " на прием к ветеринару - ");
                    treatAnimal(animal);
                default:
                    break;
            }
        }

    }

}










