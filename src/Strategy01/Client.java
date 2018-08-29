package Strategy01;

public class Client {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        System.out.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        System.out.println();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.display();
    }
}
