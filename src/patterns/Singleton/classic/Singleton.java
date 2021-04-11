package patterns.Singleton.classic;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
