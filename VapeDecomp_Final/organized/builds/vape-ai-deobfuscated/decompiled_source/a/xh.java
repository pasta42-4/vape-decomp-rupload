/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._Y;
import a.kg;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.system.orchestration.SystemStateOrchestrator1202;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.stream.DataStreamCipher;
import com.data.context.ContextualDataBroker868;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionManager1286;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xh
extends ContextTransformationEngine<DataStreamCipher> {
    private static final long d;
    public final NumericPrecisionTransformer j;
    private final AuthenticationStateTracker A;
    private static final Object[] n;
    private static final String[] r;
    private int G;
    private final NumericPrecisionTransformer P;
    private kg l;
    private static final Map m;
    private static final Integer[] h;
    private final NumericPrecisionTransformer N;
    private static final long[] e;
    private final AuthenticationStateTracker x;
    public final NumericPrecisionTransformer o;
    private final NumericPrecisionTransformer L;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xh.d = MultiContainerRegistry.a(-3543053282867604258L, -2411543353366620593L, MethodHandles.lookup().lookupClass()).a(26691561906918L);
                xh.n = new Object[5];
                xh.r = new String[5];
                xh.a();
                xh.m = new HashMap<K, V>(13);
                var0 = xh.d ^ 68617270528690L;
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
                var8_3 = new long[24];
                var5_4 = 0;
                var6_5 = "\u00d4}\u00d0\u00ed\u00f4\u00b1^\u00e6\u00a7\u00fb\u00e9\u00e0\t\u008b\t^\u00b2\u0012\u0011\u001e\u0019\u00ab\u0091\u00f0\u0019\u00db\u00ff\u00b3!q\u00afc\u00e0+q\f\u00bea\u00b8\u00ac\u00054\u00aa\u0011Z\u0092&M\u00eb\u0098fj\u000fd\u00b7\u00bd\u009e[T\u001e\u00a5Se'J\u000e\u000e\u00e6\u00ab\u00bd\u0006\b\u00a2\u00bc\u008a\u00cf\u00b2\u00f9n{\u0085\u008b\u00f6?~\u009a\u0082\u00b0\u00fc\u00d0\u009e)\u00cc)\u00b3l\t\u00c8\u00c8\u00c2\u00c8Irx\u00f44\u00a2\u00fb\u0096\u001a\u001e\u00c3\u001f\u00cei\u00ff\u00cb\u009a0}H\u009a\u000e\u001eJ$h\u00e9*d\u00c0i\u00c6\u001a\u00c9\u00d9\u00f1\u00fb{8{\u0004\\\u0080\u00fcU&\u00af\u0018\u00cc\u008e\u00e7\u00b4o(\u00ad\u00f0A\u00a7\u00cd\u00afw\nx\u00c7\u00d3\u00c2-6\u00fd\u00b8\u00c4\u00c8\u00c5N\u00bd";
                var7_6 = "\u00d4}\u00d0\u00ed\u00f4\u00b1^\u00e6\u00a7\u00fb\u00e9\u00e0\t\u008b\t^\u00b2\u0012\u0011\u001e\u0019\u00ab\u0091\u00f0\u0019\u00db\u00ff\u00b3!q\u00afc\u00e0+q\f\u00bea\u00b8\u00ac\u00054\u00aa\u0011Z\u0092&M\u00eb\u0098fj\u000fd\u00b7\u00bd\u009e[T\u001e\u00a5Se'J\u000e\u000e\u00e6\u00ab\u00bd\u0006\b\u00a2\u00bc\u008a\u00cf\u00b2\u00f9n{\u0085\u008b\u00f6?~\u009a\u0082\u00b0\u00fc\u00d0\u009e)\u00cc)\u00b3l\t\u00c8\u00c8\u00c2\u00c8Irx\u00f44\u00a2\u00fb\u0096\u001a\u001e\u00c3\u001f\u00cei\u00ff\u00cb\u009a0}H\u009a\u000e\u001eJ$h\u00e9*d\u00c0i\u00c6\u001a\u00c9\u00d9\u00f1\u00fb{8{\u0004\\\u0080\u00fcU&\u00af\u0018\u00cc\u008e\u00e7\u00b4o(\u00ad\u00f0A\u00a7\u00cd\u00afw\nx\u00c7\u00d3\u00c2-6\u00fd\u00b8\u00c4\u00c8\u00c5N\u00bd".length();
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
                    var6_5 = "J\u0005\u00fb\u009eU\u00c8\u00adb\u00d2\u00fc\u008d\t\u00c5\u00a4f\u0083";
                    var7_6 = "J\u0005\u00fb\u009eU\u00c8\u00adb\u00d2\u00fc\u008d\t\u00c5\u00a4f\u0083".length();
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
        xh.e = var8_3;
        xh.h = new Integer[24];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d5' || c == 'V' || c == '\u00e1' || c == '\u00f3') {
                field = xh.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xh.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public xh(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = d ^ 0x25738FFFF845L;
        super(contextualExecutionFramework, string);
        this.x = AuthenticationStateTracker.R(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)26831, (long)(0xB9186FFD089F268L ^ l)), (long)4181607648319342755L, (long)l)), false, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)29731, (long)(0x54320F67066AEE97L ^ l)), (long)4181607648319342755L, (long)l)));
        this.A = AuthenticationStateTracker.R(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)23866, (long)(0x3EC3EF61282C479EL ^ l)), (long)4181607648319342755L, (long)l)), false, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)11260, (long)(0xC82C7E3E4FAB159L ^ l)), (long)4181607648319342755L, (long)l)));
        this.o = NumericPrecisionTransformer.t(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)16117, (long)(0x162842118DCF245FL ^ l)), (long)4181607648319342755L, (long)l)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)7612, (long)(0x20DE5110A52871DL ^ l)), (long)4181607648319342755L, (long)l)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)16427, (long)(0x6B24E001F9685A9BL ^ l)), (long)4181607648319342755L, (long)l)), 0.0, 90.0, 100.0);
        this.j = NumericPrecisionTransformer.t(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)7670, (long)(0x40D6BB4949F2875FL ^ l)), (long)4181607648319342755L, (long)l)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)17784, (long)(0x13C61E2B75445FD4L ^ l)), (long)4181607648319342755L, (long)l)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)18815, (long)(0x56CE6A85606753D0L ^ l)), (long)4181607648319342755L, (long)l)), 0.0, 100.0, 100.0);
        this.P = NumericPrecisionTransformer.D(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)27228, (long)(0x4D11F865F408F0F7L ^ l)), (long)4181607648319342755L, (long)l)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)14514, (long)(0x193FEE928307A212L ^ l)), (long)4181607648319342755L, (long)l)), "", 0.0, 1.0, 10.0, 1.0, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)19692, (long)(0x6BD815F179B8564EL ^ l)), (long)4181607648319342755L, (long)l)));
        this.L = NumericPrecisionTransformer.t(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)13389, (long)(0x2B3DBAB74ABEAEE3L ^ l)), (long)4181607648319342755L, (long)l)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)23416, (long)(0x4F63B3E2164241DBL ^ l)), (long)4181607648319342755L, (long)l)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)26629, (long)(0x7D07CC21A7FB72B2L ^ l)), (long)4181607648319342755L, (long)l)), 100.0, 120.0, 300.0);
        this.N = NumericPrecisionTransformer.t(this, (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)5360, (long)(0x921716497230E45L ^ l)), (long)4181607648319342755L, (long)l)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)12218, (long)(0x25407784D1A3B50CL ^ l)), (long)4181607648319342755L, (long)l)), (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)6458, (long)(0x7618DD967870839CL ^ l)), (long)4181607648319342755L, (long)l)), 100.0, 120.0, 300.0);
        this.G = 0;
        this.l = null;
        this.x.l(this.L, this.N, this.A);
        this.N(this.o, this.j, this.P, this.x, this.L, this.N, this.A);
        this.j.L(0);
        this.o.L(0);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = xh.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = xh.a(l, l2);
        Object object = xh.n[n];
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
                clazz3 = xh.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = xh.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xh.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        xh.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xh.b(242385708596205L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = xh.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        xh.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xh.b(242385708596205L, 0L);
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

    private void lambda$onPacketReceived$0(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222, ConnectionLifecycleHandler connectionLifecycleHandler) {
        this.P(connectionLifecycleHandler, networkPacketOrchestrator1222);
    }

    private void P(ConnectionLifecycleHandler connectionLifecycleHandler, NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        block70: {
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double[] dArray;
            double d7;
            double d8;
            double d9;
            boolean bl;
            boolean bl2;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            ConnectionLifecycleHandler connectionLifecycleHandler2;
            block66: {
                if (connectionLifecycleHandler.B(ReflectionMetadataResolver.Ub)) {
                    block60: {
                        block59: {
                            connectionLifecycleHandler2 = new SystemStateOrchestrator1202(connectionLifecycleHandler);
                            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                            bl2 = _Y.c(systemConfigurationOrchestrator);
                            bl = _Y.a(systemConfigurationOrchestrator);
                            try {
                                if (!this.x.s().booleanValue() || !this.A.s().booleanValue()) break block59;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xh.a(customSystemException);
                            }
                            bl = false;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (!bl2 || bl) break block60;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw xh.a(customSystemException);
                                    }
                                    if (this.x.s().booleanValue()) break block60;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw xh.a(customSystemException);
                                }
                                if (!((DataStreamCipher)this.n()).r.s().booleanValue()) break block60;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xh.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xh.a(customSystemException);
                        }
                    }
                    if (((DataStreamCipher)this.n()).B()) {
                        block62: {
                            boolean bl3;
                            block65: {
                                block64: {
                                    block61: {
                                        d9 = ((SystemStateOrchestrator1202)connectionLifecycleHandler2).r();
                                        d8 = ((SystemStateOrchestrator1202)connectionLifecycleHandler2).v();
                                        d7 = ((SystemStateOrchestrator1202)connectionLifecycleHandler2).x();
                                        try {
                                            try {
                                                if (!bl2 || bl) break block61;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw xh.a(customSystemException);
                                            }
                                            if (!this.x.s().booleanValue()) break block61;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw xh.a(customSystemException);
                                        }
                                        double d10 = (Double)this.L.J() / 100.0;
                                        double d11 = (Double)this.N.J() / 100.0;
                                        double d12 = this.M(d9, d10);
                                        double d13 = this.M(d8, d11);
                                        double d14 = this.M(d7, d10);
                                        ((SystemStateOrchestrator1202)connectionLifecycleHandler2).h((float)d12);
                                        ((SystemStateOrchestrator1202)connectionLifecycleHandler2).v((float)d13);
                                        ((SystemStateOrchestrator1202)connectionLifecycleHandler2).a((float)d14);
                                        return;
                                    }
                                    try {
                                        block63: {
                                            try {
                                                try {
                                                    try {
                                                        if (!((Double)this.P.J() > 0.0)) break block62;
                                                        if ((double)Math.abs(((SystemStateOrchestrator1202)connectionLifecycleHandler2).r()) >= 0.005) break block63;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw xh.a(customSystemException);
                                                    }
                                                    if ((double)Math.abs(((SystemStateOrchestrator1202)connectionLifecycleHandler2).v()) >= 0.005) break block63;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw xh.a(customSystemException);
                                                }
                                                if (!((double)Math.abs(((SystemStateOrchestrator1202)connectionLifecycleHandler2).x()) >= 0.005)) break block64;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw xh.a(customSystemException);
                                            }
                                        }
                                        bl3 = true;
                                        break block65;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw xh.a(customSystemException);
                                    }
                                }
                                bl3 = false;
                            }
                            boolean bl4 = bl3;
                            try {
                                if (bl4) {
                                    this.G = ((Double)this.P.J()).intValue();
                                    this.l = new kg(((SystemStateOrchestrator1202)connectionLifecycleHandler2).r(), ((SystemStateOrchestrator1202)connectionLifecycleHandler2).v(), ((SystemStateOrchestrator1202)connectionLifecycleHandler2).x());
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xh.a(customSystemException);
                            }
                            return;
                        }
                        dArray = this.b();
                        d6 = dArray[0] / 100.0;
                        d5 = dArray[1] / 100.0;
                        d4 = this.M(d9, d6);
                        d3 = this.M(d8, d5);
                        d2 = this.M(d7, d6);
                        try {
                            try {
                                ((SystemStateOrchestrator1202)connectionLifecycleHandler2).h((float)d4);
                                ((SystemStateOrchestrator1202)connectionLifecycleHandler2).v((float)d3);
                                ((SystemStateOrchestrator1202)connectionLifecycleHandler2).a((float)d2);
                                if (d6 != 0.0 || d5 != 0.0) break block66;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xh.a(customSystemException);
                            }
                            ((SystemStateOrchestrator1202)connectionLifecycleHandler2).h(0.0f);
                            ((SystemStateOrchestrator1202)connectionLifecycleHandler2).v(0.0f);
                            ((SystemStateOrchestrator1202)connectionLifecycleHandler2).a(0.0f);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xh.a(customSystemException);
                        }
                    }
                }
            }
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bh)) {
                connectionLifecycleHandler2 = new NetworkConnectionManager1286(connectionLifecycleHandler);
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw xh.a(customSystemException);
                }
                if (((NetworkConnectionManager1286)connectionLifecycleHandler2).h() == systemConfigurationOrchestrator.X()) {
                    block68: {
                        block67: {
                            bl2 = _Y.c(systemConfigurationOrchestrator);
                            bl = _Y.a(systemConfigurationOrchestrator);
                            try {
                                if (!this.x.s().booleanValue() || !this.A.s().booleanValue()) break block67;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xh.a(customSystemException);
                            }
                            bl = false;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (bl2 || bl) break block68;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw xh.a(customSystemException);
                                    }
                                    if (this.x.s().booleanValue()) break block68;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw xh.a(customSystemException);
                                }
                                if (!((DataStreamCipher)this.n()).r.s().booleanValue()) break block68;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xh.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xh.a(customSystemException);
                        }
                    }
                    if (((DataStreamCipher)this.n()).B()) {
                        block69: {
                            d9 = ((NetworkConnectionManager1286)connectionLifecycleHandler2).K();
                            d8 = ((NetworkConnectionManager1286)connectionLifecycleHandler2).I();
                            d7 = ((NetworkConnectionManager1286)connectionLifecycleHandler2).o();
                            if (GameVersionEnumerator.MC_1_21_10.H()) {
                                d9 /= 8000.0;
                                d8 /= 8000.0;
                                d7 /= 8000.0;
                            }
                            try {
                                try {
                                    if (!bl2 || bl) break block69;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw xh.a(customSystemException);
                                }
                                if (!this.x.s().booleanValue()) break block69;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xh.a(customSystemException);
                            }
                            double d15 = (Double)this.L.J() / 100.0;
                            double d16 = (Double)this.N.J() / 100.0;
                            double d17 = d9 * d15;
                            double d18 = d8 * d16;
                            double d19 = d7 * d15;
                            ((NetworkConnectionManager1286)connectionLifecycleHandler2).Y(d17);
                            ((NetworkConnectionManager1286)connectionLifecycleHandler2).c(d18);
                            ((NetworkConnectionManager1286)connectionLifecycleHandler2).U(d19);
                            return;
                        }
                        try {
                            if ((Double)this.P.J() > 0.0) {
                                this.G = ((Double)this.P.J()).intValue();
                                this.l = new kg((double)((NetworkConnectionManager1286)connectionLifecycleHandler2).K() / 8000.0, (double)((NetworkConnectionManager1286)connectionLifecycleHandler2).I() / 8000.0, (double)((NetworkConnectionManager1286)connectionLifecycleHandler2).o() / 8000.0);
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xh.a(customSystemException);
                        }
                        dArray = this.b();
                        d6 = dArray[0] / 100.0;
                        d5 = dArray[1] / 100.0;
                        d4 = d9 * d6;
                        d3 = d8 * d5;
                        d2 = d7 * d6;
                        try {
                            try {
                                ((NetworkConnectionManager1286)connectionLifecycleHandler2).Y(d4);
                                ((NetworkConnectionManager1286)connectionLifecycleHandler2).c(d3);
                                ((NetworkConnectionManager1286)connectionLifecycleHandler2).U(d2);
                                if (d6 != 0.0 || d5 != 0.0) break block70;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xh.a(customSystemException);
                            }
                            ((NetworkConnectionManager1286)connectionLifecycleHandler2).Y(0.0);
                            ((NetworkConnectionManager1286)connectionLifecycleHandler2).c(0.0);
                            ((NetworkConnectionManager1286)connectionLifecycleHandler2).U(0.0);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xh.a(customSystemException);
                        }
                    }
                }
            }
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = xh.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = xh.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void H(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        try {
            if (((DataStreamCipher)this.n()).R()) {
                return;
            }
        }
        catch (Exception exception) {
            throw xh.a(exception);
        }
        try {
            if (networkPacketOrchestrator1222.getPacketInstance() == null) {
                return;
            }
            ConnectionLifecycleHandler connectionLifecycleHandler = networkPacketOrchestrator1222.getPacket();
            ConnectionLifecycleHandler.A(connectionLifecycleHandler, arg_0 -> this.lambda$onPacketReceived$0(networkPacketOrchestrator1222, arg_0));
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xh.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = xh.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "J3V";
        objectArray[1] = Integer.TYPE;
        xh.r[1] = "java/lang/Integer";
        objectArray[2] = "c\u000e2}^[h\u0001#2#C{\u0006*{";
        objectArray[3] = "\n\u001e\u0014ogS\u0001\u0011\u0005 \u0006]\n\u001a\u0001z";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "]\u000b#\u001bT\bP\u0004 $D\u001f`\u001e.BL\r\u000b]/U/]\u001a]5CL\u001f\u0011\u0000 $";
    }

    private double[] b() {
        double d2;
        double d3 = (Double)this.o.J();
        double d4 = (Double)this.j.J();
        Random random = new Random();
        double d5 = random.nextDouble();
        if (d3 > 0.0) {
            d2 = d3 + (d3 + 5.0 - d3) * d5;
            if (d2 >= 100.0) {
                d2 = 100.0;
            }
            d3 = d2;
        }
        if (d4 > 0.0) {
            d2 = d4 + (d4 + 5.0 - d4) * d5;
            if (d2 >= 90.0) {
                d2 = 100.0;
            }
            d4 = d2;
        }
        return new double[]{d3, d4};
    }

    @Override
    public String t() {
        long l = d ^ 0x26E02E8D2E8EL;
        return this.o.p() + (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)20529, (long)(0x78D1730C5DE41C48L ^ l)), (long)-1386249331441181080L, (long)l)) + this.j.p() + (String)((Object)xh.c("\u00a5", (int)xh.a("s", (int)11246, (long)(0x361C35A4A394E78DL ^ l)), (long)-1386249331441181080L, (long)l));
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xh" + " : " + string + " : " + methodType.toString(), exception);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = xh.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n4] != null) {
            return n4;
        }
        Object object = xh.n[n4];
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
                n3 = 29;
                break;
            }
            case 2: {
                n3 = 43;
                break;
            }
            case 3: {
                n3 = 16;
                break;
            }
            case 4: {
                n3 = 8;
                break;
            }
            case 5: {
                n3 = 6;
                break;
            }
            case 6: {
                n3 = 41;
                break;
            }
            case 7: {
                n3 = 18;
                break;
            }
            case 8: {
                n3 = 40;
                break;
            }
            case 9: {
                n3 = 59;
                break;
            }
            case 10: {
                n3 = 34;
                break;
            }
            case 11: {
                n3 = 31;
                break;
            }
            case 12: {
                n3 = 4;
                break;
            }
            case 13: {
                n3 = 62;
                break;
            }
            case 14: {
                n3 = 7;
                break;
            }
            case 15: {
                n3 = 47;
                break;
            }
            case 16: {
                n3 = 61;
                break;
            }
            case 17: {
                n3 = 60;
                break;
            }
            case 18: {
                n3 = 45;
                break;
            }
            case 19: {
                n3 = 28;
                break;
            }
            case 20: {
                n3 = 48;
                break;
            }
            case 21: {
                n3 = 38;
                break;
            }
            case 22: {
                n3 = 57;
                break;
            }
            case 23: {
                n3 = 37;
                break;
            }
            case 24: {
                n3 = 49;
                break;
            }
            case 25: {
                n3 = 11;
                break;
            }
            case 26: {
                n3 = 3;
                break;
            }
            case 27: {
                n3 = 39;
                break;
            }
            case 28: {
                n3 = 21;
                break;
            }
            case 29: {
                n3 = 12;
                break;
            }
            case 30: {
                n3 = 35;
                break;
            }
            case 31: {
                n3 = 13;
                break;
            }
            case 32: {
                n3 = 1;
                break;
            }
            case 33: {
                n3 = 27;
                break;
            }
            case 34: {
                n3 = 50;
                break;
            }
            case 35: {
                n3 = 20;
                break;
            }
            case 36: {
                n3 = 63;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 25;
                break;
            }
            case 39: {
                n3 = 32;
                break;
            }
            case 40: {
                n3 = 52;
                break;
            }
            case 41: {
                n3 = 23;
                break;
            }
            case 42: {
                n3 = 0;
                break;
            }
            case 43: {
                n3 = 17;
                break;
            }
            case 44: {
                n3 = 55;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 58;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 22;
                break;
            }
            case 49: {
                n3 = 9;
                break;
            }
            case 50: {
                n3 = 10;
                break;
            }
            case 51: {
                n3 = 30;
                break;
            }
            case 52: {
                n3 = 53;
                break;
            }
            case 53: {
                n3 = 54;
                break;
            }
            case 54: {
                n3 = 56;
                break;
            }
            case 55: {
                n3 = 46;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 2;
                break;
            }
            case 58: {
                n3 = 44;
                break;
            }
            case 59: {
                n3 = 42;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 19;
                break;
            }
            case 62: {
                n3 = 14;
                break;
            }
            default: {
                n3 = 26;
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
        xh.r[n4] = new String(cArray);
        return n4;
    }

    @DataExchangeProtocol2090
    public void n(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block11: {
            block13: {
                double d2;
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                block14: {
                    block12: {
                        try {
                            if (((DataStreamCipher)this.n()).R()) {
                                this.l = null;
                                this.G = 0;
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xh.a(customSystemException);
                        }
                        try {
                            try {
                                if (this.l == null) break block11;
                                if (this.G <= 0) break block12;
                                break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw xh.a(customSystemException);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xh.a(customSystemException);
                        }
                    }
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    double[] dArray = this.b();
                    d2 = dArray[0] / 100.0;
                    double d3 = dArray[1] / 100.0;
                    double d4 = systemConfigurationOrchestrator.x();
                    try {
                        try {
                            if (this.l.w == 0.0 || !(d4 > 0.0)) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw xh.a(customSystemException);
                        }
                        systemConfigurationOrchestrator.z(this.M(systemConfigurationOrchestrator.x(), d3));
                    }
                    catch (CustomSystemException customSystemException) {
                        throw xh.a(customSystemException);
                    }
                }
                systemConfigurationOrchestrator.t(this.M(systemConfigurationOrchestrator.G(), d2));
                systemConfigurationOrchestrator.s(this.M(systemConfigurationOrchestrator.o(), d2));
                this.l = null;
            }
            --this.G;
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x20AC;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
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
                throw new RuntimeException("a/xh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xh.h[n2] = n3;
        }
        return h[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Field c(long l, long l2) {
        int n = xh.a(l, l2);
        Object object = xh.n[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = xh.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = xh.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xh.a(clazz3, string2, clazz2)) != null) {
                    xh.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = xh.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        xh.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xh.b(242385708596205L, 0L);
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
            int n = xh.a(l, l2);
            object = xh.n[n];
            try {
                if (!(object instanceof String)) break block2;
                xh.n[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private double M(double d2, double d3) {
        boolean bl;
        CallSite callSite;
        long l = d ^ 0x617E795BE54CL;
        String string = Double.toString(Math.abs(d2));
        try {
            callSite = string.contains((CharSequence)((Object)xh.c("\u00a5", (int)xh.a("s", (int)31740, (long)(0x4A54D629DE19FC58L ^ l)), (long)2810609065146029482L, (long)l))) ? xh.c("\u00a5", (int)xh.a("s", (int)2652, (long)(0x6395B829A1478DE6L ^ l)), (long)2810609065146029482L, (long)l) : xh.c("\u00a5", (int)xh.a("s", (int)2819, (long)(0x11E5108908868CBBL ^ l)), (long)2810609065146029482L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw xh.a(customSystemException);
        }
        CallSite callSite2 = callSite;
        int n = string.indexOf((String)((Object)callSite2));
        int n2 = string.length() - n - 1;
        ContextualDataBroker868 contextualDataBroker868 = new ContextualDataBroker868(n2);
        try {
            bl = d3 < 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw xh.a(customSystemException);
        }
        boolean bl2 = bl;
        double d4 = Math.abs(d3);
        double d5 = d2 * d4;
        if (bl2) {
            d5 = -d5;
        }
        return contextualDataBroker868.U(d5);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(xh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

