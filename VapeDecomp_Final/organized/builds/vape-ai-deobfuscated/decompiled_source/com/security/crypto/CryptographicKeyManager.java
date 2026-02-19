/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CryptographicKeyManager
extends CryptoProtocolEngine {
    private final ReflectionUtilityService M;
    private final ReflectionUtilityService q;
    private final ReflectionUtilityService O;
    private final ReflectionUtilityService k;
    private final ReflectionUtilityService p;
    private final ReflectionUtilityService z;
    private final ReflectionUtilityService j;
    private final ReflectionUtilityService v;
    private final ReflectionUtilityService K;
    private final ReflectionUtilityService P;
    private static final long[] r;
    private final ReflectionUtilityService E;
    private final ReflectionUtilityService o;
    private final ReflectionUtilityService u;
    private final ReflectionUtilityService R;
    private final ReflectionUtilityService A;
    private static final Integer[] w;
    private final ReflectionUtilityService J;
    private final ReflectionUtilityService Q;
    private final ReflectionUtilityService s;
    private final ReflectionUtilityService W;
    private final ReflectionUtilityService Y;
    private static final Map B;
    private final ReflectionUtilityService h;
    private static String N;
    private final ReflectionUtilityService T;
    private final ReflectionUtilityService y;
    private final ReflectionUtilityService m;
    private static final String[] F;
    private final ReflectionUtilityService e;
    private final ReflectionUtilityService f;
    private final ReflectionUtilityService S;
    private final ReflectionUtilityService Z;
    private final ReflectionUtilityService a;
    private final ReflectionUtilityService X;
    private final ReflectionUtilityService D;
    private final ReflectionUtilityService d;
    private final ReflectionUtilityService I;
    private final ReflectionUtilityService n;
    private final ReflectionUtilityService H;
    private final ReflectionUtilityService b;
    private final ReflectionUtilityService c;
    private static final Object[] C;
    private final ReflectionUtilityService t;
    private static final long g;
    private final ReflectionUtilityService U;
    private final ReflectionUtilityService i;

    public Object s() {
        return this.D.Z(null);
    }

    public Object D() {
        return this.O.Z(null);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicKeyManager.e(l, l2);
            object = C[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicKeyManager.C[n] = clazz = Class.forName(F[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public Object v() {
        return this.H.Z(null);
    }

    public Object n() {
        return this.Q.Z(null);
    }

    public Object m() {
        return this.a.Z(null);
    }

    public Object O() {
        return this.S.Z(null);
    }

    public Object Y() {
        return this.z.Z(null);
    }

    public Object h() {
        return this.v.Z(null);
    }

    public static void c(String string) {
        N = string;
    }

    public Object x() {
        return this.Y.Z(null);
    }

    private static Method h(long l, long l2) {
        int n = CryptographicKeyManager.e(l, l2);
        Object object = C[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = F[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicKeyManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicKeyManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicKeyManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicKeyManager.C[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicKeyManager.f(544577317971873L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicKeyManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicKeyManager.C[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicKeyManager.f(544577317971873L, 0L);
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
        Field field = CryptographicKeyManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicKeyManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public Object w() {
        return this.K.Z(null);
    }

    private static void a() {
        Object[] objectArray = C;
        C[0] = "u\b\"";
        objectArray[1] = Integer.TYPE;
        CryptographicKeyManager.F[1] = "java/lang/Integer";
        objectArray[2] = "\u001c[\t8mt\u0017T\u0018w\u0010l\u0004S\u0011>";
        objectArray[3] = "\u0001x-?";
        objectArray[4] = Boolean.TYPE;
        CryptographicKeyManager.F[4] = "java/lang/Boolean";
        objectArray[5] = "<\u00146\u001cUV7\u001b'S8V7\u00063";
        objectArray[6] = "%\u0016z_";
        objectArray[7] = "+\u001dRU\t\u0015 \u0012C\u001ah\u001b+\u0019G@";
        objectArray[8] = ",1o0,Nse,\"Oa\u00167+&=\u0011/k>,t,-1c rPu4i4O\u0010*d89r\\f>o^sTseo$&MlkR";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "6IC\u000fn\u0001{B\u0017}=A\u0006\u0017A\u001a)PhEKA*:?W\u0002\u000fk\u0003cB\bFV";
    }

    public Object V() {
        return this.M.Z(null);
    }

    public static String q() {
        return N;
    }

    public Object X() {
        return this.U.Z(null);
    }

    public Object b() {
        return this.d.Z(null);
    }

    public Object L() {
        return this.I.Z(null);
    }

    public Object N() {
        return this.e.Z(null);
    }

    public Object j() {
        return this.o.Z(null);
    }

    public Object z() {
        return this.t.Z(null);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'z' || c == 'R' || c == 'y' || c == 'p') {
                field = CryptographicKeyManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicKeyManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'g' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public Object F() {
        return this.X.Z(null);
    }

    public Object d() {
        return this.h.Z(null);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicKeyManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public Object R() {
        return this.c.Z(null);
    }

    public Object e() {
        return this.i.Z(null);
    }

    public Object o() {
        return this.R.Z(null);
    }

    public Object U() {
        return this.k.Z(null);
    }

    public CryptographicKeyManager() {
        long l = g ^ 0x34316F74EF48L;
        super(ReflectionMetadataResolver.u);
        this.Y = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)1402, (long)(0x29C7E9A859FFFB5DL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.Q = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)31958, (long)(0x54E05353ADA602F0L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.c = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)16440, (long)(0x27ED417B04B4BE10L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.M = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)76, (long)(0x52A8852C5A6DFE41L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.R = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)24130, (long)(0x3398BE52F62D2077L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.Z = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)3032, (long)(0x51C74A36643275EEL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.I = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)25259, (long)(0x3A0050B3E3501C8AL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.D = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)6335, (long)(0x6597BBCEF5206681L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.m = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)8328, (long)(0x50F3F76C7C8ADE80L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.a = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)26385, (long)(0x5BC5FA3093839932L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.P = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)29983, (long)(0x6DFD5DE8DDBE8B25L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.e = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)12524, (long)(0x7EC0136AFAE7CEC0L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.z = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)30405, (long)(0x78B8817E76F088E0L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.i = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)8492, (long)(0x740386C751DDDF05L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.p = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)29174, (long)(0x7C936C4AC6B78FF9L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.j = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)18888, (long)(0x2F6349F6DA137E5L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.h = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)13965, (long)(0x576423B2BC0648B6L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.v = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)30774, (long)(0x7F6E00825B5A8609L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.f = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)10697, (long)(0x573671CECE5157C0L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.X = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)15390, (long)(0x5A9D7D2F79EF4210L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.s = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)15426, (long)(0x507A92B71B7C426CL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.U = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)28237, (long)(0x7B84A0608964107FL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.H = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)5946, (long)(0x63B52B60E705E91AL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.J = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)19566, (long)(0x3F637E94E279B265L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.y = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)11889, (long)(0x4407BE76D55CD05EL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.W = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)12687, (long)(0x60563257AFE5CFB2L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.E = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)16522, (long)(0x206C2D47E7523EBEL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.t = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)22764, (long)(0x765E3E422B2F26DBL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.O = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)15536, (long)(0xAD54FEFEEDD429BL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.b = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)19627, (long)(0x187055B3AEFC328FL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.q = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)22756, (long)(0xA4F518CCCF926E8L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.S = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)27074, (long)(0x12A750890FB517F2L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.A = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)22672, (long)(0x5DBC827251F0A6BAL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.d = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)29187, (long)(0x704666009AB90C3FL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.T = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)3752, (long)(0x61AC5A60A3CAF090L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        this.n = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)19253, (long)(0x6FB2D6880661B506L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
        String string = CryptographicKeyManager.q();
        try {
            this.K = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)5596, (long)(0x287C8A3FEC7BEBD6L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
            this.u = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)6333, (long)(0x8929C61C318669FL ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
            this.o = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)27593, (long)(0x463A19EBE69095F8L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
            this.k = CryptographicKeyManager.c("\u00d3", (Object)this, (Object)CryptographicKeyManager.c("g", (int)CryptographicKeyManager.b("d", (int)26492, (long)(0x5779885581EC1945L ^ l)), (long)-6349774496064983548L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rO, (long)-6349673243059872713L, (long)l);
            if (string == null) {
                AbstractComputationKernel.I(new String[2]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager.a(customSystemException);
        }
    }

    public Object q() {
        return this.s.Z(null);
    }

    public Object E() {
        return this.W.Z(null);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicKeyManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicKeyManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x59C9;
        if (w[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = r[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])B.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/lq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicKeyManager.w[n2] = n3;
        }
        return w[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public Object Q() {
        return this.Z.Z(null);
    }

    public Object I() {
        return this.m.Z(null);
    }

    public Object Z() {
        return this.f.Z(null);
    }

    private static Field g(long l, long l2) {
        int n = CryptographicKeyManager.e(l, l2);
        Object object = C[n];
        if (object instanceof String) {
            String string = F[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicKeyManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicKeyManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicKeyManager.c(clazz3, string2, clazz2)) != null) {
                    CryptographicKeyManager.C[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicKeyManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicKeyManager.C[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicKeyManager.f(544577317971873L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    public Object C() {
        return this.T.Z(null);
    }

    public Object J() {
        return this.J.Z(null);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public Object H() {
        return this.n.Z(null);
    }

    public Object K() {
        return this.u.Z(null);
    }

    public Object f() {
        return this.A.Z(null);
    }

    public Object y() {
        return this.P.Z(null);
    }

    public Object G() {
        return this.E.Z(null);
    }

    public Object i() {
        return this.b.Z(null);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicKeyManager.g = MultiContainerRegistry.a(-2908970337019667346L, -384876457356767927L, MethodHandles.lookup().lookupClass()).a(267732039636905L);
                CryptographicKeyManager.C = new Object[10];
                CryptographicKeyManager.F = new String[10];
                CryptographicKeyManager.a();
                CryptographicKeyManager.B = new HashMap<K, V>(13);
                var0 = CryptographicKeyManager.g ^ 57194194594611L;
                CryptographicKeyManager.c("DRXPFc");
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
                var8_3 = new long[40];
                var5_4 = 0;
                var6_5 = "\u00a2r\u00c5N\u0015d\b\u001d\rZf\u00ac\u0098\u0099Bh\u00d5}\u00e0\u00b3$\u0004%\u001b\u00f9h%D\u00beA\u00e6wb\u00f8\u00b37\u001al{\u00cdj\u00a57t\r\u00f0;MH\u00d9\u00e2\u00db\u0098\u00ad\u00ce\rb\u00f4=t\u0018\u00fc'\u00bd\u00c0Z\u00bf\u0003\u00f7\u00ce\u009b\u00bbi{\u00e6E`\u00b7~\u00d3\u0083\u00e8\u009e\u00dd\u0090\u00b6t\u00e7h\u0085\u00bb\u00e0\u00fc\u001f\u00a10\u00af\u001b\u00f8\u00ba\u00ad\u00b1\u0014\u00b2e\u00b5\u00db)P\n!\u00f21K\u0002\u008c\u00a3\u00a2\u00d6\u00e4\u00bd\u0093\u0005\u00cfx\u00a5\u00c0N\u009d\u00ae\u00c6\u00b4T0\u0016S\u00c8\u00baR\u00dc\u00cbN\u00cb(\u0005\u0014\u00a7ip\u00b9\u0090\u00f2\u00e0\u00dc\u008c\u00db^\u001a\u00d1\u00fc\u00d5\u00db\u001bdI\u00d8\u00f9\u009e\u0085\u009c\u00c6\u0003R\u00e0\u0006\u009c\u00a5\u001b~\u00f3$\u00be:\u00c4\br\u00f4\u00d8\"\u0099\u0094_\u00e7,\u00a8\u00e3\u00ba!\u00ce\u008d{\u00ff\"u\u00b8!&R\u0006?\u00d8g\u00fa\u00bb\u00f0;S\u00a4\u00df\u00b0\u00f7q\u001a\u0002\u0018W\u00cd\u00c6\u0001\u00d7\u008e\u00bd\u00c7\u00ff\u00ceD\u00c0\u0000\u0089T-Y\u00e5\u00c0\u00ea\u0001\u00fa\u00fbw\n\u00ab\u0082\u0099\u0003\u00db\u00c7\u0085\u0096'\u00ce\u00baf\u00f8NIL;y\u0087*(o\u00b8\u00fa\u0091\u00d4F>\u00f0\u00ad\u0006MG\u00c6_\u00bc\u00ae\u009d\u00e3U\u00ea\u00fd\u00e2\u00f0\u00db\u00db9\u00f1\u009f)\u0003\u00fe\u00e2p";
                var7_6 = "\u00a2r\u00c5N\u0015d\b\u001d\rZf\u00ac\u0098\u0099Bh\u00d5}\u00e0\u00b3$\u0004%\u001b\u00f9h%D\u00beA\u00e6wb\u00f8\u00b37\u001al{\u00cdj\u00a57t\r\u00f0;MH\u00d9\u00e2\u00db\u0098\u00ad\u00ce\rb\u00f4=t\u0018\u00fc'\u00bd\u00c0Z\u00bf\u0003\u00f7\u00ce\u009b\u00bbi{\u00e6E`\u00b7~\u00d3\u0083\u00e8\u009e\u00dd\u0090\u00b6t\u00e7h\u0085\u00bb\u00e0\u00fc\u001f\u00a10\u00af\u001b\u00f8\u00ba\u00ad\u00b1\u0014\u00b2e\u00b5\u00db)P\n!\u00f21K\u0002\u008c\u00a3\u00a2\u00d6\u00e4\u00bd\u0093\u0005\u00cfx\u00a5\u00c0N\u009d\u00ae\u00c6\u00b4T0\u0016S\u00c8\u00baR\u00dc\u00cbN\u00cb(\u0005\u0014\u00a7ip\u00b9\u0090\u00f2\u00e0\u00dc\u008c\u00db^\u001a\u00d1\u00fc\u00d5\u00db\u001bdI\u00d8\u00f9\u009e\u0085\u009c\u00c6\u0003R\u00e0\u0006\u009c\u00a5\u001b~\u00f3$\u00be:\u00c4\br\u00f4\u00d8\"\u0099\u0094_\u00e7,\u00a8\u00e3\u00ba!\u00ce\u008d{\u00ff\"u\u00b8!&R\u0006?\u00d8g\u00fa\u00bb\u00f0;S\u00a4\u00df\u00b0\u00f7q\u001a\u0002\u0018W\u00cd\u00c6\u0001\u00d7\u008e\u00bd\u00c7\u00ff\u00ceD\u00c0\u0000\u0089T-Y\u00e5\u00c0\u00ea\u0001\u00fa\u00fbw\n\u00ab\u0082\u0099\u0003\u00db\u00c7\u0085\u0096'\u00ce\u00baf\u00f8NIL;y\u0087*(o\u00b8\u00fa\u0091\u00d4F>\u00f0\u00ad\u0006MG\u00c6_\u00bc\u00ae\u009d\u00e3U\u00ea\u00fd\u00e2\u00f0\u00db\u00db9\u00f1\u009f)\u0003\u00fe\u00e2p".length();
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
                    var6_5 = "\u00d2\u00ce\b\u00d7\u00a9\u009c\u001d6\u00b9\u008an\u0093\u00a2\u00a4\u0006g";
                    var7_6 = "\u00d2\u00ce\b\u00d7\u00a9\u009c\u001d6\u00b9\u008an\u0093\u00a2\u00a4\u0006g".length();
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
        CryptographicKeyManager.r = var8_3;
        CryptographicKeyManager.w = new Integer[40];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicKeyManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (F[n4] != null) {
            return n4;
        }
        Object object = C[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 35;
                break;
            }
            case 1: {
                n3 = 26;
                break;
            }
            case 2: {
                n3 = 15;
                break;
            }
            case 3: {
                n3 = 45;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 51;
                break;
            }
            case 6: {
                n3 = 1;
                break;
            }
            case 7: {
                n3 = 29;
                break;
            }
            case 8: {
                n3 = 56;
                break;
            }
            case 9: {
                n3 = 19;
                break;
            }
            case 10: {
                n3 = 33;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 49;
                break;
            }
            case 13: {
                n3 = 48;
                break;
            }
            case 14: {
                n3 = 28;
                break;
            }
            case 15: {
                n3 = 9;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 50;
                break;
            }
            case 18: {
                n3 = 53;
                break;
            }
            case 19: {
                n3 = 60;
                break;
            }
            case 20: {
                n3 = 43;
                break;
            }
            case 21: {
                n3 = 47;
                break;
            }
            case 22: {
                n3 = 6;
                break;
            }
            case 23: {
                n3 = 55;
                break;
            }
            case 24: {
                n3 = 0;
                break;
            }
            case 25: {
                n3 = 41;
                break;
            }
            case 26: {
                n3 = 13;
                break;
            }
            case 27: {
                n3 = 18;
                break;
            }
            case 28: {
                n3 = 8;
                break;
            }
            case 29: {
                n3 = 30;
                break;
            }
            case 30: {
                n3 = 5;
                break;
            }
            case 31: {
                n3 = 59;
                break;
            }
            case 32: {
                n3 = 3;
                break;
            }
            case 33: {
                n3 = 22;
                break;
            }
            case 34: {
                n3 = 42;
                break;
            }
            case 35: {
                n3 = 36;
                break;
            }
            case 36: {
                n3 = 62;
                break;
            }
            case 37: {
                n3 = 63;
                break;
            }
            case 38: {
                n3 = 37;
                break;
            }
            case 39: {
                n3 = 25;
                break;
            }
            case 40: {
                n3 = 39;
                break;
            }
            case 41: {
                n3 = 10;
                break;
            }
            case 42: {
                n3 = 23;
                break;
            }
            case 43: {
                n3 = 11;
                break;
            }
            case 44: {
                n3 = 34;
                break;
            }
            case 45: {
                n3 = 57;
                break;
            }
            case 46: {
                n3 = 44;
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
                n3 = 52;
                break;
            }
            case 50: {
                n3 = 2;
                break;
            }
            case 51: {
                n3 = 17;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 7;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 20;
                break;
            }
            case 56: {
                n3 = 21;
                break;
            }
            case 57: {
                n3 = 38;
                break;
            }
            case 58: {
                n3 = 58;
                break;
            }
            case 59: {
                n3 = 40;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 54;
                break;
            }
            case 62: {
                n3 = 31;
                break;
            }
            default: {
                n3 = 61;
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
        CryptographicKeyManager.F[n4] = new String(cArray);
        return n4;
    }

    public Object A() {
        return this.p.Z(null);
    }

    public Object M() {
        return this.j.Z(null);
    }

    public Object c() {
        return this.y.Z(null);
    }

    public Object l() {
        return this.q.Z(null);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicKeyManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicKeyManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

