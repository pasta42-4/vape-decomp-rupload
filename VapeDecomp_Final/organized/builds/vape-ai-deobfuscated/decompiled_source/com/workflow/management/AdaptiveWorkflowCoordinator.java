/*
 * Decompiled with CFR 0.152.
 */
package com.workflow.management;

import com.analytics.computation.MetricsCalculationEngine;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.input.handling.InputProcessor;
import com.media.processing.MultimediaStreamProcessor;
import com.network.authentication.ConnectionCredentials;
import com.runtime.reflection.ReflectionObjectMapper;
import com.security.cipher.CipherConfigurationManager806;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class AdaptiveWorkflowCoordinator
extends InputProcessor {
    private static final Integer[] g;
    private static final long[] e;
    private boolean G;
    private CipherConfigurationManager806 s = CipherConfigurationManager806.TOP;
    private final List<AbstractComputationKernel> F;
    private static final String[] m;
    private static final Map j;
    private boolean d;
    private Queue<ConnectionCredentials> p = new ArrayDeque<ConnectionCredentials>();
    private double f;
    private double c;
    private static final Object[] l;
    private static final long b;
    private int L = 1;
    private HashMap<AbstractComputationKernel, DataProcessingProtocol> i = new HashMap();

    @Override
    public void t() {
        long l = b ^ 0x78926BFC1BF4L;
        TemporalMetadataResolver.x((String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)30180, (long)(0x303CAF83B7C9C314L ^ l)), (long)3941823430475865663L, (long)l)));
        for (AbstractComputationKernel abstractComputationKernel : this.F) {
            TemporalMetadataResolver.x((String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)7681, (long)(0x60A5F7CC574A28F8L ^ l)), (long)3941823430475865663L, (long)l)) + abstractComputationKernel + (String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)14293, (long)(0x2797BC7EE2078127L ^ l)), (long)3941823430475865663L, (long)l)) + this.i.get(abstractComputationKernel));
            abstractComputationKernel.j(this.i.get(abstractComputationKernel));
        }
        this.F.clear();
        this.i.clear();
    }

    public boolean b() {
        return this.d;
    }

    public void g(AbstractComputationKernel abstractComputationKernel, DataProcessingProtocol dataProcessingProtocol) {
        long l = b ^ 0x38D909DD5D27L;
        TemporalMetadataResolver.x((String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)29533, (long)(0x3B110B1ED7518378L ^ l)), (long)8099560983580776684L, (long)l)) + abstractComputationKernel + (String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)30333, (long)(0x2CEF22D1217B8656L ^ l)), (long)8099560983580776684L, (long)l)) + dataProcessingProtocol);
        abstractComputationKernel.l(dataProcessingProtocol);
        this.i.put(abstractComputationKernel, dataProcessingProtocol);
    }

    private static Field c(long l, long l2) {
        int n = AdaptiveWorkflowCoordinator.a(l, l2);
        Object object = AdaptiveWorkflowCoordinator.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = AdaptiveWorkflowCoordinator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AdaptiveWorkflowCoordinator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdaptiveWorkflowCoordinator.a(clazz3, string2, clazz2)) != null) {
                    AdaptiveWorkflowCoordinator.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AdaptiveWorkflowCoordinator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AdaptiveWorkflowCoordinator.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdaptiveWorkflowCoordinator.b(269730852137613L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    public AdaptiveWorkflowCoordinator Z(boolean bl) {
        this.G = bl;
        return this;
    }

    public AdaptiveWorkflowCoordinator c(double d2) {
        this.c = d2;
        return this;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ij" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public AdaptiveWorkflowCoordinator m(CipherConfigurationManager806 cipherConfigurationManager806) {
        this.s = cipherConfigurationManager806;
        return this;
    }

    public boolean J() {
        return this.G;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveWorkflowCoordinator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AdaptiveWorkflowCoordinator.a(l, l2);
            object = AdaptiveWorkflowCoordinator.l[n];
            try {
                if (!(object instanceof String)) break block2;
                AdaptiveWorkflowCoordinator.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "\u001eU\u0012";
        objectArray[1] = Integer.TYPE;
        AdaptiveWorkflowCoordinator.m[1] = "java/lang/Integer";
        objectArray[2] = "6Jgkf>=Ev$\u001b&.B\u007fm";
        objectArray[3] = "f\u001aI\u0002\u0019\u0003m\u0015XMx\rf\u001e\\\u0017";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "A\u0016\u0016|<2\u0014QL\u0006)p\u007f\u0010\u001elxi\u0019THeB1F\u000eDa+{\u001fWE\u0006";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AdaptiveWorkflowCoordinator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AdaptiveWorkflowCoordinator.b(classArray2[i], string, clazz2, n, classArray);
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
                AdaptiveWorkflowCoordinator.b = MultiContainerRegistry.a(7376134408248842071L, 2615802161555183349L, MethodHandles.lookup().lookupClass()).a(84932265646238L);
                AdaptiveWorkflowCoordinator.l = new Object[5];
                AdaptiveWorkflowCoordinator.m = new String[5];
                AdaptiveWorkflowCoordinator.a();
                AdaptiveWorkflowCoordinator.j = new HashMap<K, V>(13);
                var0 = AdaptiveWorkflowCoordinator.b ^ 105294280881784L;
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
                var6_5 = "\u001b=!\u00cf\u00d2\u001egD2\u00d6\u00b2\u00d0.\u00eaGMqX\u00a8\u0096\u00b6\"\u00878Y\u00b7J\u0088\u00c4\u0082\\_>\u00d3#`\u00df\u00a4\u0006\u0013\u00bcPj\u001e\u00b1\u00da\u001a\u00f7M\u00bf\u00b4\u00bc\u00a9\u00b6\u00fc\u00c5d\u0018E\u00fdA\u00a3\u0099\u00f0";
                var7_6 = "\u001b=!\u00cf\u00d2\u001egD2\u00d6\u00b2\u00d0.\u00eaGMqX\u00a8\u0096\u00b6\"\u00878Y\u00b7J\u0088\u00c4\u0082\\_>\u00d3#`\u00df\u00a4\u0006\u0013\u00bcPj\u001e\u00b1\u00da\u001a\u00f7M\u00bf\u00b4\u00bc\u00a9\u00b6\u00fc\u00c5d\u0018E\u00fdA\u00a3\u0099\u00f0".length();
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
                    var6_5 = "h\u00f7\u0016z\u00e9aFH\u00ae%\u00e7\u00fe\u00a3w@a";
                    var7_6 = "h\u00f7\u0016z\u00e9aFH\u00ae%\u00e7\u00fe\u00a3w@a".length();
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
        AdaptiveWorkflowCoordinator.e = var8_3;
        AdaptiveWorkflowCoordinator.g = new Integer[10];
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AdaptiveWorkflowCoordinator(MultimediaStreamProcessor multimediaStreamProcessor, boolean bl) {
        super(multimediaStreamProcessor);
        this.F = new ArrayList<AbstractComputationKernel>();
        this.d = bl;
    }

    @Override
    public boolean R() {
        long l = b ^ 0x348FDE7678E6L;
        try {
            if (this.p.isEmpty()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveWorkflowCoordinator.b(customSystemException);
        }
        ConnectionCredentials connectionCredentials = this.p.poll();
        this.c().B(connectionCredentials.W);
        this.c().U(connectionCredentials.I);
        this.c().L().z((String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)4682, (long)(0x50DDAB1B9B0247ACL ^ l)), (long)6171734258153504045L, (long)l)) + (this.L - this.p.size()) + (String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)25287, (long)(0x2F20B186DAAEB720L ^ l)), (long)6171734258153504045L, (long)l)) + this.L + (String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)13507, (long)(0x4FDDD38A8EB46126L ^ l)), (long)6171734258153504045L, (long)l)));
        return false;
    }

    @Override
    public void f() {
        ReflectionObjectMapper reflectionObjectMapper = GraphicalRenderingController.D(ReflectionObjectMapper.class);
        try {
            if (!this.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveWorkflowCoordinator.b(customSystemException);
        }
        MetricsCalculationEngine metricsCalculationEngine = this.t();
        try {
            if (this.f != 0.0) {
                metricsCalculationEngine.q(this.f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveWorkflowCoordinator.b(customSystemException);
        }
        try {
            if (this.c != 0.0) {
                metricsCalculationEngine.o(this.c);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveWorkflowCoordinator.b(customSystemException);
        }
        ConfigurationManager.C(metricsCalculationEngine.K() - 2.0, metricsCalculationEngine.q() - 2.0, metricsCalculationEngine.t() + 3.0, metricsCalculationEngine.V() + 4.0, GraphicalRenderingController.K.Q().brighter().brighter());
        this.Z(reflectionObjectMapper, metricsCalculationEngine.K(), metricsCalculationEngine.q(), metricsCalculationEngine.t(), metricsCalculationEngine.V(), this.b());
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AdaptiveWorkflowCoordinator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void Z(CipherSessionManager cipherSessionManager, double d2, double d3, double d4, double d5, CipherConfigurationManager806 cipherConfigurationManager806) {
        block9: {
            double d6;
            double d7;
            double d8;
            double d9;
            double d10;
            block8: {
                try {
                    if (cipherConfigurationManager806 != CipherConfigurationManager806.TOP && cipherConfigurationManager806 != CipherConfigurationManager806.BOTTOM) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveWorkflowCoordinator.b(customSystemException);
                }
                d10 = 8.0;
                d9 = 18.0;
                d8 = 0.0;
                d7 = 0.0;
                d6 = 0.0;
                double d11 = d2 + d4 / 2.0;
                if (cipherConfigurationManager806 == CipherConfigurationManager806.TOP) {
                    d8 = d3 - cipherSessionManager.b() - 2.0;
                    d7 = -d10;
                    d6 = cipherSessionManager.b();
                } else {
                    d8 = d3 + d5 + 2.0;
                    d7 = d10;
                    d6 = 0.0;
                }
                cipherSessionManager.b(d11 - cipherSessionManager.w() / 2.0);
                cipherSessionManager.M(d8 + d7);
                ConfigurationManager.m(d11 - d9 / 2.0, (d8 += d6) + d7, d11, d8, d11 + d9 / 2.0, d8 + d7, new Color(26, 25, 26));
            }
            try {
                if (cipherConfigurationManager806 != CipherConfigurationManager806.LEFT && cipherConfigurationManager806 != CipherConfigurationManager806.RIGHT) break block9;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveWorkflowCoordinator.b(customSystemException);
            }
            d10 = 10.0;
            d9 = 8.0;
            d8 = 0.0;
            d7 = d3 + d5 / 2.0;
            d6 = 0.0;
            if (cipherConfigurationManager806 == CipherConfigurationManager806.LEFT) {
                d8 = -cipherSessionManager.w() - d9 - 3.0;
                d6 = d2 - d9 - 4.0;
                ConfigurationManager.m(d6 + d9, d7, d6, d7 - d10 / 2.0, d6, d7 + d10 / 2.0, new Color(26, 25, 26));
            } else {
                d8 = d4 + d9 + 3.0;
                d6 = d2 + d8;
                ConfigurationManager.m(d6 - d9, d7, d6, d7 - d10 / 2.0, d6, d7 + d10 / 2.0, new Color(26, 25, 26));
            }
            cipherSessionManager.b(d2 + d8);
            cipherSessionManager.M(d7 - cipherSessionManager.b() / 2.0);
        }
    }

    public abstract MetricsCalculationEngine t();

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c3' || c == '\u00df' || c == 'x' || c == 'h') {
                field = AdaptiveWorkflowCoordinator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdaptiveWorkflowCoordinator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public boolean Y() {
        return false;
    }

    private static Method d(long l, long l2) {
        int n = AdaptiveWorkflowCoordinator.a(l, l2);
        Object object = AdaptiveWorkflowCoordinator.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = AdaptiveWorkflowCoordinator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AdaptiveWorkflowCoordinator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdaptiveWorkflowCoordinator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AdaptiveWorkflowCoordinator.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdaptiveWorkflowCoordinator.b(269730852137613L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AdaptiveWorkflowCoordinator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AdaptiveWorkflowCoordinator.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdaptiveWorkflowCoordinator.b(269730852137613L, 0L);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = AdaptiveWorkflowCoordinator.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 54;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 15;
                break;
            }
            case 3: {
                n3 = 7;
                break;
            }
            case 4: {
                n3 = 39;
                break;
            }
            case 5: {
                n3 = 57;
                break;
            }
            case 6: {
                n3 = 55;
                break;
            }
            case 7: {
                n3 = 20;
                break;
            }
            case 8: {
                n3 = 27;
                break;
            }
            case 9: {
                n3 = 50;
                break;
            }
            case 10: {
                n3 = 44;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 62;
                break;
            }
            case 14: {
                n3 = 52;
                break;
            }
            case 15: {
                n3 = 18;
                break;
            }
            case 16: {
                n3 = 29;
                break;
            }
            case 17: {
                n3 = 40;
                break;
            }
            case 18: {
                n3 = 14;
                break;
            }
            case 19: {
                n3 = 26;
                break;
            }
            case 20: {
                n3 = 58;
                break;
            }
            case 21: {
                n3 = 45;
                break;
            }
            case 22: {
                n3 = 17;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 9;
                break;
            }
            case 25: {
                n3 = 1;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 43;
                break;
            }
            case 28: {
                n3 = 2;
                break;
            }
            case 29: {
                n3 = 35;
                break;
            }
            case 30: {
                n3 = 51;
                break;
            }
            case 31: {
                n3 = 63;
                break;
            }
            case 32: {
                n3 = 47;
                break;
            }
            case 33: {
                n3 = 38;
                break;
            }
            case 34: {
                n3 = 48;
                break;
            }
            case 35: {
                n3 = 46;
                break;
            }
            case 36: {
                n3 = 49;
                break;
            }
            case 37: {
                n3 = 22;
                break;
            }
            case 38: {
                n3 = 31;
                break;
            }
            case 39: {
                n3 = 61;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 37;
                break;
            }
            case 42: {
                n3 = 19;
                break;
            }
            case 43: {
                n3 = 41;
                break;
            }
            case 44: {
                n3 = 28;
                break;
            }
            case 45: {
                n3 = 24;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 53;
                break;
            }
            case 48: {
                n3 = 3;
                break;
            }
            case 49: {
                n3 = 59;
                break;
            }
            case 50: {
                n3 = 21;
                break;
            }
            case 51: {
                n3 = 16;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 36;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 33;
                break;
            }
            case 57: {
                n3 = 23;
                break;
            }
            case 58: {
                n3 = 60;
                break;
            }
            case 59: {
                n3 = 42;
                break;
            }
            case 60: {
                n3 = 12;
                break;
            }
            case 61: {
                n3 = 30;
                break;
            }
            case 62: {
                n3 = 11;
                break;
            }
            default: {
                n3 = 56;
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
        AdaptiveWorkflowCoordinator.m[n4] = new String(cArray);
        return n4;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x44;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ij", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveWorkflowCoordinator.g[n2] = n3;
        }
        return g[n2];
    }

    public AdaptiveWorkflowCoordinator m(double d2) {
        this.f = d2;
        return this;
    }

    public CipherConfigurationManager806 b() {
        return this.s;
    }

    public List<AbstractComputationKernel> J() {
        return this.F;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AdaptiveWorkflowCoordinator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AdaptiveWorkflowCoordinator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ij" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public AdaptiveWorkflowCoordinator H(String string, String string2) {
        long l = b ^ 0x691C610FF4EEL;
        this.p.add(new ConnectionCredentials(string, string2));
        this.c().L().z((String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)18471, (long)(0x9A72B9CA16D91CEL ^ l)), (long)-2761205713515531995L, (long)l)) + ++this.L + (String)((Object)AdaptiveWorkflowCoordinator.b("Q", (int)AdaptiveWorkflowCoordinator.a("k", (int)29888, (long)(0x68F4916910E2D2BL ^ l)), (long)-2761205713515531995L, (long)l)));
        return this;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveWorkflowCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AdaptiveWorkflowCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

