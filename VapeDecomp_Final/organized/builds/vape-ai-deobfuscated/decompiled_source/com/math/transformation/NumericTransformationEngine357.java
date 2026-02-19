/*
 * Decompiled with CFR 0.152.
 */
package com.math.transformation;

import a.a;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.propagation.EventPropagationDispatcher;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.numeric.precision.NumericPrecisionTransformer;
import com.physics.simulation.PhysicsPositionTracker;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.structures.tree.RecursiveNodeTree;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.ExecutionStateTracker;
import com.system.pipeline.ObjectPipelineManager;
import com.temporal.metadata.TemporalMetadataResolver;
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

public class NumericTransformationEngine357
extends ContextualExecutionFramework {
    private final AuthenticationStateTracker v;
    private double j;
    private double R;
    private final NumericPrecisionTransformer o;
    private boolean w;
    private static final long[] d;
    private static final String[] m;
    private static final Object[] l;
    private static final long b;
    private boolean G;
    private static final Map h;
    private static final Integer[] e;

    @DataExchangeProtocol2090
    public void u(EventPropagationDispatcher eventPropagationDispatcher) {
        block12: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block13: {
                systemConfigurationOrchestrator = eventPropagationDispatcher.getThePlayer();
                try {
                    try {
                        try {
                            try {
                                this.R = Math.hypot(systemConfigurationOrchestrator.F() - systemConfigurationOrchestrator.f(), systemConfigurationOrchestrator.B() - systemConfigurationOrchestrator.n());
                                if (!this.v.s().booleanValue()) break block12;
                                if (this.G) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationEngine357.a(customSystemException);
                            }
                            if (!systemConfigurationOrchestrator.D()) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine357.a(customSystemException);
                        }
                        if (!this.w) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine357.a(customSystemException);
                    }
                    this.m();
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine357.a(customSystemException);
                }
            }
            try {
                try {
                    if (this.w || !this.u(systemConfigurationOrchestrator)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine357.a(customSystemException);
                }
                this.w = true;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine357.a(customSystemException);
            }
        }
    }

    private static Field c(long l, long l2) {
        int n = NumericTransformationEngine357.a(l, l2);
        Object object = NumericTransformationEngine357.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = NumericTransformationEngine357.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NumericTransformationEngine357.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NumericTransformationEngine357.a(clazz3, string2, clazz2)) != null) {
                    NumericTransformationEngine357.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NumericTransformationEngine357.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NumericTransformationEngine357.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NumericTransformationEngine357.b(273481740594892L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean j() {
        return true;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NumericTransformationEngine357.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NumericTransformationEngine357.b = MultiContainerRegistry.a(-8603830460847736984L, -8691669253901859331L, MethodHandles.lookup().lookupClass()).a(72780890297618L);
                NumericTransformationEngine357.l = new Object[5];
                NumericTransformationEngine357.m = new String[5];
                NumericTransformationEngine357.a();
                NumericTransformationEngine357.h = new HashMap<K, V>(13);
                var0 = NumericTransformationEngine357.b ^ 82584088376965L;
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
                var6_5 = "b\u00c5\u00c7\u00faY\u00fdCt\u000e\u00b7}\u0019\u00b0e\u00f8\u009e\u0012\u00c0\u00db\u00c5+\u0002V\u00daO\u0004/\u00e1\u00a20\u00ab\u00fe\u00f5T\u00cf\u00ea\u00c6k\u00f6\u00e1";
                var7_6 = "b\u00c5\u00c7\u00faY\u00fdCt\u000e\u00b7}\u0019\u00b0e\u00f8\u009e\u0012\u00c0\u00db\u00c5+\u0002V\u00daO\u0004/\u00e1\u00a20\u00ab\u00fe\u00f5T\u00cf\u00ea\u00c6k\u00f6\u00e1".length();
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
                    var6_5 = "#\u00a6`\u008a9\u00e6\u0013\u00b1\u00c5\u001d\u00ac\u00cf\u00fep\u001d\u00cb";
                    var7_6 = "#\u00a6`\u008a9\u00e6\u0013\u00b1\u00c5\u001d\u00ac\u00cf\u00fep\u001d\u00cb".length();
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
        NumericTransformationEngine357.d = var8_3;
        NumericTransformationEngine357.e = new Integer[7];
    }

    @Override
    public void h() {
        TemporalMetadataResolver.h.a().I(this);
        this.j = 0.27999999999999997;
        this.G = false;
        this.R = 0.0;
        this.w = false;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xX" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NumericTransformationEngine357.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NumericTransformationEngine357.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean u(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        block14: {
            block13: {
                ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
                try {
                    block12: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (executionStateTracker.s().b() || executionStateTracker.w().b()) break block12;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericTransformationEngine357.a(customSystemException);
                                        }
                                        if (executionStateTracker.y().b()) break block12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NumericTransformationEngine357.a(customSystemException);
                                    }
                                    if (executionStateTracker.h().b()) break block12;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericTransformationEngine357.a(customSystemException);
                                }
                                if (systemConfigurationOrchestrator.W().t() != 0.0f) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationEngine357.a(customSystemException);
                            }
                            if (systemConfigurationOrchestrator.W().m() == 0.0f) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine357.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine357.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void P(PhysicsPositionTracker physicsPositionTracker) {
        double d2;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block41: {
            block39: {
                block40: {
                    double d3;
                    double d4;
                    NumericTransformationEngine357 numericTransformationEngine357;
                    block35: {
                        boolean bl;
                        block38: {
                            boolean bl2;
                            block37: {
                                block36: {
                                    block34: {
                                        boolean bl3;
                                        boolean bl4;
                                        block33: {
                                            systemConfigurationOrchestrator = physicsPositionTracker.getThePlayer();
                                            try {
                                                block32: {
                                                    try {
                                                        try {
                                                            try {
                                                                if (systemConfigurationOrchestrator.u() == 0.0f && systemConfigurationOrchestrator.w() == 0.0f) break block32;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw NumericTransformationEngine357.a(customSystemException);
                                                            }
                                                            if (physicsPositionTracker.getWorld().Y()) break block32;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw NumericTransformationEngine357.a(customSystemException);
                                                        }
                                                        if (!systemConfigurationOrchestrator.F()) break block33;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw NumericTransformationEngine357.a(customSystemException);
                                                    }
                                                }
                                                this.j = this.z(systemConfigurationOrchestrator);
                                                return;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw NumericTransformationEngine357.a(customSystemException);
                                            }
                                        }
                                        try {
                                            bl4 = systemConfigurationOrchestrator.K().u() >= 6;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericTransformationEngine357.a(customSystemException);
                                        }
                                        bl = bl4;
                                        try {
                                            bl3 = physicsPositionTracker.getWorld().T(ReflectionUtilityBroker.L(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V() - 0.1, systemConfigurationOrchestrator.B())).I().r() == 0.98f;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericTransformationEngine357.a(customSystemException);
                                        }
                                        bl2 = bl3;
                                        try {
                                            numericTransformationEngine357 = this;
                                            d4 = this.z(systemConfigurationOrchestrator);
                                            if (!systemConfigurationOrchestrator.A(RecursiveNodeTree.f())) break block34;
                                            d3 = 0.5;
                                            break block35;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericTransformationEngine357.a(customSystemException);
                                        }
                                    }
                                    try {
                                        if (!systemConfigurationOrchestrator.H()) break block36;
                                        d3 = 0.8;
                                        break block35;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NumericTransformationEngine357.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        if (!systemConfigurationOrchestrator.x() && !systemConfigurationOrchestrator.F()) break block37;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NumericTransformationEngine357.a(customSystemException);
                                    }
                                    d3 = 0.54;
                                    break block35;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericTransformationEngine357.a(customSystemException);
                                }
                            }
                            try {
                                if (!bl2) break block38;
                                d3 = 2.4;
                                break block35;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationEngine357.a(customSystemException);
                            }
                        }
                        try {
                            d3 = bl ? 1.0 : 0.765;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine357.a(customSystemException);
                        }
                    }
                    d2 = numericTransformationEngine357.j = d4 * d3;
                    try {
                        try {
                            if (!systemConfigurationOrchestrator.j()) break block39;
                            if (!this.G) break block40;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericTransformationEngine357.a(customSystemException);
                        }
                        this.j = d2 * (Double)this.o.J();
                        systemConfigurationOrchestrator.z((double)0.42f);
                        physicsPositionTracker.setY(0.42f);
                        break block41;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine357.a(customSystemException);
                    }
                }
                this.j = d2;
                break block41;
            }
            if (this.G) {
                double d5;
                block42: {
                    d5 = 0.3303950079529733;
                    try {
                        if (!systemConfigurationOrchestrator.e(ObjectPipelineManager.X) || systemConfigurationOrchestrator.W(ObjectPipelineManager.X).V() <= 5) break block42;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericTransformationEngine357.a(customSystemException);
                    }
                    int n = systemConfigurationOrchestrator.W(ObjectPipelineManager.X).y();
                    d5 *= 1.0 + 0.15 * (double)(n + 1);
                }
                this.j = this.R - 0.666 * (this.R - d5);
                this.w = true;
            } else {
                this.j = this.R - this.R / 50.0;
            }
        }
        this.G = systemConfigurationOrchestrator.j();
        this.j = Math.max(this.j, d2);
        physicsPositionTracker.setX(-(Math.sin(this.N(systemConfigurationOrchestrator)) * this.j));
        physicsPositionTracker.setZ(Math.cos(this.N(systemConfigurationOrchestrator)) * this.j);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = NumericTransformationEngine357.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 43;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 56;
                break;
            }
            case 3: {
                n3 = 57;
                break;
            }
            case 4: {
                n3 = 33;
                break;
            }
            case 5: {
                n3 = 15;
                break;
            }
            case 6: {
                n3 = 27;
                break;
            }
            case 7: {
                n3 = 23;
                break;
            }
            case 8: {
                n3 = 32;
                break;
            }
            case 9: {
                n3 = 12;
                break;
            }
            case 10: {
                n3 = 62;
                break;
            }
            case 11: {
                n3 = 40;
                break;
            }
            case 12: {
                n3 = 44;
                break;
            }
            case 13: {
                n3 = 17;
                break;
            }
            case 14: {
                n3 = 28;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 26;
                break;
            }
            case 17: {
                n3 = 38;
                break;
            }
            case 18: {
                n3 = 35;
                break;
            }
            case 19: {
                n3 = 34;
                break;
            }
            case 20: {
                n3 = 6;
                break;
            }
            case 21: {
                n3 = 25;
                break;
            }
            case 22: {
                n3 = 45;
                break;
            }
            case 23: {
                n3 = 53;
                break;
            }
            case 24: {
                n3 = 42;
                break;
            }
            case 25: {
                n3 = 29;
                break;
            }
            case 26: {
                n3 = 59;
                break;
            }
            case 27: {
                n3 = 60;
                break;
            }
            case 28: {
                n3 = 10;
                break;
            }
            case 29: {
                n3 = 3;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 41;
                break;
            }
            case 32: {
                n3 = 50;
                break;
            }
            case 33: {
                n3 = 63;
                break;
            }
            case 34: {
                n3 = 48;
                break;
            }
            case 35: {
                n3 = 47;
                break;
            }
            case 36: {
                n3 = 9;
                break;
            }
            case 37: {
                n3 = 54;
                break;
            }
            case 38: {
                n3 = 39;
                break;
            }
            case 39: {
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 14;
                break;
            }
            case 41: {
                n3 = 16;
                break;
            }
            case 42: {
                n3 = 51;
                break;
            }
            case 43: {
                n3 = 30;
                break;
            }
            case 44: {
                n3 = 18;
                break;
            }
            case 45: {
                n3 = 52;
                break;
            }
            case 46: {
                n3 = 24;
                break;
            }
            case 47: {
                n3 = 0;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 13;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 21;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 22;
                break;
            }
            case 54: {
                n3 = 37;
                break;
            }
            case 55: {
                n3 = 7;
                break;
            }
            case 56: {
                n3 = 5;
                break;
            }
            case 57: {
                n3 = 19;
                break;
            }
            case 58: {
                n3 = 46;
                break;
            }
            case 59: {
                n3 = 61;
                break;
            }
            case 60: {
                n3 = 58;
                break;
            }
            case 61: {
                n3 = 36;
                break;
            }
            case 62: {
                n3 = 31;
                break;
            }
            default: {
                n3 = 1;
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
        NumericTransformationEngine357.m[n4] = new String(cArray);
        return n4;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "!\u001eo";
        objectArray[1] = Integer.TYPE;
        NumericTransformationEngine357.m[1] = "java/lang/Integer";
        objectArray[2] = "ej\fjTone\u001d%)w}b\u0014l";
        objectArray[3] = "\u0012n'\u0000\u0010A\u0019a6OqO\u0012j2\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0013\tm?%?B\fhOr /Tl1}kE\u0013<1z[\u0016\u0016;6y4H\u001075\u0019";
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

    public NumericTransformationEngine357() {
        long l = b ^ 0x1508C49D5A59L;
        super(a.cs((int)NumericTransformationEngine357.a("g", (int)358, (long)(0x4DD75D89250A9B19L ^ l))), (int)NumericTransformationEngine357.a("g", (int)20010, (long)(0x2D0438E416DE5457L ^ l)), RecursiveNodeGraph.G, a.cs((int)NumericTransformationEngine357.a("g", (int)3844, (long)(0x4E4F27075716157CL ^ l))));
        this.o = NumericPrecisionTransformer.t(this, (String)((Object)NumericTransformationEngine357.c("T", (int)NumericTransformationEngine357.a("g", (int)12801, (long)(0x754B4F54D8A2287FL ^ l)), (long)-4664594606571818082L, (long)l)), (String)((Object)NumericTransformationEngine357.c("T", (int)NumericTransformationEngine357.a("g", (int)25161, (long)(0x292149AE06FD7833L ^ l)), (long)-4664594606571818082L, (long)l)), "", 3.0, 4.1, 5.0);
        this.v = AuthenticationStateTracker.R(this, (String)((Object)NumericTransformationEngine357.c("T", (int)NumericTransformationEngine357.a("g", (int)3957, (long)(0x25CDFAC01E6950EL ^ l)), (long)-4664594606571818082L, (long)l)), true, (String)((Object)NumericTransformationEngine357.c("T", (int)NumericTransformationEngine357.a("g", (int)14018, (long)(0x1FC851F716822CBEL ^ l)), (long)-4664594606571818082L, (long)l)));
        this.N(this.o, this.v);
        this.j = 0.27999999999999997;
        this.G = false;
        this.R = 0.0;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NumericTransformationEngine357.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NumericTransformationEngine357.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x253B;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericTransformationEngine357.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericTransformationEngine357.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(long l, long l2) {
        int n = NumericTransformationEngine357.a(l, l2);
        Object object = NumericTransformationEngine357.l[n];
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
                clazz3 = NumericTransformationEngine357.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NumericTransformationEngine357.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NumericTransformationEngine357.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NumericTransformationEngine357.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NumericTransformationEngine357.b(273481740594892L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NumericTransformationEngine357.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NumericTransformationEngine357.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NumericTransformationEngine357.b(273481740594892L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == '\u00d5' || c == '\u00f3' || c == 'Y') {
                field = NumericTransformationEngine357.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NumericTransformationEngine357.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NumericTransformationEngine357.a(l, l2);
            object = NumericTransformationEngine357.l[n];
            try {
                if (!(object instanceof String)) break block2;
                NumericTransformationEngine357.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private float N(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        float f = systemConfigurationOrchestrator.q();
        if (systemConfigurationOrchestrator.u() < 0.0f) {
            f += 180.0f;
        }
        float f2 = systemConfigurationOrchestrator.u() < 0.0f ? -0.5f : (systemConfigurationOrchestrator.u() > 0.0f ? 0.5f : 1.0f);
        if (systemConfigurationOrchestrator.w() > 0.0f) {
            f -= 90.0f * f2;
        }
        if (systemConfigurationOrchestrator.w() < 0.0f) {
            f += 90.0f * f2;
        }
        return f *= (float)Math.PI / 180;
    }

    private double z(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        double d2;
        block2: {
            d2 = 0.28730000691562896;
            try {
                if (!systemConfigurationOrchestrator.e(ObjectPipelineManager.X) || systemConfigurationOrchestrator.W(ObjectPipelineManager.X).V() <= 5) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine357.a(customSystemException);
            }
            int n = systemConfigurationOrchestrator.W(ObjectPipelineManager.X).y();
            d2 *= 1.0 + 0.15 * (double)(n + 1);
        }
        return d2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericTransformationEngine357.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NumericTransformationEngine357.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

