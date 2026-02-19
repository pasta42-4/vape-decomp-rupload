/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package com.config.dynamic;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.google.common.collect.ImmutableList;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.util.ContextualReflectionUtility;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DynamicConfigurationResolver
extends CryptoProtocolEngine {
    private static final Integer[] n;
    private ReflectionUtilityService y;
    private static final String[] u;
    private ReflectionUtilityService a;
    private ReflectionUtilityService d;
    private static AbstractComputationKernel[] k;
    private ReflectionUtilityService V;
    private ReflectionUtilityService b;
    private static final long[] i;
    private HK T;
    private static final Map q;
    private ReflectionUtilityService f;
    private ReflectionUtilityService B;
    private ReflectionUtilityService o;
    private ReflectionUtilityService D;
    private ReflectionUtilityService I;
    private final HK Y;
    private HK L;
    private ReflectionUtilityService s;
    private HK j;
    private static final long g;
    private ReflectionUtilityService H;
    private HK w;
    private ReflectionUtilityService h;
    private ReflectionUtilityService N;
    private ReflectionUtilityService R;
    private ReflectionUtilityService c;
    private HK t;
    private ReflectionUtilityService m;
    private ReflectionUtilityService G;
    private ReflectionUtilityService p;
    private static final Object[] r;
    private HK e;

    static int H(DynamicConfigurationResolver dynamicConfigurationResolver, Object object) {
        return dynamicConfigurationResolver.x(object);
    }

    public Object t() {
        return this.B.Z(null);
    }

    private Object v() {
        return this.m.Z(null);
    }

    private String M(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return (String)this.d.Z(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicConfigurationResolver.a(customSystemException);
        }
        return (String)this.e.T(object, new Object[0]);
    }

    private Object b(String string) {
        return this.t.T(null, string);
    }

    public Object s() {
        return this.H.Z(null);
    }

    static int p(DynamicConfigurationResolver dynamicConfigurationResolver, Object object) {
        return dynamicConfigurationResolver.z(object);
    }

    static Object c(DynamicConfigurationResolver dynamicConfigurationResolver) {
        return dynamicConfigurationResolver.j();
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicConfigurationResolver.e(l, l2);
            object = r[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicConfigurationResolver.r[n] = clazz = Class.forName(u[n]);
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
            if (c == 'f' || c == 'P' || c == 'K' || c == '\u00fc') {
                field = DynamicConfigurationResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicConfigurationResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'C' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00df' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/m3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicConfigurationResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private Object C() {
        return this.a.Z(null);
    }

    static int N(DynamicConfigurationResolver dynamicConfigurationResolver, Object object) {
        return dynamicConfigurationResolver.L(object);
    }

    private Object z() {
        return this.s.Z(null);
    }

    static String r(DynamicConfigurationResolver dynamicConfigurationResolver, Object object) {
        return dynamicConfigurationResolver.M(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static void a() {
        Object[] objectArray = r;
        r[0] = "\u0014P@\r";
        objectArray[1] = "\u000b~sMnZ\u0000qb\u0002\u0003Z\u0000lv";
        objectArray[2] = ">\u001d1VZ\u00145\u0012 \u0019'\f&\u0015)P";
        objectArray[3] = Boolean.TYPE;
        DynamicConfigurationResolver.u[3] = "java/lang/Boolean";
        objectArray[4] = "(ZX\n";
        objectArray[5] = "\u001f\u0010sh\u0002bj0xg\u0013-\u00070xz\u00078";
        objectArray[6] = "hXFI";
        objectArray[7] = "x::'_v\r\u001a1(N9`\u001a15Z,";
        objectArray[8] = "(hh|>']Hcs/h0Hcn;}";
        objectArray[9] = "G \u001b";
        objectArray[10] = Integer.TYPE;
        DynamicConfigurationResolver.u[10] = "java/lang/Integer";
        objectArray[11] = ")!0lL]\\\u0001;c]\u00121\u0001;~I\u0007";
        objectArray[12] = "%_\u0000\u001e\u0012\f.P\u0011Qs\u0002%[\u0015\u000b";
        objectArray[13] = "IFx\u000f\b$\u001dNs2kC\u0004G'\rU9\u0018E`2\b<\u001eT`\n\f(\u0016U\u001c\b],@O\u007f\u000f\u0000>\u0014>`K\n|\u001cD|IMCBLrI]|ASv\u00021";
        objectArray[14] = "\u0010d\u0018v\u0014*Dl\u0013KjM\u0018c\u001a!Qu\u001cw\u0012 -wMsD:Np\u0010a\u0010KQ4\u001a#\u00181M6]\u001cLsI C\"\u0017q])! \u0000(\u0013v\u001au\u0004)NM";
        objectArray[15] = "ag \\N{5o+a:\u001c,f\u007f^\u0013f0d8aNc6u8YJw>tD[\u001bshn'\\Fa<\u001f8\u0018L#4e$\u001a\u000b\u001c`' \f\u0015\";%4\u0005w ,|zZLu(}'a";
        objectArray[16] = "hz\"N\u0006P<r)sd7`} \u0019C\u000fdi(\u0018?\r5m~\u0002\\\nh\u007f*sCNb=\"\t_L%\u0002|\u0001QL5=\u007f\u001eU\u0007Y";
        objectArray[17] = "\u001aEZ\u0017G|NMQ*\u001a\u001bWD\u0005\u0015\u001aaKFB*GdMWB\u0012CpEV>\u0010\u0012t\u0013L]\u0017OfG=BSE$OG^Q\u0002\u001b\u001b\u0005ZG\u001c%@\u0007NN~'W^\u0000\u0011ErS_]*";
        objectArray[18] = "TM*>\u001d.\u0000E!\u0003iI\\J(iXqX^ h$s\tZvrGtTH\"\u0003X0^\n*yD2\u00195tqJ2\t\nwnNye";
        objectArray[19] = "7jSd2:cbXYV]?mQ3we;yY2\u000bgj}\u000f(h`7o[Yw$=-S#k&z\u0012\u0007ao0d,\\c{9\u0006.K:5f={O;h]";
        objectArray[20] = "\u0001Qd~01\u0005\u00199nJ7D`69(:CYdxqg?Yvc  \u0007]bk!\\";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "Vd!\u0014{>\u0002l*)\u0013Y\u001be~\u0016&#\u0007g9){&\u0001v9\u0011\u007f2\twE\u0013.6_m&\u0014s$\u000b\u001c9Pyf\u0003f%R>Y]n+R.f^q/\u0019B";
    }

    private Object I() {
        return this.D.Z(null);
    }

    static Object a(DynamicConfigurationResolver dynamicConfigurationResolver, int n) {
        return dynamicConfigurationResolver.N(n);
    }

    public void E(Object object, Object object2, Object object3, int n) {
        try {
            if (GeometryCalculator.C() >= 50) {
                this.Y.l(object, object3);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicConfigurationResolver.a(customSystemException);
        }
        this.Y.l(object, object2, object3, n);
    }

    static Object[] c(DynamicConfigurationResolver dynamicConfigurationResolver) {
        return dynamicConfigurationResolver.e();
    }

    private int z(Object object) {
        return this.L.R(object, new Object[0]);
    }

    private Object[] e() {
        return this.f.t(null);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (u[n4] != null) {
            return n4;
        }
        Object object = r[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 27;
                break;
            }
            case 1: {
                n3 = 25;
                break;
            }
            case 2: {
                n3 = 61;
                break;
            }
            case 3: {
                n3 = 47;
                break;
            }
            case 4: {
                n3 = 44;
                break;
            }
            case 5: {
                n3 = 14;
                break;
            }
            case 6: {
                n3 = 40;
                break;
            }
            case 7: {
                n3 = 30;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 50;
                break;
            }
            case 10: {
                n3 = 55;
                break;
            }
            case 11: {
                n3 = 19;
                break;
            }
            case 12: {
                n3 = 21;
                break;
            }
            case 13: {
                n3 = 49;
                break;
            }
            case 14: {
                n3 = 52;
                break;
            }
            case 15: {
                n3 = 9;
                break;
            }
            case 16: {
                n3 = 37;
                break;
            }
            case 17: {
                n3 = 62;
                break;
            }
            case 18: {
                n3 = 2;
                break;
            }
            case 19: {
                n3 = 39;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 11;
                break;
            }
            case 22: {
                n3 = 56;
                break;
            }
            case 23: {
                n3 = 8;
                break;
            }
            case 24: {
                n3 = 13;
                break;
            }
            case 25: {
                n3 = 12;
                break;
            }
            case 26: {
                n3 = 58;
                break;
            }
            case 27: {
                n3 = 18;
                break;
            }
            case 28: {
                n3 = 45;
                break;
            }
            case 29: {
                n3 = 38;
                break;
            }
            case 30: {
                n3 = 15;
                break;
            }
            case 31: {
                n3 = 32;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 16;
                break;
            }
            case 34: {
                n3 = 22;
                break;
            }
            case 35: {
                n3 = 63;
                break;
            }
            case 36: {
                n3 = 4;
                break;
            }
            case 37: {
                n3 = 24;
                break;
            }
            case 38: {
                n3 = 17;
                break;
            }
            case 39: {
                n3 = 59;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 5;
                break;
            }
            case 42: {
                n3 = 6;
                break;
            }
            case 43: {
                n3 = 3;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 7;
                break;
            }
            case 46: {
                n3 = 34;
                break;
            }
            case 47: {
                n3 = 33;
                break;
            }
            case 48: {
                n3 = 53;
                break;
            }
            case 49: {
                n3 = 57;
                break;
            }
            case 50: {
                n3 = 31;
                break;
            }
            case 51: {
                n3 = 28;
                break;
            }
            case 52: {
                n3 = 60;
                break;
            }
            case 53: {
                n3 = 10;
                break;
            }
            case 54: {
                n3 = 0;
                break;
            }
            case 55: {
                n3 = 36;
                break;
            }
            case 56: {
                n3 = 26;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 42;
                break;
            }
            case 59: {
                n3 = 54;
                break;
            }
            case 60: {
                n3 = 1;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 43;
                break;
            }
            default: {
                n3 = 23;
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
        DynamicConfigurationResolver.u[n4] = new String(cArray);
        return n4;
    }

    private Object N(int n) {
        return this.j.T(null, n);
    }

    private Object m() {
        return this.R.Z(null);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/m3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object J() {
        return this.h.Z(null);
    }

    public boolean a(Object object) {
        return this.y.R(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A43;
        if (DynamicConfigurationResolver.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/m3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicConfigurationResolver.n[n2] = n3;
        }
        return DynamicConfigurationResolver.n[n2];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicConfigurationResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicConfigurationResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicConfigurationResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private int x(Object object) {
        return this.T.R(null, object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private Object F() {
        return this.b.Z(null);
    }

    /*
     * Unable to fully structure code
     */
    public DynamicConfigurationResolver() {
        block38: {
            block37: {
                block35: {
                    block34: {
                        block30: {
                            block33: {
                                block32: {
                                    block31: {
                                        var1_1 = DynamicConfigurationResolver.g ^ 131484835915674L;
                                        v0 = DynamicConfigurationResolver.K();
                                        super(ReflectionMetadataResolver.rY);
                                        var3_2 = v0;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var3_2 != null) break block30;
                                                        if (GeometryCalculator.C() >= 23) {
                                                        }
                                                        ** GOTO lbl61
                                                    }
                                                    catch (CustomSystemException v1) {
                                                        throw DynamicConfigurationResolver.a(v1);
                                                    }
                                                    v2 = GeometryCalculator.C();
                                                    v3 = 35;
                                                    if (var3_2 != null) break block31;
                                                }
                                                catch (CustomSystemException v4) {
                                                    throw DynamicConfigurationResolver.a(v4);
                                                }
                                                if (v2 >= v3) {
                                                }
                                                ** GOTO lbl53
                                            }
                                            catch (CustomSystemException v5) {
                                                throw DynamicConfigurationResolver.a(v5);
                                            }
                                            v2 = GeometryCalculator.C();
                                            v3 = 50;
                                        }
                                        catch (CustomSystemException v6) {
                                            throw DynamicConfigurationResolver.a(v6);
                                        }
                                    }
                                    try {
                                        try {
                                            if (v2 < v3) break block32;
                                            this.p = DynamicConfigurationResolver.c("C", (Object)this, (Object)ReflectionMetadataResolver.PA, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)11004, (long)(4398599154174726387L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bB, (long)-3438944198801429556L, (long)var1_1);
                                            if (var3_2 == null) break block33;
                                        }
                                        catch (CustomSystemException v7) {
                                            throw DynamicConfigurationResolver.a(v7);
                                        }
                                        AbstractComputationKernel.I(new String[1]);
                                    }
                                    catch (CustomSystemException v8) {
                                        throw DynamicConfigurationResolver.a(v8);
                                    }
                                }
                                this.p = DynamicConfigurationResolver.c("C", (Object)this, (Object)ReflectionMetadataResolver.bB, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)21227, (long)(4582055366455650548L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Fy, (long)-3438944198801429556L, (long)var1_1);
                                this.t = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)3054, (long)(5106324394152374756L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (Object)new Class[]{String.class}, (long)-3440190074909519916L, (long)var1_1);
                                this.T = DynamicConfigurationResolver.c("C", (Object)this, (Object)ReflectionMetadataResolver.tp, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)10600, (long)(8096443623292801900L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.tp}, (long)-3440348474310976003L, (long)var1_1);
                            }
                            try {
                                try {
                                    this.d = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)10998, (long)(8200880170994274534L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, String.class, (long)-3440437587683641839L, (long)var1_1);
                                    if (var3_2 == null) break block34;
lbl53:
                                    // 2 sources

                                    this.p = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)27577, (long)(335535140834365858L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.F3, (long)-3440306487824877913L, (long)var1_1);
                                    this.e = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)12116, (long)(7625785414939907409L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, String.class, (Object)new Class[0], (long)-3438885022404025791L, (long)var1_1);
                                    this.T = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)8605, (long)(8707026822507797379L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rY}, (long)-3440190074909519916L, (long)var1_1);
                                    this.j = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)7038, (long)(3352281133820092791L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (Object)new Class[]{Integer.TYPE}, (long)-3440190074909519916L, (long)var1_1);
                                    if (var3_2 == null) break block34;
                                }
                                catch (CustomSystemException v9) {
                                    throw DynamicConfigurationResolver.a(v9);
                                }
lbl61:
                                // 2 sources

                                this.D = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)31182, (long)(6303901176551916499L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.R = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)15381, (long)(8696541584522020375L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.G = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)18693, (long)(4870694676759147293L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.B = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)12621, (long)(1312540779377036101L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.N = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)27298, (long)(5841327604887802032L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.s = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)7926, (long)(5606425249861543160L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.m = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)32322, (long)(1448911650590704719L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.o = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)23771, (long)(5073983975871637194L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.a = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)15580, (long)(3132433261220169423L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.h = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)23120, (long)(7431548671996223568L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.H = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)16876, (long)(3186429601573403637L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.b = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)4793, (long)(8258333883392534706L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)-3440306487824877913L, (long)var1_1);
                                this.f = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)21907, (long)(5089105380362841989L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, ContextualReflectionUtility.S(ReflectionMetadataResolver.rY), (long)-3440306487824877913L, (long)var1_1);
                                this.I = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)7561, (long)(8976151762505377679L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-3440437587683641839L, (long)var1_1);
                            }
                            catch (CustomSystemException v10) {
                                throw DynamicConfigurationResolver.a(v10);
                            }
                        }
                        this.e = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)15166, (long)(8721326256906305855L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, String.class, (Object)new Class[0], (long)-3438885022404025791L, (long)var1_1);
                    }
                    try {
                        try {
                            v11 = GeometryCalculator.C();
                            v12 = 35;
                            if (var3_2 != null) break block35;
                            if (v11 >= v12) {
                            }
                            ** GOTO lbl115
                        }
                        catch (CustomSystemException v13) {
                            throw DynamicConfigurationResolver.a(v13);
                        }
                        v11 = GeometryCalculator.C();
                        v12 = 50;
                    }
                    catch (CustomSystemException v14) {
                        throw DynamicConfigurationResolver.a(v14);
                    }
                }
                try {
                    block36: {
                        try {
                            if (v11 < v12) break block36;
                            this.V = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)13487, (long)(7402550908325105320L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, List.class, (long)-3440437587683641839L, (long)var1_1);
                            if (var3_2 == null) break block37;
                        }
                        catch (CustomSystemException v15) {
                            throw DynamicConfigurationResolver.a(v15);
                        }
                    }
                    this.V = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)2282, (long)(3479361562755773168L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, ImmutableList.class, (long)-3440437587683641839L, (long)var1_1);
                }
                catch (CustomSystemException v16) {
                    throw DynamicConfigurationResolver.a(v16);
                }
            }
            try {
                this.Y = DynamicConfigurationResolver.c("C", (Object)this, (Object)ReflectionMetadataResolver.tp, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)20040, (long)(5818808229344015428L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Ut, ReflectionMetadataResolver.Y2, Integer.TYPE}, (long)-3438814232834761227L, (long)var1_1);
                this.c = DynamicConfigurationResolver.c("C", (Object)this, (Object)ReflectionMetadataResolver.Pj, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)10725, (long)(7329894197191939065L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-3440620152840482484L, (long)var1_1);
                if (var3_2 == null) break block38;
