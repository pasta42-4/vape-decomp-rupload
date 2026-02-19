/*
 * Decompiled with CFR 0.152.
 */
package com.security.encryption;

import a.Sc;
import a.bE;
import a.yC;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.exception.system.CustomSystemException;
import com.math.precision.PrecisionMathOrchestrator;
import com.math.transformation.NumericTransformationEngine;
import com.network.security.NetworkSecurityOrchestrator;
import com.security.cryptography.CryptographicContextManager153;
import com.security.streaming.StreamCipherOrchestrator183;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CipherContextManager
extends AbstractComputationKernel {
    private static final Integer[] D;
    private static final String[] Y;
    private final SymmetricCipherManager b;
    private static final Object[] F;
    private final StreamCipherOrchestrator183 V;
    private boolean R;
    private final SymmetricCipherManager v;
    private static final Map E;
    private static final long n;
    private static final long[] B;
    private static String[] L;

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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CipherContextManager.n = MultiContainerRegistry.a(2343647687532755798L, 1903512429586073466L, MethodHandles.lookup().lookupClass()).a(72213267839533L);
                CipherContextManager.F = new Object[5];
                CipherContextManager.Y = new String[5];
                CipherContextManager.a();
                CipherContextManager.E = new HashMap<K, V>(13);
                CipherContextManager.O(null);
                var0 = CipherContextManager.n ^ 101937508700582L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "4e_\u00df7e\u00d2\u008etU\u001a\u00ae\u0095n\u00a0\u007f\u008e`f\u00cd0>\u00a2\u00a0";
                var7_6 = "4e_\u00df7e\u00d2\u008etU\u001a\u00ae\u0095n\u00a0\u007f\u008e`f\u00cd0>\u00a2\u00a0".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "qKIBU\u0015\u001ec\u0088\u00b6%\u0004\u00ea\u00905\u0019";
                    var7_6 = "qKIBU\u0015\u001ec\u0088\u00b6%\u0004\u00ea\u00905\u0019".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        CipherContextManager.B = var8_3;
        CipherContextManager.D = new Integer[5];
    }

    private static void a() {
        Object[] objectArray = F;
        F[0] = "C#W";
        objectArray[1] = Integer.TYPE;
        CipherContextManager.Y[1] = "java/lang/Integer";
        objectArray[2] = "{\u001dm&^hp\u0012|i#pc\u0015u ";
        objectArray[3] = "*J\u0000\\F1!E\u0011\u0013'?*N\u0015I";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "A6c\u0007E$V<8;\u0010e&+=WAe]<n\n{'Dnb^\u0018g\u001a6k;";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Rp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = CipherContextManager.e(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            String string = Y[n];
            int n2 = string.indexOf(8);
            Class clazz = CipherContextManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CipherContextManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CipherContextManager.c(clazz3, string2, clazz2)) != null) {
                    CipherContextManager.F[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CipherContextManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CipherContextManager.F[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CipherContextManager.f(280949730003981L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Y[n4] != null) {
            return n4;
        }
        Object object = F[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 5;
                break;
            }
            case 1: {
                n3 = 53;
                break;
            }
            case 2: {
                n3 = 52;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 62;
                break;
            }
            case 5: {
                n3 = 10;
                break;
            }
            case 6: {
                n3 = 43;
                break;
            }
            case 7: {
                n3 = 55;
                break;
            }
            case 8: {
                n3 = 20;
                break;
            }
            case 9: {
                n3 = 28;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 39;
                break;
            }
            case 12: {
                n3 = 33;
                break;
            }
            case 13: {
                n3 = 6;
                break;
            }
            case 14: {
                n3 = 9;
                break;
            }
            case 15: {
                n3 = 63;
                break;
            }
            case 16: {
                n3 = 44;
                break;
            }
            case 17: {
                n3 = 15;
                break;
            }
            case 18: {
                n3 = 22;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 20: {
                n3 = 7;
                break;
            }
            case 21: {
                n3 = 34;
                break;
            }
            case 22: {
                n3 = 49;
                break;
            }
            case 23: {
                n3 = 2;
                break;
            }
            case 24: {
                n3 = 32;
                break;
            }
            case 25: {
                n3 = 24;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 54;
                break;
            }
            case 28: {
                n3 = 19;
                break;
            }
            case 29: {
                n3 = 25;
                break;
            }
            case 30: {
                n3 = 31;
                break;
            }
            case 31: {
                n3 = 57;
                break;
            }
            case 32: {
                n3 = 37;
                break;
            }
            case 33: {
                n3 = 42;
                break;
            }
            case 34: {
                n3 = 38;
                break;
            }
            case 35: {
                n3 = 27;
                break;
            }
            case 36: {
                n3 = 18;
                break;
            }
            case 37: {
                n3 = 60;
                break;
            }
            case 38: {
                n3 = 29;
                break;
            }
            case 39: {
                n3 = 17;
                break;
            }
            case 40: {
                n3 = 13;
                break;
            }
            case 41: {
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 1;
                break;
            }
            case 43: {
                n3 = 56;
                break;
            }
            case 44: {
                n3 = 26;
                break;
            }
            case 45: {
                n3 = 36;
                break;
            }
            case 46: {
                n3 = 16;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 35;
                break;
            }
            case 49: {
                n3 = 8;
                break;
            }
            case 50: {
                n3 = 12;
                break;
            }
            case 51: {
                n3 = 41;
                break;
            }
            case 52: {
                n3 = 61;
                break;
            }
            case 53: {
                n3 = 45;
                break;
            }
            case 54: {
                n3 = 23;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 40;
                break;
            }
            case 57: {
                n3 = 46;
                break;
            }
            case 58: {
                n3 = 30;
                break;
            }
            case 59: {
                n3 = 58;
                break;
            }
            case 60: {
                n3 = 14;
                break;
            }
            case 61: {
                n3 = 51;
                break;
            }
            case 62: {
                n3 = 3;
                break;
            }
            default: {
                n3 = 48;
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
        CipherContextManager.Y[n4] = new String(cArray);
        return n4;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CipherContextManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CipherContextManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Rp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void d() {
        this.v.c();
    }

    private static Method h(long l, long l2) {
        int n = CipherContextManager.e(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Y[n];
                int n3 = string2.indexOf(8);
                clazz3 = CipherContextManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CipherContextManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CipherContextManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CipherContextManager.F[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CipherContextManager.f(280949730003981L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CipherContextManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CipherContextManager.F[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CipherContextManager.f(280949730003981L, 0L);
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

    public static String[] p() {
        return L;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CipherContextManager.e(l, l2);
            object = F[n];
            try {
                if (!(object instanceof String)) break block2;
                CipherContextManager.F[n] = clazz = Class.forName(Y[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c7' || c == '\u00e5' || c == 'A' || c == '\u00e0') {
                field = CipherContextManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CipherContextManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'j' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$populate$0(Runnable runnable) {
        long l = n ^ 0x71F408A1D135L;
        try {
            if (this.V.A().size() >= 10) {
                TemporalMetadataResolver.h.c().C((String)((Object)CipherContextManager.c("j", (int)CipherContextManager.b("f", (int)28641, (long)(0x12FB7326A61E0C36L ^ l)), (long)2837298420833837267L, (long)l)), (String)((Object)CipherContextManager.c("j", (int)CipherContextManager.b("f", (int)8695, (long)(0x131D672FB9354222L ^ l)), (long)2837298420833837267L, (long)l)), CryptoConfigurationRegistry383.WARNING, 5000L, true);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager.a(customSystemException);
        }
        Sc sc = new Sc();
        try {
            if (this.V.A().isEmpty()) {
                this.V.H(sc);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager.a(customSystemException);
        }
        this.V.S(sc);
        GraphicalRenderingController.st.execute(runnable);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CipherContextManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public double z() {
        return this.v.b() + 2.0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void D() {
        long l = n ^ 0x4BA35BDE87FFL;
        Runnable runnable = this::D;
        this.v.k();
        this.v.n(new bE(0.0, 1.0), new Object[0]);
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)CipherContextManager.c("j", (int)CipherContextManager.b("f", (int)16899, (long)(0x5569A8D53544771FL ^ l)), (long)8190395941600933401L, (long)l)), 0.75);
        cryptographicContextManager153.q(true);
        cryptographicContextManager153.T(this.w());
        this.v.n(cryptographicContextManager153, new Object[0]);
        this.v.n(new bE(this.w(), 2.0), new Object[0]);
        this.v.n(new bE(5.0, 0.0), new Object[0]);
        CallSite callSite = CipherContextManager.c("j", (int)CipherContextManager.b("f", (int)18037, (long)(0x13604E1FCD26736DL ^ l)), (long)8190395941600933401L, (long)l);
        double d2 = this.w();
        this.getClass();
        yC yC2 = new yC((String)((Object)callSite), 7.0, 7.0, d2 - (double)(5.0f * 2.0f), 15.0, CipherContextManager.M.Y, CipherContextManager.M.u, CipherContextManager.M.S);
        yC2.w(true);
        yC2.u(true);
        yC2.N(() -> this.lambda$populate$0(runnable));
        yC2.g((String)((Object)CipherContextManager.c("j", (int)CipherContextManager.b("f", (int)654, (long)(0x3CDDF625D4B790L ^ l)), (long)8190395941600933401L, (long)l)));
        this.v.n(yC2, new Object[0]);
        this.v.n(new bE(this.w(), 5.0), new Object[0]);
        this.v.n(this.b, new Object[0]);
        this.b.k();
        List<Sc> list = this.V.A();
        for (int i = 0; i < list.size(); ++i) {
            double d3;
            double d4;
            PrecisionMathOrchestrator precisionMathOrchestrator;
            PrecisionMathOrchestrator precisionMathOrchestrator2;
            SymmetricCipherManager symmetricCipherManager;
            boolean bl;
            Sc sc = list.get(i);
            NetworkSecurityOrchestrator networkSecurityOrchestrator = new NetworkSecurityOrchestrator(this.V, sc, runnable);
            try {
                networkSecurityOrchestrator.T(this.w());
                bl = i == list.size() - 1;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherContextManager.a(customSystemException);
            }
            boolean bl2 = bl;
            try {
                if (bl2) {
                    this.b.n(new bE(0.0, 1.0), new Object[0]);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CipherContextManager.a(customSystemException);
            }
            try {
                PrecisionMathOrchestrator precisionMathOrchestrator3;
                symmetricCipherManager = this.b;
                precisionMathOrchestrator2 = precisionMathOrchestrator3;
                precisionMathOrchestrator = precisionMathOrchestrator3;
                d4 = 0.0;
                d3 = bl2 ? 0.0 : 1.0;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherContextManager.a(customSystemException);
            }
            precisionMathOrchestrator2(d4, d3, networkSecurityOrchestrator);
            symmetricCipherManager.n(precisionMathOrchestrator, new Object[0]);
        }
        this.v.h(true);
        NumericTransformationEngine numericTransformationEngine = this.F();
        try {
            if (numericTransformationEngine != null) {
                numericTransformationEngine.h(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager.a(customSystemException);
        }
    }

    public static void O(String[] stringArray) {
        L = stringArray;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CipherContextManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CipherContextManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CipherContextManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void g() {
        this.v.N();
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x44B7;
        if (D[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = B[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])E.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    E.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Rp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CipherContextManager.D[n2] = n3;
        }
        return D[n2];
    }

    @Override
    public double e() {
        return 110.0;
    }

    public CipherContextManager(StreamCipherOrchestrator183 streamCipherOrchestrator183) {
        this.V = streamCipherOrchestrator183;
        this.L(streamCipherOrchestrator183);
        this.v = new SymmetricCipherManager(this.e());
        this.v.i(false);
        this.v.q(true);
        this.b = new SymmetricCipherManager(this.e());
        this.b.i(false);
    }

    @Override
    public void G() {
        try {
            if (!this.R) {
                this.R = true;
                this.D();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager.a(customSystemException);
        }
        this.i(true);
        this.S();
        this.v.b(this.G());
        this.v.M(this.W());
        this.v.E();
        NumericTransformationEngine numericTransformationEngine = this.F();
        try {
            if (numericTransformationEngine != null) {
                numericTransformationEngine.h(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager.a(customSystemException);
        }
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        try {
            if (this.v.s()) {
                this.v.S(userInteractionEventDispatcher);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherContextManager.a(customSystemException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CipherContextManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CipherContextManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

