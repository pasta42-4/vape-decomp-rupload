/*
 * Decompiled with CFR 0.152.
 */
package com.classloading.dynamic;

class CustomClassLoader
extends ClassLoader {
    static {
        ClassLoader.registerAsParallelCapable();
    }

    static Class o(CustomClassLoader customClassLoader, String string, byte[] byArray) {
        return customClassLoader.T(string, byArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Class<?> T(String string, byte[] byArray) {
        Object object = this.getClassLoadingLock(string);
        synchronized (object) {
            Class<?> clazz = this.defineClass(string, byArray, 0, byArray.length);
            this.resolveClass(clazz);
            return clazz;
        }
    }

    public CustomClassLoader(ClassLoader classLoader) {
        super(classLoader);
    }

    @Override
    public Object getClassLoadingLock(String string) {
        return super.getClassLoadingLock(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean s(String string) {
        Object object = this.getClassLoadingLock(string);
        synchronized (object) {
            try {
                Class.forName(string);
                return true;
            }
            catch (ClassNotFoundException classNotFoundException) {
                return false;
            }
        }
    }
}

