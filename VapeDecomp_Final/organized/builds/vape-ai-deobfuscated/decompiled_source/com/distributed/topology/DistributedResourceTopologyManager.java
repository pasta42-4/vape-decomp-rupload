/*
 * Decompiled with CFR 0.152.
 */
package com.distributed.topology;

import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.workflow.StateTrackingCoordinator;
import com.asset.management.AssetOrchestrator;
import com.collections.management.MultiContainerRegistry;
import com.configuration.management.ConfigurationParameterResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.input.GameInputController;
import com.math.geometry.GeometryCalculator;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.resource.management.AssetIntegrationManager;
import com.runtime.mediation.RuntimeContextMediator;
import com.runtime.memory.MemoryResourceAllocator;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.queued.QueuedCipherExecutor;
import com.system.configuration.ConfigurationManager;
import com.system.monitoring.ExecutionStateTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.input.UserInputEventMapper;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DistributedResourceTopologyManager
extends RuntimeContextMediator {
    private final AssetOrchestrator wn;
    public QueuedCipherExecutor wq;
    private final AssetOrchestrator wf;
    private final AssetOrchestrator w4;
    private static final long[] vb;
    private static final String[] Jb;
    private final AssetOrchestrator w6;
    private static final Map xb;
    private MemoryResourceAllocator wH;
    private ArrayList<AssetOrchestrator> wM;
    private final AssetOrchestrator w3;
    private final AssetOrchestrator wE;
    private final AssetOrchestrator wy;
    private static final long fb;
    private static final Object[] Ib;
    private ExecutionStateTracker wi = ApplicationLifecycleManager.N();
    private boolean wF = false;
    private static final Integer[] wb;

    private static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DistributedResourceTopologyManager.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DistributedResourceTopologyManager.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int f(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x75D9;
        if (wb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = vb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])xb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    xb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DistributedResourceTopologyManager.wb[n2] = n3;
        }
        return wb[n2];
    }

    private static int u(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Jb[n4] != null) {
            return n4;
        }
        Object object = Ib[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 59;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 53;
                break;
            }
            case 3: {
                n3 = 19;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 54;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 33;
                break;
            }
            case 8: {
                n3 = 32;
                break;
            }
            case 9: {
                n3 = 13;
                break;
            }
            case 10: {
                n3 = 30;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 18;
                break;
            }
            case 14: {
                n3 = 51;
                break;
            }
            case 15: {
                n3 = 3;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 9;
                break;
            }
            case 18: {
                n3 = 58;
                break;
            }
            case 19: {
                n3 = 44;
                break;
            }
            case 20: {
                n3 = 42;
                break;
            }
            case 21: {
                n3 = 0;
                break;
            }
            case 22: {
                n3 = 24;
                break;
            }
            case 23: {
                n3 = 60;
                break;
            }
            case 24: {
                n3 = 31;
                break;
            }
            case 25: {
                n3 = 45;
                break;
            }
            case 26: {
                n3 = 21;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 10;
                break;
            }
            case 29: {
                n3 = 7;
                break;
            }
            case 30: {
                n3 = 40;
                break;
            }
            case 31: {
                n3 = 61;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 20;
                break;
            }
            case 35: {
                n3 = 16;
                break;
            }
            case 36: {
                n3 = 52;
                break;
            }
            case 37: {
                n3 = 36;
                break;
            }
            case 38: {
                n3 = 34;
                break;
            }
            case 39: {
                n3 = 41;
                break;
            }
            case 40: {
                n3 = 26;
                break;
            }
            case 41: {
                n3 = 56;
                break;
            }
            case 42: {
                n3 = 55;
                break;
            }
            case 43: {
                n3 = 17;
                break;
            }
            case 44: {
                n3 = 35;
                break;
            }
            case 45: {
                n3 = 63;
                break;
            }
            case 46: {
                n3 = 39;
                break;
            }
            case 47: {
                n3 = 48;
                break;
            }
            case 48: {
                n3 = 14;
                break;
            }
            case 49: {
                n3 = 57;
                break;
            }
            case 50: {
                n3 = 50;
                break;
            }
            case 51: {
                n3 = 5;
                break;
            }
            case 52: {
                n3 = 37;
                break;
            }
            case 53: {
                n3 = 25;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 15;
                break;
            }
            case 56: {
                n3 = 22;
                break;
            }
            case 57: {
                n3 = 12;
                break;
            }
            case 58: {
                n3 = 49;
                break;
            }
            case 59: {
                n3 = 1;
                break;
            }
            case 60: {
                n3 = 2;
                break;
            }
            case 61: {
                n3 = 11;
                break;
            }
            case 62: {
                n3 = 46;
                break;
            }
            default: {
                n3 = 29;
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
        DistributedResourceTopologyManager.Jb[n4] = new String(cArray);
        return n4;
    }

    public void a(GameInputController gameInputController) {
        boolean bl;
        boolean bl2;
        int n;
        DistributedResourceTopologyManager distributedResourceTopologyManager;
        try {
            distributedResourceTopologyManager = this;
            n = gameInputController.getKey();
            bl2 = gameInputController.isDown();
            bl = GeometryCalculator.C() < 35;
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTopologyManager.a(customSystemException);
        }
        distributedResourceTopologyManager.X(n, bl2, bl);
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DistributedResourceTopologyManager.f(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00df' || c == '\u00ea' || c == 'd' || c == 'G') {
                field = DistributedResourceTopologyManager.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00df' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DistributedResourceTopologyManager.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ec' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void Q(AssetOrchestrator assetOrchestrator, double d2, double d3, double d4, double d5, String string) {
        boolean bl;
        Color color;
        double d6;
        double d7;
        double d8;
        double d9;
        long l = fb ^ 0x7953859AC6CDL;
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = assetOrchestrator.G;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().u(0.9, false);
        try {
            d9 = d2;
            d8 = d3 - 0.5;
            d7 = d4;
            d6 = d5 + 0.5;
            color = this.s(assetOrchestrator.C().k());
            bl = !assetOrchestrator.b();
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTopologyManager.a(customSystemException);
        }
        ConfigurationManager.c(d9, d8, d7, d6, color, bl, 1.0f, 1.0f, 3.0f, new Color(0, 0, 0, 152));
        if (assetOrchestrator.equals(this.wn)) {
            double d10 = 30.0;
            ConfigurationManager.A(d2 + d4 / 2.0 - d10 / 2.0, d3 + 2.0, d10, 1.5, this.u(assetOrchestrator.B().k(), 10));
        }
        if (string != null) {
            float f = 4.4f;
            StateTrackingCoordinator.B(this.s(assetOrchestrator.B().k()), (float)(d2 + d4 / 2.5 - 4.0), (float)d3 + 2.0f, string, f, f, false);
        } else {
            Object object = assetOrchestrator == this.wE ? DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)5177, (long)(0x319F926EFFA4F31BL ^ l)), (long)1367493641051775016L, (long)l) : (assetOrchestrator == this.w6 ? DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)17275, (long)(0x489A0F8354A245AL ^ l)), (long)1367493641051775016L, (long)l) : (assetOrchestrator == this.wn ? "" : DynamicInvocationResolver1041.X(connectionPoolOrchestrator1192.t())));
            cryptographicParameterGenerator.R((String)object, d2 + d4 / 2.5 - cryptographicParameterGenerator.D((String)object) / 2.0, d3 + 3.0, this.s(assetOrchestrator.B().k()));
        }
    }

    private static void T() {
        Object[] objectArray = Ib;
        Ib[0] = "lE\u0018";
        objectArray[1] = Integer.TYPE;
        DistributedResourceTopologyManager.Jb[1] = "java/lang/Integer";
        objectArray[2] = "J6c[3\\A9r\u0014NDR>{]";
        objectArray[3] = "2sz8\u000f\u00179|kwn\u00192wo-";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ">iP\\Sjm~\u001b!Ik\u000e5Z\u0010[\u007foe\nFD\u00107q\tMHs50\f\u001e\"";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DistributedResourceTopologyManager.fb = MultiContainerRegistry.a(4132344062318898800L, 2811704807783994466L, MethodHandles.lookup().lookupClass()).a(59719465700510L);
                DistributedResourceTopologyManager.Ib = new Object[5];
                DistributedResourceTopologyManager.Jb = new String[5];
                DistributedResourceTopologyManager.T();
                DistributedResourceTopologyManager.xb = new HashMap<K, V>(13);
                var0 = DistributedResourceTopologyManager.fb ^ 94139805100280L;
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
                var6_5 = "DyLnl\u00f9\u00dd}5Ua\u009b\u00041dlQ_\u00c2j8\u0015\u00cc\u00e1.\u00cb\"v{\u00d2\u00ab\u00c4\u00da\u00fb\u00ec6!\u00dekE7w\u00d4@\u00c2\u008b\u0000)\u0097\u00e1\u009c\u00f9\u00d8k\u00f7\u0012\u00cdN\u00b2\u00c8=\u00b75\f";
                var7_6 = "DyLnl\u00f9\u00dd}5Ua\u009b\u00041dlQ_\u00c2j8\u0015\u00cc\u00e1.\u00cb\"v{\u00d2\u00ab\u00c4\u00da\u00fb\u00ec6!\u00dekE7w\u00d4@\u00c2\u008b\u0000)\u0097\u00e1\u009c\u00f9\u00d8k\u00f7\u0012\u00cdN\u00b2\u00c8=\u00b75\f".length();
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
                    var6_5 = "\u0007\u008a:8H\u008a\u0082/#\u001f!\u00b5\u0003<7\u000e";
                    var7_6 = "\u0007\u008a:8H\u008a\u0082/#\u001f!\u00b5\u0003<7\u000e".length();
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
        DistributedResourceTopologyManager.vb = var8_3;
        DistributedResourceTopologyManager.wb = new Integer[10];
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = DistributedResourceTopologyManager.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DistributedResourceTopologyManager.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean K() {
        return super.R();
    }

    public void P() {
        for (AssetOrchestrator assetOrchestrator : this.wM) {
            this.s(assetOrchestrator.G, false);
        }
    }

    public DistributedResourceTopologyManager() {
        super(MemoryResourceAllocator.class);
        this.wM = new ArrayList();
        this.w3 = new AssetOrchestrator(this, this.wi.s());
        this.wy = new AssetOrchestrator(this, this.wi.w());
        this.w4 = new AssetOrchestrator(this, this.wi.y());
        this.wf = new AssetOrchestrator(this, this.wi.h());
        this.wE = new AssetIntegrationManager(this, this.wi.G());
        this.w6 = new AssetIntegrationManager(this, this.wi.D());
        this.wn = new AssetIntegrationManager(this, this.wi.r());
        this.wH = (MemoryResourceAllocator)this.t();
        this.wq = new QueuedCipherExecutor(this);
        this.o(this.wq);
        this.wM.add(this.w3);
        this.wM.add(this.wy);
        this.wM.add(this.w4);
        this.wM.add(this.wf);
        this.wM.add(this.wE);
        this.wM.add(this.w6);
        this.wM.add(this.wn);
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DistributedResourceTopologyManager.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void s(ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192, boolean bl) {
        this.X(connectionPoolOrchestrator1192.t(), bl, false);
    }

    public QueuedCipherExecutor w() {
        return this.wq;
    }

    @Override
    public boolean R() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.K() || this.wH.r.s().booleanValue()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceTopologyManager.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean k() {
        boolean bl;
        try {
            if (this.wH == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTopologyManager.a(customSystemException);
        }
        try {
            bl = this.wH.N.J() == this.wH.h;
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTopologyManager.a(customSystemException);
        }
        return bl;
    }

    private static Field w(long l, long l2) {
        int n = DistributedResourceTopologyManager.u(l, l2);
        Object object = Ib[n];
        if (object instanceof String) {
            String string = Jb[n];
            int n2 = string.indexOf(8);
            Class clazz = DistributedResourceTopologyManager.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DistributedResourceTopologyManager.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DistributedResourceTopologyManager.k(clazz3, string2, clazz2)) != null) {
                    DistributedResourceTopologyManager.Ib[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DistributedResourceTopologyManager.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DistributedResourceTopologyManager.Ib[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DistributedResourceTopologyManager.v(250080986389393L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void T(double d2, double d3) {
        long l = fb ^ 0x65AD9D855558L;
        StateTrackingCoordinator.d(this.s(this.wE.C().k()), (float)d2, (float)d3, (String)((Object)DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)23167, (long)(0x65E490E64D18AEC1L ^ l)), (long)-9119986303971052611L, (long)l)), 0.75f, false);
        StateTrackingCoordinator.d(this.s(this.w6.C().k()), (float)(d2 + 20.0), (float)d3, (String)((Object)DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)23074, (long)(0x7A6EDF28BCE5AE91L ^ l)), (long)-9119986303971052611L, (long)l)), 0.75f, false);
        StateTrackingCoordinator.d(this.s(new Color(225, 225, 225)), (float)(d2 + 21.5), (float)(d3 + 7.0), (String)((Object)DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)9752, (long)(0x6B2225FF0E81D2AEL ^ l)), (long)-9119986303971052611L, (long)l)), 0.216f, false);
    }

    private static CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void V() {
        double d2;
        double d3;
        double d4;
        block23: {
            block22: {
                CallSite callSite;
                double d5;
                double d6;
                double d7;
                double d8;
                AssetOrchestrator assetOrchestrator;
                DistributedResourceTopologyManager distributedResourceTopologyManager;
                CallSite callSite2;
                double d9;
                double d10;
                double d11;
                double d12;
                AssetOrchestrator assetOrchestrator2;
                DistributedResourceTopologyManager distributedResourceTopologyManager2;
                CallSite callSite3;
                double d13;
                double d14;
                double d15;
                double d16;
                AssetOrchestrator assetOrchestrator3;
                DistributedResourceTopologyManager distributedResourceTopologyManager3;
                CallSite callSite4;
                double d17;
                double d18;
                double d19;
                double d20;
                AssetOrchestrator assetOrchestrator4;
                DistributedResourceTopologyManager distributedResourceTopologyManager4;
                double d21;
                long l;
                block21: {
                    l = fb ^ 0x9BF5374807L;
                    try {
                        try {
                            if (this.wH == null || !this.wH.r.s().booleanValue()) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceTopologyManager.a(customSystemException);
                        }
                        this.M(true);
                        this.wq.o(true);
                        this.wq.b(this.G());
                        this.wq.M(this.W());
                        this.wq.T(55.0);
                        this.wq.w(10.0);
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceTopologyManager.a(customSystemException);
                    }
                }
                this.M(false);
                this.wq.o(false);
                int n = 17;
                try {
                    double d22 = d21 = this.Y() ? this.W() + 4.0 : this.W() + 2.0;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                if (this.Y()) {
                    d4 = this.G() + 51.0 + 10.0;
                    d3 = d21 - 6.0;
                } else {
                    d4 = this.G();
                    d3 = d21 + 40.0;
                }
                try {
                    distributedResourceTopologyManager4 = this;
                    assetOrchestrator4 = this.w3;
                    d20 = this.G() + 19.0;
                    d19 = d21 - 2.0;
                    d18 = 17.0;
                    d17 = 17.0;
                    callSite4 = this.k() ? DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)18767, (long)(0x21DAD3C2318BA0A0L ^ l)), (long)-7192202490587992350L, (long)l) : null;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                try {
                    distributedResourceTopologyManager4.Q(assetOrchestrator4, d20, d19, d18, d17, (String)((Object)callSite4));
                    distributedResourceTopologyManager3 = this;
                    assetOrchestrator3 = this.w4;
                    d16 = this.G();
                    d15 = d21 + 19.0;
                    d14 = 17.0;
                    d13 = 17.0;
                    callSite3 = this.k() ? DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)9470, (long)(0x47A4649E85A64D10L ^ l)), (long)-7192202490587992350L, (long)l) : null;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                try {
                    distributedResourceTopologyManager3.Q(assetOrchestrator3, d16, d15, d14, d13, (String)((Object)callSite3));
                    distributedResourceTopologyManager2 = this;
                    assetOrchestrator2 = this.wy;
                    d12 = this.G() + 19.0;
                    d11 = d21 + 19.0;
                    d10 = 17.0;
                    d9 = 17.0;
                    callSite2 = this.k() ? DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)23015, (long)(0x6ED614C07A7FB007L ^ l)), (long)-7192202490587992350L, (long)l) : null;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                try {
                    distributedResourceTopologyManager2.Q(assetOrchestrator2, d12, d11, d10, d9, (String)((Object)callSite2));
                    distributedResourceTopologyManager = this;
                    assetOrchestrator = this.wf;
                    d8 = this.G() + 38.0;
                    d7 = d21 + 19.0;
                    d6 = 17.0;
                    d5 = 17.0;
                    callSite = this.k() ? DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)387, (long)(0x59A1BB0141EB6869L ^ l)), (long)-7192202490587992350L, (long)l) : null;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                distributedResourceTopologyManager.Q(assetOrchestrator, d8, d7, d6, d5, (String)((Object)callSite));
                if (this.P()) {
                    this.Q(this.wn, this.G(), d21 + 39.5, 55.25, 11.0, null);
                    d3 += 14.0;
                }
                try {
                    if (!this.Y()) break block22;
                    this.T(d4 - 2.0, d3);
                    this.wq.T(40.0);
                    break block23;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
            }
            this.Q(this.wE, d4, d3, 26.35, 16.0, null);
            this.Q(this.w6, d4 + 26.35 + 2.0, d3, 26.35, 16.0, null);
            this.wq.T(55.0);
        }
        try {
            d2 = this.Y() ? 22.0 : 17.0;
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTopologyManager.a(customSystemException);
        }
        double d23 = d2;
        this.wq.b(d4);
        this.wq.M(d3 + d23);
        this.wq.w(10.0);
        this.wE.Z.Q(0.01);
    }

    private static Method k(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private boolean P() {
        try {
            if (this.wH == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTopologyManager.a(customSystemException);
        }
        return this.wH.Z.s();
    }

    @Override
    public double w() {
        block5: {
            try {
                try {
                    if (this.wH == null || !this.wH.r.s().booleanValue()) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                return 75.0;
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceTopologyManager.a(customSystemException);
            }
        }
        double d2 = 54.0;
        if (this.Y()) {
            d2 += 48.0;
        }
        return d2;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public String A() {
        long l = fb ^ 0x1F30C9B897A7L;
        return DistributedResourceTopologyManager.l("\u00ec", (int)DistributedResourceTopologyManager.f("p", (int)13600, (long)(0x1C4994114911036DL ^ l)), (long)4868450965673308482L, (long)l);
    }

    @Override
    public void d() {
        boolean bl;
        block8: {
            block7: {
                boolean bl2;
                try {
                    bl2 = !GraphicalRenderingController.K.k();
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                bl = bl2;
                try {
                    if (this.wF == bl) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                try {
                    if (!this.wF) break block7;
                    this.P();
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
            }
            this.I();
        }
        this.wF = bl;
    }

    private void X(int n, boolean bl, boolean bl2) {
        for (AssetOrchestrator assetOrchestrator : this.wM) {
            block13: {
                int n2 = assetOrchestrator.G.t();
                try {
                    if (n2 < 0) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                if (bl2) {
                    n2 = ConfigurationParameterResolver.S(n2);
                }
                try {
                    try {
                        try {
                            try {
                                if (n2 != n) continue;
                                if (bl == assetOrchestrator.h) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceTopologyManager.a(customSystemException);
                            }
                            assetOrchestrator.U();
                            if (bl) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceTopologyManager.a(customSystemException);
                        }
                        if (assetOrchestrator.b()) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceTopologyManager.a(customSystemException);
                    }
                    assetOrchestrator.h();
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
            }
            assetOrchestrator.h = bl;
        }
    }

    @Override
    public double b() {
        block8: {
            try {
                try {
                    if (this.wH == null || !this.wH.r.s().booleanValue()) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                return 20.0;
            }
            catch (CustomSystemException customSystemException) {
                throw DistributedResourceTopologyManager.a(customSystemException);
            }
        }
        double d2 = 0.0;
        if (this.Y()) {
            d2 += 40.0;
            if (this.P()) {
                d2 += 14.0;
            }
        } else {
            d2 += 72.0;
            if (this.P()) {
                d2 += 14.0;
            }
        }
        return d2;
    }

    public void N(UserInputEventMapper userInputEventMapper) {
        for (AssetOrchestrator assetOrchestrator : this.wM) {
            block12: {
                int n = assetOrchestrator.G.t();
                try {
                    if (GeometryCalculator.C() < 35) {
                        n += 100;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
                try {
                    try {
                        try {
                            try {
                                if (n != userInputEventMapper.getButton()) continue;
                                if (userInputEventMapper.getButtonState() == assetOrchestrator.h) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DistributedResourceTopologyManager.a(customSystemException);
                            }
                            assetOrchestrator.U();
                            if (userInputEventMapper.getButtonState()) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DistributedResourceTopologyManager.a(customSystemException);
                        }
                        if (assetOrchestrator.b()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DistributedResourceTopologyManager.a(customSystemException);
                    }
                    assetOrchestrator.h();
                }
                catch (CustomSystemException customSystemException) {
                    throw DistributedResourceTopologyManager.a(customSystemException);
                }
            }
            assetOrchestrator.h = userInputEventMapper.getButtonState();
        }
    }

    public void I() {
        for (AssetOrchestrator assetOrchestrator : this.wM) {
            this.s(assetOrchestrator.G, assetOrchestrator.G.X());
        }
    }

    private static Method x(long l, long l2) {
        int n = DistributedResourceTopologyManager.u(l, l2);
        Object object = Ib[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DistributedResourceTopologyManager.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DistributedResourceTopologyManager.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DistributedResourceTopologyManager.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        DistributedResourceTopologyManager.Ib[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DistributedResourceTopologyManager.v(250080986389393L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DistributedResourceTopologyManager.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DistributedResourceTopologyManager.Ib[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DistributedResourceTopologyManager.v(250080986389393L, 0L);
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

    private boolean Y() {
        boolean bl;
        try {
            if (this.wH == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTopologyManager.a(customSystemException);
        }
        try {
            bl = this.wH.T.J() == this.wH.K;
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedResourceTopologyManager.a(customSystemException);
        }
        return bl;
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DistributedResourceTopologyManager.u(l, l2);
            object = Ib[n];
            try {
                if (!(object instanceof String)) break block2;
                DistributedResourceTopologyManager.Ib[n] = clazz = Class.forName(Jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DistributedResourceTopologyManager.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DistributedResourceTopologyManager.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

