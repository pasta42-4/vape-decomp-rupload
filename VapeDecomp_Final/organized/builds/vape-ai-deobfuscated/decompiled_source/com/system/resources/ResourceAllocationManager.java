/*
 * Decompiled with CFR 0.152.
 */
package com.system.resources;

import a.a;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.database.QueryBuilder;
import com.app.event.EventTrigger;
import com.app.requests.RequestHandler2652;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.dispatch.EventDispatchController1028;
import com.event.management.EventBroadcastCoordinator;
import com.event.management.EventDispatchCoordinator2607;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.minecraft.render.MinecraftRenderContextManager;
import com.network.connection.NetworkConnectionEstablisher;
import com.notification.distribution.NotificationDistributionManager;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataExtractor1376;
import com.rendering.context.RenderContextManager;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cryptography.CryptographicResourceManager;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ResourceAllocationManager
extends ReflectionMetadataExtractor1376 {
    private static final long bb;
    public final GenericAdapterManager b;
    private static float P;
    private static float Ts;
    private static float O;
    private int G;
    private final AuthenticationGateway1860 K;
    private final AuthenticationGateway1860 Y;
    private boolean T4;
    private static final Map hb;
    private static float h;
    private final AuthenticationGateway1860 R;
    private static final Integer[] gb;
    private static final long[] fb;
    private final AuthenticationGateway1860 T;
    private static float n;
    private static final String[] lb;
    private final AuthenticationGateway1860 TJ;
    private double B;
    private final NumericPrecisionTransformer Z;
    private static final Object[] kb;
    private TransactionOrchestrator1017 V;
    private double j;
    private static float r;
    public final GenericAdapterManager e;
    private double N;
    private static float m;
    private final AuthenticationStateTracker L;
    private static float d;
    private static float l;
    private static boolean x;
    private final AuthenticationGateway1860 TW;
    public final GenericAdapterManager w;
    private double F;
    private static float v;

    private static Method d(long l, long l2) {
        int n = ResourceAllocationManager.a(l, l2);
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
                clazz3 = ResourceAllocationManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceAllocationManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceAllocationManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceAllocationManager.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceAllocationManager.b(269782492718792L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceAllocationManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceAllocationManager.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceAllocationManager.b(269782492718792L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void g() {
        block7: {
            try {
                if (!this.T4) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager.a(customSystemException);
            }
            try {
                try {
                    if (!ConfigurationCalibrator.b.P() || !TemporalMetadataResolver.h.a().F.s().booleanValue()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager.a(customSystemException);
            }
        }
        this.s();
    }

    private static Field c(long l, long l2) {
        int n = ResourceAllocationManager.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceAllocationManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceAllocationManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceAllocationManager.a(clazz3, string2, clazz2)) != null) {
                    ResourceAllocationManager.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceAllocationManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceAllocationManager.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceAllocationManager.b(269782492718792L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E21;
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
                throw new RuntimeException("a/jF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceAllocationManager.gb[n2] = n3;
        }
        return gb[n2];
    }

    @DataExchangeProtocol2090
    public void K(QueryBuilder queryBuilder) {
        try {
            if (!x) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        try {
            if (!this.T4) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        this.u();
    }

    @Override
    public void t() {
        block10: {
            try {
                try {
                    if (this.Z() && !ApplicationLifecycleManager.X().r()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager.a(customSystemException);
            }
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                this.j = ApplicationLifecycleManager.k().S();
                this.N = ApplicationLifecycleManager.k().e();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        try {
            if (this.w.J() == this.K) {
                EventBroadcastCoordinator.k.execute(this::lambda$executeBind$0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
    }

    private void s() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block4: {
            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                try {
                    if (!systemConfigurationOrchestrator.Y() && !ApplicationLifecycleManager.c().Y()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager.a(customSystemException);
            }
        }
        systemConfigurationOrchestrator.a(O);
        systemConfigurationOrchestrator.z(O);
        systemConfigurationOrchestrator.C(O);
        systemConfigurationOrchestrator.F(O);
        systemConfigurationOrchestrator.f(v);
        systemConfigurationOrchestrator.G(v);
    }

    private void u() {
        try {
            if (ConfigurationRegistry.t.U()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        this.V.a(n);
        this.V.z(n);
        this.V.f(P);
        this.V.G(P);
    }

    @DataExchangeProtocol2090
    public void q(EventDispatchController1028 eventDispatchController1028) {
        try {
            if (!this.T4) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        this.s();
    }

    @DataExchangeProtocol2090
    public void s(EventTriggerEngine eventTriggerEngine) {
        int n;
        block15: {
            float f;
            block17: {
                block16: {
                    try {
                        this.V = eventTriggerEngine.getThePlayer();
                        if (!this.T4) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationManager.a(customSystemException);
                    }
                    try {
                        try {
                            if (x) break block15;
                            r = this.V.S();
                            h = this.V.q();
                            d = this.V.Q();
                            l = this.V.A();
                            this.G = ApplicationLifecycleManager.N().V();
                            if (!((NetworkConnectionEstablisher)this.e.J()).equals(this.Y)) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationManager.a(customSystemException);
                        }
                        f = 0.0f;
                        break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationManager.a(customSystemException);
                    }
                }
                f = 180.0f;
            }
            Ts = f;
            m = 0.0f;
            this.F = 0.0;
            this.B = 0.0;
            ResourceAllocationManager.n = h;
            P = r;
            v = r;
            O = h;
            x = true;
            return;
        }
        try {
            n = ((NetworkConnectionEstablisher)this.b.J()).equals(this.TW) ? 0 : 1;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        int n2 = n;
        try {
            if (ApplicationLifecycleManager.N().V() != n2) {
                ApplicationLifecycleManager.N().s(n2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        try {
            if (ApplicationLifecycleManager.X().r()) {
                Ts = 0.0f;
                m = 0.0f;
                this.F = this.B = (double)0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        this.T();
        double d2 = this.F * this.I() * 0.15;
        double d3 = this.B * this.I() * 0.15;
        ResourceAllocationManager.n = (float)(d2 - (double)Ts + (double)h);
        P = (float)(d3 - (double)m + (double)r);
        P = AdaptiveComputationEngine.g(P, -90.0f, 90.0f);
        Ts = (float)(d2 + (double)Ts);
        m = (float)(d3 + (double)m);
        m = AdaptiveComputationEngine.g(m, -(90.0f - r), 90.0f + r);
    }

    public static float H() {
        return P;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void l(RenderContextManager renderContextManager) {
        this.g();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceAllocationManager.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceAllocationManager.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "SaA";
        objectArray[1] = Integer.TYPE;
        ResourceAllocationManager.lb[1] = "java/lang/Integer";
        objectArray[2] = ">f!n\u0017)5i0!j1&n9h";
        objectArray[3] = "lT\u001e\u000e\u0006Og[\u000fAgAlP\u000b\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = " \u001d;`L\t+U&\u000b\u001b\tB\u00160w\n\u0000?\u001f)qpK$T;{\u0017K/\u0012$\u000b";
    }

    public static float c() {
        return O;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ResourceAllocationManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceAllocationManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceAllocationManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceAllocationManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceAllocationManager.a(n, l);
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
                ResourceAllocationManager.bb = MultiContainerRegistry.a(-5587291472535910158L, -7048235301076051349L, MethodHandles.lookup().lookupClass()).a(22973595624892L);
                ResourceAllocationManager.kb = new Object[5];
                ResourceAllocationManager.lb = new String[5];
                ResourceAllocationManager.a();
                ResourceAllocationManager.hb = new HashMap<K, V>(13);
                var0 = ResourceAllocationManager.bb ^ 53928324938405L;
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
                var8_3 = new long[16];
                var5_4 = 0;
                var6_5 = "\u00e3{\u00fc\u00c7U,\u00e1\u00d73\u001f%\u00fd\u000fW\b\u0007\u00c9n\u001a\u00e6\u00bdpI\u008d.\u008bP\u00a6\u00c3\u00a1\r\u00d6\u00e4\u00dc\u0080o\u00f2\u009e'r\u00bc\u0015\u00c6@\u00dc\u00eb\u00ba\u00d2\u008cDX,\u008bt\u00ed\u00ce\u0005\u00aam\u00c0\u00c6\u00a9\u00efC\u00f4\u00a4p\u0001\u00dfM\u0015\u0098\u00d5\u00de\u0018\u0086z\u0092\u00db\u00bc\u00acHx]w\u00a4\u00f8\u00b2\u00df=(\u00a9\u00a8\u00d8\u0087-)&\u00c3d\u00c4^\u0087 s#\u00e8,\u00aaJ\u00d0\u0010";
                var7_6 = "\u00e3{\u00fc\u00c7U,\u00e1\u00d73\u001f%\u00fd\u000fW\b\u0007\u00c9n\u001a\u00e6\u00bdpI\u008d.\u008bP\u00a6\u00c3\u00a1\r\u00d6\u00e4\u00dc\u0080o\u00f2\u009e'r\u00bc\u0015\u00c6@\u00dc\u00eb\u00ba\u00d2\u008cDX,\u008bt\u00ed\u00ce\u0005\u00aam\u00c0\u00c6\u00a9\u00efC\u00f4\u00a4p\u0001\u00dfM\u0015\u0098\u00d5\u00de\u0018\u0086z\u0092\u00db\u00bc\u00acHx]w\u00a4\u00f8\u00b2\u00df=(\u00a9\u00a8\u00d8\u0087-)&\u00c3d\u00c4^\u0087 s#\u00e8,\u00aaJ\u00d0\u0010".length();
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
                    var6_5 = "\u009a\u00d1\u00d4-.DRN\u00f6\u0084\u00f6=\u00c2\u00bbh@";
                    var7_6 = "\u009a\u00d1\u00d4-.DRN\u00f6\u0084\u00f6=\u00c2\u00bbh@".length();
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
        ResourceAllocationManager.fb = var8_3;
        ResourceAllocationManager.gb = new Integer[16];
        ResourceAllocationManager.x = false;
    }

    private void T() {
        try {
            if (GeometryCalculator.C() >= 35) {
                this.F = this.j - ApplicationLifecycleManager.k().S();
                this.B = this.N - ApplicationLifecycleManager.k().e();
                this.j = ApplicationLifecycleManager.k().S();
                this.N = ApplicationLifecycleManager.k().e();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        this.F = -ApplicationLifecycleManager.k().v();
        this.B = ApplicationLifecycleManager.k().N();
    }

    private double I() {
        try {
            if (!this.L.s().booleanValue()) {
                return (double)ApplicationLifecycleManager.N().W() * 0.6 * 0.2 * 8.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        return (Double)this.Z.J();
    }

    private void Z() {
        block7: {
            try {
                if (!this.T4) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager.a(customSystemException);
            }
            try {
                try {
                    if (!ConfigurationCalibrator.b.P() || !TemporalMetadataResolver.h.a().F.s().booleanValue()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager.a(customSystemException);
            }
        }
        this.u();
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void r(EventDispatchCoordinator2607 eventDispatchCoordinator2607) {
        this.g();
    }

    @DataExchangeProtocol2090
    public void p(EventTrigger eventTrigger) {
        block13: {
            block14: {
                try {
                    if (this.w.J() != this.TJ) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
                try {
                    if (ApplicationLifecycleManager.X().r()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
                try {
                    if (ApplicationLifecycleManager.U().Y()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
                try {
                    try {
                        this.T4 = this.C().B();
                        if (this.T4) break block13;
                        x = false;
                        if (this.G != -1) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationManager.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
            }
            ApplicationLifecycleManager.N().s(this.G);
            this.G = -1;
            this.s();
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == 'X' || c == 'R' || c == '\u00fe') {
                field = ResourceAllocationManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceAllocationManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void L(MinecraftRenderContextManager minecraftRenderContextManager) {
        this.Z();
    }

    public static float b() {
        return v;
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
                n3 = 55;
                break;
            }
            case 1: {
                n3 = 22;
                break;
            }
            case 2: {
                n3 = 45;
                break;
            }
            case 3: {
                n3 = 23;
                break;
            }
            case 4: {
                n3 = 40;
                break;
            }
            case 5: {
                n3 = 44;
                break;
            }
            case 6: {
                n3 = 48;
                break;
            }
            case 7: {
                n3 = 43;
                break;
            }
            case 8: {
                n3 = 39;
                break;
            }
            case 9: {
                n3 = 3;
                break;
            }
            case 10: {
                n3 = 34;
                break;
            }
            case 11: {
                n3 = 58;
                break;
            }
            case 12: {
                n3 = 56;
                break;
            }
            case 13: {
                n3 = 53;
                break;
            }
            case 14: {
                n3 = 21;
                break;
            }
            case 15: {
                n3 = 36;
                break;
            }
            case 16: {
                n3 = 51;
                break;
            }
            case 17: {
                n3 = 17;
                break;
            }
            case 18: {
                n3 = 32;
                break;
            }
            case 19: {
                n3 = 60;
                break;
            }
            case 20: {
                n3 = 61;
                break;
            }
            case 21: {
                n3 = 62;
                break;
            }
            case 22: {
                n3 = 38;
                break;
            }
            case 23: {
                n3 = 26;
                break;
            }
            case 24: {
                n3 = 28;
                break;
            }
            case 25: {
                n3 = 1;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 27: {
                n3 = 63;
                break;
            }
            case 28: {
                n3 = 7;
                break;
            }
            case 29: {
                n3 = 20;
                break;
            }
            case 30: {
                n3 = 35;
                break;
            }
            case 31: {
                n3 = 54;
                break;
            }
            case 32: {
                n3 = 14;
                break;
            }
            case 33: {
                n3 = 41;
                break;
            }
            case 34: {
                n3 = 11;
                break;
            }
            case 35: {
                n3 = 8;
                break;
            }
            case 36: {
                n3 = 5;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 52;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 19;
                break;
            }
            case 41: {
                n3 = 10;
                break;
            }
            case 42: {
                n3 = 31;
                break;
            }
            case 43: {
                n3 = 4;
                break;
            }
            case 44: {
                n3 = 46;
                break;
            }
            case 45: {
                n3 = 16;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 2;
                break;
            }
            case 48: {
                n3 = 30;
                break;
            }
            case 49: {
                n3 = 47;
                break;
            }
            case 50: {
                n3 = 6;
                break;
            }
            case 51: {
                n3 = 9;
                break;
            }
            case 52: {
                n3 = 29;
                break;
            }
            case 53: {
                n3 = 50;
                break;
            }
            case 54: {
                n3 = 27;
                break;
            }
            case 55: {
                n3 = 59;
                break;
            }
            case 56: {
                n3 = 12;
                break;
            }
            case 57: {
                n3 = 57;
                break;
            }
            case 58: {
                n3 = 42;
                break;
            }
            case 59: {
                n3 = 49;
                break;
            }
            case 60: {
                n3 = 15;
                break;
            }
            case 61: {
                n3 = 37;
                break;
            }
            case 62: {
                n3 = 18;
                break;
            }
            default: {
                n3 = 13;
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
        ResourceAllocationManager.lb[n4] = new String(cArray);
        return n4;
    }

    public ResourceAllocationManager() {
        long l = bb ^ 0x75EB81ECB4B5L;
        super(a.cs((int)ResourceAllocationManager.a("t", (int)12999, (long)(0x327159F51DD6E838L ^ l))), CryptographicResourceManager.Y, a.cs((int)ResourceAllocationManager.a("t", (int)18025, (long)(0x6386287E96D21C91L ^ l))));
        this.TJ = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)14090, (long)(0x5A021E977726EDF6L ^ l)), (long)2654702530025927527L, (long)l)));
        this.K = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)22665, (long)(0x22F6DF6BF348027AL ^ l)), (long)2654702530025927527L, (long)l)));
        this.w = GenericAdapterManager.D(this, (String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)4822, (long)(0x1DD053430FDF482BL ^ l)), (long)2654702530025927527L, (long)l)), this.TJ, this.TJ, this.K);
        this.L = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)15912, (long)(0x3767D380C694E4DEL ^ l)), (long)2654702530025927527L, (long)l)), false, (String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)4189, (long)(0x54B38A2596004AA4L ^ l)), (long)2654702530025927527L, (long)l)));
        this.Z = NumericPrecisionTransformer.t(this, (String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)19099, (long)(0x420CA8A705B9906FL ^ l)), (long)2654702530025927527L, (long)l)), (String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)10415, (long)(0x6E4719D4D4ECF255L ^ l)), (long)2654702530025927527L, (long)l)), "", 0.001, 0.5, 1.0);
        this.R = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)17111, (long)(0x40D18DCED20A9826L ^ l)), (long)2654702530025927527L, (long)l)));
        this.TW = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)16806, (long)(0xAA0041719FA1B58L ^ l)), (long)2654702530025927527L, (long)l)));
        this.b = GenericAdapterManager.D(this, (String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)19413, (long)(0x676132F48BDA9122L ^ l)), (long)2654702530025927527L, (long)l)), this.R, this.R, this.TW);
        this.Y = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)11034, (long)(0x610F6FBB5ED7F1E1L ^ l)), (long)2654702530025927527L, (long)l)));
        this.T = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)5200, (long)(0x680977D755A04EA5L ^ l)), (long)2654702530025927527L, (long)l)));
        this.e = GenericAdapterManager.D(this, (String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)23279, (long)(0x68FB86D3FEF801FL ^ l)), (long)2654702530025927527L, (long)l)), this.Y, this.Y, this.T);
        this.T4 = false;
        this.G = -1;
        this.s((String)((Object)ResourceAllocationManager.c("\u00f9", (int)ResourceAllocationManager.a("t", (int)5689, (long)(0x1151FE5478F9CCCBL ^ l)), (long)2654702530025927527L, (long)l)));
        this.I(true);
        this.N(this.w, this.e, this.L, this.Z);
        this.L.l(this.Z);
    }

    public static float m() {
        return n;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceAllocationManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void k(NotificationDistributionManager notificationDistributionManager) {
        this.Z();
    }

    public void V(float f, float f2, float f3, float f4) {
        O = f;
        v = f2;
    }

    private void lambda$executeBind$0() {
        block6: {
            block7: {
                boolean bl;
                try {
                    ResourceAllocationManager resourceAllocationManager = this;
                    bl = !this.T4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
                try {
                    try {
                        resourceAllocationManager.T4 = bl;
                        if (this.T4) break block6;
                        x = false;
                        if (this.G != -1) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationManager.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager.a(customSystemException);
                }
            }
            ApplicationLifecycleManager.N().s(this.G);
            this.G = -1;
            this.s();
        }
    }

    public static boolean b() {
        return x;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    @DataExchangeProtocol2090
    public void O(RequestHandler2652 requestHandler2652) {
        try {
            if (!this.T4) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationManager.a(customSystemException);
        }
        this.s();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocationManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ResourceAllocationManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

