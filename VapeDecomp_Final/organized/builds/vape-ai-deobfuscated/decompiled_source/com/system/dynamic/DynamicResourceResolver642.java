/*
 * Decompiled with CFR 0.152.
 */
package com.system.dynamic;

import a.Ne;
import a.a;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.context.ContextualDataBroker868;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicContextManager567;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
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

public class DynamicResourceResolver642
extends ContextualExecutionFramework {
    private static final long b;
    private static final String[] l;
    private final ContextualDataBroker868 n;
    private static final Map h;
    private static final Integer[] e;
    private static final long[] d;
    private static final Object[] j;

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ab" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicResourceResolver642.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicResourceResolver642.j[n] = clazz = Class.forName(DynamicResourceResolver642.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicResourceResolver642.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public double e(double d2, boolean bl) {
        String string;
        long l = b ^ 0x8C2980CC6C6L;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            if (systemConfigurationOrchestrator.Y()) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceResolver642.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().q();
        boolean bl2 = Ne.h.k(2896);
        try {
            if (bl2) {
                Ne.h.z(2896);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceResolver642.a(customSystemException);
        }
        double d3 = (double)ApplicationLifecycleManager.e() / 4.0 / TemporalMetadataResolver.h.a().b();
        double d4 = (double)systemConfigurationOrchestrator.e() / 2.0;
        if (systemConfigurationOrchestrator.H() > 0.0f) {
            string = "\u00a76";
            d4 += (double)systemConfigurationOrchestrator.H() / 2.0;
        } else {
            string = "\u00a7c";
        }
        string = string + (String)((Object)DynamicResourceResolver642.c("t", (int)DynamicResourceResolver642.a("y", (int)18696, (long)(0x2E602BE108925581L ^ l)), (long)7560276272555709628L, (long)l));
        String string2 = this.n.x(Math.floor((d4 + 0.25) / 0.5) * 0.5).replace((CharSequence)((Object)DynamicResourceResolver642.c("t", (int)DynamicResourceResolver642.a("y", (int)27167, (long)(0x681B129395E47693L ^ l)), (long)7560276272555709628L, (long)l)), "");
        double d5 = cryptographicParameterGenerator.l(string2, true);
        String string3 = string2 + (String)((Object)DynamicResourceResolver642.c("t", (int)DynamicResourceResolver642.a("y", (int)26860, (long)(0x37A4457AE3E07461L ^ l)), (long)7560276272555709628L, (long)l)) + string;
        Color color = new Color(255, 20, 20);
        if (d4 >= 7.0) {
            color = new Color(2, 190, 58);
        } else if (d4 > 4.0) {
            color = new Color(255, 249, 18);
        }
        double d6 = d3 - d5 / 2.0;
        try {
            cryptographicParameterGenerator.t(string3, d6 + 1.0, d2, color, true);
            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
            if (bl2) {
                Ne.h.y(2896);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceResolver642.a(customSystemException);
        }
        return cryptographicParameterGenerator.g(string3, true);
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "z)\u0012";
        objectArray[1] = Integer.TYPE;
        DynamicResourceResolver642.l[1] = "java/lang/Integer";
        objectArray[2] = "\u0019`\u000b\u001eab\u0012o\u001aQ\u001cz\u0001h\u0013\u0018";
        objectArray[3] = "`B%c\u00034kM4,b:`F0v";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "%uNq]{dfU\nYk\u0018nXdOp&d\u001ae2)de\u001brHjjuI\n";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a5' || c == '\u00dc' || c == '\u00a3' || c == 'S') {
                field = DynamicResourceResolver642.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicResourceResolver642.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00df' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n = DynamicResourceResolver642.a(l, l2);
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
                String string2 = DynamicResourceResolver642.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicResourceResolver642.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicResourceResolver642.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicResourceResolver642.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicResourceResolver642.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicResourceResolver642.b(255786167245794L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicResourceResolver642.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicResourceResolver642.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicResourceResolver642.b(255786167245794L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ab" + " : " + string + " : " + methodType.toString(), exception);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7467;
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
                throw new RuntimeException("a/Ab", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicResourceResolver642.e[n2] = n3;
        }
        return e[n2];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicResourceResolver642.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicResourceResolver642.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void h() {
        super.h();
        GraphicalRenderingController.D(CryptographicContextManager567.class).r(this);
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicResourceResolver642.b = MultiContainerRegistry.a(-7706262554985838394L, -737394043109735602L, MethodHandles.lookup().lookupClass()).a(95295879429127L);
                DynamicResourceResolver642.j = new Object[5];
                DynamicResourceResolver642.l = new String[5];
                DynamicResourceResolver642.a();
                DynamicResourceResolver642.h = new HashMap<K, V>(13);
                var0 = DynamicResourceResolver642.b ^ 15627674974005L;
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
                var6_5 = "\u00ce\u00c7\u0084\u0011\u0013\u009f4l\u00c0ni\u00e7g\u0081\u00b4P\u0094\u00ab\u00b7\fT\u008c\u00c7\u00d7\u00b5\u00b1\u008b$no\u00b2F";
                var7_6 = "\u00ce\u00c7\u0084\u0011\u0013\u009f4l\u00c0ni\u00e7g\u0081\u00b4P\u0094\u00ab\u00b7\fT\u008c\u00c7\u00d7\u00b5\u00b1\u008b$no\u00b2F".length();
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
                    var6_5 = "\f\u00b8[\u009c\u00d6\u00e0'\t:\u00b5w\u00ef\u00c1\u008a\u000f\u008d";
                    var7_6 = "\f\u00b8[\u009c\u00d6\u00e0'\t:\u00b5w\u00ef\u00c1\u008a\u000f\u008d".length();
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
        DynamicResourceResolver642.d = var8_3;
        DynamicResourceResolver642.e = new Integer[6];
    }

    private static Field c(long l, long l2) {
        int n = DynamicResourceResolver642.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = DynamicResourceResolver642.l[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicResourceResolver642.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicResourceResolver642.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicResourceResolver642.a(clazz3, string2, clazz2)) != null) {
                    DynamicResourceResolver642.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicResourceResolver642.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicResourceResolver642.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicResourceResolver642.b(255786167245794L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (DynamicResourceResolver642.l[n4] != null) {
            return n4;
        }
        Object object = j[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 17;
                break;
            }
            case 1: {
                n3 = 16;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 28;
                break;
            }
            case 4: {
                n3 = 8;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 62;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 44;
                break;
            }
            case 9: {
                n3 = 55;
                break;
            }
            case 10: {
                n3 = 32;
                break;
            }
            case 11: {
                n3 = 41;
                break;
            }
            case 12: {
                n3 = 48;
                break;
            }
            case 13: {
                n3 = 33;
                break;
            }
            case 14: {
                n3 = 59;
                break;
            }
            case 15: {
                n3 = 13;
                break;
            }
            case 16: {
                n3 = 60;
                break;
            }
            case 17: {
                n3 = 54;
                break;
            }
            case 18: {
                n3 = 29;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 3;
                break;
            }
            case 23: {
                n3 = 40;
                break;
            }
            case 24: {
                n3 = 11;
                break;
            }
            case 25: {
                n3 = 7;
                break;
            }
            case 26: {
                n3 = 37;
                break;
            }
            case 27: {
                n3 = 26;
                break;
            }
            case 28: {
                n3 = 0;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 1;
                break;
            }
            case 31: {
                n3 = 53;
                break;
            }
            case 32: {
                n3 = 49;
                break;
            }
            case 33: {
                n3 = 43;
                break;
            }
            case 34: {
                n3 = 34;
                break;
            }
            case 35: {
                n3 = 21;
                break;
            }
            case 36: {
                n3 = 51;
                break;
            }
            case 37: {
                n3 = 35;
                break;
            }
            case 38: {
                n3 = 22;
                break;
            }
            case 39: {
                n3 = 30;
                break;
            }
            case 40: {
                n3 = 25;
                break;
            }
            case 41: {
                n3 = 27;
                break;
            }
            case 42: {
                n3 = 38;
                break;
            }
            case 43: {
                n3 = 6;
                break;
            }
            case 44: {
                n3 = 63;
                break;
            }
            case 45: {
                n3 = 52;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 47;
                break;
            }
            case 48: {
                n3 = 36;
                break;
            }
            case 49: {
                n3 = 31;
                break;
            }
            case 50: {
                n3 = 15;
                break;
            }
            case 51: {
                n3 = 61;
                break;
            }
            case 52: {
                n3 = 50;
                break;
            }
            case 53: {
                n3 = 42;
                break;
            }
            case 54: {
                n3 = 46;
                break;
            }
            case 55: {
                n3 = 45;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 39;
                break;
            }
            case 58: {
                n3 = 10;
                break;
            }
            case 59: {
                n3 = 9;
                break;
            }
            case 60: {
                n3 = 18;
                break;
            }
            case 61: {
                n3 = 23;
                break;
            }
            case 62: {
                n3 = 24;
                break;
            }
            default: {
                n3 = 19;
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
        DynamicResourceResolver642.l[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void v() {
        super.v();
        GraphicalRenderingController.D(CryptographicContextManager567.class).v(this);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DynamicResourceResolver642.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicResourceResolver642.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public DynamicResourceResolver642() {
        long l = b ^ 0x41F8741E4DB6L;
        super(a.cs((int)DynamicResourceResolver642.a("y", (int)9121, (long)(0x2AF8AB58696A3459L ^ l))), -21075, RecursiveNodeGraph.z, a.cs((int)DynamicResourceResolver642.a("y", (int)6503, (long)(0x117B6020264B8E99L ^ l))));
        this.n = new ContextualDataBroker868((String)((Object)DynamicResourceResolver642.c("t", (int)DynamicResourceResolver642.a("y", (int)20796, (long)(0x3B1620A99C00C6C3L ^ l)), (long)-2045982179176095796L, (long)l)));
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicResourceResolver642.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicResourceResolver642.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicResourceResolver642.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

