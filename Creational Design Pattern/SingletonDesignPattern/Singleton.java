import java.beans.SimpleBeanInfo;

public class Singleton {
    private static Singleton obj = new Singleton();

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return obj;
    }
}
