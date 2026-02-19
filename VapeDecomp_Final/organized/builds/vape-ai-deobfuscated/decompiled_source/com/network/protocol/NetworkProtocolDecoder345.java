/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.network.protocol;

import a.TR;
import a.Ya;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.collections.management.MultiContainerRegistry;
import com.configuration.management.ConfigurationParameterController;
import com.core.containers.GenericContainerTemplate;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.adaptive.AdaptiveCryptoNegotiator;
import com.data.compression.CompressionUtility;
import com.data.transformation.DataTransformationProtocol2153;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.output.processing.OutputEncoder;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.auth.AuthenticationGateway;
import com.security.crypto.CryptographicSecurityProvider;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.GenericConfigurationResolver;
import com.system.configuration.SystemConfigurationOrchestrator;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class NetworkProtocolDecoder345 {
    private static final Object[] e;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long a;
    private final AdaptiveCryptoNegotiator v;
    private static final String[] f;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 19;
                break;
            }
            case 1: {
                n3 = 33;
                break;
            }
            case 2: {
                n3 = 26;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 12;
                break;
            }
            case 6: {
                n3 = 10;
                break;
            }
            case 7: {
                n3 = 20;
                break;
            }
            case 8: {
                n3 = 35;
                break;
            }
            case 9: {
                n3 = 39;
                break;
            }
            case 10: {
                n3 = 63;
                break;
            }
            case 11: {
                n3 = 36;
                break;
            }
            case 12: {
                n3 = 15;
                break;
            }
            case 13: {
                n3 = 3;
                break;
            }
            case 14: {
                n3 = 5;
                break;
            }
            case 15: {
                n3 = 14;
                break;
            }
            case 16: {
                n3 = 60;
                break;
            }
            case 17: {
                n3 = 43;
                break;
            }
            case 18: {
                n3 = 23;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 37;
                break;
            }
            case 21: {
                n3 = 18;
                break;
            }
            case 22: {
                n3 = 56;
                break;
            }
            case 23: {
                n3 = 41;
                break;
            }
            case 24: {
                n3 = 53;
                break;
            }
            case 25: {
                n3 = 49;
                break;
            }
            case 26: {
                n3 = 51;
                break;
            }
            case 27: {
                n3 = 44;
                break;
            }
            case 28: {
                n3 = 29;
                break;
            }
            case 29: {
                n3 = 28;
                break;
            }
            case 30: {
                n3 = 62;
                break;
            }
            case 31: {
                n3 = 25;
                break;
            }
            case 32: {
                n3 = 59;
                break;
            }
            case 33: {
                n3 = 45;
                break;
            }
            case 34: {
                n3 = 11;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 1;
                break;
            }
            case 37: {
                n3 = 7;
                break;
            }
            case 38: {
                n3 = 31;
                break;
            }
            case 39: {
                n3 = 21;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 38;
                break;
            }
            case 42: {
                n3 = 47;
                break;
            }
            case 43: {
                n3 = 13;
                break;
            }
            case 44: {
                n3 = 50;
                break;
            }
            case 45: {
                n3 = 2;
                break;
            }
            case 46: {
                n3 = 54;
                break;
            }
            case 47: {
                n3 = 0;
                break;
            }
            case 48: {
                n3 = 46;
                break;
            }
            case 49: {
                n3 = 16;
                break;
            }
            case 50: {
                n3 = 34;
                break;
            }
            case 51: {
                n3 = 30;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 8;
                break;
            }
            case 54: {
                n3 = 58;
                break;
            }
            case 55: {
                n3 = 9;
                break;
            }
            case 56: {
                n3 = 48;
                break;
            }
            case 57: {
                n3 = 52;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 22;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 61;
                break;
            }
            case 62: {
                n3 = 32;
                break;
            }
            default: {
                n3 = 27;
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
        NetworkProtocolDecoder345.f[n4] = new String(cArray);
        return n4;
    }

    @NotNull
    GenericConfigurationResolver h(@NotNull ConfigurationParameterController configurationParameterController, @Nullable CompressionUtility compressionUtility, @Nullable Ya ya, boolean bl) {
        long l;
        block21: {
            block22: {
                Ya ya2;
                block19: {
                    block20: {
                        l = a ^ 0x482534B87E9CL;
                        ya2 = this.t(compressionUtility, ya, configurationParameterController);
                        try {
                            try {
                                try {
                                    if (ya2 == null || ya2.equals(ya)) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NetworkProtocolDecoder345.a(customSystemException);
                                }
                                if (!bl) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkProtocolDecoder345.a(customSystemException);
                            }
                            this.v.b = ya2;
                            break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolDecoder345.a(customSystemException);
                        }
                    }
                    this.v.v = ya2;
                }
                try {
                    if (TR.G(compressionUtility, configurationParameterController)) {
                        return GenericConfigurationResolver.a((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)22047, (long)(0x14EC956B81BBDED8L ^ l)), (long)469892480027059698L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDecoder345.a(customSystemException);
                }
                try {
                    if (ya2 == null) {
                        return GenericConfigurationResolver.r((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)16797, (long)(0x32B4946D5E6AC953L ^ l)), (long)469892480027059698L, (long)l))).w();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDecoder345.a(customSystemException);
                }
                try {
                    if (ya2.F()) {
                        return GenericConfigurationResolver.a((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)9228, (long)(0x4EA6E1CA9DFAACCEL ^ l)), (long)469892480027059698L, (long)l)));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDecoder345.a(customSystemException);
                }
                try {
                    try {
                        if (ya2.equals(ConfigurationCalibrator.b.N())) break block21;
                        if (!this.v.R()) break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolDecoder345.a(customSystemException);
                    }
                    ConfigurationCalibrator.b.W(ya2);
                    return GenericConfigurationResolver.B((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)6436, (long)(0x31820284B85311EEL ^ l)), (long)469892480027059698L, (long)l)));
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDecoder345.a(customSystemException);
                }
            }
            return GenericConfigurationResolver.B((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)19281, (long)(0x418B525A3882C398L ^ l)), (long)469892480027059698L, (long)l)));
        }
        return GenericConfigurationResolver.B((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)27685, (long)(0x4D2E9D906FF564E9L ^ l)), (long)469892480027059698L, (long)l)));
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "`|e";
        objectArray[1] = Integer.TYPE;
        NetworkProtocolDecoder345.f[1] = "java/lang/Integer";
        objectArray[2] = "=\n\u001cuk\u00026\u0005\r:\u0016\u001a%\u0002\u0004s";
        objectArray[3] = "sdb$A}xksk ss`w1";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ",,s5\u00165w0(WA!Hj%6D5s1y,HZq/w(\u0015b4oj+*";
    }

    private static Method d(long l, long l2) {
        int n = NetworkProtocolDecoder345.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = NetworkProtocolDecoder345.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkProtocolDecoder345.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkProtocolDecoder345.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkProtocolDecoder345.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkProtocolDecoder345.b(274647431595953L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkProtocolDecoder345.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkProtocolDecoder345.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkProtocolDecoder345.b(274647431595953L, 0L);
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

    @NotNull
    Ya r(@Nullable CompressionUtility compressionUtility, @Nullable ConfigurationParameterController configurationParameterController) {
        Ya ya;
        block9: {
            Ya ya2;
            block6: {
                Ya ya3;
                block8: {
                    block7: {
                        try {
                            try {
                                if (compressionUtility != null) break block6;
                                if (!this.v.O.s().booleanValue()) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkProtocolDecoder345.a(customSystemException);
                            }
                            ya3 = new CryptographicSecurityProvider(-999.0f, 90.0f);
                            break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolDecoder345.a(customSystemException);
                        }
                    }
                    ya3 = new Ya(-999.0f, 90.0f);
                }
                ya = ya3;
                break block9;
            }
            ContextualEventDispatcher contextualEventDispatcher = TR.R(compressionUtility, configurationParameterController);
            try {
                ya2 = this.v.O.s() != false ? new CryptographicSecurityProvider(contextualEventDispatcher) : new AuthenticationGateway(contextualEventDispatcher);
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder345.a(customSystemException);
            }
            ya = ya2;
        }
        return this.t(ya);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolDecoder345.a(n, l);
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
                NetworkProtocolDecoder345.a = MultiContainerRegistry.a(4006725008461480387L, 934329014869923434L, MethodHandles.lookup().lookupClass()).a(94568158422979L);
                NetworkProtocolDecoder345.e = new Object[5];
                NetworkProtocolDecoder345.f = new String[5];
                NetworkProtocolDecoder345.a();
                NetworkProtocolDecoder345.d = new HashMap<K, V>(13);
                var0 = NetworkProtocolDecoder345.a ^ 16488658602793L;
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
                var6_5 = "\u00e9\u0084\\\u0080\u00ae\u009at\u0083n\u0016\u00ebG\u00fe\u00c2\u0099\u00b8\u0089\u0018N\u00aa\u00ec<\u001e\u00faX\u00c9z$/_\u0092\n\u007f\u00a7R*\u00f2\u0088\u00a3&\u001f\u0003r\u00fb\u000bn\u00a2\u00d3\u00a0\u00ca,\u00a3\u00cfU\u00c1q\u0083AHko\u00a7\u00a5\u00b45\u00a2\u00d1\u0085\u00d7\u00d2y\u00bd\t6\u00d38\u00068\u0016*\u00cbC\u0083J\u00ec\u00dc\u00c0\u00bay\u0005\u00da\u00b3.1vP";
                var7_6 = "\u00e9\u0084\\\u0080\u00ae\u009at\u0083n\u0016\u00ebG\u00fe\u00c2\u0099\u00b8\u0089\u0018N\u00aa\u00ec<\u001e\u00faX\u00c9z$/_\u0092\n\u007f\u00a7R*\u00f2\u0088\u00a3&\u001f\u0003r\u00fb\u000bn\u00a2\u00d3\u00a0\u00ca,\u00a3\u00cfU\u00c1q\u0083AHko\u00a7\u00a5\u00b45\u00a2\u00d1\u0085\u00d7\u00d2y\u00bd\t6\u00d38\u00068\u0016*\u00cbC\u0083J\u00ec\u00dc\u00c0\u00bay\u0005\u00da\u00b3.1vP".length();
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
                    var6_5 = "\u00e6\u009d~\r7^\u00988\u0018\u00be\u0084\u00cf\u00c2\u00dc\u00fc\u00d6";
                    var7_6 = "\u00e6\u009d~\r7^\u00988\u0018\u00be\u0084\u00cf\u00c2\u00dc\u00fc\u00d6".length();
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
        NetworkProtocolDecoder345.b = var8_3;
        NetworkProtocolDecoder345.c = new Integer[14];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkProtocolDecoder345.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkProtocolDecoder345.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = NetworkProtocolDecoder345.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkProtocolDecoder345.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkProtocolDecoder345.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkProtocolDecoder345.a(clazz3, string2, clazz2)) != null) {
                    NetworkProtocolDecoder345.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkProtocolDecoder345.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkProtocolDecoder345.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkProtocolDecoder345.b(274647431595953L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xE4E;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/X0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolDecoder345.c[n2] = n3;
        }
        return c[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/X0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Nullable
    private Ya t(@Nullable CompressionUtility compressionUtility, @Nullable Ya ya, ConfigurationParameterController configurationParameterController) {
        Ya ya2;
        block19: {
            block18: {
                block17: {
                    ya2 = ya;
                    try {
                        if (compressionUtility == null) {
                            return ya2;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolDecoder345.a(customSystemException);
                    }
                    try {
                        try {
                            if (ya2 == null || ya2 instanceof CryptographicSecurityProvider) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolDecoder345.a(customSystemException);
                        }
                        if (ya2 instanceof AuthenticationGateway) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolDecoder345.a(customSystemException);
                    }
                    TR.O(ya2, false, true);
                    ya2 = this.r(compressionUtility, configurationParameterController);
                }
                try {
                    try {
                        if (!(ya2 instanceof AuthenticationGateway) && !(ya2 instanceof CryptographicSecurityProvider)) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolDecoder345.a(customSystemException);
                    }
                    TR.a((DataTransformationProtocol2153)((Object)ya2), compressionUtility, configurationParameterController);
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDecoder345.a(customSystemException);
                }
            }
            try {
                try {
                    try {
                        if (!this.v.R() || ya2 == null) break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolDecoder345.a(customSystemException);
                    }
                    if (ya2.equals(ConfigurationCalibrator.b.N())) break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDecoder345.a(customSystemException);
                }
                ConfigurationCalibrator.b.W(ya2);
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder345.a(customSystemException);
            }
        }
        return ya2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkProtocolDecoder345.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'k' || c == 'q' || c == 'F' || c == '\u00e8') {
                field = NetworkProtocolDecoder345.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'k' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkProtocolDecoder345.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00da' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private <T extends Ya> T t(T t) {
        try {
            t.F(true);
            t.N(0.1f);
            t.E(true);
            t.i(true);
            t.q(true);
            t.v(true);
            t.J(true);
            t.L(((Double)this.v.L.J()).floatValue());
            t.h(true);
            if (t instanceof CryptographicSecurityProvider) {
                ((CryptographicSecurityProvider)t).n(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder345.a(customSystemException);
        }
        return t;
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NetworkProtocolDecoder345.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkProtocolDecoder345.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/X0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkProtocolDecoder345.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkProtocolDecoder345.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    GenericContainerTemplate<ReflectionUtilityBroker> x(@NotNull ConfigurationParameterController configurationParameterController, @Nullable CompressionUtility compressionUtility, @Nullable NetworkConfigManager networkConfigManager) {
        GenericContainerTemplate genericContainerTemplate;
        long l;
        block24: {
            l = a ^ 0x34FC86CC5D4CL;
            genericContainerTemplate = new GenericContainerTemplate();
            try {
                try {
                    if (networkConfigManager == null || !networkConfigManager.m(1000L)) break block24;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolDecoder345.a(customSystemException);
                }
                return (GenericContainerTemplate)genericContainerTemplate.V((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)19564, (long)(0x16E351B838DD677AL ^ l)), (long)2690083157865645602L, (long)l)));
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder345.a(customSystemException);
            }
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)28915, (long)(0x4C07FE1495A2DBE2L ^ l)), (long)2690083157865645602L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder345.a(customSystemException);
        }
        if (compressionUtility != null) {
            // empty if block
        }
        GenericConfigurationResolver genericConfigurationResolver = this.v.m();
        try {
            if (genericConfigurationResolver.Y()) {
                return (GenericContainerTemplate)((GenericContainerTemplate)genericContainerTemplate.V((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)6882, (long)(0x4D21EDB8D606B1F9L ^ l)), (long)2690083157865645602L, (long)l)) + genericConfigurationResolver.w())).i(genericConfigurationResolver.H());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder345.a(customSystemException);
        }
        try {
            if (genericConfigurationResolver.M()) {
                return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)31634, (long)(0x73DA7A6B711A5081L ^ l)), (long)2690083157865645602L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder345.a(customSystemException);
        }
        NetworkPacketInterceptor1107 networkPacketInterceptor1107 = TR.D(configurationParameterController);
        try {
            if (networkPacketInterceptor1107.Y()) {
                return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)21118, (long)(0x2BF668D59F857963L ^ l)), (long)2690083157865645602L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder345.a(customSystemException);
        }
        try {
            if (!networkPacketInterceptor1107.h()) {
                return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)9355, (long)(0x62D6ABFF03C30F94L ^ l)), (long)2690083157865645602L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder345.a(customSystemException);
        }
        try {
            if (!TR.G(compressionUtility, configurationParameterController)) {
                return (GenericContainerTemplate)genericContainerTemplate.D((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)12827, (long)(0x507DBF85CAEC9903L ^ l)), (long)2690083157865645602L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder345.a(customSystemException);
        }
        ReflectionUtilityBroker reflectionUtilityBroker = TR.r(configurationParameterController);
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().D();
        OutputEncoder.f(connectionPoolOrchestrator1192, true);
        OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
        if (reflectionUtilityBroker != null) {
            // empty if block
        }
        return ((GenericContainerTemplate)genericContainerTemplate.E((String)((Object)NetworkProtocolDecoder345.b("\u00e9", (int)NetworkProtocolDecoder345.a("g", (int)30090, (long)(0x7BD22C041FB1DE9AL ^ l)), (long)2690083157865645602L, (long)l)))).w(reflectionUtilityBroker);
    }

    NetworkProtocolDecoder345(AdaptiveCryptoNegotiator adaptiveCryptoNegotiator) {
        this.v = adaptiveCryptoNegotiator;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolDecoder345.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NetworkProtocolDecoder345.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

