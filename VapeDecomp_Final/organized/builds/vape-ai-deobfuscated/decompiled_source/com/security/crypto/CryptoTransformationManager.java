/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.a;
import com.app.entity.monitoring.EntityStatusMonitor;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.event.dispatch.EventDispatchController1028;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometryCalculator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.system.pipeline.ObjectPipelineManager;
import com.transaction.validation.TransactionValidator1298;
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

public class CryptoTransformationManager
extends ContextualExecutionFramework {
    private static final Map l;
    private static final Object[] m;
    private final AuthenticationStateTracker h;
    private final AuthenticationStateTracker Y;
    private static final long[] e;
    private final AuthenticationStateTracker B;
    private boolean K;
    private static final String[] n;
    private static final long b;
    private static final Integer[] j;
    private final AuthenticationStateTracker d;

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptoTransformationManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoTransformationManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoTransformationManager.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoTransformationManager.m[n] = clazz = Class.forName(CryptoTransformationManager.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "X\u0005u";
        objectArray[1] = Integer.TYPE;
        CryptoTransformationManager.n[1] = "java/lang/Integer";
        objectArray[2] = "?rg{lq4}v4\u0011i'z\u007f}";
        objectArray[3] = "\u0014f\u001e9\u000fT\u001fi\u000fvnZ\u0014b\u000b,";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001aOm+\u0019\u0003\u001c\u0005%KO\u0011uO<,JR\r\u000ec2$S\u0016\u0005')\u0014\u000f\u0005\u000e8K";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'W' || c == 'E' || c == 'j' || c == '$') {
                field = CryptoTransformationManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoTransformationManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(long l, long l2) {
        int n = CryptoTransformationManager.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = CryptoTransformationManager.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptoTransformationManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoTransformationManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoTransformationManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoTransformationManager.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoTransformationManager.b(278083579797591L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoTransformationManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoTransformationManager.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoTransformationManager.b(278083579797591L, 0L);
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

    @DataExchangeProtocol2090
    public void Q(EntityStatusMonitor entityStatusMonitor) {
        boolean bl;
        block11: {
            try {
                if (!this.K) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoTransformationManager.a(customSystemException);
            }
            try {
                if (!entityStatusMonitor.getEntity().equals(entityStatusMonitor.getThePlayer())) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoTransformationManager.a(customSystemException);
            }
            TransactionValidator1298 transactionValidator1298 = entityStatusMonitor.getPotion();
            bl = false;
            try {
                if (!this.Y.s().booleanValue() || !ObjectPipelineManager.h.o(transactionValidator1298)) break block11;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoTransformationManager.a(customSystemException);
            }
            bl = true;
        }
        try {
            if (bl) {
                entityStatusMonitor.setActive(false);
                entityStatusMonitor.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoTransformationManager.a(customSystemException);
        }
    }

    /*
     * Unable to fully structure code
     */
    @DataExchangeProtocol2090
    public void h(CryptoKeyManagementSystem var1_1) {
        block14: {
            block13: {
                var2_2 = var1_1.getThePlayer();
                try {
                    if (this.d.s().booleanValue()) {
                        var2_2.E(ObjectPipelineManager.m.N());
                    }
                }
                catch (CustomSystemException v0) {
                    throw CryptoTransformationManager.a(v0);
                }
                try {
                    try {
                        if (!this.Y.s().booleanValue() || !this.h.s().booleanValue()) break block13;
                    }
                    catch (CustomSystemException v1) {
                        throw CryptoTransformationManager.a(v1);
                    }
                    var2_2.E(ObjectPipelineManager.h.N());
                }
                catch (CustomSystemException v2) {
                    throw CryptoTransformationManager.a(v2);
                }
            }
            try {
                if (!this.B.s().booleanValue() || !this.h.s().booleanValue()) break block14;
            }
            catch (CustomSystemException v3) {
                throw CryptoTransformationManager.a(v3);
            }
            var3_3 = ObjectPipelineManager.j;
            if (GeometryCalculator.C() < 35) {
                var4_4 = var2_2.W(var3_3);
                try {
                    if (!var4_4.r()) ** GOTO lbl34
                    var3_3.u(var2_2, var2_2.L(), var4_4.y());
                }
                catch (CustomSystemException v4) {
                    throw CryptoTransformationManager.a(v4);
                }
            } else {
                var3_3.u(var2_2, var2_2.L(), 0);
            }
lbl34:
            // 3 sources

            var2_2.E(var3_3.N());
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoTransformationManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    @DataExchangeProtocol2090
    public void W(EventTriggerEngine eventTriggerEngine) {
        this.K = true;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xE32;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])CryptoTransformationManager.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    CryptoTransformationManager.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ax", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoTransformationManager.j[n2] = n3;
        }
        return j[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoTransformationManager.b = MultiContainerRegistry.a(-3837393412387896410L, -6627317139209564443L, MethodHandles.lookup().lookupClass()).a(53221704501117L);
                CryptoTransformationManager.m = new Object[5];
                CryptoTransformationManager.n = new String[5];
                CryptoTransformationManager.a();
                CryptoTransformationManager.l = new HashMap<K, V>(13);
                var0 = CryptoTransformationManager.b ^ 50685785045538L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u00d7\u0083bg\u008a\u00f9\u0080\u00bdv'UL\u009d\u00b5e@\u00a2\u00fbC\u0014\u0005j\u0083\u00d6\u0005\u00fd\u00ab\u00f33\u00f3\u00d2\u00dc\u0095\u009a\u0001\f\u0006\u00dbY\u00c2";
                var7_6 = "\u00d7\u0083bg\u008a\u00f9\u0080\u00bdv'UL\u009d\u00b5e@\u00a2\u00fbC\u0014\u0005j\u0083\u00d6\u0005\u00fd\u00ab\u00f33\u00f3\u00d2\u00dc\u0095\u009a\u0001\f\u0006\u00dbY\u00c2".length();
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
                    var6_5 = ",5\b\u00b7\u00d7KPA\u00bc\u009d\u00f8\u00ab\fa|\u001d";
                    var7_6 = ",5\b\u00b7\u00d7KPA\u00bc\u009d\u00f8\u00ab\fa|\u001d".length();
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
        CryptoTransformationManager.e = var8_3;
        CryptoTransformationManager.j = new Integer[7];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoTransformationManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoTransformationManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void T(EventDispatchController1028 eventDispatchController1028) {
        this.K = false;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (CryptoTransformationManager.n[n4] != null) {
            return n4;
        }
        Object object = m[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 60;
                break;
            }
            case 1: {
                n3 = 59;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 21;
                break;
            }
            case 6: {
                n3 = 51;
                break;
            }
            case 7: {
                n3 = 47;
                break;
            }
            case 8: {
                n3 = 30;
                break;
            }
            case 9: {
                n3 = 0;
                break;
            }
            case 10: {
                n3 = 54;
                break;
            }
            case 11: {
                n3 = 49;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 27;
                break;
            }
            case 14: {
                n3 = 26;
                break;
            }
            case 15: {
                n3 = 29;
                break;
            }
            case 16: {
                n3 = 1;
                break;
            }
            case 17: {
                n3 = 42;
                break;
            }
            case 18: {
                n3 = 58;
                break;
            }
            case 19: {
                n3 = 2;
                break;
            }
            case 20: {
                n3 = 18;
                break;
            }
            case 21: {
                n3 = 13;
                break;
            }
            case 22: {
                n3 = 33;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 40;
                break;
            }
            case 25: {
                n3 = 39;
                break;
            }
            case 26: {
                n3 = 20;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 35;
                break;
            }
            case 29: {
                n3 = 23;
                break;
            }
            case 30: {
                n3 = 52;
                break;
            }
            case 31: {
                n3 = 4;
                break;
            }
            case 32: {
                n3 = 5;
                break;
            }
            case 33: {
                n3 = 37;
                break;
            }
            case 34: {
                n3 = 62;
                break;
            }
            case 35: {
                n3 = 41;
                break;
            }
            case 36: {
                n3 = 7;
                break;
            }
            case 37: {
                n3 = 57;
                break;
            }
            case 38: {
                n3 = 63;
                break;
            }
            case 39: {
                n3 = 15;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 55;
                break;
            }
            case 42: {
                n3 = 8;
                break;
            }
            case 43: {
                n3 = 32;
                break;
            }
            case 44: {
                n3 = 10;
                break;
            }
            case 45: {
                n3 = 16;
                break;
            }
            case 46: {
                n3 = 43;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 11;
                break;
            }
            case 49: {
                n3 = 14;
                break;
            }
            case 50: {
                n3 = 56;
                break;
            }
            case 51: {
                n3 = 22;
                break;
            }
            case 52: {
                n3 = 53;
                break;
            }
            case 53: {
                n3 = 9;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 44;
                break;
            }
            case 57: {
                n3 = 50;
                break;
            }
            case 58: {
                n3 = 3;
                break;
            }
            case 59: {
                n3 = 34;
                break;
            }
            case 60: {
                n3 = 45;
                break;
            }
            case 61: {
                n3 = 19;
                break;
            }
            case 62: {
                n3 = 36;
                break;
            }
            default: {
                n3 = 31;
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
        CryptoTransformationManager.n[n4] = new String(cArray);
        return n4;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoTransformationManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ax" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ax" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public CryptoTransformationManager() {
        long l = b ^ 0xE880A92709FL;
        super(a.cs((int)CryptoTransformationManager.a("p", (int)15000, (long)(0x3658DD4DA1D1553EL ^ l))), -256, RecursiveNodeGraph.z, a.cs((int)CryptoTransformationManager.a("p", (int)878, (long)(0x1D670B053A856CC9L ^ l))));
        this.d = AuthenticationStateTracker.w(this, (String)((Object)CryptoTransformationManager.c("\u00dd", (int)CryptoTransformationManager.a("p", (int)15976, (long)(0x6C1A957EE09051C9L ^ l)), (long)-2192124467630406935L, (long)l)), true);
        this.Y = AuthenticationStateTracker.w(this, (String)((Object)CryptoTransformationManager.c("\u00dd", (int)CryptoTransformationManager.a("p", (int)32042, (long)(0x6572FCED3C3A9288L ^ l)), (long)-2192124467630406935L, (long)l)), true);
        this.B = AuthenticationStateTracker.w(this, (String)((Object)CryptoTransformationManager.c("\u00dd", (int)CryptoTransformationManager.a("p", (int)24898, (long)(0x4BF4B1EB8D5D0EE7L ^ l)), (long)-2192124467630406935L, (long)l)), true);
        this.h = AuthenticationStateTracker.R(this, (String)((Object)CryptoTransformationManager.c("\u00dd", (int)CryptoTransformationManager.a("p", (int)17456, (long)(0x72FB7BB246B6AB94L ^ l)), (long)-2192124467630406935L, (long)l)), false, (String)((Object)CryptoTransformationManager.c("\u00dd", (int)CryptoTransformationManager.a("p", (int)4532, (long)(0x4CD20A6D92C0FE17L ^ l)), (long)-2192124467630406935L, (long)l)));
        this.q(false);
        this.N(this.d, this.Y, this.B, this.h);
    }

    private static Field c(long l, long l2) {
        int n = CryptoTransformationManager.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = CryptoTransformationManager.n[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoTransformationManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoTransformationManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoTransformationManager.a(clazz3, string2, clazz2)) != null) {
                    CryptoTransformationManager.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoTransformationManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoTransformationManager.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoTransformationManager.b(278083579797591L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoTransformationManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoTransformationManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

