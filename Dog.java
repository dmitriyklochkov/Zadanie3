public class Dog extends Animal {
    private String colar = "есть";


    @Override
    public void eat(String type, String food) {

        super.eat("собака", "кости");
    }

    @Override
    public void makeNoise(String type, String sound) {

        super.makeNoise("собака", "ррр");
    }

    @Override
    public void sleep(String type, String location) {

        super.sleep("собака", "в конуре");
    }
}
