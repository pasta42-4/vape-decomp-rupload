/*
 * Decompiled with CFR 0.152.
 */
package com.codec.transformation;

import a.JF;
import a.h6;
import com.app.crypto.processing.CipherTextProcessor;
import com.app.transformation.DataTransformationEngine1794;
import com.collections.management.MultiContainerRegistry;
import com.encoding.strategy.EncodingScheme;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolEncoder1226;
import com.resilience.coordination.ResilienceCoordinationManager;
import com.security.config.CryptoConfigurationEnum;
import com.security.context.SecureContextBroker572;
import com.session.management.SessionTimeoutHandler;
import com.stream.processing.StreamProcessor;
import com.system.config.ConfigurationResolver2622;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.theme.ApplicationColorSchemeManager;
import com.user.identity.UserIdentityManager;
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

public class EncodingTransformationEngine
extends ResilienceCoordinationManager {
    private static final String[] tb;
    private final h6 Pt;
    boolean P_;
    private static final long[] mb;
    private static final Map pb;
    private static final Integer[] ob;
    private static final long bb;
    private static final Object[] sb;

    private static Field o(long l, long l2) {
        int n = EncodingTransformationEngine.m(l, l2);
        Object object = sb[n];
        if (object instanceof String) {
            String string = tb[n];
            int n2 = string.indexOf(8);
            Class clazz = EncodingTransformationEngine.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EncodingTransformationEngine.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EncodingTransformationEngine.g(clazz3, string2, clazz2)) != null) {
                    EncodingTransformationEngine.sb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EncodingTransformationEngine.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EncodingTransformationEngine.sb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EncodingTransformationEngine.n(235462013411444L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EncodingTransformationEngine.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EncodingTransformationEngine.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void lambda$null$3() {
        this.P_ = false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EncodingTransformationEngine.bb = MultiContainerRegistry.a(-288532102248191353L, 5232503947240030822L, MethodHandles.lookup().lookupClass()).a(39138289314051L);
                EncodingTransformationEngine.sb = new Object[5];
                EncodingTransformationEngine.tb = new String[5];
                EncodingTransformationEngine.D();
                EncodingTransformationEngine.pb = new HashMap<K, V>(13);
                var0 = EncodingTransformationEngine.bb ^ 56734476732692L;
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
                var6_5 = "\u00b7\u00fe,\u00c9o\u00e7\u0094\u0003k\u00d2\u0017\u00bc\u0087Q\u00d3\"t+\u0087\u00ceJ\u000f\u00a6\f\u00ed\u0089=a\u0015\u0002\u009f\u000e\u00f5\u0082:}\u00b53,N\u00baH\u00d1\u00e4\u001a\u00ddf,";
                var7_6 = "\u00b7\u00fe,\u00c9o\u00e7\u0094\u0003k\u00d2\u0017\u00bc\u0087Q\u00d3\"t+\u0087\u00ceJ\u000f\u00a6\f\u00ed\u0089=a\u0015\u0002\u009f\u000e\u00f5\u0082:}\u00b53,N\u00baH\u00d1\u00e4\u001a\u00ddf,".length();
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
                    var6_5 = "J\u00e0\u0084\u00df\u0017E`0\u00a0\u00be\u00cfMU\"~\u00de";
                    var7_6 = "J\u00e0\u0084\u00df\u0017E`0\u00a0\u00be\u00cfMU\"~\u00de".length();
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
        EncodingTransformationEngine.mb = var8_3;
        EncodingTransformationEngine.ob = new Integer[8];
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

    private static Method p(long l, long l2) {
        int n = EncodingTransformationEngine.m(l, l2);
        Object object = sb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = tb[n];
                int n3 = string2.indexOf(8);
                clazz3 = EncodingTransformationEngine.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EncodingTransformationEngine.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EncodingTransformationEngine.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        EncodingTransformationEngine.sb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EncodingTransformationEngine.n(235462013411444L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EncodingTransformationEngine.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EncodingTransformationEngine.sb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EncodingTransformationEngine.n(235462013411444L, 0L);
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

    private void Z() {
        block20: {
            block18: {
                JF jF;
                long l;
                block19: {
                    block17: {
                        l = bb ^ 0x39BE9CBF91EBL;
                        try {
                            if (this.P_) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EncodingTransformationEngine.a(customSystemException);
                        }
                        try {
                            if (this.UH.h() == ApplicationColorSchemeManager.OFFLINE) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EncodingTransformationEngine.a(customSystemException);
                        }
                        this.P_ = true;
                        jF = TemporalMetadataResolver.h.O().p().Q();
                        try {
                            try {
                                if (jF == null || jF.X()) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EncodingTransformationEngine.a(customSystemException);
                            }
                            this.P_ = false;
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EncodingTransformationEngine.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (jF == null) break block18;
                            if (!jF.u().contains(this.UH)) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EncodingTransformationEngine.a(customSystemException);
                        }
                        this.P_ = false;
                        CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)EncodingTransformationEngine.f("\u00c4", (int)EncodingTransformationEngine.d("u", (int)640, (long)(0x19E0AD74A584211EL ^ l)), (long)3904412043402347978L, (long)l))));
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EncodingTransformationEngine.a(customSystemException);
                    }
                }
                try {
                    if (jF.H().contains(this.UH)) {
                        this.P_ = false;
                        CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)EncodingTransformationEngine.f("\u00c4", (int)EncodingTransformationEngine.d("u", (int)27226, (long)(0x7469DCDDEEBFC9C6L ^ l)), (long)3904412043402347978L, (long)l))));
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EncodingTransformationEngine.a(customSystemException);
                }
                SecureContextBroker572.h().c().l(this.UH.s(), this::lambda$onInvite$0, this::lambda$onInvite$1);
                break block20;
            }
            SecureContextBroker572.h().c().W(this::lambda$onInvite$4, this::lambda$onInvite$5);
        }
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'z' || c == 'R' || c == '\u00e8' || c == '\u00d9') {
                field = EncodingTransformationEngine.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EncodingTransformationEngine.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'a' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$null$2(StreamProcessor streamProcessor) {
        this.D(this.UH, streamProcessor);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (tb[n4] != null) {
            return n4;
        }
        Object object = sb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 7;
                break;
            }
            case 2: {
                n3 = 28;
                break;
            }
            case 3: {
                n3 = 39;
                break;
            }
            case 4: {
                n3 = 6;
                break;
            }
            case 5: {
                n3 = 18;
                break;
            }
            case 6: {
                n3 = 20;
                break;
            }
            case 7: {
                n3 = 11;
                break;
            }
            case 8: {
                n3 = 52;
                break;
            }
            case 9: {
                n3 = 63;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 43;
                break;
            }
            case 12: {
                n3 = 51;
                break;
            }
            case 13: {
                n3 = 17;
                break;
            }
            case 14: {
                n3 = 60;
                break;
            }
            case 15: {
                n3 = 57;
                break;
            }
            case 16: {
                n3 = 62;
                break;
            }
            case 17: {
                n3 = 58;
                break;
            }
            case 18: {
                n3 = 47;
                break;
            }
            case 19: {
                n3 = 12;
                break;
            }
            case 20: {
                n3 = 24;
                break;
            }
            case 21: {
                n3 = 3;
                break;
            }
            case 22: {
                n3 = 19;
                break;
            }
            case 23: {
                n3 = 22;
                break;
            }
            case 24: {
                n3 = 56;
                break;
            }
            case 25: {
                n3 = 34;
                break;
            }
            case 26: {
                n3 = 41;
                break;
            }
            case 27: {
                n3 = 48;
                break;
            }
            case 28: {
                n3 = 13;
                break;
            }
            case 29: {
                n3 = 26;
                break;
            }
            case 30: {
                n3 = 42;
                break;
            }
            case 31: {
                n3 = 36;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 37;
                break;
            }
            case 34: {
                n3 = 25;
                break;
            }
            case 35: {
                n3 = 21;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 27;
                break;
            }
            case 38: {
                n3 = 16;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 38;
                break;
            }
            case 41: {
                n3 = 53;
                break;
            }
            case 42: {
                n3 = 54;
                break;
            }
            case 43: {
                n3 = 15;
                break;
            }
            case 44: {
                n3 = 40;
                break;
            }
            case 45: {
                n3 = 49;
                break;
            }
            case 46: {
                n3 = 50;
                break;
            }
            case 47: {
                n3 = 23;
                break;
            }
            case 48: {
                n3 = 33;
                break;
            }
            case 49: {
                n3 = 8;
                break;
            }
            case 50: {
                n3 = 14;
                break;
            }
            case 51: {
                n3 = 46;
                break;
            }
            case 52: {
                n3 = 9;
                break;
            }
            case 53: {
                n3 = 30;
                break;
            }
            case 54: {
                n3 = 2;
                break;
            }
            case 55: {
                n3 = 45;
                break;
            }
            case 56: {
                n3 = 10;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 44;
                break;
            }
            case 59: {
                n3 = 29;
                break;
            }
            case 60: {
                n3 = 55;
                break;
            }
            case 61: {
                n3 = 31;
                break;
            }
            case 62: {
                n3 = 61;
                break;
            }
            default: {
                n3 = 5;
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
        EncodingTransformationEngine.tb[n4] = new String(cArray);
        return n4;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EncodingTransformationEngine.m(l, l2);
            object = sb[n];
            try {
                if (!(object instanceof String)) break block2;
                EncodingTransformationEngine.sb[n] = clazz = Class.forName(tb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void E() {
        this.Pt.N(this.s());
        super.E();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$onInvite$5() {
        this.P_ = false;
    }

    public EncodingTransformationEngine(UserIdentityManager userIdentityManager) {
        long l = bb ^ 0x15A0E0C2D488L;
        super(userIdentityManager, false, false);
        this.Pt = new SessionTimeoutHandler(this, (String)((Object)EncodingTransformationEngine.f("\u00c4", (int)EncodingTransformationEngine.d("u", (int)5417, (long)(0x311B17C82BA4F3D0L ^ l)), (long)8308136424834351273L, (long)l)), EncodingTransformationEngine.M.S);
        this.P_ = false;
        this.Pt.N(this::Z);
        this.UG.k();
        this.UG.n(this.Ub, new Object[0]);
        this.Pt.d((double)0.65f);
        this.Pt.d(1.0f);
        this.UG.n(this.Pt, new Object[0]);
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = EncodingTransformationEngine.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EncodingTransformationEngine.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void D(UserIdentityManager userIdentityManager, StreamProcessor streamProcessor) {
        long l = bb ^ 0x4D7FF6BC03D8L;
        try {
            switch (ConfigurationResolver2622.c[streamProcessor.l().ordinal()]) {
                case 1: {
                    CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.SUCCESS, (String)((Object)EncodingTransformationEngine.f("\u00c4", (int)EncodingTransformationEngine.d("u", (int)15905, (long)(0x71ACCE3069948F8BL ^ l)), (long)-6621357083855775751L, (long)l)) + userIdentityManager.j() + (String)((Object)EncodingTransformationEngine.f("\u00c4", (int)EncodingTransformationEngine.d("u", (int)31168, (long)(0x18340B6741BD486BL ^ l)), (long)-6621357083855775751L, (long)l))));
                    return;
                }
                case 2: {
                    CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)EncodingTransformationEngine.f("\u00c4", (int)EncodingTransformationEngine.d("u", (int)19311, (long)(0x7B9CA8CE36427AC1L ^ l)), (long)-6621357083855775751L, (long)l))));
                    return;
                }
                case 3: 
                case 4: 
                case 5: {
                    CipherTextProcessor.W(new DataTransformationEngine1794(CryptoConfigurationEnum.ERROR, (String)((Object)EncodingTransformationEngine.f("\u00c4", (int)EncodingTransformationEngine.d("u", (int)7983, (long)(0x6D41974F52C02E83L ^ l)), (long)-6621357083855775751L, (long)l)) + userIdentityManager.j() + (String)((Object)EncodingTransformationEngine.f("\u00c4", (int)EncodingTransformationEngine.d("u", (int)9203, (long)(0x2022CDEDE83925BL ^ l)), (long)-6621357083855775751L, (long)l))));
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EncodingTransformationEngine.a(customSystemException);
        }
    }

    private void lambda$onInvite$4(NetworkProtocolEncoder1226 networkProtocolEncoder1226) {
        try {
            if (networkProtocolEncoder1226.c() == EncodingScheme.SUCCESS) {
                this.P_ = true;
                SecureContextBroker572.h().c().l(this.UH.s(), this::lambda$null$2, this::lambda$null$3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EncodingTransformationEngine.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x15B3;
        if (ob[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = mb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])pb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    pb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/w4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EncodingTransformationEngine.ob[n2] = n3;
        }
        return ob[n2];
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$onInvite$0(StreamProcessor streamProcessor) {
        this.D(this.UH, streamProcessor);
    }

    @Override
    protected void z() {
    }

    private void lambda$onInvite$1() {
        this.P_ = false;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EncodingTransformationEngine.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EncodingTransformationEngine.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void D() {
        Object[] objectArray = sb;
        sb[0] = "\u0002k\u001f";
        objectArray[1] = Integer.TYPE;
        EncodingTransformationEngine.tb[1] = "java/lang/Integer";
        objectArray[2] = "USX'ob^\\Ih\u0012zM[@!";
        objectArray[3] = "L/yl\f:G h#m4L+ly";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "V!\u001e\b-;\t%\u001326!0aMTm`\r'M\\\"Z\t \u001eV95\n9\u000f\b]";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EncodingTransformationEngine.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(EncodingTransformationEngine.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

