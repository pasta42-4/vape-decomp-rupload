/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import a.bE;
import a.bN;
import com.app.workflow.StateTrackingCoordinator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.crypto.cipher.SymmetricCipherManager;
import com.exception.system.CustomSystemException;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.crypto.CryptographicSecurityManager396;
import com.simulation.core.ScenarioSimulationEngine;
import com.system.configuration.ConfigurationManager;
import com.util.reflection.ReflectionUtility;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ResourceAllocator
extends ScenarioSimulationEngine {
    private static final Object[] fb;
    private ReflectionUtility b;
    private static final long[] bb;
    private static final String[] jb;
    private static final Integer[] db;
    private static final Map eb;
    private static final long ab;
    private final SymmetricCipherManager V = (SymmetricCipherManager)this.t();

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceAllocator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceAllocator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceAllocator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBA1;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceAllocator.db[n2] = n3;
        }
        return db[n2];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ResourceAllocator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceAllocator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '$' || c == 'b' || c == 'K' || c == 'V') {
                field = ResourceAllocator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '$' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceAllocator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'U' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field g(long l, long l2) {
        int n = ResourceAllocator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceAllocator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceAllocator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceAllocator.c(clazz3, string2, clazz2)) != null) {
                    ResourceAllocator.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceAllocator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceAllocator.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceAllocator.f(224854344629675L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method h(long l, long l2) {
        int n = ResourceAllocator.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceAllocator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceAllocator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceAllocator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceAllocator.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceAllocator.f(224854344629675L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceAllocator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceAllocator.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceAllocator.f(224854344629675L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void G() {
        boolean bl;
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        long l = ab ^ 0x49CA361CE919L;
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.8);
        try {
            d5 = this.G();
            d4 = this.W() + 2.5;
            d3 = this.w() - 5.0;
            d2 = this.b() - 5.0;
            color = this.s() ? ResourceAllocator.M.k : ResourceAllocator.M.S;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator.a(customSystemException);
        }
        ConfigurationManager.U(d5, d4, d3, d2, color, 2.0f, 0.75f, 1.0f);
        StateTrackingCoordinator.B(ResourceAllocator.M.Z, (float)(this.G() + 8.0), (float)(this.W() + 7.0), (String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)19578, (long)(0x625AE8D71BCDBBDAL ^ l)), (long)8938363529525495859L, (long)l)), 6.0f, 6.0f, false);
        cryptographicParameterGenerator.R((String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)28737, (long)(0x2686245BBCB907E9L ^ l)), (long)8938363529525495859L, (long)l)), this.G() + 18.0, this.W() + 7.0, ResourceAllocator.M.c);
        ConfigurationManager.T(this.G() + 44.0, this.W() + 8.0, 5.0, 1.0f, ResourceAllocator.M.S);
        Object object = "";
        if (this.b.c().s().booleanValue()) {
            object = (String)object + (String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)4956, (long)(0x273E2105FDC064F0L ^ l)), (long)8938363529525495859L, (long)l));
        }
        if (((AuthenticationStateTracker)this.b.J()).s().booleanValue()) {
            object = (String)object + (String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)720, (long)(0x50093E9EF0DD757EL ^ l)), (long)8938363529525495859L, (long)l));
        }
        if (this.b.G().s().booleanValue()) {
            object = (String)object + (String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)12875, (long)(0xCF33C58148545EAL ^ l)), (long)8938363529525495859L, (long)l));
        }
        try {
            bl = !((String)object).isEmpty();
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator.a(customSystemException);
        }
        boolean bl2 = bl;
        String string = "";
        if (this.b.z().s().booleanValue()) {
            string = string + (String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)20774, (long)(0x2181B986E92B268DL ^ l)), (long)8938363529525495859L, (long)l));
        }
        if (this.b.u().s().booleanValue()) {
            string = string + (String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)24950, (long)(0x1D99E049AF96DBL ^ l)), (long)8938363529525495859L, (long)l));
        }
        if (this.b.t().s().booleanValue()) {
            string = string + (String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)27718, (long)(0x18BBE8E5972D1BE1L ^ l)), (long)8938363529525495859L, (long)l));
        }
        if (!string.isEmpty()) {
            string = (String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)6765, (long)(0x1B0E5FA706DC6DC4L ^ l)), (long)8938363529525495859L, (long)l)) + string;
        }
        if (((String)(object = (String)object + string)).endsWith((String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)9140, (long)(0x3C4F257D96F1541EL ^ l)), (long)8938363529525495859L, (long)l)))) {
            object = ((String)object).substring(0, ((String)object).length() - 2);
        }
        if (!bl2) {
            object = ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)24322, (long)(0x7C4A20E675028A0L ^ l)), (long)8938363529525495859L, (long)l);
        }
        CryptographicSecurityManager396 cryptographicSecurityManager396 = new CryptographicSecurityManager396((String)object, (String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)1855, (long)(0x77641FBF6F1FF090L ^ l)), (long)8938363529525495859L, (long)l)), 105.0, 0.8, ResourceAllocator.M.c, false);
        cryptographicSecurityManager396.y(this.G() + 52.0, this.W() + 7.0);
        cryptographicParameterGenerator.R((String)((Object)ResourceAllocator.c("B", (int)ResourceAllocator.b("z", (int)23635, (long)(0x3442254F079ABF0L ^ l)), (long)8938363529525495859L, (long)l)), this.G() + this.w() - 20.0, this.W() + 7.0, ResourceAllocator.M.c);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceAllocator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public ResourceAllocator(ReflectionUtility reflectionUtility) {
        super(new SymmetricCipherManager(50.0));
        this.V.n(new bE(0.0, 2.0), new Object[0]);
        this.V.n(new bN(reflectionUtility), new Object[0]);
        this.V.n(new AdaptiveCipherEngine(reflectionUtility.z()), new Object[0]);
        this.V.n(new AdaptiveCipherEngine(reflectionUtility.u()), new Object[0]);
        this.V.n(new AdaptiveCipherEngine(reflectionUtility.t()), new Object[0]);
        this.b = reflectionUtility;
        this.w(20.0);
        this.P(20.0);
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceAllocator.ab = MultiContainerRegistry.a(-8748966126015134008L, 1870609716800947013L, MethodHandles.lookup().lookupClass()).a(185557756600544L);
                ResourceAllocator.fb = new Object[5];
                ResourceAllocator.jb = new String[5];
                ResourceAllocator.i();
                ResourceAllocator.eb = new HashMap<K, V>(13);
                var0 = ResourceAllocator.ab ^ 65443283850656L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u009c\u0019\u009a_{Z\u00d7\u0082\u0093m\u001bB\u0002\u00b1X<\u00c7\u00a5\u0090\u00a7+\u00e6\u0019\u0095T\u0011u7\u00a83\u0091\u0002\u001e+\u00aag\u00e3*]\u0003d\u00a6\u001e\u00f7NW\u00f31$.\u00aa$\u0092{\u009f\u00e4d;\u00d7\u0088jN\u00e0\bQ\u0090\u0015Q\u0013\u00fdn\u0087\u00fe\u00e5&\u0002\u000b[\n\u00b5\u0004\u00f5*C\u00f0\u0087\u00b1\n";
                var7_6 = "\u009c\u0019\u009a_{Z\u00d7\u0082\u0093m\u001bB\u0002\u00b1X<\u00c7\u00a5\u0090\u00a7+\u00e6\u0019\u0095T\u0011u7\u00a83\u0091\u0002\u001e+\u00aag\u00e3*]\u0003d\u00a6\u001e\u00f7NW\u00f31$.\u00aa$\u0092{\u009f\u00e4d;\u00d7\u0088jN\u00e0\bQ\u0090\u0015Q\u0013\u00fdn\u0087\u00fe\u00e5&\u0002\u000b[\n\u00b5\u0004\u00f5*C\u00f0\u0087\u00b1\n".length();
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
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0011\u00b2\u0013\u00a6\u00da*\u00ab\u0004\u00c8\u0093@!\u00a4Z`x";
                    var7_6 = "\u0011\u00b2\u0013\u00a6\u00da*\u00ab\u0004\u00c8\u0093@!\u00a4Z`x".length();
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
lbl42:
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        ResourceAllocator.bb = var8_3;
        ResourceAllocator.db = new Integer[13];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceAllocator.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceAllocator.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "|q\u001e";
        objectArray[1] = Integer.TYPE;
        ResourceAllocator.jb[1] = "java/lang/Integer";
        objectArray[2] = "8'o4hI3(~{\u0015Q /w2";
        objectArray[3] = "dl.6WEoc?y6Kdh;#";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "n~vS3Kk'm\"4[\f.2Y9\u001dr/sK` 5y1P DspgA_";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 45;
                break;
            }
            case 1: {
                n3 = 58;
                break;
            }
            case 2: {
                n3 = 7;
                break;
            }
            case 3: {
                n3 = 43;
                break;
            }
            case 4: {
                n3 = 52;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 59;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 16;
                break;
            }
            case 9: {
                n3 = 17;
                break;
            }
            case 10: {
                n3 = 49;
                break;
            }
            case 11: {
                n3 = 54;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 44;
                break;
            }
            case 14: {
                n3 = 0;
                break;
            }
            case 15: {
                n3 = 34;
                break;
            }
            case 16: {
                n3 = 41;
                break;
            }
            case 17: {
                n3 = 24;
                break;
            }
            case 18: {
                n3 = 38;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 39;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 36;
                break;
            }
            case 23: {
                n3 = 57;
                break;
            }
            case 24: {
                n3 = 8;
                break;
            }
            case 25: {
                n3 = 61;
                break;
            }
            case 26: {
                n3 = 13;
                break;
            }
            case 27: {
                n3 = 10;
                break;
            }
            case 28: {
                n3 = 30;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 28;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 11;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 53;
                break;
            }
            case 35: {
                n3 = 33;
                break;
            }
            case 36: {
                n3 = 27;
                break;
            }
            case 37: {
                n3 = 56;
                break;
            }
            case 38: {
                n3 = 46;
                break;
            }
            case 39: {
                n3 = 32;
                break;
            }
            case 40: {
                n3 = 37;
                break;
            }
            case 41: {
                n3 = 47;
                break;
            }
            case 42: {
                n3 = 26;
                break;
            }
            case 43: {
                n3 = 21;
                break;
            }
            case 44: {
                n3 = 5;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 42;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 23;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 20;
                break;
            }
            case 53: {
                n3 = 40;
                break;
            }
            case 54: {
                n3 = 35;
                break;
            }
            case 55: {
                n3 = 63;
                break;
            }
            case 56: {
                n3 = 29;
                break;
            }
            case 57: {
                n3 = 18;
                break;
            }
            case 58: {
                n3 = 6;
                break;
            }
            case 59: {
                n3 = 14;
                break;
            }
            case 60: {
                n3 = 62;
                break;
            }
            case 61: {
                n3 = 3;
                break;
            }
            case 62: {
                n3 = 60;
                break;
            }
            default: {
                n3 = 31;
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
        ResourceAllocator.jb[n4] = new String(cArray);
        return n4;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ResourceAllocator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

