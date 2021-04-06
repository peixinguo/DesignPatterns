package patterns.strategy;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        //实现鸭子的飞行动作
        System.out.println("鸭子飞");
    }
}
