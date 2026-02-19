/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.MapMaker
 */
package com.util.encoding;

import com.classloading.dynamic.CustomClassLoader;
import com.exception.system.CustomSystemException;
import com.google.common.collect.MapMaker;
import java.util.concurrent.ConcurrentMap;

public class StringObfuscationUtility {
    private static String S;
    static final StringObfuscationUtility A;
    static final boolean e;
    private final ConcurrentMap<ClassLoader, CustomClassLoader> R = new MapMaker().weakKeys().makeMap();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public Class<?> D(ClassLoader classLoader, String string, byte[] byArray) {
        CustomClassLoader customClassLoader = this.R.computeIfAbsent(classLoader, CustomClassLoader::new);
        Object object = customClassLoader.getClassLoadingLock(string);
        synchronized (object) {
            Class clazz;
            block7: {
                clazz = CustomClassLoader.o(customClassLoader, string, byArray);
                if (e) break block7;
                try {
                    block8: {
                        if (clazz.getName().equals(string)) break block7;
                        break block8;
                        catch (CustomSystemException customSystemException) {
                            throw StringObfuscationUtility.a(customSystemException);
                        }
                    }
                    throw new AssertionError();
                }
                catch (CustomSystemException customSystemException) {
                    throw StringObfuscationUtility.a(customSystemException);
                }
            }
            return clazz;
        }
    }

    public static void z(String string) {
        S = string;
    }

    public static String H() {
        return S;
    }

    static {
        boolean bl;
        if (StringObfuscationUtility.H() != null) {
            StringObfuscationUtility.z("LlhWxc");
        }
        try {
            bl = !StringObfuscationUtility.class.desiredAssertionStatus();
        }
        catch (CustomSystemException customSystemException) {
            throw StringObfuscationUtility.a(customSystemException);
        }
        e = bl;
        A = new StringObfuscationUtility();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

