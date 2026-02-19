/*
 * Decompiled with CFR 0.152.
 */
package com.event.dispatch;

import a.Qh;
import com.app.events.EventTriggeringMechanism;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.session.ConnectionSessionManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.system.lifecycle.ResourceLifecycleManager1984;
import com.temporal.metadata.TemporalMetadataResolver;
import com.version.management.VersionController;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class EventDispatchOrchestrator394
implements EventTriggeringMechanism {
    private final Object d;
    private List<Object> b;
    private static String g;
    private static final Object[] h;
    public static boolean N;
    private static final long a;
    private static final Map f;
    private final Object n;
    private static final Integer[] e;
    private final Object U;
    private static final String[] i;
    private static final long[] c;

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 27;
                break;
            }
            case 1: {
                n3 = 15;
                break;
            }
            case 2: {
                n3 = 7;
                break;
            }
            case 3: {
                n3 = 63;
                break;
            }
            case 4: {
                n3 = 5;
                break;
            }
            case 5: {
                n3 = 35;
                break;
            }
            case 6: {
                n3 = 51;
                break;
            }
            case 7: {
                n3 = 16;
                break;
            }
            case 8: {
                n3 = 50;
                break;
            }
            case 9: {
                n3 = 1;
                break;
            }
            case 10: {
                n3 = 8;
                break;
            }
            case 11: {
                n3 = 54;
                break;
            }
            case 12: {
                n3 = 45;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 26;
                break;
            }
            case 15: {
                n3 = 13;
                break;
            }
            case 16: {
                n3 = 62;
                break;
            }
            case 17: {
                n3 = 4;
                break;
            }
            case 18: {
                n3 = 43;
                break;
            }
            case 19: {
                n3 = 20;
                break;
            }
            case 20: {
                n3 = 46;
                break;
            }
            case 21: {
                n3 = 0;
                break;
            }
            case 22: {
                n3 = 11;
                break;
            }
            case 23: {
                n3 = 61;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 3;
                break;
            }
            case 26: {
                n3 = 17;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 9;
                break;
            }
            case 29: {
                n3 = 14;
                break;
            }
            case 30: {
                n3 = 44;
                break;
            }
            case 31: {
                n3 = 23;
                break;
            }
            case 32: {
                n3 = 38;
                break;
            }
            case 33: {
                n3 = 19;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 12;
                break;
            }
            case 36: {
                n3 = 40;
                break;
            }
            case 37: {
                n3 = 36;
                break;
            }
            case 38: {
                n3 = 31;
                break;
            }
            case 39: {
                n3 = 37;
                break;
            }
            case 40: {
                n3 = 2;
                break;
            }
            case 41: {
                n3 = 53;
                break;
            }
            case 42: {
                n3 = 56;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 47;
                break;
            }
            case 45: {
                n3 = 33;
                break;
            }
            case 46: {
                n3 = 39;
                break;
            }
            case 47: {
                n3 = 49;
                break;
            }
            case 48: {
                n3 = 52;
                break;
            }
            case 49: {
                n3 = 24;
                break;
            }
            case 50: {
                n3 = 10;
                break;
            }
            case 51: {
                n3 = 55;
                break;
            }
            case 52: {
                n3 = 32;
                break;
            }
            case 53: {
                n3 = 41;
                break;
            }
            case 54: {
                n3 = 25;
                break;
            }
            case 55: {
                n3 = 58;
                break;
            }
            case 56: {
                n3 = 22;
                break;
            }
            case 57: {
                n3 = 6;
                break;
            }
            case 58: {
                n3 = 29;
                break;
            }
            case 59: {
                n3 = 34;
                break;
            }
            case 60: {
                n3 = 59;
                break;
            }
            case 61: {
                n3 = 30;
                break;
            }
            case 62: {
                n3 = 48;
                break;
            }
            default: {
                n3 = 28;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        EventDispatchOrchestrator394.i[n4] = new String(cArray);
        return n4;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EventDispatchOrchestrator394.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public EventDispatchOrchestrator394(Object object, Object object2, Object object3) {
        this.n = object;
        this.U = object2;
        this.d = object3;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EventDispatchOrchestrator394.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EventDispatchOrchestrator394.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = EventDispatchOrchestrator394.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = EventDispatchOrchestrator394.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EventDispatchOrchestrator394.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EventDispatchOrchestrator394.a(clazz3, string2, clazz2)) != null) {
                    EventDispatchOrchestrator394.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EventDispatchOrchestrator394.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EventDispatchOrchestrator394.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EventDispatchOrchestrator394.b(281020373714756L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1345;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/zu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EventDispatchOrchestrator394.e[n2] = n3;
        }
        return e[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EventDispatchOrchestrator394.a = MultiContainerRegistry.a(-6648816224765556591L, 4294165474839234847L, MethodHandles.lookup().lookupClass()).a(120963126359058L);
                EventDispatchOrchestrator394.h = new Object[5];
                EventDispatchOrchestrator394.i = new String[5];
                EventDispatchOrchestrator394.a();
                EventDispatchOrchestrator394.f = new HashMap<K, V>(13);
                var0 = EventDispatchOrchestrator394.a ^ 62600085104192L;
                EventDispatchOrchestrator394.J(null);
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u00ea\u00eb\u00c0R\u0010\u0006\u001e&\u0085%\u0004O\n\u0006\u0005\u00b5!\u00b2\u00a7\u00e9\u00f8\u00d3\u00d3\u00114\u009a\u00b9\u00f3Xv\u00datH\u00e0\u00d6\u00f65\u001c|\u00c7";
                var7_6 = "\u00ea\u00eb\u00c0R\u0010\u0006\u001e&\u0085%\u0004O\n\u0006\u0005\u00b5!\u00b2\u00a7\u00e9\u00f8\u00d3\u00d3\u00114\u009a\u00b9\u00f3Xv\u00datH\u00e0\u00d6\u00f65\u001c|\u00c7".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "U\u0083Q\u008cA@\u00106\u00b2\u0098_K\u00bc\u0005\u00a4\u0090";
                    var7_6 = "U\u0083Q\u008cA@\u00106\u00b2\u0098_K\u00bc\u0005\u00a4\u0090".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl43:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl56:
                // 1 sources

                ** continue;
            }
        }
        EventDispatchOrchestrator394.c = var8_3;
        EventDispatchOrchestrator394.e = new Integer[7];
        EventDispatchOrchestrator394.N = false;
    }

    public EventDispatchOrchestrator394(Object object, Object object2, boolean bl) {
        this.n = object;
        this.U = object2;
        this.d = bl;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EventDispatchOrchestrator394.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                EventDispatchOrchestrator394.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EventDispatchOrchestrator394.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = EventDispatchOrchestrator394.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = EventDispatchOrchestrator394.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = EventDispatchOrchestrator394.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EventDispatchOrchestrator394.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        EventDispatchOrchestrator394.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EventDispatchOrchestrator394.b(281020373714756L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EventDispatchOrchestrator394.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EventDispatchOrchestrator394.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EventDispatchOrchestrator394.b(281020373714756L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = EventDispatchOrchestrator394.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EventDispatchOrchestrator394.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "`2\u001d";
        objectArray[1] = Integer.TYPE;
        EventDispatchOrchestrator394.i[1] = "java/lang/Integer";
        objectArray[2] = "c\u0006jb\u0007xh\t{-z`{\u000erd";
        objectArray[3] = "<'Vv\\D7(G9=J<#Cc";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "H\u000e\u0002Zl&\\K\u00024:8,\u000fTSh8HW\nO`C\u0015O\u0005\u000f#>\u0014W_]Q";
    }

    @Override
    public boolean fire() {
        block27: {
            LightweightExecutionContext lightweightExecutionContext;
            long l;
            block29: {
                l = a ^ 0x1949663F1032L;
                try {
                    if (N) {
                        N = false;
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchOrchestrator394.a(customSystemException);
                }
                lightweightExecutionContext = new LightweightExecutionContext(this.n);
                Qh qh = new Qh(this.U);
                try {
                    block28: {
                        try {
                            try {
                                try {
                                    N = true;
                                    this.b = (List)lightweightExecutionContext.h(qh, this.d);
                                    if (!TemporalMetadataResolver.h.a().w.s().booleanValue()) break block27;
                                    if (lightweightExecutionContext.Y()) break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EventDispatchOrchestrator394.a(customSystemException);
                                }
                                if (lightweightExecutionContext.c() == null) break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDispatchOrchestrator394.a(customSystemException);
                            }
                            if (this.b != null) break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchOrchestrator394.a(customSystemException);
                        }
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchOrchestrator394.a(customSystemException);
                }
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            for (String string : new VersionController(lightweightExecutionContext.c()).V()) {
                if (string.equals(EventDispatchOrchestrator394.b("J", (int)EventDispatchOrchestrator394.a("v", (int)25004, (long)(0x6996045635BDF2BCL ^ l)), (long)-9199125791913395790L, (long)l)) || string.equals(EventDispatchOrchestrator394.b("J", (int)EventDispatchOrchestrator394.a("v", (int)7463, (long)(0x3D6C3D0B24C70E30L ^ l)), (long)-9199125791913395790L, (long)l)) || string.equals(EventDispatchOrchestrator394.b("J", (int)EventDispatchOrchestrator394.a("v", (int)4363, (long)(0x54ED81416A83021AL ^ l)), (long)-9199125791913395790L, (long)l)) || string.equals(EventDispatchOrchestrator394.b("J", (int)EventDispatchOrchestrator394.a("v", (int)27803, (long)(0x4A8F91018FFBFF8FL ^ l)), (long)-9199125791913395790L, (long)l))) continue;
                try {
                    if (string.equals(EventDispatchOrchestrator394.b("J", (int)EventDispatchOrchestrator394.a("v", (int)2128, (long)(0x3581937F47491B43L ^ l)), (long)-9199125791913395790L, (long)l))) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchOrchestrator394.a(customSystemException);
                }
                ConnectionSessionManager connectionSessionManager = new VersionController(lightweightExecutionContext.c()).w(string);
                arrayList.add("");
                if (connectionSessionManager.B(ReflectionMetadataResolver.Ec)) {
                    VersionController versionController = new VersionController(connectionSessionManager);
                    arrayList.add("\u00a79" + string);
                    for (String string2 : versionController.V()) {
                        ConnectionSessionManager connectionSessionManager2 = versionController.w(string2);
                        try {
                            try {
                                if (connectionSessionManager2.B(ReflectionMetadataResolver.Ec) || connectionSessionManager2.B(ReflectionMetadataResolver.Yw)) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDispatchOrchestrator394.a(customSystemException);
                            }
                            arrayList.add(string2 + (String)((Object)EventDispatchOrchestrator394.b("J", (int)EventDispatchOrchestrator394.a("v", (int)9026, (long)(0x4476698CBA2F3050L ^ l)), (long)-9199125791913395790L, (long)l)) + connectionSessionManager2.M().toString());
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchOrchestrator394.a(customSystemException);
                        }
                    }
                    continue;
                }
                arrayList.add(string + (String)((Object)EventDispatchOrchestrator394.b("J", (int)EventDispatchOrchestrator394.a("v", (int)4546, (long)(0x645F93A24D9E02D4L ^ l)), (long)-9199125791913395790L, (long)l)) + connectionSessionManager.M().toString());
            }
            try {
                if (arrayList.isEmpty()) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchOrchestrator394.a(customSystemException);
            }
            if (GeometryCalculator.C() >= 35) {
                for (String string : arrayList) {
                    this.b.add(ResourceLifecycleManager1984.z(string).M());
                }
            } else {
                this.b.addAll(arrayList);
            }
        }
        return true;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public List<?> getTooltip() {
        return this.b;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == '\u00f6' || c == 'o' || c == '\u00d4') {
                field = EventDispatchOrchestrator394.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EventDispatchOrchestrator394.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'J' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void J(String string) {
        g = string;
    }

    public static String f() {
        return g;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EventDispatchOrchestrator394.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(EventDispatchOrchestrator394.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

