/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.collections.management.MultiContainerRegistry;
import com.computation.adaptive.AdaptiveComputationEngine668;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.exception.system.CustomSystemException;
import com.execution.context.ExecutionContextManager;
import com.network.protocol.AbstractProtocolAdapter;
import com.security.cryptography.SecurePayloadManager;
import com.system.resource.ResourceAllocationManager1348;
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

public class yP
extends SecurePayloadManager {
    private static final long[] pb;
    private static final String[] xb;
    private static final long eb;
    private static final Object[] wb;
    private static final Map rb;
    private static final Integer[] qb;

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method t(long l, long l2) {
        int n = yP.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = xb[n];
                int n3 = string2.indexOf(8);
                clazz3 = yP.r(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = yP.r(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yP.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        yP.wb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yP.r(276542095524072L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = yP.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        yP.wb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yP.r(276542095524072L, 0L);
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

    private static int q(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (xb[n4] != null) {
            return n4;
        }
        Object object = wb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 20;
                break;
            }
            case 1: {
                n3 = 13;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 56;
                break;
            }
            case 5: {
                n3 = 59;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 4;
                break;
            }
            case 8: {
                n3 = 16;
                break;
            }
            case 9: {
                n3 = 38;
                break;
            }
            case 10: {
                n3 = 2;
                break;
            }
            case 11: {
                n3 = 37;
                break;
            }
            case 12: {
                n3 = 32;
                break;
            }
            case 13: {
                n3 = 50;
                break;
            }
            case 14: {
                n3 = 11;
                break;
            }
            case 15: {
                n3 = 17;
                break;
            }
            case 16: {
                n3 = 55;
                break;
            }
            case 17: {
                n3 = 52;
                break;
            }
            case 18: {
                n3 = 0;
                break;
            }
            case 19: {
                n3 = 27;
                break;
            }
            case 20: {
                n3 = 46;
                break;
            }
            case 21: {
                n3 = 26;
                break;
            }
            case 22: {
                n3 = 51;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 58;
                break;
            }
            case 26: {
                n3 = 62;
                break;
            }
            case 27: {
                n3 = 61;
                break;
            }
            case 28: {
                n3 = 10;
                break;
            }
            case 29: {
                n3 = 12;
                break;
            }
            case 30: {
                n3 = 47;
                break;
            }
            case 31: {
                n3 = 31;
                break;
            }
            case 32: {
                n3 = 5;
                break;
            }
            case 33: {
                n3 = 28;
                break;
            }
            case 34: {
                n3 = 21;
                break;
            }
            case 35: {
                n3 = 39;
                break;
            }
            case 36: {
                n3 = 22;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 38: {
                n3 = 54;
                break;
            }
            case 39: {
                n3 = 3;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 45;
                break;
            }
            case 42: {
                n3 = 36;
                break;
            }
            case 43: {
                n3 = 8;
                break;
            }
            case 44: {
                n3 = 34;
                break;
            }
            case 45: {
                n3 = 60;
                break;
            }
            case 46: {
                n3 = 18;
                break;
            }
            case 47: {
                n3 = 29;
                break;
            }
            case 48: {
                n3 = 15;
                break;
            }
            case 49: {
                n3 = 35;
                break;
            }
            case 50: {
                n3 = 44;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 49;
                break;
            }
            case 53: {
                n3 = 24;
                break;
            }
            case 54: {
                n3 = 43;
                break;
            }
            case 55: {
                n3 = 63;
                break;
            }
            case 56: {
                n3 = 33;
                break;
            }
            case 57: {
                n3 = 30;
                break;
            }
            case 58: {
                n3 = 9;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 25;
                break;
            }
            case 61: {
                n3 = 48;
                break;
            }
            case 62: {
                n3 = 53;
                break;
            }
            default: {
                n3 = 14;
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
        yP.xb[n4] = new String(cArray);
        return n4;
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = yP.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = yP.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class r(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = yP.q(l, l2);
            object = wb[n];
            try {
                if (!(object instanceof String)) break block2;
                yP.wb[n] = clazz = Class.forName(xb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static void X() {
        Object[] objectArray = wb;
        wb[0] = "[lm";
        objectArray[1] = Integer.TYPE;
        yP.xb[1] = "java/lang/Integer";
        objectArray[2] = ",wD&\"\u0019'xUi_\u00014\u007f\\ ";
        objectArray[3] = "Qcc$b_Zlrk\u0003QQgv1";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "6!\u0019=.\ns3\u000fE)\u001f\n8\u001979\be2\u0006;B]h5\u001c.!Uav\u001dE";
    }

    private static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private void lambda$new$1(char c, int n) {
        boolean bl;
        long l;
        block16: {
            boolean bl2;
            block15: {
                l = eb ^ 0x3B6ADC898CAAL;
                try {
                    try {
                        if (c != ',' && n != 13) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw yP.b(customSystemException);
                    }
                    bl2 = true;
                    break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw yP.b(customSystemException);
                }
            }
            bl2 = bl = false;
        }
        if (bl) {
            String string = this.o().a().trim();
            if (c == ',') {
                string = string.substring(0, string.length() - 1);
                try {
                    this.o().y(string);
                    if (string.isEmpty()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw yP.b(customSystemException);
                }
            }
            string = ExecutionContextManager.m(string);
            String string2 = ExecutionContextManager.d(string);
            try {
                if (string2 != null) {
                    TemporalMetadataResolver.h.c().t((String)((Object)yP.i("y", (int)yP.d("y", (int)7766, (long)(0x56E8DB227295C373L ^ l)), (long)-6475826927082185166L, (long)l)), string2, CryptoConfigurationRegistry383.WARNING, 5000L);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yP.b(customSystemException);
            }
            try {
                if (this.p().size() >= 5) {
                    TemporalMetadataResolver.h.c().t((String)((Object)yP.i("y", (int)yP.d("y", (int)9591, (long)(0x2C152D73E08F850L ^ l)), (long)-6475826927082185166L, (long)l)), (String)((Object)yP.i("y", (int)yP.d("y", (int)4409, (long)(0x24F806DC64094C1DL ^ l)), (long)-6475826927082185166L, (long)l)), CryptoConfigurationRegistry383.WARNING, 5000L);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yP.b(customSystemException);
            }
            this.o().y("");
            this.u(new ResourceAllocationManager1348(string));
        }
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = yP.e(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = yP.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = yP.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = yP.j(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field s(long l, long l2) {
        int n = yP.q(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            String string = xb[n];
            int n2 = string.indexOf(8);
            Class clazz = yP.r(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = yP.r(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yP.i(clazz3, string2, clazz2)) != null) {
                    yP.wb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = yP.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        yP.wb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yP.r(276542095524072L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'S' || c == '\u00ce' || c == 'G' || c == '\u00cf') {
                field = yP.s(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yP.t(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B05;
        if (qb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = pb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])rb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    rb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yP", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            yP.qb[n2] = n3;
        }
        return qb[n2];
    }

    private static CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void lambda$new$0() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        eb = MultiContainerRegistry.a(-3132464560525670660L, 7604488471997402259L, MethodHandles.lookup().lookupClass()).a(47761434324614L);
        wb = new Object[5];
        xb = new String[5];
        yP.X();
        rb = new HashMap(13);
        long l = eb ^ 0x54683ADEE3BCL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "f\u009c\u0015\u00ec\u00de\u00a8\u00b4\u009d\u008a\u00d8\u00fe\u00af\u00a5\u00e6\u0087?\u009bw@\u00a5bH\u00c4;";
        int n2 = "f\u009c\u0015\u00ec\u00de\u00a8\u00b4\u009d\u008a\u00d8\u00fe\u00af\u00a5\u00e6\u0087?\u009bw@\u00a5bH\u00c4;".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        pb = lArray;
        qb = new Integer[3];
    }

    public yP(String string, double d2, double d3) {
        super(string, yP::lambda$new$0, d2, d3, false, false);
        this.o().M(new AbstractProtocolAdapter());
        this.o().Z(0.0);
        this.o().R(0.0f);
        this.o().x(1.0f);
        this.o().z(yP.M.c);
        this.o().g(yP.M.n);
        this.o().O().N(false);
        this.o().i(false);
        this.o().I(false);
        this.o().h(this::lambda$new$1);
        ((AdaptiveComputationEngine668)this.o()).A().N(false);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yP.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(yP.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

