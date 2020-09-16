public class Dog extends Animal {
    public static void main(String[] args) {
    }

    @Override
    public void eat(String type, String food) {
        super.eat("собака", "кости");
    }

    @Override
    public void makeNoise(String type, String sound) {
        super.makeNoise("собака", "ррр");
    }

    @Override
    public void sleep(String type, String lokation) {
        super.sleep("собака", "в конуре");
    }
}
