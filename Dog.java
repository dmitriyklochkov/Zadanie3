public class Dog extends Animal{

     String food = "кости";
   String location  = "в конуре";
  String sound = "рычит";
   String type = "собака";
    public static void main(String[] args) {
    }
    Dog animal1 = new Dog();
    @Override
    public void eat(String type, String food) {
        super.eat("собака", "кости");
    }


    @Override
    public void makeNoise(String type, String sound) {
        super.makeNoise(type, sound);
    }

    @Override
    public void sleep(String type, String lokation) {
        super.sleep(type, lokation);
    }
}
