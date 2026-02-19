/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.KB;
import a.a;
import com.app.command.CommandExecutor;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.network.configuration.NetworkConfigManager;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
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

public class NetworkProtocolEncoder318
extends ContextualExecutionFramework {
    private final AuthenticationStateTracker h;
    private static final Integer[] e;
    private final NetworkConfigManager X;
    private boolean x;
    private final NumericPrecisionTransformer r;
    private static final long[] d;
    private boolean z;
    private static final String[] m;
    private final NumericPrecisionTransformer Y;
    private final NetworkConfigManager o;
    private final NumericPrecisionTransformer Z;
    private static final Map j;
    private static final long b;
    private static final Object[] l;

    private static Method d(long l, long l2) {
        int n = NetworkProtocolEncoder318.a(l, l2);
        Object object = NetworkProtocolEncoder318.l[n];
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
                clazz3 = NetworkProtocolEncoder318.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkProtocolEncoder318.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkProtocolEncoder318.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkProtocolEncoder318.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkProtocolEncoder318.b(266902953248661L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkProtocolEncoder318.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkProtocolEncoder318.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkProtocolEncoder318.b(266902953248661L, 0L);
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

    private static void a() {
        Object[] objectArray = l;
        l[0] = "3K\u001c";
        objectArray[1] = Integer.TYPE;
        NetworkProtocolEncoder318.m[1] = "java/lang/Integer";
        objectArray[2] = ".y\b\n\u0007\u0002%v\u0019Ez\u001a6q\u0010\f";
        objectArray[3] = "*:\u0010)V\u0012!5\u0001f7\u001c*>\u0005<";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "ie!&\u0010\u0010n6xFK\rU5$|F\u0019osx#\u0018vla2{QFdb'\u007f ";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void G(KB kB) {
        block15: {
            NetworkProtocolEncoder318 networkProtocolEncoder318;
            block14: {
                boolean bl;
                block12: {
                    int[] nArray;
                    block13: {
                        block10: {
                            block11: {
                                long l = b ^ 0x501E94AC5E21L;
                                nArray = GameVersionEnumerator.q();
                                try {
                                    bl = ApplicationLifecycleManager.X().Y();
                                    if (nArray != null) break block10;
                                    if (bl) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NetworkProtocolEncoder318.a(customSystemException);
                                }
                                return;
                            }
                            bl = this.z;
                        }
                        try {
                            try {
                                if (nArray != null) break block12;
                                if (!bl) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkProtocolEncoder318.a(customSystemException);
                            }
                            this.Y();
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolEncoder318.a(customSystemException);
                        }
                    }
                    try {
                        networkProtocolEncoder318 = this;
                        if (nArray != null) break block14;
                        bl = networkProtocolEncoder318.x;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolEncoder318.a(customSystemException);
                    }
                }
                if (!bl) break block15;
                networkProtocolEncoder318 = this;
            }
            networkProtocolEncoder318.E();
            return;
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = NetworkProtocolEncoder318.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 22;
                break;
            }
            case 1: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 13;
                break;
            }
            case 3: {
                n3 = 63;
                break;
            }
            case 4: {
                n3 = 9;
                break;
            }
            case 5: {
                n3 = 10;
                break;
            }
            case 6: {
                n3 = 60;
                break;
            }
            case 7: {
                n3 = 16;
                break;
            }
            case 8: {
                n3 = 25;
                break;
            }
            case 9: {
                n3 = 29;
                break;
            }
            case 10: {
                n3 = 34;
                break;
            }
            case 11: {
                n3 = 40;
                break;
            }
            case 12: {
                n3 = 59;
                break;
            }
            case 13: {
                n3 = 11;
                break;
            }
            case 14: {
                n3 = 30;
                break;
            }
            case 15: {
                n3 = 39;
                break;
            }
            case 16: {
                n3 = 41;
                break;
            }
            case 17: {
                n3 = 14;
                break;
            }
            case 18: {
                n3 = 58;
                break;
            }
            case 19: {
                n3 = 48;
                break;
            }
            case 20: {
                n3 = 50;
                break;
            }
            case 21: {
                n3 = 51;
                break;
            }
            case 22: {
                n3 = 56;
                break;
            }
            case 23: {
                n3 = 27;
                break;
            }
            case 24: {
                n3 = 52;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 5;
                break;
            }
            case 28: {
                n3 = 31;
                break;
            }
            case 29: {
                n3 = 57;
                break;
            }
            case 30: {
                n3 = 33;
                break;
            }
            case 31: {
                n3 = 12;
                break;
            }
            case 32: {
                n3 = 3;
                break;
            }
            case 33: {
                n3 = 20;
                break;
            }
            case 34: {
                n3 = 47;
                break;
            }
            case 35: {
                n3 = 32;
                break;
            }
            case 36: {
                n3 = 46;
                break;
            }
            case 37: {
                n3 = 17;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 37;
                break;
            }
            case 40: {
                n3 = 6;
                break;
            }
            case 41: {
                n3 = 55;
                break;
            }
            case 42: {
                n3 = 36;
                break;
            }
            case 43: {
                n3 = 18;
                break;
            }
            case 44: {
                n3 = 19;
                break;
            }
            case 45: {
                n3 = 38;
                break;
            }
            case 46: {
                n3 = 61;
                break;
            }
            case 47: {
                n3 = 8;
                break;
            }
            case 48: {
                n3 = 7;
                break;
            }
            case 49: {
                n3 = 43;
                break;
            }
            case 50: {
                n3 = 1;
                break;
            }
            case 51: {
                n3 = 54;
                break;
            }
            case 52: {
                n3 = 28;
                break;
            }
            case 53: {
                n3 = 15;
                break;
            }
            case 54: {
                n3 = 45;
                break;
            }
            case 55: {
                n3 = 53;
                break;
            }
            case 56: {
                n3 = 24;
                break;
            }
            case 57: {
                n3 = 49;
                break;
            }
            case 58: {
                n3 = 44;
                break;
            }
            case 59: {
                n3 = 21;
                break;
            }
            case 60: {
                n3 = 23;
                break;
            }
            case 61: {
                n3 = 35;
                break;
            }
            case 62: {
                n3 = 42;
                break;
            }
            default: {
                n3 = 0;
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
        NetworkProtocolEncoder318.m[n4] = new String(cArray);
        return n4;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/At" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void e(CommandExecutor commandExecutor) {
        block27: {
            NetworkProtocolEncoder318 networkProtocolEncoder318;
            block26: {
                int n;
                block24: {
                    int[] nArray;
                    block25: {
                        block22: {
                            block23: {
                                block21: {
                                    block20: {
                                        block18: {
                                            block19: {
                                                long l = b ^ 0x541ABD2B7C77L;
                                                nArray = GameVersionEnumerator.q();
                                                try {
                                                    n = commandExecutor.getTarget().B(ReflectionMetadataResolver.Pr);
                                                    if (nArray != null) break block18;
                                                    if (n != 0) break block19;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw NetworkProtocolEncoder318.a(customSystemException);
                                                }
                                                return;
                                            }
                                            n = this.z;
                                        }
                                        try {
                                            try {
                                                if (nArray != null) break block20;
                                                if (n != 0) break block21;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw NetworkProtocolEncoder318.a(customSystemException);
                                            }
                                            n = this.x;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NetworkProtocolEncoder318.a(customSystemException);
                                        }
                                    }
                                    try {
                                        if (nArray != null) break block22;
                                        if (n == 0) break block23;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NetworkProtocolEncoder318.a(customSystemException);
                                    }
                                }
                                return;
                            }
                            n = this.h.s().booleanValue();
                        }
                        try {
                            if (nArray != null) break block24;
                            if (n == 0) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolEncoder318.a(customSystemException);
                        }
                        int n2 = commandExecutor.getTarget().y();
                        try {
                            try {
                                n = n2;
                                if (nArray != null) break block24;
                                if (n <= 14) break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkProtocolEncoder318.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolEncoder318.a(customSystemException);
                        }
                    }
                    try {
                        networkProtocolEncoder318 = this;
                        if (nArray != null) break block26;
                        n = networkProtocolEncoder318.X();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolEncoder318.a(customSystemException);
                    }
                }
                try {
                    if (n == 0) break block27;
                    this.z = true;
                    this.X.m();
                    networkProtocolEncoder318 = this;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolEncoder318.a(customSystemException);
                }
            }
            networkProtocolEncoder318.Y();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NetworkProtocolEncoder318.b = MultiContainerRegistry.a(5364691733589938622L, 4557814364624800222L, MethodHandles.lookup().lookupClass()).a(210840501565254L);
                NetworkProtocolEncoder318.l = new Object[5];
                NetworkProtocolEncoder318.m = new String[5];
                NetworkProtocolEncoder318.a();
                NetworkProtocolEncoder318.j = new HashMap<K, V>(13);
                var0 = NetworkProtocolEncoder318.b ^ 86031112774140L;
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
                var8_3 = new long[14];
                var5_4 = 0;
                var6_5 = "]\u0001m\u00b4?\u008e7)l^'\u009cO\u008aU\u0017\u001eoZ\u000f@\u00ee\u00a7\u00a5f\u0081\u00fe\u00fd\u00a3-\u00186v\u00f2\u00b6\u0000\u008f\u00f8R\u00df\u00b1\u0002\u00d5\u00ab\u00b0\u00ad\u00dd\u00f3\u00a4\u009d`\u0018\u00f8;\u0015y\u0019\u00a3\u00df6\u0085 \u0018\u00c9\"\u001d\u00ec\u00fa\u0007T\u00f0\u0095\u0087\u0003%9\u00f9\u00c3\u00cf\u0095\u009a\u0017\u00d6G\u00be\u00c4)9\u00d5K\u008c\u00b6y\u00eeo\b";
                var7_6 = "]\u0001m\u00b4?\u008e7)l^'\u009cO\u008aU\u0017\u001eoZ\u000f@\u00ee\u00a7\u00a5f\u0081\u00fe\u00fd\u00a3-\u00186v\u00f2\u00b6\u0000\u008f\u00f8R\u00df\u00b1\u0002\u00d5\u00ab\u00b0\u00ad\u00dd\u00f3\u00a4\u009d`\u0018\u00f8;\u0015y\u0019\u00a3\u00df6\u0085 \u0018\u00c9\"\u001d\u00ec\u00fa\u0007T\u00f0\u0095\u0087\u0003%9\u00f9\u00c3\u00cf\u0095\u009a\u0017\u00d6G\u00be\u00c4)9\u00d5K\u008c\u00b6y\u00eeo\b".length();
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
                    var6_5 = "\n\u00d0\u00fd\u00d9NE/\u0084\u00e9\u00ba\u00dc\u00014X\u0092\u00fc";
                    var7_6 = "\n\u00d0\u00fd\u00d9NE/\u0084\u00e9\u00ba\u00dc\u00014X\u0092\u00fc".length();
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
        NetworkProtocolEncoder318.d = var8_3;
        NetworkProtocolEncoder318.e = new Integer[14];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/At" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkProtocolEncoder318.a(l, l2);
            object = NetworkProtocolEncoder318.l[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkProtocolEncoder318.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void Y() {
        if (this.X.m(((Double)this.r.J()).longValue())) {
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().s();
            connectionPoolOrchestrator1192.p(false);
            this.z = false;
            this.o.m();
            this.x = true;
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00d2' || c == '\u00e3' || c == '\u00fd') {
                field = NetworkProtocolEncoder318.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkProtocolEncoder318.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'W' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public NetworkProtocolEncoder318() {
        long l = b ^ 0x28871FD6124FL;
        super(a.cs((int)NetworkProtocolEncoder318.a("v", (int)14301, (long)(0x503556CBEEC27258L ^ l))), (int)NetworkProtocolEncoder318.a("v", (int)11212, (long)(0x321C2A36EE4FEE43L ^ l)), RecursiveNodeGraph.X);
        this.Z = NumericPrecisionTransformer.b(this, (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)23134, (long)(0x1486883B16271FDEL ^ l)), (long)8254289354302459927L, (long)l)), (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)974, (long)(0x4DF7E1FA93C2464FL ^ l)), (long)8254289354302459927L, (long)l)), (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)32527, (long)(0x4A65D2C0FE1D3A81L ^ l)), (long)8254289354302459927L, (long)l)), 0.0, 90.0, 100.0, (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)27917, (long)(0x1535048C65E0288EL ^ l)), (long)8254289354302459927L, (long)l)));
        this.r = NumericPrecisionTransformer.D(this, (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)29538, (long)(0x791A9B343101B6E8L ^ l)), (long)8254289354302459927L, (long)l)), (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)25452, (long)(0x2EB59A24D7E426E7L ^ l)), (long)8254289354302459927L, (long)l)), "", 0.0, 0.0, 500.0, 50.0, (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)18543, (long)(0x253973AC13450DE8L ^ l)), (long)8254289354302459927L, (long)l)));
        this.Y = NumericPrecisionTransformer.D(this, (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)10330, (long)(0x78EA89ED62F2EDD8L ^ l)), (long)8254289354302459927L, (long)l)), (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)8655, (long)(0x7B5643D6A55F644BL ^ l)), (long)8254289354302459927L, (long)l)), "", 0.0, 0.0, 500.0, 50.0, (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)22735, (long)(0x7026AE4F79399D49L ^ l)), (long)8254289354302459927L, (long)l)));
        this.h = AuthenticationStateTracker.R(this, (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)27017, (long)(0x6B6C11C3CA942C00L ^ l)), (long)8254289354302459927L, (long)l)), true, (String)((Object)NetworkProtocolEncoder318.c("W", (int)NetworkProtocolEncoder318.a("v", (int)27344, (long)(0x6BB8EC306F042F58L ^ l)), (long)8254289354302459927L, (long)l)));
        this.X = new NetworkConfigManager();
        this.o = new NetworkConfigManager();
        this.N(this.Z, this.r, this.Y, this.h);
        this.r.L(0);
    }

    private static Field c(long l, long l2) {
        int n = NetworkProtocolEncoder318.a(l, l2);
        Object object = NetworkProtocolEncoder318.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkProtocolEncoder318.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkProtocolEncoder318.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkProtocolEncoder318.a(clazz3, string2, clazz2)) != null) {
                    NetworkProtocolEncoder318.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkProtocolEncoder318.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkProtocolEncoder318.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkProtocolEncoder318.b(266902953248661L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public boolean X() {
        boolean bl;
        try {
            bl = (Double)this.Z.J() >= Math.random() * 100.0;
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolEncoder318.a(customSystemException);
        }
        return bl;
    }

    @Override
    public String t() {
        return this.r.p();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkProtocolEncoder318.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void E() {
        if (this.o.m(((Double)this.Y.J()).longValue())) {
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().s();
            boolean bl = DynamicContextBroker.s(connectionPoolOrchestrator1192);
            try {
                if (bl) {
                    connectionPoolOrchestrator1192.p(true);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolEncoder318.a(customSystemException);
            }
            this.x = false;
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x370E;
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
                throw new RuntimeException("a/At", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolEncoder318.e[n2] = n3;
        }
        return e[n2];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkProtocolEncoder318.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkProtocolEncoder318.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolEncoder318.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NetworkProtocolEncoder318.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkProtocolEncoder318.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolEncoder318.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NetworkProtocolEncoder318.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

