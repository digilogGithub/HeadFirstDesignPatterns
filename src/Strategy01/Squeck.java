package Strategy01;

public class Squeck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
