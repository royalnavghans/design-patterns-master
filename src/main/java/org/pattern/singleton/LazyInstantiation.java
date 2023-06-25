package org.pattern.singleton;

public class LazyInstantiation {
    private static LazyInstantiation instance;

    private LazyInstantiation() {}

    public static LazyInstantiation getInstance() {
        if(instance == null) {
            instance = new LazyInstantiation();
        }
        return instance;
    }

//    Thread safe singleton
    public static synchronized LazyInstantiation getSynchronizedInstance() {
        if(instance == null) {
            instance = new LazyInstantiation();
        }
        return instance;
    }

//    Thread safe singleton double check
    public static LazyInstantiation getSynchronizedInstanceDoubleCheck() {
        synchronized (LazyInstantiation.class) {
            if(instance == null) {
                instance = new LazyInstantiation();
            }
        }
        return instance;
    }

}
