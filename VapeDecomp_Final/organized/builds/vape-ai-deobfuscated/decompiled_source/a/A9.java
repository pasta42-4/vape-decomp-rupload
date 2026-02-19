/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 */
package a;

import a.KB;
import a.Ne;
import a.a;
import a.oQ;
import com.app.concurrency.ThreadPoolConfigManager;
import com.app.ui.theming.StylesheetThemeManager;
import com.asset.management.AssetLifecycleManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.deobfuscation.strategy.ExecutionStrategy;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.core.NetworkConnectionManager2538;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.transaction.core.BaseTransactionProcessor;
import com.validation.core.ObjectValidator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public class A9
extends ContextualExecutionFramework {
    private static final Integer[] j;
    private final List<Integer> B;
    private IntBuffer Y;
    private final BaseTransactionProcessor x;
    private final List<Integer> L;
    private final StylesheetThemeManager Z;
    private static final Map m;
    private static final long b;
    private final AuthenticationStateTracker l;
    private static final String[] r;
    private final AuthenticationStateTracker n;
    private final NumericComputationEngine1131 t;
    private FloatBuffer G;
    private final AuthenticationStateTracker X;
    private static final Object[] o;
    private static final long[] d;
    private final StylesheetThemeManager e;
    private final AssetLifecycleManager O;
    private final AuthenticationStateTracker V;
    private final StylesheetThemeManager P;
    private final List<Float> w;
    private final AuthenticationStateTracker h;
    private IntBuffer N;

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

    public A9() {
        long l = b ^ 0x3E2B5E06D232L;
        super(a.cs((int)A9.a("y", (int)11533, (long)(0x68E38D444181A5D3L ^ l))), (int)A9.a("y", (int)13119, (long)(0x36719AD7FC143BEFL ^ l)), RecursiveNodeGraph.z, a.cs((int)A9.a("y", (int)7363, (long)(0x222D880F107F1412L ^ l))));
        this.O = new AssetLifecycleManager();
        this.x = new BaseTransactionProcessor();
        this.Z = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.EH), new Color(173, 12, 255));
        this.P = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.El), new Color(255, 238, 154));
        this.e = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.P3), new Color(255, 255, 255));
        this.l = AuthenticationStateTracker.w(this, (String)((Object)A9.c("\u00b5", (int)A9.a("y", (int)24643, (long)(0x7CA565F33EE4E89CL ^ l)), (long)3858826958819619858L, (long)l)), true);
        this.V = AuthenticationStateTracker.w(this, (String)((Object)A9.c("\u00b5", (int)A9.a("y", (int)13069, (long)(0x2754660BE463BDFL ^ l)), (long)3858826958819619858L, (long)l)), true);
        this.X = AuthenticationStateTracker.w(this, (String)((Object)A9.c("\u00b5", (int)A9.a("y", (int)7114, (long)(0x2626286D7971131FL ^ l)), (long)3858826958819619858L, (long)l)), false);
        this.h = AuthenticationStateTracker.w(this, (String)((Object)A9.c("\u00b5", (int)A9.a("y", (int)15064, (long)(0x67A7DD562A78B204L ^ l)), (long)3858826958819619858L, (long)l)), false);
        this.n = AuthenticationStateTracker.w(this, (String)((Object)A9.c("\u00b5", (int)A9.a("y", (int)13854, (long)(0x4220D6CD86CD3EC3L ^ l)), (long)3858826958819619858L, (long)l)), false);
        this.w = new ArrayList<Float>();
        this.B = new ArrayList<Integer>();
        this.L = new ArrayList<Integer>();
        this.G = null;
        this.Y = null;
        this.N = null;
        this.t = ApplicationLifecycleManager.r();
        this.N(this.l, this.V, this.X, this.h, this.n);
    }

    private void l(double d2, double d3, double d4, Color color) {
        double d5 = NumericComputationEngine1131.b();
        double d6 = NumericComputationEngine1131.S();
        double d7 = NumericComputationEngine1131.n();
        this.w.add(Float.valueOf((float)(d2 - d5)));
        this.w.add(Float.valueOf((float)(d3 - d6)));
        this.w.add(Float.valueOf((float)(d4 - d7)));
        this.w.add(Float.valueOf((float)color.getRed() / 255.0f));
        this.w.add(Float.valueOf((float)color.getGreen() / 255.0f));
        this.w.add(Float.valueOf((float)color.getBlue() / 255.0f));
        this.w.add(Float.valueOf((float)color.getAlpha() / 255.0f));
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = A9.a(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                A9.o[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void A(NetworkConnectionManager2538 networkConnectionManager2538, ExecutionStrategy executionStrategy) {
        try {
            if (!networkConnectionManager2538.B(ReflectionMetadataResolver.a)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        int n = this.w.size() / 7;
        Color color = executionStrategy.E(networkConnectionManager2538.M());
        if (color == null) {
            color = new Color(255, 255, 255);
        }
        this.l(networkConnectionManager2538.F(), networkConnectionManager2538.V(), networkConnectionManager2538.B(), color);
        double d2 = networkConnectionManager2538.F();
        double d3 = networkConnectionManager2538.V();
        double d4 = networkConnectionManager2538.B();
        double d5 = networkConnectionManager2538.G();
        double d6 = networkConnectionManager2538.x();
        double d7 = networkConnectionManager2538.o();
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        while (true) {
            double d8;
            double d9;
            double d10;
            double d11;
            double d12;
            double d13;
            block37: {
                NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                block36: {
                    ContextualEventDispatcher contextualEventDispatcher;
                    ContextualEventDispatcher contextualEventDispatcher2;
                    oQ oQ2;
                    block35: {
                        block34: {
                            float f = executionStrategy.r();
                            float f2 = executionStrategy.Y();
                            oQ2 = oQ.E(d2 - (double)f, d3, d4 - (double)f, d2 + (double)f, d3 + (double)f2, d4 + (double)f);
                            contextualEventDispatcher2 = ContextualEventDispatcher.N(d2, d3, d4);
                            contextualEventDispatcher = ContextualEventDispatcher.N(d2 + d5, d3 + d6, d4 + d7);
                            networkPacketInterceptor1107 = connectionConfigurationResolver.g(contextualEventDispatcher2, contextualEventDispatcher, false, networkConnectionManager2538.B(ReflectionMetadataResolver.UL), false, networkConnectionManager2538);
                            try {
                                if (GeometryCalculator.C() < 35) break block34;
                                if (networkPacketInterceptor1107.q().equals(ObjectValidator.u())) break block35;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw A9.a(customSystemException);
                            }
                            contextualEventDispatcher = ContextualEventDispatcher.N(networkPacketInterceptor1107.i().X(), networkPacketInterceptor1107.i().F(), networkPacketInterceptor1107.i().f());
                            break block35;
                        }
                        if (networkPacketInterceptor1107.r()) {
                            contextualEventDispatcher = ContextualEventDispatcher.N(networkPacketInterceptor1107.i().X(), networkPacketInterceptor1107.i().F(), networkPacketInterceptor1107.i().f());
                        }
                    }
                    List list = connectionConfigurationResolver.R(systemConfigurationOrchestrator, oQ2.r(d5, d6, d7).B(1.0, 1.0, 1.0));
                    double d14 = 0.0;
                    for (Object e : list) {
                        CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
                        try {
                            try {
                                try {
                                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut) || cryptographicTransformer.B(ReflectionMetadataResolver.tD)) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw A9.a(customSystemException);
                                }
                                if (!cryptographicTransformer.m()) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw A9.a(customSystemException);
                            }
                            if (cryptographicTransformer.equals(systemConfigurationOrchestrator)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A9.a(customSystemException);
                        }
                        oQ2 = cryptographicTransformer.L().B(0.3, 0.3, 0.3);
                        NetworkPacketInterceptor1107 networkPacketInterceptor11072 = oQ2.x(contextualEventDispatcher2, contextualEventDispatcher);
                        if (!networkPacketInterceptor11072.r()) continue;
                        double d15 = contextualEventDispatcher2.x(networkPacketInterceptor11072.i());
                        try {
                            if (d14 != 0.0 && !(d15 < d14)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A9.a(customSystemException);
                        }
                        d14 = d15;
                        networkPacketInterceptor11072.s(cryptographicTransformer);
                        networkPacketInterceptor1107 = networkPacketInterceptor11072;
                    }
                    d2 += d5;
                    d3 += d6;
                    d4 += d7;
                    try {
                        try {
                            if (GeometryCalculator.C() < 35) break block36;
                            if (!networkPacketInterceptor1107.q().equals(ObjectValidator.u())) {
                                break;
                            }
                            break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A9.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw A9.a(customSystemException);
                    }
                }
                try {
                    if (networkPacketInterceptor1107.r()) {
                        break;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw A9.a(customSystemException);
                }
            }
            try {
                if (d3 < -128.0) {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw A9.a(customSystemException);
            }
            try {
                d13 = d5;
                d12 = networkConnectionManager2538.F() ? 0.8 : 0.99;
            }
            catch (CustomSystemException customSystemException) {
                throw A9.a(customSystemException);
            }
            d5 = d13 * d12;
            try {
                d11 = d6;
                d10 = networkConnectionManager2538.F() ? 0.8 : 0.99;
            }
            catch (CustomSystemException customSystemException) {
                throw A9.a(customSystemException);
            }
            d6 = d11 * d10;
            try {
                d9 = d7;
                d8 = networkConnectionManager2538.F() ? 0.8 : 0.99;
            }
            catch (CustomSystemException customSystemException) {
                throw A9.a(customSystemException);
            }
            d7 = d9 * d8;
            this.l(d2 + d5, d3 + (d6 -= 0.05), d4 + d7, color);
        }
        int n2 = this.w.size() / 7 - n;
        this.B.add(n);
        this.L.add(n2);
    }

    private ExecutionStrategy x(NetworkConnectionManager2538 networkConnectionManager2538) {
        block10: {
            try {
                if (networkConnectionManager2538.j()) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw A9.a(customSystemException);
            }
            try {
                try {
                    if (networkConnectionManager2538.F() != networkConnectionManager2538.b() || networkConnectionManager2538.B() != networkConnectionManager2538.I()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw A9.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw A9.a(customSystemException);
            }
        }
        for (ExecutionStrategy executionStrategy : this.l()) {
            try {
                if (!executionStrategy.D(networkConnectionManager2538)) continue;
                return executionStrategy;
            }
            catch (CustomSystemException customSystemException) {
                throw A9.a(customSystemException);
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = A9.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = A9.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = A9.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = A9.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        A9.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = A9.b(270809475919050L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = A9.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        A9.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = A9.b(270809475919050L, 0L);
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

    private void q() {
        try {
            if (this.w.size() < 14) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        int n = 7;
        block6: for (int i = 0; i < this.B.size(); ++i) {
            int n2;
            int n3 = n2 = this.B.get(i) * n;
            while (true) {
                try {
                    try {
                        if (n3 >= this.L.get(i) * n + n2 || n3 + n + 1 > this.L.get(i) * n + n2) {
                            continue block6;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw A9.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw A9.a(customSystemException);
                }
                Color color = new Color(this.w.get(n3 + 3).floatValue(), this.w.get(n3 + 4).floatValue(), this.w.get(n3 + 5).floatValue(), this.w.get(n3 + 6).floatValue());
                float f = this.w.get(n3).floatValue();
                float f2 = this.w.get(n3 + 1).floatValue();
                float f3 = this.w.get(n3 + 2).floatValue();
                float f4 = this.w.get(n3 + 7).floatValue();
                float f5 = this.w.get(n3 + 8).floatValue();
                float f6 = this.w.get(n3 + 9).floatValue();
                DataFlowAnalyzer.D(f, f2, f3, f4, f5, f6, 1.5f, color);
                n3 += n;
            }
        }
    }

    private static void a() {
        Object[] objectArray = o;
        o[0] = "/gM";
        objectArray[1] = Integer.TYPE;
        A9.r[1] = "java/lang/Integer";
        objectArray[2] = "q\u001c*\u001c\u0012\u0003z\u0013;So\u001bi\u00142\u001a";
        objectArray[3] = "BK%2\u0016EID4}wKBO0'";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\tq.TD/Dhr8\u001fd43qJEcPc=\bH\u001f\rz|\u0006\u0017|\ro!]t";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                A9.b = MultiContainerRegistry.a(6461146612422932696L, 6008594107359351838L, MethodHandles.lookup().lookupClass()).a(49614297342955L);
                A9.o = new Object[5];
                A9.r = new String[5];
                A9.a();
                A9.m = new HashMap<K, V>(13);
                var0 = A9.b ^ 15465521400354L;
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
                var6_5 = "S\u00d3\u00ef\u00c2\u007f\u009e|@\u00db\u00d0OK\u0096<\u0003\u00a2\u00be\u0012\u00e2^\u00f1\u00e84\u00b4\u00e3Nu>\u0000\u00fc\u00f01}c\n,N\u00d1]\u0013/R\b\u00d3\u0010p[\u00009\u00c8*\u0086\u00a7G\u00ad\u00e2\u00f7\u00d5\u00c7L\u00aa\u00ca3\u00cfH\u001b\u00810\u00d4\u00a8w7\\]H\u00ee\u0083\u00eei\u00bb";
                var7_6 = "S\u00d3\u00ef\u00c2\u007f\u009e|@\u00db\u00d0OK\u0096<\u0003\u00a2\u00be\u0012\u00e2^\u00f1\u00e84\u00b4\u00e3Nu>\u0000\u00fc\u00f01}c\n,N\u00d1]\u0013/R\b\u00d3\u0010p[\u00009\u00c8*\u0086\u00a7G\u00ad\u00e2\u00f7\u00d5\u00c7L\u00aa\u00ca3\u00cfH\u001b\u00810\u00d4\u00a8w7\\]H\u00ee\u0083\u00eei\u00bb".length();
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
                    var6_5 = "\u00dd\u0084\u00bcz\u00bc\u0003vDf\u00d1\u0080\u00d8m5\u0003Q";
                    var7_6 = "\u00dd\u0084\u00bcz\u00bc\u0003vDf\u00d1\u0080\u00d8m5\u0003Q".length();
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
        A9.d = var8_3;
        A9.j = new Integer[12];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = A9.a(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = A9.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = A9.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = A9.a(clazz3, string2, clazz2)) != null) {
                    A9.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = A9.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        A9.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = A9.b(270809475919050L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void D(KB kB) {
        this.w.clear();
        this.B.clear();
        this.L.clear();
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        try {
            if (connectionConfigurationResolver.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        for (Object e : connectionConfigurationResolver.f()) {
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
            if (!cryptographicTransformer.B(ReflectionMetadataResolver.a)) continue;
            ThreadPoolConfigManager threadPoolConfigManager = new ThreadPoolConfigManager(cryptographicTransformer.M());
            NetworkConnectionManager2538 networkConnectionManager2538 = new NetworkConnectionManager2538(cryptographicTransformer.M());
            ExecutionStrategy executionStrategy = this.x(threadPoolConfigManager);
            try {
                if (executionStrategy == null) continue;
                this.A(networkConnectionManager2538, executionStrategy);
            }
            catch (CustomSystemException customSystemException) {
                throw A9.a(customSystemException);
            }
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = A9.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3D58;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/A9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            A9.j[n2] = n3;
        }
        return j[n2];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = A9.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = A9.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private List<ExecutionStrategy> l() {
        ArrayList<ExecutionStrategy> arrayList = new ArrayList<ExecutionStrategy>();
        try {
            if (this.l.s().booleanValue()) {
                arrayList.add(this.O);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        try {
            if (this.X.s().booleanValue()) {
                arrayList.add(this.x);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        try {
            if (this.V.s().booleanValue()) {
                arrayList.add(this.Z);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        try {
            if (this.h.s().booleanValue()) {
                arrayList.add(this.P);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        try {
            if (this.n.s().booleanValue()) {
                arrayList.add(this.e);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        return arrayList;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'I' || c == 'x' || c == 'O' || c == '\u00c7') {
                field = A9.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'I' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = A9.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void f() {
        int n;
        long l;
        block21: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                l = b ^ 0x214D3A769421L;
                                try {
                                    try {
                                        if (this.G != null && this.G.capacity() >= this.w.size()) break block16;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw A9.a(customSystemException);
                                    }
                                    this.G = BufferUtils.createFloatBuffer((int)this.w.size());
                                    break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw A9.a(customSystemException);
                                }
                            }
                            this.G.clear();
                        }
                        for (Float comparable2 : this.w) {
                            this.G.put(comparable2.floatValue());
                        }
                        this.G.flip();
                        GL11.glEnableClientState((int)A9.a("y", (int)21155, (long)(0x782169298EAC1C63L ^ l)));
                        GL11.glEnableClientState((int)A9.a("y", (int)12482, (long)(0x611F6B268A5B7E06L ^ l)));
                        int n2 = 28;
                        FloatBuffer floatBuffer = this.G.duplicate();
                        floatBuffer.position(0);
                        GL11.glVertexPointer((int)3, (int)n2, (FloatBuffer)floatBuffer);
                        FloatBuffer floatBuffer2 = this.G.duplicate();
                        floatBuffer2.position(3);
                        GL11.glColorPointer((int)4, (int)n2, (FloatBuffer)floatBuffer2);
                        n = this.B.size();
                        try {
                            try {
                                if (this.Y != null && this.Y.capacity() >= n) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw A9.a(customSystemException);
                            }
                            this.Y = BufferUtils.createIntBuffer((int)n);
                            break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A9.a(customSystemException);
                        }
                    }
                    this.Y.clear();
                }
                try {
                    try {
                        if (this.N != null && this.N.capacity() >= n) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw A9.a(customSystemException);
                    }
                    this.N = BufferUtils.createIntBuffer((int)n);
                    break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw A9.a(customSystemException);
                }
            }
            this.N.clear();
        }
        try {
            for (int i = 0; i < n; ++i) {
                this.Y.put(this.B.get(i));
                this.N.put(this.L.get(i));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        this.Y.flip();
        this.N.flip();
        GL14.glMultiDrawArrays((int)3, (IntBuffer)this.Y, (IntBuffer)this.N);
        GL11.glDisableClientState((int)A9.a("y", (int)24330, (long)(0x520DAE11C6F091CFL ^ l)));
        GL11.glDisableClientState((int)A9.a("y", (int)8943, (long)(0x72FF22ECFD3F6C28L ^ l)));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = A9.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = A9.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = A9.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void h(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        boolean bl;
        block12: {
            block11: {
                try {
                    if (this.w.isEmpty()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw A9.a(customSystemException);
                }
                Ne.h.h(1.5f);
                Ne.h.y(2848);
                bl = Ne.h.k(3042);
                try {
                    if (!bl) {
                        Ne.h.y(3042);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw A9.a(customSystemException);
                }
                try {
                    Ne.h.z(3553);
                    Ne.h.z(2929);
                    CryptoContextNegotiator684.Y();
                    if (!ConfigurationManager.U()) break block11;
                    this.q();
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw A9.a(customSystemException);
                }
            }
            this.f();
        }
        try {
            CryptoContextNegotiator684.J();
            Ne.h.z(2848);
            if (!bl) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A9.a(customSystemException);
        }
        Ne.h.y(3553);
        Ne.h.y(2929);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n4] != null) {
            return n4;
        }
        Object object = o[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 10;
                break;
            }
            case 1: {
                n3 = 44;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 52;
                break;
            }
            case 5: {
                n3 = 45;
                break;
            }
            case 6: {
                n3 = 55;
                break;
            }
            case 7: {
                n3 = 7;
                break;
            }
            case 8: {
                n3 = 57;
                break;
            }
            case 9: {
                n3 = 15;
                break;
            }
            case 10: {
                n3 = 0;
                break;
            }
            case 11: {
                n3 = 48;
                break;
            }
            case 12: {
                n3 = 12;
                break;
            }
            case 13: {
                n3 = 53;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 30;
                break;
            }
            case 16: {
                n3 = 61;
                break;
            }
            case 17: {
                n3 = 5;
                break;
            }
            case 18: {
                n3 = 14;
                break;
            }
            case 19: {
                n3 = 24;
                break;
            }
            case 20: {
                n3 = 62;
                break;
            }
            case 21: {
                n3 = 11;
                break;
            }
            case 22: {
                n3 = 56;
                break;
            }
            case 23: {
                n3 = 54;
                break;
            }
            case 24: {
                n3 = 31;
                break;
            }
            case 25: {
                n3 = 36;
                break;
            }
            case 26: {
                n3 = 29;
                break;
            }
            case 27: {
                n3 = 46;
                break;
            }
            case 28: {
                n3 = 6;
                break;
            }
            case 29: {
                n3 = 32;
                break;
            }
            case 30: {
                n3 = 59;
                break;
            }
            case 31: {
                n3 = 9;
                break;
            }
            case 32: {
                n3 = 20;
                break;
            }
            case 33: {
                n3 = 41;
                break;
            }
            case 34: {
                n3 = 58;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 42;
                break;
            }
            case 37: {
                n3 = 22;
                break;
            }
            case 38: {
                n3 = 49;
                break;
            }
            case 39: {
                n3 = 1;
                break;
            }
            case 40: {
                n3 = 38;
                break;
            }
            case 41: {
                n3 = 25;
                break;
            }
            case 42: {
                n3 = 23;
                break;
            }
            case 43: {
                n3 = 4;
                break;
            }
            case 44: {
                n3 = 27;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 35;
                break;
            }
            case 47: {
                n3 = 60;
                break;
            }
            case 48: {
                n3 = 40;
                break;
            }
            case 49: {
                n3 = 2;
                break;
            }
            case 50: {
                n3 = 26;
                break;
            }
            case 51: {
                n3 = 8;
                break;
            }
            case 52: {
                n3 = 19;
                break;
            }
            case 53: {
                n3 = 51;
                break;
            }
            case 54: {
                n3 = 37;
                break;
            }
            case 55: {
                n3 = 63;
                break;
            }
            case 56: {
                n3 = 43;
                break;
            }
            case 57: {
                n3 = 17;
                break;
            }
            case 58: {
                n3 = 21;
                break;
            }
            case 59: {
                n3 = 28;
                break;
            }
            case 60: {
                n3 = 39;
                break;
            }
            case 61: {
                n3 = 33;
                break;
            }
            case 62: {
                n3 = 50;
                break;
            }
            default: {
                n3 = 47;
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
        A9.r[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(A9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(A9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

