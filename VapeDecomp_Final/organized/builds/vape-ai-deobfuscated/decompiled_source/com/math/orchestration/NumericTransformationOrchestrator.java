/*
 * Decompiled with CFR 0.152.
 */
package com.math.orchestration;

import a.a;
import com.adapter.management.GenericAdapterManager;
import com.adapter.transformation.GenericAdapterTransformer;
import com.app.network.protocol.ProtocolAdapterResolver;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.deobfuscation.mapping.GenericComponentMapper;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.propagation.EventPropagationDispatcher;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.runtime.context.ContextualExecutionFramework;
import com.spatial.events.SpatialEventEmitter;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.pipeline.ObjectPipelineManager;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NumericTransformationOrchestrator
extends ContextualExecutionFramework {
    public double o;
    public int V;
    private final GenericComponentMapper Z;
    public double m;
    private static final long b;
    private final GenericAdapterManager O;
    private static final Object[] j;
    private static final String[] l;
    private static final Map h;
    private static final long[] d;
    private static final Integer[] e;
    private final GenericComponentMapper P;

    public void e(SpatialEventEmitter spatialEventEmitter, double d2, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        float f;
        double d3;
        double d4;
        block15: {
            block16: {
                float f2;
                float f3;
                block17: {
                    float f4;
                    float f5;
                    block19: {
                        block18: {
                            block14: {
                                d4 = systemConfigurationOrchestrator.W().t();
                                d3 = systemConfigurationOrchestrator.W().m();
                                f = systemConfigurationOrchestrator.q();
                                try {
                                    try {
                                        if (d4 != 0.0 || d3 != 0.0) break block14;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NumericTransformationOrchestrator.a(customSystemException);
                                    }
                                    spatialEventEmitter.setX(0.0);
                                    spatialEventEmitter.setZ(0.0);
                                    break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericTransformationOrchestrator.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (d4 == 0.0) break block15;
                                            if (d3 == 0.0) break block16;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NumericTransformationOrchestrator.a(customSystemException);
                                        }
                                        if (!(d3 > 0.0)) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NumericTransformationOrchestrator.a(customSystemException);
                                    }
                                    f5 = f;
                                    if (!(d4 > 0.0)) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NumericTransformationOrchestrator.a(customSystemException);
                                }
                                f4 = -45.0f;
                                break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NumericTransformationOrchestrator.a(customSystemException);
                            }
                        }
                        f4 = 45.0f;
                    }
                    f = f5 + f4;
                    d3 = 0.0;
                    break block16;
                }
                try {
                    f3 = f;
                    f2 = d4 > 0.0 ? 45.0f : -45.0f;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationOrchestrator.a(customSystemException);
                }
                f = f3 + f2;
                d3 = 0.0;
            }
            d4 = d4 > 0.0 ? 1.0 : -1.0;
        }
        double d5 = Math.cos(Math.toRadians(f + 90.0f));
        double d6 = Math.sin(Math.toRadians(f + 90.0f));
        spatialEventEmitter.setX(d4 * d2 * d5 + d3 * d2 * d6);
        spatialEventEmitter.setZ(d4 * d2 * d6 - d3 * d2 * d5);
    }

    public NumericTransformationOrchestrator() {
        long l = b ^ 0x13605BD60A9L;
        super(a.cs((int)NumericTransformationOrchestrator.a("k", (int)23475, (long)(0x5D6CA4016DE54897L ^ l))), (int)NumericTransformationOrchestrator.a("k", (int)6650, (long)(0x2DF1FA9FFBBB0ADFL ^ l)), RecursiveNodeGraph.P, a.cs((int)NumericTransformationOrchestrator.a("k", (int)1627, (long)(0x558CB24354B1957BL ^ l))));
        this.Z = new ProtocolAdapterResolver(this, (String)((Object)NumericTransformationOrchestrator.c("\u00c2", (int)NumericTransformationOrchestrator.a("k", (int)8423, (long)(0x444EBD225B6FB3C6L ^ l)), (long)-6523353018802684817L, (long)l))).w();
        this.P = new GenericAdapterTransformer(this, (String)((Object)NumericTransformationOrchestrator.c("\u00c2", (int)NumericTransformationOrchestrator.a("k", (int)23970, (long)(0x53EC004B03594E84L ^ l)), (long)-6523353018802684817L, (long)l))).w();
        this.O = GenericAdapterManager.I(this, (String)((Object)NumericTransformationOrchestrator.c("\u00c2", (int)NumericTransformationOrchestrator.a("k", (int)14576, (long)(0x2E8AAA6075DD2BD3L ^ l)), (long)-6523353018802684817L, (long)l)), (String)((Object)NumericTransformationOrchestrator.c("\u00c2", (int)NumericTransformationOrchestrator.a("k", (int)8284, (long)(0x438AB5E6FCC6B37EL ^ l)), (long)-6523353018802684817L, (long)l)), this.P, this.Z, this.P);
        this.q(false);
        this.N(this.O);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NumericTransformationOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NumericTransformationOrchestrator.b(classArray[i], string, clazz2);
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
            throw new RuntimeException("a/Ap" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public String H() {
        return this.O.p();
    }

    @Override
    public boolean j() {
        return true;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c9' || c == '\u00d4' || c == 'a' || c == 'R') {
                field = NumericTransformationOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NumericTransformationOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ap" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NumericTransformationOrchestrator.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                NumericTransformationOrchestrator.j[n] = clazz = Class.forName(NumericTransformationOrchestrator.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NumericTransformationOrchestrator.b = MultiContainerRegistry.a(5065186574218076304L, -3972372932537662112L, MethodHandles.lookup().lookupClass()).a(269626453565382L);
                NumericTransformationOrchestrator.j = new Object[5];
                NumericTransformationOrchestrator.l = new String[5];
                NumericTransformationOrchestrator.a();
                NumericTransformationOrchestrator.h = new HashMap<K, V>(13);
                var0 = NumericTransformationOrchestrator.b ^ 472582001805L;
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
                var6_5 = "\u009c;NH\u00b0|\u008d\u00cd\u00d52\u00cb$\u0004f\u00d35\u00e1\u001a@\u008c\u0001\u001d\u00a6\u00e7\u009b\u00aa\u00dd0\u00abH\u00d2\u00d2=:\u00a4\u0012\u008e\u0087\u00d3>\u008d\u00d6\r\u0015\u0092\u00c7Sz";
                var7_6 = "\u009c;NH\u00b0|\u008d\u00cd\u00d52\u00cb$\u0004f\u00d35\u00e1\u001a@\u008c\u0001\u001d\u00a6\u00e7\u009b\u00aa\u00dd0\u00abH\u00d2\u00d2=:\u00a4\u0012\u008e\u0087\u00d3>\u008d\u00d6\r\u0015\u0092\u00c7Sz".length();
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
                    var6_5 = "\u00e8)\u00af\u00f4\u001f\u0086\u0000KQb\u00e7\u00a5\u0010\u0084\u00d5H";
                    var7_6 = "\u00e8)\u00af\u00f4\u001f\u0086\u0000KQb\u00e7\u00a5\u0010\u0084\u00d5H".length();
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
        NumericTransformationOrchestrator.d = var8_3;
        NumericTransformationOrchestrator.e = new Integer[8];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NumericTransformationOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NumericTransformationOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (NumericTransformationOrchestrator.l[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 44;
                break;
            }
            case 1: {
                n3 = 42;
                break;
            }
            case 2: {
                n3 = 14;
                break;
            }
            case 3: {
                n3 = 8;
                break;
            }
            case 4: {
                n3 = 32;
                break;
            }
            case 5: {
                n3 = 52;
                break;
            }
            case 6: {
                n3 = 63;
                break;
            }
            case 7: {
                n3 = 47;
                break;
            }
            case 8: {
                n3 = 25;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 51;
                break;
            }
            case 11: {
                n3 = 34;
                break;
            }
            case 12: {
                n3 = 60;
                break;
            }
            case 13: {
                n3 = 50;
                break;
            }
            case 14: {
                n3 = 15;
                break;
            }
            case 15: {
                n3 = 40;
                break;
            }
            case 16: {
                n3 = 23;
                break;
            }
            case 17: {
                n3 = 41;
                break;
            }
            case 18: {
                n3 = 43;
                break;
            }
            case 19: {
                n3 = 2;
                break;
            }
            case 20: {
                n3 = 11;
                break;
            }
            case 21: {
                n3 = 31;
                break;
            }
            case 22: {
                n3 = 22;
                break;
            }
            case 23: {
                n3 = 21;
                break;
            }
            case 24: {
                n3 = 45;
                break;
            }
            case 25: {
                n3 = 53;
                break;
            }
            case 26: {
                n3 = 28;
                break;
            }
            case 27: {
                n3 = 55;
                break;
            }
            case 28: {
                n3 = 5;
                break;
            }
            case 29: {
                n3 = 30;
                break;
            }
            case 30: {
                n3 = 4;
                break;
            }
            case 31: {
                n3 = 0;
                break;
            }
            case 32: {
                n3 = 49;
                break;
            }
            case 33: {
                n3 = 29;
                break;
            }
            case 34: {
                n3 = 17;
                break;
            }
            case 35: {
                n3 = 7;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 37;
                break;
            }
            case 38: {
                n3 = 48;
                break;
            }
            case 39: {
                n3 = 59;
                break;
            }
            case 40: {
                n3 = 13;
                break;
            }
            case 41: {
                n3 = 33;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 12;
                break;
            }
            case 44: {
                n3 = 62;
                break;
            }
            case 45: {
                n3 = 19;
                break;
            }
            case 46: {
                n3 = 1;
                break;
            }
            case 47: {
                n3 = 9;
                break;
            }
            case 48: {
                n3 = 3;
                break;
            }
            case 49: {
                n3 = 39;
                break;
            }
            case 50: {
                n3 = 24;
                break;
            }
            case 51: {
                n3 = 61;
                break;
            }
            case 52: {
                n3 = 36;
                break;
            }
            case 53: {
                n3 = 27;
                break;
            }
            case 54: {
                n3 = 26;
                break;
            }
            case 55: {
                n3 = 38;
                break;
            }
            case 56: {
                n3 = 6;
                break;
            }
            case 57: {
                n3 = 10;
                break;
            }
            case 58: {
                n3 = 35;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 57;
                break;
            }
            case 61: {
                n3 = 56;
                break;
            }
            case 62: {
                n3 = 20;
                break;
            }
            default: {
                n3 = 46;
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
        NumericTransformationOrchestrator.l[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void h() {
        long l = b ^ 0x52FA687F0336L;
        TemporalMetadataResolver.h.a().I(this);
        this.o = this.V();
        this.m = 0.0;
        this.V = (int)NumericTransformationOrchestrator.a("k", (int)17488, (long)(0x68D3EECE3B8D34E8L ^ l));
    }

    private static Field c(long l, long l2) {
        int n = NumericTransformationOrchestrator.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = NumericTransformationOrchestrator.l[n];
            int n2 = string.indexOf(8);
            Class clazz = NumericTransformationOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NumericTransformationOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NumericTransformationOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    NumericTransformationOrchestrator.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NumericTransformationOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NumericTransformationOrchestrator.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NumericTransformationOrchestrator.b(250288461137265L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "o\u001f\b";
        objectArray[1] = Integer.TYPE;
        NumericTransformationOrchestrator.l[1] = "java/lang/Integer";
        objectArray[2] = "@tt\b\u0000.K{eG}6X|l\u000e";
        objectArray[3] = "\u0004Ff^*\u0007\u000fIw\u0011K\t\u0004BsK";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u000f\fC\u001dpI[Z\u001aez\u000e`XA\u0017r\u0014\rP\u000b\u0017auY\u0004\u001f\b \u0019Z\u0010@\u0017\u0011";
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NumericTransformationOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(long l, long l2) {
        int n = NumericTransformationOrchestrator.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = NumericTransformationOrchestrator.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = NumericTransformationOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NumericTransformationOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NumericTransformationOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NumericTransformationOrchestrator.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NumericTransformationOrchestrator.b(250288461137265L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NumericTransformationOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NumericTransformationOrchestrator.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NumericTransformationOrchestrator.b(250288461137265L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NumericTransformationOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGH)
    public void T(EventPropagationDispatcher eventPropagationDispatcher) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        double d2 = systemConfigurationOrchestrator.F() - systemConfigurationOrchestrator.f();
        double d3 = systemConfigurationOrchestrator.B() - systemConfigurationOrchestrator.n();
        this.m = Math.sqrt(d2 * d2 + d3 * d3);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x365B;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ap", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NumericTransformationOrchestrator.e[n2] = n3;
        }
        return e[n2];
    }

    public void d(int n) {
        this.V = n;
    }

    public double V() {
        double d2;
        block2: {
            d2 = 0.28730000691562896;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                if (!systemConfigurationOrchestrator.e(ObjectPipelineManager.X) || systemConfigurationOrchestrator.W(ObjectPipelineManager.X).V() <= 10) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationOrchestrator.a(customSystemException);
            }
            int n = systemConfigurationOrchestrator.W(ObjectPipelineManager.X).y();
            d2 *= 1.0 + 0.15 * (double)(n + 1);
        }
        return d2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NumericTransformationOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NumericTransformationOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

