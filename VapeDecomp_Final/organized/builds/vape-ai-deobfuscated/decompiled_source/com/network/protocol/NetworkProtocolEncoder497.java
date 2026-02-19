/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.bE;
import com.collections.management.MultiContainerRegistry;
import com.data.compression.DataCompressionNegotiator;
import com.exception.system.CustomSystemException;
import com.graphics.geometry.GeometryTransformer;
import com.graphics.rendering.GraphicalRenderingContext;
import com.math.precision.PrecisionMathOrchestrator;
import com.network.config.NetworkConfigurationEnum;
import com.system.lifecycle.SystemLifecycleController;
import com.ui.theme.UserInterfaceThemeManager;
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

public class NetworkProtocolEncoder497
extends GeometryTransformer {
    private static final Integer[] lb;
    private static final String[] pb;
    private static final long bb;
    private final DataCompressionNegotiator Bi;
    private static final Object[] ob;
    private final GraphicalRenderingContext Bw;
    private static final Map mb;
    private static final long[] eb;

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void lambda$new$0() {
        SystemLifecycleController.C.N();
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'X' || c == '\u00db' || c == '\u00e8' || c == 'b') {
                field = NetworkProtocolEncoder497.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkProtocolEncoder497.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void D() {
        Object[] objectArray = ob;
        ob[0] = "mO%";
        objectArray[1] = Integer.TYPE;
        NetworkProtocolEncoder497.pb[1] = "java/lang/Integer";
        objectArray[2] = "S,\u0006\u0014\u0018cX#\u0017[e{K$\u001e\u0012";
        objectArray[3] = "\u0017I%\u007f\"\u0005\u001cF40C\u000b\u0017M0j";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\b\u0003<(\u001bM^\\2C\u001a\u000f8O =\u0013\u0010\u0000\u0005::qMZ[kz\r\u0013CX`C";
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = NetworkProtocolEncoder497.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkProtocolEncoder497.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public NetworkProtocolEncoder497() {
        long l = bb ^ 0x519C2F5FFD2L;
        this.d().f((String)((Object)NetworkProtocolEncoder497.d("\u00d3", (int)NetworkProtocolEncoder497.c("m", (int)24814, (long)(0x2E3B4388B9BC22E0L ^ l)), (long)-3030921502355727894L, (long)l)));
        UserInterfaceThemeManager userInterfaceThemeManager = new UserInterfaceThemeManager((String)((Object)NetworkProtocolEncoder497.d("\u00d3", (int)NetworkProtocolEncoder497.c("m", (int)22338, (long)(0x49144DDB6CB7154AL ^ l)), (long)-3030921502355727894L, (long)l)), 12.0f, 12.0f);
        this.n(new PrecisionMathOrchestrator(20.0, 0.0, 45.0, 45.0, userInterfaceThemeManager), new Object[0]);
        this.n(new bE(0.0, 5.0), new Object[0]);
        DataCompressionNegotiator dataCompressionNegotiator = new DataCompressionNegotiator((String)((Object)NetworkProtocolEncoder497.d("\u00d3", (int)NetworkProtocolEncoder497.c("m", (int)27835, (long)(0x74D7E178111C2EB0L ^ l)), (long)-3030921502355727894L, (long)l)), 1.0);
        dataCompressionNegotiator.q(true);
        dataCompressionNegotiator.T(this.w() - 30.0);
        dataCompressionNegotiator.w(20.0);
        dataCompressionNegotiator.B(NetworkProtocolEncoder497.M.A);
        this.n(new PrecisionMathOrchestrator(0.0, 0.0, 15.0, 15.0, dataCompressionNegotiator), new Object[0]);
        this.n(new bE(0.0, 5.0), new Object[0]);
        this.Bi = new DataCompressionNegotiator((String)((Object)NetworkProtocolEncoder497.d("\u00d3", (int)NetworkProtocolEncoder497.c("m", (int)10839, (long)(0x1A0C0552317A685AL ^ l)), (long)-3030921502355727894L, (long)l)), 0.8);
        this.Bi.T(this.w() - 30.0);
        this.Bi.w(20.0);
        this.Bi.B(NetworkProtocolEncoder497.M.c);
        this.n(new PrecisionMathOrchestrator(0.0, 0.0, 15.0, 15.0, this.Bi), new Object[0]);
        this.Bw = new GraphicalRenderingContext((String)((Object)NetworkProtocolEncoder497.d("\u00d3", (int)NetworkProtocolEncoder497.c("m", (int)15307, (long)(0x475BCBCE3AA479C2L ^ l)), (long)-3030921502355727894L, (long)l)), (double)0.8f, NetworkProtocolEncoder497.M.c, new Color(255, 255, 255, 255));
        this.Bw.N(NetworkProtocolEncoder497::lambda$new$0);
        this.Bw.T(50.0);
        this.Bw.w(10.0);
        this.n(new PrecisionMathOrchestrator(40.0, 0.0, 26.0, 0.0, this.Bw), new Object[0]);
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkProtocolEncoder497.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkProtocolEncoder497.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkProtocolEncoder497.m(l, l2);
            object = ob[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkProtocolEncoder497.ob[n] = clazz = Class.forName(pb[n]);
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
                NetworkProtocolEncoder497.bb = MultiContainerRegistry.a(-786105865181917869L, -7986745282295489490L, MethodHandles.lookup().lookupClass()).a(268896990484933L);
                NetworkProtocolEncoder497.ob = new Object[5];
                NetworkProtocolEncoder497.pb = new String[5];
                NetworkProtocolEncoder497.D();
                NetworkProtocolEncoder497.mb = new HashMap<K, V>(13);
                var0 = NetworkProtocolEncoder497.bb ^ 43700025393696L;
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
                var6_5 = "\u00e3\u00ec\u00f5U@\u001an\u0080\u00bf\u00f4\f\u00c3\u00bf\u001f\u00feX\u00ed)\u00ae2\u00a2T\u0087jl\u00dc@f\u00beg\u00f1\u00e0\u001agBR\u00c5\u00e7]\u0098/T\u00cd\u00c0\u0004\u0090\u009eT";
                var7_6 = "\u00e3\u00ec\u00f5U@\u001an\u0080\u00bf\u00f4\f\u00c3\u00bf\u001f\u00feX\u00ed)\u00ae2\u00a2T\u0087jl\u00dc@f\u00beg\u00f1\u00e0\u001agBR\u00c5\u00e7]\u0098/T\u00cd\u00c0\u0004\u0090\u009eT".length();
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
                    var6_5 = "&[\u00a9\u001b9\u00e4q\u00fc}\u00c6L\u00de\f\u00b8\u00b3\"";
                    var7_6 = "&[\u00a9\u001b9\u00e4q\u00fc}\u00c6L\u00de\f\u00b8\u00b3\"".length();
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
        NetworkProtocolEncoder497.eb = var8_3;
        NetworkProtocolEncoder497.lb = new Integer[8];
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkProtocolEncoder497.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method p(long l, long l2) {
        int n = NetworkProtocolEncoder497.m(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n];
                int n3 = string2.indexOf(8);
                clazz3 = NetworkProtocolEncoder497.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkProtocolEncoder497.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkProtocolEncoder497.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkProtocolEncoder497.ob[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkProtocolEncoder497.n(256795036917789L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkProtocolEncoder497.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkProtocolEncoder497.ob[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkProtocolEncoder497.n(256795036917789L, 0L);
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

    private static Field o(long l, long l2) {
        int n = NetworkProtocolEncoder497.m(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            String string = pb[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkProtocolEncoder497.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkProtocolEncoder497.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkProtocolEncoder497.g(clazz3, string2, clazz2)) != null) {
                    NetworkProtocolEncoder497.ob[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkProtocolEncoder497.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkProtocolEncoder497.ob[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkProtocolEncoder497.n(256795036917789L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolEncoder497.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x17F8;
        if (lb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolEncoder497.lb[n2] = n3;
        }
        return lb[n2];
    }

    @Override
    public void O() {
        block5: {
            long l;
            block6: {
                block4: {
                    l = bb ^ 0x4390E018B3ACL;
                    try {
                        if (!SystemLifecycleController.C.P().equals((Object)NetworkConfigurationEnum.BANNED)) break block4;
                        this.Bi.H((String)((Object)NetworkProtocolEncoder497.d("\u00d3", (int)NetworkProtocolEncoder497.c("m", (int)24285, (long)(0x3932D5703A67D0ACL ^ l)), (long)-7381885246744881772L, (long)l)));
                        break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolEncoder497.a(customSystemException);
                    }
                }
                try {
                    if (!SystemLifecycleController.C.P().equals((Object)NetworkConfigurationEnum.REGISTRATION_OFFLINE)) break block6;
                    this.Bi.H((String)((Object)NetworkProtocolEncoder497.d("\u00d3", (int)NetworkProtocolEncoder497.c("m", (int)4360, (long)(0x2D26DA427FCC1F7CL ^ l)), (long)-7381885246744881772L, (long)l)));
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolEncoder497.a(customSystemException);
                }
            }
            this.Bi.H((String)((Object)NetworkProtocolEncoder497.d("\u00d3", (int)NetworkProtocolEncoder497.c("m", (int)2582, (long)(0x7F4687611F178464L ^ l)), (long)-7381885246744881772L, (long)l)));
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (pb[n4] != null) {
            return n4;
        }
        Object object = ob[n4];
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
                n3 = 38;
                break;
            }
            case 2: {
                n3 = 57;
                break;
            }
            case 3: {
                n3 = 17;
                break;
            }
            case 4: {
                n3 = 63;
                break;
            }
            case 5: {
                n3 = 14;
                break;
            }
            case 6: {
                n3 = 3;
                break;
            }
            case 7: {
                n3 = 51;
                break;
            }
            case 8: {
                n3 = 18;
                break;
            }
            case 9: {
                n3 = 31;
                break;
            }
            case 10: {
                n3 = 41;
                break;
            }
            case 11: {
                n3 = 12;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 9;
                break;
            }
            case 14: {
                n3 = 23;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 34;
                break;
            }
            case 17: {
                n3 = 6;
                break;
            }
            case 18: {
                n3 = 21;
                break;
            }
            case 19: {
                n3 = 56;
                break;
            }
            case 20: {
                n3 = 16;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 24;
                break;
            }
            case 23: {
                n3 = 25;
                break;
            }
            case 24: {
                n3 = 46;
                break;
            }
            case 25: {
                n3 = 54;
                break;
            }
            case 26: {
                n3 = 4;
                break;
            }
            case 27: {
                n3 = 50;
                break;
            }
            case 28: {
                n3 = 7;
                break;
            }
            case 29: {
                n3 = 39;
                break;
            }
            case 30: {
                n3 = 0;
                break;
            }
            case 31: {
                n3 = 28;
                break;
            }
            case 32: {
                n3 = 59;
                break;
            }
            case 33: {
                n3 = 43;
                break;
            }
            case 34: {
                n3 = 1;
                break;
            }
            case 35: {
                n3 = 26;
                break;
            }
            case 36: {
                n3 = 29;
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
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 30;
                break;
            }
            case 43: {
                n3 = 47;
                break;
            }
            case 44: {
                n3 = 62;
                break;
            }
            case 45: {
                n3 = 55;
                break;
            }
            case 46: {
                n3 = 11;
                break;
            }
            case 47: {
                n3 = 19;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 13;
                break;
            }
            case 50: {
                n3 = 53;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 35;
                break;
            }
            case 53: {
                n3 = 20;
                break;
            }
            case 54: {
                n3 = 33;
                break;
            }
            case 55: {
                n3 = 5;
                break;
            }
            case 56: {
                n3 = 37;
                break;
            }
            case 57: {
                n3 = 48;
                break;
            }
            case 58: {
                n3 = 52;
                break;
            }
            case 59: {
                n3 = 61;
                break;
            }
            case 60: {
                n3 = 58;
                break;
            }
            case 61: {
                n3 = 27;
                break;
            }
            case 62: {
                n3 = 42;
                break;
            }
            default: {
                n3 = 15;
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
        NetworkProtocolEncoder497.pb[n4] = new String(cArray);
        return n4;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolEncoder497.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NetworkProtocolEncoder497.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

