package patterns.composite.menu;

import java.util.ArrayList;

public class Menu extends MenuComponent{
    String name;
    String description;
    ArrayList<MenuComponent> menuComponents;

    public Menu(String menuName, String description) {
        this.name = menuName;
        this.description = description;
        this.menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        for (MenuComponent menu: menuComponents
             ) {
            menu.print();
        }
    }
}
