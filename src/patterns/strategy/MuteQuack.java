package patterns.strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        //不会叫
        System.out.println("<<silence>>");
    }
}
