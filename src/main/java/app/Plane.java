package app;

public class Plane implements Flyable {
  @Override
  public void fly() {
    System.out.println("Hello we're off!");
  }
}
