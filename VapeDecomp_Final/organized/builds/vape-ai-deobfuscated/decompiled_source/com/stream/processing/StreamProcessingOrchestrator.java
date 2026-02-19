/*
 * Decompiled with CFR 0.152.
 */
package com.stream.processing;

import a._Y;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.resources.ResourceLifecycleManager1543;
import com.app.sorting.strategy.EntitySortingComparator2266;
import com.app.system.configuration.ConfigurationManager1306;
import com.app.transaction.TransactionValidator2680;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.comparison.strategy.CustomEntityComparator;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationDispatcher;
import com.data.transformation.TransformationEngine;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometryCalculator;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.ProtocolInteractionController;
import com.network.protocol.TransmissionProtocolConfig;
import com.numeric.precision.NumericPrecisionTransformer;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.review.sorting.ReviewSortingStrategy;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.event.SecureEventOrchestrator;
import com.sorting.strategy.EntitySortingComparator;
import com.system.configuration.AdaptiveConfigEngine;
import com.system.resource.ResourceAllocator1606;
import com.temporal.metadata.TemporalMetadataResolver;
import com.vape.sorting.VapeOrderComparator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StreamProcessingOrchestrator
extends ContextualExecutionFramework
implements TransactionValidator2680 {
    private final DataTransformationDispatcher z;
    private final NetworkConfigManager n;
    private final HashMap<Class, Comparator> A;
    private final AuthenticationGateway1860 T;
    private final NumericPrecisionTransformer B;
    private final List<Integer> F;
    private static final String[] l;
    private boolean o;
    private final AuthenticationGateway1860 L;
    private static final Integer[] e;
    private final Queue<DimensionalMetricsTracker> V;
    private final AuthenticationStateTracker P;
    private static final Object[] j;
    private boolean x;
    private static final long[] d;
    private boolean O;
    private static final long b;
    private static final Map h;
    private final GenericAdapterManager Z;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                StreamProcessingOrchestrator.b = MultiContainerRegistry.a(-2082002698777201425L, -1448574185183799247L, MethodHandles.lookup().lookupClass()).a(161873310776525L);
                StreamProcessingOrchestrator.j = new Object[5];
                StreamProcessingOrchestrator.l = new String[5];
                StreamProcessingOrchestrator.a();
                StreamProcessingOrchestrator.h = new HashMap<K, V>(13);
                var0 = StreamProcessingOrchestrator.b ^ 11808571036472L;
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
                var6_5 = "\u00ebV\u00bb\u0082\u00f9\u00e8\u0003T\u00b7R{-\u00d5\u00e4a\u00d0P:\u00b0\u008f\u0012\u00ea}\u00e8\u009b\n\u00fe\u00d9\u0010\u00d1z~\u00c7\u00ed\u0090\u00f9\u00e0\u00e8\u00f7\u009bX!\u0090\u00ce\u00dd\u00e0\u0018\u00b6\u00c7V\u00a6\u000b\u00ffc,\u00e0";
                var7_6 = "\u00ebV\u00bb\u0082\u00f9\u00e8\u0003T\u00b7R{-\u00d5\u00e4a\u00d0P:\u00b0\u008f\u0012\u00ea}\u00e8\u009b\n\u00fe\u00d9\u0010\u00d1z~\u00c7\u00ed\u0090\u00f9\u00e0\u00e8\u00f7\u009bX!\u0090\u00ce\u00dd\u00e0\u0018\u00b6\u00c7V\u00a6\u000b\u00ffc,\u00e0".length();
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
                    var6_5 = "\u00c6\u00de{\u0006VdB\u00bf\u00c6\u00cfK\u0001\"\u00c7\u00adO";
                    var7_6 = "\u00c6\u00de{\u0006VdB\u00bf\u00c6\u00cfK\u0001\"\u00c7\u00adO".length();
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
        StreamProcessingOrchestrator.d = var8_3;
        StreamProcessingOrchestrator.e = new Integer[9];
    }

    private boolean l() {
        SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
        try {
            if (!secureEventOrchestrator.B(ReflectionMetadataResolver.FJ)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingOrchestrator.a(customSystemException);
        }
        TransformationEngine transformationEngine = new TransformationEngine(secureEventOrchestrator);
        ResourceAllocator1606 resourceAllocator1606 = transformationEngine.R();
        for (int i = 9; i < 36; ++i) {
            ResourceLifecycleManager1543 resourceLifecycleManager1543 = resourceAllocator1606.T(i);
            LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
            try {
                if (!lightweightExecutionContext.Y()) continue;
                new ConfigurationManager1306(TransmissionProtocolConfig.CLICK, i, 0).T(resourceAllocator1606.D(), this.V);
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamProcessingOrchestrator.a(customSystemException);
            }
        }
        return false;
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "Tob";
        objectArray[1] = Integer.TYPE;
        StreamProcessingOrchestrator.l[1] = "java/lang/Integer";
        objectArray[2] = "\\\"G!\nJW-VnwRD*_'";
        objectArray[3] = "\u0003\u0017wu,\u001b\b\u0018f:M\u0015\u0003\u0013b`";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "D\u0018&E\u007fzV[.|}a+[a\u001fn`I\u001d%\u0006'\u001a\u0012\u001d7\u0012.\"[\b \u0015\u0016";
    }

    private static Field c(long l, long l2) {
        int n = StreamProcessingOrchestrator.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = StreamProcessingOrchestrator.l[n];
            int n2 = string.indexOf(8);
            Class clazz = StreamProcessingOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = StreamProcessingOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = StreamProcessingOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    StreamProcessingOrchestrator.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = StreamProcessingOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        StreamProcessingOrchestrator.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = StreamProcessingOrchestrator.b(277599925212189L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = StreamProcessingOrchestrator.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = StreamProcessingOrchestrator.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = StreamProcessingOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = StreamProcessingOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = StreamProcessingOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        StreamProcessingOrchestrator.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = StreamProcessingOrchestrator.b(277599925212189L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = StreamProcessingOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        StreamProcessingOrchestrator.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = StreamProcessingOrchestrator.b(277599925212189L, 0L);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void O() {
        block10: {
            LightweightExecutionContext lightweightExecutionContext = _Y.g();
            try {
                try {
                    if (!lightweightExecutionContext.r() || !this.l()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamProcessingOrchestrator.a(customSystemException);
                }
                this.x = false;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamProcessingOrchestrator.a(customSystemException);
            }
        }
        try {
            if (this.Z.J() == this.L) {
                this.T(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingOrchestrator.a(customSystemException);
        }
        try {
            if (!ApplicationLifecycleManager.X().Y()) {
                ApplicationLifecycleManager.U().E();
                this.x = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingOrchestrator.a(customSystemException);
        }
        this.V.clear();
        this.n.m();
        this.F.clear();
        this.x = false;
        this.o = false;
    }

    private boolean r(int n) {
        ResourceAllocator1606 resourceAllocator1606;
        if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) {
            TransformationEngine transformationEngine = new TransformationEngine(ApplicationLifecycleManager.X());
            resourceAllocator1606 = transformationEngine.R();
        } else {
            resourceAllocator1606 = ApplicationLifecycleManager.U().t();
        }
        for (int i = 0; i < 9; ++i) {
            boolean bl;
            block8: {
                block7: {
                    ResourceLifecycleManager1543 resourceLifecycleManager1543 = resourceAllocator1606.T(36 + i);
                    try {
                        try {
                            if (!resourceLifecycleManager1543.y().Y()) continue;
                            if (i != n) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamProcessingOrchestrator.a(customSystemException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamProcessingOrchestrator.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = StreamProcessingOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = StreamProcessingOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public boolean I() {
        boolean bl;
        block10: {
            block8: {
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    if (!this.Z() || this.V.size() <= 0) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StreamProcessingOrchestrator.a(customSystemException);
                                }
                                if (this.P.s().booleanValue()) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StreamProcessingOrchestrator.a(customSystemException);
                            }
                            if (!ApplicationLifecycleManager.X().Y()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamProcessingOrchestrator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamProcessingOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = StreamProcessingOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @DataExchangeProtocol2090
    public void K(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block89: {
            block88: {
                ResourceAllocator1606 resourceAllocator1606;
                Object object;
                block82: {
                    block83: {
                        block77: {
                            block81: {
                                block79: {
                                    ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
                                    block80: {
                                        block76: {
                                            block75: {
                                                try {
                                                    try {
                                                        if (!TemporalMetadataResolver.h.U().Z(StreamProcessingOrchestrator.class) && !TemporalMetadataResolver.h.a().p()) break block75;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw StreamProcessingOrchestrator.a(customSystemException);
                                                    }
                                                    this.V.clear();
                                                    this.n.m();
                                                    this.F.clear();
                                                    return;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw StreamProcessingOrchestrator.a(customSystemException);
                                                }
                                            }
                                            try {
                                                if (ApplicationLifecycleManager.U().M().G()) {
                                                    return;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw StreamProcessingOrchestrator.a(customSystemException);
                                            }
                                            try {
                                                if (this.x) {
                                                    this.O();
                                                    return;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw StreamProcessingOrchestrator.a(customSystemException);
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (!ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN) || this.Z.J() != this.T) break block76;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw StreamProcessingOrchestrator.a(customSystemException);
                                                    }
                                                    if (this.P.s().booleanValue()) break block76;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw StreamProcessingOrchestrator.a(customSystemException);
                                                }
                                                return;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw StreamProcessingOrchestrator.a(customSystemException);
                                            }
                                        }
                                        try {
                                            block78: {
                                                try {
                                                    try {
                                                        try {
                                                            if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) break block77;
                                                            if (this.Z.J() == this.L) break block78;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw StreamProcessingOrchestrator.a(customSystemException);
                                                        }
                                                        if (!this.P.s().booleanValue()) break block77;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw StreamProcessingOrchestrator.a(customSystemException);
                                                    }
                                                    if (!this.O) break block77;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw StreamProcessingOrchestrator.a(customSystemException);
                                                }
                                            }
                                            if (!this.O) break block79;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw StreamProcessingOrchestrator.a(customSystemException);
                                        }
                                        connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().R();
                                        try {
                                            if (GeometryCalculator.C() < 35) break block80;
                                            OutputEncoder.p(connectionPoolOrchestrator1192);
                                            break block81;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw StreamProcessingOrchestrator.a(customSystemException);
                                        }
                                    }
                                    OutputEncoder.f(connectionPoolOrchestrator1192, true);
                                    OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
                                    break block81;
                                }
                                try {
                                    if (this.Z.J() == this.L) {
                                        this.T(false);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StreamProcessingOrchestrator.a(customSystemException);
                                }
                            }
                            return;
                        }
                        try {
                            try {
                                this.O = false;
                                this.x = false;
                                if (this.V.size() <= 0) break block82;
                                if (!this.n.m(((Double)this.B.J()).intValue())) break block83;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StreamProcessingOrchestrator.a(customSystemException);
                            }
                            this.V.poll().H();
                            this.n.m();
                            this.o = true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamProcessingOrchestrator.a(customSystemException);
                        }
                    }
                    return;
                }
                if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) {
                    object = new TransformationEngine(ApplicationLifecycleManager.X());
                    resourceAllocator1606 = ((TransformationEngine)object).R();
                } else {
                    resourceAllocator1606 = ApplicationLifecycleManager.U().t();
                }
                object = this.z.M();
                boolean bl = false;
                if (object.size() == 9) {
                    for (int i = 0; i < 9; ++i) {
                        TransmissionProtocolConfig transmissionProtocolConfig;
                        ConfigurationManager1306 configurationManager1306;
                        ConfigurationManager1306 configurationManager13062;
                        boolean bl2;
                        boolean bl3;
                        int n;
                        LightweightExecutionContext lightweightExecutionContext;
                        ResourceLifecycleManager1543 resourceLifecycleManager1543;
                        int n2;
                        block87: {
                            block86: {
                                boolean bl4;
                                LightweightExecutionContext lightweightExecutionContext2;
                                ResourceLifecycleManager1543 resourceLifecycleManager15432;
                                block85: {
                                    block84: {
                                        AdaptiveConfigEngine adaptiveConfigEngine = (AdaptiveConfigEngine)object.get(i);
                                        n2 = 36 + i;
                                        resourceLifecycleManager15432 = resourceAllocator1606.T(n2);
                                        resourceLifecycleManager1543 = this.L(resourceLifecycleManager15432, adaptiveConfigEngine);
                                        try {
                                            if (resourceLifecycleManager1543 == null) {
                                                continue;
                                            }
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw StreamProcessingOrchestrator.a(customSystemException);
                                        }
                                        lightweightExecutionContext2 = resourceLifecycleManager15432.y();
                                        lightweightExecutionContext = resourceLifecycleManager1543.y();
                                        try {
                                            try {
                                                if (!resourceLifecycleManager1543.equals(resourceLifecycleManager15432)) break block84;
                                                this.F.add(n2);
                                                if (!lightweightExecutionContext2.r()) break block84;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw StreamProcessingOrchestrator.a(customSystemException);
                                            }
                                            if (lightweightExecutionContext2.J() >= lightweightExecutionContext2.D()) break block84;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw StreamProcessingOrchestrator.a(customSystemException);
                                        }
                                        List<ResourceLifecycleManager1543> list = this.J(resourceAllocator1606, resourceLifecycleManager15432, adaptiveConfigEngine);
                                        if (!list.isEmpty()) {
                                            resourceLifecycleManager1543 = list.get(0);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (resourceLifecycleManager1543.equals(resourceLifecycleManager15432)) continue;
                                                if (!this.P.s().booleanValue()) break block85;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw StreamProcessingOrchestrator.a(customSystemException);
                                            }
                                            if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.FJ)) break block85;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw StreamProcessingOrchestrator.a(customSystemException);
                                        }
                                        this.O = true;
                                        this.x = false;
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw StreamProcessingOrchestrator.a(customSystemException);
                                    }
                                }
                                this.F.add(n2);
                                this.F.add(resourceLifecycleManager1543.G());
                                n = 0;
                                if (lightweightExecutionContext2.r()) {
                                    n += lightweightExecutionContext2.D();
                                }
                                try {
                                    bl4 = !this.Q(resourceLifecycleManager15432);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StreamProcessingOrchestrator.a(customSystemException);
                                }
                                bl3 = bl4;
                                try {
                                    try {
                                        if (!this.r(i) || resourceLifecycleManager1543.G() >= 36) break block86;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw StreamProcessingOrchestrator.a(customSystemException);
                                    }
                                    bl2 = true;
                                    break block87;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StreamProcessingOrchestrator.a(customSystemException);
                                }
                            }
                            bl2 = false;
                        }
                        boolean bl5 = bl2;
                        try {
                            ConfigurationManager1306 configurationManager13063;
                            configurationManager13062 = configurationManager13063;
                            configurationManager1306 = configurationManager13063;
                            transmissionProtocolConfig = bl5 ? TransmissionProtocolConfig.SHIFTCLICK : (bl3 ? TransmissionProtocolConfig.SWAP : TransmissionProtocolConfig.MOVE);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamProcessingOrchestrator.a(customSystemException);
                        }
                        configurationManager13062(transmissionProtocolConfig, resourceLifecycleManager1543.G(), n2);
                        configurationManager1306.T(resourceAllocator1606.D(), this.V);
                        n += lightweightExecutionContext.J();
                        try {
                            if (n > lightweightExecutionContext.D()) {
                                new ConfigurationManager1306(TransmissionProtocolConfig.CLICK, resourceLifecycleManager1543.G(), n2).T(resourceAllocator1606.D(), this.V);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamProcessingOrchestrator.a(customSystemException);
                        }
                        bl = true;
                        break;
                    }
                }
                try {
                    try {
                        if (bl || this.Z.J() != this.L) break block88;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamProcessingOrchestrator.a(customSystemException);
                    }
                    this.x = true;
                    this.n.m();
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamProcessingOrchestrator.a(customSystemException);
                }
            }
            try {
                try {
                    try {
                        try {
                            if (!this.o || this.Z.J() != this.T) break block89;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamProcessingOrchestrator.a(customSystemException);
                        }
                        if (!this.P.s().booleanValue()) break block89;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamProcessingOrchestrator.a(customSystemException);
                    }
                    if (!this.V.isEmpty()) break block89;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamProcessingOrchestrator.a(customSystemException);
                }
                this.x = true;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamProcessingOrchestrator.a(customSystemException);
            }
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00df' || c == '\u00ff' || c == 'k' || c == '\u00de') {
                field = StreamProcessingOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00df' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = StreamProcessingOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        boolean bl;
        try {
            bl = this.Z.J() == this.L;
        }
        catch (CustomSystemException customSystemException) {
            throw StreamProcessingOrchestrator.a(customSystemException);
        }
        return bl;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = StreamProcessingOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (StreamProcessingOrchestrator.l[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 61;
                break;
            }
            case 1: {
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 9;
                break;
            }
            case 3: {
                n3 = 33;
                break;
            }
            case 4: {
                n3 = 36;
                break;
            }
            case 5: {
                n3 = 6;
                break;
            }
            case 6: {
                n3 = 39;
                break;
            }
            case 7: {
                n3 = 62;
                break;
            }
            case 8: {
                n3 = 13;
                break;
            }
            case 9: {
                n3 = 63;
                break;
            }
            case 10: {
                n3 = 43;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 13: {
                n3 = 19;
                break;
            }
            case 14: {
                n3 = 47;
                break;
            }
            case 15: {
                n3 = 20;
                break;
            }
            case 16: {
                n3 = 60;
                break;
            }
            case 17: {
                n3 = 1;
                break;
            }
            case 18: {
                n3 = 27;
                break;
            }
            case 19: {
                n3 = 0;
                break;
            }
            case 20: {
                n3 = 37;
                break;
            }
            case 21: {
                n3 = 16;
                break;
            }
            case 22: {
                n3 = 22;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 59;
                break;
            }
            case 25: {
                n3 = 45;
                break;
            }
            case 26: {
                n3 = 55;
                break;
            }
            case 27: {
                n3 = 40;
                break;
            }
            case 28: {
                n3 = 30;
                break;
            }
            case 29: {
                n3 = 17;
                break;
            }
            case 30: {
                n3 = 12;
                break;
            }
            case 31: {
                n3 = 26;
                break;
            }
            case 32: {
                n3 = 49;
                break;
            }
            case 33: {
                n3 = 31;
                break;
            }
            case 34: {
                n3 = 41;
                break;
            }
            case 35: {
                n3 = 23;
                break;
            }
            case 36: {
                n3 = 15;
                break;
            }
            case 37: {
                n3 = 28;
                break;
            }
            case 38: {
                n3 = 5;
                break;
            }
            case 39: {
                n3 = 56;
                break;
            }
            case 40: {
                n3 = 29;
                break;
            }
            case 41: {
                n3 = 35;
                break;
            }
            case 42: {
                n3 = 51;
                break;
            }
            case 43: {
                n3 = 48;
                break;
            }
            case 44: {
                n3 = 34;
                break;
            }
            case 45: {
                n3 = 54;
                break;
            }
            case 46: {
                n3 = 3;
                break;
            }
            case 47: {
                n3 = 2;
                break;
            }
            case 48: {
                n3 = 50;
                break;
            }
            case 49: {
                n3 = 10;
                break;
            }
            case 50: {
                n3 = 58;
                break;
            }
            case 51: {
                n3 = 46;
                break;
            }
            case 52: {
                n3 = 53;
                break;
            }
            case 53: {
                n3 = 44;
                break;
            }
            case 54: {
                n3 = 57;
                break;
            }
            case 55: {
                n3 = 11;
                break;
            }
            case 56: {
                n3 = 8;
                break;
            }
            case 57: {
                n3 = 4;
                break;
            }
            case 58: {
                n3 = 21;
                break;
            }
            case 59: {
                n3 = 18;
                break;
            }
            case 60: {
                n3 = 32;
                break;
            }
            case 61: {
                n3 = 42;
                break;
            }
            case 62: {
                n3 = 25;
                break;
            }
            default: {
                n3 = 38;
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
        StreamProcessingOrchestrator.l[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void v() {
        super.v();
        this.O = false;
        this.x = false;
        this.V.clear();
        this.n.m();
        this.F.clear();
    }

    @Override
    public void h() {
        block3: {
            block2: {
                try {
                    if (this.Z.J() != this.L) break block2;
                    this.O = true;
                    this.x = false;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamProcessingOrchestrator.a(customSystemException);
                }
            }
            this.O = false;
            this.x = false;
        }
        this.V.clear();
        this.n.m();
        this.F.clear();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = StreamProcessingOrchestrator.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                StreamProcessingOrchestrator.j[n] = clazz = Class.forName(StreamProcessingOrchestrator.l[n]);
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

    public StreamProcessingOrchestrator() {
        long l = b ^ 0x7DC0C279DF31L;
        super(a.cs((int)StreamProcessingOrchestrator.a("y", (int)21739, (long)(0x2BB40EA5628C4BCDL ^ l))), -6656, RecursiveNodeGraph.W, a.cs((int)StreamProcessingOrchestrator.a("y", (int)28445, (long)(0x6AD161AA259CF035L ^ l))));
        this.B = NumericPrecisionTransformer.t(this, (String)((Object)StreamProcessingOrchestrator.c("I", (int)StreamProcessingOrchestrator.a("y", (int)25895, (long)(0x5C27360EA01B7A02L ^ l)), (long)1520541092972263330L, (long)l)), (String)((Object)StreamProcessingOrchestrator.c("I", (int)StreamProcessingOrchestrator.a("y", (int)1938, (long)(0x4BCD74EEE23118B6L ^ l)), (long)1520541092972263330L, (long)l)), "", 0.0, 110.0, 300.0);
        this.V = new ConcurrentLinkedQueue<DimensionalMetricsTracker>();
        this.n = new NetworkConfigManager();
        this.A = new HashMap();
        this.F = new ArrayList<Integer>();
        this.L = new AuthenticationGateway1860((String)((Object)StreamProcessingOrchestrator.c("I", (int)StreamProcessingOrchestrator.a("y", (int)10557, (long)(0x726F997951AB361AL ^ l)), (long)1520541092972263330L, (long)l)));
        this.T = new AuthenticationGateway1860((String)((Object)StreamProcessingOrchestrator.c("I", (int)StreamProcessingOrchestrator.a("y", (int)13376, (long)(0x413C5E4BAA13AB62L ^ l)), (long)1520541092972263330L, (long)l)));
        this.Z = GenericAdapterManager.D(this, (String)((Object)StreamProcessingOrchestrator.c("I", (int)StreamProcessingOrchestrator.a("y", (int)11299, (long)(0x1CE9F7334396B302L ^ l)), (long)1520541092972263330L, (long)l)), this.L, this.L, this.T);
        this.P = AuthenticationStateTracker.w(this, (String)((Object)StreamProcessingOrchestrator.c("I", (int)StreamProcessingOrchestrator.a("y", (int)4543, (long)(0x10C8B7ABB4258E9CL ^ l)), (long)1520541092972263330L, (long)l)), true);
        this.O = true;
        this.o = false;
        this.q(false);
        this.z = DataTransformationDispatcher.w(this, (String)((Object)StreamProcessingOrchestrator.c("I", (int)StreamProcessingOrchestrator.a("y", (int)6787, (long)(0x6BB061051FB785A3L ^ l)), (long)1520541092972263330L, (long)l)));
        this.Z.l((ConfigurationProfileResolver)this.P, this.T);
        this.N(this.Z, this.P, this.B, this.z);
        this.D();
    }

    private List<ResourceLifecycleManager1543> J(ResourceAllocator1606 resourceAllocator1606, ResourceLifecycleManager1543 resourceLifecycleManager1543, AdaptiveConfigEngine adaptiveConfigEngine) {
        List<ResourceLifecycleManager1543> list = resourceAllocator1606.D();
        ArrayList<ResourceLifecycleManager1543> arrayList = new ArrayList<ResourceLifecycleManager1543>();
        LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
        if (lightweightExecutionContext.r()) {
            for (int i = 9; i < list.size(); ++i) {
                ResourceLifecycleManager1543 resourceLifecycleManager15432 = resourceAllocator1606.T(i);
                LightweightExecutionContext lightweightExecutionContext2 = resourceLifecycleManager15432.y();
                try {
                    try {
                        try {
                            if (!lightweightExecutionContext2.r() || !adaptiveConfigEngine.K(lightweightExecutionContext2)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamProcessingOrchestrator.a(customSystemException);
                        }
                        if (this.F.contains(i)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamProcessingOrchestrator.a(customSystemException);
                    }
                    arrayList.add(resourceLifecycleManager15432);
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamProcessingOrchestrator.a(customSystemException);
                }
            }
        }
        return arrayList;
    }

    private void D() {
        VapeOrderComparator vapeOrderComparator = new VapeOrderComparator(this);
        CustomEntityComparator customEntityComparator = new CustomEntityComparator(this);
        EntitySortingComparator2266 entitySortingComparator2266 = new EntitySortingComparator2266(this);
        ReviewSortingStrategy reviewSortingStrategy = new ReviewSortingStrategy(this);
        EntitySortingComparator entitySortingComparator = new EntitySortingComparator(this);
        this.A.put(ReflectionMetadataResolver.Yx, vapeOrderComparator);
        this.A.put(ReflectionMetadataResolver.EL, vapeOrderComparator);
        this.A.put(ReflectionMetadataResolver.tZ, customEntityComparator);
        this.A.put(ReflectionMetadataResolver.x, customEntityComparator);
        this.A.put(ReflectionMetadataResolver.U6, entitySortingComparator2266);
        this.A.put(ReflectionMetadataResolver.Fl, reviewSortingStrategy);
        this.A.put(ReflectionMetadataResolver.bO, entitySortingComparator);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private ResourceLifecycleManager1543 L(ResourceLifecycleManager1543 resourceLifecycleManager1543, AdaptiveConfigEngine adaptiveConfigEngine) {
        block19: {
            Object object;
            block20: {
                block21: {
                    ResourceAllocator1606 resourceAllocator1606;
                    if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) {
                        object = new TransformationEngine(ApplicationLifecycleManager.X());
                        resourceAllocator1606 = ((TransformationEngine)object).R();
                    } else {
                        resourceAllocator1606 = ApplicationLifecycleManager.U().t();
                    }
                    object = new ArrayList();
                    try {
                        if (adaptiveConfigEngine.K(resourceLifecycleManager1543.y())) {
                            object.add(resourceLifecycleManager1543);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamProcessingOrchestrator.a(customSystemException);
                    }
                    for (ResourceLifecycleManager1543 object22 : resourceAllocator1606.D()) {
                        try {
                            try {
                                try {
                                    if (!adaptiveConfigEngine.K(object22.y()) || this.F.contains(object22.G())) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StreamProcessingOrchestrator.a(customSystemException);
                                }
                                if (object.contains(object22)) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StreamProcessingOrchestrator.a(customSystemException);
                            }
                            object.add(object22);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamProcessingOrchestrator.a(customSystemException);
                        }
                    }
                    try {
                        if (object.isEmpty()) break block19;
                        if (!adaptiveConfigEngine.y()) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamProcessingOrchestrator.a(customSystemException);
                    }
                    ProtocolInteractionController protocolInteractionController = adaptiveConfigEngine.P();
                    Class<?> clazz = protocolInteractionController.M().getClass();
                    if (this.A.containsKey(clazz)) {
                        Comparator comparator = this.A.get(clazz);
                        try {
                            try {
                                object.sort(comparator);
                                Collections.reverse(object);
                                if (!adaptiveConfigEngine.K(resourceLifecycleManager1543.y()) || comparator.compare(object.get(0), resourceLifecycleManager1543) != 0) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StreamProcessingOrchestrator.a(customSystemException);
                            }
                            return null;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamProcessingOrchestrator.a(customSystemException);
                        }
                    }
                }
                return (ResourceLifecycleManager1543)object.get(0);
            }
            return (ResourceLifecycleManager1543)object.get(0);
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA3B;
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
                throw new RuntimeException("a/A0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            StreamProcessingOrchestrator.e[n2] = n3;
        }
        return e[n2];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = StreamProcessingOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = StreamProcessingOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private boolean Q(ResourceLifecycleManager1543 resourceLifecycleManager1543) {
        LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
        if (lightweightExecutionContext.r()) {
            ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
            return protocolInteractionController.r();
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StreamProcessingOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(StreamProcessingOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

