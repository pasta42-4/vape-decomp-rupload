/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.math.geometry;

import a._Y;
import a.a;
import a.kg;
import a.oQ;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.core.comparison.QualityFactorComparator;
import com.app.core.sorting.QualityFactorSorter;
import com.app.data.processing.StreamTransformationProcessor;
import com.app.sorting.QueueComparator;
import com.app.sorting.comparison.PriorityComparator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.concurrency.workers.BackgroundWorkerThread;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.sorting.CustomObjectComparator;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.auth.AuthenticationHandler;
import com.security.authentication.AuthenticationGateway1860;
import com.security.transform.CryptographicTransformer;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.core.SystemStateOrchestrator1145;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.ui.rendering.GraphicalRenderingController;
import com.util.reflection.ReflectionUtility;
import com.validation.core.ObjectValidator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GeometricComputationEngine
extends ContextualExecutionFramework {
    private static final Object[] kb;
    private double L;
    private boolean V;
    private static final Integer[] gb;
    private int lL;
    private final AuthenticationGateway1860 Z;
    private float lN;
    private float lo;
    @Nullable
    private TransactionOrchestrator1017 r;
    private final AuthenticationStateTracker lm;
    public final AuthenticationGateway1860 lx;
    private int G;
    private final NumericPrecisionTransformer lU;
    private int z;
    private static final long[] fb;
    private final NumericPrecisionTransformer Y;
    private static final long bb;
    private final AuthenticationStateTracker t;
    public final AuthenticationGateway1860 lJ;
    private int lB;
    double lV;
    private boolean P;
    public final AuthenticationGateway1860 A;
    public final AuthenticationGateway1860 lX;
    private final ColorPaletteManager x;
    private int lH;
    private final ReflectionUtility O;
    private float d;
    private static final String[] lb;
    private float ld;
    private final AuthenticationStateTracker l4;
    private final AuthenticationStateTracker ls;
    private float b;
    private final NumericPrecisionTransformer o;
    private float lp;
    private final NumericPrecisionTransformer le;
    private int K;
    public final AuthenticationGateway1860 h;
    private float lr;
    private float v;
    private int T;
    double m;
    private final ColorPaletteManager e;
    private final Random F;
    public final AuthenticationGateway1860 n;
    private final AuthenticationStateTracker lg;
    private boolean lZ;
    private static final Map hb;
    double j;
    private int N;
    private final AuthenticationStateTracker l2;
    private final Random X;
    private double lQ;
    private double lC;
    public GenericAdapterManager R;
    public GenericAdapterManager w;
    private boolean l;
    private double B;

    @DataExchangeProtocol2090
    public void l(EventTriggerEngine eventTriggerEngine) {
        boolean bl;
        boolean bl2;
        try {
            if (eventTriggerEngine.getWorld().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        try {
            if (this.r == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        float f = ApplicationLifecycleManager.N().W();
        this.lr += (float)this.z;
        this.v += (float)this.lB;
        int n = (int)this.lr;
        int n2 = (int)this.v;
        float f2 = this.lr - (float)n;
        float f3 = this.v - (float)n2;
        try {
            bl2 = Math.abs(n) > 0;
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        boolean bl3 = bl2;
        try {
            boolean bl4 = bl = Math.abs(n2) > 0;
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        if (!bl3) {
            n = 0;
        }
        if (!bl) {
            n2 = 0;
        }
        float f4 = f * 0.6f + 0.2f;
        float f5 = f4 * f4 * f4 * 8.0f;
        float f6 = (float)n * f5;
        float f7 = (float)n2 * f5;
        int n3 = -1;
        AuthenticationHandler.S(f6, f7 * (float)n3);
        this.lr = f2;
        this.v = f3;
        this.z = 0;
        this.lB = 0;
    }

    void T(float f) {
        if (f != 0.0f) {
            f *= 5.0f;
            float f2 = ((Double)this.Y.J()).floatValue();
            float f3 = _Y.g(ApplicationLifecycleManager.U(), this.r);
            try {
                if (f3 <= 10.0f) {
                    this.lp = f2;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            if (this.lp > 0.0f) {
                f2 -= this.lp / 3.0f;
                this.lp -= f3 / 200.0f;
            }
            float f4 = 1.0f * f2 * f;
            this.lr += f4;
        } else {
            this.lr = 0.0f;
        }
    }

    private void s() {
        kg kg2 = _Y.t(ApplicationLifecycleManager.U(), (oQ)this.r.L(), 0.0, 0.0, 0.0);
        double d2 = this.r.F() - this.r.f();
        double d3 = this.r.B() - this.r.n();
        double d4 = kg2.R() - d2;
        double d5 = kg2.U() - d3;
        float f = ApplicationLifecycleManager.K().h();
        double d6 = d4 + (kg2.R() - d4) * (double)f;
        double d7 = d5 + (kg2.U() - d5) * (double)f;
        this.j = d6;
        this.m = d7;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Av" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean o() {
        boolean bl;
        long l;
        block24: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block23: {
                l = bb ^ 0x56747493851DL;
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                StreamTransformationProcessor streamTransformationProcessor = ApplicationLifecycleManager.n();
                try {
                    try {
                        if (!systemConfigurationOrchestrator.Y() && !streamTransformationProcessor.Y()) break block23;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricComputationEngine.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricComputationEngine.a(customSystemException);
                }
            }
            try {
                if (ConfigurationRegistry.l.v()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            bl = this.lg.s();
            try {
                if (!bl || !this.t.s().booleanValue()) break block24;
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            bl = this.e.H(systemConfigurationOrchestrator.K());
        }
        if (bl) {
            boolean bl2;
            block26: {
                block25: {
                    NetworkPacketInterceptor1107 networkPacketInterceptor1107 = SystemStateOrchestrator1145.J();
                    try {
                        try {
                            if (!networkPacketInterceptor1107.r() || !networkPacketInterceptor1107.q().equals(ObjectValidator.Y())) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricComputationEngine.a(customSystemException);
                        }
                        bl2 = true;
                        break block26;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricComputationEngine.a(customSystemException);
                    }
                }
                bl2 = false;
            }
            boolean bl3 = bl2;
            try {
                if (bl3) {
                    this.lH = (int)GeometricComputationEngine.a("s", (int)25863, (long)(0x364C420FC691410FL ^ l));
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            try {
                if (this.lH > 0) {
                    --this.lH;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            try {
                if (this.lH > 0) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
        }
        return this.k();
    }

    private static Field c(long l, long l2) {
        int n = GeometricComputationEngine.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = GeometricComputationEngine.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GeometricComputationEngine.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GeometricComputationEngine.a(clazz3, string2, clazz2)) != null) {
                    GeometricComputationEngine.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GeometricComputationEngine.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GeometricComputationEngine.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GeometricComputationEngine.b(254347849710732L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GeometricComputationEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GeometricComputationEngine.bb = MultiContainerRegistry.a(-2299149967904232608L, -7815170104300563119L, MethodHandles.lookup().lookupClass()).a(38696853735848L);
                GeometricComputationEngine.kb = new Object[5];
                GeometricComputationEngine.lb = new String[5];
                GeometricComputationEngine.a();
                GeometricComputationEngine.hb = new HashMap<K, V>(13);
                var0 = GeometricComputationEngine.bb ^ 68726040128480L;
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
                var8_3 = new long[43];
                var5_4 = 0;
                var6_5 = "\u00b6\u00a4\u00ad\u001b\b]\u00b2\u00d1v\u008f\u0005\u00cb&\u00bdR+\u0087n\u0083\u009a#\u00aa\u00a4\u0007\u00c8\u0093\u0086-i\u00f1\u00ec+[\u00f4\t;Cj|\u00ab\u00a7\u00c0\u00ceK@b\\[\u00b4\u00a3\u00d9\u00c4\u00e0\u00b7\u008c@%\u00de\u00f3Y\u00af\u00f5`\u001bN\u0007\u0006\u001e\u00b7\u00e6RD\u00d9E\u00c0J\u0016\u0085\u0013\u0007\u00af\u00fay\u00907\u00b4\u009d9+\u00caXQ\u00ad\u0004\u009a\u0097\u00d8\u00fd\u00ef\u00d1\u00ab\u00f7\u00c7\u00c5\u000eX*\u00b7%\u00b8\u00e5R\u00f5L\u000eg\u0091\u0084\u00a2}\u008e_+\u008f\u0006\u001a1\u00db\u0090b\u00b6\u0096\u007f27\u00be\u00f5\u00972\u0099\u00b1\u009e\u00b7\u00aay\u00cb}\u000b,\u00f5\u0092\u00eb\u00da2\u00ee\u00bf\u009b\u00d0X\u00a4\u0005OF\u00e1\u009f\u00dd\u008bK\u0090y\u00c8\u00f9\u0005>\\6\u0016R\u00a6\u00d8X\u00a7&ef6\u0011\u00ea\u00c4+\u0002cj\u00d2\u00f4m`\u00d8\u00f9\u0082\u00e7\u00bf\u0015\u0011-\u00d4q\u001a=\u00d7\u0096\\\u00aaE;G1\u00e7\u0095\u00e6$\t\u009b\u00f46\u00e07\u00cf\u001b\u001d%rF\u0005-\u00a2\u00b8\u00c9\u00a3U\u0085;\u00bf\u00be\u007f>1\u0014\u009fy\u00d2\u00bb\u00d6\u0000\u00c2\u0099\u00a9]gf&\u008e\u00f6p5\u0087y\u00fc\u00146\u00a1\u0014{\u0087d\u00d7\u0091\u00ff\u0094~Z\u0098\u0092\u0016\u00cbV\u0018\u000f\u0001\u00dbI\u0086 A\u0081\u0010\u00f3t\u00f4\u00f6\u00e2H4\u00b6zH\":\u00a1\u00d8\u00a7\u00ab\u00b5\u0004\u00d3\u007fQ\u00cbe\u0097\u00db\u00db\u00cc-\u009fH\u0097\u00e1";
                var7_6 = "\u00b6\u00a4\u00ad\u001b\b]\u00b2\u00d1v\u008f\u0005\u00cb&\u00bdR+\u0087n\u0083\u009a#\u00aa\u00a4\u0007\u00c8\u0093\u0086-i\u00f1\u00ec+[\u00f4\t;Cj|\u00ab\u00a7\u00c0\u00ceK@b\\[\u00b4\u00a3\u00d9\u00c4\u00e0\u00b7\u008c@%\u00de\u00f3Y\u00af\u00f5`\u001bN\u0007\u0006\u001e\u00b7\u00e6RD\u00d9E\u00c0J\u0016\u0085\u0013\u0007\u00af\u00fay\u00907\u00b4\u009d9+\u00caXQ\u00ad\u0004\u009a\u0097\u00d8\u00fd\u00ef\u00d1\u00ab\u00f7\u00c7\u00c5\u000eX*\u00b7%\u00b8\u00e5R\u00f5L\u000eg\u0091\u0084\u00a2}\u008e_+\u008f\u0006\u001a1\u00db\u0090b\u00b6\u0096\u007f27\u00be\u00f5\u00972\u0099\u00b1\u009e\u00b7\u00aay\u00cb}\u000b,\u00f5\u0092\u00eb\u00da2\u00ee\u00bf\u009b\u00d0X\u00a4\u0005OF\u00e1\u009f\u00dd\u008bK\u0090y\u00c8\u00f9\u0005>\\6\u0016R\u00a6\u00d8X\u00a7&ef6\u0011\u00ea\u00c4+\u0002cj\u00d2\u00f4m`\u00d8\u00f9\u0082\u00e7\u00bf\u0015\u0011-\u00d4q\u001a=\u00d7\u0096\\\u00aaE;G1\u00e7\u0095\u00e6$\t\u009b\u00f46\u00e07\u00cf\u001b\u001d%rF\u0005-\u00a2\u00b8\u00c9\u00a3U\u0085;\u00bf\u00be\u007f>1\u0014\u009fy\u00d2\u00bb\u00d6\u0000\u00c2\u0099\u00a9]gf&\u008e\u00f6p5\u0087y\u00fc\u00146\u00a1\u0014{\u0087d\u00d7\u0091\u00ff\u0094~Z\u0098\u0092\u0016\u00cbV\u0018\u000f\u0001\u00dbI\u0086 A\u0081\u0010\u00f3t\u00f4\u00f6\u00e2H4\u00b6zH\":\u00a1\u00d8\u00a7\u00ab\u00b5\u0004\u00d3\u007fQ\u00cbe\u0097\u00db\u00db\u00cc-\u009fH\u0097\u00e1".length();
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
                    var6_5 = "\u0013X\u0000^e\u00a6\u00f8*\u00b4\u00c98\u00b0\u0083\u0083\u00dc>";
                    var7_6 = "\u0013X\u0000^e\u00a6\u00f8*\u00b4\u00c98\u00b0\u0083\u0083\u00dc>".length();
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
        GeometricComputationEngine.fb = var8_3;
        GeometricComputationEngine.gb = new Integer[43];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GeometricComputationEngine.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (lb[n4] != null) {
            return n4;
        }
        Object object = kb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 41;
                break;
            }
            case 1: {
                n3 = 19;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 17;
                break;
            }
            case 5: {
                n3 = 30;
                break;
            }
            case 6: {
                n3 = 56;
                break;
            }
            case 7: {
                n3 = 37;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 61;
                break;
            }
            case 10: {
                n3 = 49;
                break;
            }
            case 11: {
                n3 = 6;
                break;
            }
            case 12: {
                n3 = 14;
                break;
            }
            case 13: {
                n3 = 33;
                break;
            }
            case 14: {
                n3 = 0;
                break;
            }
            case 15: {
                n3 = 40;
                break;
            }
            case 16: {
                n3 = 21;
                break;
            }
            case 17: {
                n3 = 32;
                break;
            }
            case 18: {
                n3 = 22;
                break;
            }
            case 19: {
                n3 = 38;
                break;
            }
            case 20: {
                n3 = 63;
                break;
            }
            case 21: {
                n3 = 47;
                break;
            }
            case 22: {
                n3 = 25;
                break;
            }
            case 23: {
                n3 = 31;
                break;
            }
            case 24: {
                n3 = 53;
                break;
            }
            case 25: {
                n3 = 2;
                break;
            }
            case 26: {
                n3 = 43;
                break;
            }
            case 27: {
                n3 = 12;
                break;
            }
            case 28: {
                n3 = 10;
                break;
            }
            case 29: {
                n3 = 51;
                break;
            }
            case 30: {
                n3 = 39;
                break;
            }
            case 31: {
                n3 = 34;
                break;
            }
            case 32: {
                n3 = 1;
                break;
            }
            case 33: {
                n3 = 3;
                break;
            }
            case 34: {
                n3 = 29;
                break;
            }
            case 35: {
                n3 = 23;
                break;
            }
            case 36: {
                n3 = 4;
                break;
            }
            case 37: {
                n3 = 27;
                break;
            }
            case 38: {
                n3 = 28;
                break;
            }
            case 39: {
                n3 = 55;
                break;
            }
            case 40: {
                n3 = 48;
                break;
            }
            case 41: {
                n3 = 9;
                break;
            }
            case 42: {
                n3 = 24;
                break;
            }
            case 43: {
                n3 = 8;
                break;
            }
            case 44: {
                n3 = 15;
                break;
            }
            case 45: {
                n3 = 57;
                break;
            }
            case 46: {
                n3 = 7;
                break;
            }
            case 47: {
                n3 = 60;
                break;
            }
            case 48: {
                n3 = 18;
                break;
            }
            case 49: {
                n3 = 54;
                break;
            }
            case 50: {
                n3 = 35;
                break;
            }
            case 51: {
                n3 = 58;
                break;
            }
            case 52: {
                n3 = 5;
                break;
            }
            case 53: {
                n3 = 36;
                break;
            }
            case 54: {
                n3 = 50;
                break;
            }
            case 55: {
                n3 = 20;
                break;
            }
            case 56: {
                n3 = 11;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 52;
                break;
            }
            case 59: {
                n3 = 45;
                break;
            }
            case 60: {
                n3 = 44;
                break;
            }
            case 61: {
                n3 = 16;
                break;
            }
            case 62: {
                n3 = 62;
                break;
            }
            default: {
                n3 = 26;
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
        GeometricComputationEngine.lb[n4] = new String(cArray);
        return n4;
    }

    private void N() {
        block20: {
            try {
                this.lQ += 1.0;
                if (this.lQ >= (double)(250 + this.F.nextInt(50))) {
                    this.lQ = AdaptiveComputationEngine.B(this.F, -100, -50);
                    this.T = AdaptiveComputationEngine.B(this.F, -1, 2);
                    this.K = AdaptiveComputationEngine.B(this.F, -1, 2);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            int n = this.T;
            int n2 = this.K;
            if (this.F.nextInt(10) < 2) {
                // empty if block
            }
            if (this.F.nextInt(10) < 2) {
                // empty if block
            }
            if (this.F.nextInt(10) < 2) {
                n = 0;
            }
            if (this.F.nextInt(10) < 2) {
                n2 = 0;
            }
            if (this.lQ < 0.0) {
                n = 0;
                n2 = 0;
            }
            try {
                if (this.F.nextInt(20) == 1) {
                    this.z += n;
                    this.lB += n2;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            try {
                block19: {
                    try {
                        try {
                            try {
                                if (this.lr > 0.0f && this.z < 0) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeometricComputationEngine.a(customSystemException);
                            }
                            if (!(this.lr < 0.0f)) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricComputationEngine.a(customSystemException);
                        }
                        if (this.z <= 0) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricComputationEngine.a(customSystemException);
                    }
                }
                this.z = 0;
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == 'f' || c == 'd' || c == '\u00da') {
                field = GeometricComputationEngine.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GeometricComputationEngine.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ee' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x786;
        if (gb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Av", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GeometricComputationEngine.gb[n2] = n3;
        }
        return gb[n2];
    }

    @Nullable
    private TransactionOrchestrator1017 q() {
        ArrayList<CryptographicTransformer> arrayList;
        block27: {
            block30: {
                block29: {
                    block28: {
                        block26: {
                            ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
                            try {
                                if (connectionConfigurationResolver.Y()) {
                                    return null;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeometricComputationEngine.a(customSystemException);
                            }
                            arrayList = new ArrayList<CryptographicTransformer>();
                            ArrayList arrayList2 = new ArrayList(ApplicationLifecycleManager.c().L());
                            for (Object e : arrayList2) {
                                CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
                                try {
                                    try {
                                        if (DynamicContextBroker.e && cryptographicTransformer.B(ReflectionMetadataResolver.PR)) {
                                            continue;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeometricComputationEngine.a(customSystemException);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeometricComputationEngine.a(customSystemException);
                                }
                                if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) continue;
                                TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(e);
                                try {
                                    if (!this.j(transactionOrchestrator1017)) continue;
                                    arrayList.add(transactionOrchestrator1017);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeometricComputationEngine.a(customSystemException);
                                }
                            }
                            try {
                                arrayList.sort(new QualityFactorComparator());
                                if (this.w.J() != this.lX) break block26;
                                arrayList.sort(new QualityFactorComparator());
                                break block27;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeometricComputationEngine.a(customSystemException);
                            }
                        }
                        try {
                            if (this.w.J() != this.Z) break block28;
                            arrayList.sort(new QualityFactorSorter());
                            break block27;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricComputationEngine.a(customSystemException);
                        }
                    }
                    try {
                        if (this.w.J() != this.lJ) break block29;
                        arrayList.sort(new PriorityComparator());
                        break block27;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricComputationEngine.a(customSystemException);
                    }
                }
                try {
                    if (this.w.J() != this.lx) break block30;
                    arrayList.sort(new CustomObjectComparator());
                    break block27;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricComputationEngine.a(customSystemException);
                }
            }
            try {
                if (this.w.J() == this.A) {
                    arrayList.sort(new QueueComparator());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
        }
        try {
            if (!arrayList.isEmpty()) {
                return (TransactionOrchestrator1017)arrayList.get(0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        return null;
    }

    private boolean k() {
        try {
            if (!this.l4.s().booleanValue()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().K();
        return this.x.b(lightweightExecutionContext, false);
    }

    static void B(GeometricComputationEngine geometricComputationEngine) {
        geometricComputationEngine.c();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = GeometricComputationEngine.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GeometricComputationEngine.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GeometricComputationEngine.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                GeometricComputationEngine.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GeometricComputationEngine.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GeometricComputationEngine.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    void P(float f, float f2) {
        if (f != 0.0f) {
            f *= 5.0f;
            float f3 = ((Double)this.le.J()).floatValue();
            try {
                if (f2 <= 10.0f) {
                    this.ld = f3;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            if (this.ld > 0.0f) {
                f3 -= this.ld / 3.0f;
                this.ld -= f2 / 200.0f;
            }
            float f4 = 1.0f * f3 * f;
            this.v += f4;
        } else {
            this.v = 0.0f;
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Av" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = GeometricComputationEngine.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n];
                int n3 = string2.indexOf(8);
                clazz3 = GeometricComputationEngine.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GeometricComputationEngine.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GeometricComputationEngine.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        GeometricComputationEngine.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GeometricComputationEngine.b(254347849710732L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GeometricComputationEngine.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GeometricComputationEngine.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GeometricComputationEngine.b(254347849710732L, 0L);
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

    public GeometricComputationEngine() {
        long l = bb ^ 0x3846DA065105L;
        super(a.cs((int)GeometricComputationEngine.a("s", (int)30838, (long)(0x79C30D0A966086EL ^ l))), (int)GeometricComputationEngine.a("s", (int)28761, (long)(0x6C346977D9F7805AL ^ l)), RecursiveNodeGraph.X, a.cs((int)GeometricComputationEngine.a("s", (int)27440, (long)(0x153A9061CFDF9B0BL ^ l))));
        this.O = ReflectionUtility.L(this);
        this.lm = AuthenticationStateTracker.R(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)24569, (long)(0x66DBFC61A64B2FC1L ^ l)), (long)-606208941758589435L, (long)l)), true, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)19191, (long)(0x23E4171D37823AEBL ^ l)), (long)-606208941758589435L, (long)l)));
        this.ls = AuthenticationStateTracker.R(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)10070, (long)(0x7CD017B400B5D747L ^ l)), (long)-606208941758589435L, (long)l)), false, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)12934, (long)(0x70F5948AE597C2B5L ^ l)), (long)-606208941758589435L, (long)l)));
        this.l2 = AuthenticationStateTracker.R(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)13215, (long)(0x72143788035AC396L ^ l)), (long)-606208941758589435L, (long)l)), false, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)19241, (long)(0x15E601EDEB773B26L ^ l)), (long)-606208941758589435L, (long)l)));
        this.lg = AuthenticationStateTracker.R(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)15016, (long)(0x4584F283133CCAA0L ^ l)), (long)-606208941758589435L, (long)l)), false, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)25114, (long)(0x5F0C22CC7B011223L ^ l)), (long)-606208941758589435L, (long)l)));
        this.t = AuthenticationStateTracker.w(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)6501, (long)(0x43E82A50C6B4E973L ^ l)), (long)-606208941758589435L, (long)l)), false);
        this.e = ColorPaletteManager.o(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)8355, (long)(0x530B5130790A50B7L ^ l)), (long)-606208941758589435L, (long)l)), (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)2687, (long)(0x3DC8BF7C28A57A6CL ^ l)), (long)-606208941758589435L, (long)l)), ColorPaletteManager.U, Arrays.asList(new RecursiveNodeTreeBuilder((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)14887, (long)(0x2A41E889FC264A21L ^ l)), (long)-606208941758589435L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)12357, (long)(0x5D1F336254DAC049L ^ l)), (long)-606208941758589435L, (long)l)))));
        this.l4 = AuthenticationStateTracker.R(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)5675, (long)(0x4D1B4021166B6625L ^ l)), (long)-606208941758589435L, (long)l)), false, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)19962, (long)(0xF84123DCAE93DE7L ^ l)), (long)-606208941758589435L, (long)l)));
        this.x = ColorPaletteManager.r(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)25492, (long)(0x5134C54D8710938BL ^ l)), (long)-606208941758589435L, (long)l)), (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)31087, (long)(0x3DD384D7A30C097AL ^ l)), (long)-606208941758589435L, (long)l)), ColorPaletteManager.U, new RecursiveNodeTreeBuilder((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)2299, (long)(0x75D3847CD689F8ECL ^ l)), (long)-606208941758589435L, (long)l))));
        this.le = NumericPrecisionTransformer.t(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)24525, (long)(0x555ECF710CFFAFC6L ^ l)), (long)-606208941758589435L, (long)l)), (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)11065, (long)(0x5E23113EF824DB27L ^ l)), (long)-606208941758589435L, (long)l)), "", 1.0, 5.0, 10.0);
        this.Y = NumericPrecisionTransformer.t(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)28418, (long)(0x73CD17396C6A1F05L ^ l)), (long)-606208941758589435L, (long)l)), (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)31172, (long)(0x7561CCA8BD7789C9L ^ l)), (long)-606208941758589435L, (long)l)), "", 1.0, 5.0, 10.0);
        this.o = NumericPrecisionTransformer.D(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)19039, (long)(0x18A095FB89C3A44L ^ l)), (long)-606208941758589435L, (long)l)), (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)5770, (long)(0x684AAEADE2866688L ^ l)), (long)-606208941758589435L, (long)l)), "", 1.0, 180.0, 360.0, 1.0, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)31606, (long)(0x637F4007B6E0B47L ^ l)), (long)-606208941758589435L, (long)l)));
        this.lU = NumericPrecisionTransformer.D(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)8320, (long)(0x3E458C7C3F28D081L ^ l)), (long)-606208941758589435L, (long)l)), (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)28596, (long)(0x6624A2FC22F21FAEL ^ l)), (long)-606208941758589435L, (long)l)), "", 1.0, 5.0, 8.0, 0.1, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)29982, (long)(0x3BB657125B2E051BL ^ l)), (long)-606208941758589435L, (long)l)));
        this.Z = new AuthenticationGateway1860((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)15387, (long)(0x1C82FD57D415CC29L ^ l)), (long)-606208941758589435L, (long)l)));
        this.lX = new AuthenticationGateway1860((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)622, (long)(0x1D363DCA2485F25BL ^ l)), (long)-606208941758589435L, (long)l)));
        this.lx = new AuthenticationGateway1860((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)19409, (long)(0x55FE2B590E19BBC8L ^ l)), (long)-606208941758589435L, (long)l)));
        this.lJ = new AuthenticationGateway1860((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)8275, (long)(0x540630F093595059L ^ l)), (long)-606208941758589435L, (long)l)));
        this.A = new AuthenticationGateway1860((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)4867, (long)(0x4198E23814BEE303L ^ l)), (long)-606208941758589435L, (long)l)));
        this.w = GenericAdapterManager.I(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)7597, (long)(0x2D6EFC8C16456D9BL ^ l)), (long)-606208941758589435L, (long)l)), (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)31946, (long)(0x3A45232164C40CCEL ^ l)), (long)-606208941758589435L, (long)l)), this.lX, this.lX, this.Z, this.lx, this.lJ, this.A);
        this.h = new AuthenticationGateway1860((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)21870, (long)(0x130B5DCF65257CL ^ l)), (long)-606208941758589435L, (long)l)));
        this.n = new AuthenticationGateway1860((String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)31595, (long)(0x19BD8E66114F8B5FL ^ l)), (long)-606208941758589435L, (long)l)));
        this.R = GenericAdapterManager.I(this, (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)29358, (long)(0x2E78762E7E41029EL ^ l)), (long)-606208941758589435L, (long)l)), (String)((Object)GeometricComputationEngine.c("\u00ee", (int)GeometricComputationEngine.a("s", (int)17088, (long)(0x79B7010586B832F7L ^ l)), (long)-606208941758589435L, (long)l)), this.h, this.h, this.n);
        this.X = new Random();
        this.F = new Random();
        this.lp = 0.0f;
        this.ld = 0.0f;
        this.r = null;
        this.lH = 0;
        this.ls.l(this.le);
        this.l4.l(this.x);
        this.l4.E(this.x);
        this.t.E(this.e);
        this.t.l(this.e);
        this.lg.l(this.t);
        this.N(this.O, this.lm, this.l2, this.lg, this.t, this.e, this.ls, this.le, this.Y, this.o, this.lU, this.l4, this.x, this.R, this.w);
        this.Y.L(0);
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "/op";
        objectArray[1] = Integer.TYPE;
        GeometricComputationEngine.lb[1] = "java/lang/Integer";
        objectArray[2] = "\u001c?\b}e%\u00170\u00192\u0018=\u00047\u0010{";
        objectArray[3] = "EexP\u0010=Nji\u001fq3EamE";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "pq\u000ezT}~=^\u001dUvAt^,N<+w\u0000wU\rx)\u0018sR=;)\u001af>";
    }

    public boolean j(TransactionOrchestrator1017 transactionOrchestrator1017) {
        block25: {
            try {
                if (transactionOrchestrator1017.Y()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            try {
                if (transactionOrchestrator1017.equals(ApplicationLifecycleManager.U())) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            try {
                try {
                    if (!(transactionOrchestrator1017.e() <= 0.0f) && !transactionOrchestrator1017.O()) break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricComputationEngine.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
        }
        try {
            if (ApplicationLifecycleManager.U().y(transactionOrchestrator1017) >= (float)((Double)this.lU.J()).intValue()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        try {
            if (_Y.g(ApplicationLifecycleManager.U(), transactionOrchestrator1017) > ((Double)this.o.J()).intValue() / 2) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        try {
            if (TemporalMetadataResolver.h.j().h(transactionOrchestrator1017)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        try {
            if (transactionOrchestrator1017.equals(ApplicationLifecycleManager.U().o())) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        try {
            if (!this.M(transactionOrchestrator1017)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        return true;
    }

    void f(boolean bl) {
        try {
            ++this.N;
            if (this.N > 10) {
                this.d = this.b;
                this.lo = this.lN;
                this.lN = 0.0f;
                this.b = 0.0f;
                this.N = 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
    }

    private void c() {
        block53: {
            block52: {
                block49: {
                    TransactionOrchestrator1017 transactionOrchestrator1017;
                    block50: {
                        block48: {
                            block45: {
                                block44: {
                                    block43: {
                                        block42: {
                                            try {
                                                try {
                                                    if (!ApplicationLifecycleManager.c().Y() && !ApplicationLifecycleManager.U().Y()) break block42;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GeometricComputationEngine.a(customSystemException);
                                                }
                                                return;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GeometricComputationEngine.a(customSystemException);
                                            }
                                        }
                                        try {
                                            if (!this.o()) {
                                                this.f();
                                                return;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GeometricComputationEngine.a(customSystemException);
                                        }
                                        try {
                                            try {
                                                if (this.r == null || !this.r.Y()) break block43;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GeometricComputationEngine.a(customSystemException);
                                            }
                                            this.r = null;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GeometricComputationEngine.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!this.lm.s().booleanValue() || DynamicContextBroker.e()) break block44;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GeometricComputationEngine.a(customSystemException);
                                        }
                                        this.r = null;
                                        this.f();
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeometricComputationEngine.a(customSystemException);
                                    }
                                }
                                try {
                                    block46: {
                                        try {
                                            try {
                                                if (this.r == null) break block45;
                                                if (_Y.m(this.r)) break block46;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GeometricComputationEngine.a(customSystemException);
                                            }
                                            if (!((double)ApplicationLifecycleManager.U().y(this.r) > (Double)this.lU.J())) break block45;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GeometricComputationEngine.a(customSystemException);
                                        }
                                    }
                                    this.f();
                                    this.r = null;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeometricComputationEngine.a(customSystemException);
                                }
                            }
                            try {
                                block47: {
                                    try {
                                        try {
                                            if (!this.lm.s().booleanValue() || !DynamicContextBroker.e()) break block47;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GeometricComputationEngine.a(customSystemException);
                                        }
                                        if (this.r == null) break block48;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeometricComputationEngine.a(customSystemException);
                                    }
                                }
                                if (this.lm.s().booleanValue()) break block49;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeometricComputationEngine.a(customSystemException);
                            }
                        }
                        transactionOrchestrator1017 = this.q();
                        try {
                            block51: {
                                try {
                                    try {
                                        if (this.lm.s().booleanValue()) break block50;
                                        ++this.lL;
                                        if (this.lL > 700) break block51;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeometricComputationEngine.a(customSystemException);
                                    }
                                    if (this.r != null) break block49;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeometricComputationEngine.a(customSystemException);
                                }
                            }
                            this.r = transactionOrchestrator1017;
                            this.lL = 0;
                            break block49;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricComputationEngine.a(customSystemException);
                        }
                    }
                    this.r = transactionOrchestrator1017;
                }
                try {
                    if (ApplicationLifecycleManager.c().M() == null) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricComputationEngine.a(customSystemException);
                }
                try {
                    try {
                        try {
                            if (this.r == null || ApplicationLifecycleManager.X().M() != null) break block52;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricComputationEngine.a(customSystemException);
                        }
                        if (!GraphicalRenderingController.K.P) break block52;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricComputationEngine.a(customSystemException);
                    }
                    this.f(this.P);
                    this.k();
                    break block53;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricComputationEngine.a(customSystemException);
                }
            }
            this.f();
        }
    }

    private void k() {
        boolean bl;
        float f;
        float f2;
        int n;
        boolean bl2;
        int n2;
        boolean bl3;
        double d2;
        block58: {
            float f3;
            float f4;
            float f5;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block54: {
                block56: {
                    boolean bl4;
                    try {
                        this.N();
                        this.j = this.r.r();
                        this.lV = this.r.y();
                        this.m = this.r.D();
                        if (GeometryCalculator.C() == 13) {
                            this.lV += (double)this.r.E();
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricComputationEngine.a(customSystemException);
                    }
                    try {
                        if (this.R.J() == this.n) {
                            this.s();
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricComputationEngine.a(customSystemException);
                    }
                    double d3 = this.j - this.L;
                    double d4 = this.m - this.B;
                    this.L = this.j;
                    this.B = this.m;
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    double d5 = 1.7;
                    d2 = _Y.l(systemConfigurationOrchestrator.r(), systemConfigurationOrchestrator.D(), systemConfigurationOrchestrator.q(), this.j + d3 * d5, this.m + d4 * d5);
                    bl3 = _Y.D(systemConfigurationOrchestrator.r(), systemConfigurationOrchestrator.D(), systemConfigurationOrchestrator.q(), this.j + d3 * d5, this.m + d4 * d5);
                    n2 = _Y.z(systemConfigurationOrchestrator, this.j, this.lV, this.m);
                    try {
                        bl4 = n2 < 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricComputationEngine.a(customSystemException);
                    }
                    bl2 = bl4;
                    n = Math.abs(n2) - 10;
                    f5 = 1.0f;
                    f4 = 1.0f;
                    f5 = (float)((double)f5 + AdaptiveComputationEngine.F(this.X, 0.0, 2.0));
                    f5 = (float)((double)f5 + d2 / 50.0);
                    f4 = (float)((double)f4 + AdaptiveComputationEngine.F(this.X, 0.0, 2.0));
                    f4 += (float)Math.abs(n) / 50.0f;
                    if (Math.abs(d2 - this.lC) > 6.0) {
                        f5 = (float)((double)f5 + d2 / 35.0);
                    }
                    double d6 = (9.0f - systemConfigurationOrchestrator.y(this.r)) / 2.5f - 2.0f;
                    d6 = Math.max(0.0, d6);
                    f5 = (float)((double)f5 + d6);
                    try {
                        try {
                            block55: {
                                try {
                                    try {
                                        if (!this.l2.s().booleanValue()) break block54;
                                        if (bl3) break block55;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeometricComputationEngine.a(customSystemException);
                                    }
                                    if (systemConfigurationOrchestrator.W().m() > 0.0f) break block56;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeometricComputationEngine.a(customSystemException);
                                }
                            }
                            if (!bl3) break block54;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricComputationEngine.a(customSystemException);
                        }
                        if (!(systemConfigurationOrchestrator.W().m() < 0.0f)) break block54;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricComputationEngine.a(customSystemException);
                    }
                }
                f5 = (float)((double)f5 * 1.6);
            }
            if (systemConfigurationOrchestrator.y(this.r) < 0.5f) {
                f5 /= 5.0f;
            }
            f5 /= 90.0f;
            f4 /= 90.0f;
            try {
                f3 = bl3 ? -f5 : f5;
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            f2 = f3;
            try {
                float f6 = f = bl2 ? f4 : -f4;
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            if (d2 < 5.0) {
                f2 = 0.0f;
                try {
                    block57: {
                        try {
                            try {
                                try {
                                    this.lo *= 0.7f;
                                    if (bl3 && systemConfigurationOrchestrator.W().m() > 0.0f) break block57;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeometricComputationEngine.a(customSystemException);
                                }
                                if (bl3) break block58;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeometricComputationEngine.a(customSystemException);
                            }
                            if (!(systemConfigurationOrchestrator.W().m() < 0.0f)) break block58;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricComputationEngine.a(customSystemException);
                        }
                    }
                    this.lo *= 0.5f;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricComputationEngine.a(customSystemException);
                }
            }
        }
        try {
            if (bl3 != this.V) {
                this.lo = -this.lo;
                this.lN = -this.lN;
                this.lr = 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        try {
            if (bl2 != this.lZ) {
                this.d = -this.d;
                this.b = -this.b;
                this.v = 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        if (n < 5) {
            f = 0.0f;
            this.d *= 0.7f;
        }
        this.lN += f2;
        this.b += f;
        f2 = this.lo;
        f = this.d;
        try {
            if (Math.abs(f2) > 10.0f) {
                this.lN = 0.0f;
                this.lo = 0.0f;
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        float f7 = f2 * 0.15f;
        if (d2 <= 9.0) {
            f7 = (float)((double)f7 / (10.0 - d2));
        }
        try {
            GeometricComputationEngine geometricComputationEngine = this;
            bl = d2 > 5.0;
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        try {
            geometricComputationEngine.P = bl;
            if (Float.isNaN(f7)) {
                this.lN = 0.0f;
                this.lo = 0.0f;
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
        this.T(f7);
        if (this.ls.s().booleanValue()) {
            float f8 = (float)((double)f * 0.15);
            try {
                if (Float.isNaN(f8)) {
                    this.b = 0.0f;
                    this.d = 0.0f;
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            this.P(f8, n2);
        }
        try {
            this.lZ = bl2;
            this.V = bl3;
            ++this.G;
            if (this.G > 10) {
                this.lC = d2;
                this.G = 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
    }

    void f() {
        this.lr = 0.0f;
        this.v = 0.0f;
        this.T = 0;
        this.K = 0;
        this.z = 0;
        this.lB = 0;
    }

    @Override
    public void h() {
        try {
            if (!this.l) {
                this.l = true;
                new BackgroundWorkerThread(this).start();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricComputationEngine.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public String t() {
        return this.Y.p();
    }

    private boolean M(TransactionOrchestrator1017 transactionOrchestrator1017) {
        if (this.l4.s().booleanValue()) {
            LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().K();
            try {
                if (!this.x.b(lightweightExecutionContext, false)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricComputationEngine.a(customSystemException);
            }
            return this.O.u(transactionOrchestrator1017);
        }
        return this.O.u(transactionOrchestrator1017);
    }

    public TransactionOrchestrator1017 A() {
        return this.r;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GeometricComputationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(GeometricComputationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

