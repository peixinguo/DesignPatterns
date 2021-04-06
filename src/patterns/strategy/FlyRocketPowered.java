package patterns.strategy;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子-火箭飞");
    }
}
