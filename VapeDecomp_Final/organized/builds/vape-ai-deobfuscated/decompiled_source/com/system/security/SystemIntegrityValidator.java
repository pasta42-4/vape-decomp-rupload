/*
 * Decompiled with CFR 0.152.
 */
package com.system.security;

import a.bm;
import a.hr;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.RenderingContextManager757;
import com.network.config.NetworkConfigurationEnum;
import com.reflection.utils.ReflectionProxyHandler;
import com.system.configuration.ConfigurationManager;
import com.system.lifecycle.SystemLifecycleController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
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

public class SystemIntegrityValidator
extends AbstractComputationKernel {
    private boolean R;
    private final hr n;
    private final VisualRenderContext B;
    private final bm F;
    private static final long b;
    private long V;
    private static final String[] Y;
    private static final long[] v;
    private static final Map E;
    private static final Object[] L;
    private static final Integer[] D;

    @Override
    public void U() {
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/CM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = SystemIntegrityValidator.e(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Y[n];
                int n3 = string2.indexOf(8);
                clazz3 = SystemIntegrityValidator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SystemIntegrityValidator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SystemIntegrityValidator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SystemIntegrityValidator.L[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SystemIntegrityValidator.f(237229639240913L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SystemIntegrityValidator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SystemIntegrityValidator.L[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SystemIntegrityValidator.f(237229639240913L, 0L);
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

    @Override
    public double z() {
        return 155.0;
    }

    public SystemIntegrityValidator() {
        long l = b ^ 0x2452DBA70D1AL;
        this.n = new hr((String)((Object)SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)1334, (long)(0x72A177AE19C3D7C4L ^ l)), (long)-8651653917730500407L, (long)l)), 0.8, SystemIntegrityValidator.M.Y, SystemIntegrityValidator.M.u);
        this.B = new VisualRenderContext((String)((Object)SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)5449, (long)(0x775F21F8AAABC7B4L ^ l)), (long)-8651653917730500407L, (long)l)), 0.8, false);
        this.F = new bm("", 0.8, SystemIntegrityValidator.M.n, false);
        this.R = false;
        this.V = -1L;
        this.o(this.F, this.n, this.B);
        this.B.T(32.0);
        this.B.w(10.0);
        this.B.N(this::O);
        this.F.p(0.9);
        this.F.n(90.0);
        this.n.q(false);
        this.n.A(SystemIntegrityValidator.M.c);
        this.n.N(this::p);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SystemIntegrityValidator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SystemIntegrityValidator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l, long l2) {
        int n = SystemIntegrityValidator.e(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            String string = Y[n];
            int n2 = string.indexOf(8);
            Class clazz = SystemIntegrityValidator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SystemIntegrityValidator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SystemIntegrityValidator.c(clazz3, string2, clazz2)) != null) {
                    SystemIntegrityValidator.L[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SystemIntegrityValidator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SystemIntegrityValidator.L[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SystemIntegrityValidator.f(237229639240913L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SystemIntegrityValidator.b = MultiContainerRegistry.a(2722814993967340312L, 135194164325566234L, MethodHandles.lookup().lookupClass()).a(259862812389922L);
                SystemIntegrityValidator.L = new Object[5];
                SystemIntegrityValidator.Y = new String[5];
                SystemIntegrityValidator.a();
                SystemIntegrityValidator.E = new HashMap<K, V>(13);
                var0 = SystemIntegrityValidator.b ^ 92447642154409L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u00fc\u00844\u00b6DM\u009b\u009f\u00d9\u0087\u0010\u0086\u0094\u0084\n\u0000\u00acW<\u00d7\u00d5j\u0084S|\u00c0\u0094=\u00c23\u00e8\u0000\"\u00e4p\u00a5\u00d1O\u0082\u0091\u0014.\u0019\u00f0\u0091\u0001\u00b0-\u00c0\u00b5f\u00c7L\u0096:\u0011\u00aa\u0080\u001fq\u0096\u00a62\u00b9";
                var7_6 = "\u00fc\u00844\u00b6DM\u009b\u009f\u00d9\u0087\u0010\u0086\u0094\u0084\n\u0000\u00acW<\u00d7\u00d5j\u0084S|\u00c0\u0094=\u00c23\u00e8\u0000\"\u00e4p\u00a5\u00d1O\u0082\u0091\u0014.\u0019\u00f0\u0091\u0001\u00b0-\u00c0\u00b5f\u00c7L\u0096:\u0011\u00aa\u0080\u001fq\u0096\u00a62\u00b9".length();
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
                    var6_5 = "\u00eaK\u00ff\u00caWV>\u00b4\u001b\u00f4\u0006\u00ce\u00fe?\u00e6K";
                    var7_6 = "\u00eaK\u00ff\u00caWV>\u00b4\u001b\u00f4\u0006\u00ce\u00fe?\u00e6K".length();
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
        SystemIntegrityValidator.v = var8_3;
        SystemIntegrityValidator.D = new Integer[10];
    }

    @Override
    public void d() {
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/CM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SystemIntegrityValidator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Y[n4] != null) {
            return n4;
        }
        Object object = L[n4];
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
                n3 = 41;
                break;
            }
            case 2: {
                n3 = 30;
                break;
            }
            case 3: {
                n3 = 63;
                break;
            }
            case 4: {
                n3 = 37;
                break;
            }
            case 5: {
                n3 = 33;
                break;
            }
            case 6: {
                n3 = 48;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 21;
                break;
            }
            case 9: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 61;
                break;
            }
            case 11: {
                n3 = 7;
                break;
            }
            case 12: {
                n3 = 8;
                break;
            }
            case 13: {
                n3 = 46;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 57;
                break;
            }
            case 16: {
                n3 = 53;
                break;
            }
            case 17: {
                n3 = 60;
                break;
            }
            case 18: {
                n3 = 5;
                break;
            }
            case 19: {
                n3 = 10;
                break;
            }
            case 20: {
                n3 = 26;
                break;
            }
            case 21: {
                n3 = 35;
                break;
            }
            case 22: {
                n3 = 32;
                break;
            }
            case 23: {
                n3 = 50;
                break;
            }
            case 24: {
                n3 = 11;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 22;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 20;
                break;
            }
            case 29: {
                n3 = 3;
                break;
            }
            case 30: {
                n3 = 12;
                break;
            }
            case 31: {
                n3 = 1;
                break;
            }
            case 32: {
                n3 = 0;
                break;
            }
            case 33: {
                n3 = 2;
                break;
            }
            case 34: {
                n3 = 54;
                break;
            }
            case 35: {
                n3 = 51;
                break;
            }
            case 36: {
                n3 = 39;
                break;
            }
            case 37: {
                n3 = 40;
                break;
            }
            case 38: {
                n3 = 28;
                break;
            }
            case 39: {
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 44;
                break;
            }
            case 41: {
                n3 = 42;
                break;
            }
            case 42: {
                n3 = 31;
                break;
            }
            case 43: {
                n3 = 9;
                break;
            }
            case 44: {
                n3 = 58;
                break;
            }
            case 45: {
                n3 = 62;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 29;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 27;
                break;
            }
            case 50: {
                n3 = 6;
                break;
            }
            case 51: {
                n3 = 15;
                break;
            }
            case 52: {
                n3 = 36;
                break;
            }
            case 53: {
                n3 = 38;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 17;
                break;
            }
            case 56: {
                n3 = 4;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 14;
                break;
            }
            case 60: {
                n3 = 59;
                break;
            }
            case 61: {
                n3 = 18;
                break;
            }
            case 62: {
                n3 = 52;
                break;
            }
            default: {
                n3 = 43;
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
        SystemIntegrityValidator.Y[n4] = new String(cArray);
        return n4;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void O() {
        long l = b ^ 0x38A77477EC65L;
        ReflectionProxyHandler reflectionProxyHandler = GraphicalRenderingController.D(ReflectionProxyHandler.class);
        reflectionProxyHandler.T();
        reflectionProxyHandler.J().S((Boolean)false);
        for (AbstractComputationKernel abstractComputationKernel : GraphicalRenderingController.D(ReflectionProxyHandler.class).o()) {
            try {
                try {
                    if (!(abstractComputationKernel instanceof RenderingContextManager757) || !((RenderingContextManager757)abstractComputationKernel).S().equals(SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)26856, (long)(0x416A614F572ADB64L ^ l)), (long)7390471224144327094L, (long)l))) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemIntegrityValidator.a(customSystemException);
                }
                abstractComputationKernel.N(false);
            }
            catch (CustomSystemException customSystemException) {
                throw SystemIntegrityValidator.a(customSystemException);
            }
        }
    }

    private static void a() {
        Object[] objectArray = L;
        L[0] = "V4&";
        objectArray[1] = Integer.TYPE;
        SystemIntegrityValidator.Y[1] = "java/lang/Integer";
        objectArray[2] = "&C(.-\u000b-L9aP\u0013>K0(";
        objectArray[3] = "8\u001e\u000b=]G3\u0011\u001ar<I8\u001a\u001e(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0016PsA\u000e\\\u001aA.$\u0015\u001cq[yX\u0017\u0000\u0011V&Z~]KIz\\\u0013\u001c\u001aE\u007f$";
    }

    @Override
    public void E() {
        double d2;
        block8: {
            long l;
            block7: {
                l = b ^ 0x7E098218E7CCL;
                this.n.A(Color.white);
                d2 = 8.0;
                try {
                    this.F.b(this.G() + d2);
                    this.F.M(this.W() + 30.0);
                    this.n.b(this.G() + d2 * 1.0);
                    this.n.M(this.W() + 45.0);
                    this.n.Y(this.w() - d2 * 2.0);
                    this.n.T(this.w() - d2 * 2.0);
                    this.n.w(14.0);
                    if (SystemLifecycleController.C.P() != NetworkConfigurationEnum.CONNECTING) break block7;
                    this.n.N(false);
                    this.F.H((String)((Object)SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)29320, (long)(0x6D7B41C218D34AA2L ^ l)), (long)7870459000560646687L, (long)l)));
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemIntegrityValidator.a(customSystemException);
                }
            }
            this.n.N(true);
            this.F.H((String)((Object)SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)8145, (long)(0x163F63CE3F3A27F6L ^ l)), (long)7870459000560646687L, (long)l)));
            if (this.V != -1L) {
                block9: {
                    Object object;
                    StringBuilder stringBuilder;
                    hr hr2;
                    block11: {
                        block10: {
                            int n = (int)((this.V - System.currentTimeMillis()) / 1000L);
                            try {
                                try {
                                    if (n < 0) break block9;
                                    hr2 = this.n;
                                    stringBuilder = new StringBuilder().append((String)((Object)SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)7757, (long)(0x2DD2B9F71551266EL ^ l)), (long)7870459000560646687L, (long)l))).append(n).append((String)((Object)SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)9990, (long)(0x20B8A81702719F26L ^ l)), (long)7870459000560646687L, (long)l)));
                                    if (n != 1) break block10;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemIntegrityValidator.a(customSystemException);
                                }
                                object = "";
                                break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemIntegrityValidator.a(customSystemException);
                            }
                        }
                        object = SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)360, (long)(0x6D4E0995C5C2394EL ^ l)), (long)7870459000560646687L, (long)l);
                    }
                    hr2.z(stringBuilder.append((String)object).append((String)((Object)SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)7928, (long)(0x46106CB593B7A6DAL ^ l)), (long)7870459000560646687L, (long)l))).toString());
                    break block8;
                }
                this.V = -1L;
                this.n.z((String)((Object)SystemIntegrityValidator.c("\u00ea", (int)SystemIntegrityValidator.b("m", (int)16752, (long)(0x6DD83530BB32F951L ^ l)), (long)7870459000560646687L, (long)l)));
            }
        }
        this.B.b(this.G() + this.w() - this.B.w() - d2);
        this.B.M(this.W() + this.b() + 3.0 - this.B.b() - 12.0);
        super.E();
        ConfigurationManager.B(this.G() + this.w() - this.B.w() - d2, this.W() + this.b() - 10.0, this.B.w(), SystemIntegrityValidator.M.n);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SystemIntegrityValidator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void G() {
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), SystemIntegrityValidator.M.W);
    }

    @Override
    public void g() {
    }

    /*
     * Loose catch block
     */
    private void p() {
        block14: {
            block13: {
                try {
                    if (SystemLifecycleController.C.P() == NetworkConfigurationEnum.CONNECTING) {
                        return;
                    }
                }
                catch (Exception exception) {
                    throw SystemIntegrityValidator.a(exception);
                }
                try {
                    if (this.R) {
                        return;
                    }
                }
                catch (Exception exception) {
                    throw SystemIntegrityValidator.a(exception);
                }
                if (this.V == -1L) break block14;
                try {
                    block15: {
                        if (this.V - System.currentTimeMillis() <= 0L) break block13;
                        break block15;
                        catch (Exception exception) {
                            throw SystemIntegrityValidator.a(exception);
                        }
                    }
                    return;
                }
                catch (Exception exception) {
                    throw SystemIntegrityValidator.a(exception);
                }
            }
            this.V = -1L;
        }
        this.R = true;
        try {
            SystemLifecycleController.C.L();
            if (SystemLifecycleController.C.P() != NetworkConfigurationEnum.REGISTRATION_OFFLINE) {
                GraphicalRenderingController.D(ReflectionProxyHandler.class).T();
                this.V = -1L;
            }
        }
        catch (Exception exception) {
            this.V = System.currentTimeMillis() + 10000L;
            TemporalMetadataResolver.W(exception);
        }
        this.R = false;
    }

    @Override
    public double e() {
        return 105.0;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d4' || c == '\u00ec' || c == '$' || c == 'G') {
                field = SystemIntegrityValidator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SystemIntegrityValidator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SystemIntegrityValidator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SystemIntegrityValidator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x551B;
        if (D[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = v[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])E.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    E.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/CM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SystemIntegrityValidator.D[n2] = n3;
        }
        return D[n2];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SystemIntegrityValidator.e(l, l2);
            object = L[n];
            try {
                if (!(object instanceof String)) break block2;
                SystemIntegrityValidator.L[n] = clazz = Class.forName(Y[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SystemIntegrityValidator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(SystemIntegrityValidator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

