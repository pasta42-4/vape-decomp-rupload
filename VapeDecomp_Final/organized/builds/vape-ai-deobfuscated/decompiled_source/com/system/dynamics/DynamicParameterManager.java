/*
 * Decompiled with CFR 0.152.
 */
package com.system.dynamics;

import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.graphics.theme.GraphicalThemeRenderer;
import com.network.protocol.NetworkProtocolDefinition;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.encoding.SecureMessageEncoder;
import com.security.session.CipherSessionManager;
import com.service.discovery.ServiceRegistrationHandler;
import com.ui.events.UserInteractionEventDispatcher;
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

public class DynamicParameterManager
extends SecureMessageEncoder {
    private static final Map jb;
    private static boolean D;
    private static final long[] eb;
    private static final Integer[] fb;
    private boolean Y;
    private static final Object[] ob;
    private String B;
    private GraphicalThemeRenderer E;
    private static final String[] pb;
    private static final long ab;
    private boolean v;
    private String V;
    private double n;

    public static boolean F() {
        return D;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/C0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicParameterManager.e(l, l2);
            object = ob[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicParameterManager.ob[n] = clazz = Class.forName(pb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/C0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void g() {
    }

    public DynamicParameterManager(CipherSessionManager cipherSessionManager, String string, String string2, double d2) {
        long l = ab ^ 0x3E08FB3A7829L;
        super(cipherSessionManager);
        this.Y = true;
        this.V = string;
        this.B = string2;
        this.n = d2;
        this.v = ((NetworkProtocolDefinition)((Object)cipherSessionManager)).W();
        this.E = new GraphicalThemeRenderer((String)((Object)(this.v ? DynamicParameterManager.d("i", (int)DynamicParameterManager.b("j", (int)6630, (long)(0x4CE26A7B2DE4A7DAL ^ l)), (long)-7286420541022824137L, (long)l) : DynamicParameterManager.d("i", (int)DynamicParameterManager.b("j", (int)2761, (long)(0x347340DF21F434F6L ^ l)), (long)-7286420541022824137L, (long)l))), 0.3);
        this.E.N(new ServiceRegistrationHandler(this, cipherSessionManager));
        this.o(this.E);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicParameterManager.ab = MultiContainerRegistry.a(6610416219901104585L, 161937755822461743L, MethodHandles.lookup().lookupClass()).a(229761473935825L);
                DynamicParameterManager.ob = new Object[5];
                DynamicParameterManager.pb = new String[5];
                DynamicParameterManager.a();
                DynamicParameterManager.jb = new HashMap<K, V>(13);
                DynamicParameterManager.d(true);
                var0 = DynamicParameterManager.ab ^ 88065800996600L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u0013E\u00d3\u00e9\u00f3\u00d0\u0013\u008b!I,\u00cf\u009e\u00a2|\u00ad";
                var7_6 = "\u0013E\u00d3\u00e9\u00f3\u00d0\u0013\u008b!I,\u00cf\u009e\u00a2|\u00ad".length();
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
                    var6_5 = "\u00a85\u00c5\u00c0\u0082)\u009f\u008ba\u00fc,PLA\u00ad\u00c2";
                    var7_6 = "\u00a85\u00c5\u00c0\u0082)\u009f\u008ba\u00fc,PLA\u00ad\u00c2".length();
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
        DynamicParameterManager.eb = var8_3;
        DynamicParameterManager.fb = new Integer[4];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicParameterManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicParameterManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = ob;
        ob[0] = "5ZL";
        objectArray[1] = Integer.TYPE;
        DynamicParameterManager.pb[1] = "java/lang/Integer";
        objectArray[2] = "A\u0000q\u001d@@J\u000f`R=XY\bi\u001b";
        objectArray[3] = "1d\bomw:k\u0019 \fy1`\u001dz";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\tSdV\b$\n\u0004ei\u001f?5[\"\u0003N$\u000f^c\u001b\u0019D\f\r\u007f\u0002\u0011+\b_!Vt";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d6' || c == 'k' || c == '\u00ed' || c == '\u00c1') {
                field = DynamicParameterManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicParameterManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void U() {
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (pb[n4] != null) {
            return n4;
        }
        Object object = ob[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 57;
                break;
            }
            case 1: {
                n3 = 53;
                break;
            }
            case 2: {
                n3 = 10;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 40;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 15;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 29;
                break;
            }
            case 9: {
                n3 = 58;
                break;
            }
            case 10: {
                n3 = 27;
                break;
            }
            case 11: {
                n3 = 56;
                break;
            }
            case 12: {
                n3 = 41;
                break;
            }
            case 13: {
                n3 = 26;
                break;
            }
            case 14: {
                n3 = 4;
                break;
            }
            case 15: {
                n3 = 47;
                break;
            }
            case 16: {
                n3 = 2;
                break;
            }
            case 17: {
                n3 = 5;
                break;
            }
            case 18: {
                n3 = 28;
                break;
            }
            case 19: {
                n3 = 49;
                break;
            }
            case 20: {
                n3 = 12;
                break;
            }
            case 21: {
                n3 = 63;
                break;
            }
            case 22: {
                n3 = 14;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 7;
                break;
            }
            case 25: {
                n3 = 1;
                break;
            }
            case 26: {
                n3 = 39;
                break;
            }
            case 27: {
                n3 = 30;
                break;
            }
            case 28: {
                n3 = 33;
                break;
            }
            case 29: {
                n3 = 37;
                break;
            }
            case 30: {
                n3 = 18;
                break;
            }
            case 31: {
                n3 = 24;
                break;
            }
            case 32: {
                n3 = 8;
                break;
            }
            case 33: {
                n3 = 51;
                break;
            }
            case 34: {
                n3 = 21;
                break;
            }
            case 35: {
                n3 = 25;
                break;
            }
            case 36: {
                n3 = 17;
                break;
            }
            case 37: {
                n3 = 61;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 42;
                break;
            }
            case 40: {
                n3 = 38;
                break;
            }
            case 41: {
                n3 = 13;
                break;
            }
            case 42: {
                n3 = 35;
                break;
            }
            case 43: {
                n3 = 3;
                break;
            }
            case 44: {
                n3 = 62;
                break;
            }
            case 45: {
                n3 = 36;
                break;
            }
            case 46: {
                n3 = 55;
                break;
            }
            case 47: {
                n3 = 60;
                break;
            }
            case 48: {
                n3 = 22;
                break;
            }
            case 49: {
                n3 = 23;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 34;
                break;
            }
            case 53: {
                n3 = 19;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 44;
                break;
            }
            case 56: {
                n3 = 43;
                break;
            }
            case 57: {
                n3 = 20;
                break;
            }
            case 58: {
                n3 = 48;
                break;
            }
            case 59: {
                n3 = 31;
                break;
            }
            case 60: {
                n3 = 16;
                break;
            }
            case 61: {
                n3 = 52;
                break;
            }
            case 62: {
                n3 = 50;
                break;
            }
            default: {
                n3 = 32;
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
        DynamicParameterManager.pb[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void d() {
    }

    @Override
    public void G() {
        CallSite callSite;
        GraphicalThemeRenderer graphicalThemeRenderer;
        Color color;
        GraphicalThemeRenderer graphicalThemeRenderer2;
        long l = ab ^ 0x11BEE03A9EC3L;
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.9);
        this.getClass();
        float f = 8.0f * (float)this.n * 0.9f;
        Color color2 = DynamicParameterManager.M.c;
        double d2 = cryptographicParameterGenerator.B(this.B);
        double d3 = this.W() + this.b() / 2.0 - d2 / 2.0;
        double d4 = this.W() + this.b() / 2.0 - (double)(f / 2.0f);
        double d5 = this.G() + 6.0;
        double d6 = 32.0 * ((double)f / (StateTrackingCoordinator.V(this.V) * this.n));
        try {
            cryptographicParameterGenerator.R(this.B, d5 + d6 + 2.0, d3, color2);
            if (this.Y) {
                StateTrackingCoordinator.B(color2, (float)d5, (float)d4, this.V, f, f, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicParameterManager.a(customSystemException);
        }
        try {
            graphicalThemeRenderer2 = this.E;
            color = this.h().F() ? DynamicParameterManager.M.q : null;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicParameterManager.a(customSystemException);
        }
        try {
            graphicalThemeRenderer2.h(color);
            double d7 = this.G() + this.w() - 7.5;
            this.getClass();
            this.E.b(d7 - 8.0);
            this.E.M(this.W());
            this.E.w(this.b());
            graphicalThemeRenderer = this.E;
            callSite = this.v ? DynamicParameterManager.d("i", (int)DynamicParameterManager.b("j", (int)29821, (long)(0x1F16B0981522ACAAL ^ l)), (long)8938308982644768733L, (long)l) : DynamicParameterManager.d("i", (int)DynamicParameterManager.b("j", (int)22313, (long)(0x4C559D900EB60FFDL ^ l)), (long)8938308982644768733L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicParameterManager.a(customSystemException);
        }
        graphicalThemeRenderer.u((String)((Object)callSite));
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicParameterManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static boolean q(DynamicParameterManager dynamicParameterManager, boolean bl) {
        dynamicParameterManager.v = bl;
        return dynamicParameterManager.v;
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x24DD;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])jb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    jb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/C0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicParameterManager.fb[n2] = n3;
        }
        return fb[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field g(long l, long l2) {
        int n = DynamicParameterManager.e(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            String string = pb[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicParameterManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicParameterManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicParameterManager.c(clazz3, string2, clazz2)) != null) {
                    DynamicParameterManager.ob[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicParameterManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicParameterManager.ob[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicParameterManager.f(281313173811643L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DynamicParameterManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicParameterManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void y(boolean bl) {
        this.Y = bl;
    }

    public DynamicParameterManager(CipherSessionManager cipherSessionManager, String string, String string2) {
        this(cipherSessionManager, string, string2, 1.0);
    }

    public static void d(boolean bl) {
        D = bl;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicParameterManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static boolean X() {
        boolean bl = DynamicParameterManager.F();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicParameterManager.a(customSystemException);
        }
        return false;
    }

    private static Method h(long l, long l2) {
        int n = DynamicParameterManager.e(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicParameterManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicParameterManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicParameterManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicParameterManager.ob[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicParameterManager.f(281313173811643L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicParameterManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicParameterManager.ob[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicParameterManager.f(281313173811643L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicParameterManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DynamicParameterManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

