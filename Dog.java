public class Dog extends Animal {
    private String colar = "есть";

    @Override
     void eat(String type, String food) {

        super.eat("собака","кости");
    }

    @Override
    void makeNoise(String type,String sound) {
        super.makeNoise("собака","ррр");
    }

    @Override
     void sleep(String type, String location) {

        super.sleep("собака", "в конуре");
    }
}
