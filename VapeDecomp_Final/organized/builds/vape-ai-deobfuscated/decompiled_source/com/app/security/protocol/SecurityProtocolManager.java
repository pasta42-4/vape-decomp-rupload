/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.app.security.protocol;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.temporal.metadata.TemporalMetadataResolver;
import com.vape.security.VapeSessionValidator;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class SecurityProtocolManager {
    private static AbstractComputationKernel[] h;
    private final HashMap<Class<?>, Map<String, VapeSessionValidator>> S;
    private final HashMap<Class<?>, Map<String, VapeSessionValidator>> n = new HashMap();

    private static Exception a(Exception exception) {
        return exception;
    }

    public void s(Class<?> clazz, String string, String string2, Class<?> clazz2) {
        this.J(clazz, string, string2, null, clazz2);
    }

    public void I(Class<?> clazz, String string, String string2, Class<?> clazz2, Class<?> ... classArray) {
        this.K(clazz, string, string2, null, clazz2, classArray);
    }

    public static void Y(AbstractComputationKernel[] abstractComputationKernelArray) {
        h = abstractComputationKernelArray;
    }

    public void y() {
        Method[] methodArray;
        for (Method method : methodArray = this.getClass().getDeclaredMethods()) {
            try {
                if (method.getParameterCount() != 0) {
                    continue;
                }
            }
            catch (Exception exception) {
                throw SecurityProtocolManager.a(exception);
            }
            method.setAccessible(true);
            try {
                method.invoke((Object)this, new Object[0]);
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
    }

    public void K(Class<?> clazz, String string, String string2, Boolean bl, Class<?> clazz2, Class<?> ... classArray) {
        this.S.compute(clazz, (arg_0, arg_1) -> SecurityProtocolManager.lambda$setMethodMapping$1(string, string2, bl, clazz2, classArray, arg_0, arg_1));
    }

    private static Map lambda$setFieldMapping$0(String string, String string2, Boolean bl, Class clazz, Class clazz2, Map hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap<String, VapeSessionValidator>();
        }
        hashMap.put(string, new VapeSessionValidator(string2, bl, clazz, new Class[0]));
        return hashMap;
    }

    @Nullable
    public VapeSessionValidator X(Class<?> clazz, String string) {
        Map<String, VapeSessionValidator> map = this.n.get(clazz);
        try {
            if (map == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityProtocolManager.a(customSystemException);
        }
        return map.getOrDefault(string, null);
    }

    public void F(Class<?> clazz, String string, String string2) {
        this.J(clazz, string, string2, null, null);
    }

    public SecurityProtocolManager() {
        this.S = new HashMap();
    }

    public void O(Class<?> clazz, String string, String string2, boolean bl) {
        this.K(clazz, string, string2, bl, null, new Class[0]);
    }

    public void K(Class<?> clazz, String string, String string2) {
        this.I(clazz, string, string2, null, new Class[0]);
    }

    public void J(Class<?> clazz, String string, String string2, Boolean bl, Class<?> clazz2) {
        this.n.compute(clazz, (arg_0, arg_1) -> SecurityProtocolManager.lambda$setFieldMapping$0(string, string2, bl, clazz2, arg_0, arg_1));
    }

    static {
        if (SecurityProtocolManager.A() == null) {
            SecurityProtocolManager.Y(new AbstractComputationKernel[3]);
        }
    }

    public static AbstractComputationKernel[] A() {
        return h;
    }

    public void u(Class<?> clazz, String string, String string2, boolean bl) {
        this.J(clazz, string, string2, bl, null);
    }

    @Nullable
    public VapeSessionValidator L(Class<?> clazz, String string) {
        Map<String, VapeSessionValidator> map = this.S.get(clazz);
        try {
            if (map == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityProtocolManager.a(customSystemException);
        }
        return map.getOrDefault(string, null);
    }

    public boolean h() {
        boolean bl;
        try {
            bl = !TemporalMetadataResolver.h.d();
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityProtocolManager.a(customSystemException);
        }
        return bl;
    }

    private static Map lambda$setMethodMapping$1(String string, String string2, Boolean bl, Class clazz, Class[] classArray, Class clazz2, Map hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap<String, VapeSessionValidator>();
        }
        hashMap.put(string, new VapeSessionValidator(string2, bl, clazz, classArray));
        return hashMap;
    }
}

