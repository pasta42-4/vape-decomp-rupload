/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.rendering.context;

import a.KB;
import a.Qh;
import a.Ya;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.notification.dispatch.NotificationDispatcher2422;
import com.app.resources.ResourceLifecycleManager1543;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.validation.DataStreamValidator;
import com.event.management.ContextualEventDispatcher;
import com.event.management.EventDispatchCoordinator1011;
import com.exception.system.CustomSystemException;
import com.game.inventory.InventoryEventManager;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.trajectory.TrajectoryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleManager;
import com.network.core.NetworkConnectionManager2538;
import com.network.protocol.ProtocolInteractionController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.utils.ReflectionExceptionResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.transform.CryptographicTransformer;
import com.simulation.world.WorldStateTransitioner;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resource.AssetLoadBalancer;
import com.system.resource.ResourceAllocationController1564;
import com.system.resource.ResourceAllocator1606;
import com.system.resource.SystemResourceMediator1336;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ContextualRenderingMediator
extends ContextualExecutionFramework {
    private static final Object[] bb;
    private final AuthenticationStateTracker o;
    @Nullable
    private ResourceAllocationController1564 j;
    private final NetworkConfigManager R;
    private final NetworkConfigManager w;
    private final Map<Integer, SystemResourceMediator1336> m;
    private static final Integer[] L;
    private final NumericPrecisionTransformer b;
    private final NumericPrecisionTransformer t;
    private final ColorPaletteManager l;
    private boolean h;
    private final NetworkConfigManager P;
    private final GenericAdapterManager B;
    private static final long[] z;
    private final NumericPrecisionTransformer N;
    private final AuthenticationStateTracker X;
    private static final String[] fb;
    private static final long e;
    private final AuthenticationGateway1860 v;
    private final ConnectionLifecycleManager O;
    private ReflectionExceptionResolver r;
    private SystemResourceMediator1336 F;
    private final Set<Integer> K;
    private static final float Y = 10.0f;
    private int d;
    private final NumericPrecisionTransformer T;
    private final AuthenticationGateway1860 x;
    private static final Map V;
    private final AuthenticationStateTracker n;
    private final NetworkConfigManager G;
    private static final boolean Z = false;
    private final NumericPrecisionTransformer A;

    private boolean s() {
        try {
            if (!this.X.s().booleanValue()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().K();
        if (!lightweightExecutionContext.Y()) {
            ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
            try {
                if (protocolInteractionController.B(ReflectionMetadataResolver.Vu)) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
        }
        return this.l.b(lightweightExecutionContext, false);
    }

    private boolean Z(Qh qh) {
        boolean bl;
        try {
            bl = !qh.B(ReflectionMetadataResolver.rl);
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    private static Field c(long l, long l2) {
        int n = ContextualRenderingMediator.a(l, l2);
        Object object = bb[n];
        if (object instanceof String) {
            String string = fb[n];
            int n2 = string.indexOf(8);
            Class clazz = ContextualRenderingMediator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ContextualRenderingMediator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ContextualRenderingMediator.a(clazz3, string2, clazz2)) != null) {
                    ContextualRenderingMediator.bb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ContextualRenderingMediator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ContextualRenderingMediator.bb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ContextualRenderingMediator.b(221317375996012L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ContextualRenderingMediator.a(l, l2);
            object = bb[n];
            try {
                if (!(object instanceof String)) break block2;
                ContextualRenderingMediator.bb[n] = clazz = Class.forName(fb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @DataExchangeProtocol2090
    public void j(InventoryEventManager inventoryEventManager) {
        block10: {
            try {
                if (((Double)this.t.J()).longValue() <= 0L) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            LightweightExecutionContext lightweightExecutionContext = inventoryEventManager.getItemStack();
            try {
                if (lightweightExecutionContext.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
            try {
                try {
                    if (!protocolInteractionController.Y() && protocolInteractionController.B(ReflectionMetadataResolver.Vu)) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
        }
        this.R.m();
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 't' || c == 'Q' || c == '\u00de' || c == '\u00fc') {
                field = ContextualRenderingMediator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 't' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ContextualRenderingMediator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Nullable
    private Qh K(NetworkConnectionManager2538 networkConnectionManager2538) {
        List list = ApplicationLifecycleManager.c().f();
        Qh qh = null;
        float f = Float.MAX_VALUE;
        for (Object e : list) {
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
            try {
                if (!cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            Qh qh2 = new Qh(cryptographicTransformer);
            float f2 = qh2.y(networkConnectionManager2538);
            try {
                if (!(f2 < f) || !(f2 <= 10.0f)) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            qh = qh2;
            f = f2;
        }
        return qh;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ContextualRenderingMediator.e = MultiContainerRegistry.a(-4126773306247794595L, 9015805908947470103L, MethodHandles.lookup().lookupClass()).a(233700613140918L);
                ContextualRenderingMediator.bb = new Object[5];
                ContextualRenderingMediator.fb = new String[5];
                ContextualRenderingMediator.a();
                ContextualRenderingMediator.V = new HashMap<K, V>(13);
                var0 = ContextualRenderingMediator.e ^ 93062584981806L;
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
                var8_3 = new long[36];
                var5_4 = 0;
                var6_5 = "s1\u0015\u00ff\u00e5eI3\u00c5\u0001\u00fbe\u001e\u00f1\u00edd\u00fb\u0012\u00f1\u00f4\u00d6\u00db\u001a\u0098\u001a9\u00ba\u00fd\u0006\b\u00a6\n\u00de~\u00e2\u00f2\u009a\u00d1i\u007f\u009f\u000f\u00c1\u00f3t\u00ed8X~;\u00de\u00c5\u00b4\u00ec!\u00a1k\u00feQ;@n\u008d\u00ab\u00ffS\\]\u00c2l\u0086\u00c0\u0093W=X\u001f\u001e\u0098\u0013\u0094h\u00d1\u008e\u00e6r\u00cd\u00e8\u0002\u00d3\u00b2\u00bf\u00ceo\rws\u0099\u0082\u00a0\u0082\u009a3MS\u0005\u0019\u0003\u0000)\u0098GN\u0097\u0018\u00b1\u001a\u00bc\f7*\u00ef\u00e5\u00bd\t\u00b00_Oli-`|\u00de\u00bd)\u001d\u00e9\u00db@\u00aa\u008e\n \u00fa\u00a7\u0098,=\u00cfZa!\u0017\u008e\u00a2\u00ce\u00c4\u0005\u00fd\u0093\u00c7\u00d8\u0000\u00ac\u00cc\u00ee\u00ae&\u00e4d\u0005\u0005\u00e4\u00ccr\u009b\u00fcS\u00f9\u0091\u009d4\u009e\u0004\u00e0\u00e0/\u00bb\u0098\u0080\u00c3\"\u00cf\u00b9\u001cl\u00ab&x\ni\u00b9\u00d4I\u0099w\u0097\u0085\u0013\u00e2.\u00d5|\u00e0\u00b9o\u00cf\u0005\u00f6\u00bf\u00bd\r\u00f5\u00e9x#\u0098\u0007;\u00e1\u00e7\u00a4\u00d3\u00fe\u00d8\u00f5\u009d\u00caA(q\u001fA\u000f\u008f\u00dc#\u00fb\u00a8\u0087*\u001e\u00e7%Zc\u00e8\u00caz\u00b6\u0014\u00e4\u00be\u0080\u00de\u00ec(YB^";
                var7_6 = "s1\u0015\u00ff\u00e5eI3\u00c5\u0001\u00fbe\u001e\u00f1\u00edd\u00fb\u0012\u00f1\u00f4\u00d6\u00db\u001a\u0098\u001a9\u00ba\u00fd\u0006\b\u00a6\n\u00de~\u00e2\u00f2\u009a\u00d1i\u007f\u009f\u000f\u00c1\u00f3t\u00ed8X~;\u00de\u00c5\u00b4\u00ec!\u00a1k\u00feQ;@n\u008d\u00ab\u00ffS\\]\u00c2l\u0086\u00c0\u0093W=X\u001f\u001e\u0098\u0013\u0094h\u00d1\u008e\u00e6r\u00cd\u00e8\u0002\u00d3\u00b2\u00bf\u00ceo\rws\u0099\u0082\u00a0\u0082\u009a3MS\u0005\u0019\u0003\u0000)\u0098GN\u0097\u0018\u00b1\u001a\u00bc\f7*\u00ef\u00e5\u00bd\t\u00b00_Oli-`|\u00de\u00bd)\u001d\u00e9\u00db@\u00aa\u008e\n \u00fa\u00a7\u0098,=\u00cfZa!\u0017\u008e\u00a2\u00ce\u00c4\u0005\u00fd\u0093\u00c7\u00d8\u0000\u00ac\u00cc\u00ee\u00ae&\u00e4d\u0005\u0005\u00e4\u00ccr\u009b\u00fcS\u00f9\u0091\u009d4\u009e\u0004\u00e0\u00e0/\u00bb\u0098\u0080\u00c3\"\u00cf\u00b9\u001cl\u00ab&x\ni\u00b9\u00d4I\u0099w\u0097\u0085\u0013\u00e2.\u00d5|\u00e0\u00b9o\u00cf\u0005\u00f6\u00bf\u00bd\r\u00f5\u00e9x#\u0098\u0007;\u00e1\u00e7\u00a4\u00d3\u00fe\u00d8\u00f5\u009d\u00caA(q\u001fA\u000f\u008f\u00dc#\u00fb\u00a8\u0087*\u001e\u00e7%Zc\u00e8\u00caz\u00b6\u0014\u00e4\u00be\u0080\u00de\u00ec(YB^".length();
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
                    var6_5 = "\u00da\b\u00882\u00ca\u00a81\u009f\u00b1Bq\u001b%\u00de\u00b2|";
                    var7_6 = "\u00da\b\u00882\u00ca\u00a81\u009f\u00b1Bq\u001b%\u00de\u00b2|".length();
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
        ContextualRenderingMediator.z = var8_3;
        ContextualRenderingMediator.L = new Integer[36];
    }

    private int E() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        ResourceAllocator1606 resourceAllocator1606 = systemConfigurationOrchestrator.t();
        try {
            if (resourceAllocator1606.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        AssetLoadBalancer assetLoadBalancer = systemConfigurationOrchestrator.l();
        try {
            if (assetLoadBalancer.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        for (int i = 36; i < 45; ++i) {
            ResourceLifecycleManager1543 resourceLifecycleManager1543 = resourceAllocator1606.T(i);
            try {
                if (!resourceLifecycleManager1543.H()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            ProtocolInteractionController protocolInteractionController = resourceLifecycleManager1543.y().C();
            try {
                if (!protocolInteractionController.B(ReflectionMetadataResolver.Vu)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            return i;
        }
        return -1;
    }

    private boolean z() {
        boolean bl;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block6: {
            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                try {
                    if (!systemConfigurationOrchestrator.Y() && !systemConfigurationOrchestrator.O()) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
        }
        float f = ((Double)this.A.J()).floatValue();
        float f2 = systemConfigurationOrchestrator.e();
        try {
            bl = f2 >= f;
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    private boolean Z(NetworkConnectionManager2538 networkConnectionManager2538) {
        boolean bl;
        try {
            bl = !this.K.contains(networkConnectionManager2538.X());
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    @Override
    public void h() {
        try {
            this.G.m();
            if (this.x.o()) {
                this.Y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void B(SystemResourceMediator1336 systemResourceMediator1336) {
        this.G.m();
        ContextualEventDispatcher contextualEventDispatcher = systemResourceMediator1336.H();
        Ya ya = this.M(contextualEventDispatcher);
        this.j = new ResourceAllocationController1564(systemResourceMediator1336.P(), systemResourceMediator1336.u(), ya, contextualEventDispatcher, null);
        this.r = ReflectionExceptionResolver.ACQUIRING_AIMLOCK;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090
    public void s(EventDispatchCoordinator1011 eventDispatchCoordinator1011) {
        SystemResourceMediator1336 systemResourceMediator1336;
        block12: {
            CryptographicTransformer cryptographicTransformer = eventDispatchCoordinator1011.getEntity();
            try {
                if (!cryptographicTransformer.B(ReflectionMetadataResolver.EH)) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            NetworkConnectionManager2538 networkConnectionManager2538 = new NetworkConnectionManager2538(cryptographicTransformer.M());
            systemResourceMediator1336 = this.T(networkConnectionManager2538);
            try {
                if (systemResourceMediator1336 == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            Qh qh = systemResourceMediator1336.u();
            try {
                try {
                    if (qh.Y()) return;
                    if (!qh.B(ReflectionMetadataResolver.rl)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
                if (((Double)this.t.J()).longValue() <= 0L) return;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            long l = 1000L;
            long l2 = this.R.d();
            try {
                if (l2 > 1000L) return;
                this.P.m();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
        }
        this.F = systemResourceMediator1336;
    }

    private void k(String string) {
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ContextualRenderingMediator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Nullable
    private Ya M(ContextualEventDispatcher contextualEventDispatcher) {
        Ya ya;
        Float f = this.Z(contextualEventDispatcher);
        try {
            if (f == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            ya = this.n.s() != false ? new DataStreamValidator(this, f) : new NotificationDispatcher2422(this, contextualEventDispatcher, f);
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        Ya ya2 = ya;
        try {
            if (ya2 instanceof CryptographicSecurityProvider) {
                ((CryptographicSecurityProvider)ya2).F(contextualEventDispatcher);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            ya2.F(true);
            ya2.N(0.5f);
            ya2.E(false);
            ya2.i(true);
            ya2.q(false);
            ya2.v(true);
            ya2.J(true);
            ya2.L(((Double)this.T.J()).floatValue() * 0.2f);
            ya2.h(true);
            if (ya2 instanceof CryptographicSecurityProvider) {
                ((CryptographicSecurityProvider)ya2).n(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return ya2;
    }

    @DataExchangeProtocol2090
    public void N(WorldStateTransitioner worldStateTransitioner) {
        this.Y();
    }

    @Nullable
    private Float Z(ContextualEventDispatcher contextualEventDispatcher) {
        float f;
        float f2;
        float f3;
        block16: {
            float f4;
            float f5;
            block15: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                block14: {
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    try {
                        try {
                            if (systemConfigurationOrchestrator != null && !systemConfigurationOrchestrator.Y()) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ContextualRenderingMediator.a(customSystemException);
                        }
                        return null;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualRenderingMediator.a(customSystemException);
                    }
                }
                float f6 = systemConfigurationOrchestrator.q();
                float f7 = systemConfigurationOrchestrator.S();
                double d2 = systemConfigurationOrchestrator.F();
                double d3 = systemConfigurationOrchestrator.t();
                double d4 = systemConfigurationOrchestrator.B();
                double d5 = contextualEventDispatcher.X();
                double d6 = contextualEventDispatcher.F();
                double d7 = contextualEventDispatcher.f();
                f5 = TrajectoryCalculator.x(d2 -= (double)(AdaptiveComputationEngine.S(f6 / 180.0f * (float)Math.PI) * 0.16f), d3 -= (double)0.1f, d4 -= (double)(AdaptiveComputationEngine.D(f6 / 180.0f * (float)Math.PI) * 0.16f), d5, d6, d7);
                try {
                    if (Float.isNaN(f5)) {
                        return null;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
                f3 = -90.0f;
                f2 = 90.0f;
                try {
                    if (!(f5 < 0.0f)) break block15;
                    f4 = f5 - 5.0f;
                    break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
            }
            try {
                f4 = f = f5 > 0.0f ? f5 + 5.0f : f5;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
        }
        if (f < f3) {
            f = f3;
        } else if (f > f2) {
            f = f2;
        }
        return Float.valueOf(f);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ContextualRenderingMediator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ContextualRenderingMediator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ContextualRenderingMediator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void a(WorldStateTransitioner worldStateTransitioner) {
        this.Y();
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private boolean d() {
        try {
            if (!this.s()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            if (!this.z()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        if (this.j != null) {
            boolean bl;
            block15: {
                block14: {
                    ContextualEventDispatcher contextualEventDispatcher = this.j.D();
                    try {
                        block13: {
                            try {
                                try {
                                    if (contextualEventDispatcher == null || contextualEventDispatcher.Y()) break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ContextualRenderingMediator.a(customSystemException);
                                }
                                if (!this.K(contextualEventDispatcher)) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ContextualRenderingMediator.a(customSystemException);
                            }
                        }
                        bl = true;
                        break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualRenderingMediator.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return true;
    }

    private void Y() {
        block4: {
            try {
                try {
                    if (this.j == null || ConfigurationCalibrator.b.N() != this.j.J()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
                ConfigurationCalibrator.b.v(this.j.J());
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
        }
        this.O.b(this);
        this.j = null;
        this.F = null;
        this.r = ReflectionExceptionResolver.ACQUIRING_PEARL;
        this.G.m();
    }

    @Nullable
    private SystemResourceMediator1336 T(NetworkConnectionManager2538 networkConnectionManager2538) {
        Qh qh;
        SystemResourceMediator1336 systemResourceMediator1336;
        block7: {
            systemResourceMediator1336 = this.m.get(networkConnectionManager2538.X());
            try {
                if (systemResourceMediator1336 != null) {
                    return systemResourceMediator1336;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            qh = this.K(networkConnectionManager2538);
            try {
                try {
                    if (qh != null && !qh.Y()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
        }
        systemResourceMediator1336 = new SystemResourceMediator1336(networkConnectionManager2538, qh, null);
        this.m.put(networkConnectionManager2538.X(), systemResourceMediator1336);
        return systemResourceMediator1336;
    }

    private boolean b() {
        boolean bl;
        try {
            if (this.j == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            bl = !ResourceAllocationController1564.h(this.j).F();
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    @Nullable
    private List<SystemResourceMediator1336> g() {
        ConnectionConfigurationResolver connectionConfigurationResolver = ApplicationLifecycleManager.c();
        try {
            if (connectionConfigurationResolver.Y()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        ArrayList<NetworkConnectionManager2538> arrayList = new ArrayList<NetworkConnectionManager2538>();
        ArrayList<Qh> arrayList2 = new ArrayList<Qh>();
        for (Object object : connectionConfigurationResolver.f()) {
            try {
                if (ReflectionMetadataResolver.EH.isInstance(object)) {
                    arrayList.add(new NetworkConnectionManager2538(object));
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            try {
                if (!ReflectionMetadataResolver.UQ.isInstance(object)) continue;
                arrayList2.add(new Qh(object));
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (NetworkConnectionManager2538 networkConnectionManager2538 : arrayList) {
            SystemResourceMediator1336 systemResourceMediator1336 = this.m.get(networkConnectionManager2538.X());
            try {
                if (systemResourceMediator1336 != null) {
                    arrayList3.add(systemResourceMediator1336);
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
            float f = Float.MAX_VALUE;
            Qh qh = null;
            for (Qh qh2 : arrayList2) {
                float f2 = qh2.y(networkConnectionManager2538);
                try {
                    if (!(f2 < f) || !(f2 <= 10.0f)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
                f = f2;
                qh = qh2;
            }
            if (qh == null) continue;
            systemResourceMediator1336 = new SystemResourceMediator1336(networkConnectionManager2538, qh, null);
            this.m.put(networkConnectionManager2538.X(), systemResourceMediator1336);
            arrayList3.add(systemResourceMediator1336);
        }
        Collections.reverse(arrayList3);
        return arrayList3;
    }

    private boolean e(SystemResourceMediator1336 systemResourceMediator1336) {
        NetworkConnectionManager2538 networkConnectionManager2538 = systemResourceMediator1336.P();
        Qh qh = systemResourceMediator1336.u();
        try {
            if (!this.V()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            if (!this.s()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            if (!this.z()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            if (this.U()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            if (this.b()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            if (!this.X(networkConnectionManager2538)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            if (!this.Z(qh)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        ContextualEventDispatcher contextualEventDispatcher = systemResourceMediator1336.H();
        try {
            if (!this.I(contextualEventDispatcher, qh)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            if (!this.K(contextualEventDispatcher)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return this.Z(networkConnectionManager2538);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fb[n4] != null) {
            return n4;
        }
        Object object = bb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 24;
                break;
            }
            case 1: {
                n3 = 54;
                break;
            }
            case 2: {
                n3 = 30;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 27;
                break;
            }
            case 5: {
                n3 = 51;
                break;
            }
            case 6: {
                n3 = 49;
                break;
            }
            case 7: {
                n3 = 21;
                break;
            }
            case 8: {
                n3 = 28;
                break;
            }
            case 9: {
                n3 = 31;
                break;
            }
            case 10: {
                n3 = 8;
                break;
            }
            case 11: {
                n3 = 55;
                break;
            }
            case 12: {
                n3 = 58;
                break;
            }
            case 13: {
                n3 = 5;
                break;
            }
            case 14: {
                n3 = 47;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 16: {
                n3 = 20;
                break;
            }
            case 17: {
                n3 = 60;
                break;
            }
            case 18: {
                n3 = 62;
                break;
            }
            case 19: {
                n3 = 41;
                break;
            }
            case 20: {
                n3 = 23;
                break;
            }
            case 21: {
                n3 = 46;
                break;
            }
            case 22: {
                n3 = 59;
                break;
            }
            case 23: {
                n3 = 26;
                break;
            }
            case 24: {
                n3 = 35;
                break;
            }
            case 25: {
                n3 = 29;
                break;
            }
            case 26: {
                n3 = 32;
                break;
            }
            case 27: {
                n3 = 22;
                break;
            }
            case 28: {
                n3 = 15;
                break;
            }
            case 29: {
                n3 = 25;
                break;
            }
            case 30: {
                n3 = 56;
                break;
            }
            case 31: {
                n3 = 11;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 33: {
                n3 = 52;
                break;
            }
            case 34: {
                n3 = 63;
                break;
            }
            case 35: {
                n3 = 10;
                break;
            }
            case 36: {
                n3 = 42;
                break;
            }
            case 37: {
                n3 = 39;
                break;
            }
            case 38: {
                n3 = 16;
                break;
            }
            case 39: {
                n3 = 18;
                break;
            }
            case 40: {
                n3 = 12;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 40;
                break;
            }
            case 43: {
                n3 = 57;
                break;
            }
            case 44: {
                n3 = 44;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 14;
                break;
            }
            case 47: {
                n3 = 34;
                break;
            }
            case 48: {
                n3 = 19;
                break;
            }
            case 49: {
                n3 = 7;
                break;
            }
            case 50: {
                n3 = 33;
                break;
            }
            case 51: {
                n3 = 17;
                break;
            }
            case 52: {
                n3 = 0;
                break;
            }
            case 53: {
                n3 = 53;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 2;
                break;
            }
            case 56: {
                n3 = 61;
                break;
            }
            case 57: {
                n3 = 9;
                break;
            }
            case 58: {
                n3 = 48;
                break;
            }
            case 59: {
                n3 = 36;
                break;
            }
            case 60: {
                n3 = 50;
                break;
            }
            case 61: {
                n3 = 37;
                break;
            }
            case 62: {
                n3 = 1;
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
        ContextualRenderingMediator.fb[n4] = new String(cArray);
        return n4;
    }

    private static void a() {
        Object[] objectArray = bb;
        bb[0] = "\u001dL\u001f";
        objectArray[1] = Integer.TYPE;
        ContextualRenderingMediator.fb[1] = "java/lang/Integer";
        objectArray[2] = ">J5>jF5E$q\u0017^&B-8";
        objectArray[3] = "b\u0017mN\u0011'i\u0018|\u0001p)b\u0013x[";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "}\u001f.a\u0017|v\u00185\u0002\r7\u001bX;i\u0019p%\u001a`g\u0005L\"\u0006?{\rs\"\u00067{f";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(long l, long l2) {
        int n = ContextualRenderingMediator.a(l, l2);
        Object object = bb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ContextualRenderingMediator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ContextualRenderingMediator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ContextualRenderingMediator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ContextualRenderingMediator.bb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ContextualRenderingMediator.b(221317375996012L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ContextualRenderingMediator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ContextualRenderingMediator.bb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ContextualRenderingMediator.b(221317375996012L, 0L);
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

    private boolean X(NetworkConnectionManager2538 networkConnectionManager2538) {
        boolean bl;
        try {
            if (networkConnectionManager2538.j()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            bl = !networkConnectionManager2538.O();
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x70ED;
        if (L[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = z[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])V.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    V.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ContextualRenderingMediator.L[n2] = n3;
        }
        return L[n2];
    }

    public void D(SystemResourceMediator1336 systemResourceMediator1336) {
        try {
            if (!this.e(systemResourceMediator1336)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        this.B(systemResourceMediator1336);
    }

    private boolean I(@NotNull ContextualEventDispatcher contextualEventDispatcher, @NotNull Qh qh) {
        boolean bl;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        double d2 = systemConfigurationOrchestrator.w(contextualEventDispatcher.X(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
        double d3 = systemConfigurationOrchestrator.y(qh);
        try {
            bl = d2 > d3;
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    private boolean X(ContextualEventDispatcher contextualEventDispatcher) {
        boolean bl;
        double d2 = contextualEventDispatcher.X();
        double d3 = contextualEventDispatcher.F();
        double d4 = contextualEventDispatcher.f();
        float f = Math.abs(this.u(d2, d4));
        double d5 = (Double)this.b.J() / 2.0;
        try {
            if ((double)f > d5) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        double d6 = systemConfigurationOrchestrator.w(d2, d3, d4);
        double d7 = (Double)this.N.J();
        try {
            if (d6 <= d7) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        try {
            if (!this.o.s().booleanValue()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        double d8 = systemConfigurationOrchestrator.V();
        double d9 = d3 - d8;
        try {
            bl = d9 < 7.0;
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    public ContextualRenderingMediator() {
        long l = e ^ 0x3947624F7FA7L;
        super(a.cs((int)ContextualRenderingMediator.a("k", (int)6408, (long)(0x97325E02327E263L ^ l))), (int)ContextualRenderingMediator.a("k", (int)2162, (long)(0x1A642A7FAC2731AL ^ l)), RecursiveNodeGraph.K, a.cs((int)ContextualRenderingMediator.a("k", (int)14775, (long)(0x412CE3FEAA1AC2D1L ^ l))));
        this.v = new AuthenticationGateway1860((String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)9176, (long)(0x1D285C6F6C87D8B4L ^ l)), (long)-8392037381169899022L, (long)l)));
        this.T = NumericPrecisionTransformer.D(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)1015, (long)(0x452AD0FFF245789EL ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)28283, (long)(0x6DDDE7E27BAC1503L ^ l)), (long)-8392037381169899022L, (long)l)), "", 0.1, 5.0, 15.0, 0.5, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)17844, (long)(0x280F1FD7CA923ED9L ^ l)), (long)-8392037381169899022L, (long)l)));
        this.O = ConfigurationRegistry.O;
        this.l = ColorPaletteManager.r(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)14877, (long)(0x589E6043DD8B4161L ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)22416, (long)(0x744C52BF039F2CF3L ^ l)), (long)-8392037381169899022L, (long)l)), ColorPaletteManager.U, new RecursiveNodeTreeBuilder((String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)27407, (long)(0x2FAAFA087F1D9074L ^ l)), (long)-8392037381169899022L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)21107, (long)(0x6B35010475CD2936L ^ l)), (long)-8392037381169899022L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)4331, (long)(0x2B6D1D295C5FEB8AL ^ l)), (long)-8392037381169899022L, (long)l))));
        this.m = new HashMap<Integer, SystemResourceMediator1336>();
        this.K = new HashSet<Integer>();
        this.w = new NetworkConfigManager();
        this.t = NumericPrecisionTransformer.b(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)1336, (long)(0x27E04AFD31557E57L ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)10435, (long)(0x56432C8731DB53B9L ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)28471, (long)(0x6A7002A4311E9470L ^ l)), (long)-8392037381169899022L, (long)l)), 0.0, 1.0, 15.0, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)26561, (long)(0x4FE1F76DF2519CB3L ^ l)), (long)-8392037381169899022L, (long)l)));
        this.N = NumericPrecisionTransformer.D(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)16601, (long)(0x1CDA466501F0BBA4L ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)29985, (long)(0x42E66DACB9B8E50L ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)9957, (long)(0x7A22E9A860B6DD9BL ^ l)), (long)-8392037381169899022L, (long)l)), 0.0, 6.0, 10.0, 0.1, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)11910, (long)(0x2BBFD391A33D55FFL ^ l)), (long)-8392037381169899022L, (long)l)));
        this.b = NumericPrecisionTransformer.D(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)8429, (long)(0x5B3B64F8EB25B87L ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)17280, (long)(0xE527ADC09CBB8F3L ^ l)), (long)-8392037381169899022L, (long)l)), "", 30.0, 180.0, 360.0, 5.0, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)24872, (long)(0x34F22B6D4AAC9A57L ^ l)), (long)-8392037381169899022L, (long)l)));
        this.X = AuthenticationStateTracker.R(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)30430, (long)(0x696357302A8D9AL ^ l)), (long)-8392037381169899022L, (long)l)), true, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)3816, (long)(0x23E3DCE36630759EL ^ l)), (long)-8392037381169899022L, (long)l)));
        this.A = NumericPrecisionTransformer.D(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)11275, (long)(0x5F8596131522576FL ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)717, (long)(0x559BDD97FE0279AFL ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)3749, (long)(0x191585160BEC75C2L ^ l)), (long)-8392037381169899022L, (long)l)), 1.0, 5.0, 20.0, 1.0, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)26093, (long)(0x1CB4E76BA5459E99L ^ l)), (long)-8392037381169899022L, (long)l)));
        this.x = new AuthenticationGateway1860((String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)6435, (long)(0x3C09F3B77D4CE243L ^ l)), (long)-8392037381169899022L, (long)l)));
        this.B = GenericAdapterManager.I(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)15486, (long)(0x2E8DD149BB37471BL ^ l)), (long)-8392037381169899022L, (long)l)), (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)23814, (long)(0x295D76111D9A2640L ^ l)), (long)-8392037381169899022L, (long)l)), this.x, this.x, this.v);
        this.n = AuthenticationStateTracker.R(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)3919, (long)(0x772F1E58D721F438L ^ l)), (long)-8392037381169899022L, (long)l)), false, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)20221, (long)(0x1E829212595EB58DL ^ l)), (long)-8392037381169899022L, (long)l)));
        this.G = new NetworkConfigManager();
        this.P = new NetworkConfigManager();
        this.R = new NetworkConfigManager();
        this.o = AuthenticationStateTracker.R(this, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)20731, (long)(0x56573617E8B62B95L ^ l)), (long)-8392037381169899022L, (long)l)), false, (String)((Object)ContextualRenderingMediator.c("v", (int)ContextualRenderingMediator.a("k", (int)25149, (long)(0x59EFD71723B39948L ^ l)), (long)-8392037381169899022L, (long)l)));
        this.j = null;
        this.r = ReflectionExceptionResolver.ACQUIRING_PEARL;
        this.h = false;
        this.X.l(this.l);
        this.X.E(this.l);
        this.N(this.B, this.T, this.b, this.A, this.N, this.o, this.t, this.n, this.X, this.l);
        this.O.y(this, 7);
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

    private float u(double d2, double d3) {
        double d4;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block6: {
            double d5;
            double d6;
            block5: {
                block4: {
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    d6 = d2 - systemConfigurationOrchestrator.F();
                    d5 = d3 - systemConfigurationOrchestrator.B();
                    try {
                        if (!(d5 < 0.0) || !(d6 < 0.0)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualRenderingMediator.a(customSystemException);
                    }
                    d4 = 90.0 + Math.toDegrees(Math.atan(d5 / d6));
                    break block6;
                }
                try {
                    if (!(d5 < 0.0) || !(d6 > 0.0)) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
                d4 = -90.0 + Math.toDegrees(Math.atan(d5 / d6));
                break block6;
            }
            d4 = Math.toDegrees(-Math.atan(d6 / d5));
        }
        return AdaptiveComputationEngine.v(-(systemConfigurationOrchestrator.q() - (float)d4));
    }

    private boolean V() {
        boolean bl;
        int n = this.E();
        try {
            bl = n != -1;
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    @Override
    public void v() {
        this.Y();
    }

    private boolean U() {
        boolean bl;
        long l = ((Double)this.t.J()).longValue();
        try {
            if ((double)l <= 0.0) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        long l2 = this.P.d();
        long l3 = l2 / 1000L;
        try {
            bl = l3 < l;
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    private boolean K(ContextualEventDispatcher contextualEventDispatcher) {
        boolean bl;
        block9: {
            try {
                try {
                    if (contextualEventDispatcher != null && !contextualEventDispatcher.Y()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualRenderingMediator.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualRenderingMediator.a(customSystemException);
            }
        }
        try {
            if (!this.X(contextualEventDispatcher)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        Float f = this.Z(contextualEventDispatcher);
        try {
            bl = f != null;
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualRenderingMediator.a(customSystemException);
        }
        return bl;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ContextualRenderingMediator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ContextualRenderingMediator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    @DataExchangeProtocol2090
    public void c(KB var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 19[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ContextualRenderingMediator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ContextualRenderingMediator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

