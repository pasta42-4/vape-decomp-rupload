/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import a.HK;
import com.analysis.metadata.MetadataExtractionEngine213;
import com.collections.management.MultiContainerRegistry;
import com.crypto.utils.CipherEncryptionUtility;
import com.exception.system.CustomSystemException;
import com.finance.transaction.TransactionExecutor;
import com.math.geometry.GeometryCalculator;
import com.network.communication.CommunicationChannelManager;
import com.resource.management.MultiResourceOrchestrator;
import com.security.auth.AuthenticationProtocol;
import com.security.protocols.CryptoProtocolSpecification;
import com.security.reflection.ReflectionUtility744;
import com.temporal.metadata.TemporalMetadataResolver;
import com.vape.config.VapeConfigurationManager;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class ClassMetadataResolver731
implements CryptoProtocolSpecification {
    protected MultiResourceOrchestrator n;
    protected byte[] C;
    private static final Object[] g;
    private static String[] c;
    private boolean o;
    protected byte[] P;
    private boolean j;
    private static final long a;
    private static final String[] h;
    protected Class X;

    public void P(HK hK, Class clazz, AuthenticationProtocol ... authenticationProtocolArray) {
        MetadataExtractionEngine213 metadataExtractionEngine213 = new MetadataExtractionEngine213(0, clazz, this.n, new VapeConfigurationManager(hK.B(), hK.G()), hK.N(), authenticationProtocolArray);
        metadataExtractionEngine213.P();
        metadataExtractionEngine213.O();
    }

    public static String[] D() {
        return c;
    }

    @Override
    public void i() {
        this.P = ReflectionUtility744.Q(this.X, true);
        this.C = new byte[this.P.length];
        System.arraycopy(this.P, 0, this.C, 0, this.P.length);
        CipherEncryptionUtility cipherEncryptionUtility = new CipherEncryptionUtility(this.P);
        this.n = new MultiResourceOrchestrator();
        cipherEncryptionUtility.A(this.n, 0);
    }

    public void l(HK hK, Class clazz, AuthenticationProtocol ... authenticationProtocolArray) {
        MetadataExtractionEngine213 metadataExtractionEngine213 = new MetadataExtractionEngine213(-1, clazz, this.n, new VapeConfigurationManager(hK.B(), hK.G()), hK.N(), authenticationProtocolArray);
        metadataExtractionEngine213.P();
        metadataExtractionEngine213.O();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ClassMetadataResolver731.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ClassMetadataResolver731.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ClassMetadataResolver731.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static {
        a = MultiContainerRegistry.a(-8829218376023225282L, -2895064071857209161L, MethodHandles.lookup().lookupClass()).a(45289957817224L);
        g = new Object[6];
        h = new String[6];
        ClassMetadataResolver731.a();
        if (ClassMetadataResolver731.D() == null) {
            ClassMetadataResolver731.V(new String[5]);
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void h() {
        int n = 3;
        if (GeometryCalculator.C() >= 23) {
            n = 2;
        }
        TransactionExecutor transactionExecutor = new TransactionExecutor(n);
        this.n.a(transactionExecutor);
        this.C = transactionExecutor.V();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ClassMetadataResolver731.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ClassMetadataResolver731.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void V(String[] stringArray) {
        c = stringArray;
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
            int n = ClassMetadataResolver731.a(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                ClassMetadataResolver731.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(long l, long l2) {
        int n = ClassMetadataResolver731.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = ClassMetadataResolver731.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ClassMetadataResolver731.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ClassMetadataResolver731.a(clazz3, string2, clazz2)) != null) {
                    ClassMetadataResolver731.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ClassMetadataResolver731.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ClassMetadataResolver731.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ClassMetadataResolver731.b(329626215364529L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public ClassMetadataResolver731(Class clazz) {
        if (!TemporalMetadataResolver.h.r()) {
            CommunicationChannelManager.J().B().put(clazz.getName(), clazz);
        }
        this.X = clazz;
    }

    @Override
    public void d() {
        long l = a ^ 0x2117D4F4E5D6L;
        ClassMetadataResolver731.b("w", (Object)this.X, (Object)this.P, (long)8708680696730795935L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = ClassMetadataResolver731.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = ClassMetadataResolver731.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ClassMetadataResolver731.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ClassMetadataResolver731.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ClassMetadataResolver731.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ClassMetadataResolver731.b(329626215364529L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ClassMetadataResolver731.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ClassMetadataResolver731.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ClassMetadataResolver731.b(329626215364529L, 0L);
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

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u0004CwU";
        objectArray[1] = "n\u0001!\u0003\u0013Ae\u000e0L~Ae\u0013$";
        objectArray[2] = "e\u000e";
        objectArray[3] = Integer.TYPE;
        ClassMetadataResolver731.h[3] = "java/lang/Integer";
        objectArray[4] = "\u000f|a3uq\u0004sp|\u0014\u007f\u000fxt&";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "\u0016I\u0019\u001dfkI\u0004\u0000y\u0007\u000fM\u0007\u0018A3~KZX\u0013X6\u000eGZ\u0017&t\u0004R\nybn\u0019I\u0019Bhr\u0004\u0000f";
    }

    /*
     * Loose catch block
     */
    public void Q(String string, byte[] byArray) {
        long l = a ^ 0x2E69B98C8C6BL;
        String[] stringArray = ClassMetadataResolver731.D();
        try {
            File file;
            block6: {
                file = new File(string);
                boolean bl = file.getParentFile().exists();
                if (stringArray == null) break block6;
                try {
                    block7: {
                        if (bl) break block6;
                        break block7;
                        catch (Exception exception) {
                            throw ClassMetadataResolver731.a(exception);
                        }
                    }
                    bl = file.getParentFile().mkdirs();
                }
                catch (Exception exception) {
                    throw ClassMetadataResolver731.a(exception);
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byArray);
            fileOutputStream.close();
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    @Override
    public boolean P() {
        return this.o;
    }

    @Override
    public abstract void y();

    @Override
    public Class l() {
        return this.X;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'H' || c == '\u00aa' || c == 'v' || c == '\u00d5') {
                field = ClassMetadataResolver731.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ClassMetadataResolver731.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void v() {
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 40;
                break;
            }
            case 2: {
                n3 = 46;
                break;
            }
            case 3: {
                n3 = 0;
                break;
            }
            case 4: {
                n3 = 18;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 10;
                break;
            }
            case 7: {
                n3 = 34;
                break;
            }
            case 8: {
                n3 = 19;
                break;
            }
            case 9: {
                n3 = 31;
                break;
            }
            case 10: {
                n3 = 20;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 4;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 61;
                break;
            }
            case 16: {
                n3 = 29;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 8;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 42;
                break;
            }
            case 22: {
                n3 = 62;
                break;
            }
            case 23: {
                n3 = 45;
                break;
            }
            case 24: {
                n3 = 51;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 22;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 36;
                break;
            }
            case 29: {
                n3 = 30;
                break;
            }
            case 30: {
                n3 = 49;
                break;
            }
            case 31: {
                n3 = 52;
                break;
            }
            case 32: {
                n3 = 21;
                break;
            }
            case 33: {
                n3 = 44;
                break;
            }
            case 34: {
                n3 = 58;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 12;
                break;
            }
            case 37: {
                n3 = 59;
                break;
            }
            case 38: {
                n3 = 6;
                break;
            }
            case 39: {
                n3 = 48;
                break;
            }
            case 40: {
                n3 = 57;
                break;
            }
            case 41: {
                n3 = 56;
                break;
            }
            case 42: {
                n3 = 17;
                break;
            }
            case 43: {
                n3 = 43;
                break;
            }
            case 44: {
                n3 = 1;
                break;
            }
            case 45: {
                n3 = 35;
                break;
            }
            case 46: {
                n3 = 14;
                break;
            }
            case 47: {
                n3 = 32;
                break;
            }
            case 48: {
                n3 = 24;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 23;
                break;
            }
            case 51: {
                n3 = 55;
                break;
            }
            case 52: {
                n3 = 15;
                break;
            }
            case 53: {
                n3 = 27;
                break;
            }
            case 54: {
                n3 = 63;
                break;
            }
            case 55: {
                n3 = 53;
                break;
            }
            case 56: {
                n3 = 3;
                break;
            }
            case 57: {
                n3 = 41;
                break;
            }
            case 58: {
                n3 = 9;
                break;
            }
            case 59: {
                n3 = 11;
                break;
            }
            case 60: {
                n3 = 54;
                break;
            }
            case 61: {
                n3 = 39;
                break;
            }
            case 62: {
                n3 = 7;
                break;
            }
            default: {
                n3 = 28;
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
        ClassMetadataResolver731.h[n4] = new String(cArray);
        return n4;
    }

    @Override
    public int s() {
        long l = a ^ 0x3596B818029EL;
        try {
            if (this.j) {
                return -3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataResolver731.a(customSystemException);
        }
        this.h();
        CallSite callSite = ClassMetadataResolver731.b("w", (Object)this.X, (Object)this.C, (long)-6948097157838907177L, (long)l);
        return (int)callSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/zf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ClassMetadataResolver731.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

