package org.pattern.factory;

public class MobileFactory {
    public static Mobile getInstance(MobileType type) {
        if(type.equals(MobileType.ANDROID)) return new AndroidMobile();
        else if (type.equals(MobileType.IOS)) return new IOSMobile();
        else throw new RuntimeException("Not a valid type");
    }
}