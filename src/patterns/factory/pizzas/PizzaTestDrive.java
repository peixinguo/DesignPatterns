package patterns.factory.pizzas;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(simplePizzaFactory);
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We order a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We order a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
