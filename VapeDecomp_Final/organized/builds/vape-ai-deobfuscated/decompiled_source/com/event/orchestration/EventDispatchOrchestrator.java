/*
 * Decompiled with CFR 0.152.
 */
package com.event.orchestration;

import a.KB;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.xml.generation.XmlGenerator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.protocol.ProtocolInteractionController;
import com.network.streaming.DataStreamProcessor1233;
import com.numeric.precision.NumericPrecisionTransformer;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.system.configuration.SystemConfigurationManager2161;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class EventDispatchOrchestrator
extends XmlGenerator {
    private final AuthenticationGateway1860 Z;
    private final AuthenticationGateway1860 V;
    private static final Map j;
    private final NumericFormattingUtility d;
    private NetworkConfigManager X;
    private final AuthenticationStateTracker B;
    private static final String[] m;
    private static final long b;
    private final NumericPrecisionTransformer O;
    private final AuthenticationGateway1860 N;
    int r;
    private final AuthenticationStateTracker[] z;
    private boolean P;
    private static final long[] e;
    private final GenericAdapterManager o;
    private static final Integer[] h;
    private static final Object[] l;
    private NetworkConfigManager t;
    private final Queue<SystemConfigurationManager2161> K;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = EventDispatchOrchestrator.a(l, l2);
        Object object = EventDispatchOrchestrator.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = EventDispatchOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EventDispatchOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EventDispatchOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    EventDispatchOrchestrator.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EventDispatchOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EventDispatchOrchestrator.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EventDispatchOrchestrator.b(262127124117622L, 0L);
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
        int n2 = EventDispatchOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = EventDispatchOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EventDispatchOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EventDispatchOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'T' || c == '\u00f3' || c == 'a' || c == 'r') {
                field = EventDispatchOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EventDispatchOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void v() {
        this.P = false;
        this.K.clear();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private boolean I(int n) {
        int n2;
        block11: {
            block12: {
                block10: {
                    try {
                        if (!this.B.s().booleanValue()) {
                            ApplicationLifecycleManager.U().l().A(n);
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchOrchestrator.a(customSystemException);
                    }
                    try {
                        if (!this.t.m(((Double)this.O.J()).longValue())) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchOrchestrator.a(customSystemException);
                    }
                    n2 = ApplicationLifecycleManager.U().l().v();
                    try {
                        if (n <= n2) break block10;
                        ++n2;
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchOrchestrator.a(customSystemException);
                    }
                }
                try {
                    if (n >= n2) break block12;
                    --n2;
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchOrchestrator.a(customSystemException);
                }
            }
            this.t.m();
            return true;
        }
        ApplicationLifecycleManager.U().l().A(n2);
        return false;
    }

    public EventDispatchOrchestrator() {
        long l = b ^ 0xB3FB35EAD82L;
        super(a.cs((int)EventDispatchOrchestrator.a("x", (int)4298, (long)(0x722415FEF64DBC2CL ^ l))), RecursiveNodeGraph.W, "");
        this.K = new ArrayDeque<SystemConfigurationManager2161>();
        this.Z = new AuthenticationGateway1860((String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)1942, (long)(0x46759B8B1CC12B78L ^ l)), (long)5378246318139632963L, (long)l)));
        this.N = new AuthenticationGateway1860((String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)29534, (long)(0x7CF5424B44275FBCL ^ l)), (long)5378246318139632963L, (long)l)));
        this.V = new AuthenticationGateway1860((String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)6004, (long)(0x4CB4575C7475BB9CL ^ l)), (long)5378246318139632963L, (long)l)));
        this.o = GenericAdapterManager.I(this, (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)2705, (long)(0x2A18B152F3452672L ^ l)), (long)5378246318139632963L, (long)l)), (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)670, (long)(0x2B4FBF598ED82E74L ^ l)), (long)5378246318139632963L, (long)l)), this.N, this.Z, this.N, this.V);
        this.z = new AuthenticationStateTracker[]{AuthenticationStateTracker.w(this, (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)20568, (long)(0x329141C3F3327CBCL ^ l)), (long)5378246318139632963L, (long)l)), true), AuthenticationStateTracker.w(this, (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)12997, (long)(0x3252C39767569E20L ^ l)), (long)5378246318139632963L, (long)l)), true), AuthenticationStateTracker.w(this, (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)9226, (long)(0x7228C44E993608E6L ^ l)), (long)5378246318139632963L, (long)l)), true), AuthenticationStateTracker.w(this, (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)7183, (long)(0x5CE0B95ED2B7B0E4L ^ l)), (long)5378246318139632963L, (long)l)), true)};
        this.d = NumericFormattingUtility.P(this, (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)31353, (long)(0x3F744F2C9BFB5690L ^ l)), (long)5378246318139632963L, (long)l)), (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)22783, (long)(0x7EC918165E41F410L ^ l)), (long)5378246318139632963L, (long)l)), "", 0.0, 70.0, 120.0, 200.0);
        this.B = AuthenticationStateTracker.w(this, (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)27937, (long)(0x27334605A16AC1C6L ^ l)), (long)5378246318139632963L, (long)l)), false);
        this.O = NumericPrecisionTransformer.t(this, (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)9105, (long)(0x127055147FA20F7CL ^ l)), (long)5378246318139632963L, (long)l)), (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)9753, (long)(0x3D6EC67E79210AF9L ^ l)), (long)5378246318139632963L, (long)l)), (String)((Object)EventDispatchOrchestrator.c("q", (int)EventDispatchOrchestrator.a("x", (int)27038, (long)(0x55EA75863504457FL ^ l)), (long)5378246318139632963L, (long)l)), 0.0, 100.0, 200.0);
        this.X = new NetworkConfigManager();
        this.t = new NetworkConfigManager();
        this.P = false;
        this.r = 0;
        this.q(false);
        this.N(this.o);
        for (AuthenticationStateTracker authenticationStateTracker : this.z) {
            this.N(authenticationStateTracker);
        }
        this.N(this.d);
        this.B.l(this.O);
        this.N(this.B);
        this.N(this.O);
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

    private static void a() {
        Object[] objectArray = l;
        l[0] = "\u000f%x";
        objectArray[1] = Integer.TYPE;
        EventDispatchOrchestrator.m[1] = "java/lang/Integer";
        objectArray[2] = "1N\u0017\\N-:A\u0006\u001335)F\u000fZ";
        objectArray[3] = "I+Q1i!B$@~\b/I/D$";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "<n\u00052R\n=pBKCA]jQ%NK7i\fv(\u0003\"z[qKQ?oLK";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EventDispatchOrchestrator.b = MultiContainerRegistry.a(-255302353597130964L, -8711569723258698186L, MethodHandles.lookup().lookupClass()).a(116044789670035L);
                EventDispatchOrchestrator.l = new Object[5];
                EventDispatchOrchestrator.m = new String[5];
                EventDispatchOrchestrator.a();
                EventDispatchOrchestrator.j = new HashMap<K, V>(13);
                var0 = EventDispatchOrchestrator.b ^ 92723627045199L;
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
                var6_5 = "xfK\u001c\u008b\u00e2\u00f8\u009b\u0013\u0096\u00f2[j\u00af)\u00b9\u0086\u00a2\u00e7\u00d0\u00b4\u00f5PsX\u00e7h\u00a7\u0011\u00f0\u0003\b\u00d8M\u00cc\u00ba\u0089\u0096\u00e0{\u000e\u00f0\u00bai\u00e6\u00d4\u00e1\u0016ds\u007fb\u00df\u00b8\u00c1\u001ap\u00e95\u0004\u00dc\u0096\u00caroQh\u0086\u00e3\u001a|~\u001b5c\u00b8\u00bc\u0015\u001b<\u00c1\u00d4\u0093\u00fe]+)'\u00e4\u0082\u00cbA\u00acEp\u00fc\u0084\u00bb\u0095S\u00af\u0094\u00cb\u00a3\u00de\u00deQ\u001dy\u00d3\u00bbq";
                var7_6 = "xfK\u001c\u008b\u00e2\u00f8\u009b\u0013\u0096\u00f2[j\u00af)\u00b9\u0086\u00a2\u00e7\u00d0\u00b4\u00f5PsX\u00e7h\u00a7\u0011\u00f0\u0003\b\u00d8M\u00cc\u00ba\u0089\u0096\u00e0{\u000e\u00f0\u00bai\u00e6\u00d4\u00e1\u0016ds\u007fb\u00df\u00b8\u00c1\u001ap\u00e95\u0004\u00dc\u0096\u00caroQh\u0086\u00e3\u001a|~\u001b5c\u00b8\u00bc\u0015\u001b<\u00c1\u00d4\u0093\u00fe]+)'\u00e4\u0082\u00cbA\u00acEp\u00fc\u0084\u00bb\u0095S\u00af\u0094\u00cb\u00a3\u00de\u00deQ\u001dy\u00d3\u00bbq".length();
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
                    var6_5 = "\u00e6\u0082\f\u00ec\u00fe6 \u00d3\u00ad+\u00f3;\u00147F\u0015";
                    var7_6 = "\u00e6\u0082\f\u00ec\u00fe6 \u00d3\u00ad+\u00f3;\u00147F\u0015".length();
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
        EventDispatchOrchestrator.e = var8_3;
        EventDispatchOrchestrator.h = new Integer[16];
    }

    private static Method d(long l, long l2) {
        int n = EventDispatchOrchestrator.a(l, l2);
        Object object = EventDispatchOrchestrator.l[n];
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
                clazz3 = EventDispatchOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EventDispatchOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EventDispatchOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        EventDispatchOrchestrator.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EventDispatchOrchestrator.b(262127124117622L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EventDispatchOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EventDispatchOrchestrator.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EventDispatchOrchestrator.b(262127124117622L, 0L);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = EventDispatchOrchestrator.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 15;
                break;
            }
            case 1: {
                n3 = 25;
                break;
            }
            case 2: {
                n3 = 48;
                break;
            }
            case 3: {
                n3 = 55;
                break;
            }
            case 4: {
                n3 = 47;
                break;
            }
            case 5: {
                n3 = 38;
                break;
            }
            case 6: {
                n3 = 11;
                break;
            }
            case 7: {
                n3 = 17;
                break;
            }
            case 8: {
                n3 = 29;
                break;
            }
            case 9: {
                n3 = 59;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 34;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 10;
                break;
            }
            case 14: {
                n3 = 30;
                break;
            }
            case 15: {
                n3 = 51;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 39;
                break;
            }
            case 18: {
                n3 = 16;
                break;
            }
            case 19: {
                n3 = 32;
                break;
            }
            case 20: {
                n3 = 49;
                break;
            }
            case 21: {
                n3 = 2;
                break;
            }
            case 22: {
                n3 = 7;
                break;
            }
            case 23: {
                n3 = 42;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 23;
                break;
            }
            case 27: {
                n3 = 27;
                break;
            }
            case 28: {
                n3 = 13;
                break;
            }
            case 29: {
                n3 = 26;
                break;
            }
            case 30: {
                n3 = 8;
                break;
            }
            case 31: {
                n3 = 61;
                break;
            }
            case 32: {
                n3 = 56;
                break;
            }
            case 33: {
                n3 = 9;
                break;
            }
            case 34: {
                n3 = 45;
                break;
            }
            case 35: {
                n3 = 1;
                break;
            }
            case 36: {
                n3 = 0;
                break;
            }
            case 37: {
                n3 = 58;
                break;
            }
            case 38: {
                n3 = 37;
                break;
            }
            case 39: {
                n3 = 12;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 52;
                break;
            }
            case 43: {
                n3 = 21;
                break;
            }
            case 44: {
                n3 = 28;
                break;
            }
            case 45: {
                n3 = 62;
                break;
            }
            case 46: {
                n3 = 4;
                break;
            }
            case 47: {
                n3 = 44;
                break;
            }
            case 48: {
                n3 = 3;
                break;
            }
            case 49: {
                n3 = 54;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 14;
                break;
            }
            case 52: {
                n3 = 5;
                break;
            }
            case 53: {
                n3 = 40;
                break;
            }
            case 54: {
                n3 = 50;
                break;
            }
            case 55: {
                n3 = 60;
                break;
            }
            case 56: {
                n3 = 6;
                break;
            }
            case 57: {
                n3 = 57;
                break;
            }
            case 58: {
                n3 = 33;
                break;
            }
            case 59: {
                n3 = 41;
                break;
            }
            case 60: {
                n3 = 63;
                break;
            }
            case 61: {
                n3 = 35;
                break;
            }
            case 62: {
                n3 = 53;
                break;
            }
            default: {
                n3 = 36;
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
        EventDispatchOrchestrator.m[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void h() {
        block3: {
            block2: {
                try {
                    if (!this.k()) break block2;
                    this.r = ApplicationLifecycleManager.U().l().v();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchOrchestrator.a(customSystemException);
                }
            }
            this.T(false);
        }
    }

    @Override
    public void W() {
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6641;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
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
                throw new RuntimeException("a/x8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EventDispatchOrchestrator.h[n2] = n3;
        }
        return h[n2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EventDispatchOrchestrator.a(l, l2);
            object = EventDispatchOrchestrator.l[n];
            try {
                if (!(object instanceof String)) break block2;
                EventDispatchOrchestrator.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EventDispatchOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EventDispatchOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void G(KB kB) {
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
        block11: {
            block12: {
                connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().D();
                try {
                    if (this.P) {
                        OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
                        this.P = false;
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchOrchestrator.a(customSystemException);
                }
                try {
                    try {
                        if (!this.K.isEmpty()) break block11;
                        if (!this.I(this.r)) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchOrchestrator.a(customSystemException);
                    }
                    this.T(false);
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchOrchestrator.a(customSystemException);
                }
            }
            return;
        }
        if (this.X.m((long)this.d.l())) {
            SystemConfigurationManager2161 systemConfigurationManager2161 = this.K.peek();
            try {
                if (this.I(systemConfigurationManager2161.y())) {
                    OutputEncoder.r(connectionPoolOrchestrator1192, true, true);
                    this.P = true;
                    this.X.m();
                    this.K.poll();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchOrchestrator.a(customSystemException);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean k() {
        boolean bl;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            for (int i = 0; i < 9; ++i) {
                arrayList.add(i);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchOrchestrator.a(customSystemException);
        }
        Object[] objectArray = ApplicationLifecycleManager.U().l().C();
        ArrayList<AuthenticationStateTracker> arrayList2 = new ArrayList<AuthenticationStateTracker>();
        block19: for (Integer n : arrayList) {
            LightweightExecutionContext lightweightExecutionContext = new LightweightExecutionContext(objectArray[n]);
            try {
                if (lightweightExecutionContext.Y()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchOrchestrator.a(customSystemException);
            }
            ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
            try {
                if (protocolInteractionController.Y()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchOrchestrator.a(customSystemException);
            }
            if (!ReflectionMetadataResolver.Fl.isInstance(protocolInteractionController.M())) continue;
            DataStreamProcessor1233 dataStreamProcessor1233 = new DataStreamProcessor1233(protocolInteractionController.M());
            for (AuthenticationStateTracker authenticationStateTracker : this.z) {
                try {
                    try {
                        if (((NetworkConnectionEstablisher)this.o.J()).equals(this.N) && arrayList2.contains(authenticationStateTracker)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchOrchestrator.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchOrchestrator.a(customSystemException);
                }
                String string = dataStreamProcessor1233.m(lightweightExecutionContext).toLowerCase();
                String string2 = authenticationStateTracker.O().toLowerCase();
                try {
                    try {
                        try {
                            if (!authenticationStateTracker.s().booleanValue() || !string.contains(string2)) continue;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchOrchestrator.a(customSystemException);
                        }
                        this.K.add(new SystemConfigurationManager2161(n, lightweightExecutionContext));
                        arrayList2.add(authenticationStateTracker);
                        if (!((NetworkConnectionEstablisher)this.o.J()).equals(this.V)) continue block19;
                        break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchOrchestrator.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchOrchestrator.a(customSystemException);
                }
            }
        }
        try {
            bl = !this.K.isEmpty();
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchOrchestrator.a(customSystemException);
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EventDispatchOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(EventDispatchOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

