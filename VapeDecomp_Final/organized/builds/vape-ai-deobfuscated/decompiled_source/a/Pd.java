/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
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

public class Pd
extends CryptoProtocolEngine {
    public ReflectionUtilityService j;
    private HK s;
    private HK A;
    private static final String[] g;
    private HK K;
    private static final Map e;
    public final ReflectionUtilityService u;
    public ReflectionUtilityService U;
    private static final long[] b;
    public HK D;
    private static final Integer[] d;
    public ReflectionUtilityService R;
    public final ReflectionUtilityService c;
    private HK Q;
    public ReflectionUtilityService h;
    public ReflectionUtilityService X;
    private static final long a;
    public final ReflectionUtilityService z;
    private static final Object[] f;

    private static Method h(long l, long l2) {
        int n = Pd.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = Pd.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = Pd.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Pd.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        Pd.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Pd.f(708613401323677L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = Pd.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        Pd.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Pd.f(708613401323677L, 0L);
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

    public Object S(Object object, Object object2, Object object3, Object object4) {
        return this.s.A(object, object2, object3, object4);
    }

    public Object f(Object object) {
        return this.z.Z(object);
    }

    public int m(Object object) {
        return this.U.R(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Pd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object Y(Object object) {
        return this.c.Z(object);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 6;
                break;
            }
            case 1: {
                n3 = 20;
                break;
            }
            case 2: {
                n3 = 46;
                break;
            }
            case 3: {
                n3 = 40;
                break;
            }
            case 4: {
                n3 = 31;
                break;
            }
            case 5: {
                n3 = 19;
                break;
            }
            case 6: {
                n3 = 41;
                break;
            }
            case 7: {
                n3 = 28;
                break;
            }
            case 8: {
                n3 = 26;
                break;
            }
            case 9: {
                n3 = 43;
                break;
            }
            case 10: {
                n3 = 16;
                break;
            }
            case 11: {
                n3 = 32;
                break;
            }
            case 12: {
                n3 = 22;
                break;
            }
            case 13: {
                n3 = 8;
                break;
            }
            case 14: {
                n3 = 3;
                break;
            }
            case 15: {
                n3 = 61;
                break;
            }
            case 16: {
                n3 = 36;
                break;
            }
            case 17: {
                n3 = 17;
                break;
            }
            case 18: {
                n3 = 53;
                break;
            }
            case 19: {
                n3 = 1;
                break;
            }
            case 20: {
                n3 = 9;
                break;
            }
            case 21: {
                n3 = 44;
                break;
            }
            case 22: {
                n3 = 25;
                break;
            }
            case 23: {
                n3 = 50;
                break;
            }
            case 24: {
                n3 = 13;
                break;
            }
            case 25: {
                n3 = 49;
                break;
            }
            case 26: {
                n3 = 57;
                break;
            }
            case 27: {
                n3 = 2;
                break;
            }
            case 28: {
                n3 = 39;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 30: {
                n3 = 60;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 38;
                break;
            }
            case 34: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 59;
                break;
            }
            case 36: {
                n3 = 21;
                break;
            }
            case 37: {
                n3 = 5;
                break;
            }
            case 38: {
                n3 = 52;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 34;
                break;
            }
            case 41: {
                n3 = 56;
                break;
            }
            case 42: {
                n3 = 30;
                break;
            }
            case 43: {
                n3 = 48;
                break;
            }
            case 44: {
                n3 = 18;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 51;
                break;
            }
            case 47: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 11;
                break;
            }
            case 49: {
                n3 = 10;
                break;
            }
            case 50: {
                n3 = 23;
                break;
            }
            case 51: {
                n3 = 47;
                break;
            }
            case 52: {
                n3 = 0;
                break;
            }
            case 53: {
                n3 = 14;
                break;
            }
            case 54: {
                n3 = 63;
                break;
            }
            case 55: {
                n3 = 12;
                break;
            }
            case 56: {
                n3 = 24;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 15;
                break;
            }
            case 59: {
                n3 = 4;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 58;
                break;
            }
            case 62: {
                n3 = 54;
                break;
            }
            default: {
                n3 = 29;
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
        Pd.g[n4] = new String(cArray);
        return n4;
    }

    public void Z(Object object, Object object2) {
        this.c.L(object, object2);
    }

    public int N(Object object) {
        return this.X.R(object);
    }

    public Object U(Object object, Object object2) {
        return this.K.A(object, object2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Pd.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                Pd.f[n] = clazz = Class.forName(g[n]);
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
    public Pd() {
        block28: {
            block27: {
                block26: {
                    block24: {
                        block22: {
                            var1_1 = Pd.a ^ 57362125374830L;
                            v0 = N9.I();
                            super(ReflectionMetadataResolver.Er);
                            var3_2 = v0;
                            try {
                                block23: {
                                    try {
                                        try {
                                            v1 = GeometryCalculator.C();
                                            v2 = 13;
                                            if (var3_2 == null) break block22;
                                            if (v1 != v2) break block23;
                                        }
                                        catch (CustomSystemException v3) {
                                            throw Pd.a(v3);
                                        }
                                        this.U = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)10609, (long)(5090804913565882084L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, Integer.TYPE, (long)7492333145174179846L, (long)var1_1);
                                        this.j = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)9509, (long)(5792591897630071481L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, Integer.TYPE, (long)7492333145174179846L, (long)var1_1);
                                        this.X = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)22389, (long)(2116446196019701997L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, Integer.TYPE, (long)7492333145174179846L, (long)var1_1);
                                        this.u = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)5762, (long)(8707718249908365585L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, Integer.TYPE, (long)7492333145174179846L, (long)var1_1);
                                        if (var3_2 != null) break block24;
                                    }
                                    catch (CustomSystemException v4) {
                                        throw Pd.a(v4);
                                    }
                                }
                                v1 = GeometryCalculator.C();
                                v2 = 35;
                            }
                            catch (CustomSystemException v5) {
                                throw Pd.a(v5);
                            }
                        }
                        try {
                            block25: {
                                try {
                                    if (v1 < v2) break block25;
                                    this.h = Pd.c("Q", (Object)this, (Object)ReflectionMetadataResolver.d, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)11569, (long)(6356291472749417128L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.P2, (long)7492504023700600804L, (long)var1_1);
                                    this.u = Pd.c("Q", (Object)this, (Object)ReflectionMetadataResolver.d, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)5023, (long)(9002359303621602309L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pb, (long)7492504023700600804L, (long)var1_1);
                                    if (var3_2 != null) break block24;
                                }
                                catch (CustomSystemException v6) {
                                    throw Pd.a(v6);
                                }
                            }
                            this.h = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)19409, (long)(879811337047258186L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.P2, (long)7492333145174179846L, (long)var1_1);
                            this.u = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)18645, (long)(4459840135270119255L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Pb, (long)7492333145174179846L, (long)var1_1);
                        }
                        catch (CustomSystemException v7) {
                            throw Pd.a(v7);
                        }
                    }
                    try {
                        try {
                            try {
                                v8 = GeometryCalculator.C();
                                v9 = 35;
                                if (var3_2 == null) break block26;
                                if (v8 < v9) {
                                }
                                ** GOTO lbl80
                            }
                            catch (CustomSystemException v10) {
                                throw Pd.a(v10);
                            }
                            this.z = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)7459, (long)(2210163050878165681L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (long)7492333145174179846L, (long)var1_1);
                            this.c = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)21407, (long)(7988581892301335552L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PE, (long)7492333145174179846L, (long)var1_1);
                            this.R = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)32547, (long)(273640085351366837L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.F9, (long)7492333145174179846L, (long)var1_1);
                            this.Q = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)31528, (long)(7064811905105429692L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.YN}, (long)7492735834115222846L, (long)var1_1);
                            if (var3_2 == null) break block27;
                        }
                        catch (CustomSystemException v11) {
                            throw Pd.a(v11);
                        }
                        v8 = GeometryCalculator.C();
                        v9 = 13;
                    }
                    catch (CustomSystemException v12) {
                        throw Pd.a(v12);
                    }
                }
                try {
                    if (v8 <= v9) break block28;
                    this.s = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)21424, (long)(8760056560049728558L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.F9, ReflectionMetadataResolver.YN, ReflectionMetadataResolver.Pb, ReflectionMetadataResolver.P2}, (long)7492735834115222846L, (long)var1_1);
                }
                catch (CustomSystemException v13) {
                    throw Pd.a(v13);
                }
            }
            try {
                if (var3_2 != null) break block28;
lbl80:
                // 2 sources

                this.z = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)30273, (long)(1623467388320614876L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (long)7492333145174179846L, (long)var1_1);
                this.c = Pd.c("Q", (Object)this, (Object)ReflectionMetadataResolver.PV, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)30066, (long)(5393247913723562725L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PE, (long)7492504023700600804L, (long)var1_1);
                this.D = Pd.c("Q", (Object)this, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)22047, (long)(6526807877416724878L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.F9, (Object)new Class[0], (long)7492735834115222846L, (long)var1_1);
                this.A = Pd.c("Q", (Object)this, (Object)ReflectionMetadataResolver.d, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)15784, (long)(7416523110568051256L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YN, ReflectionMetadataResolver.Pb, ReflectionMetadataResolver.P2, Boolean.TYPE}, (long)7492418913720088964L, (long)var1_1);
                this.K = Pd.c("Q", (Object)this, (Object)ReflectionMetadataResolver.PV, (Object)Pd.c("\u00f4", (int)Pd.b("e", (int)31086, (long)(5840959193170544365L ^ var1_1)), (long)7492565000819411886L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PE, ReflectionMetadataResolver.YN}, (long)7492418913720088964L, (long)var1_1);
            }
            catch (CustomSystemException v14) {
                throw Pd.a(v14);
            }
        }
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u0004oWX";
        objectArray[1] = " 0n\u001e\u0010W+?\u007fQmO88v\u0018";
        objectArray[2] = Boolean.TYPE;
        Pd.g[2] = "java/lang/Boolean";
        objectArray[3] = "\r N/&1\u0006/_`K1\u00062K";
        objectArray[4] = "n{\u0014s\u000b#\u001b[\u001f|\u001alv[\u001fa\u000ey";
        objectArray[5] = "vt#O";
        objectArray[6] = "n,-{3s\u001b\f&t\"<v\f&i6)";
        objectArray[7] = "1Wl";
        objectArray[8] = Integer.TYPE;
        Pd.g[8] = "java/lang/Integer";
        objectArray[9] = "k yr";
        objectArray[10] = "\u0003i\\A\u0005\u001b\bfM\u000ed\u0015\u0003mIT";
        objectArray[11] = "\u0015O\u001cAxL\u0007C\u0015*E4\u0003\u0000D[<P\u0007O\u0006*;K\u0015\u000eDLrUE\u0003y\u0010=T\u0004]A\u0015bZL?EG<\u000b\fB\u0017Fz\u000f|\u0004\u001fAzD\u0003SIR<4";
        objectArray[12] = ",\fL$P\u0013>\u0000EOgk\u007fCI7HSz\u001cG\u007f*\u0014zAXqN\u00105\u0003)vU\u0002tAO?KRy|\u0013pJ\u0013'D\u0016/D[E@Dq\u0015\u001b8\u0012E7\u0011k~\u001aB7Z\u0014)LQq*";
        objectArray[13] = "\u001a\u0003@~Q#\b\u000fI\u0015p[\fL\u0018d\u0015?\b\u0003Z\u0015\u0012$\u001aB\u0018s[:JO%/\u0014;\u000b\u0011\u001d*K5Cs\u001bzZk\u001f\u0015\u001e%\u001a's";
        objectArray[14] = "lf`q\u0011I2/lg-G+\u0016l{OJ1kl$\u0017VPin!\\\u00124m!c-";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "\u000f\u0019sW\u0004\u0003\u001d\u0015z</{\\VvD\u001cCY\tx\f~\u0004YTg\u0002\u001a\u0000\u0016\u0016\u0016\u0005\u0001\u0012WTpL\u001fBZi,\u0003\u001e\u0003\u0004Q)\\\u0010KfWyMN\u0017\u0000R&\r\u0002{";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = Pd.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Pd.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public int K(Object object) {
        return this.j.R(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Pd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object d(Object object, Object object2, Object object3, boolean bl) {
        return this.A.A(object, object2, object3, bl);
    }

    public int w(Object object) {
        return this.u.R(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = Pd.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Pd.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public Object x(Object object) {
        return this.u.Z(object);
    }

    private static Field g(long l, long l2) {
        int n = Pd.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = Pd.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Pd.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Pd.c(clazz3, string2, clazz2)) != null) {
                    Pd.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Pd.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Pd.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Pd.f(708613401323677L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Pd.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Pd.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static Object a(Pd pd, Object object) {
        return pd.b(object);
    }

    public Object T(Object object, Object object2) {
        return this.Q.A(object, object2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Pd.a = MultiContainerRegistry.a(4383589594317161094L, -5830728548417434282L, MethodHandles.lookup().lookupClass()).a(83929568841742L);
                Pd.f = new Object[16];
                Pd.g = new String[16];
                Pd.a();
                Pd.e = new HashMap<K, V>(13);
                var0 = Pd.a ^ 139516613870553L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "/{*\u009c\u00d9wa\u00e3\u00ea~\u00ae\u00ba\u009c@\u00c0\u0085\\\u00a1\u00cf\u00f1kY\u00a7\n\u0017\u00ca\u008ak\u008e'\u009cs\u008f\u00bfmNd\u0016.\u0014\u00b5a\u0093\u00e4\u00d7\u00fda\u00f11>u{\u00dc\u00e0\u00a4\u0014\u00fe\u0017\u00e9\u00ca\u00d2NY\u00ac\u00f1Y\u0089e\u0015\u00fa?\u00f8m\u0019\u00f71B\u00bakM/\u00db\u0002\u0093\u0019\u00cf|\tXP\\\u00feN\u00d9\u00ba*\u00b9d\u0084=[\u00d7x\u009c\u0018\u00f0e\u0084\u00ea\u00f8\u0098hW\u001c\rt|\u00fc\u00d7Bb\u00d0\u00ffYj\u00910\u0004";
                var7_6 = "/{*\u009c\u00d9wa\u00e3\u00ea~\u00ae\u00ba\u009c@\u00c0\u0085\\\u00a1\u00cf\u00f1kY\u00a7\n\u0017\u00ca\u008ak\u008e'\u009cs\u008f\u00bfmNd\u0016.\u0014\u00b5a\u0093\u00e4\u00d7\u00fda\u00f11>u{\u00dc\u00e0\u00a4\u0014\u00fe\u0017\u00e9\u00ca\u00d2NY\u00ac\u00f1Y\u0089e\u0015\u00fa?\u00f8m\u0019\u00f71B\u00bakM/\u00db\u0002\u0093\u0019\u00cf|\tXP\\\u00feN\u00d9\u00ba*\u00b9d\u0084=[\u00d7x\u009c\u0018\u00f0e\u0084\u00ea\u00f8\u0098hW\u001c\rt|\u00fc\u00d7Bb\u00d0\u00ffYj\u00910\u0004".length();
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
                    var6_5 = "P+\u0098'%[\u0007\u0002\u00ecb\u00faQ\u0017%\u00fdk";
                    var7_6 = "P+\u0098'%[\u0007\u0002\u00ecb\u00faQ\u0017%\u00fdk".length();
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
        Pd.b = var8_3;
        Pd.d = new Integer[18];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f6' || c == '\u00e2' || c == '\u00da' || c == '\u00aa') {
                field = Pd.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Pd.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private Object b(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.D.T(object, new Object[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Pd.a(customSystemException);
        }
        return this.R.Z(object);
    }

    public Object Z(Object object) {
        return this.h.Z(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x186B;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Pd", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Pd.d[n2] = n3;
        }
        return d[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Pd.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Pd.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

