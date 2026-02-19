/*
 * Decompiled with CFR 0.152.
 */
package com.system.resources;

import a.a;
import a.cA;
import com.adapter.management.GenericAdapterManager;
import com.app.sorting.SyComparator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.data.compression.DataCompressionUtility;
import com.data.sorting.CustomDataComparator;
import com.exception.system.CustomSystemException;
import com.governance.compliance.ComplianceRuleEngine;
import com.numeric.precision.NumericPrecisionTransformer;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.runtime.context.ContextualExecutionFramework;
import com.security.authentication.AuthenticationGateway1860;
import com.temporal.metadata.TemporalMetadataResolver;
import com.text.processing.StringTokenContainer;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ResourceAllocationManager264
extends DataCompressionUtility {
    public final AuthenticationStateTracker n;
    public final AuthenticationGateway1860 e;
    public final AdaptiveRenderingEngine N;
    public final AuthenticationStateTracker h;
    private static final long[] d;
    public AuthenticationStateTracker G;
    public final AuthenticationStateTracker P;
    public final AuthenticationStateTracker T;
    public final AuthenticationStateTracker o;
    public final AuthenticationStateTracker t;
    private static final Object[] fb;
    private static final Map bb;
    public final AuthenticationGateway1860 Z;
    public final AuthenticationStateTracker Y;
    private static final Integer[] F;
    public final AuthenticationStateTracker x;
    public final GenericAdapterManager R;
    public final AuthenticationGateway1860 r;
    public final GenericAdapterManager O;
    public final StringTokenContainer A;
    public final GenericAdapterManager j;
    public final AuthenticationStateTracker K;
    public final NumericPrecisionTransformer w;
    private static final String[] gb;
    public static ResourceAllocationManager264 v;
    private static final long b;
    public final AdaptiveRenderingEngine z;
    public final AuthenticationGateway1860 B;
    public final AuthenticationGateway1860 l;
    public final AuthenticationGateway1860 X;
    public final AuthenticationGateway1860 m;
    public final AuthenticationGateway1860 V;
    public final cA L;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = ResourceAllocationManager264.a(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = gb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceAllocationManager264.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceAllocationManager264.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceAllocationManager264.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceAllocationManager264.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceAllocationManager264.b(227461868212119L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceAllocationManager264.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceAllocationManager264.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceAllocationManager264.b(227461868212119L, 0L);
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceAllocationManager264.a(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceAllocationManager264.fb[n] = clazz = Class.forName(gb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'q' || c == '\u00fa' || c == '\u00f4' || c == 'o') {
                field = ResourceAllocationManager264.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'q' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceAllocationManager264.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = fb;
        fb[0] = "LTD";
        objectArray[1] = Integer.TYPE;
        ResourceAllocationManager264.gb[1] = "java/lang/Integer";
        objectArray[2] = "\"}yNl\u0017)rh\u0001\u0011\u000f:uaH";
        objectArray[3] = "@.zXC\tK!k\u0017\"\u0007@*oM";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\rb\r\u0019- \u0003-\u0001g\u007f;=%\f\u000b,?\u0005,\u0000\bi@\u0004y\u0003\u0005n;]-\u0002\u0002\u0014";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (gb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 60;
                break;
            }
            case 1: {
                n3 = 18;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 45;
                break;
            }
            case 4: {
                n3 = 59;
                break;
            }
            case 5: {
                n3 = 43;
                break;
            }
            case 6: {
                n3 = 28;
                break;
            }
            case 7: {
                n3 = 46;
                break;
            }
            case 8: {
                n3 = 51;
                break;
            }
            case 9: {
                n3 = 32;
                break;
            }
            case 10: {
                n3 = 16;
                break;
            }
            case 11: {
                n3 = 23;
                break;
            }
            case 12: {
                n3 = 2;
                break;
            }
            case 13: {
                n3 = 42;
                break;
            }
            case 14: {
                n3 = 61;
                break;
            }
            case 15: {
                n3 = 52;
                break;
            }
            case 16: {
                n3 = 26;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 40;
                break;
            }
            case 19: {
                n3 = 21;
                break;
            }
            case 20: {
                n3 = 1;
                break;
            }
            case 21: {
                n3 = 30;
                break;
            }
            case 22: {
                n3 = 9;
                break;
            }
            case 23: {
                n3 = 34;
                break;
            }
            case 24: {
                n3 = 35;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 53;
                break;
            }
            case 27: {
                n3 = 33;
                break;
            }
            case 28: {
                n3 = 15;
                break;
            }
            case 29: {
                n3 = 22;
                break;
            }
            case 30: {
                n3 = 39;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 31;
                break;
            }
            case 33: {
                n3 = 4;
                break;
            }
            case 34: {
                n3 = 57;
                break;
            }
            case 35: {
                n3 = 11;
                break;
            }
            case 36: {
                n3 = 55;
                break;
            }
            case 37: {
                n3 = 3;
                break;
            }
            case 38: {
                n3 = 48;
                break;
            }
            case 39: {
                n3 = 56;
                break;
            }
            case 40: {
                n3 = 10;
                break;
            }
            case 41: {
                n3 = 13;
                break;
            }
            case 42: {
                n3 = 37;
                break;
            }
            case 43: {
                n3 = 7;
                break;
            }
            case 44: {
                n3 = 27;
                break;
            }
            case 45: {
                n3 = 41;
                break;
            }
            case 46: {
                n3 = 63;
                break;
            }
            case 47: {
                n3 = 0;
                break;
            }
            case 48: {
                n3 = 14;
                break;
            }
            case 49: {
                n3 = 38;
                break;
            }
            case 50: {
                n3 = 54;
                break;
            }
            case 51: {
                n3 = 50;
                break;
            }
            case 52: {
                n3 = 5;
                break;
            }
            case 53: {
                n3 = 36;
                break;
            }
            case 54: {
                n3 = 8;
                break;
            }
            case 55: {
                n3 = 6;
                break;
            }
            case 56: {
                n3 = 25;
                break;
            }
            case 57: {
                n3 = 47;
                break;
            }
            case 58: {
                n3 = 49;
                break;
            }
            case 59: {
                n3 = 29;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 17;
                break;
            }
            case 62: {
                n3 = 44;
                break;
            }
            default: {
                n3 = 12;
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
        ResourceAllocationManager264.gb[n4] = new String(cArray);
        return n4;
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ResourceAllocationManager264.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceAllocationManager264.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceAllocationManager264.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceAllocationManager264.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xE28;
        if (F[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])bb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    bb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceAllocationManager264.F[n2] = n3;
        }
        return F[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceAllocationManager264.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public int p() {
        int n;
        block5: {
            block4: {
                try {
                    if (this.j.J() != this.Z) break block4;
                    n = 0;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager264.a(customSystemException);
                }
            }
            try {
                n = this.j.J() == this.B ? 1 : 2;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager264.a(customSystemException);
            }
        }
        return n;
    }

    public String c() {
        CopyOnWriteArrayList<ContextualExecutionFramework> copyOnWriteArrayList;
        long l;
        block10: {
            block9: {
                l = b ^ 0x6DFC2E73B12BL;
                copyOnWriteArrayList = new CopyOnWriteArrayList<ContextualExecutionFramework>(TemporalMetadataResolver.h.U().q());
                try {
                    if (this.R.J() != this.r) break block9;
                    copyOnWriteArrayList.sort(new SyComparator());
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationManager264.a(customSystemException);
                }
            }
            try {
                if (this.R.J() == this.m) {
                    copyOnWriteArrayList.sort(new CustomDataComparator(null));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager264.a(customSystemException);
            }
        }
        Object object = ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)731, (long)(0x231C99282C174943L ^ l)), (long)-4205210142744897087L, (long)l);
        for (ContextualExecutionFramework contextualExecutionFramework : copyOnWriteArrayList) {
            try {
                if (!contextualExecutionFramework.Z() || contextualExecutionFramework.N() == 0) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceAllocationManager264.a(customSystemException);
            }
            object = (String)object + contextualExecutionFramework.O() + (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)767, (long)(0x7DAB542A0804976L ^ l)), (long)-4205210142744897087L, (long)l));
        }
        if (((String)object).length() > 2) {
            object = ((String)object).substring(0, ((String)object).length() - 2);
        }
        return object;
    }

    public ResourceAllocationManager264() {
        long l = b ^ 0x66E7ACF52390L;
        super(a.cs((int)ResourceAllocationManager264.a("g", (int)7600, (long)(0x4B00715080A6C48DL ^ l))));
        this.r = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)28097, (long)(0xCA7FEB13748B4EAL ^ l)), (long)6277768000453249914L, (long)l)));
        this.m = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)20987, (long)(0x5A9F2DC86FD008EEL ^ l)), (long)6277768000453249914L, (long)l)));
        this.R = GenericAdapterManager.D(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)3759, (long)(0x6902523757875790L ^ l)), (long)6277768000453249914L, (long)l)), this.m, this.m, this.r);
        this.V = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)23104, (long)(0x8A58BA129720356L ^ l)), (long)6277768000453249914L, (long)l)));
        this.e = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)7101, (long)(0x8A76D087F8CC2ACL ^ l)), (long)6277768000453249914L, (long)l)));
        this.X = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)3572, (long)(0x56AFC3E51658D4CCL ^ l)), (long)6277768000453249914L, (long)l)));
        this.O = GenericAdapterManager.D(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)20040, (long)(0x41A9C1CE2D6E1766L ^ l)), (long)6277768000453249914L, (long)l)), this.V, this.V, this.e, this.X);
        this.N = AdaptiveRenderingEngine.C(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)17796, (long)(0x3C6A5FA198CD1CB7L ^ l)), (long)6277768000453249914L, (long)l)), new Color(206, 7, 7));
        this.P = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)11520, (long)(0x4405DB19C1F1F417L ^ l)), (long)6277768000453249914L, (long)l)), false, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)21361, (long)(0x6931BF57F4D78A65L ^ l)), (long)6277768000453249914L, (long)l)));
        this.n = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)25797, (long)(0x2FBF2349AEBFBDF3L ^ l)), (long)6277768000453249914L, (long)l)), true, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)9525, (long)(0x3D6E038C95BF7C26L ^ l)), (long)6277768000453249914L, (long)l)));
        this.K = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)32031, (long)(0x4BDFAB983123A423L ^ l)), (long)6277768000453249914L, (long)l)), true, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)6450, (long)(0x5A4FF0D26BDF401DL ^ l)), (long)6277768000453249914L, (long)l)));
        this.h = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)12808, (long)(0xBE771A21357EB28L ^ l)), (long)6277768000453249914L, (long)l)), false, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)20329, (long)(0x7936ABEE89BC964FL ^ l)), (long)6277768000453249914L, (long)l)));
        this.T = AuthenticationStateTracker.w(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)5260, (long)(0x7306DA0B43664DADL ^ l)), (long)6277768000453249914L, (long)l)), true);
        this.t = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)31399, (long)(0x7F974F14F43D23B5L ^ l)), (long)6277768000453249914L, (long)l)), false, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)23922, (long)(0x6A536BE16DA8447L ^ l)), (long)6277768000453249914L, (long)l)));
        this.L = (cA)cA.d(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)9487, (long)(0x8DF921C940D7C11L ^ l)), (long)6277768000453249914L, (long)l)), (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)19331, (long)(0x72C583AB966092B7L ^ l)), (long)6277768000453249914L, (long)l)), (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)349, (long)(0x47C7CAD88331D875L ^ l)), (long)6277768000453249914L, (long)l)), cA.s, Arrays.asList(ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)10362, (long)(0x333CF06AC709714AL ^ l)), (long)6277768000453249914L, (long)l), ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)28188, (long)(0x1D1DB53B72B43738L ^ l)), (long)6277768000453249914L, (long)l), ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)27171, (long)(0x7D450CAF30EC3319L ^ l)), (long)6277768000453249914L, (long)l))).U(new ComplianceRuleEngine());
        this.G = AuthenticationStateTracker.R(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)1250, (long)(0x33F5E0839541DDD3L ^ l)), (long)6277768000453249914L, (long)l)), true, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)30404, (long)(0x19477BDA14D2FD4L ^ l)), (long)6277768000453249914L, (long)l)));
        this.w = NumericPrecisionTransformer.N(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)16476, (long)(0x837AD666F119976L ^ l)), (long)6277768000453249914L, (long)l)), (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)11981, (long)(0x39BCC4A344BA77E0L ^ l)), (long)6277768000453249914L, (long)l)), "", 0.1, 1.0, 2.0, 0.1);
        this.Y = AuthenticationStateTracker.w(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)20426, (long)(0x4C26B8A2F28C96E8L ^ l)), (long)6277768000453249914L, (long)l)), false);
        this.A = StringTokenContainer.F(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)26152, (long)(0x45ED53CD0E2EBF1FL ^ l)), (long)6277768000453249914L, (long)l)), "");
        this.x = AuthenticationStateTracker.w(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)20068, (long)(0x45AEF2F83DE2975DL ^ l)), (long)6277768000453249914L, (long)l)), false);
        this.z = AdaptiveRenderingEngine.C(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)17659, (long)(0x73ADDEDA906F1DC5L ^ l)), (long)6277768000453249914L, (long)l)), new Color(206, 7, 7));
        this.o = AuthenticationStateTracker.w(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)24328, (long)(0x37AA2991910A8633L ^ l)), (long)6277768000453249914L, (long)l)), true);
        this.Z = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)7124, (long)(0x4F08F4E981A7C2F1L ^ l)), (long)6277768000453249914L, (long)l)));
        this.B = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)4837, (long)(0x93CB3DDF3B5CBC2L ^ l)), (long)6277768000453249914L, (long)l)));
        this.l = new AuthenticationGateway1860((String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)26552, (long)(0x276B2B7A02073E94L ^ l)), (long)6277768000453249914L, (long)l)));
        this.j = GenericAdapterManager.D(this, (String)((Object)ResourceAllocationManager264.c("\u00d8", (int)ResourceAllocationManager264.a("g", (int)31480, (long)(0x3631BFB1C635A3D1L ^ l)), (long)6277768000453249914L, (long)l)), this.Z, this.Z, this.B, this.l);
        v = this;
        this.N(this.R, this.O, this.N, this.j, this.P, this.n, this.K, this.h, this.T, this.t, this.L, this.G, this.w, this.Y, this.A, this.x, this.z, this.o);
        this.A.Z(true);
        this.O.l((ConfigurationProfileResolver)this.N, this.X);
        this.t.l(this.L);
        this.Y.l(this.A);
        this.Y.l(this.x);
        this.x.l(this.z);
    }

    private static Field c(long l, long l2) {
        int n = ResourceAllocationManager264.a(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = gb[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceAllocationManager264.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceAllocationManager264.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceAllocationManager264.a(clazz3, string2, clazz2)) != null) {
                    ResourceAllocationManager264.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceAllocationManager264.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceAllocationManager264.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceAllocationManager264.b(227461868212119L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceAllocationManager264.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceAllocationManager264.b = MultiContainerRegistry.a(1861650115069648568L, 3743431619950954623L, MethodHandles.lookup().lookupClass()).a(241487050088136L);
                ResourceAllocationManager264.fb = new Object[5];
                ResourceAllocationManager264.gb = new String[5];
                ResourceAllocationManager264.a();
                ResourceAllocationManager264.bb = new HashMap<K, V>(13);
                var0 = ResourceAllocationManager264.b ^ 66699319024513L;
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
                var8_3 = new long[41];
                var5_4 = 0;
                var6_5 = "\u007f\u00d4\u008a\u00fb\u0080q\u009c\u008dJ^\u009b2\u0088\u00f1-|\u0019)\u00c0vm\u00db\u0082\u0012\u00c1C$\u000b\u008c\u001c\u00bb\u00c2s\u00a3\u00d3t\u00ba\u00a8ro\u00e7\u0003\u00fd\u009cB\u00e2\u00a7\u0017\u00de\u0014\u00f2\u00da\u0095]\u001e\u00e6\u00e0\u0084\u0010!\u001az\u00ff{C\u001c\u00e0\u0002\u00ee\u0082+\u009a3\u00c6\u00df\u0082\u008c\u00c4\f\u00efI)k\u0092\u00c4\u00c6sG\u00e9y\u00f9!\u00c8\u001c4\u0001\u0005\u00be\u0089\u00e8\u00c6\u0092xC:\u00e2\u0080\u00cb%G\u00eeC\u0093\u0016\u00c2,w\u00c31\tt\u00bd}Y\u008e\u00de[\u00bdb{G3\u0012\u0085\u00fbN\u00ack\rs?X\u00bf\u0093u6C\u000e)\u0083\u00ae\u0011\u00c4AP\u0007\u009e\u0094\u00a3n\u008b\u00bfp\u00ce \u00d9vX\u009c=\u00f3q^\u0003.\u00c8\u001c\u00af\u0089i\u008fph[\u0016\u00ac\u00d3\tU\u00fe]\u00f0r\u008a\u008fA?\u00a0)\u00dd\u00fdo\u007f\r\u00d0\u00efd\u00e2X\u00a0\u00c1\u0018\u001f\u00a0l\u00c5\u009en\u00f5\u0004\u00ab\u00c2\u0015\u00a9\u00ea\u00e6\u00bdo\u0018\u008f\u00a4\u00de\u009e\u000e\u0094\u0088\u00a0\u00bd\u001c\u00b6\u00e0\f\u0090\u0095g$?\u00aa\u00ec[\u00c4\u00b5\u00e2\u001d(o\u0080\u00cd[`\u00e54\u00fb\u0080\u00f3\u00d6:e\u0081\u00e3x\u00ea\u00c4\u00fa\u0097H\u0016\u00da\u0099*\fv\u0093\u00a6 \u00d2)\u00afz\u0011*xw\u0084\u009e\u00cc+\u008f\u00e3\u0007R\u00c1\b\u0018\u00a80\u0096v\u0014+\u0001X";
                var7_6 = "\u007f\u00d4\u008a\u00fb\u0080q\u009c\u008dJ^\u009b2\u0088\u00f1-|\u0019)\u00c0vm\u00db\u0082\u0012\u00c1C$\u000b\u008c\u001c\u00bb\u00c2s\u00a3\u00d3t\u00ba\u00a8ro\u00e7\u0003\u00fd\u009cB\u00e2\u00a7\u0017\u00de\u0014\u00f2\u00da\u0095]\u001e\u00e6\u00e0\u0084\u0010!\u001az\u00ff{C\u001c\u00e0\u0002\u00ee\u0082+\u009a3\u00c6\u00df\u0082\u008c\u00c4\f\u00efI)k\u0092\u00c4\u00c6sG\u00e9y\u00f9!\u00c8\u001c4\u0001\u0005\u00be\u0089\u00e8\u00c6\u0092xC:\u00e2\u0080\u00cb%G\u00eeC\u0093\u0016\u00c2,w\u00c31\tt\u00bd}Y\u008e\u00de[\u00bdb{G3\u0012\u0085\u00fbN\u00ack\rs?X\u00bf\u0093u6C\u000e)\u0083\u00ae\u0011\u00c4AP\u0007\u009e\u0094\u00a3n\u008b\u00bfp\u00ce \u00d9vX\u009c=\u00f3q^\u0003.\u00c8\u001c\u00af\u0089i\u008fph[\u0016\u00ac\u00d3\tU\u00fe]\u00f0r\u008a\u008fA?\u00a0)\u00dd\u00fdo\u007f\r\u00d0\u00efd\u00e2X\u00a0\u00c1\u0018\u001f\u00a0l\u00c5\u009en\u00f5\u0004\u00ab\u00c2\u0015\u00a9\u00ea\u00e6\u00bdo\u0018\u008f\u00a4\u00de\u009e\u000e\u0094\u0088\u00a0\u00bd\u001c\u00b6\u00e0\f\u0090\u0095g$?\u00aa\u00ec[\u00c4\u00b5\u00e2\u001d(o\u0080\u00cd[`\u00e54\u00fb\u0080\u00f3\u00d6:e\u0081\u00e3x\u00ea\u00c4\u00fa\u0097H\u0016\u00da\u0099*\fv\u0093\u00a6 \u00d2)\u00afz\u0011*xw\u0084\u009e\u00cc+\u008f\u00e3\u0007R\u00c1\b\u0018\u00a80\u0096v\u0014+\u0001X".length();
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
                    var6_5 = "\u00d6\u00e6\u0098\\\u0084\u0091B\u00b6YkMXC\u00c6\u00ab\u000f";
                    var7_6 = "\u00d6\u00e6\u0098\\\u0084\u0091B\u00b6YkMXC\u00c6\u00ab\u000f".length();
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
        ResourceAllocationManager264.d = var8_3;
        ResourceAllocationManager264.F = new Integer[41];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocationManager264.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ResourceAllocationManager264.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

