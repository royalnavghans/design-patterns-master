package org.pattern.singleton;

public class StaticBlockInstantiation {
    private static final StaticBlockInstantiation instance;

    private StaticBlockInstantiation() {}

    static {
        try{
            instance = new StaticBlockInstantiation();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static StaticBlockInstantiation getInstance() {
        return instance;
    }
}