package patterns.strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        //实现鸭子叫
        System.out.println("鸭子嘎嘎叫Quack");
    }
}
