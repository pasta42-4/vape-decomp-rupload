/*
 * Decompiled with CFR 0.152.
 */
package com.text.processing;

import a.N9;
import a.oQ;
import com.app.configuration.ResourceConfigManager;
import com.app.data.processing.DataTransformationHandler2028;
import com.app.io.stream.OutputStreamHandler;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.financial.processing.PaymentExecutionHandler;
import com.financial.processing.TransactionCorrelationEngine;
import com.financial.transaction.TransactionProcessor;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.connection.ConnectionNegotiationHandler;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.ProtocolInteractionController;
import com.network.protocol.TransmissionProtocolHandler1868;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.structures.tree.RecursiveNodeTree;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class PatternMatchingOrchestrator {
    private static final String[] f;
    private static final long[] b;
    private static final Object[] e;
    private static final Integer[] c;
    private static final long a;
    private static final Pattern u;
    private static final Map d;
    private static int[] l;

    private static int Z(String string, ProtocolInteractionController protocolInteractionController) {
        try {
            if (protocolInteractionController.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        LightweightExecutionContext lightweightExecutionContext = LightweightExecutionContext.d(protocolInteractionController);
        try {
            if (lightweightExecutionContext.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        List list = new ArrayList();
        if (GeometryCalculator.C() >= 23) {
            list = (List)OutputStreamHandler.x().M();
        }
        protocolInteractionController.l(protocolInteractionController, list);
        if (list.size() > 0) {
            for (Object e : list) {
                LightweightExecutionContext lightweightExecutionContext2 = new LightweightExecutionContext(e);
                try {
                    if (!lightweightExecutionContext2.g().equalsIgnoreCase(string)) continue;
                    return lightweightExecutionContext2.b();
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
        }
        String string2 = lightweightExecutionContext.g().toLowerCase();
        try {
            if (string2.equalsIgnoreCase(string)) {
                return lightweightExecutionContext.b();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        return -1;
    }

    public static boolean L(TransactionCorrelationEngine transactionCorrelationEngine) {
        try {
            if (!PatternMatchingOrchestrator.R(transactionCorrelationEngine)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        return false;
    }

    public static int[] e(String string) {
        Object object;
        long l = a ^ 0x7E4AA7253D8DL;
        int[] nArray = new int[]{-1, 0};
        Map map = ProtocolInteractionController.p();
        if (map != null) {
            object = map.keySet();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object k = iterator.next();
                Object v = map.get(k);
                TransactionCorrelationEngine transactionCorrelationEngine = new TransactionCorrelationEngine(k);
                ProtocolInteractionController protocolInteractionController = new ProtocolInteractionController(v);
                int n = PatternMatchingOrchestrator.Z(string, protocolInteractionController);
                try {
                    if (n == -1) continue;
                    nArray[0] = TransactionCorrelationEngine.h(transactionCorrelationEngine);
                    nArray[1] = n;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
        }
        object = TransactionCorrelationEngine.Z(string.replace((CharSequence)((Object)PatternMatchingOrchestrator.b("I", (int)PatternMatchingOrchestrator.a("f", (int)24856, (long)(0x79D0DE5CCA822EBEL ^ l)), (long)-985398667261347209L, (long)l)), (CharSequence)((Object)PatternMatchingOrchestrator.b("I", (int)PatternMatchingOrchestrator.a("f", (int)13480, (long)(0x6389F746D950FB0DL ^ l)), (long)-985398667261347209L, (long)l))));
        try {
            if (object != null) {
                nArray[0] = TransactionCorrelationEngine.h((TransactionCorrelationEngine)object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        return nArray;
    }

    public static boolean C(SystemConfigurationOrchestrator systemConfigurationOrchestrator, N9 n9) {
        boolean bl;
        block17: {
            block16: {
                boolean bl2;
                boolean bl3;
                block15: {
                    block14: {
                        boolean bl4;
                        oQ oQ2;
                        block13: {
                            block12: {
                                oQ2 = ((oQ)systemConfigurationOrchestrator.L()).B(0.01, 0.0, 0.01);
                                try {
                                    try {
                                        if (!(oQ2.F() > (double)n9.x()) || !(oQ2.f() < (double)(n9.x() + 1))) break block12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PatternMatchingOrchestrator.a(customSystemException);
                                    }
                                    bl4 = true;
                                    break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PatternMatchingOrchestrator.a(customSystemException);
                                }
                            }
                            bl4 = false;
                        }
                        bl3 = bl4;
                        try {
                            try {
                                if (!(oQ2.v() > (double)n9.b()) || !(oQ2.R() < (double)(n9.b() + 1))) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PatternMatchingOrchestrator.a(customSystemException);
                            }
                            bl2 = true;
                            break block15;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PatternMatchingOrchestrator.a(customSystemException);
                        }
                    }
                    bl2 = false;
                }
                boolean bl5 = bl2;
                try {
                    try {
                        if (!bl3 || !bl5) break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PatternMatchingOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block17;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/GH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static boolean t(Character c) {
        char c2 = c.charValue();
        int n = c2 >> 4;
        for (int n2 : PatternMatchingOrchestrator.X()) {
            try {
                if (n != n2) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw PatternMatchingOrchestrator.a(customSystemException);
            }
        }
        return false;
    }

    private static Method d(long l, long l2) {
        int n = PatternMatchingOrchestrator.a(l, l2);
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
                clazz3 = PatternMatchingOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = PatternMatchingOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = PatternMatchingOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        PatternMatchingOrchestrator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = PatternMatchingOrchestrator.b(240900537772917L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = PatternMatchingOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        PatternMatchingOrchestrator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = PatternMatchingOrchestrator.b(240900537772917L, 0L);
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

    private static int[] X() {
        block4: {
            block5: {
                long l = a ^ 0x4B2AB7FCD823L;
                try {
                    try {
                        if (PatternMatchingOrchestrator.l != null) break block4;
                        if (!GameVersionEnumerator.MC_1_20_6.H()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PatternMatchingOrchestrator.a(customSystemException);
                    }
                    PatternMatchingOrchestrator.l = PatternMatchingOrchestrator.v((String)((Object)PatternMatchingOrchestrator.b("I", (int)PatternMatchingOrchestrator.a("f", (int)29151, (long)(0x68C2880376AD5BD5L ^ l)), (long)1728568902233333721L, (long)l)));
                    break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
            l = new int[]{26};
        }
        return l;
    }

    private static Field c(long l, long l2) {
        int n = PatternMatchingOrchestrator.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = PatternMatchingOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = PatternMatchingOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = PatternMatchingOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    PatternMatchingOrchestrator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = PatternMatchingOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        PatternMatchingOrchestrator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = PatternMatchingOrchestrator.b(240900537772917L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static boolean E(TransactionCorrelationEngine transactionCorrelationEngine) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return transactionCorrelationEngine.i().O();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        return transactionCorrelationEngine.u().y();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = PatternMatchingOrchestrator.a(n, l);
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
                PatternMatchingOrchestrator.a = MultiContainerRegistry.a(-6683737750208773434L, 1763689894165829671L, MethodHandles.lookup().lookupClass()).a(24990275777481L);
                var11 = PatternMatchingOrchestrator.a ^ 9179825834519L;
                PatternMatchingOrchestrator.e = new Object[5];
                PatternMatchingOrchestrator.f = new String[5];
                PatternMatchingOrchestrator.a();
                PatternMatchingOrchestrator.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[4];
                var3_4 = 0;
                var4_5 = "h4\u00e9\u00ff\u00e3\u0098!a\u00b7\u00eaKTB\u00d0\u0015k";
                var5_6 = "h4\u00e9\u00ff\u00e3\u0098!a\u00b7\u00eaKTB\u00d0\u0015k".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u0094\u0090k\u0099\u00db+\u009ex\u0080\u0083\t\u0019\u00ef\u00d8ec";
                    var5_6 = "\u0094\u0090k\u0099\u00db+\u009ex\u0080\u0083\t\u0019\u00ef\u00d8ec".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        PatternMatchingOrchestrator.b = var6_3;
        PatternMatchingOrchestrator.c = new Integer[4];
        PatternMatchingOrchestrator.u = Pattern.compile((String)PatternMatchingOrchestrator.b("I", (int)PatternMatchingOrchestrator.a("f", (int)3221, (long)(1823920086189175976L ^ var11)), (long)-4194716909752988179L, (long)var11));
        PatternMatchingOrchestrator.l = null;
    }

    public static boolean R(TransactionCorrelationEngine transactionCorrelationEngine) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return transactionCorrelationEngine.i().q();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        return transactionCorrelationEngine.u().B();
    }

    public static char s(int n, int n2) {
        return (char)(n << 4 | n2 & 0xF);
    }

    public static boolean a(TransactionCorrelationEngine transactionCorrelationEngine) {
        boolean bl;
        block15: {
            block14: {
                block10: {
                    boolean bl2;
                    block13: {
                        block12: {
                            try {
                                block11: {
                                    try {
                                        try {
                                            if (GeometryCalculator.C() < 50) break block10;
                                            if (transactionCorrelationEngine.B(ReflectionMetadataResolver.K)) break block11;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw PatternMatchingOrchestrator.a(customSystemException);
                                        }
                                        if (!transactionCorrelationEngine.i().A()) break block12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PatternMatchingOrchestrator.a(customSystemException);
                                    }
                                }
                                bl2 = true;
                                break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PatternMatchingOrchestrator.a(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                RecursiveNodeTree recursiveNodeTree = transactionCorrelationEngine.u();
                try {
                    try {
                        if (!recursiveNodeTree.equals(RecursiveNodeTree.V()) && !recursiveNodeTree.u()) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PatternMatchingOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
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
                n3 = 55;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 31;
                break;
            }
            case 3: {
                n3 = 27;
                break;
            }
            case 4: {
                n3 = 30;
                break;
            }
            case 5: {
                n3 = 46;
                break;
            }
            case 6: {
                n3 = 38;
                break;
            }
            case 7: {
                n3 = 8;
                break;
            }
            case 8: {
                n3 = 1;
                break;
            }
            case 9: {
                n3 = 59;
                break;
            }
            case 10: {
                n3 = 19;
                break;
            }
            case 11: {
                n3 = 63;
                break;
            }
            case 12: {
                n3 = 14;
                break;
            }
            case 13: {
                n3 = 3;
                break;
            }
            case 14: {
                n3 = 2;
                break;
            }
            case 15: {
                n3 = 41;
                break;
            }
            case 16: {
                n3 = 50;
                break;
            }
            case 17: {
                n3 = 36;
                break;
            }
            case 18: {
                n3 = 4;
                break;
            }
            case 19: {
                n3 = 5;
                break;
            }
            case 20: {
                n3 = 29;
                break;
            }
            case 21: {
                n3 = 53;
                break;
            }
            case 22: {
                n3 = 32;
                break;
            }
            case 23: {
                n3 = 37;
                break;
            }
            case 24: {
                n3 = 12;
                break;
            }
            case 25: {
                n3 = 20;
                break;
            }
            case 26: {
                n3 = 26;
                break;
            }
            case 27: {
                n3 = 62;
                break;
            }
            case 28: {
                n3 = 34;
                break;
            }
            case 29: {
                n3 = 42;
                break;
            }
            case 30: {
                n3 = 16;
                break;
            }
            case 31: {
                n3 = 13;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 33: {
                n3 = 51;
                break;
            }
            case 34: {
                n3 = 40;
                break;
            }
            case 35: {
                n3 = 7;
                break;
            }
            case 36: {
                n3 = 18;
                break;
            }
            case 37: {
                n3 = 61;
                break;
            }
            case 38: {
                n3 = 60;
                break;
            }
            case 39: {
                n3 = 57;
                break;
            }
            case 40: {
                n3 = 35;
                break;
            }
            case 41: {
                n3 = 25;
                break;
            }
            case 42: {
                n3 = 49;
                break;
            }
            case 43: {
                n3 = 39;
                break;
            }
            case 44: {
                n3 = 17;
                break;
            }
            case 45: {
                n3 = 44;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 23;
                break;
            }
            case 48: {
                n3 = 0;
                break;
            }
            case 49: {
                n3 = 45;
                break;
            }
            case 50: {
                n3 = 56;
                break;
            }
            case 51: {
                n3 = 24;
                break;
            }
            case 52: {
                n3 = 22;
                break;
            }
            case 53: {
                n3 = 43;
                break;
            }
            case 54: {
                n3 = 52;
                break;
            }
            case 55: {
                n3 = 58;
                break;
            }
            case 56: {
                n3 = 9;
                break;
            }
            case 57: {
                n3 = 54;
                break;
            }
            case 58: {
                n3 = 28;
                break;
            }
            case 59: {
                n3 = 21;
                break;
            }
            case 60: {
                n3 = 47;
                break;
            }
            case 61: {
                n3 = 48;
                break;
            }
            case 62: {
                n3 = 33;
                break;
            }
            default: {
                n3 = 10;
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
        PatternMatchingOrchestrator.f[n4] = new String(cArray);
        return n4;
    }

    public static boolean O(NetworkProtocolNegotiator networkProtocolNegotiator, ReflectionUtilityBroker reflectionUtilityBroker, NetworkConnectionOrchestrator networkConnectionOrchestrator) {
        block15: {
            block14: {
                Object object;
                int n;
                int n2;
                int n3;
                block10: {
                    boolean bl;
                    int n4;
                    block13: {
                        block12: {
                            int n5;
                            TransactionProcessor transactionProcessor;
                            block11: {
                                ReflectionUtilityBroker reflectionUtilityBroker2 = reflectionUtilityBroker;
                                transactionProcessor = networkProtocolNegotiator.d(reflectionUtilityBroker);
                                int n6 = reflectionUtilityBroker2.q();
                                n3 = reflectionUtilityBroker2.o() & 0xF;
                                n2 = n6 & 0xF;
                                n = reflectionUtilityBroker2.j() & 0xF;
                                TransactionCorrelationEngine transactionCorrelationEngine = networkConnectionOrchestrator.I();
                                n5 = transactionProcessor.E(n6);
                                object = transactionProcessor.B()[n5];
                                try {
                                    try {
                                        if (object != null) break block10;
                                        if (!transactionCorrelationEngine.equals(ResourceConfigManager.D())) break block11;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PatternMatchingOrchestrator.a(customSystemException);
                                    }
                                    return false;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PatternMatchingOrchestrator.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    Object[] objectArray = transactionProcessor.B();
                                    int n7 = n5;
                                    n4 = n5 << 4;
                                    if (!GameVersionEnumerator.MC_1_16_5.Q() || networkProtocolNegotiator.g().y()) break block12;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PatternMatchingOrchestrator.a(customSystemException);
                                }
                                bl = true;
                                break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PatternMatchingOrchestrator.a(customSystemException);
                            }
                        }
                        bl = false;
                    }
                    Object object2 = ConnectionNegotiationHandler.t(n4, bl);
                    objectArray[n7] = object2;
                    object = object2;
                }
                ConnectionNegotiationHandler connectionNegotiationHandler = new ConnectionNegotiationHandler(object);
                try {
                    if (!GameVersionEnumerator.MC_1_8_9.C()) break block14;
                    connectionNegotiationHandler.w(n3, n2, n, networkConnectionOrchestrator);
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
            int n = TransactionCorrelationEngine.h(networkConnectionOrchestrator.I()) << 4;
            connectionNegotiationHandler.v()[n2 << 8 | n << 4 | n3] = (char)n;
        }
        return true;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = PatternMatchingOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static int J() {
        TransactionCorrelationEngine transactionCorrelationEngine = ApplicationLifecycleManager.u().M();
        try {
            if (transactionCorrelationEngine.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        return TransactionCorrelationEngine.h(transactionCorrelationEngine);
    }

    public static boolean N(TransactionCorrelationEngine transactionCorrelationEngine) {
        boolean bl;
        block22: {
            block21: {
                block16: {
                    boolean bl2;
                    block19: {
                        block18: {
                            try {
                                block17: {
                                    try {
                                        try {
                                            try {
                                                if (GeometryCalculator.C() < 50) break block16;
                                                if (PatternMatchingOrchestrator.R(transactionCorrelationEngine)) break block17;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw PatternMatchingOrchestrator.a(customSystemException);
                                            }
                                            if (PatternMatchingOrchestrator.e(transactionCorrelationEngine)) break block17;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw PatternMatchingOrchestrator.a(customSystemException);
                                        }
                                        if (!transactionCorrelationEngine.B(ReflectionMetadataResolver.bH)) break block18;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PatternMatchingOrchestrator.a(customSystemException);
                                    }
                                }
                                bl2 = true;
                                break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PatternMatchingOrchestrator.a(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                RecursiveNodeTree recursiveNodeTree = transactionCorrelationEngine.u();
                try {
                    block20: {
                        try {
                            try {
                                try {
                                    if (recursiveNodeTree.B() || recursiveNodeTree.equals(RecursiveNodeTree.V())) break block20;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PatternMatchingOrchestrator.a(customSystemException);
                                }
                                if (!recursiveNodeTree.equals(RecursiveNodeTree.Q())) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PatternMatchingOrchestrator.a(customSystemException);
                            }
                            if (GeometryCalculator.C() >= 35) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PatternMatchingOrchestrator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean e(TransactionCorrelationEngine transactionCorrelationEngine) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return transactionCorrelationEngine.B(ReflectionMetadataResolver.K);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        RecursiveNodeTree recursiveNodeTree = transactionCorrelationEngine.u();
        return recursiveNodeTree.equals(RecursiveNodeTree.V());
    }

    public static float i(LightweightExecutionContext lightweightExecutionContext) {
        block7: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
                return 0.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw PatternMatchingOrchestrator.a(customSystemException);
            }
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (!protocolInteractionController.B(ReflectionMetadataResolver.YX)) {
                return 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        PaymentExecutionHandler paymentExecutionHandler = new PaymentExecutionHandler(protocolInteractionController);
        return PatternMatchingOrchestrator.Z(paymentExecutionHandler.u());
    }

    public static NetworkConnectionOrchestrator P(LightweightExecutionContext lightweightExecutionContext) {
        block7: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
                return ResourceConfigManager.D().X();
            }
            catch (CustomSystemException customSystemException) {
                throw PatternMatchingOrchestrator.a(customSystemException);
            }
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (!protocolInteractionController.B(ReflectionMetadataResolver.YX)) {
                return ResourceConfigManager.D().X();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        PaymentExecutionHandler paymentExecutionHandler = new PaymentExecutionHandler(protocolInteractionController);
        TransactionCorrelationEngine transactionCorrelationEngine = paymentExecutionHandler.u();
        return transactionCorrelationEngine.X();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = PatternMatchingOrchestrator.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                PatternMatchingOrchestrator.e[n] = clazz = Class.forName(f[n]);
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

    public static oQ y(NetworkProtocolNegotiator networkProtocolNegotiator, N9 n9) {
        oQ oQ2;
        block10: {
            TransactionCorrelationEngine transactionCorrelationEngine;
            block11: {
                oQ2 = oQ.E((double)n9.x() + 0.0, (double)n9.J() + 0.0, (double)n9.b() + 0.0, (double)n9.x() + 1.0, (double)n9.J() + 1.0, (double)n9.b() + 1.0);
                transactionCorrelationEngine = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b());
                try {
                    try {
                        if (!transactionCorrelationEngine.r() || PatternMatchingOrchestrator.N(transactionCorrelationEngine)) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PatternMatchingOrchestrator.a(customSystemException);
                    }
                    if (GeometryCalculator.C() > 13) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
                oQ2 = transactionCorrelationEngine.C(networkProtocolNegotiator, n9.x(), n9.J(), n9.b());
                break block10;
            }
            ReflectionUtilityBroker reflectionUtilityBroker = ReflectionUtilityBroker.Y(n9);
            if (GeometryCalculator.C() >= 35) {
                NetworkConnectionOrchestrator networkConnectionOrchestrator = networkProtocolNegotiator.T(reflectionUtilityBroker);
                if (networkConnectionOrchestrator.B(ReflectionMetadataResolver.Q)) {
                    TransmissionProtocolHandler1868 transmissionProtocolHandler1868 = new TransmissionProtocolHandler1868(networkConnectionOrchestrator);
                    DataTransformationHandler2028 dataTransformationHandler2028 = transmissionProtocolHandler1868.U(ApplicationLifecycleManager.U().v().h(), reflectionUtilityBroker);
                    if (dataTransformationHandler2028.r()) {
                        oQ2 = dataTransformationHandler2028.y();
                        if (GeometryCalculator.C() >= 35) {
                            oQ2 = oQ2.V(n9.x(), n9.J(), n9.b());
                        }
                    }
                } else {
                    oQ2 = transactionCorrelationEngine.l(networkProtocolNegotiator, reflectionUtilityBroker);
                }
            } else {
                oQ2 = GeometryCalculator.C() == 23 ? transactionCorrelationEngine.P(networkProtocolNegotiator.T(reflectionUtilityBroker), networkProtocolNegotiator, reflectionUtilityBroker) : transactionCorrelationEngine.l(networkProtocolNegotiator, reflectionUtilityBroker);
            }
        }
        return oQ2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/GH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'K' || c == '\u00f4' || c == 'P' || c == 'A') {
                field = PatternMatchingOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = PatternMatchingOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'V' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static boolean q(TransactionCorrelationEngine transactionCorrelationEngine) {
        boolean bl;
        block14: {
            block13: {
                block10: {
                    boolean bl2;
                    block12: {
                        block11: {
                            try {
                                try {
                                    try {
                                        if (GeometryCalculator.C() < 50) break block10;
                                        if (!transactionCorrelationEngine.i().n()) break block11;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PatternMatchingOrchestrator.a(customSystemException);
                                    }
                                    if (!transactionCorrelationEngine.i().O()) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PatternMatchingOrchestrator.a(customSystemException);
                                }
                                bl2 = true;
                                break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PatternMatchingOrchestrator.a(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                RecursiveNodeTree recursiveNodeTree = transactionCorrelationEngine.u();
                try {
                    try {
                        if (!recursiveNodeTree.s() || !recursiveNodeTree.y()) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PatternMatchingOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean u(TransactionCorrelationEngine transactionCorrelationEngine) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (PatternMatchingOrchestrator.N(transactionCorrelationEngine) || !PatternMatchingOrchestrator.q(transactionCorrelationEngine)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PatternMatchingOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static int[] v(String string) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Map map = ProtocolInteractionController.p();
        if (map != null) {
            Set set = map.keySet();
            for (Object k : set) {
                Object v = map.get(k);
                TransactionCorrelationEngine transactionCorrelationEngine = new TransactionCorrelationEngine(k);
                ProtocolInteractionController protocolInteractionController = new ProtocolInteractionController(v);
                int n = PatternMatchingOrchestrator.X(string, protocolInteractionController);
                try {
                    if (n == -1) continue;
                    arrayList.add(TransactionCorrelationEngine.h(transactionCorrelationEngine));
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).distinct().toArray();
    }

    public static float Z(TransactionCorrelationEngine transactionCorrelationEngine) {
        return transactionCorrelationEngine.W();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = PatternMatchingOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = PatternMatchingOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int X(String string, ProtocolInteractionController protocolInteractionController) {
        try {
            if (protocolInteractionController.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        LightweightExecutionContext lightweightExecutionContext = LightweightExecutionContext.d(protocolInteractionController);
        try {
            if (lightweightExecutionContext.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        List list = new ArrayList();
        if (GeometryCalculator.C() >= 23) {
            list = (List)OutputStreamHandler.x().M();
        }
        protocolInteractionController.l(protocolInteractionController, list);
        if (list.size() > 0) {
            for (Object e : list) {
                LightweightExecutionContext lightweightExecutionContext2 = new LightweightExecutionContext(e);
                try {
                    if (!lightweightExecutionContext2.g().contains(string)) continue;
                    return lightweightExecutionContext2.b();
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
        }
        String string2 = lightweightExecutionContext.g().toLowerCase();
        try {
            if (string2.contains(string)) {
                return lightweightExecutionContext.b();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PatternMatchingOrchestrator.a(customSystemException);
        }
        return -1;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "9y1";
        objectArray[1] = Integer.TYPE;
        PatternMatchingOrchestrator.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0012\u000ek'X~\u0019\u0001zh%f\n\u0006s!";
        objectArray[3] = "E=uV\f-N2d\u0019m#E9`C";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "H4[\u00048+\u0011+]zknw(\u0005\u0015|{\u00126\u000fE\u0000,\u0017>W\u0001`{I>Oz";
    }

    public static boolean z(TransactionCorrelationEngine transactionCorrelationEngine) {
        boolean bl;
        block8: {
            block7: {
                int n = TransactionCorrelationEngine.h(transactionCorrelationEngine);
                String string = transactionCorrelationEngine.s();
                try {
                    block6: {
                        try {
                            try {
                                if (n == 26) break block6;
                                if (string == null) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PatternMatchingOrchestrator.a(customSystemException);
                            }
                            if (!u.matcher(string).matches()) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PatternMatchingOrchestrator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw PatternMatchingOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = PatternMatchingOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = PatternMatchingOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3DF5;
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
                throw new RuntimeException("a/GH", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            PatternMatchingOrchestrator.c[n2] = n3;
        }
        return c[n2];
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PatternMatchingOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(PatternMatchingOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

