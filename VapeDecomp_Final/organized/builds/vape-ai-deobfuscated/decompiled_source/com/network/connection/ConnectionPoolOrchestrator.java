/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import a.fO;
import a.wj;
import a.ws;
import com.app.cluster.management.ClusterNodeRegistrar;
import com.app.events.EventDispatchCoordinator1689;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.tasks.BackgroundTaskManager;
import com.core.computation.AbstractComputationKernel;
import com.data.streaming.DataStreamProcessor1881;
import com.distributed.cache.DistributedCacheOrchestrator;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.finance.risk.FinancialRiskCalculator;
import com.graphics.theme.GraphicalThemeRenderer;
import com.network.communication.NetworkCommunicationBroker;
import com.performance.caching.CacheInvalidationStrategy2674;
import com.security.network.SecureChannelNegotiator;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ConnectionPoolOrchestrator
extends AbstractComputationKernel {
    private static final Integer[] D;
    private static final String[] V;
    private GraphicalThemeRenderer E;
    private List<CacheInvalidationStrategy2674> v;
    private static final long[] B;
    private GraphicalThemeRenderer b;
    private static final long n;
    private static final Object[] L;
    private static final Map F;
    private GraphicalThemeRenderer R;

    private static Method h(long l, long l2) {
        int n = ConnectionPoolOrchestrator.e(l, l2);
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
                String string2 = V[n];
                int n3 = string2.indexOf(8);
                clazz3 = ConnectionPoolOrchestrator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConnectionPoolOrchestrator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConnectionPoolOrchestrator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConnectionPoolOrchestrator.L[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConnectionPoolOrchestrator.f(216694226098665L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConnectionPoolOrchestrator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConnectionPoolOrchestrator.L[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConnectionPoolOrchestrator.f(216694226098665L, 0L);
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

    public ConnectionPoolOrchestrator() {
        long l = n ^ 0x2B70DC9141E2L;
        this.b = new GraphicalThemeRenderer((String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)12568, (long)(0x6DD7BB186DA1DA96L ^ l)), (long)-5822742674819250967L, (long)l)), 0.8);
        this.v = new ArrayList<CacheInvalidationStrategy2674>();
        this.Q(ConnectionPoolOrchestrator.M.W);
        this.R = new DataStreamProcessor1881(this, (String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)4008, (long)(0x5A484705B801E421L ^ l)), (long)-5822742674819250967L, (long)l)), 0.75);
        this.E = new BackgroundTaskManager(this, (String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)11355, (long)(0x26AA0D951B47DCL ^ l)), (long)-5822742674819250967L, (long)l)), 0.6);
        this.E.N(new EventDispatchCoordinator1689(this));
        this.E.g((String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)2906, (long)(0x603CE490B8960D1L ^ l)), (long)-5822742674819250967L, (long)l)));
        this.R.N(ConnectionPoolOrchestrator::lambda$new$0);
        this.b.N(new ClusterNodeRegistrar(this));
        this.b.g((String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)19164, (long)(0x603CEF36E7C62150L ^ l)), (long)-5822742674819250967L, (long)l)));
        this.o(this.R, this.b, this.E);
        this.v.add(new CacheInvalidationStrategy2674((String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)1360, (long)(0xCA790A9AD87EED6L ^ l)), (long)-5822742674819250967L, (long)l)), GraphicalRenderingController.D(wj.class), 5));
        this.v.add(new CacheInvalidationStrategy2674((String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)30908, (long)(0x5490318930FC1331L ^ l)), (long)-5822742674819250967L, (long)l)), GraphicalRenderingController.D(ws.class), 6));
        this.v.add(new CacheInvalidationStrategy2674((String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)3888, (long)(0x5B702981EE4EE4BAL ^ l)), (long)-5822742674819250967L, (long)l)), GraphicalRenderingController.D(FinancialRiskCalculator.class), 6));
        this.v.add(new CacheInvalidationStrategy2674((String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)583, (long)(0x6BBF768C406C69CFL ^ l)), (long)-5822742674819250967L, (long)l)), GraphicalRenderingController.D(SecureChannelNegotiator.class), 7));
        this.v.add(new CacheInvalidationStrategy2674((String)((Object)ConnectionPoolOrchestrator.c("V", (int)ConnectionPoolOrchestrator.b("k", (int)28344, (long)(0x7C40786A110E0537L ^ l)), (long)-5822742674819250967L, (long)l)), GraphicalRenderingController.D(NetworkCommunicationBroker.class), 7));
    }

    @Override
    public void U() {
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x44BE;
        if (D[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = B[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])F.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    F.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bn", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConnectionPoolOrchestrator.D[n2] = n3;
        }
        return D[n2];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == 'v' || c == 'E' || c == 'K') {
                field = ConnectionPoolOrchestrator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConnectionPoolOrchestrator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConnectionPoolOrchestrator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = L;
        L[0] = "\u001c\u0010L";
        objectArray[1] = Integer.TYPE;
        ConnectionPoolOrchestrator.V[1] = "java/lang/Integer";
        objectArray[2] = "G4\u001ac\u0014\u0017L;\u000b,i\u000f_<\u0002e";
        objectArray[3] = "hQ$==%c^5r\\+hU1(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Gq\u0001.,<\u0011+\u0003N,\" rB5>;F!F(.Y\u0019)\u0012\u007f&(B(\u0002+G";
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConnectionPoolOrchestrator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public double e() {
        return 110.0;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ConnectionPoolOrchestrator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConnectionPoolOrchestrator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConnectionPoolOrchestrator.e(l, l2);
            object = L[n];
            try {
                if (!(object instanceof String)) break block2;
                ConnectionPoolOrchestrator.L[n] = clazz = Class.forName(V[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ConnectionPoolOrchestrator.n = MultiContainerRegistry.a(7963236022709190998L, -1663723843245567155L, MethodHandles.lookup().lookupClass()).a(264916958540316L);
                ConnectionPoolOrchestrator.L = new Object[5];
                ConnectionPoolOrchestrator.V = new String[5];
                ConnectionPoolOrchestrator.a();
                ConnectionPoolOrchestrator.F = new HashMap<K, V>(13);
                var0 = ConnectionPoolOrchestrator.n ^ 130436797557331L;
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
                var6_5 = "\u0003\u00a2\u00a7F\u0006HK\u00e7\u00b3\u009d\u00b2s\u0082\u001cZ\u00c65v3#\u00119\u00df=r\u00b1\u001c\u00cc\u00ee3\u00af\u00ca\u00f2\u008a:\u0018\u000f\u00ed\u00d7;\u008f\u00e3\u0086K\u0095\u00b2;e \u00fd\u00f1\u000b\u0013\u00c7\u00a3\u00f4z\u0013BA`UK\u00e2";
                var7_6 = "\u0003\u00a2\u00a7F\u0006HK\u00e7\u00b3\u009d\u00b2s\u0082\u001cZ\u00c65v3#\u00119\u00df=r\u00b1\u001c\u00cc\u00ee3\u00af\u00ca\u00f2\u008a:\u0018\u000f\u00ed\u00d7;\u008f\u00e3\u0086K\u0095\u00b2;e \u00fd\u00f1\u000b\u0013\u00c7\u00a3\u00f4z\u0013BA`UK\u00e2".length();
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
                    var6_5 = ";\u0092\u00da2\u00cam\u00d4\u0016\u00aa\u00fcI\u0083c9bi";
                    var7_6 = ";\u0092\u00da2\u00cam\u00d4\u0016\u00aa\u00fcI\u0083c9bi".length();
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
        ConnectionPoolOrchestrator.B = var8_3;
        ConnectionPoolOrchestrator.D = new Integer[10];
    }

    private static Field g(long l, long l2) {
        int n = ConnectionPoolOrchestrator.e(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            String string = V[n];
            int n2 = string.indexOf(8);
            Class clazz = ConnectionPoolOrchestrator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConnectionPoolOrchestrator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConnectionPoolOrchestrator.c(clazz3, string2, clazz2)) != null) {
                    ConnectionPoolOrchestrator.L[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConnectionPoolOrchestrator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConnectionPoolOrchestrator.L[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConnectionPoolOrchestrator.f(216694226098665L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void G() {
        Color color;
        GraphicalThemeRenderer graphicalThemeRenderer;
        block16: {
            block14: {
                block15: {
                    Color color2;
                    GraphicalThemeRenderer graphicalThemeRenderer2;
                    block13: {
                        block11: {
                            block12: {
                                try {
                                    try {
                                        ConfigurationManager.A(this.G(), this.W(), this.w(), this.b(), this.l());
                                        this.R.b(this.G() + 3.0);
                                        this.R.M(this.W());
                                        this.R.w(this.b());
                                        this.b.b(this.G() + this.w() - 32.0);
                                        this.b.M(this.W());
                                        this.b.w(this.b());
                                        graphicalThemeRenderer2 = this.b;
                                        if (!GraphicalRenderingController.D(fO.class).f()) break block11;
                                        if (!this.b.s()) break block12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ConnectionPoolOrchestrator.a(customSystemException);
                                    }
                                    color2 = ConnectionPoolOrchestrator.M.I;
                                    break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ConnectionPoolOrchestrator.a(customSystemException);
                                }
                            }
                            color2 = ConnectionPoolOrchestrator.M.o;
                            break block13;
                        }
                        color2 = null;
                    }
                    graphicalThemeRenderer2.h(color2);
                    this.E.b(this.G() + this.w() - 18.0);
                    this.E.M(this.W());
                    this.E.w(this.b());
                    boolean bl = false;
                    double d2 = this.W() + this.b() / 2.0;
                    double d3 = (float)(this.G() + this.w() - 17.5 - 8.0);
                    for (CacheInvalidationStrategy2674 cacheInvalidationStrategy2674 : this.v) {
                        try {
                            if (cacheInvalidationStrategy2674.Z == null || !cacheInvalidationStrategy2674.Z.f()) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConnectionPoolOrchestrator.a(customSystemException);
                        }
                        ConfigurationManager.x(cacheInvalidationStrategy2674.j, d3, d2, cacheInvalidationStrategy2674.T, cacheInvalidationStrategy2674.T, ConnectionPoolOrchestrator.M.Z);
                        bl = true;
                        d3 -= (double)(5.0f + (float)cacheInvalidationStrategy2674.T);
                    }
                    try {
                        try {
                            graphicalThemeRenderer = this.E;
                            if (!bl) break block14;
                            if (!this.E.s()) break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConnectionPoolOrchestrator.a(customSystemException);
                        }
                        color = EventDispatchCoordinator1159.P(M.j(), 10.0);
                        break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConnectionPoolOrchestrator.a(customSystemException);
                    }
                }
                color = M.j();
                break block16;
            }
            color = null;
        }
        graphicalThemeRenderer.h(color);
    }

    @Override
    public double z() {
        return 18.0;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConnectionPoolOrchestrator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConnectionPoolOrchestrator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (V[n4] != null) {
            return n4;
        }
        Object object = L[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 62;
                break;
            }
            case 1: {
                n3 = 19;
                break;
            }
            case 2: {
                n3 = 8;
                break;
            }
            case 3: {
                n3 = 63;
                break;
            }
            case 4: {
                n3 = 13;
                break;
            }
            case 5: {
                n3 = 14;
                break;
            }
            case 6: {
                n3 = 22;
                break;
            }
            case 7: {
                n3 = 40;
                break;
            }
            case 8: {
                n3 = 54;
                break;
            }
            case 9: {
                n3 = 56;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 61;
                break;
            }
            case 12: {
                n3 = 44;
                break;
            }
            case 13: {
                n3 = 24;
                break;
            }
            case 14: {
                n3 = 35;
                break;
            }
            case 15: {
                n3 = 59;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 12;
                break;
            }
            case 18: {
                n3 = 26;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 34;
                break;
            }
            case 21: {
                n3 = 49;
                break;
            }
            case 22: {
                n3 = 20;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 58;
                break;
            }
            case 25: {
                n3 = 25;
                break;
            }
            case 26: {
                n3 = 18;
                break;
            }
            case 27: {
                n3 = 45;
                break;
            }
            case 28: {
                n3 = 55;
                break;
            }
            case 29: {
                n3 = 31;
                break;
            }
            case 30: {
                n3 = 7;
                break;
            }
            case 31: {
                n3 = 6;
                break;
            }
            case 32: {
                n3 = 15;
                break;
            }
            case 33: {
                n3 = 52;
                break;
            }
            case 34: {
                n3 = 43;
                break;
            }
            case 35: {
                n3 = 27;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 17;
                break;
            }
            case 38: {
                n3 = 42;
                break;
            }
            case 39: {
                n3 = 48;
                break;
            }
            case 40: {
                n3 = 47;
                break;
            }
            case 41: {
                n3 = 53;
                break;
            }
            case 42: {
                n3 = 38;
                break;
            }
            case 43: {
                n3 = 46;
                break;
            }
            case 44: {
                n3 = 5;
                break;
            }
            case 45: {
                n3 = 23;
                break;
            }
            case 46: {
                n3 = 11;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 41;
                break;
            }
            case 49: {
                n3 = 32;
                break;
            }
            case 50: {
                n3 = 10;
                break;
            }
            case 51: {
                n3 = 9;
                break;
            }
            case 52: {
                n3 = 57;
                break;
            }
            case 53: {
                n3 = 50;
                break;
            }
            case 54: {
                n3 = 37;
                break;
            }
            case 55: {
                n3 = 33;
                break;
            }
            case 56: {
                n3 = 30;
                break;
            }
            case 57: {
                n3 = 0;
                break;
            }
            case 58: {
                n3 = 29;
                break;
            }
            case 59: {
                n3 = 3;
                break;
            }
            case 60: {
                n3 = 2;
                break;
            }
            case 61: {
                n3 = 1;
                break;
            }
            case 62: {
                n3 = 16;
                break;
            }
            default: {
                n3 = 60;
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
        ConnectionPoolOrchestrator.V[n4] = new String(cArray);
        return n4;
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

    private static void lambda$new$0() {
        DistributedCacheOrchestrator.kW.D(false);
    }

    @Override
    public void g() {
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public GraphicalThemeRenderer A() {
        return this.E;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConnectionPoolOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ConnectionPoolOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

