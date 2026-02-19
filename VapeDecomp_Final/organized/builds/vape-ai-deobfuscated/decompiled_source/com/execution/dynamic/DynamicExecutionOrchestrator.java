/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.execution.dynamic;

import a.KB;
import a.Ne;
import a.a;
import a.kg;
import com.adapter.management.GenericAdapterManager;
import com.app.messaging.MessageRouter2655;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.EventBroadcastCoordinator;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.event.NetworkEventDispatcher;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.network.transmission.DataTransmissionManager2384;
import com.numeric.precision.NumericPrecisionTransformer;
import com.object.lifecycle.ObjectLifecycleMediator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.authentication.AuthenticationGateway1860;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.tokenization.SecureTokenGenerator1301;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class DynamicExecutionOrchestrator
extends ContextualExecutionFramework {
    private boolean n;
    private boolean m;
    private final NetworkConfigManager b;
    int G;
    private final NumericPrecisionTransformer v;
    private final AuthenticationGateway1860 T;
    private final List<kg> j;
    private final AuthenticationGateway1860 Y;
    private final AuthenticationStateTracker B;
    private final ObjectLifecycleMediator F;
    private int d;
    private static final String[] A;
    private static final Map o;
    private final Runnable N;
    private final GenericAdapterManager r;
    private final AuthenticationStateTracker x;
    private boolean Z;
    private DataTransmissionManager2384 w;
    private final Queue<MessageRouter2655> O;
    private static final long e;
    private final NetworkConfigManager z;
    private final AuthenticationStateTracker R;
    private static final Object[] t;
    private static final Integer[] l;
    private static final long[] h;
    public NumericComputationEngine1131 L;

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicExecutionOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void h() {
        block5: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block6: {
                long l = e ^ 0x1C7010155941L;
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        super.y(false, true);
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
                try {
                    if (!this.R.s().booleanValue()) break block5;
                    this.w = DataTransmissionManager2384.h(ApplicationLifecycleManager.c(), ApplicationLifecycleManager.U().B());
                    this.d = DynamicContextBroker.M();
                    this.w.R(systemConfigurationOrchestrator, true);
                    if (GeometryCalculator.C() < 37) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
                this.w.f(this.d);
                UUID uUID = UUID.nameUUIDFromBytes(((String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)11315, (long)(0x648DE4686D8ED8FCL ^ l)), (long)-4114260797138000343L, (long)l)) + systemConfigurationOrchestrator.e()).getBytes(StandardCharsets.UTF_8));
                this.w.A(uUID);
            }
            this.J();
            this.w.C(systemConfigurationOrchestrator.J());
            ApplicationLifecycleManager.c().c(this.d, this.w);
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '$' || c == '\u00d6' || c == '\u00e9' || c == 'm') {
                field = DynamicExecutionOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '$' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicExecutionOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (A[n4] != null) {
            return n4;
        }
        Object object = t[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 40;
                break;
            }
            case 1: {
                n3 = 62;
                break;
            }
            case 2: {
                n3 = 28;
                break;
            }
            case 3: {
                n3 = 7;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 44;
                break;
            }
            case 8: {
                n3 = 14;
                break;
            }
            case 9: {
                n3 = 13;
                break;
            }
            case 10: {
                n3 = 17;
                break;
            }
            case 11: {
                n3 = 63;
                break;
            }
            case 12: {
                n3 = 55;
                break;
            }
            case 13: {
                n3 = 38;
                break;
            }
            case 14: {
                n3 = 21;
                break;
            }
            case 15: {
                n3 = 10;
                break;
            }
            case 16: {
                n3 = 34;
                break;
            }
            case 17: {
                n3 = 23;
                break;
            }
            case 18: {
                n3 = 36;
                break;
            }
            case 19: {
                n3 = 56;
                break;
            }
            case 20: {
                n3 = 43;
                break;
            }
            case 21: {
                n3 = 24;
                break;
            }
            case 22: {
                n3 = 1;
                break;
            }
            case 23: {
                n3 = 49;
                break;
            }
            case 24: {
                n3 = 52;
                break;
            }
            case 25: {
                n3 = 39;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 22;
                break;
            }
            case 28: {
                n3 = 54;
                break;
            }
            case 29: {
                n3 = 47;
                break;
            }
            case 30: {
                n3 = 46;
                break;
            }
            case 31: {
                n3 = 5;
                break;
            }
            case 32: {
                n3 = 25;
                break;
            }
            case 33: {
                n3 = 33;
                break;
            }
            case 34: {
                n3 = 32;
                break;
            }
            case 35: {
                n3 = 6;
                break;
            }
            case 36: {
                n3 = 45;
                break;
            }
            case 37: {
                n3 = 26;
                break;
            }
            case 38: {
                n3 = 18;
                break;
            }
            case 39: {
                n3 = 20;
                break;
            }
            case 40: {
                n3 = 27;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 9;
                break;
            }
            case 43: {
                n3 = 57;
                break;
            }
            case 44: {
                n3 = 31;
                break;
            }
            case 45: {
                n3 = 58;
                break;
            }
            case 46: {
                n3 = 35;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 16;
                break;
            }
            case 49: {
                n3 = 37;
                break;
            }
            case 50: {
                n3 = 12;
                break;
            }
            case 51: {
                n3 = 42;
                break;
            }
            case 52: {
                n3 = 41;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 59;
                break;
            }
            case 56: {
                n3 = 15;
                break;
            }
            case 57: {
                n3 = 0;
                break;
            }
            case 58: {
                n3 = 51;
                break;
            }
            case 59: {
                n3 = 8;
                break;
            }
            case 60: {
                n3 = 61;
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
                n3 = 53;
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
        DynamicExecutionOrchestrator.A[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = DynamicExecutionOrchestrator.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            String string = A[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicExecutionOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicExecutionOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicExecutionOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    DynamicExecutionOrchestrator.t[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicExecutionOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicExecutionOrchestrator.t[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicExecutionOrchestrator.b(252434736480041L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public String H() {
        int n = this.y();
        try {
            if (n == 0) {
                return "";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicExecutionOrchestrator.a(customSystemException);
        }
        return String.valueOf(n);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicExecutionOrchestrator.e = MultiContainerRegistry.a(-5660556442456745686L, 8616157053813776277L, MethodHandles.lookup().lookupClass()).a(239646387707704L);
                DynamicExecutionOrchestrator.t = new Object[5];
                DynamicExecutionOrchestrator.A = new String[5];
                DynamicExecutionOrchestrator.d();
                DynamicExecutionOrchestrator.o = new HashMap<K, V>(13);
                var0 = DynamicExecutionOrchestrator.e ^ 7432845490759L;
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
                var8_3 = new long[17];
                var5_4 = 0;
                var6_5 = "\u0007;\u00cd\u00d9%\u0012\u0004s\u00e1\u008bS\u00f5\u00a0\u00be\u00e4\u0010\u00a9\u00ef\u00d7\u00f9J\u0098\u00dc\u00f23q\u00e3\u00d8\u00ce\u00a6(\u00caa\u00983w\u00fa8\u00b0\u00b6\u00aaj\u009101\u001a\u00d1:\u0084\u00a9\u00a3wR\u00eb\u00e1\u001e\u00b6\u00882\u000f!c}B\u000b\\7\u00ba+\u00ad\u00a2\u00aa\u0013.\u00d0Q\u00af\u001bi\u00a1\u00ef5\u0096\rD\u00ba:oc\u0093\u0015\u00b4\u00eb\u00cf\u0091\u00dc\u0081\u00b3\u00f4\u0081b\u009c\u00b1s <\u001fU\u00f1\u00ab4?y\u00f6k\u008f:\u00d6]\u0091";
                var7_6 = "\u0007;\u00cd\u00d9%\u0012\u0004s\u00e1\u008bS\u00f5\u00a0\u00be\u00e4\u0010\u00a9\u00ef\u00d7\u00f9J\u0098\u00dc\u00f23q\u00e3\u00d8\u00ce\u00a6(\u00caa\u00983w\u00fa8\u00b0\u00b6\u00aaj\u009101\u001a\u00d1:\u0084\u00a9\u00a3wR\u00eb\u00e1\u001e\u00b6\u00882\u000f!c}B\u000b\\7\u00ba+\u00ad\u00a2\u00aa\u0013.\u00d0Q\u00af\u001bi\u00a1\u00ef5\u0096\rD\u00ba:oc\u0093\u0015\u00b4\u00eb\u00cf\u0091\u00dc\u0081\u00b3\u00f4\u0081b\u009c\u00b1s <\u001fU\u00f1\u00ab4?y\u00f6k\u008f:\u00d6]\u0091".length();
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
                    var6_5 = "\u009f\u00b5Y\u00fe\u00d9c\u00c3`ei\u00f9\u00d4\u009bH5b";
                    var7_6 = "\u009f\u00b5Y\u00fe\u00d9c\u00c3`ei\u00f9\u00d4\u009bH5b".length();
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
        DynamicExecutionOrchestrator.h = var8_3;
        DynamicExecutionOrchestrator.l = new Integer[17];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private int y() {
        return this.G;
    }

    @Override
    public void v() {
        block9: {
            block8: {
                try {
                    try {
                        this.j.clear();
                        if (!ApplicationLifecycleManager.U().Y() && !ApplicationLifecycleManager.c().Y()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicExecutionOrchestrator.a(customSystemException);
                    }
                    this.w = null;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
            }
            try {
                try {
                    if (this.w == null || !ApplicationLifecycleManager.c().I(this.w.X()).r()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
                ApplicationLifecycleManager.c().d(this.w);
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicExecutionOrchestrator.a(customSystemException);
            }
        }
        this.w = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void lambda$new$0() {
        try {
            while (this.Z) {
                try {
                    Thread.sleep(50L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicExecutionOrchestrator.a(customSystemException);
        }
    }

    public DynamicExecutionOrchestrator() {
        long l = e ^ 0x4A4E1ABF1AB8L;
        super(a.cs((int)DynamicExecutionOrchestrator.a("g", (int)10940, (long)(0x597FECFC83869D82L ^ l))), (int)DynamicExecutionOrchestrator.a("g", (int)15742, (long)(0x41903FF7114C8A4BL ^ l)), RecursiveNodeGraph.K, a.cs((int)DynamicExecutionOrchestrator.a("g", (int)19553, (long)(0x1F3D8EE6DBD67B5CL ^ l))));
        this.T = new AuthenticationGateway1860((String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)14431, (long)(0x6BDB1AD5A5F50F6CL ^ l)), (long)-8854530259258939952L, (long)l)));
        this.Y = new AuthenticationGateway1860((String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)28808, (long)(0x7892951BA5B447BCL ^ l)), (long)-8854530259258939952L, (long)l)));
        this.r = GenericAdapterManager.I(this, (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)24270, (long)(0x63E7EA27A011E9F7L ^ l)), (long)-8854530259258939952L, (long)l)), (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)19938, (long)(0x385BBD40394A7AD2L ^ l)), (long)-8854530259258939952L, (long)l)), this.T, this.T, this.Y);
        this.B = AuthenticationStateTracker.R(this, (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)22917, (long)(0x217B0A8E23F3EEB7L ^ l)), (long)-8854530259258939952L, (long)l)), false, (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)28328, (long)(0x677B98920088D98EL ^ l)), (long)-8854530259258939952L, (long)l)));
        this.R = AuthenticationStateTracker.R(this, (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)28860, (long)(0x3660326A65AFC786L ^ l)), (long)-8854530259258939952L, (long)l)), false, (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)10394, (long)(0x16091F0582B11FA6L ^ l)), (long)-8854530259258939952L, (long)l)));
        this.x = AuthenticationStateTracker.R(this, (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)11267, (long)(0x6FD51DCFD7251B3BL ^ l)), (long)-8854530259258939952L, (long)l)), false, (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)22483, (long)(0x13C2E3EE89BA60E8L ^ l)), (long)-8854530259258939952L, (long)l)));
        this.v = NumericPrecisionTransformer.D(this, (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)24902, (long)(0x3F4CC6C51DC5D671L ^ l)), (long)-8854530259258939952L, (long)l)), (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)24069, (long)(0xE35975F226E93AL ^ l)), (long)-8854530259258939952L, (long)l)), "", 0.0, 50.0, 100.0, 1.0, (String)((Object)DynamicExecutionOrchestrator.c("\u00e1", (int)DynamicExecutionOrchestrator.a("g", (int)3938, (long)(0x76B7A54CD5163853L ^ l)), (long)-8854530259258939952L, (long)l)));
        this.F = ObjectLifecycleMediator.P;
        this.O = new ConcurrentLinkedQueue<MessageRouter2655>();
        this.j = new CopyOnWriteArrayList<kg>();
        this.z = new NetworkConfigManager();
        this.b = new NetworkConfigManager();
        this.G = 0;
        this.Z = false;
        this.N = this::lambda$new$0;
        this.x.l(this.v);
        this.N(this.r, this.B, this.R, this.x, this.v);
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

    private void c() {
        this.Z = false;
        this.b.m();
        this.m = false;
        this.G = 0;
        for (MessageRouter2655 messageRouter2655 : this.O) {
            try {
                messageRouter2655.F(this.F);
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        try {
            this.O.clear();
            if (this.n) {
                super.y(false, true);
                this.n = false;
            }
        }
        catch (Exception exception) {
            throw DynamicExecutionOrchestrator.a(exception);
        }
    }

    private void J() {
        double d2;
        double d3;
        DataTransmissionManager2384 dataTransmissionManager2384;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block9: {
            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                block8: {
                    try {
                        try {
                            if (systemConfigurationOrchestrator.r() || this.w.r()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicExecutionOrchestrator.a(customSystemException);
                        }
                        if (this.R.s().booleanValue()) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicExecutionOrchestrator.a(customSystemException);
                    }
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicExecutionOrchestrator.a(customSystemException);
            }
        }
        try {
            dataTransmissionManager2384 = this.w;
            d3 = systemConfigurationOrchestrator.F();
            d2 = DynamicContextBroker.e ? systemConfigurationOrchestrator.V() : systemConfigurationOrchestrator.V() - 1.5;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicExecutionOrchestrator.a(customSystemException);
        }
        dataTransmissionManager2384.u(d3, d2, systemConfigurationOrchestrator.B(), systemConfigurationOrchestrator.q(), systemConfigurationOrchestrator.S());
        this.w.C(systemConfigurationOrchestrator.J());
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicExecutionOrchestrator.a(l, l2);
            object = t[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicExecutionOrchestrator.t[n] = clazz = Class.forName(A[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DynamicExecutionOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicExecutionOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean a() {
        boolean bl;
        block5: {
            block4: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    try {
                        if (systemConfigurationOrchestrator.G() == 0.0 && systemConfigurationOrchestrator.o() == 0.0) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicExecutionOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static void d() {
        Object[] objectArray = t;
        t[0] = "J\\S";
        objectArray[1] = Integer.TYPE;
        DynamicExecutionOrchestrator.A[1] = "java/lang/Integer";
        objectArray[2] = " .s#\u0011,+!bll48&k%";
        objectArray[3] = "X\t NPES\u00061\u00011KX\r5[";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "!RxXJ35Eg%P2NHs\u0014B,3CpO;p3Xd\u0015K\"#Q#%";
    }

    @Override
    public void y(boolean bl, boolean bl2) {
        block3: {
            block2: {
                try {
                    if (bl) break block2;
                    this.m = true;
                    this.n = true;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
            }
            super.y(true, bl2);
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicExecutionOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @DataExchangeProtocol2090
    public void C(KB var1_1) {
        block86: {
            block85: {
                block83: {
                    block84: {
                        block82: {
                            block81: {
                                block80: {
                                    block73: {
                                        block76: {
                                            block77: {
                                                block79: {
                                                    block78: {
                                                        block75: {
                                                            block74: {
                                                                block72: {
                                                                    block70: {
                                                                        block71: {
                                                                            var2_2 = DynamicExecutionOrchestrator.e ^ 63197745947741L;
                                                                            var5_3 = var1_1.getThePlayer();
                                                                            var4_4 = SecureTokenGenerator1301.Z();
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v0 = ((NetworkConnectionEstablisher)this.r.J()).equals(this.Y);
                                                                                                            if (var4_4 != null) break block70;
                                                                                                            if (v0 == 0) break block71;
                                                                                                        }
                                                                                                        catch (CustomSystemException v1) {
                                                                                                            throw DynamicExecutionOrchestrator.a(v1);
                                                                                                        }
                                                                                                        v0 = this.b.m(50L);
                                                                                                        if (var4_4 != null) break block70;
                                                                                                    }
                                                                                                    catch (CustomSystemException v2) {
                                                                                                        throw DynamicExecutionOrchestrator.a(v2);
                                                                                                    }
                                                                                                    if (v0 == 0) break block71;
                                                                                                }
                                                                                                catch (CustomSystemException v3) {
                                                                                                    throw DynamicExecutionOrchestrator.a(v3);
                                                                                                }
                                                                                                v0 = this.Z;
                                                                                                if (var4_4 != null) break block70;
                                                                                            }
                                                                                            catch (CustomSystemException v4) {
                                                                                                throw DynamicExecutionOrchestrator.a(v4);
                                                                                            }
                                                                                            if (v0 != 0) break block71;
                                                                                        }
                                                                                        catch (CustomSystemException v5) {
                                                                                            throw DynamicExecutionOrchestrator.a(v5);
                                                                                        }
                                                                                        v0 = (int)var5_3.r();
                                                                                        if (var4_4 != null) break block70;
                                                                                    }
                                                                                    catch (CustomSystemException v6) {
                                                                                        throw DynamicExecutionOrchestrator.a(v6);
                                                                                    }
                                                                                    if (v0 == 0) break block71;
                                                                                }
                                                                                catch (CustomSystemException v7) {
                                                                                    throw DynamicExecutionOrchestrator.a(v7);
                                                                                }
                                                                                this.b.m();
                                                                                this.Z = true;
                                                                                var5_3.U().f().Z().eventLoop().execute(this.N);
                                                                            }
                                                                            catch (CustomSystemException v8) {
                                                                                throw DynamicExecutionOrchestrator.a(v8);
                                                                            }
                                                                        }
                                                                        v0 = this.m;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var4_4 != null) break block72;
                                                                            if (v0 != 0) break block73;
                                                                        }
                                                                        catch (CustomSystemException v9) {
                                                                            throw DynamicExecutionOrchestrator.a(v9);
                                                                        }
                                                                        v0 = this.x.s().booleanValue();
                                                                    }
                                                                    catch (CustomSystemException v10) {
                                                                        throw DynamicExecutionOrchestrator.a(v10);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var4_4 != null) break block74;
                                                                        if (v0 == 0) break block73;
                                                                    }
                                                                    catch (CustomSystemException v11) {
                                                                        throw DynamicExecutionOrchestrator.a(v11);
                                                                    }
                                                                    cfr_temp_0 = (Double)this.v.J() - 0.0;
                                                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                }
                                                                catch (CustomSystemException v12) {
                                                                    throw DynamicExecutionOrchestrator.a(v12);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var4_4 != null) break block75;
                                                                    if (v0 <= 0) break block73;
                                                                }
                                                                catch (CustomSystemException v13) {
                                                                    throw DynamicExecutionOrchestrator.a(v13);
                                                                }
                                                                v0 = this.y();
                                                            }
                                                            catch (CustomSystemException v14) {
                                                                throw DynamicExecutionOrchestrator.a(v14);
                                                            }
                                                        }
                                                        var6_5 = v0;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (!((double)var6_5 >= (Double)this.v.J())) break block73;
                                                                                v15 = this;
                                                                                if (var4_4 != null) break block76;
                                                                            }
                                                                            catch (CustomSystemException v16) {
                                                                                throw DynamicExecutionOrchestrator.a(v16);
                                                                            }
                                                                            if (v15.w == null) break block77;
                                                                        }
                                                                        catch (CustomSystemException v17) {
                                                                            throw DynamicExecutionOrchestrator.a(v17);
                                                                        }
                                                                        v15 = this;
                                                                        if (var4_4 != null) break block76;
                                                                    }
                                                                    catch (CustomSystemException v18) {
                                                                        throw DynamicExecutionOrchestrator.a(v18);
                                                                    }
                                                                    if (!v15.w.r()) break block77;
                                                                }
                                                                catch (CustomSystemException v19) {
                                                                    throw DynamicExecutionOrchestrator.a(v19);
                                                                }
                                                                v20 = this.w;
                                                                v21 = var5_3.F();
                                                                if (!DynamicContextBroker.e) break block78;
                                                            }
                                                            catch (CustomSystemException v22) {
                                                                throw DynamicExecutionOrchestrator.a(v22);
                                                            }
                                                            v23 = var5_3.V();
                                                            break block79;
                                                        }
                                                        catch (CustomSystemException v24) {
                                                            throw DynamicExecutionOrchestrator.a(v24);
                                                        }
                                                    }
                                                    v23 = var5_3.V() - 1.5;
                                                }
                                                v20.u(v21, v23, var5_3.B(), var5_3.q(), var5_3.S());
                                                this.w.C(var5_3.J());
                                            }
                                            this.j.clear();
                                            this.m = true;
                                            v15 = this;
                                        }
                                        v15.n = false;
                                    }
                                    var6_6 = ApplicationLifecycleManager.X();
                                    try {
                                        try {
                                            v25 = var6_6.B(ReflectionMetadataResolver.Uk);
                                            if (var4_4 != null) break block80;
                                            if (!v25) {
                                            }
                                            ** GOTO lbl187
                                        }
                                        catch (CustomSystemException v26) {
                                            throw DynamicExecutionOrchestrator.a(v26);
                                        }
                                        v25 = var6_6.B(ReflectionMetadataResolver.B);
                                    }
                                    catch (CustomSystemException v27) {
                                        throw DynamicExecutionOrchestrator.a(v27);
                                    }
                                }
                                try {
                                    try {
                                        if (var4_4 != null) break block81;
                                        if (!v25) {
                                        }
                                        ** GOTO lbl187
                                    }
                                    catch (CustomSystemException v28) {
                                        throw DynamicExecutionOrchestrator.a(v28);
                                    }
                                    v25 = var6_6.B(ReflectionMetadataResolver.D);
                                }
                                catch (CustomSystemException v29) {
                                    throw DynamicExecutionOrchestrator.a(v29);
                                }
                            }
                            try {
                                try {
                                    if (var4_4 != null) break block82;
                                    if (!v25) {
                                    }
                                    ** GOTO lbl187
                                }
                                catch (CustomSystemException v30) {
                                    throw DynamicExecutionOrchestrator.a(v30);
                                }
                                v25 = ApplicationLifecycleManager.U().Y();
                            }
                            catch (CustomSystemException v31) {
                                throw DynamicExecutionOrchestrator.a(v31);
                            }
                        }
                        try {
                            try {
                                if (var4_4 != null) break block83;
                                if (!v25) break block84;
                            }
                            catch (CustomSystemException v32) {
                                throw DynamicExecutionOrchestrator.a(v32);
                            }
lbl187:
                            // 4 sources

                            this.m = true;
                        }
                        catch (CustomSystemException v33) {
                            throw DynamicExecutionOrchestrator.a(v33);
                        }
                    }
                    try {
                        v34 = this;
                        if (var4_4 != null) break block85;
                        v25 = v34.m;
                    }
                    catch (CustomSystemException v35) {
                        throw DynamicExecutionOrchestrator.a(v35);
                    }
                }
                if (!v25) break block86;
                v34 = this;
            }
            v34.c();
        }
        try {
            if (var4_4 != null) {
                AbstractComputationKernel.I(new String[1]);
            }
        }
        catch (CustomSystemException v36) {
            throw DynamicExecutionOrchestrator.a(v36);
        }
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEREST)
    public void W(NetworkEventDispatcher networkEventDispatcher) {
        block18: {
            try {
                this.z.m();
                if (!Thread.currentThread().equals(EventBroadcastCoordinator.W.R())) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicExecutionOrchestrator.a(customSystemException);
            }
            try {
                if (networkEventDispatcher.isCanceled()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicExecutionOrchestrator.a(customSystemException);
            }
            ConnectionLifecycleHandler connectionLifecycleHandler = networkEventDispatcher.getPacket();
            try {
                if (this.F.n(connectionLifecycleHandler)) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicExecutionOrchestrator.a(customSystemException);
            }
            try {
                ++this.G;
                if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.L) || !this.a()) break block18;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicExecutionOrchestrator.a(customSystemException);
            }
            int n = this.y();
            if (n % 5 == 0) {
                int n2;
                double d2;
                int n3;
                double d3;
                boolean bl;
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    bl = n % 2 == 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
                boolean bl2 = bl;
                try {
                    d3 = 0.2;
                    n3 = bl2 ? -1 : 1;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
                double d4 = d3 * (double)n3 * Math.cos(Math.toRadians(systemConfigurationOrchestrator.q()));
                try {
                    d2 = 0.2;
                    n2 = bl2 ? -1 : 1;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
                double d5 = d2 * (double)n2 * Math.sin(Math.toRadians(systemConfigurationOrchestrator.q()));
                this.j.add(new kg(systemConfigurationOrchestrator.F() + d4, systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B() + d5));
            }
        }
        this.O.add(new MessageRouter2655(networkEventDispatcher));
        networkEventDispatcher.setCanceled(true);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void e(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3229;
        if (DynamicExecutionOrchestrator.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicExecutionOrchestrator.l[n2] = n3;
        }
        return DynamicExecutionOrchestrator.l[n2];
    }

    @DataExchangeProtocol2090
    public void B(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        block12: {
            try {
                try {
                    if (this.B.s().booleanValue() && !this.j.isEmpty()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicExecutionOrchestrator.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicExecutionOrchestrator.a(customSystemException);
            }
        }
        try {
            eventDispatchRegistry2111.getEntityRenderer().H(1.0);
            CryptoContextNegotiator684.Y();
            if (!ConfigurationManager.U()) {
                Ne.h.y(3042);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glLineWidth((float)1.5f);
                Ne.h.z(3553);
                Ne.h.y(2848);
                Ne.h.z(2929);
                GL11.glDepthMask((boolean)false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicExecutionOrchestrator.a(customSystemException);
        }
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        boolean bl = true;
        for (kg kg2 : this.j) {
            Color color = Color.RED;
            if (bl) {
                color = Color.YELLOW;
                bl = false;
            }
            CryptoContextNegotiator684.x(kg2.K - 0.1, kg2.w, kg2.O - 0.1, 0.2, 0.0, 0.2, 1.0, Color.BLACK, color, d2, d3, d4);
        }
        try {
            if (!ConfigurationManager.U()) {
                GL11.glDepthMask((boolean)true);
                Ne.h.y(2929);
                Ne.h.y(3553);
                Ne.h.z(2848);
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicExecutionOrchestrator.a(customSystemException);
        }
        CryptoContextNegotiator684.J();
        eventDispatchRegistry2111.getEntityRenderer().F(1.0);
    }

    private static Method d(long l, long l2) {
        int n = DynamicExecutionOrchestrator.a(l, l2);
        Object object = t[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = A[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicExecutionOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicExecutionOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicExecutionOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicExecutionOrchestrator.t[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicExecutionOrchestrator.b(252434736480041L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicExecutionOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicExecutionOrchestrator.t[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicExecutionOrchestrator.b(252434736480041L, 0L);
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicExecutionOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicExecutionOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("a/AT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicExecutionOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicExecutionOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

