/*
 * Decompiled with CFR 0.152.
 */
package com.geo.resolver;

import a.FU;
import a._Y;
import a.a;
import com.app.resources.ResourceLifecycleManager1543;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.TransformationEngine;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.network.configuration.NetworkConfigManager;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.security.cipher.CryptographicTransformer1102;
import com.security.event.SecureEventOrchestrator;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
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

public class GeolocationResolver
extends ContextualExecutionFramework {
    private static final long[] d;
    private static final long b;
    private static final String[] l;
    private int v;
    private final NumericPrecisionTransformer K;
    private static final Object[] j;
    private static final Integer[] e;
    private final NetworkConfigManager F;
    private final FU o;
    private static final Map h;

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D8C;
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
                throw new RuntimeException("a/AH", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GeolocationResolver.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GeolocationResolver.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void B(TransformationEngine transformationEngine) {
        block20: {
            boolean bl;
            ResourceLifecycleManager1543 resourceLifecycleManager1543;
            int n;
            block19: {
                boolean bl2;
                block18: {
                    n = -1;
                    int n2 = SystemDiagnosticAnalyzer.M() * transformationEngine.O() / ApplicationLifecycleManager.e();
                    int n3 = transformationEngine.i() - SystemDiagnosticAnalyzer.k() * transformationEngine.i() / ApplicationLifecycleManager.b() - 1;
                    resourceLifecycleManager1543 = transformationEngine.I(n2, n3);
                    int n4 = transformationEngine.R();
                    int n5 = transformationEngine.H();
                    try {
                        block17: {
                            try {
                                try {
                                    try {
                                        if (n2 < n4 || n3 < n5) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeolocationResolver.a(customSystemException);
                                    }
                                    if (n2 >= n4 + transformationEngine.V()) break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeolocationResolver.a(customSystemException);
                                }
                                if (n3 < n5 + transformationEngine.r()) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeolocationResolver.a(customSystemException);
                            }
                        }
                        bl2 = true;
                        break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeolocationResolver.a(customSystemException);
                    }
                }
                bl2 = bl = false;
            }
            if (resourceLifecycleManager1543.r()) {
                n = resourceLifecycleManager1543.G();
            }
            if (bl) {
                n = -1;
            }
            if (n >= 0) {
                block21: {
                    LightweightExecutionContext lightweightExecutionContext = _Y.g();
                    try {
                        try {
                            try {
                                if (!lightweightExecutionContext.Y() || this.v == n) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeolocationResolver.a(customSystemException);
                            }
                            CryptographicTransformer1102.F();
                            CryptographicTransformer1102.B();
                            if (!this.Q(0.8)) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeolocationResolver.a(customSystemException);
                        }
                        this.v = n;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeolocationResolver.a(customSystemException);
                    }
                }
                this.F.m();
            }
        }
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "7\u0013|";
        objectArray[1] = Integer.TYPE;
        GeolocationResolver.l[1] = "java/lang/Integer";
        objectArray[2] = "F*|Zc\u0010M%m\u0015\u001e\b^\"d\\";
        objectArray[3] = "hjW\u0003\r3ceFLl=hnB\u0016";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0005e\u0016Z\u000e\u0015_e\u0017(^Wn=\u001aMX\u0016\u0011i\u000eYW,T>OH\\V\u00008\u001aG5";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d2' || c == 'J' || c == '\u00de' || c == '\u00e2') {
                field = GeolocationResolver.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00de' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GeolocationResolver.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'L' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        if (GeolocationResolver.l[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 36;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 8;
                break;
            }
            case 3: {
                n3 = 9;
                break;
            }
            case 4: {
                n3 = 10;
                break;
            }
            case 5: {
                n3 = 56;
                break;
            }
            case 6: {
                n3 = 43;
                break;
            }
            case 7: {
                n3 = 4;
                break;
            }
            case 8: {
                n3 = 45;
                break;
            }
            case 9: {
                n3 = 0;
                break;
            }
            case 10: {
                n3 = 13;
                break;
            }
            case 11: {
                n3 = 50;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 58;
                break;
            }
            case 14: {
                n3 = 35;
                break;
            }
            case 15: {
                n3 = 54;
                break;
            }
            case 16: {
                n3 = 34;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 28;
                break;
            }
            case 19: {
                n3 = 22;
                break;
            }
            case 20: {
                n3 = 48;
                break;
            }
            case 21: {
                n3 = 17;
                break;
            }
            case 22: {
                n3 = 42;
                break;
            }
            case 23: {
                n3 = 18;
                break;
            }
            case 24: {
                n3 = 24;
                break;
            }
            case 25: {
                n3 = 2;
                break;
            }
            case 26: {
                n3 = 15;
                break;
            }
            case 27: {
                n3 = 14;
                break;
            }
            case 28: {
                n3 = 3;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 26;
                break;
            }
            case 31: {
                n3 = 19;
                break;
            }
            case 32: {
                n3 = 20;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 41;
                break;
            }
            case 36: {
                n3 = 30;
                break;
            }
            case 37: {
                n3 = 21;
                break;
            }
            case 38: {
                n3 = 44;
                break;
            }
            case 39: {
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 46;
                break;
            }
            case 42: {
                n3 = 60;
                break;
            }
            case 43: {
                n3 = 6;
                break;
            }
            case 44: {
                n3 = 47;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 32;
                break;
            }
            case 48: {
                n3 = 5;
                break;
            }
            case 49: {
                n3 = 40;
                break;
            }
            case 50: {
                n3 = 31;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 51;
                break;
            }
            case 53: {
                n3 = 23;
                break;
            }
            case 54: {
                n3 = 63;
                break;
            }
            case 55: {
                n3 = 52;
                break;
            }
            case 56: {
                n3 = 37;
                break;
            }
            case 57: {
                n3 = 25;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 33;
                break;
            }
            case 61: {
                n3 = 38;
                break;
            }
            case 62: {
                n3 = 61;
                break;
            }
            default: {
                n3 = 55;
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
        GeolocationResolver.l[n4] = new String(cArray);
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = GeolocationResolver.a(l, l2);
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
                String string2 = GeolocationResolver.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = GeolocationResolver.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GeolocationResolver.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GeolocationResolver.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        GeolocationResolver.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GeolocationResolver.b(279053336997142L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GeolocationResolver.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GeolocationResolver.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GeolocationResolver.b(279053336997142L, 0L);
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
        MethodHandle methodHandle = GeolocationResolver.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GeolocationResolver.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GeolocationResolver.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public GeolocationResolver() {
        long l = b ^ 0xD10806A2437L;
        super(a.cs((int)GeolocationResolver.a("i", (int)4876, (long)(0x3657B748A91E35E6L ^ l))), -12288, RecursiveNodeGraph.W, a.cs((int)GeolocationResolver.a("i", (int)16036, (long)(0x16E19D4C8928984DL ^ l))));
        this.v = -1;
        this.F = new NetworkConfigManager();
        this.K = NumericPrecisionTransformer.t(this, (String)((Object)GeolocationResolver.c("L", (int)GeolocationResolver.a("i", (int)12294, (long)(0x148C09E0AB8C16EEL ^ l)), (long)820903255317084962L, (long)l)), (String)((Object)GeolocationResolver.c("L", (int)GeolocationResolver.a("i", (int)27041, (long)(0x742C01ADC1DF4F4AL ^ l)), (long)820903255317084962L, (long)l)), "", 1.0, 15.0, 20.0);
        this.o = new FU(TemporalMetadataResolver.h.C());
        this.N(this.K);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GeolocationResolver.b = MultiContainerRegistry.a(94154695508523760L, 8656620319519477226L, MethodHandles.lookup().lookupClass()).a(80735582464000L);
                GeolocationResolver.j = new Object[5];
                GeolocationResolver.l = new String[5];
                GeolocationResolver.a();
                GeolocationResolver.h = new HashMap<K, V>(13);
                var0 = GeolocationResolver.b ^ 63878220585613L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u00c2@\u009f&\\EV\u00ec\u00ff\u00a6x\u00e9\u0085\u00d9\u00b1]";
                var7_6 = "\u00c2@\u009f&\\EV\u00ec\u00ff\u00a6x\u00e9\u0085\u00d9\u00b1]".length();
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
                    var6_5 = "\rvGI\u00a7\u00a8F\u009e\u00c5\u009e\u00c8\u0014\u00fa%\u00d8\u0010";
                    var7_6 = "\rvGI\u00a7\u00a8F\u009e\u00c5\u009e\u00c8\u0014\u00fa%\u00d8\u0010".length();
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
        GeolocationResolver.d = var8_3;
        GeolocationResolver.e = new Integer[4];
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
            int n = GeolocationResolver.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                GeolocationResolver.j[n] = clazz = Class.forName(GeolocationResolver.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @DataExchangeProtocol2090
    public final void D(EventTriggerEngine eventTriggerEngine) {
        block18: {
            boolean bl;
            SecureEventOrchestrator secureEventOrchestrator;
            block21: {
                block20: {
                    block17: {
                        try {
                            if (!CryptographicTransformer1102.F()) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeolocationResolver.a(customSystemException);
                        }
                        try {
                            try {
                                this.o.l((int)((Double)this.K.J() - 1.0), (int)((Double)this.K.J() + 1.0));
                                if (this.F.m(this.o.E()) || !((Double)this.K.J() < 20.0)) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeolocationResolver.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeolocationResolver.a(customSystemException);
                        }
                    }
                    secureEventOrchestrator = ApplicationLifecycleManager.X();
                    boolean bl2 = secureEventOrchestrator.B(ReflectionMetadataResolver.bN);
                    boolean bl3 = secureEventOrchestrator.Y();
                    try {
                        block19: {
                            try {
                                try {
                                    try {
                                        if (!bl2 || bl3) break block18;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GeolocationResolver.a(customSystemException);
                                    }
                                    if (DynamicInvocationResolver1041.F(160)) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GeolocationResolver.a(customSystemException);
                                }
                                if (!DynamicInvocationResolver1041.F(161)) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeolocationResolver.a(customSystemException);
                            }
                        }
                        bl = true;
                        break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeolocationResolver.a(customSystemException);
                    }
                }
                bl = false;
            }
            boolean bl4 = bl;
            try {
                if (!bl4 || !secureEventOrchestrator.r()) break block18;
            }
            catch (CustomSystemException customSystemException) {
                throw GeolocationResolver.a(customSystemException);
            }
            TransformationEngine transformationEngine = new TransformationEngine(secureEventOrchestrator);
            this.B(transformationEngine);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = GeolocationResolver.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GeolocationResolver.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = GeolocationResolver.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = GeolocationResolver.l[n];
            int n2 = string.indexOf(8);
            Class clazz = GeolocationResolver.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GeolocationResolver.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GeolocationResolver.a(clazz3, string2, clazz2)) != null) {
                    GeolocationResolver.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GeolocationResolver.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GeolocationResolver.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GeolocationResolver.b(279053336997142L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean Q(double d2) {
        boolean bl;
        double d3 = Math.max(Math.min(d2, 1.0), 0.0);
        try {
            bl = Math.random() <= d3;
        }
        catch (CustomSystemException customSystemException) {
            throw GeolocationResolver.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GeolocationResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(GeolocationResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

