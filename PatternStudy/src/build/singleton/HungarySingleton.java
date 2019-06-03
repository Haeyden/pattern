package build.singleton;

/**
 * 饿汉单例
 */
public class HungarySingleton {
    private static final HungarySingleton instance = new HungarySingleton();
    private HungarySingleton(){
    }
    private static HungarySingleton getInstance(){
        return instance;
    }
}
