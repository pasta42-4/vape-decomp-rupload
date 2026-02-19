/*
 * Decompiled with CFR 0.152.
 */
package com.analytics.calibration;

import com.adapter.management.GenericAdapterManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.numeric.precision.NumericPrecisionTransformer;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.security.authentication.AuthenticationGateway1860;
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

public class MetricCalibrationEngine {
    public final GenericAdapterManager b;
    public final AuthenticationStateTracker x;
    public final AuthenticationGateway1860 u;
    public final NumericPrecisionTransformer Y;
    private static final Object[] h;
    public final AuthenticationStateTracker A;
    private static final Integer[] f;
    public final NumericPrecisionTransformer r;
    private static final long a;
    public final NumericPrecisionTransformer J;
    public final AuthenticationGateway1860 e;
    public final AuthenticationStateTracker X;
    public final AdaptiveRenderingEngine R;
    public final AuthenticationGateway1860 Q;
    public final NumericPrecisionTransformer i;
    public final AuthenticationGateway1860 D;
    public final AdaptiveRenderingEngine O;
    public final AuthenticationGateway1860 t;
    public final GenericAdapterManager W;
    private static final String[] k;
    public final GenericAdapterManager F;
    public final AuthenticationGateway1860 V;
    public final AuthenticationGateway1860 s;
    public final NumericPrecisionTransformer U;
    public final AdaptiveRenderingEngine z;
    public final AuthenticationGateway1860 G;
    public final AuthenticationGateway1860 j;
    private static final long[] c;
    public final GenericAdapterManager d;
    private static final Map g;

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MetricCalibrationEngine.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                MetricCalibrationEngine.h[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MetricCalibrationEngine.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MetricCalibrationEngine.b(classArray2[i], string, clazz2, n, classArray);
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
            if (c == '\u00ea' || c == '\u00f0' || c == '\u00e0' || c == '\u00e7') {
                field = MetricCalibrationEngine.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MetricCalibrationEngine.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'W' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ba' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public MetricCalibrationEngine() {
        long l = a ^ 0x59525123F4CEL;
        this.D = new AuthenticationGateway1860((String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)27529, (long)(0x75362FD81073C30DL ^ l)), (long)8794769509051511272L, (long)l)));
        this.V = new AuthenticationGateway1860((String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)15263, (long)(0x548E871B7B8B133BL ^ l)), (long)8794769509051511272L, (long)l)));
        this.F = GenericAdapterManager.D(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)3378, (long)(0xF3373BC43BA5A7L ^ l)), (long)8794769509051511272L, (long)l)), this.D, this.D, this.V);
        this.i = NumericPrecisionTransformer.b(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)1564, (long)(0x5CEF8DF498362E8AL ^ l)), (long)8794769509051511272L, (long)l)), (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)14796, (long)(0x794ECC4D89429157L ^ l)), (long)8794769509051511272L, (long)l)), "", 25.0, 110.0, 500.0, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)19392, (long)(0x262915C22A06351L ^ l)), (long)8794769509051511272L, (long)l)));
        this.J = NumericPrecisionTransformer.D(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)6250, (long)(0x5AB1B7BCE89B30E6L ^ l)), (long)8794769509051511272L, (long)l)), (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)9765, (long)(0x34A39D7CB69E0EB8L ^ l)), (long)8794769509051511272L, (long)l)), "", 0.5, 3.0, 10.0, 0.1, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)20178, (long)(0x296625D645A36657L ^ l)), (long)8794769509051511272L, (long)l)));
        this.r = NumericPrecisionTransformer.D(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)14091, (long)(0x4A138C1CFFC69F94L ^ l)), (long)8794769509051511272L, (long)l)), (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)16222, (long)(0x35404B035D917F8L ^ l)), (long)8794769509051511272L, (long)l)), "", 0.1, 0.5, 5.0, 0.01, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)5508, (long)(0x4A4052D52A853D16L ^ l)), (long)8794769509051511272L, (long)l)));
        this.Y = NumericPrecisionTransformer.D(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)8325, (long)(0x122B9C031D89081CL ^ l)), (long)8794769509051511272L, (long)l)), (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)7541, (long)(0x43C91E82719E35E9L ^ l)), (long)8794769509051511272L, (long)l)), (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)17035, (long)(0x336B4378A3976A2CL ^ l)), (long)8794769509051511272L, (long)l)), 0.0, 0.0, 100.0, 5.0, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)19679, (long)(0x1AA17E3466AFE455L ^ l)), (long)8794769509051511272L, (long)l)));
        this.U = NumericPrecisionTransformer.D(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)8856, (long)(0x506D4BCF0C770A06L ^ l)), (long)8794769509051511272L, (long)l)), (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)11902, (long)(0x79D885733D9306FDL ^ l)), (long)8794769509051511272L, (long)l)), "", 0.0, 25.0, 50.0, 1.0, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)2725, (long)(0x5E27048F7FD9A224L ^ l)), (long)8794769509051511272L, (long)l)));
        this.j = new AuthenticationGateway1860((String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)24622, (long)(0x667054515830488FL ^ l)), (long)8794769509051511272L, (long)l)));
        this.e = new AuthenticationGateway1860((String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)32059, (long)(0x7283A6883BC3D5ACL ^ l)), (long)8794769509051511272L, (long)l)));
        this.u = new AuthenticationGateway1860((String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)3756, (long)(0x6AF04E1E1958A638L ^ l)), (long)8794769509051511272L, (long)l)));
        this.W = GenericAdapterManager.E(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)15356, (long)(0x2D08058F7E739373L ^ l)), (long)8794769509051511272L, (long)l)), (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)28670, (long)(0x3D1414A2D116C75DL ^ l)), (long)8794769509051511272L, (long)l)), "", this.j, this.j, this.e, this.u);
        this.G = new AuthenticationGateway1860((String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)26268, (long)(0x43904FFBA958CE39L ^ l)), (long)8794769509051511272L, (long)l)));
        this.Q = new AuthenticationGateway1860((String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)15780, (long)(0x479B136C44401504L ^ l)), (long)8794769509051511272L, (long)l)));
        this.d = GenericAdapterManager.E(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)23249, (long)(0x4DF795396394F256L ^ l)), (long)8794769509051511272L, (long)l)), (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)29380, (long)(0x3D748FE229CCDA4AL ^ l)), (long)8794769509051511272L, (long)l)), "", this.G, this.G, this.Q);
        this.s = new AuthenticationGateway1860((String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)24835, (long)(0x3759C460EF86C983L ^ l)), (long)8794769509051511272L, (long)l)));
        this.t = new AuthenticationGateway1860((String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)14749, (long)(0x60754E352EB61116L ^ l)), (long)8794769509051511272L, (long)l)));
        this.b = GenericAdapterManager.D(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)16843, (long)(0x5DD1947AD7B56958L ^ l)), (long)8794769509051511272L, (long)l)), this.s, this.s, this.t);
        this.R = AdaptiveRenderingEngine.C(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)12707, (long)(0x6A6E57D4DD441933L ^ l)), (long)8794769509051511272L, (long)l)), Color.WHITE);
        this.O = AdaptiveRenderingEngine.C(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)5806, (long)(0x42B511381F173E26L ^ l)), (long)8794769509051511272L, (long)l)), Color.GREEN);
        this.z = AdaptiveRenderingEngine.C(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)1155, (long)(0x1D6D5026F1892C19L ^ l)), (long)8794769509051511272L, (long)l)), Color.RED);
        this.A = AuthenticationStateTracker.R(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)22574, (long)(0x6902F3089781F08CL ^ l)), (long)8794769509051511272L, (long)l)), true, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)11691, (long)(0x77AE1C60B7F8522L ^ l)), (long)8794769509051511272L, (long)l)));
        this.x = AuthenticationStateTracker.R(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)13753, (long)(0x66EAEE7E14019D3FL ^ l)), (long)8794769509051511272L, (long)l)), true, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)2771, (long)(0x1C3C7DBD79BA251L ^ l)), (long)8794769509051511272L, (long)l)));
        this.X = AuthenticationStateTracker.R(this, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)7978, (long)(0x619EEA3F9B75B7A7L ^ l)), (long)8794769509051511272L, (long)l)), true, (String)((Object)MetricCalibrationEngine.b("\u00ba", (int)MetricCalibrationEngine.a("n", (int)551, (long)(0x258C259B15F1AABFL ^ l)), (long)8794769509051511272L, (long)l)));
        this.F.s(this.D, this.i, this.r, this.W, this.b, this.d, this.J, this.A, this.X);
        this.F.s(this.V, this.Y, this.U);
        this.W.s(this.e, this.R);
        this.W.s(this.u, this.O, this.z);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u001d~\u0012";
        objectArray[1] = Integer.TYPE;
        MetricCalibrationEngine.k[1] = "java/lang/Integer";
        objectArray[2] = "9$\u001bgFa2+\n(;y!,\u0003a";
        objectArray[3] = "?:\"NnX453\u0001\u000fV?>7[";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "~W\u0004Rgl|C\r)n)\u0019YUHe*(\u0012\u001cE\u0005kz\u0017\u0004\u0017b=)\u0018\u001b)";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Rb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MetricCalibrationEngine.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MetricCalibrationEngine.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
                MetricCalibrationEngine.a = MultiContainerRegistry.a(-7725375608265057195L, -7244211476539663479L, MethodHandles.lookup().lookupClass()).a(228994204033041L);
                MetricCalibrationEngine.h = new Object[5];
                MetricCalibrationEngine.k = new String[5];
                MetricCalibrationEngine.a();
                MetricCalibrationEngine.g = new HashMap<K, V>(13);
                var0 = MetricCalibrationEngine.a ^ 44017335129660L;
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
                var8_3 = new long[40];
                var5_4 = 0;
                var6_5 = "+\r\u00a9@\u00c5\r>\u00fdq4\u00ac\u0084~\u00b7\u007f+\u00b0\u00den\u00e7=\u0003\u00d2\u00b9\u0093\u0011\u009dWK\u00c8\u00a9\u009e?v\u00ea(\u00bcE\u00d9p\u00b1[I\u00e5\u0004\u00f7\u00a1\u00aa\u00dc\u00c4~\u00c4\u008b\u0018\u0084\u00bdc\u000f4a\u00c7\u00cb% \u00bd\u00b0F\u00a7~\nI\u00d7m\u00c6Fve\u0007iJ/\u00b4D\u00e4o#\u0010v\u0090F*\u00f5\u00ed\u0094\u00a3\u00e7\u00c6\u00b5\u009al\f9\u00ba[\u008a\u00b2\u00c6\u0083B\u00f9{\u00da\u00ddH\u008a\u0088\u00bd\u000b`U\u00c5R\u00b5\u001c\u00abc\u00beOD\u00ac\u00c4RV\u00c9=\u00b8\u00b7c\u00e3\u00dalD\u00fek\u00ec9/\u0089\u0093o\u00c4\u000e]Zf.0 \u001c\u0006\u00dfS\u00b5\u00c9\u000f\u00a5\u00ec\u00fb\u00e6X\u00f3\u0096k\u0095!y/Z6U\u00fcC\u00f6l\u0098`\u00f1\u00c69\u00ee\u00b7h\u0093c\u00ed\u00ad\u00ca/P'\u00efY\u00f9v\u00e3\u000b}\u00f9\u00948\u001f\u00ceX\u00b8sN%3U=\u00d4\u00d1\u00f4\u0091\u00ac\u0007M\u00fa\u00ae\u00c7D\u00b6\u00173\u00d7\u00f64:\u0007\u00c5\u00fb\u00bb!g\u00e0,x\u00f6\u0094\u00f4\u0002\u00c4~3\u00ec.\u00beKJ/_\u007f\u00f2\u00c2\u00b6Z\rM$W\u001bJ\u007f\u00a5F\u00af!\u00ae}\u0089N\u00cbH\u00b5e\u001e\u0080\u00f2\u00c1R\u0098y\u00f4b\u00dd\u001c\u008c[\u00aa\u0005\t:\u0082_";
                var7_6 = "+\r\u00a9@\u00c5\r>\u00fdq4\u00ac\u0084~\u00b7\u007f+\u00b0\u00den\u00e7=\u0003\u00d2\u00b9\u0093\u0011\u009dWK\u00c8\u00a9\u009e?v\u00ea(\u00bcE\u00d9p\u00b1[I\u00e5\u0004\u00f7\u00a1\u00aa\u00dc\u00c4~\u00c4\u008b\u0018\u0084\u00bdc\u000f4a\u00c7\u00cb% \u00bd\u00b0F\u00a7~\nI\u00d7m\u00c6Fve\u0007iJ/\u00b4D\u00e4o#\u0010v\u0090F*\u00f5\u00ed\u0094\u00a3\u00e7\u00c6\u00b5\u009al\f9\u00ba[\u008a\u00b2\u00c6\u0083B\u00f9{\u00da\u00ddH\u008a\u0088\u00bd\u000b`U\u00c5R\u00b5\u001c\u00abc\u00beOD\u00ac\u00c4RV\u00c9=\u00b8\u00b7c\u00e3\u00dalD\u00fek\u00ec9/\u0089\u0093o\u00c4\u000e]Zf.0 \u001c\u0006\u00dfS\u00b5\u00c9\u000f\u00a5\u00ec\u00fb\u00e6X\u00f3\u0096k\u0095!y/Z6U\u00fcC\u00f6l\u0098`\u00f1\u00c69\u00ee\u00b7h\u0093c\u00ed\u00ad\u00ca/P'\u00efY\u00f9v\u00e3\u000b}\u00f9\u00948\u001f\u00ceX\u00b8sN%3U=\u00d4\u00d1\u00f4\u0091\u00ac\u0007M\u00fa\u00ae\u00c7D\u00b6\u00173\u00d7\u00f64:\u0007\u00c5\u00fb\u00bb!g\u00e0,x\u00f6\u0094\u00f4\u0002\u00c4~3\u00ec.\u00beKJ/_\u007f\u00f2\u00c2\u00b6Z\rM$W\u001bJ\u007f\u00a5F\u00af!\u00ae}\u0089N\u00cbH\u00b5e\u001e\u0080\u00f2\u00c1R\u0098y\u00f4b\u00dd\u001c\u008c[\u00aa\u0005\t:\u0082_".length();
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
                    var6_5 = "\u00b6\b\u00a4,\u00cdn\u00ec/+<\u00ba\u00f4x\u00b8pv";
                    var7_6 = "\u00b6\b\u00a4,\u00cdn\u00ec/+<\u00ba\u00f4x\u00b8pv".length();
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
        MetricCalibrationEngine.c = var8_3;
        MetricCalibrationEngine.f = new Integer[40];
    }

    private static Method d(long l, long l2) {
        int n = MetricCalibrationEngine.a(l, l2);
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
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = MetricCalibrationEngine.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MetricCalibrationEngine.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MetricCalibrationEngine.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MetricCalibrationEngine.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MetricCalibrationEngine.b(268594119768680L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MetricCalibrationEngine.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MetricCalibrationEngine.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MetricCalibrationEngine.b(268594119768680L, 0L);
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Rb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = MetricCalibrationEngine.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = MetricCalibrationEngine.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MetricCalibrationEngine.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MetricCalibrationEngine.a(clazz3, string2, clazz2)) != null) {
                    MetricCalibrationEngine.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MetricCalibrationEngine.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MetricCalibrationEngine.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MetricCalibrationEngine.b(268594119768680L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5289;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Rb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MetricCalibrationEngine.f[n2] = n3;
        }
        return f[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MetricCalibrationEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 10;
                break;
            }
            case 2: {
                n3 = 54;
                break;
            }
            case 3: {
                n3 = 49;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 26;
                break;
            }
            case 6: {
                n3 = 25;
                break;
            }
            case 7: {
                n3 = 21;
                break;
            }
            case 8: {
                n3 = 22;
                break;
            }
            case 9: {
                n3 = 1;
                break;
            }
            case 10: {
                n3 = 40;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 14;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 32;
                break;
            }
            case 15: {
                n3 = 0;
                break;
            }
            case 16: {
                n3 = 23;
                break;
            }
            case 17: {
                n3 = 36;
                break;
            }
            case 18: {
                n3 = 57;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 11;
                break;
            }
            case 21: {
                n3 = 43;
                break;
            }
            case 22: {
                n3 = 39;
                break;
            }
            case 23: {
                n3 = 28;
                break;
            }
            case 24: {
                n3 = 41;
                break;
            }
            case 25: {
                n3 = 34;
                break;
            }
            case 26: {
                n3 = 19;
                break;
            }
            case 27: {
                n3 = 4;
                break;
            }
            case 28: {
                n3 = 56;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 8;
                break;
            }
            case 32: {
                n3 = 15;
                break;
            }
            case 33: {
                n3 = 38;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 48;
                break;
            }
            case 36: {
                n3 = 51;
                break;
            }
            case 37: {
                n3 = 6;
                break;
            }
            case 38: {
                n3 = 35;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 42;
                break;
            }
            case 41: {
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 53;
                break;
            }
            case 43: {
                n3 = 62;
                break;
            }
            case 44: {
                n3 = 20;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 63;
                break;
            }
            case 47: {
                n3 = 31;
                break;
            }
            case 48: {
                n3 = 29;
                break;
            }
            case 49: {
                n3 = 24;
                break;
            }
            case 50: {
                n3 = 33;
                break;
            }
            case 51: {
                n3 = 16;
                break;
            }
            case 52: {
                n3 = 45;
                break;
            }
            case 53: {
                n3 = 46;
                break;
            }
            case 54: {
                n3 = 13;
                break;
            }
            case 55: {
                n3 = 50;
                break;
            }
            case 56: {
                n3 = 2;
                break;
            }
            case 57: {
                n3 = 3;
                break;
            }
            case 58: {
                n3 = 37;
                break;
            }
            case 59: {
                n3 = 61;
                break;
            }
            case 60: {
                n3 = 55;
                break;
            }
            case 61: {
                n3 = 52;
                break;
            }
            case 62: {
                n3 = 44;
                break;
            }
            default: {
                n3 = 7;
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
        MetricCalibrationEngine.k[n4] = new String(cArray);
        return n4;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MetricCalibrationEngine.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MetricCalibrationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MetricCalibrationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

