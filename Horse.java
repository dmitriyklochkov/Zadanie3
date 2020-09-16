public class Horse extends Animal {

    @Override
    public void eat(String type, String food) {
        super.eat("лошадь", "овес");
    }

    @Override
    public void makeNoise(String type, String sound) {
        super.makeNoise("лошадь", "игого");
    }

    @Override
    public void sleep(String type, String lokation) {
        super.sleep("лошадь", "в конюшне");
    }
}
