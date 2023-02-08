package app;

// LAMBDA EXPRESSIONS

public class App {
    public static void main(String[] args) {
        Flyable f = new Plane();
        Flyable flambda = () -> System.out.println("f lambda");

        App.flyup(f);
        App.flyup(flambda);
    }

    public static void flyup(Flyable f) {
        f.fly();
    }
}

// class HelloWorld {
// public static void main(String[] args) {
// Flyable f = new TinyWhoop();
// Flyable flambda = (x, y) -> x + y;
// HelloWorld.throttleUp(flambda);
// }

// public static void throttleUp(Flyable f) {
// int y = 2;
// int z = 3;
// int x = f.fly(y, z);
// System.out.println(">>>> " + x);
// }
// }

// interface Flyable {
// public int fly(int x, int y);
// }

// class TinyWhoop implements Flyable {
// @Override
// public int fly(int x, int y) {
// System.out.println("flying..");
// return 0;
// }
// }