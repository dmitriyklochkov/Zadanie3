public class Veterinar {
    public static void treatAnimal(Animal[] animals) {
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Animal specifications = new Animal();

        specifications.food = " кости";
        specifications.lokation = " в конуре";
        specifications.type = " cобака";
        specifications.sound = " ррр";
        animals[0] = specifications;

        specifications = new Animal();
        specifications.food = " рыбу";
        specifications.lokation = " дома";
        specifications.type = " кошка";
        specifications.sound = " мяу";
        animals[1] = specifications;

        specifications = new Animal();
        specifications.food = " овес";
        specifications.lokation = " в конюшне";
        specifications.type = " лошадь";
        specifications.sound = " игого";
        animals[2] = specifications;

        for (Animal i : animals) {
            System.out.print(i.type + " на прием к ветеринару - ");
              //treatAnimal(animals);
                System.out.println("рекомендация: поесть "+i.food + " " + i.lokation);
            }
        }

    }








