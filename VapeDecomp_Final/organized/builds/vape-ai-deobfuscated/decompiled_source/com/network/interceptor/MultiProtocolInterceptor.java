/*
 * Decompiled with CFR 0.152.
 */
package com.network.interceptor;

import a.KB;
import a.Ya;
import a.a;
import com.app.config.management.ConfigurationRegistry;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.xml.generation.XmlGenerator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.network.connection.ConnectionLifecycleManager;
import com.network.protocol.ProtocolInteractionController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptographicSecurityProvider;
import com.system.configuration.ConfigurationCalibrator;
import com.system.resource.AssetLoadBalancer;
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

public class MultiProtocolInterceptor
extends XmlGenerator {
    private final AuthenticationStateTracker X;
    private static final long[] d;
    private int r;
    private final ConnectionLifecycleManager K;
    private static final String[] m;
    private static final long b;
    private static final Object[] l;
    private static final Map j;
    private Ya t;
    public final NumericPrecisionTransformer e;
    private static final Integer[] h;
    private int v;

    private int Z() {
        long l = b ^ 0x5D9F2DDB870FL;
        AssetLoadBalancer assetLoadBalancer = ApplicationLifecycleManager.U().l();
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext lightweightExecutionContext = assetLoadBalancer.F(i);
            try {
                if (lightweightExecutionContext.Y()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolInterceptor.a(customSystemException);
            }
            try {
                if (lightweightExecutionContext.C().Y()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolInterceptor.a(customSystemException);
            }
            ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
            try {
                try {
                    if (!protocolInteractionController.D().contains((CharSequence)((Object)MultiProtocolInterceptor.c("n", (int)MultiProtocolInterceptor.a("g", (int)27071, (long)(0x8008A3BD0F2601AL ^ l)), (long)282956675573998504L, (long)l))) && !protocolInteractionController.D().contains((CharSequence)((Object)MultiProtocolInterceptor.c("n", (int)MultiProtocolInterceptor.a("g", (int)24014, (long)(0x3D8A474660DC546AL ^ l)), (long)282956675573998504L, (long)l)))) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolInterceptor.a(customSystemException);
                }
                return i;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiProtocolInterceptor.a(customSystemException);
            }
        }
        return -1;
    }

    @DataExchangeProtocol2090
    public void j(KB kB) {
        block22: {
            block28: {
                block27: {
                    block24: {
                        block25: {
                            long l = b ^ 0x7551DAE4779BL;
                            if (this.v == 0) {
                                block23: {
                                    int n = this.Z();
                                    try {
                                        try {
                                            try {
                                                if (n == -1 || !kB.getThePlayer().j()) break block22;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MultiProtocolInterceptor.a(customSystemException);
                                            }
                                            ApplicationLifecycleManager.U().l().A(n);
                                            if (this.P()) break block23;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw MultiProtocolInterceptor.a(customSystemException);
                                        }
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MultiProtocolInterceptor.a(customSystemException);
                                    }
                                }
                                try {
                                    this.t = this.X.s() != false ? new CryptographicSecurityProvider(-999.0f, 90.0f) : new Ya(-999.0f, 90.0f);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MultiProtocolInterceptor.a(customSystemException);
                                }
                                this.t.v(-999.0f, 90.0f);
                                this.t.L(((Double)this.e.J()).intValue());
                                this.t.i(false);
                                this.t.J(true);
                                this.t.N(5.0f);
                                ConfigurationCalibrator.b.W(this.t);
                                this.v = 1;
                            } else {
                                block26: {
                                    try {
                                        try {
                                            try {
                                                if (this.v != 1) break block24;
                                                if (this.t == null) break block25;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MultiProtocolInterceptor.a(customSystemException);
                                            }
                                            if (this.t.F()) break block26;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw MultiProtocolInterceptor.a(customSystemException);
                                        }
                                        if (!(ConfigurationCalibrator.b.p() > 80.0f)) break block22;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MultiProtocolInterceptor.a(customSystemException);
                                    }
                                }
                                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().D();
                                ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator1192, true);
                                ConnectionPoolOrchestrator1192.m(connectionPoolOrchestrator1192);
                                ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator1192, false);
                                this.v = (int)MultiProtocolInterceptor.a("g", (int)5433, (long)(0x5FF48EDE731B6C0AL ^ l));
                            }
                            break block22;
                        }
                        this.v = -1;
                        break block22;
                    }
                    try {
                        if (this.v != 2) break block27;
                        ApplicationLifecycleManager.N().r().L();
                        this.v = -1;
                        break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiProtocolInterceptor.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (this.v != -1) break block22;
                        this.M();
                        if (this.r == -1) break block28;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiProtocolInterceptor.a(customSystemException);
                    }
                    ApplicationLifecycleManager.N().r().B();
                    ApplicationLifecycleManager.U().l().A(this.r);
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolInterceptor.a(customSystemException);
                }
            }
            this.y(false, true);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MultiProtocolInterceptor.b = MultiContainerRegistry.a(4691121420651250412L, -472307348046429392L, MethodHandles.lookup().lookupClass()).a(149746650473170L);
                MultiProtocolInterceptor.l = new Object[5];
                MultiProtocolInterceptor.m = new String[5];
                MultiProtocolInterceptor.a();
                MultiProtocolInterceptor.j = new HashMap<K, V>(13);
                var0 = MultiProtocolInterceptor.b ^ 43543870763246L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u00b6\u00fb\u00fe\u00f0F\u00d5tG\u0095<\u00e4\u00f3\u00a3\u00e2ie2L\u0012\u00da\u00d6FY\u00fb\u00a6&\u00a7d\u00ec\u0015\u0096\u0085\u0018\u00f4\u00002mY\u001f\u00c4\u00f2\u00cc\u00e8k\u00fes\u001b&";
                var7_6 = "\u00b6\u00fb\u00fe\u00f0F\u00d5tG\u0095<\u00e4\u00f3\u00a3\u00e2ie2L\u0012\u00da\u00d6FY\u00fb\u00a6&\u00a7d\u00ec\u0015\u0096\u0085\u0018\u00f4\u00002mY\u001f\u00c4\u00f2\u00cc\u00e8k\u00fes\u001b&".length();
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
                    var6_5 = "\u000b\u00c1Z*M`\u000b\u00ee\u00ab\u00eb(\u00f3\u00c1\u00e1\u00d9\u0002";
                    var7_6 = "\u000b\u00c1Z*M`\u000b\u00ee\u00ab\u00eb(\u00f3\u00c1\u00e1\u00d9\u0002".length();
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
        MultiProtocolInterceptor.d = var8_3;
        MultiProtocolInterceptor.h = new Integer[8];
    }

    private boolean P() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.K.z(this) && !this.K.O(this, this.X.s())) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiProtocolInterceptor.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolInterceptor.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public MultiProtocolInterceptor() {
        long l = b ^ 0x18A01F4B2B39L;
        super(a.cs((int)MultiProtocolInterceptor.a("g", (int)20495, (long)(0x6F8ADBFABD59F59AL ^ l))), a.cs((int)MultiProtocolInterceptor.a("g", (int)17139, (long)(0x68A168EA38C76764L ^ l))));
        this.e = NumericPrecisionTransformer.t(this, (String)((Object)MultiProtocolInterceptor.c("n", (int)MultiProtocolInterceptor.a("g", (int)23448, (long)(0x72B3EF215D96FE0EL ^ l)), (long)-5775014779270115426L, (long)l)), (String)((Object)MultiProtocolInterceptor.c("n", (int)MultiProtocolInterceptor.a("g", (int)29000, (long)(0x37CD07562E48D4DCL ^ l)), (long)-5775014779270115426L, (long)l)), "", 1.0, 7.0, 10.0);
        this.X = new AuthenticationStateTracker((Object)this, (String)((Object)MultiProtocolInterceptor.c("n", (int)MultiProtocolInterceptor.a("g", (int)24321, (long)(0x7DBF0DD6282DFA91L ^ l)), (long)-5775014779270115426L, (long)l)), true);
        this.K = ConfigurationRegistry.O;
        this.r = -1;
        this.N(this.e, this.X);
        this.K.y(this, 6);
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "~\u0000\u0015";
        objectArray[1] = Integer.TYPE;
        MultiProtocolInterceptor.m[1] = "java/lang/Integer";
        objectArray[2] = "C6Kx:$H9Z7G<[>S~";
        objectArray[3] = "\u0005\u000fy|\u0016k\u000e\u0000h3we\u0005\u000bli";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0018/kK:e\u001e`0 nb!+mQi\"Lyk]}\u0019\u0018o?\u001a< M#7\u0010\u0005";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ca' || c == 't' || c == 's' || c == 'G') {
                field = MultiProtocolInterceptor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ca' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == 's' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultiProtocolInterceptor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MultiProtocolInterceptor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void h() {
        block3: {
            block2: {
                int n;
                int n2 = this.Z();
                try {
                    if (n2 == -1 || !ApplicationLifecycleManager.U().j()) break block2;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiProtocolInterceptor.a(customSystemException);
                }
                this.r = n = ApplicationLifecycleManager.U().l().v();
                this.v = 0;
                break block3;
            }
            this.y(false, true);
        }
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA4A;
        if (h[n2] == null) {
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
                throw new RuntimeException("a/xB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MultiProtocolInterceptor.h[n2] = n3;
        }
        return h[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultiProtocolInterceptor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = MultiProtocolInterceptor.a(l, l2);
        Object object = MultiProtocolInterceptor.l[n];
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
                clazz3 = MultiProtocolInterceptor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultiProtocolInterceptor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultiProtocolInterceptor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultiProtocolInterceptor.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultiProtocolInterceptor.b(260765864228669L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultiProtocolInterceptor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultiProtocolInterceptor.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultiProtocolInterceptor.b(260765864228669L, 0L);
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

    private static Field c(long l, long l2) {
        int n = MultiProtocolInterceptor.a(l, l2);
        Object object = MultiProtocolInterceptor.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = MultiProtocolInterceptor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultiProtocolInterceptor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultiProtocolInterceptor.a(clazz3, string2, clazz2)) != null) {
                    MultiProtocolInterceptor.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultiProtocolInterceptor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultiProtocolInterceptor.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultiProtocolInterceptor.b(260765864228669L, 0L);
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
            this.M();
            if (this.r != -1) {
                ApplicationLifecycleManager.N().r().B();
                ApplicationLifecycleManager.U().l().A(this.r);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolInterceptor.a(customSystemException);
        }
        this.r = -1;
        this.v = 0;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultiProtocolInterceptor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultiProtocolInterceptor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void M() {
        try {
            if (this.t != null) {
                ConfigurationCalibrator.b.v(this.t);
                this.K.b(this);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiProtocolInterceptor.a(customSystemException);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultiProtocolInterceptor.a(l, l2);
            object = MultiProtocolInterceptor.l[n];
            try {
                if (!(object instanceof String)) break block2;
                MultiProtocolInterceptor.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MultiProtocolInterceptor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultiProtocolInterceptor.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
            throw new RuntimeException("a/xB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = MultiProtocolInterceptor.l[n4];
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
                n3 = 49;
                break;
            }
            case 2: {
                n3 = 25;
                break;
            }
            case 3: {
                n3 = 27;
                break;
            }
            case 4: {
                n3 = 14;
                break;
            }
            case 5: {
                n3 = 31;
                break;
            }
            case 6: {
                n3 = 38;
                break;
            }
            case 7: {
                n3 = 35;
                break;
            }
            case 8: {
                n3 = 15;
                break;
            }
            case 9: {
                n3 = 28;
                break;
            }
            case 10: {
                n3 = 23;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 3;
                break;
            }
            case 13: {
                n3 = 51;
                break;
            }
            case 14: {
                n3 = 55;
                break;
            }
            case 15: {
                n3 = 36;
                break;
            }
            case 16: {
                n3 = 9;
                break;
            }
            case 17: {
                n3 = 59;
                break;
            }
            case 18: {
                n3 = 42;
                break;
            }
            case 19: {
                n3 = 58;
                break;
            }
            case 20: {
                n3 = 63;
                break;
            }
            case 21: {
                n3 = 37;
                break;
            }
            case 22: {
                n3 = 18;
                break;
            }
            case 23: {
                n3 = 46;
                break;
            }
            case 24: {
                n3 = 33;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 41;
                break;
            }
            case 27: {
                n3 = 7;
                break;
            }
            case 28: {
                n3 = 53;
                break;
            }
            case 29: {
                n3 = 17;
                break;
            }
            case 30: {
                n3 = 11;
                break;
            }
            case 31: {
                n3 = 26;
                break;
            }
            case 32: {
                n3 = 34;
                break;
            }
            case 33: {
                n3 = 50;
                break;
            }
            case 34: {
                n3 = 43;
                break;
            }
            case 35: {
                n3 = 57;
                break;
            }
            case 36: {
                n3 = 16;
                break;
            }
            case 37: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 60;
                break;
            }
            case 40: {
                n3 = 21;
                break;
            }
            case 41: {
                n3 = 4;
                break;
            }
            case 42: {
                n3 = 24;
                break;
            }
            case 43: {
                n3 = 10;
                break;
            }
            case 44: {
                n3 = 19;
                break;
            }
            case 45: {
                n3 = 2;
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
                n3 = 6;
                break;
            }
            case 49: {
                n3 = 29;
                break;
            }
            case 50: {
                n3 = 8;
                break;
            }
            case 51: {
                n3 = 56;
                break;
            }
            case 52: {
                n3 = 12;
                break;
            }
            case 53: {
                n3 = 40;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 5;
                break;
            }
            case 56: {
                n3 = 1;
                break;
            }
            case 57: {
                n3 = 47;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 54;
                break;
            }
            case 60: {
                n3 = 20;
                break;
            }
            case 61: {
                n3 = 32;
                break;
            }
            case 62: {
                n3 = 30;
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
        MultiProtocolInterceptor.m[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MultiProtocolInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(MultiProtocolInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

