package patterns.strategy;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        //什么都不做，不会飞！
        System.out.println("I can't fly");

    }
}
