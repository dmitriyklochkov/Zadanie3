public class Animal {
    static String food;
    static String lokation;
    static String type;
    static String sound;

    public static void main(String[] args) {
    }

    public void makeNoise(String type, String sound) {
        System.out.println(" животное " + type + " издает звук " + sound);
    }

    public void eat(String type, String food) {
        System.out.println(" животное " + type + " ест " + food);
    }

    public void sleep(String type, String lokation) {
        System.out.println(" животное " + type + " спит " + lokation);
    }
}
