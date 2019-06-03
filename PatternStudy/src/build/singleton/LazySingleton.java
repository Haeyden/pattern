package build.singleton;

/**
 * 懒汉单例模式  用到时再加载
 *
 */
public class LazySingleton {
    //加同步
    private static volatile LazySingleton instence;

    //避免在外部实例化
    private LazySingleton() {
    }

    //getInstance加同步
    public static synchronized LazySingleton getInstance() {
        if (instence == null) {
            instence = new LazySingleton();
        }
        return instence;
    }

}
