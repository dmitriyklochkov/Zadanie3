public class Cat extends Animal {
    private String moustache = "пушистые";
    @Override
    public void eat(String type, String food) {
        super.eat("кошка", "рыбу");
    }

    @Override
    public void makeNoise(String type, String sound) {
        super.makeNoise("кошка", "мяу");
    }

    @Override
    public void sleep(String type, String location) {
        super.sleep("кошка", "дома");
    }
}
