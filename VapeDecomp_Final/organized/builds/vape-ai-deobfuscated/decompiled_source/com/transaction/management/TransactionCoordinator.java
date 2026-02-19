/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.management;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.data.validation.IntegratedDataValidator;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.state.management.StatefulEventToggle;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TransactionCoordinator
extends CryptoProtocolEngine {
    private static final Object[] e;
    private static final Map d;
    private HK n;
    private final HK C;
    private HK K;
    private static final long[] b;
    private ReflectionUtilityService L;
    private static final String[] f;
    private static final Integer[] c;
    private final ReflectionUtilityService Z;
    private static final long a;

    private Collection e(Object object) {
        return (Collection)this.n.T(object, new Object[0]);
    }

    static Object M(TransactionCoordinator transactionCoordinator, Object object) {
        return transactionCoordinator.J(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1AF;
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
                throw new RuntimeException("a/me", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TransactionCoordinator.c[n2] = n3;
        }
        return c[n2];
    }

    public TransactionCoordinator() {
        int n;
        int n2;
        long l;
        block36: {
            block37: {
                block34: {
                    int n3;
                    int n4;
                    block32: {
                        block31: {
                            int n5;
                            int n6;
                            block28: {
                                block29: {
                                    l = a ^ 0x5A97202891A8L;
                                    int n7 = IntegratedDataValidator.k();
                                    super(ReflectionMetadataResolver.US);
                                    n2 = n7;
                                    try {
                                        try {
                                            n6 = GeometryCalculator.C();
                                            n5 = 50;
                                            if (n2 == 0) break block28;
                                            if (n6 >= n5) break block29;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw TransactionCoordinator.a(customSystemException);
                                        }
                                        this.L = TransactionCoordinator.c("\u00c2", (Object)this, (Object)TransactionCoordinator.c("h", (int)TransactionCoordinator.b("b", (int)21377, (long)(0x6DA886DEF90C9EEL ^ l)), (long)-7223695460518144023L, (long)l), (boolean)true, Boolean.TYPE, (long)-7221642774102848901L, (long)l);
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw TransactionCoordinator.a(customSystemException);
                                    }
                                }
                                n6 = GeometryCalculator.C();
                                n5 = 50;
                            }
                            try {
                                block30: {
                                    try {
                                        if (n6 < n5) break block30;
                                        this.Z = TransactionCoordinator.c("\u00c2", (Object)this, (Object)ReflectionMetadataResolver.VT, (Object)TransactionCoordinator.c("h", (int)TransactionCoordinator.b("b", (int)16416, (long)(0x55717BF63E995A4EL ^ l)), (long)-7223695460518144023L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PH, (long)-7223515755401331829L, (long)l);
                                        if (n2 != 0) break block31;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw TransactionCoordinator.a(customSystemException);
                                    }
                                }
                                this.Z = TransactionCoordinator.c("\u00c2", (Object)this, (Object)TransactionCoordinator.c("h", (int)TransactionCoordinator.b("b", (int)15785, (long)(0x2F6EC588D06727C2L ^ l)), (long)-7223695460518144023L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.PH, (long)-7221642774102848901L, (long)l);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransactionCoordinator.a(customSystemException);
                            }
                        }
                        try {
                            block33: {
                                try {
                                    try {
                                        n4 = GeometryCalculator.C();
                                        n3 = 50;
                                        if (n2 == 0) break block32;
                                        if (n4 < n3) break block33;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw TransactionCoordinator.a(customSystemException);
                                    }
                                    this.C = TransactionCoordinator.c("\u00c2", (Object)this, (Object)ReflectionMetadataResolver.VT, (Object)TransactionCoordinator.c("h", (int)TransactionCoordinator.b("b", (int)6515, (long)(0x62556B5E72D831BL ^ l)), (long)-7223695460518144023L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Uu}, (long)-7221552429011130048L, (long)l);
                                    if (n2 != 0) break block34;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw TransactionCoordinator.a(customSystemException);
                                }
                            }
                            n4 = GeometryCalculator.C();
                            n3 = 23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionCoordinator.a(customSystemException);
                        }
                    }
                    try {
                        block35: {
                            try {
                                if (n4 < n3) break block35;
                                this.C = TransactionCoordinator.c("\u00c2", (Object)this, (Object)TransactionCoordinator.c("h", (int)TransactionCoordinator.b("b", (int)3034, (long)(0x49C407ED380F11B7L ^ l)), (long)-7223695460518144023L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Uu}, (long)-7221745161253450534L, (long)l);
                                if (n2 != 0) break block34;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransactionCoordinator.a(customSystemException);
                            }
                        }
                        this.C = TransactionCoordinator.c("\u00c2", (Object)this, (Object)TransactionCoordinator.c("h", (int)TransactionCoordinator.b("b", (int)23705, (long)(0x337CFFD75E59C6F5L ^ l)), (long)-7223695460518144023L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Uu}, (long)-7221745161253450534L, (long)l);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionCoordinator.a(customSystemException);
                    }
                }
                try {
                    try {
                        n = GeometryCalculator.C();
                        if (n2 == 0) break block36;
                        if (n <= 13) break block37;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionCoordinator.a(customSystemException);
                    }
                    this.n = TransactionCoordinator.c("\u00c2", (Object)this, (Object)TransactionCoordinator.c("h", (int)TransactionCoordinator.b("b", (int)6129, (long)(0x266D69EB17458D98L ^ l)), (long)-7223695460518144023L, (long)l), (boolean)true, Collection.class, (Object)new Class[0], (long)-7221745161253450534L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionCoordinator.a(customSystemException);
                }
            }
            n = GameVersionEnumerator.MC_1_21_11.H() ? 1 : 0;
        }
        try {
            if (n != 0) {
                this.K = ((StatefulEventToggle)((Object)TransactionCoordinator.c("\u00c2", (Object)this, (Object)TransactionCoordinator.c("h", (int)TransactionCoordinator.b("b", (int)11675, (long)(0x562F39E1730F37F1L ^ l)), (long)-7223695460518144023L, (long)l), Boolean.TYPE, (Object)new Class[0], (long)-7223704782716889715L, (long)l))).M();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionCoordinator.a(customSystemException);
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                IntegratedDataValidator.Z(++n2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionCoordinator.a(customSystemException);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/me" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void F(Object object, Object object2) {
        this.C.l(object, object2);
    }

    static Collection m(TransactionCoordinator transactionCoordinator, Object object) {
        return transactionCoordinator.e(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TransactionCoordinator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransactionCoordinator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TransactionCoordinator.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                TransactionCoordinator.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/me" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = TransactionCoordinator.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = TransactionCoordinator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransactionCoordinator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransactionCoordinator.c(clazz3, string2, clazz2)) != null) {
                    TransactionCoordinator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransactionCoordinator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransactionCoordinator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransactionCoordinator.f(905954453530530L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = TransactionCoordinator.e(l, l2);
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
                clazz3 = TransactionCoordinator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransactionCoordinator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransactionCoordinator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransactionCoordinator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransactionCoordinator.f(905954453530530L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransactionCoordinator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransactionCoordinator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransactionCoordinator.f(905954453530530L, 0L);
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = TransactionCoordinator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransactionCoordinator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static boolean A(TransactionCoordinator transactionCoordinator, Object object) {
        return transactionCoordinator.R(object);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "hs5C";
        objectArray[1] = "c\u007f\"'Wnhp3h*v{w:!";
        objectArray[2] = Boolean.TYPE;
        TransactionCoordinator.f[2] = "java/lang/Boolean";
        objectArray[3] = "-r]pnY&}L?\u0003Y&`X";
        objectArray[4] = "E<c7F^0\u001ch8W\u0011]\u001ch%C\u0004";
        objectArray[5] = "\u0000MD@";
        objectArray[6] = "7\u0000n\u001c\u001ciB e\u0013\r&/ e\u000e\u00193";
        objectArray[7] = "\\\u00111";
        objectArray[8] = Integer.TYPE;
        TransactionCoordinator.f[8] = "java/lang/Integer";
        objectArray[9] = "7JU\u0014";
        objectArray[10] = "/`^W|eZ@UXm*7@UEy?";
        objectArray[11] = "\u001a$TH";
        objectArray[12] = "0Zq\u0007\u0005\u0012;U`Hd\u001c0^d\u0012";
        objectArray[13] = "\u0012+\n\u0012\u001eTI6\b\"3dX.C\u0018\u0004\u0005\u00131I\"M\b\\%\b\u001d\r\u0004@,3\u0018\u0013\u001dA*^[\u0016\u0002\u0013T\f\u001eEYQnAH\u001b\n#h\u000e@\t\u001cE?PM\u0005d";
        objectArray[14] = "z\fF=Pi!\u0011D\rwYq\u0014\u0006oD42\u0011\u0019=:\"1\u0003E}[i.\t\u007f4V&:H@tZ:3sEjC;5\u001e\u0006o\\iKLC<\u0007+q\u0001\u0015bTYwN\u001dpB? \u0010\u0010|:";
        objectArray[15] = ".\u0001\u0000\rc%u\u001c\u0002=R\u0015d\u0004I\u0007yt/\u001bC=0y`\u000f\u0002\u0002pu|\u00069\u0007nl}\u0000TDks/~\u0007^ol'\u001b\u0002Qcq\u001f";
        objectArray[16] = "OJ\"NOf\u001d\u00198Uvp\tuoQ\fk\u000f\u0013oX\u001d%r\u000e(GLk\u0013E7Mv";
        objectArray[17] = "6MW[e\fmPUkm<|H\u001eQ\u007f]7W\u0014k5[~P\u0010\u0006v^a\u0002nT3\r:@T\u0019eSi2Q\u001b`G9W\u0012\u0015n\u0003\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[18] = "$\u0003\u000f_Qz\u007f\u001e\rojJ/\u001bO\rE'l\u001eP_;1o\f\f\u001fZzp\u00066VW5dG\t\u0016[)m|\f\bB(k\u0011O\r]z\u0015BU\tBrpGZ\u0005_J";
    }

    private boolean R(Object object) {
        return this.K.V(object, new Object[0]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TransactionCoordinator.a = MultiContainerRegistry.a(2914670737579152657L, 4586979027596150294L, MethodHandles.lookup().lookupClass()).a(23005907418573L);
                TransactionCoordinator.e = new Object[19];
                TransactionCoordinator.f = new String[19];
                TransactionCoordinator.a();
                TransactionCoordinator.d = new HashMap<K, V>(13);
                var0 = TransactionCoordinator.a ^ 117656294795581L;
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
                var6_5 = " \u00ef4\u00c4\u00dd\u008f\u00e1\u00ea\u008d%\u0002\u00a2\u00e0\u00beL#\u00f6z\u00f9 \u00a8\u00a0\u0006\u0014\u00ea\u00d7n\u0007\u009b\u0012\u00eeT\\\u0012g`\\\u00ed0\u00b1\u00f3<\u00e1\u00bf\u0098\u00d5\u00aa\u00f4";
                var7_6 = " \u00ef4\u00c4\u00dd\u008f\u00e1\u00ea\u008d%\u0002\u00a2\u00e0\u00beL#\u00f6z\u00f9 \u00a8\u00a0\u0006\u0014\u00ea\u00d7n\u0007\u009b\u0012\u00eeT\\\u0012g`\\\u00ed0\u00b1\u00f3<\u00e1\u00bf\u0098\u00d5\u00aa\u00f4".length();
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
                    var6_5 = "{\u00b8WOH\u008d\u008e_\u001c#F\u00d7\u0088ma\u0005";
                    var7_6 = "{\u00b8WOH\u008d\u008e_\u001c#F\u00d7\u0088ma\u0005".length();
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
        TransactionCoordinator.b = var8_3;
        TransactionCoordinator.c = new Integer[8];
    }

    private boolean j(Object object) {
        return this.L.R(object);
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

    private Object J(Object object) {
        return this.Z.Z(object);
    }

    private static int e(long l, long l2) {
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
                n3 = 23;
                break;
            }
            case 1: {
                n3 = 26;
                break;
            }
            case 2: {
                n3 = 60;
                break;
            }
            case 3: {
                n3 = 18;
                break;
            }
            case 4: {
                n3 = 2;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 35;
                break;
            }
            case 7: {
                n3 = 62;
                break;
            }
            case 8: {
                n3 = 44;
                break;
            }
            case 9: {
                n3 = 12;
                break;
            }
            case 10: {
                n3 = 37;
                break;
            }
            case 11: {
                n3 = 31;
                break;
            }
            case 12: {
                n3 = 14;
                break;
            }
            case 13: {
                n3 = 36;
                break;
            }
            case 14: {
                n3 = 30;
                break;
            }
            case 15: {
                n3 = 43;
                break;
            }
            case 16: {
                n3 = 46;
                break;
            }
            case 17: {
                n3 = 24;
                break;
            }
            case 18: {
                n3 = 49;
                break;
            }
            case 19: {
                n3 = 0;
                break;
            }
            case 20: {
                n3 = 3;
                break;
            }
            case 21: {
                n3 = 53;
                break;
            }
            case 22: {
                n3 = 8;
                break;
            }
            case 23: {
                n3 = 16;
                break;
            }
            case 24: {
                n3 = 47;
                break;
            }
            case 25: {
                n3 = 15;
                break;
            }
            case 26: {
                n3 = 27;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 61;
                break;
            }
            case 29: {
                n3 = 50;
                break;
            }
            case 30: {
                n3 = 6;
                break;
            }
            case 31: {
                n3 = 21;
                break;
            }
            case 32: {
                n3 = 41;
                break;
            }
            case 33: {
                n3 = 48;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 7;
                break;
            }
            case 36: {
                n3 = 59;
                break;
            }
            case 37: {
                n3 = 20;
                break;
            }
            case 38: {
                n3 = 32;
                break;
            }
            case 39: {
                n3 = 1;
                break;
            }
            case 40: {
                n3 = 58;
                break;
            }
            case 41: {
                n3 = 51;
                break;
            }
            case 42: {
                n3 = 13;
                break;
            }
            case 43: {
                n3 = 39;
                break;
            }
            case 44: {
                n3 = 56;
                break;
            }
            case 45: {
                n3 = 25;
                break;
            }
            case 46: {
                n3 = 42;
                break;
            }
            case 47: {
                n3 = 45;
                break;
            }
            case 48: {
                n3 = 54;
                break;
            }
            case 49: {
                n3 = 4;
                break;
            }
            case 50: {
                n3 = 17;
                break;
            }
            case 51: {
                n3 = 55;
                break;
            }
            case 52: {
                n3 = 34;
                break;
            }
            case 53: {
                n3 = 33;
                break;
            }
            case 54: {
                n3 = 5;
                break;
            }
            case 55: {
                n3 = 19;
                break;
            }
            case 56: {
                n3 = 9;
                break;
            }
            case 57: {
                n3 = 52;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 29;
                break;
            }
            case 60: {
                n3 = 40;
                break;
            }
            case 61: {
                n3 = 28;
                break;
            }
            case 62: {
                n3 = 63;
                break;
            }
            default: {
                n3 = 57;
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
        TransactionCoordinator.f[n4] = new String(cArray);
        return n4;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransactionCoordinator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'N' || c == 'S' || c == 'r' || c == 'I') {
                field = TransactionCoordinator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'N' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransactionCoordinator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TransactionCoordinator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static boolean Z(TransactionCoordinator transactionCoordinator, Object object) {
        return transactionCoordinator.j(object);
    }

    static void s(TransactionCoordinator transactionCoordinator, Object object, Object object2) {
        transactionCoordinator.F(object, object2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransactionCoordinator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(TransactionCoordinator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

