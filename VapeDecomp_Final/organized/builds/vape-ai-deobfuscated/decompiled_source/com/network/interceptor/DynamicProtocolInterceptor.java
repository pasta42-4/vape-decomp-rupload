/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
package com.network.interceptor;

import a.Ne;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatchOrchestrator1391;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometricDimensionCalculator;
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
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class DynamicProtocolInterceptor {
    private final HashMap<Integer, GeometricDimensionCalculator> A = new HashMap();
    private boolean T;
    private static final long a;
    private static final Map d;
    private static final Integer[] c;
    private static final Object[] f;
    private static final DynamicProtocolInterceptor v;
    private static final long[] b;
    private static final String[] g;
    private int e = 1;

    private static void a() {
        Object[] objectArray = f;
        f[0] = "2\u00197";
        objectArray[1] = Integer.TYPE;
        DynamicProtocolInterceptor.g[1] = "java/lang/Integer";
        objectArray[2] = "\bm\fo5\u0018\u0003b\u001d H\u0000\u0010e\u0014i";
        objectArray[3] = "9Sl\u0007KB2\\}H*L9Wy\u0012";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0005>_\u0002a\u000f\u0016}C92KksV\u0002eS\u0015~@CY\t\u0017b\u0007\b(B\u0016q\b9";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicProtocolInterceptor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicProtocolInterceptor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'x' || c == '\u00ec' || c == '\u00e7' || c == 'E') {
                field = DynamicProtocolInterceptor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicProtocolInterceptor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicProtocolInterceptor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void w() {
        GL11.glClearStencil((int)0);
        GL11.glClear((int)1024);
        this.A.clear();
        this.e = 1;
    }

    public void S(boolean bl) {
        int n;
        DynamicProtocolInterceptor dynamicProtocolInterceptor;
        GeometricDimensionCalculator geometricDimensionCalculator;
        GeometricDimensionCalculator geometricDimensionCalculator2;
        DynamicProtocolInterceptor dynamicProtocolInterceptor2;
        try {
            GeometricDimensionCalculator geometricDimensionCalculator3;
            dynamicProtocolInterceptor2 = this;
            geometricDimensionCalculator2 = geometricDimensionCalculator3;
            geometricDimensionCalculator = geometricDimensionCalculator3;
            dynamicProtocolInterceptor = this;
            n = this.T ? 519 : 512;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProtocolInterceptor.a(customSystemException);
        }
        geometricDimensionCalculator2(dynamicProtocolInterceptor, n, bl ? this.e : this.e - 1, this.w(), 7681, 7681, 7681);
        dynamicProtocolInterceptor2.Z(geometricDimensionCalculator);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x111F;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/eC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicProtocolInterceptor.c[n2] = n3;
        }
        return c[n2];
    }

    public void s() {
        long l = a ^ 0x657FDABC358DL;
        try {
            if (this.e == 1) {
                GL11.glClearStencil((int)0);
                GL11.glClear((int)1024);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProtocolInterceptor.a(customSystemException);
        }
        try {
            Ne.h.y(2960);
            ++this.e;
            if (this.e > this.w()) {
                System.out.println((String)((Object)DynamicProtocolInterceptor.b("\u00e1", (int)DynamicProtocolInterceptor.a("v", (int)13919, (long)(0x743ADB268172DF05L ^ l)), (long)8666701123016880176L, (long)l)));
                this.e = 1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProtocolInterceptor.a(customSystemException);
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 23;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 0;
                break;
            }
            case 7: {
                n3 = 62;
                break;
            }
            case 8: {
                n3 = 55;
                break;
            }
            case 9: {
                n3 = 9;
                break;
            }
            case 10: {
                n3 = 18;
                break;
            }
            case 11: {
                n3 = 6;
                break;
            }
            case 12: {
                n3 = 53;
                break;
            }
            case 13: {
                n3 = 63;
                break;
            }
            case 14: {
                n3 = 8;
                break;
            }
            case 15: {
                n3 = 27;
                break;
            }
            case 16: {
                n3 = 50;
                break;
            }
            case 17: {
                n3 = 49;
                break;
            }
            case 18: {
                n3 = 59;
                break;
            }
            case 19: {
                n3 = 24;
                break;
            }
            case 20: {
                n3 = 44;
                break;
            }
            case 21: {
                n3 = 13;
                break;
            }
            case 22: {
                n3 = 57;
                break;
            }
            case 23: {
                n3 = 26;
                break;
            }
            case 24: {
                n3 = 35;
                break;
            }
            case 25: {
                n3 = 21;
                break;
            }
            case 26: {
                n3 = 36;
                break;
            }
            case 27: {
                n3 = 33;
                break;
            }
            case 28: {
                n3 = 45;
                break;
            }
            case 29: {
                n3 = 61;
                break;
            }
            case 30: {
                n3 = 20;
                break;
            }
            case 31: {
                n3 = 38;
                break;
            }
            case 32: {
                n3 = 43;
                break;
            }
            case 33: {
                n3 = 17;
                break;
            }
            case 34: {
                n3 = 54;
                break;
            }
            case 35: {
                n3 = 56;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 3;
                break;
            }
            case 38: {
                n3 = 29;
                break;
            }
            case 39: {
                n3 = 34;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 28;
                break;
            }
            case 42: {
                n3 = 32;
                break;
            }
            case 43: {
                n3 = 48;
                break;
            }
            case 44: {
                n3 = 1;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 7;
                break;
            }
            case 47: {
                n3 = 19;
                break;
            }
            case 48: {
                n3 = 37;
                break;
            }
            case 49: {
                n3 = 4;
                break;
            }
            case 50: {
                n3 = 5;
                break;
            }
            case 51: {
                n3 = 46;
                break;
            }
            case 52: {
                n3 = 10;
                break;
            }
            case 53: {
                n3 = 31;
                break;
            }
            case 54: {
                n3 = 15;
                break;
            }
            case 55: {
                n3 = 47;
                break;
            }
            case 56: {
                n3 = 22;
                break;
            }
            case 57: {
                n3 = 30;
                break;
            }
            case 58: {
                n3 = 41;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 2;
                break;
            }
            case 61: {
                n3 = 58;
                break;
            }
            case 62: {
                n3 = 40;
                break;
            }
            default: {
                n3 = 52;
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
        DynamicProtocolInterceptor.g[n4] = new String(cArray);
        return n4;
    }

    public void Z(GeometricDimensionCalculator geometricDimensionCalculator) {
        GL11.glStencilFunc((int)GeometricDimensionCalculator.s, (int)GeometricDimensionCalculator.C, (int)GeometricDimensionCalculator.G);
        GL11.glStencilOp((int)GeometricDimensionCalculator.X, (int)GeometricDimensionCalculator.B, (int)GeometricDimensionCalculator.z);
        this.A.put(this.e, geometricDimensionCalculator);
    }

    public void U() {
        this.Z(new GeometricDimensionCalculator(this, 517, this.e, this.w(), 7680, 7680, 7680));
    }

    public int L() {
        return this.e;
    }

    public void C() {
        this.Z(new GeometricDimensionCalculator(this, 514, this.e, this.w(), 7680, 7680, 7680));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicProtocolInterceptor.a = MultiContainerRegistry.a(8715603659875238226L, 3308778191855829682L, MethodHandles.lookup().lookupClass()).a(103553974592165L);
                DynamicProtocolInterceptor.f = new Object[5];
                DynamicProtocolInterceptor.g = new String[5];
                DynamicProtocolInterceptor.a();
                DynamicProtocolInterceptor.d = new HashMap<K, V>(13);
                var0 = DynamicProtocolInterceptor.a ^ 22716526133977L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "3\u008em\u00b7A+\u00b3_R\u00d4\u00162_d\u009fLH%\u00a0P\u0087\u00aa\u00e8\u00e2\u0087\u000f8L\u00cd\u00f1\u0018}\u00946O\u00ed##\u00fdy\u0002\u00fe.HF:u\u00ab\u0085\u00cb\u0085\u00bf\u0006/\u009b.";
                var7_6 = "3\u008em\u00b7A+\u00b3_R\u00d4\u00162_d\u009fLH%\u00a0P\u0087\u00aa\u00e8\u00e2\u0087\u000f8L\u00cd\u00f1\u0018}\u00946O\u00ed##\u00fdy\u0002\u00fe.HF:u\u00ab\u0085\u00cb\u0085\u00bf\u0006/\u009b.".length();
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
                    var6_5 = "\u00f8\u00f9i\u00ab,n oK!\u00be\u0002\u0090R\u0098K";
                    var7_6 = "\u00f8\u00f9i\u00ab,n oK!\u00be\u0002\u0090R\u0098K".length();
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
        DynamicProtocolInterceptor.b = var8_3;
        DynamicProtocolInterceptor.c = new Integer[9];
        DynamicProtocolInterceptor.v = new DynamicProtocolInterceptor();
    }

    private static Field c(long l, long l2) {
        int n = DynamicProtocolInterceptor.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicProtocolInterceptor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicProtocolInterceptor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicProtocolInterceptor.a(clazz3, string2, clazz2)) != null) {
                    DynamicProtocolInterceptor.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicProtocolInterceptor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicProtocolInterceptor.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicProtocolInterceptor.b(240879302179389L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void k(EventDispatchOrchestrator1391 eventDispatchOrchestrator1391) {
        long l = a ^ 0x27E2B9AD10DFL;
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)eventDispatchOrchestrator1391.D());
        int n = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)DynamicProtocolInterceptor.a("v", (int)16963, (long)(0x3C11BC4434B38E41L ^ l)), (int)n);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)DynamicProtocolInterceptor.a("v", (int)19993, (long)(0x5A17066066E78216L ^ l)), (int)DynamicProtocolInterceptor.a("v", (int)22638, (long)(0x70543E4FA6C9465L ^ l)), (int)ApplicationLifecycleManager.e(), (int)ApplicationLifecycleManager.b());
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)DynamicProtocolInterceptor.a("v", (int)4735, (long)(0x177D2DBF7EB65E76L ^ l)), (int)DynamicProtocolInterceptor.a("v", (int)32678, (long)(0x78E0468DAFC5B3ACL ^ l)), (int)DynamicProtocolInterceptor.a("v", (int)19993, (long)(0x5A17066066E78216L ^ l)), (int)n);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)DynamicProtocolInterceptor.a("v", (int)16560, (long)(0x330DF41458660CBDL ^ l)), (int)DynamicProtocolInterceptor.a("v", (int)4101, (long)(0x12A59D8C49A65C0BL ^ l)), (int)DynamicProtocolInterceptor.a("v", (int)19993, (long)(0x5A17066066E78216L ^ l)), (int)n);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicProtocolInterceptor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void R() {
        block4: {
            EventDispatchOrchestrator1391 eventDispatchOrchestrator1391 = ApplicationLifecycleManager.y();
            try {
                try {
                    if (!eventDispatchOrchestrator1391.r() || eventDispatchOrchestrator1391.D() <= -1) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProtocolInterceptor.a(customSystemException);
                }
                DynamicProtocolInterceptor.k(eventDispatchOrchestrator1391);
                eventDispatchOrchestrator1391.j(-1);
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProtocolInterceptor.a(customSystemException);
            }
        }
    }

    public void B() {
        block9: {
            block8: {
                long l = a ^ 0x78C7F723973DL;
                try {
                    if (this.e == 1) {
                        System.out.println((String)((Object)DynamicProtocolInterceptor.b("\u00e1", (int)DynamicProtocolInterceptor.a("v", (int)19168, (long)(0x319A4E6D16E0010EL ^ l)), (long)-2668853950039862656L, (long)l)));
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProtocolInterceptor.a(customSystemException);
                }
                try {
                    --this.e;
                    if (this.e != 1) break block8;
                    Ne.h.z(2960);
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicProtocolInterceptor.a(customSystemException);
                }
            }
            GeometricDimensionCalculator geometricDimensionCalculator = this.A.remove(this.e);
            try {
                if (geometricDimensionCalculator != null) {
                    geometricDimensionCalculator.g();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicProtocolInterceptor.a(customSystemException);
            }
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/eC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static DynamicProtocolInterceptor F() {
        return v;
    }

    public void S(double d2, double d3, double d4, double d5) {
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d2, (double)d5);
        GL11.glVertex2d((double)d4, (double)d5);
        GL11.glVertex2d((double)d4, (double)d3);
        GL11.glVertex2d((double)d2, (double)d3);
        GL11.glEnd();
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicProtocolInterceptor.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicProtocolInterceptor.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void e() {
        int n;
        DynamicProtocolInterceptor dynamicProtocolInterceptor;
        GeometricDimensionCalculator geometricDimensionCalculator;
        GeometricDimensionCalculator geometricDimensionCalculator2;
        DynamicProtocolInterceptor dynamicProtocolInterceptor2;
        try {
            GeometricDimensionCalculator geometricDimensionCalculator3;
            dynamicProtocolInterceptor2 = this;
            geometricDimensionCalculator2 = geometricDimensionCalculator3;
            geometricDimensionCalculator = geometricDimensionCalculator3;
            dynamicProtocolInterceptor = this;
            n = this.T ? 519 : 512;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProtocolInterceptor.a(customSystemException);
        }
        geometricDimensionCalculator2(dynamicProtocolInterceptor, n, this.e, this.w(), 7681, 7680, 7680);
        dynamicProtocolInterceptor2.Z(geometricDimensionCalculator);
    }

    public void a(boolean bl) {
        this.T = bl;
    }

    public int w() {
        return (int)(Math.pow(2.0, this.X()) - 1.0);
    }

    public void M(double d2, double d3, double d4) {
        GL11.glBegin((int)6);
        for (int i = 0; i <= 360; ++i) {
            double d5 = Math.sin((double)i * Math.PI / 180.0) * d4;
            double d6 = Math.cos((double)i * Math.PI / 180.0) * d4;
            GL11.glVertex2d((double)(d2 + d5), (double)(d3 + d6));
        }
        GL11.glEnd();
    }

    public int X() {
        return GL11.glGetInteger((int)3415);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method d(long l, long l2) {
        int n = DynamicProtocolInterceptor.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicProtocolInterceptor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicProtocolInterceptor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicProtocolInterceptor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicProtocolInterceptor.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicProtocolInterceptor.b(240879302179389L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicProtocolInterceptor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicProtocolInterceptor.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicProtocolInterceptor.b(240879302179389L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/eC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public GeometricDimensionCalculator v() {
        return this.A.get(this.e);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DynamicProtocolInterceptor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicProtocolInterceptor.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicProtocolInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicProtocolInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

