/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.network.protocol;

import a.Ne;
import a.tl;
import a.ws;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.management.EventDispatchController1671;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;
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
import org.lwjgl.opengl.GL11;

public class NetworkProtocolDecoder
extends AbstractComputationKernel {
    private static final Integer[] E;
    private static final Object[] L;
    private final ws b;
    private static final long[] D;
    private static final Map F;
    private EventDispatchController1671 v;
    public static NetworkProtocolDecoder B;
    private static final String[] R;
    private static final long n;

    public NetworkProtocolDecoder(ws ws2) {
        B = this;
        this.b = ws2;
    }

    @Override
    public double e() {
        return 110.0;
    }

    @Override
    public void g() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                NetworkProtocolDecoder.n = MultiContainerRegistry.a(8553004911369685353L, -8558027755045024582L, MethodHandles.lookup().lookupClass()).a(177076038198823L);
                NetworkProtocolDecoder.L = new Object[5];
                NetworkProtocolDecoder.R = new String[5];
                NetworkProtocolDecoder.a();
                NetworkProtocolDecoder.F = new HashMap<K, V>(13);
                var0 = NetworkProtocolDecoder.n ^ 127777148157448L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u00ff\u00dbo=\u0014\u00ab\u008e\u0094{\u00d1p\u00ca\u0004i\u00b7\u009atU\u0083\u00f79[\u00df\u00d3\u009a\u00bf\u0094a \u00dc\u00b23";
                var7_6 = "\u00ff\u00dbo=\u0014\u00ab\u008e\u0094{\u00d1p\u00ca\u0004i\u00b7\u009atU\u0083\u00f79[\u00df\u00d3\u009a\u00bf\u0094a \u00dc\u00b23".length();
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
                    var6_5 = "\u00c2$4\u00e4\u00c4\u00e3\u00d4\u000b\u00ce&\u0085\u00ef\u008d\u00ae\u00b6\u00c3";
                    var7_6 = "\u00c2$4\u00e4\u00c4\u00e3\u00d4\u000b\u00ce&\u0085\u00ef\u008d\u00ae\u00b6\u00c3".length();
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
        NetworkProtocolDecoder.D = var8_3;
        NetworkProtocolDecoder.E = new Integer[6];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == '\u00d2' || c == 'R' || c == '\u00cc') {
                field = NetworkProtocolDecoder.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkProtocolDecoder.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkProtocolDecoder.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkProtocolDecoder.e(l, l2);
            object = L[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkProtocolDecoder.L[n] = clazz = Class.forName(R[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1868;
        if (E[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = D[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])F.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    F.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolDecoder.E[n2] = n3;
        }
        return E[n2];
    }

    public void W(EventTriggerEngine eventTriggerEngine) {
        block19: {
            block17: {
                block18: {
                    block16: {
                        block15: {
                            try {
                                if (GameVersionEnumerator.MC_1_21_4.H()) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkProtocolDecoder.a(customSystemException);
                            }
                            try {
                                try {
                                    if (this.b.F() && this.b.f()) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NetworkProtocolDecoder.a(customSystemException);
                                }
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkProtocolDecoder.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                if (!eventTriggerEngine.getThePlayer().Y() && !eventTriggerEngine.getWorld().Y()) break block16;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkProtocolDecoder.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolDecoder.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (this.v == null) break block17;
                            if (((Double)this.b.W().m.J()).intValue() > 0) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkProtocolDecoder.a(customSystemException);
                        }
                        this.b.W().m.r(1.0);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolDecoder.a(customSystemException);
                    }
                }
                this.v.x(1000 / ((Double)this.b.W().m.J()).intValue());
                this.v.z(this.b.W().r.s());
                this.v.Q(((Double)this.b.W().G.J()).intValue());
                this.v.G();
                break block19;
            }
            this.v = new EventDispatchController1671();
        }
    }

    private static Method h(long l, long l2) {
        int n = NetworkProtocolDecoder.e(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = R[n];
                int n3 = string2.indexOf(8);
                clazz3 = NetworkProtocolDecoder.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkProtocolDecoder.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkProtocolDecoder.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkProtocolDecoder.L[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkProtocolDecoder.f(223486938354798L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkProtocolDecoder.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkProtocolDecoder.L[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkProtocolDecoder.f(223486938354798L, 0L);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double z() {
        return 61.0;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (R[n4] != null) {
            return n4;
        }
        Object object = L[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 14;
                break;
            }
            case 1: {
                n3 = 12;
                break;
            }
            case 2: {
                n3 = 10;
                break;
            }
            case 3: {
                n3 = 62;
                break;
            }
            case 4: {
                n3 = 49;
                break;
            }
            case 5: {
                n3 = 17;
                break;
            }
            case 6: {
                n3 = 46;
                break;
            }
            case 7: {
                n3 = 32;
                break;
            }
            case 8: {
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 9;
                break;
            }
            case 10: {
                n3 = 43;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 7;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 15: {
                n3 = 0;
                break;
            }
            case 16: {
                n3 = 37;
                break;
            }
            case 17: {
                n3 = 39;
                break;
            }
            case 18: {
                n3 = 53;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 8;
                break;
            }
            case 21: {
                n3 = 45;
                break;
            }
            case 22: {
                n3 = 1;
                break;
            }
            case 23: {
                n3 = 26;
                break;
            }
            case 24: {
                n3 = 60;
                break;
            }
            case 25: {
                n3 = 5;
                break;
            }
            case 26: {
                n3 = 36;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 6;
                break;
            }
            case 29: {
                n3 = 51;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 44;
                break;
            }
            case 32: {
                n3 = 40;
                break;
            }
            case 33: {
                n3 = 59;
                break;
            }
            case 34: {
                n3 = 58;
                break;
            }
            case 35: {
                n3 = 2;
                break;
            }
            case 36: {
                n3 = 38;
                break;
            }
            case 37: {
                n3 = 27;
                break;
            }
            case 38: {
                n3 = 57;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 22;
                break;
            }
            case 41: {
                n3 = 50;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 31;
                break;
            }
            case 44: {
                n3 = 35;
                break;
            }
            case 45: {
                n3 = 61;
                break;
            }
            case 46: {
                n3 = 25;
                break;
            }
            case 47: {
                n3 = 47;
                break;
            }
            case 48: {
                n3 = 15;
                break;
            }
            case 49: {
                n3 = 29;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 21;
                break;
            }
            case 52: {
                n3 = 33;
                break;
            }
            case 53: {
                n3 = 30;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 23;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 56;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 55;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 18;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 34;
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
        NetworkProtocolDecoder.R[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void d() {
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = L;
        L[0] = "Yqi";
        objectArray[1] = Integer.TYPE;
        NetworkProtocolDecoder.R[1] = "java/lang/Integer";
        objectArray[2] = "-zg\u0012UT&uv](L5r\u007f\u0014";
        objectArray[3] = ">t>W:65{/\u0018[8>p+B";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\\\u0000b\u001fd?Q\u001a:z>;0Ib\u0004n<_\u0012/\bm@\t\u0015-\u00022 \r\r6\u0000U";
    }

    private static Field g(long l, long l2) {
        int n = NetworkProtocolDecoder.e(l, l2);
        Object object = L[n];
        if (object instanceof String) {
            String string = R[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkProtocolDecoder.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkProtocolDecoder.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkProtocolDecoder.c(clazz3, string2, clazz2)) != null) {
                    NetworkProtocolDecoder.L[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkProtocolDecoder.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkProtocolDecoder.L[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkProtocolDecoder.f(223486938354798L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void U() {
        this.H();
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolDecoder.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public void G() {
        this.H();
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = NetworkProtocolDecoder.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkProtocolDecoder.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkProtocolDecoder.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkProtocolDecoder.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void H() {
        long l;
        block33: {
            l = n ^ 0x205476C8D736L;
            try {
                if (GameVersionEnumerator.MC_1_21_4.H()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder.a(customSystemException);
            }
            try {
                if (this.v != null && this.b.F()) break block33;
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder.a(customSystemException);
            }
            double d2 = this.b();
            double d3 = this.w();
            Ne.h.q(0.1f, 0.1f, 0.1f, 1.0f);
            ConfigurationManager.S((float)this.G(), (float)this.W(), d3, d2, NetworkProtocolDecoder.M.a);
            StateTrackingCoordinator.B(Color.WHITE, (float)(this.G() + d3 / 2.0 - 10.0), (float)(this.W() + d2 / 2.0 - 10.0), (String)((Object)NetworkProtocolDecoder.c("\u00ce", (int)NetworkProtocolDecoder.b("p", (int)30197, (long)(0x1A7D4E5F8D39E346L ^ l)), (long)-8151716640292141534L, (long)l)), 16.0f, 16.0f, false);
            return;
        }
        try {
            if (ApplicationLifecycleManager.N().A() > 0) {
                TemporalMetadataResolver.h.W().u().P((String)((Object)NetworkProtocolDecoder.c("\u00ce", (int)NetworkProtocolDecoder.b("p", (int)20712, (long)(0x1F1729DE5D36465EL ^ l)), (long)-8151716640292141534L, (long)l)), this.G() + 4.0, this.W() + 4.0, (int)NetworkProtocolDecoder.b("p", (int)7763, (long)(0x529F5D1C980F88E6L ^ l)));
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder.a(customSystemException);
        }
        try {
            if (!ApplicationLifecycleManager.N().s()) {
                TemporalMetadataResolver.h.W().u().P((String)((Object)NetworkProtocolDecoder.c("\u00ce", (int)NetworkProtocolDecoder.b("p", (int)6292, (long)(0x1367775D2E290E20L ^ l)), (long)-8151716640292141534L, (long)l)), this.G() + 4.0, this.W() + 4.0, (int)NetworkProtocolDecoder.b("p", (int)29115, (long)(0x3A98F348E10E670CL ^ l)));
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder.a(customSystemException);
        }
        try {
            if (ApplicationLifecycleManager.N().C()) {
                TemporalMetadataResolver.h.W().u().P((String)((Object)NetworkProtocolDecoder.c("\u00ce", (int)NetworkProtocolDecoder.b("p", (int)9479, (long)(0xC63F2FCCCF333B5L ^ l)), (long)-8151716640292141534L, (long)l)), this.G() + 4.0, this.W() + 4.0, (int)NetworkProtocolDecoder.b("p", (int)29115, (long)(0x3A98F348E10E670CL ^ l)));
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolDecoder.a(customSystemException);
        }
        if (this.v.f()) {
            double d4 = this.b();
            double d5 = this.w();
            d4 *= ((Double)this.b.W().s.J()).doubleValue();
            d5 *= ((Double)this.b.W().s.J()).doubleValue();
            boolean bl = GL11.glIsEnabled((int)3553);
            boolean bl2 = GL11.glIsEnabled((int)3008);
            boolean bl3 = GL11.glIsEnabled((int)3042);
            try {
                if (bl) {
                    tl.R();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder.a(customSystemException);
            }
            try {
                if (!bl2) {
                    tl.s();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder.a(customSystemException);
            }
            try {
                if (!bl3) {
                    tl.N();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder.a(customSystemException);
            }
            try {
                Ne.h.q(0.1f, 0.1f, 0.1f, 0.2f);
                ConfigurationManager.A(this.G(), this.W(), this.G() + d5, this.W() + d4, new Color(0.1f, 0.1f, 0.1f, 0.2f));
                Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
                this.v.A(this.b.F(), this.G() + 0.5, this.W() + 0.5, this.G() + d5 - 0.5, this.W() + d4 - 0.5);
                if (bl) {
                    tl.B();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder.a(customSystemException);
            }
            try {
                if (!bl2) {
                    tl.Z();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder.a(customSystemException);
            }
            try {
                if (!bl3) {
                    tl.j();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NetworkProtocolDecoder.a(customSystemException);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolDecoder.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NetworkProtocolDecoder.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

