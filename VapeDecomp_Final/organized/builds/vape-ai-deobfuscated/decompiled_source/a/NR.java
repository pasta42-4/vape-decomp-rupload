/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.N;
import a.Qh;
import a.V3;
import a._Y;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionAlgorithm;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.math.geometry.GeometryCalculator;
import com.network.configuration.NetworkConfigManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.system.pipeline.ObjectPipelineManager;
import com.system.resource.ResourceAllocator1727;
import com.text.processing.PatternMatchingOrchestrator;
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

public class NR {
    private static final Object[] e;
    private int p;
    private static final String[] h;
    private static final Map d;
    private final NetworkConfigManager t;
    private boolean V;
    private boolean f;
    private static final Integer[] c;
    private int z;
    private boolean q;
    private static final long a;
    private float u;
    private Qh j;
    private static final long[] b;
    private float Q;
    private int g;
    private float B;
    private LightweightExecutionContext N;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static boolean N(NR nR, boolean bl) {
        nR.V = bl;
        return nR.V;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NR.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NR.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void P() {
        block37: {
            block39: {
                boolean bl;
                boolean bl2;
                block38: {
                    List<CompressionAlgorithm> list;
                    boolean bl3;
                    long l;
                    block36: {
                        block35: {
                            boolean bl4;
                            block34: {
                                block33: {
                                    l = a ^ 0x29D1A25E86C7L;
                                    try {
                                        ++this.p;
                                        this.t.m();
                                        if (this.Q > 20.0f) {
                                            this.Q = 20.0f;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NR.a(customSystemException);
                                    }
                                    try {
                                        try {
                                            if (!a.N.J.e() || !this.k(this.j.V() - this.j.q(), this.j.j())) break block33;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NR.a(customSystemException);
                                        }
                                        bl4 = true;
                                        break block34;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NR.a(customSystemException);
                                    }
                                }
                                bl4 = false;
                            }
                            bl2 = bl4;
                            try {
                                try {
                                    if (!a.N.J.g() || !this.N()) break block35;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NR.a(customSystemException);
                                }
                                bl3 = true;
                                break block36;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NR.a(customSystemException);
                            }
                        }
                        bl3 = false;
                    }
                    bl = bl3;
                    try {
                        try {
                            if (!this.q) break block37;
                            this.u += 0.3f;
                            if (!this.f) break block38;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NR.a(customSystemException);
                        }
                        if (this.p > 11) break block38;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NR.a(customSystemException);
                    }
                    boolean bl5 = false;
                    ResourceAllocator1727 resourceAllocator1727 = ApplicationLifecycleManager.X();
                    if (resourceAllocator1727.r() && (list = resourceAllocator1727.K()).size() > 0) {
                        for (CompressionAlgorithm compressionAlgorithm : list) {
                            try {
                                if (!compressionAlgorithm.j().x().equalsIgnoreCase((String)((Object)NR.b("\u00f4", (int)NR.a("o", (int)18773, (long)(0x33DFC4EDC3560F9CL ^ l)), (long)8845724321650071049L, (long)l)))) {
                                    continue;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NR.a(customSystemException);
                            }
                            try {
                                if (this.j.Y()) {
                                    continue;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NR.a(customSystemException);
                            }
                            try {
                                try {
                                    if (!((double)this.j.y(compressionAlgorithm) < 1.1) || !(compressionAlgorithm.V() < this.j.V() + 2.5)) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NR.a(customSystemException);
                                }
                                if (_Y.T(this.j, compressionAlgorithm)) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NR.a(customSystemException);
                            }
                            bl5 = true;
                            break;
                        }
                    }
                    float f = a.N.K(this.N, this.j, this.V, bl5);
                    this.Q -= f;
                    this.f = false;
                    break block39;
                }
                try {
                    try {
                        try {
                            if (bl2 || bl) break block39;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NR.a(customSystemException);
                        }
                        if (!this.j.u()) break block39;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NR.a(customSystemException);
                    }
                    this.Q -= a.N.x(this.j, false, 1.0f);
                }
                catch (CustomSystemException customSystemException) {
                    throw NR.a(customSystemException);
                }
            }
            this.q = false;
            this.V = false;
        }
    }

    static float S(NR nR, float f) {
        nR.u = f;
        return nR.u;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/NR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = NR.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = NR.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NR.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NR.a(clazz3, string2, clazz2)) != null) {
                    NR.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NR.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NR.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NR.b(252949809067682L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/NR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static float i(NR nR) {
        return nR.Q;
    }

    private static Method d(long l, long l2) {
        int n = NR.a(l, l2);
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
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = NR.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NR.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NR.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NR.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NR.b(252949809067682L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NR.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NR.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NR.b(252949809067682L, 0L);
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

    public NR(Qh qh) {
        long l = a ^ 0x142BF6131DE9L;
        this.Q = 20.0f;
        this.g = (int)NR.a("o", (int)30394, (long)(0x7F19DA1E0B112B5CL ^ l));
        this.B = 5.0f;
        this.t = new NetworkConfigManager();
        this.j = qh;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3C0B;
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
                throw new RuntimeException("a/NR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NR.c[n2] = n3;
        }
        return c[n2];
    }

    static NetworkConfigManager l(NR nR) {
        return nR.t;
    }

    static int g(NR nR, int n) {
        nR.g = n;
        return nR.g;
    }

    static float Z(NR nR, float f) {
        nR.Q = f;
        return nR.Q;
    }

    static int Z(NR nR, int n) {
        nR.p = n;
        return nR.p;
    }

    static int e(NR nR, int n) {
        nR.z = n;
        return nR.z;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 51;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 16;
                break;
            }
            case 3: {
                n3 = 5;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 54;
                break;
            }
            case 6: {
                n3 = 21;
                break;
            }
            case 7: {
                n3 = 35;
                break;
            }
            case 8: {
                n3 = 52;
                break;
            }
            case 9: {
                n3 = 30;
                break;
            }
            case 10: {
                n3 = 12;
                break;
            }
            case 11: {
                n3 = 28;
                break;
            }
            case 12: {
                n3 = 43;
                break;
            }
            case 13: {
                n3 = 19;
                break;
            }
            case 14: {
                n3 = 58;
                break;
            }
            case 15: {
                n3 = 10;
                break;
            }
            case 16: {
                n3 = 59;
                break;
            }
            case 17: {
                n3 = 44;
                break;
            }
            case 18: {
                n3 = 47;
                break;
            }
            case 19: {
                n3 = 41;
                break;
            }
            case 20: {
                n3 = 1;
                break;
            }
            case 21: {
                n3 = 34;
                break;
            }
            case 22: {
                n3 = 38;
                break;
            }
            case 23: {
                n3 = 13;
                break;
            }
            case 24: {
                n3 = 46;
                break;
            }
            case 25: {
                n3 = 15;
                break;
            }
            case 26: {
                n3 = 56;
                break;
            }
            case 27: {
                n3 = 60;
                break;
            }
            case 28: {
                n3 = 55;
                break;
            }
            case 29: {
                n3 = 14;
                break;
            }
            case 30: {
                n3 = 23;
                break;
            }
            case 31: {
                n3 = 2;
                break;
            }
            case 32: {
                n3 = 20;
                break;
            }
            case 33: {
                n3 = 29;
                break;
            }
            case 34: {
                n3 = 11;
                break;
            }
            case 35: {
                n3 = 42;
                break;
            }
            case 36: {
                n3 = 50;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 6;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 22;
                break;
            }
            case 42: {
                n3 = 62;
                break;
            }
            case 43: {
                n3 = 53;
                break;
            }
            case 44: {
                n3 = 36;
                break;
            }
            case 45: {
                n3 = 63;
                break;
            }
            case 46: {
                n3 = 37;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 9;
                break;
            }
            case 49: {
                n3 = 45;
                break;
            }
            case 50: {
                n3 = 27;
                break;
            }
            case 51: {
                n3 = 0;
                break;
            }
            case 52: {
                n3 = 3;
                break;
            }
            case 53: {
                n3 = 39;
                break;
            }
            case 54: {
                n3 = 32;
                break;
            }
            case 55: {
                n3 = 57;
                break;
            }
            case 56: {
                n3 = 17;
                break;
            }
            case 57: {
                n3 = 49;
                break;
            }
            case 58: {
                n3 = 4;
                break;
            }
            case 59: {
                n3 = 7;
                break;
            }
            case 60: {
                n3 = 18;
                break;
            }
            case 61: {
                n3 = 33;
                break;
            }
            case 62: {
                n3 = 61;
                break;
            }
            default: {
                n3 = 25;
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
        NR.h[n4] = new String(cArray);
        return n4;
    }

    private boolean N() {
        boolean bl;
        block18: {
            block20: {
                block21: {
                    block17: {
                        bl = false;
                        try {
                            if (this.Q >= 20.0f) {
                                this.z = 0;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NR.a(customSystemException);
                        }
                        try {
                            block19: {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (!(this.Q > 0.0f) || !(this.Q < 20.0f)) break block17;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw NR.a(customSystemException);
                                            }
                                            ++this.z;
                                            if (this.z < 80) break block18;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NR.a(customSystemException);
                                        }
                                        if (!this.j.u()) break block19;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NR.a(customSystemException);
                                    }
                                    if (!ApplicationLifecycleManager.U().e(ObjectPipelineManager.n)) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NR.a(customSystemException);
                                }
                            }
                            this.Q += 1.0f;
                            this.u += 3.0f;
                            this.z = 0;
                            break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NR.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (this.g > 0) break block20;
                            ++this.z;
                            if (this.z < 80) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NR.a(customSystemException);
                        }
                        if (!(this.Q > 1.0f)) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NR.a(customSystemException);
                    }
                    this.Q -= 1.0f;
                    bl = true;
                }
                this.z = 0;
                break block18;
            }
            this.z = 0;
        }
        return bl;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NR.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NR.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static LightweightExecutionContext k(NR nR, LightweightExecutionContext lightweightExecutionContext) {
        nR.N = lightweightExecutionContext;
        return nR.N;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0017\u0002i";
        objectArray[1] = Integer.TYPE;
        NR.h[1] = "java/lang/Integer";
        objectArray[2] = "\u000e{)\u000eoj\u0005t8A\u0012r\u0016s1\b";
        objectArray[3] = "zW}?\u0012\u001dqXlps\u0013zSh*";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "'\u0005mkX{%\u0017q\u0001MlLN/pGh'\nwpG\u0017vMh>Zp|\u0016k9&";
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NR.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NR.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                NR.e[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NR.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static float M(NR nR, float f) {
        nR.B = f;
        return nR.B;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'B' || c == 'W' || c == 'e' || c == 'd') {
                field = NR.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NR.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00de' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public boolean k(double d2, boolean bl) {
        block16: {
            float f;
            int n;
            float f2 = (float)(this.j.V() - this.j.q());
            if (GeometryCalculator.C() > 13) {
                TransactionCorrelationEngine transactionCorrelationEngine;
                ReflectionUtilityBroker reflectionUtilityBroker;
                block15: {
                    int n2 = AdaptiveComputationEngine.Q(this.j.F());
                    int n3 = AdaptiveComputationEngine.Q(this.j.V() - (double)0.2f);
                    n = AdaptiveComputationEngine.Q(this.j.B());
                    reflectionUtilityBroker = ReflectionUtilityBroker.t(n2, n3, n);
                    transactionCorrelationEngine = ApplicationLifecycleManager.c().T(reflectionUtilityBroker).I();
                    if (PatternMatchingOrchestrator.e(transactionCorrelationEngine)) {
                        block14: {
                            TransactionCorrelationEngine transactionCorrelationEngine2 = ApplicationLifecycleManager.c().T(reflectionUtilityBroker.b()).I();
                            try {
                                try {
                                    if (transactionCorrelationEngine2.B(ReflectionMetadataResolver.EC) || transactionCorrelationEngine2.B(ReflectionMetadataResolver.rL)) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw NR.a(customSystemException);
                                }
                                if (!transactionCorrelationEngine2.B(ReflectionMetadataResolver.r9)) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NR.a(customSystemException);
                            }
                        }
                        reflectionUtilityBroker = reflectionUtilityBroker.b();
                        transactionCorrelationEngine = ApplicationLifecycleManager.c().T(reflectionUtilityBroker).I();
                    }
                }
                f2 += this.j.W();
                this.j.E(d2, bl, transactionCorrelationEngine, reflectionUtilityBroker);
            } else {
                this.j.H(d2, bl);
            }
            try {
                if (!this.j.j() || !(f2 > 0.0f)) break block16;
            }
            catch (CustomSystemException customSystemException) {
                throw NR.a(customSystemException);
            }
            V3 v3 = this.j.W(ObjectPipelineManager.T);
            try {
                f = v3.r() ? (float)(v3.y() + 1) : 0.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw NR.a(customSystemException);
            }
            float f3 = f;
            n = AdaptiveComputationEngine.Z(f2 - 3.0f - f3);
            try {
                if (n > 0) {
                    this.Q -= (float)n;
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw NR.a(customSystemException);
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-3896772105193169242L, 3754011810686916667L, MethodHandles.lookup().lookupClass()).a(88483904387660L);
        e = new Object[5];
        h = new String[5];
        NR.a();
        d = new HashMap(13);
        long l = a ^ 0x4A1790FF10B2L;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "o\u00e03\u00ec\u00dc!\u0005~\u009e\u00ffn\u00dd \u001c\u00fe\u0093";
        int n2 = "o\u00e03\u00ec\u00dc!\u0005~\u009e\u00ffn\u00dd \u001c\u00fe\u0093".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    static Qh t(NR nR, Qh qh) {
        nR.j = qh;
        return nR.j;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static boolean P(NR nR, boolean bl) {
        nR.q = bl;
        return nR.q;
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

    static boolean a(NR nR, boolean bl) {
        nR.f = bl;
        return nR.f;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NR.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NR.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

