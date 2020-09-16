import java.util.*;

public class Animal{
     String food;
    String lokation;
     String type;
    String sound;

    // public Animal(String type) {
     // this.type = type;
   // }
    public static void main(String[] args) {
    }

         public  void makeNoise (String type, String sound){
            System.out.println(type+" животное издает звук "+sound);
        }
        public void eat(String type,String food){
            System.out.println(type + " животное ест "+food);
        }
        public void sleep (String type,String lokation){
            System.out.println(type + " животное спит "+lokation);
        }


}