lbl115:
                // 2 sources

                this.y = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)54, (long)(8941133338731657761L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-3440437587683641839L, (long)var1_1);
                this.Y = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)6386, (long)(3756741067815527142L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Ut, ReflectionMetadataResolver.Y2, Integer.TYPE}, (long)-3438885022404025791L, (long)var1_1);
                this.w = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)6212, (long)(2314593670579757649L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)-3438885022404025791L, (long)var1_1);
                this.L = DynamicConfigurationResolver.c("C", (Object)this, (Object)DynamicConfigurationResolver.c("\u00df", (int)DynamicConfigurationResolver.b("n", (int)23700, (long)(7058572555197310615L ^ var1_1)), (long)-3440741017089922493L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)-3438885022404025791L, (long)var1_1);
            }
            catch (CustomSystemException v17) {
                throw DynamicConfigurationResolver.a(v17);
            }
        }
    }

    private boolean y(Object object) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.c.R(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicConfigurationResolver.a(customSystemException);
        }
        return this.w.V(object, new Object[0]);
    }

    private int L(Object object) {
        return this.I.R(object);
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

    public static void s(AbstractComputationKernel[] abstractComputationKernelArray) {
        k = abstractComputationKernelArray;
    }

    private static Field g(long l, long l2) {
        int n = DynamicConfigurationResolver.e(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            String string = u[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicConfigurationResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicConfigurationResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicConfigurationResolver.c(clazz3, string2, clazz2)) != null) {
                    DynamicConfigurationResolver.r[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicConfigurationResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicConfigurationResolver.r[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicConfigurationResolver.f(888643055892887L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private Object L() {
        return this.o.Z(null);
    }

    public List R(Object object) {
        return (List)this.V.Z(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DynamicConfigurationResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicConfigurationResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static AbstractComputationKernel[] K() {
        return k;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicConfigurationResolver.g = MultiContainerRegistry.a(3433790471862726777L, -1136627136766323640L, MethodHandles.lookup().lookupClass()).a(78925458144275L);
                DynamicConfigurationResolver.r = new Object[22];
                DynamicConfigurationResolver.u = new String[22];
                DynamicConfigurationResolver.a();
                DynamicConfigurationResolver.q = new HashMap<K, V>(13);
                DynamicConfigurationResolver.s(null);
                var0 = DynamicConfigurationResolver.g ^ 110025536877683L;
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
                var8_3 = new long[32];
                var5_4 = 0;
                var6_5 = "\u009a\u00eb\u009fk\u00ad/\u00cf\u0015\u00d9]\u001d\u00cb\u00e2\u0087\u00a4\u00aa\u009ckkG\u009d$\u00b7\u0098\u007f9\u00d6\u00dfO\fY\u00fb\u0010\u00fb\u0093\u00ff\u00bd\u00fdwm\u00a4\u00a4+\u0007-\u0011o\u00c5\u00cd{\u0081\u00ae\u0015|\u00bf%%\u0012\u0087\u00c1v\u001b\u00ed5\u0014\u00ba\f\u00d7\u0089\u00c1\u0012K\u0004\u00fd}\u00ca\u00b5\u00c0D8.qewu\n|\f\u009bo\u00142\u007fMe\u00e03\u00ddym\u00f5\u00d2\u00cf\u00df)RvXok\u00af\u00f7\u001d\u00be\u00e9\u00ba\b\u0086<\u00ab\\\u00f3b\u0014\u00d7u\u00d5\u000b\u00cd\u00aa;\u00fc\u00a9\u00b0.\u00c5>\u00e0\u00ce\u00f6&\u0002\u0091)\u0087\u0012I\u0094\u00dd*Q\u00ee\u00bd\u009e\u00dc\u0006\u00de\u00e7d\u00e8\u00a3\u00e4H\u00d3\u00b2\u009cR\u0092\u0000\u00bb24\u00ea\u0081\u0094\u000f8#0\u008d\u0096\u00ab$%\u00fe!D\u0010\u00f8\u00e0+X\u0001\u001fr\u0014L?\u00e4\u009f`k`b\u009f\ttJ\u00d9\u00d8\u00c4'\n{\u008e<\u00f2\u00e1Z\u0084\u00d5\u000e'\u0019\u001a\u00e3\u009b\u00a4;,epP\u0010e\u0002\u00f4S\u00af\u0082";
                var7_6 = "\u009a\u00eb\u009fk\u00ad/\u00cf\u0015\u00d9]\u001d\u00cb\u00e2\u0087\u00a4\u00aa\u009ckkG\u009d$\u00b7\u0098\u007f9\u00d6\u00dfO\fY\u00fb\u0010\u00fb\u0093\u00ff\u00bd\u00fdwm\u00a4\u00a4+\u0007-\u0011o\u00c5\u00cd{\u0081\u00ae\u0015|\u00bf%%\u0012\u0087\u00c1v\u001b\u00ed5\u0014\u00ba\f\u00d7\u0089\u00c1\u0012K\u0004\u00fd}\u00ca\u00b5\u00c0D8.qewu\n|\f\u009bo\u00142\u007fMe\u00e03\u00ddym\u00f5\u00d2\u00cf\u00df)RvXok\u00af\u00f7\u001d\u00be\u00e9\u00ba\b\u0086<\u00ab\\\u00f3b\u0014\u00d7u\u00d5\u000b\u00cd\u00aa;\u00fc\u00a9\u00b0.\u00c5>\u00e0\u00ce\u00f6&\u0002\u0091)\u0087\u0012I\u0094\u00dd*Q\u00ee\u00bd\u009e\u00dc\u0006\u00de\u00e7d\u00e8\u00a3\u00e4H\u00d3\u00b2\u009cR\u0092\u0000\u00bb24\u00ea\u0081\u0094\u000f8#0\u008d\u0096\u00ab$%\u00fe!D\u0010\u00f8\u00e0+X\u0001\u001fr\u0014L?\u00e4\u009f`k`b\u009f\ttJ\u00d9\u00d8\u00c4'\n{\u008e<\u00f2\u00e1Z\u0084\u00d5\u000e'\u0019\u001a\u00e3\u009b\u00a4;,epP\u0010e\u0002\u00f4S\u00af\u0082".length();
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
                    var6_5 = "u\u0081\u00eb\u00f0r6\u00bf\u00016d\u00a90\u008aj@U";
                    var7_6 = "u\u0081\u00eb\u00f0r6\u00bf\u00016d\u00a90\u008aj@U".length();
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
        DynamicConfigurationResolver.i = var8_3;
        DynamicConfigurationResolver.n = new Integer[32];
    }

    static boolean O(DynamicConfigurationResolver dynamicConfigurationResolver, Object object) {
        return dynamicConfigurationResolver.y(object);
    }

    private static Method h(long l, long l2) {
        int n = DynamicConfigurationResolver.e(l, l2);
        Object object = r[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = u[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicConfigurationResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicConfigurationResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicConfigurationResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicConfigurationResolver.r[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicConfigurationResolver.f(888643055892887L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicConfigurationResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicConfigurationResolver.r[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicConfigurationResolver.f(888643055892887L, 0L);
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

    private Object D() {
        return this.G.Z(null);
    }

    private Object O() {
        return this.N.Z(null);
    }

    private Object j() {
        return this.p.Z(null);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicConfigurationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DynamicConfigurationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

