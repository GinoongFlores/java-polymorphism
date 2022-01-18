package examples_handout;


public class Cat extends Animal {
    public static void main(String[] args) {
        //Upcasting is casting from a subclass to a superclass.
        Cat c = new Cat();
        Animal a = c;

        // Downcasting is casting from superclass to a subclass.
        Animal aa = new Cat();
        Cat cc = (Cat) aa;
    }
}
