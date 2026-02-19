/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.advanced.resolution;

import a.Ne;
import a._Y;
import a.a;
import a.kg;
import com.app.task.management.TaskDispatchQueue;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.compression.core.DataCompressionHandler;
import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.concurrency.scheduling.AsynchronousTaskScheduler1070;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.data.transformation.TransformationEngine1757;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.EventDispatchCoordinator2087;
import com.event.management.EventDispatchQueue2150;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.rendering.PixelCoordinateCalculator;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.configuration.NetworkConfigManager;
import com.numeric.precision.NumericPrecisionTransformer;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.negotiation.CryptoContextNegotiator684;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class MultiLayeredCompositeResolver
extends ContextualExecutionFramework {
    private final AuthenticationStateTracker N;
    private AsynchronousTaskScheduler1070 L;
    NetworkConfigManager t;
    NetworkConfigManager w;
    private AsynchronousTaskScheduler1070 Z;
    private static final String[] m;
    private final NumericPrecisionTransformer o;
    private static final Object[] l;
    private final List<TransformationEngine1757> B;
    private final List<ConcurrentFilteringCoordinator> Y;
    private static final long b;
    ArrayList<PixelCoordinateCalculator> V;
    private final NumericPrecisionTransformer P;
    private static final Integer[] e;
    private static final long[] d;
    private static final Map j;
    private final AuthenticationStateTracker h;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public MultiLayeredCompositeResolver() {
        long l = b ^ 0x3EC096019A5CL;
        super(a.cs((int)MultiLayeredCompositeResolver.a("z", (int)14890, (long)(0x7D2053F82F82219DL ^ l))), (int)MultiLayeredCompositeResolver.a("z", (int)21005, (long)(0x64793D3AEC54C9BBL ^ l)), RecursiveNodeGraph.z, a.cs((int)MultiLayeredCompositeResolver.a("z", (int)17991, (long)(0x59D4E1B8F3B2DDF7L ^ l))));
        this.Y = new ArrayList<ConcurrentFilteringCoordinator>();
        this.o = NumericPrecisionTransformer.N(this, (String)((Object)MultiLayeredCompositeResolver.c("\u00f4", (int)MultiLayeredCompositeResolver.a("z", (int)25674, (long)(0x237A8D1E0E83FFF5L ^ l)), (long)6491506449453526485L, (long)l)), (String)((Object)MultiLayeredCompositeResolver.c("\u00f4", (int)MultiLayeredCompositeResolver.a("z", (int)29736, (long)(0x411C0DE514646F9DL ^ l)), (long)6491506449453526485L, (long)l)), "", 1.0, 50.0, 100.0, 1.0);
        this.P = NumericPrecisionTransformer.N(this, (String)((Object)MultiLayeredCompositeResolver.c("\u00f4", (int)MultiLayeredCompositeResolver.a("z", (int)20571, (long)(0x1AD4EB0D1676CBEAL ^ l)), (long)6491506449453526485L, (long)l)), (String)((Object)MultiLayeredCompositeResolver.c("\u00f4", (int)MultiLayeredCompositeResolver.a("z", (int)8322, (long)(0x6ACA0F5E8F683B31L ^ l)), (long)6491506449453526485L, (long)l)), (String)((Object)MultiLayeredCompositeResolver.c("\u00f4", (int)MultiLayeredCompositeResolver.a("z", (int)17491, (long)(0xDE4E942E1A7DFEEL ^ l)), (long)6491506449453526485L, (long)l)), 5.0, 5.0, 5.0, 1.0);
        this.h = AuthenticationStateTracker.R(this, (String)((Object)MultiLayeredCompositeResolver.c("\u00f4", (int)MultiLayeredCompositeResolver.a("z", (int)7611, (long)(0x5AF1149F45E70607L ^ l)), (long)6491506449453526485L, (long)l)), false, (String)((Object)MultiLayeredCompositeResolver.c("\u00f4", (int)MultiLayeredCompositeResolver.a("z", (int)16186, (long)(0x4ABD553C8925248EL ^ l)), (long)6491506449453526485L, (long)l)));
        this.N = AuthenticationStateTracker.R(this, (String)((Object)MultiLayeredCompositeResolver.c("\u00f4", (int)MultiLayeredCompositeResolver.a("z", (int)14725, (long)(0x74E4BD4F8C39A237L ^ l)), (long)6491506449453526485L, (long)l)), false, (String)((Object)MultiLayeredCompositeResolver.c("\u00f4", (int)MultiLayeredCompositeResolver.a("z", (int)8735, (long)(0x66DFFD1E79D1B9A1L ^ l)), (long)6491506449453526485L, (long)l)));
        this.w = new NetworkConfigManager();
        this.t = new NetworkConfigManager();
        this.B = GeometryCalculator.C() == 15 ? new ArrayList<TransformationEngine1757>() : new CopyOnWriteArrayList<TransformationEngine1757>();
        this.N(this.o, this.h, this.N);
        this.K(50L, true);
        this.h.P(this::lambda$new$0);
    }

    private static Method d(long l, long l2) {
        int n = MultiLayeredCompositeResolver.a(l, l2);
        Object object = MultiLayeredCompositeResolver.l[n];
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
                clazz3 = MultiLayeredCompositeResolver.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultiLayeredCompositeResolver.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultiLayeredCompositeResolver.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultiLayeredCompositeResolver.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultiLayeredCompositeResolver.b(255500610750489L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultiLayeredCompositeResolver.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultiLayeredCompositeResolver.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultiLayeredCompositeResolver.b(255500610750489L, 0L);
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

    private void t(SystemConfigurationOrchestrator systemConfigurationOrchestrator, TransformationEngine1757 transformationEngine1757, Color color, float f, float f2, double d2, double d3, double d4, double d5, boolean bl) {
        block33: {
            boolean bl2;
            block34: {
                boolean bl3;
                block35: {
                    double d6;
                    double d7;
                    double d8;
                    double d9;
                    double d10;
                    block31: {
                        block32: {
                            block30: {
                                d10 = (double)transformationEngine1757.g() + 0.5 - d2;
                                d9 = (double)transformationEngine1757.Z() + 0.5 - d3;
                                d8 = (double)transformationEngine1757.c() + 0.5 - d4;
                                bl2 = false;
                                bl3 = false;
                                if (!ConfigurationManager.U()) {
                                    bl2 = GL11.glIsEnabled((int)3042);
                                    bl3 = GL11.glIsEnabled((int)2896);
                                    try {
                                        GL11.glBlendFunc((int)770, (int)771);
                                        if (!bl2) {
                                            Ne.h.y(3042);
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MultiLayeredCompositeResolver.a(customSystemException);
                                    }
                                    try {
                                        if (bl3) {
                                            Ne.h.z(2896);
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MultiLayeredCompositeResolver.a(customSystemException);
                                    }
                                    GL11.glBlendFunc((int)770, (int)771);
                                    Ne.h.y(2848);
                                    Ne.h.z(3553);
                                }
                                d7 = 0.0;
                                d6 = 0.0;
                                if (GeometryCalculator.C() >= 23) {
                                    double d11;
                                    double d12;
                                    kg kg2;
                                    block29: {
                                        block28: {
                                            kg2 = new kg(0.0, 0.0, 1.0);
                                            try {
                                                if (GeometryCalculator.C() < 35) break block28;
                                                kg2.j((float)(-Math.toRadians(ApplicationLifecycleManager.r().r())));
                                                kg2.n((float)(-Math.toRadians(ApplicationLifecycleManager.r().k())));
                                                break block29;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MultiLayeredCompositeResolver.a(customSystemException);
                                            }
                                        }
                                        kg2.j((float)(-Math.toRadians(systemConfigurationOrchestrator.S())));
                                        kg2.n((float)(-Math.toRadians(systemConfigurationOrchestrator.q())));
                                    }
                                    d7 = kg2.R();
                                    try {
                                        d12 = d5;
                                        d11 = GeometryCalculator.C() >= 35 ? kg2.L() - (double)systemConfigurationOrchestrator.E() : kg2.L();
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MultiLayeredCompositeResolver.a(customSystemException);
                                    }
                                    d5 = d12 + d11;
                                    d6 = kg2.U();
                                    try {
                                        if (GeometryCalculator.C() < 35 || ApplicationLifecycleManager.N().V() == 0) break block30;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MultiLayeredCompositeResolver.a(customSystemException);
                                    }
                                    DataCompressionHandler dataCompressionHandler = ApplicationLifecycleManager.U().v();
                                    double d13 = NumericComputationEngine1131.b() - dataCompressionHandler.w().X();
                                    double d14 = NumericComputationEngine1131.S() - dataCompressionHandler.w().F();
                                    double d15 = NumericComputationEngine1131.n() - dataCompressionHandler.w().f();
                                    d10 += d13;
                                    d9 += d14;
                                    d8 += d15;
                                }
                            }
                            try {
                                try {
                                    if (!ConfigurationManager.U()) break block31;
                                    if (!bl) break block32;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MultiLayeredCompositeResolver.a(customSystemException);
                                }
                                DataFlowAnalyzer.N(d7, d5, d6, d10, d9, d8, f + f * 0.5f, Color.black);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw MultiLayeredCompositeResolver.a(customSystemException);
                            }
                        }
                        DataFlowAnalyzer.N(d7, d5, d6, d10, d9, d8, f, color);
                        break block35;
                    }
                    try {
                        if (bl) {
                            GL11.glLineWidth((float)(f + f * 0.5f));
                            GL11.glBegin((int)1);
                            GraphicsBufferAllocator.Y(Color.black);
                            GL11.glVertex3d((double)d7, (double)d5, (double)d6);
                            GL11.glVertex3d((double)d10, (double)d9, (double)d8);
                            GL11.glEnd();
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiLayeredCompositeResolver.a(customSystemException);
                    }
                    GL11.glLineWidth((float)f);
                    GL11.glBegin((int)1);
                    GraphicsBufferAllocator.Y(color);
                    GL11.glVertex3d((double)d7, (double)d5, (double)d6);
                    GL11.glVertex3d((double)d10, (double)d9, (double)d8);
                    GL11.glEnd();
                }
                try {
                    try {
                        if (ConfigurationManager.U()) break block33;
                        if (!bl3) break block34;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiLayeredCompositeResolver.a(customSystemException);
                    }
                    Ne.h.y(2896);
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiLayeredCompositeResolver.a(customSystemException);
                }
            }
            try {
                if (!bl2) {
                    Ne.h.z(3042);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiLayeredCompositeResolver.a(customSystemException);
            }
            Ne.h.y(3553);
            Ne.h.z(2848);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultiLayeredCompositeResolver.a(l, l2);
            object = MultiLayeredCompositeResolver.l[n];
            try {
                if (!(object instanceof String)) break block2;
                MultiLayeredCompositeResolver.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultiLayeredCompositeResolver.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MultiLayeredCompositeResolver.b = MultiContainerRegistry.a(-6605296333396074726L, -1585577961403557801L, MethodHandles.lookup().lookupClass()).a(27758453139970L);
                MultiLayeredCompositeResolver.l = new Object[5];
                MultiLayeredCompositeResolver.m = new String[5];
                MultiLayeredCompositeResolver.a();
                MultiLayeredCompositeResolver.j = new HashMap<K, V>(13);
                var0 = MultiLayeredCompositeResolver.b ^ 2190045911775L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "8\u00d5\u00d9\u00d9p_\u00ebJ\u00d1\u0086,\u0097!\u00ff\u00a3\u00d4\u00c3\u00fb\u008e_\u008b\u00a3;\u0090{\u00e1\u00eaH\u00d0\u00f4w\u00e4m}1\u00f6<\u009d|8{\u00c3\u000e8\u00108?9p\u00c0\u00e57\u0004\u00f4\u00c0(\u0084R\u00ae\u0014\u0010\u009d\u0015\u00a7\u00ad\u00e0\u0085\u00d2?\u008c\u0085Hk\u009d\u00c6Io%?+";
                var7_6 = "8\u00d5\u00d9\u00d9p_\u00ebJ\u00d1\u0086,\u0097!\u00ff\u00a3\u00d4\u00c3\u00fb\u008e_\u008b\u00a3;\u0090{\u00e1\u00eaH\u00d0\u00f4w\u00e4m}1\u00f6<\u009d|8{\u00c3\u000e8\u00108?9p\u00c0\u00e57\u0004\u00f4\u00c0(\u0084R\u00ae\u0014\u0010\u009d\u0015\u00a7\u00ad\u00e0\u0085\u00d2?\u008c\u0085Hk\u009d\u00c6Io%?+".length();
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
                    var6_5 = "/\u0001a\u0001\u0099\u00b2\u001a\u00c5\u00ad\u00e9\u0012\u00b5\u0099\u00e3\u0012\u00fe";
                    var7_6 = "/\u0001a\u0001\u0099\u00b2\u001a\u00c5\u00ad\u00e9\u0012\u00b5\u0099\u00e3\u0012\u00fe".length();
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
        MultiLayeredCompositeResolver.d = var8_3;
        MultiLayeredCompositeResolver.e = new Integer[12];
    }

    public ConcurrentFilteringCoordinator o(int n, int n2) {
        for (ConcurrentFilteringCoordinator concurrentFilteringCoordinator : this.Y) {
            try {
                if (!concurrentFilteringCoordinator.r(n, n2)) continue;
                return concurrentFilteringCoordinator;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiLayeredCompositeResolver.a(customSystemException);
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MultiLayeredCompositeResolver.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultiLayeredCompositeResolver.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x41A1;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
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
                throw new RuntimeException("a/AE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MultiLayeredCompositeResolver.e[n2] = n3;
        }
        return e[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void l(EventDispatchCoordinator2087 eventDispatchCoordinator2087) {
        double d2;
        try {
            if (!this.N.s().booleanValue()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiLayeredCompositeResolver.a(customSystemException);
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventDispatchCoordinator2087.getThePlayer();
        CryptoContextNegotiator684.Y();
        GraphicsBufferAllocator.V();
        Ne.h.z(2929);
        eventDispatchCoordinator2087.getEntityRenderer().H(0.0);
        double d3 = NumericComputationEngine1131.b();
        double d4 = NumericComputationEngine1131.S();
        double d5 = NumericComputationEngine1131.n();
        try {
            d2 = GeometryCalculator.C() > 13 ? (double)systemConfigurationOrchestrator.E() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw MultiLayeredCompositeResolver.a(customSystemException);
        }
        double d6 = d2;
        for (TransformationEngine1757 transformationEngine1757 : this.B) {
            try {
                if (!transformationEngine1757.D()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiLayeredCompositeResolver.a(customSystemException);
            }
            try {
                if (transformationEngine1757.x == 0) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiLayeredCompositeResolver.a(customSystemException);
            }
            try {
                if (!transformationEngine1757.N()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiLayeredCompositeResolver.a(customSystemException);
            }
            this.t(systemConfigurationOrchestrator, transformationEngine1757, transformationEngine1757.c(), 2.0f, eventDispatchCoordinator2087.getTicks(), d3, d4, d5, d6, false);
        }
        Ne.h.m(1.0, 1.0f, 1.0f);
        eventDispatchCoordinator2087.getEntityRenderer().F(0.0);
        Ne.h.y(2929);
        GraphicsBufferAllocator.E();
        Ne.h.X();
    }

    private void x() {
        block11: {
            block12: {
                try {
                    try {
                        try {
                            if (GeometryCalculator.C() != 15 || this.V == null) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MultiLayeredCompositeResolver.a(customSystemException);
                        }
                        if (!ApplicationLifecycleManager.c().Y()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiLayeredCompositeResolver.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiLayeredCompositeResolver.a(customSystemException);
                }
            }
            this.B.clear();
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            for (PixelCoordinateCalculator object : this.V) {
                block14: {
                    ConcurrentFilteringCoordinator concurrentFilteringCoordinator = this.o(object.F(), object.N());
                    if (concurrentFilteringCoordinator != null) {
                        TransformationEngine1757 transformationEngine1757;
                        block13: {
                            int n = object.V();
                            int n2 = object.J();
                            int n3 = object.f();
                            int n4 = (int)_Y.m(systemConfigurationOrchestrator, n, n2, n3);
                            transformationEngine1757 = EventDispatchQueue2150.J(n, n2, n3, object.F(), concurrentFilteringCoordinator, concurrentFilteringCoordinator.K(), n4);
                            try {
                                if (!((double)n4 < (Double)this.o.J() + 10.0)) break block13;
                                this.B.add(transformationEngine1757);
                                break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw MultiLayeredCompositeResolver.a(customSystemException);
                            }
                        }
                        EventDispatchQueue2150.N(transformationEngine1757);
                    }
                }
                TaskDispatchQueue.L(object);
            }
            for (TransformationEngine1757 transformationEngine1757 : this.B) {
                EventDispatchQueue2150.N(transformationEngine1757);
            }
            this.V = null;
        }
    }

    @Override
    public void W() {
        block9: {
            block11: {
                try {
                    block10: {
                        try {
                            try {
                                try {
                                    if (GeometryCalculator.C() != 15 || !this.w.m(1000L)) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MultiLayeredCompositeResolver.a(customSystemException);
                                }
                                this.w.m();
                                if (ApplicationLifecycleManager.c().Y()) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw MultiLayeredCompositeResolver.a(customSystemException);
                            }
                            if (!ApplicationLifecycleManager.U().Y()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MultiLayeredCompositeResolver.a(customSystemException);
                        }
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiLayeredCompositeResolver.a(customSystemException);
                }
            }
            if (this.V == null) {
                ArrayList<ConcurrentFilteringCoordinator> arrayList = new ArrayList<ConcurrentFilteringCoordinator>(this.Y);
                this.V = TaskDispatchQueue.j(arrayList, ((Double)this.o.J()).intValue(), this.h.s());
            }
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = MultiLayeredCompositeResolver.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 44;
                break;
            }
            case 1: {
                n3 = 37;
                break;
            }
            case 2: {
                n3 = 25;
                break;
            }
            case 3: {
                n3 = 35;
                break;
            }
            case 4: {
                n3 = 9;
                break;
            }
            case 5: {
                n3 = 13;
                break;
            }
            case 6: {
                n3 = 48;
                break;
            }
            case 7: {
                n3 = 21;
                break;
            }
            case 8: {
                n3 = 31;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 20;
                break;
            }
            case 11: {
                n3 = 59;
                break;
            }
            case 12: {
                n3 = 23;
                break;
            }
            case 13: {
                n3 = 26;
                break;
            }
            case 14: {
                n3 = 47;
                break;
            }
            case 15: {
                n3 = 12;
                break;
            }
            case 16: {
                n3 = 27;
                break;
            }
            case 17: {
                n3 = 24;
                break;
            }
            case 18: {
                n3 = 15;
                break;
            }
            case 19: {
                n3 = 46;
                break;
            }
            case 20: {
                n3 = 63;
                break;
            }
            case 21: {
                n3 = 18;
                break;
            }
            case 22: {
                n3 = 42;
                break;
            }
            case 23: {
                n3 = 36;
                break;
            }
            case 24: {
                n3 = 17;
                break;
            }
            case 25: {
                n3 = 10;
                break;
            }
            case 26: {
                n3 = 7;
                break;
            }
            case 27: {
                n3 = 14;
                break;
            }
            case 28: {
                n3 = 52;
                break;
            }
            case 29: {
                n3 = 41;
                break;
            }
            case 30: {
                n3 = 57;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 4;
                break;
            }
            case 33: {
                n3 = 45;
                break;
            }
            case 34: {
                n3 = 54;
                break;
            }
            case 35: {
                n3 = 28;
                break;
            }
            case 36: {
                n3 = 39;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 6;
                break;
            }
            case 39: {
                n3 = 58;
                break;
            }
            case 40: {
                n3 = 38;
                break;
            }
            case 41: {
                n3 = 53;
                break;
            }
            case 42: {
                n3 = 3;
                break;
            }
            case 43: {
                n3 = 30;
                break;
            }
            case 44: {
                n3 = 51;
                break;
            }
            case 45: {
                n3 = 16;
                break;
            }
            case 46: {
                n3 = 8;
                break;
            }
            case 47: {
                n3 = 1;
                break;
            }
            case 48: {
                n3 = 5;
                break;
            }
            case 49: {
                n3 = 32;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 60;
                break;
            }
            case 52: {
                n3 = 62;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 55;
                break;
            }
            case 56: {
                n3 = 11;
                break;
            }
            case 57: {
                n3 = 2;
                break;
            }
            case 58: {
                n3 = 56;
                break;
            }
            case 59: {
                n3 = 43;
                break;
            }
            case 60: {
                n3 = 50;
                break;
            }
            case 61: {
                n3 = 22;
                break;
            }
            case 62: {
                n3 = 29;
                break;
            }
            default: {
                n3 = 19;
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
        MultiLayeredCompositeResolver.m[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = MultiLayeredCompositeResolver.a(l, l2);
        Object object = MultiLayeredCompositeResolver.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = MultiLayeredCompositeResolver.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultiLayeredCompositeResolver.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultiLayeredCompositeResolver.a(clazz3, string2, clazz2)) != null) {
                    MultiLayeredCompositeResolver.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultiLayeredCompositeResolver.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultiLayeredCompositeResolver.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultiLayeredCompositeResolver.b(255500610750489L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void v() {
        try {
            if (GeometryCalculator.C() != 15) {
                this.L.w();
                this.Z.w();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiLayeredCompositeResolver.a(customSystemException);
        }
        this.B.clear();
    }

    @Override
    public void h() {
        try {
            if (GeometryCalculator.C() != 15) {
                this.L = new AsynchronousTaskScheduler1070(this.B, this.Y, this.o);
                this.Z = new AsynchronousTaskScheduler1070(this.B, this.Y, this.P);
                this.L.n(this.h.s());
                this.Z.n(this.h.s());
                this.L.M();
                this.Z.M();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiLayeredCompositeResolver.a(customSystemException);
        }
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "\"\u007fK";
        objectArray[1] = Integer.TYPE;
        MultiLayeredCompositeResolver.m[1] = "java/lang/Integer";
        objectArray[2] = "U\u00141OXr^\u001b \u0000%jM\u001c)I";
        objectArray[3] = ">,7:v\r5#&u\u0017\u0003>(\"/";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "%\u00079n2Ys[|\n5Z\u001c\u0016sw`\u001e#\u001a{w^\u0018~\f3vb\u001d%\u000ec\n";
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MultiLayeredCompositeResolver.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @DataExchangeProtocol2090
    public void K(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        try {
            if (this.t.m(50L)) {
                this.x();
                this.t.m();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiLayeredCompositeResolver.a(customSystemException);
        }
        ApplicationLifecycleManager.U().H(1.0);
        CryptoContextNegotiator684.Y();
        boolean bl = Ne.h.k(3042);
        try {
            if (!bl) {
                Ne.h.y(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiLayeredCompositeResolver.a(customSystemException);
        }
        GL11.glBlendFunc((int)770, (int)771);
        Ne.h.h(1.5f);
        Ne.h.z(3553);
        Ne.h.y(2848);
        Ne.h.z(2929);
        Ne.h.E(false);
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        double d5 = 0.0;
        if (GeometryCalculator.C() >= 35) {
            d5 = ApplicationLifecycleManager.U().v().w().F() - d3;
        }
        for (TransformationEngine1757 transformationEngine1757 : this.B) {
            try {
                if (!transformationEngine1757.D()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiLayeredCompositeResolver.a(customSystemException);
            }
            try {
                if (transformationEngine1757.x == 0) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiLayeredCompositeResolver.a(customSystemException);
            }
            CryptoContextNegotiator684.H(transformationEngine1757, d2, d3 + d5, d4);
        }
        try {
            Ne.h.E(true);
            Ne.h.y(2929);
            Ne.h.y(3553);
            Ne.h.z(2848);
            if (!bl) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiLayeredCompositeResolver.a(customSystemException);
        }
        Ne.h.X();
        ApplicationLifecycleManager.U().F(1.0);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AE" + " : " + string + " : " + methodType.toString(), exception);
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

    public void k(ConcurrentFilteringCoordinator concurrentFilteringCoordinator) {
        this.Y.add(concurrentFilteringCoordinator);
    }

    private void lambda$new$0(AuthenticationStateTracker authenticationStateTracker) {
        try {
            if (this.L != null) {
                this.L.n(this.h.s());
                this.Z.n(this.h.s());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiLayeredCompositeResolver.a(customSystemException);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultiLayeredCompositeResolver.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultiLayeredCompositeResolver.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void o(ConcurrentFilteringCoordinator concurrentFilteringCoordinator) {
        this.Y.remove(concurrentFilteringCoordinator);
        this.B.clear();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'G' || c == 'j' || c == '\u00a2' || c == '\u00eb') {
                field = MultiLayeredCompositeResolver.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'G' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultiLayeredCompositeResolver.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MultiLayeredCompositeResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MultiLayeredCompositeResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

