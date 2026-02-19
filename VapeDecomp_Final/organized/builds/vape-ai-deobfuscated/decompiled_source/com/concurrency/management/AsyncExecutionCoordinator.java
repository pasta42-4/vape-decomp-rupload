/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.concurrency.management;

import a._k;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CryptographicKeyGenerator2118;
import com.system.configuration.ConfigurationManager;
import com.system.resources.ResourceAllocationTracker1709;
import java.awt.Color;
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
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AsyncExecutionCoordinator
extends CipherContextManager1101 {
    private static final long[] eb;
    private boolean xm = false;
    private static final Map lb;
    private boolean xS = false;
    private boolean xy = true;
    private AbstractComputationKernel xM;
    @Nullable
    private Runnable xR;
    private static final Object[] qb;
    private double x0 = 0.0;
    private GraphicalRenderEngine1082 xv;
    private static final Integer[] fb;
    private double x8;
    private static final long ab;
    private double xZ;
    private static final String[] rb;

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void E() {
        block3: {
            block2: {
                try {
                    this.b(this.P().G());
                    this.M(this.P().W());
                    if (!this.xy) break block2;
                    this.Y();
                    this.z();
                    this.A();
                    super.E();
                    this.J();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsyncExecutionCoordinator.c(customSystemException);
                }
            }
            this.T();
            this.A();
            super.E();
        }
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsyncExecutionCoordinator.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsyncExecutionCoordinator.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void T() {
        long l = ab ^ 0x4BF53400551AL;
        int n = (int)(this.N().G() + this.N().w() / 2.0 - this.P().G());
        int n2 = (int)(this.N().W() + this.N().b() / 2.0 - this.P().W());
        int n3 = (int)(this.G() + (double)n);
        int n4 = (int)(this.W() + (double)n2);
        int n5 = (int)((double)n3 + this.xM.w());
        int n6 = (int)((double)n4 + this.xM.b());
        int n7 = ApplicationLifecycleManager.e() / 2;
        int n8 = ApplicationLifecycleManager.b() / 2;
        int n9 = n7 - n5;
        int n10 = n8 - n6;
        if (n9 < 0) {
            n += n9;
        }
        if (n10 < 0) {
            n2 += n10;
        }
        String string = (String)((Object)AsyncExecutionCoordinator.e("K", (int)AsyncExecutionCoordinator.d("x", (int)28804, (long)(0x7BA882302A599538L ^ l)), (long)-8602351603555332499L, (long)l)) + n + (String)((Object)AsyncExecutionCoordinator.e("K", (int)AsyncExecutionCoordinator.d("x", (int)11533, (long)(0x8918BA955B648B0L ^ l)), (long)-8602351603555332499L, (long)l)) + n2;
        this.xv.d().F(this.xM, string);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == 'H' || c == 'e' || c == 'D') {
                field = AsyncExecutionCoordinator.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsyncExecutionCoordinator.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void Z(@Nullable Runnable runnable) {
        this.xR = runnable;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (rb[n4] != null) {
            return n4;
        }
        Object object = qb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 45;
                break;
            }
            case 1: {
                n3 = 49;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 25;
                break;
            }
            case 5: {
                n3 = 54;
                break;
            }
            case 6: {
                n3 = 31;
                break;
            }
            case 7: {
                n3 = 14;
                break;
            }
            case 8: {
                n3 = 58;
                break;
            }
            case 9: {
                n3 = 32;
                break;
            }
            case 10: {
                n3 = 61;
                break;
            }
            case 11: {
                n3 = 15;
                break;
            }
            case 12: {
                n3 = 21;
                break;
            }
            case 13: {
                n3 = 0;
                break;
            }
            case 14: {
                n3 = 19;
                break;
            }
            case 15: {
                n3 = 10;
                break;
            }
            case 16: {
                n3 = 7;
                break;
            }
            case 17: {
                n3 = 52;
                break;
            }
            case 18: {
                n3 = 33;
                break;
            }
            case 19: {
                n3 = 20;
                break;
            }
            case 20: {
                n3 = 1;
                break;
            }
            case 21: {
                n3 = 5;
                break;
            }
            case 22: {
                n3 = 11;
                break;
            }
            case 23: {
                n3 = 23;
                break;
            }
            case 24: {
                n3 = 3;
                break;
            }
            case 25: {
                n3 = 53;
                break;
            }
            case 26: {
                n3 = 42;
                break;
            }
            case 27: {
                n3 = 55;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 35;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 47;
                break;
            }
            case 32: {
                n3 = 38;
                break;
            }
            case 33: {
                n3 = 16;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 48;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 51;
                break;
            }
            case 38: {
                n3 = 56;
                break;
            }
            case 39: {
                n3 = 59;
                break;
            }
            case 40: {
                n3 = 13;
                break;
            }
            case 41: {
                n3 = 12;
                break;
            }
            case 42: {
                n3 = 29;
                break;
            }
            case 43: {
                n3 = 37;
                break;
            }
            case 44: {
                n3 = 30;
                break;
            }
            case 45: {
                n3 = 22;
                break;
            }
            case 46: {
                n3 = 44;
                break;
            }
            case 47: {
                n3 = 24;
                break;
            }
            case 48: {
                n3 = 6;
                break;
            }
            case 49: {
                n3 = 41;
                break;
            }
            case 50: {
                n3 = 34;
                break;
            }
            case 51: {
                n3 = 39;
                break;
            }
            case 52: {
                n3 = 36;
                break;
            }
            case 53: {
                n3 = 18;
                break;
            }
            case 54: {
                n3 = 9;
                break;
            }
            case 55: {
                n3 = 43;
                break;
            }
            case 56: {
                n3 = 60;
                break;
            }
            case 57: {
                n3 = 2;
                break;
            }
            case 58: {
                n3 = 8;
                break;
            }
            case 59: {
                n3 = 40;
                break;
            }
            case 60: {
                n3 = 62;
                break;
            }
            case 61: {
                n3 = 57;
                break;
            }
            case 62: {
                n3 = 28;
                break;
            }
            default: {
                n3 = 63;
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
        AsyncExecutionCoordinator.rb[n4] = new String(cArray);
        return n4;
    }

    private void I(double d2, double d3) {
        block3: {
            block2: {
                try {
                    if (!(d2 > d3)) break block2;
                    this.xm = true;
                    this.x8 = this.N().W() - 0.5;
                    this.xZ = this.N().W() - 0.5;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsyncExecutionCoordinator.c(customSystemException);
                }
            }
            this.xm = false;
        }
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method p(long l, long l2) {
        int n = AsyncExecutionCoordinator.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n];
                int n3 = string2.indexOf(8);
                clazz3 = AsyncExecutionCoordinator.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsyncExecutionCoordinator.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsyncExecutionCoordinator.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsyncExecutionCoordinator.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsyncExecutionCoordinator.n(246241018540939L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsyncExecutionCoordinator.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsyncExecutionCoordinator.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsyncExecutionCoordinator.n(246241018540939L, 0L);
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

    @Override
    @Nullable
    public <T extends AbstractComputationKernel> T o(Class<T> clazz) {
        AbstractComputationKernel abstractComputationKernel;
        try {
            abstractComputationKernel = clazz.isInstance(this.xM) ? (AbstractComputationKernel)clazz.cast(this.xM) : null;
        }
        catch (CustomSystemException customSystemException) {
            throw AsyncExecutionCoordinator.c(customSystemException);
        }
        return (T)abstractComputationKernel;
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

    static Runnable d(AsyncExecutionCoordinator asyncExecutionCoordinator) {
        return asyncExecutionCoordinator.xR;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6D23;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AsyncExecutionCoordinator.fb[n2] = n3;
        }
        return fb[n2];
    }

    private void Y() {
        this.xZ = this.N().W() + this.N().b() + 4.0;
    }

    private void J() {
        int n;
        double d2;
        double d3 = this.N().G() + this.N().w() / 2.0;
        double d4 = d3 - 4.0;
        double d5 = this.xZ;
        try {
            d2 = this.xZ;
            n = this.xm ? 3 : -3;
        }
        catch (CustomSystemException customSystemException) {
            throw AsyncExecutionCoordinator.c(customSystemException);
        }
        double d6 = d2 + (double)n;
        double d7 = d3 + 4.0;
        double d8 = d5;
        ConfigurationManager.m(d4, d5, d3, d6, d7, d8, this.xM.l());
    }

    private void z() {
        long l = ab ^ 0x1CD4BC3F1DE3L;
        this.x8 = this.N().W() + this.N().b() + 4.0;
        double d2 = this.x8 + this.xM.b();
        double d3 = this.P().W() + this.P().b();
        this.I(d2, d3);
        this.l();
        boolean bl = this.xm;
        try {
            if (this.xS) {
                this.xm = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsyncExecutionCoordinator.c(customSystemException);
        }
        int n = this.S(this.xm);
        this.xm = bl;
        int n2 = (int)(this.N().G() + this.N().w() / 2.0 - this.P().G() - this.xM.w() / 2.0);
        String string = (String)((Object)AsyncExecutionCoordinator.e("K", (int)AsyncExecutionCoordinator.d("x", (int)11762, (long)(0x26CE668E3F2C00B4L ^ l)), (long)-4582665599839254892L, (long)l)) + n2 + (String)((Object)AsyncExecutionCoordinator.e("K", (int)AsyncExecutionCoordinator.d("x", (int)16700, (long)(0x3B7075450CFB6C7BL ^ l)), (long)-4582665599839254892L, (long)l)) + n;
        this.xv.d().F(this.xM, string);
    }

    private static void X() {
        Object[] objectArray = qb;
        qb[0] = "l\t=";
        objectArray[1] = Integer.TYPE;
        AsyncExecutionCoordinator.rb[1] = "java/lang/Integer";
        objectArray[2] = "\u001b\u0002!|*$\u0010\r03W<\u0003\n9z";
        objectArray[3] = "9}\u000ew\u0012\f2r\u001f8s\u00029y\u001bb";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "I\\V\b`\u000e\u0019\u0005\u0018v4O#U\u0017\u000b\"UG\u0014W\u000ec4\u0019T\u0012\u0018;LL\f\u0019\t_";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AsyncExecutionCoordinator.ab = MultiContainerRegistry.a(2289759021957137848L, 7366815250870884353L, MethodHandles.lookup().lookupClass()).a(83167137268222L);
                AsyncExecutionCoordinator.qb = new Object[5];
                AsyncExecutionCoordinator.rb = new String[5];
                AsyncExecutionCoordinator.X();
                AsyncExecutionCoordinator.lb = new HashMap<K, V>(13);
                var0 = AsyncExecutionCoordinator.ab ^ 20422073505128L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "RD{\u001db\u00a8\u00b1\u0088\u00f6\u00ac\u00e4Sa\u00ba\u0019\u000f";
                var7_6 = "RD{\u001db\u00a8\u00b1\u0088\u00f6\u00ac\u00e4Sa\u00ba\u0019\u000f".length();
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
                    var6_5 = "\"w|\u00d3\u0001\u000f.\u00bb\u00d4\u00fe\u00b0\u00e1\u00b9\u009d\u00ee\u0000";
                    var7_6 = "\"w|\u00d3\u0001\u000f.\u00bb\u00d4\u00fe\u00b0\u00e1\u00b9\u009d\u00ee\u0000".length();
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
        AsyncExecutionCoordinator.eb = var8_3;
        AsyncExecutionCoordinator.fb = new Integer[4];
    }

    public void P(boolean bl) {
        this.xy = bl;
    }

    public AsyncExecutionCoordinator(AbstractComputationKernel abstractComputationKernel, AbstractComputationKernel abstractComputationKernel2) {
        super(abstractComputationKernel, new CryptographicKeyGenerator2118(0.0, 0.0, abstractComputationKernel2));
        this.xM = abstractComputationKernel2;
        this.xv = (GraphicalRenderEngine1082)this.S();
        this.xv.n(abstractComputationKernel2, new Object[0]);
        this.xv.Q(new Color(0, 0, 0, 130));
        this.xv.i(true);
        this.xv.M();
        this.xv.Y(this.P().w());
        this.xv.P(this.P().b() + (double)(this.P().C() ? 2 : 0));
        this.xv.l(new _k(this));
        this.P(new ResourceAllocationTracker1709(this, abstractComputationKernel2));
    }

    @Nullable
    public Runnable E() {
        return this.xR;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = AsyncExecutionCoordinator.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsyncExecutionCoordinator.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private int S(boolean bl) {
        try {
            if (bl) {
                return (int)(this.N().W() - this.xM.b() - this.P().W());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsyncExecutionCoordinator.c(customSystemException);
        }
        return (int)(this.x8 - this.P().W());
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AsyncExecutionCoordinator.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                AsyncExecutionCoordinator.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public boolean j(double d2, double d3) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!super.j(d2, d3) && !this.xM.G()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsyncExecutionCoordinator.c(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsyncExecutionCoordinator.c(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsyncExecutionCoordinator.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void N(double d2) {
        this.xS = true;
        this.x0 = d2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AsyncExecutionCoordinator.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void l() {
        if (this.xS) {
            double d2 = this.N().W() + this.x0;
            this.x8 = d2 - this.xM.b();
            this.xZ = d2;
            this.xm = true;
        }
    }

    @Override
    public boolean G() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!super.G() && !this.xM.G()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsyncExecutionCoordinator.c(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsyncExecutionCoordinator.c(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Field o(long l, long l2) {
        int n = AsyncExecutionCoordinator.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = AsyncExecutionCoordinator.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsyncExecutionCoordinator.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsyncExecutionCoordinator.g(clazz3, string2, clazz2)) != null) {
                    AsyncExecutionCoordinator.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsyncExecutionCoordinator.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsyncExecutionCoordinator.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsyncExecutionCoordinator.n(246241018540939L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsyncExecutionCoordinator.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AsyncExecutionCoordinator.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

