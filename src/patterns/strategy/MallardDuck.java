package patterns.strategy;

public class MallardDuck extends Duck{

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a  real Mallard duck.");
    }
}
f