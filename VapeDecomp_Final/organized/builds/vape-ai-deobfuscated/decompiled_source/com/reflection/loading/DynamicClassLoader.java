/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.loading;

import com.core.exception.CustomRuntimeException;
import com.exception.system.CustomSystemException;
import com.vape.network.VapeDataExchangeProtocol;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URL;

public class DynamicClassLoader
implements VapeDataExchangeProtocol {
    private Reference<ClassLoader> A;

    public String toString() {
        String string;
        try {
            string = this.A.get() == null ? "<null>" : this.A.get().toString();
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicClassLoader.a(customSystemException);
        }
        return string;
    }

    @Override
    public InputStream o(String string) throws CustomRuntimeException {
        String string2 = string.replace('.', '/') + ".class";
        ClassLoader classLoader = this.A.get();
        try {
            if (classLoader == null) {
                return null;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw DynamicClassLoader.a(customRuntimeException);
        }
        InputStream inputStream = classLoader.getResourceAsStream(string2);
        return inputStream;
    }

    @Override
    public URL Y(String string) {
        String string2 = string.replace('.', '/') + ".class";
        ClassLoader classLoader = this.A.get();
        try {
            if (classLoader == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicClassLoader.a(customSystemException);
        }
        URL uRL = classLoader.getResource(string2);
        return uRL;
    }

    public DynamicClassLoader(ClassLoader classLoader) {
        this.A = new WeakReference<ClassLoader>(classLoader);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

