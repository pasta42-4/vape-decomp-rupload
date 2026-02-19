/*
 * Decompiled with CFR 0.152.
 */
package com.security.protocol;

import a.F9;
import com.app.security.TokenAuthenticator1788;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicsRenderingUtility;
import com.graphics.theme.GraphicalThemeRenderer;
import com.integration.protocols.MultiProtocolAdapter;
import com.math.computation.NumericComputationResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.system.configuration.ConfigurationManager;
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

public class EncryptionProtocolHandler
extends AbstractComputationKernel {
    private GraphicsRenderingUtility V;
    private GraphicsRenderingUtility n;
    private static final Object[] db;
    private static final String[] eb;
    private final MultiProtocolAdapter v;
    private GraphicsRenderingUtility B;
    private AdaptiveRenderingEngine D;
    private static final long[] E;
    private GraphicalThemeRenderer Y;
    private static final long b;
    private static final Integer[] ab;
    private boolean L;
    private static AbstractComputationKernel[] F;
    private static final Map bb;
    private NumericComputationResolver R;

    @Override
    public void G() {
        block5: {
            block4: {
                CallSite callSite;
                GraphicalThemeRenderer graphicalThemeRenderer;
                long l = b ^ 0x73CAB72C2EC0L;
                try {
                    this.S();
                    this.R.b(this.G());
                    this.R.M(this.W());
                    this.Y.b(this.G() + this.R.j() + 5.0);
                    this.Y.M(this.W() + 2.5);
                    this.Y.w(this.R.b() / 2.0);
                    graphicalThemeRenderer = this.Y;
                    callSite = this.L ? EncryptionProtocolHandler.c("\u00d9", (int)EncryptionProtocolHandler.b("c", (int)11892, (long)(0x5B0E81671CE0AD43L ^ l)), (long)8938370551943642139L, (long)l) : EncryptionProtocolHandler.c("\u00d9", (int)EncryptionProtocolHandler.b("c", (int)8533, (long)(0x531DA06DACA2260L ^ l)), (long)8938370551943642139L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw EncryptionProtocolHandler.a(customSystemException);
                }
                try {
                    graphicalThemeRenderer.u((String)((Object)callSite));
                    StateTrackingCoordinator.B(this.D.L(), (float)(this.G() + this.w() - 5.0 - 6.0), (float)this.W() + 5.0f, (String)((Object)EncryptionProtocolHandler.c("\u00d9", (int)EncryptionProtocolHandler.b("c", (int)13432, (long)(0x62E111D973FFB74EL ^ l)), (long)8938370551943642139L, (long)l)), 6.0f, 6.0f, false);
                    this.v.b(this.G() + this.w() - 10.0 - 5.0 - 6.0);
                    this.v.M(this.W() + 5.0);
                    if (!this.L) break block4;
                    this.V.N(false);
                    this.B.N(false);
                    this.n.N(false);
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw EncryptionProtocolHandler.a(customSystemException);
                }
            }
            float f = 7.0f;
            double d2 = this.R.B().K() - (double)(f / 2.0f);
            double d3 = this.W() + this.R.b() + 2.5 + 3.0;
            double d4 = d2 + (double)f;
            double d5 = d3 - 3.0;
            double d6 = d2 + (double)(f * 2.0f);
            double d7 = d3;
            ConfigurationManager.m(d2, d3, d4, d5, d6, d7, EncryptionProtocolHandler.M.a);
            this.V.N(true);
            this.V.b(this.G());
            this.V.M(this.W() + 20.0 + 5.0);
            this.B.N(true);
            this.B.b(this.G());
            this.B.M(this.W() + 40.0 + 10.0);
            this.n.N(true);
            this.n.b(this.G());
            this.n.M(this.W() + 60.0 + 15.0);
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7F3C;
        if (ab[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = E[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])bb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    bb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/b9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EncryptionProtocolHandler.ab[n2] = n3;
        }
        return ab[n2];
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void g() {
    }

    public EncryptionProtocolHandler(AdaptiveRenderingEngine adaptiveRenderingEngine) {
        long l = b ^ 0x4CF5306EBF35L;
        this.L = true;
        this.Y = new GraphicalThemeRenderer((String)((Object)EncryptionProtocolHandler.c("\u00d9", (int)EncryptionProtocolHandler.b("c", (int)2349, (long)(0x38195F1BAF9B9BECL ^ l)), (long)-1297520927358374418L, (long)l)), 0.3);
        this.D = adaptiveRenderingEngine;
        this.L(adaptiveRenderingEngine);
        this.R = new NumericComputationResolver((String)((Object)EncryptionProtocolHandler.c("\u00d9", (int)EncryptionProtocolHandler.b("c", (int)1061, (long)(0x7B1347BB1F0396E2L ^ l)), (long)-1297520927358374418L, (long)l)), adaptiveRenderingEngine, new Color[]{new Color(250, 50, 56), new Color(242, 99, 33), new Color(252, 179, 22), EncryptionProtocolHandler.M.Y, new Color(47, 122, 229), new Color(126, 84, 217), new Color(232, 96, 152)});
        this.V = new GraphicsRenderingUtility(this.R);
        this.B = new GraphicsRenderingUtility(F9.SATURATION, adaptiveRenderingEngine);
        this.n = new GraphicsRenderingUtility(F9.VIBRANCE, adaptiveRenderingEngine);
        this.v = new MultiProtocolAdapter(adaptiveRenderingEngine);
        this.R.Q(this.l());
        this.V.Q(EncryptionProtocolHandler.M.a);
        this.B.Q(EncryptionProtocolHandler.M.a);
        this.n.Q(EncryptionProtocolHandler.M.a);
        this.R.i(null);
        this.B.i(null);
        this.n.i(null);
        this.Y.N(new TokenAuthenticator1788(this));
        this.o(this.R, this.Y, this.v, this.V, this.B, this.n);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (eb[n4] != null) {
            return n4;
        }
        Object object = db[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 25;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 24;
                break;
            }
            case 3: {
                n3 = 44;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 35;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 7: {
                n3 = 27;
                break;
            }
            case 8: {
                n3 = 23;
                break;
            }
            case 9: {
                n3 = 60;
                break;
            }
            case 10: {
                n3 = 55;
                break;
            }
            case 11: {
                n3 = 22;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 17;
                break;
            }
            case 14: {
                n3 = 54;
                break;
            }
            case 15: {
                n3 = 14;
                break;
            }
            case 16: {
                n3 = 43;
                break;
            }
            case 17: {
                n3 = 59;
                break;
            }
            case 18: {
                n3 = 40;
                break;
            }
            case 19: {
                n3 = 19;
                break;
            }
            case 20: {
                n3 = 15;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 16;
                break;
            }
            case 23: {
                n3 = 34;
                break;
            }
            case 24: {
                n3 = 37;
                break;
            }
            case 25: {
                n3 = 18;
                break;
            }
            case 26: {
                n3 = 49;
                break;
            }
            case 27: {
                n3 = 30;
                break;
            }
            case 28: {
                n3 = 2;
                break;
            }
            case 29: {
                n3 = 58;
                break;
            }
            case 30: {
                n3 = 0;
                break;
            }
            case 31: {
                n3 = 3;
                break;
            }
            case 32: {
                n3 = 29;
                break;
            }
            case 33: {
                n3 = 53;
                break;
            }
            case 34: {
                n3 = 13;
                break;
            }
            case 35: {
                n3 = 63;
                break;
            }
            case 36: {
                n3 = 41;
                break;
            }
            case 37: {
                n3 = 39;
                break;
            }
            case 38: {
                n3 = 6;
                break;
            }
            case 39: {
                n3 = 51;
                break;
            }
            case 40: {
                n3 = 26;
                break;
            }
            case 41: {
                n3 = 47;
                break;
            }
            case 42: {
                n3 = 33;
                break;
            }
            case 43: {
                n3 = 20;
                break;
            }
            case 44: {
                n3 = 21;
                break;
            }
            case 45: {
                n3 = 46;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 1;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 7;
                break;
            }
            case 50: {
                n3 = 50;
                break;
            }
            case 51: {
                n3 = 31;
                break;
            }
            case 52: {
                n3 = 62;
                break;
            }
            case 53: {
                n3 = 45;
                break;
            }
            case 54: {
                n3 = 9;
                break;
            }
            case 55: {
                n3 = 56;
                break;
            }
            case 56: {
                n3 = 5;
                break;
            }
            case 57: {
                n3 = 38;
                break;
            }
            case 58: {
                n3 = 12;
                break;
            }
            case 59: {
                n3 = 28;
                break;
            }
            case 60: {
                n3 = 36;
                break;
            }
            case 61: {
                n3 = 4;
                break;
            }
            case 62: {
                n3 = 57;
                break;
            }
            default: {
                n3 = 61;
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
        EncryptionProtocolHandler.eb[n4] = new String(cArray);
        return n4;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EncryptionProtocolHandler.e(l, l2);
            object = db[n];
            try {
                if (!(object instanceof String)) break block2;
                EncryptionProtocolHandler.db[n] = clazz = Class.forName(eb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void d() {
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EncryptionProtocolHandler.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void N(boolean bl) {
        super.N(bl);
        this.R.h(false);
        this.R.Z();
    }

    @Override
    public double e() {
        return 110.0;
    }

    static boolean C(EncryptionProtocolHandler encryptionProtocolHandler) {
        return encryptionProtocolHandler.L;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == '\u00de' || c == 'f' || c == '\u00ce') {
                field = EncryptionProtocolHandler.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EncryptionProtocolHandler.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'O' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EncryptionProtocolHandler.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field g(long l, long l2) {
        int n = EncryptionProtocolHandler.e(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            String string = eb[n];
            int n2 = string.indexOf(8);
            Class clazz = EncryptionProtocolHandler.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EncryptionProtocolHandler.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EncryptionProtocolHandler.c(clazz3, string2, clazz2)) != null) {
                    EncryptionProtocolHandler.db[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EncryptionProtocolHandler.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EncryptionProtocolHandler.db[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EncryptionProtocolHandler.f(226150172741016L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void A(AbstractComputationKernel[] abstractComputationKernelArray) {
        F = abstractComputationKernelArray;
    }

    public void q() {
        this.R.B();
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public double z() {
        double d2;
        try {
            d2 = this.L ? 25.0 : 100.0;
        }
        catch (CustomSystemException customSystemException) {
            throw EncryptionProtocolHandler.a(customSystemException);
        }
        return d2;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EncryptionProtocolHandler.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EncryptionProtocolHandler.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EncryptionProtocolHandler.b = MultiContainerRegistry.a(-6996248337915687595L, -2710809133850312479L, MethodHandles.lookup().lookupClass()).a(105858498757739L);
                EncryptionProtocolHandler.db = new Object[5];
                EncryptionProtocolHandler.eb = new String[5];
                EncryptionProtocolHandler.a();
                EncryptionProtocolHandler.bb = new HashMap<K, V>(13);
                var0 = EncryptionProtocolHandler.b ^ 138248271089908L;
                EncryptionProtocolHandler.A(null);
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00bfLws\u00ba\u00ad\u00aa\u0093\u00ec\u0019wv\u00bdX\u00bc*a7y\u00ef\u00d4G\u00f9\u00e9";
                var7_6 = "\u00bfLws\u00ba\u00ad\u00aa\u0093\u00ec\u0019wv\u00bdX\u00bc*a7y\u00ef\u00d4G\u00f9\u00e9".length();
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
                    var6_5 = "\u00cc\u0097\u00fbE=\n\u0015\u00fa\u0096\u00c6m#\u001f\u00c30\u001c";
                    var7_6 = "\u00cc\u0097\u00fbE=\n\u0015\u00fa\u0096\u00c6m#\u001f\u00c30\u001c".length();
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
        EncryptionProtocolHandler.E = var8_3;
        EncryptionProtocolHandler.ab = new Integer[5];
    }

    static boolean s(EncryptionProtocolHandler encryptionProtocolHandler, boolean bl) {
        encryptionProtocolHandler.L = bl;
        return encryptionProtocolHandler.L;
    }

    private static Method h(long l, long l2) {
        int n = EncryptionProtocolHandler.e(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = eb[n];
                int n3 = string2.indexOf(8);
                clazz3 = EncryptionProtocolHandler.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EncryptionProtocolHandler.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EncryptionProtocolHandler.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        EncryptionProtocolHandler.db[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EncryptionProtocolHandler.f(226150172741016L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EncryptionProtocolHandler.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EncryptionProtocolHandler.db[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EncryptionProtocolHandler.f(226150172741016L, 0L);
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = EncryptionProtocolHandler.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EncryptionProtocolHandler.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = db;
        db[0] = ";\bf";
        objectArray[1] = Integer.TYPE;
        EncryptionProtocolHandler.eb[1] = "java/lang/Integer";
        objectArray[2] = "\u000e\u001a\t\u0007R*\u0005\u0015\u0018H/2\u0016\u0012\u0011\u0001";
        objectArray[3] = "|-\u0010[R\u0015w\"\u0001\u00143\u001b|)\u0005N";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0004*/j\r\u000fX #\u0011\t\b:zt \u000f\u001d\u0005,t,\u0018s\u0000{vz\u0005M\\,%xb";
    }

    public static AbstractComputationKernel[] o() {
        return F;
    }

    @Override
    public void U() {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EncryptionProtocolHandler.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(EncryptionProtocolHandler.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

