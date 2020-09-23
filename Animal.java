public class Animal {

    String food;
     String location;
     String type;
     String sound;

    public void makeNoise(String type, String sound) {
        System.out.println(" животное " + type + " издает звук " + sound);
    }

    public void eat(String type, String food) {
        System.out.println(" животное " + type + " ест " + food);
    }

    public void sleep(String type, String location) {
        System.out.println(" животное " + type + " спит " + location);
    }
}
