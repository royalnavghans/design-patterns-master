package org.pattern;

import org.pattern.factory.Mobile;
import org.pattern.factory.MobileFactory;
import org.pattern.factory.MobileType;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = MobileFactory.getInstance(MobileType.IOS);
        mobile.instagram();
        Mobile androidMobile = MobileFactory.getInstance(MobileType.ANDROID);
        androidMobile.instagram();
    }
}