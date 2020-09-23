public  class Animal {

  protected   String food;
    protected String location;
    protected String type;
    protected String sound;

     void makeNoise(String type, String sound) {
        System.out.println(" животное " + type + " издает звук " + sound);
    }

    void eat(String type, String food) {
        System.out.println(" животное " + type + " ест " + food);
    }



    void sleep(String type, String location) {
        System.out.println(" животное " + type + " спит " + location);
    }
}
