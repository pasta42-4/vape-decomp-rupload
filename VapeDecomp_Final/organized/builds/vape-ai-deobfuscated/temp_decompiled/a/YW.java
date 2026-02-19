/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.FS;
import a.O_;
import a.Sz;
import a.d8;
import a.ht;
import a.yC;
import a.yG;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class yw
extends yG {
    private boolean M3;
    private int MD;
    private static final Map fb;
    private CompletableFuture<List<ht>> M9;
    @Nullable
    private FS<?> MR;
    private long Mo;
    @Nullable
    private Supplier<CompletableFuture<List<ht>>> MH;
    private static final Integer[] eb;
    @Nullable
    private yG M8;
    private int MA;
    private long MB;
    private static final long ab;
    private static final Object[] lb;
    private yC Ma;
    private static final long[] bb;
    private boolean M_;
    private int MT;
    private List<ht> MF;
    private int M5;
    @Nullable
    private Supplier<ht> M1;
    private static final String[] mb;

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Nullable
    public FS<?> x() {
        return this.MR;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method l(long l10, long l11) {
        int n2 = yw.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = yw.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = yw.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yw.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        yw.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yw.j(246881809654294L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = yw.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        yw.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yw.j(246881809654294L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    public yw(double d2, double d3) {
        this(d2, d3, 1);
    }

    public void Q(@Nullable yG yG2) {
        this.M8 = yG2;
    }

    public void Y(List<ht> list) {
        this.MF = list;
    }

    public void M(long l10) {
        this.MB = l10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = d8.a(-3268025833938630130L, -1560913727741128907L, MethodHandles.lookup().lookupClass()).a(150631630366912L);
        lb = new Object[5];
        mb = new String[5];
        yw.D();
        fb = new HashMap(13);
        long l10 = ab ^ 0x644EA28A3667L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u00d4\u001bG>J\u0097\u00ebmy\u00car\u00bc\u009d\u001e\u00ea\u00e8\u00ffm\"[\u00b3hvK";
        int n3 = "\u00d4\u001bG>J\u0097\u00ebmy\u00car\u00bc\u009d\u001e\u00ea\u00e8\u00ffm\"[\u00b3hvK".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        bb = lArray;
        eb = new Integer[3];
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = yw.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = yw.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = yw.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void x(int n2) {
        this.MD = n2;
    }

    public long T() {
        return this.MB;
    }

    @Override
    public void f() {
        super.f();
        this.s(true);
    }

    @Override
    public double z() {
        try {
            if (this.M8 != null) {
                return this.d().R();
            }
        }
        catch (O_ o_2) {
            throw yw.a(o_2);
        }
        return super.z();
    }

    public void D(@Nullable Supplier<ht> supplier) {
        this.M1 = supplier;
    }

    @Override
    public void S(Sz sz2) {
        block4: {
            try {
                try {
                    if (!this.Ma.f() || !this.Ma.G()) break block4;
                }
                catch (O_ o_2) {
                    throw yw.a(o_2);
                }
                this.Ma.S(sz2);
                return;
            }
            catch (O_ o_3) {
                throw yw.a(o_3);
            }
        }
        super.S(sz2);
    }

    @Override
    public void J(ht ht2) {
        super.J(ht2);
        --this.MA;
    }

    public int i() {
        return this.MT;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = yw.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void G(int n2) {
        this.MT = n2;
    }

    private void x() {
        this.X();
        Supplier<CompletableFuture<List<ht>>> supplier = this.MH;
        try {
            if (supplier == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw yw.a(o_2);
        }
        Supplier<ht> supplier2 = this.M1;
        if (supplier2 != null) {
            int n2;
            block9: {
                n2 = this.MD;
                FS<?> fS2 = this.MR;
                try {
                    if (fS2 == null || this.Mo <= fS2.j()) break block9;
                }
                catch (O_ o_3) {
                    throw yw.a(o_3);
                }
                n2 = (int)fS2.L() % this.MD;
            }
            ArrayList<ht> arrayList = new ArrayList<ht>();
            try {
                for (int i10 = 0; i10 < n2; ++i10) {
                    arrayList.add(supplier2.get());
                }
            }
            catch (O_ o_4) {
                throw yw.a(o_4);
            }
            this.o(arrayList.toArray(new ht[0]));
            this.Y(arrayList);
        }
        AtomicReference<CompletableFuture<List<ht>>> atomicReference = new AtomicReference<CompletableFuture<List<ht>>>();
        this.M9 = ((CompletableFuture)supplier.get().whenCompleteAsync((arg_0, arg_1) -> this.lambda$loadNewContent$1(atomicReference, arg_0, arg_1), (Executor)Ao.st)).exceptionally(this::lambda$loadNewContent$2);
        atomicReference.set(this.M9);
    }

    private void lambda$new$0() {
        yG yG2 = this.Z();
        yG2.e(0.0);
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (mb[n5] != null) {
            return n5;
        }
        Object object = lb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 18;
                break;
            }
            case 1: {
                n4 = 22;
                break;
            }
            case 2: {
                n4 = 4;
                break;
            }
            case 3: {
                n4 = 51;
                break;
            }
            case 4: {
                n4 = 25;
                break;
            }
            case 5: {
                n4 = 52;
                break;
            }
            case 6: {
                n4 = 42;
                break;
            }
            case 7: {
                n4 = 50;
                break;
            }
            case 8: {
                n4 = 53;
                break;
            }
            case 9: {
                n4 = 36;
                break;
            }
            case 10: {
                n4 = 2;
                break;
            }
            case 11: {
                n4 = 23;
                break;
            }
            case 12: {
                n4 = 44;
                break;
            }
            case 13: {
                n4 = 38;
                break;
            }
            case 14: {
                n4 = 54;
                break;
            }
            case 15: {
                n4 = 13;
                break;
            }
            case 16: {
                n4 = 35;
                break;
            }
            case 17: {
                n4 = 24;
                break;
            }
            case 18: {
                n4 = 1;
                break;
            }
            case 19: {
                n4 = 63;
                break;
            }
            case 20: {
                n4 = 14;
                break;
            }
            case 21: {
                n4 = 12;
                break;
            }
            case 22: {
                n4 = 34;
                break;
            }
            case 23: {
                n4 = 49;
                break;
            }
            case 24: {
                n4 = 31;
                break;
            }
            case 25: {
                n4 = 21;
                break;
            }
            case 26: {
                n4 = 17;
                break;
            }
            case 27: {
                n4 = 40;
                break;
            }
            case 28: {
                n4 = 28;
                break;
            }
            case 29: {
                n4 = 19;
                break;
            }
            case 30: {
                n4 = 6;
                break;
            }
            case 31: {
                n4 = 58;
                break;
            }
            case 32: {
                n4 = 61;
                break;
            }
            case 33: {
                n4 = 57;
                break;
            }
            case 34: {
                n4 = 30;
                break;
            }
            case 35: {
                n4 = 10;
                break;
            }
            case 36: {
                n4 = 37;
                break;
            }
            case 37: {
                n4 = 41;
                break;
            }
            case 38: {
                n4 = 55;
                break;
            }
            case 39: {
                n4 = 16;
                break;
            }
            case 40: {
                n4 = 45;
                break;
            }
            case 41: {
                n4 = 9;
                break;
            }
            case 42: {
                n4 = 46;
                break;
            }
            case 43: {
                n4 = 32;
                break;
            }
            case 44: {
                n4 = 33;
                break;
            }
            case 45: {
                n4 = 56;
                break;
            }
            case 46: {
                n4 = 11;
                break;
            }
            case 47: {
                n4 = 8;
                break;
            }
            case 48: {
                n4 = 48;
                break;
            }
            case 49: {
                n4 = 5;
                break;
            }
            case 50: {
                n4 = 43;
                break;
            }
            case 51: {
                n4 = 27;
                break;
            }
            case 52: {
                n4 = 39;
                break;
            }
            case 53: {
                n4 = 59;
                break;
            }
            case 54: {
                n4 = 60;
                break;
            }
            case 55: {
                n4 = 26;
                break;
            }
            case 56: {
                n4 = 3;
                break;
            }
            case 57: {
                n4 = 29;
                break;
            }
            case 58: {
                n4 = 47;
                break;
            }
            case 59: {
                n4 = 62;
                break;
            }
            case 60: {
                n4 = 0;
                break;
            }
            case 61: {
                n4 = 7;
                break;
            }
            case 62: {
                n4 = 15;
                break;
            }
            default: {
                n4 = 20;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        yw.mb[n5] = new String(cArray);
        return n5;
    }

    private static Field k(long l10, long l11) {
        int n2 = yw.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = yw.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = yw.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yw.e(clazz3, string2, clazz2)) != null) {
                    yw.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = yw.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        yw.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yw.j(246881809654294L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void E(int n2) {
        this.M5 = n2;
    }

    @Override
    public double e() {
        try {
            if (this.M8 != null) {
                return this.d().C();
            }
        }
        catch (O_ o_2) {
            throw yw.a(o_2);
        }
        return super.e();
    }

    public yw(double d2, double d3, int n2) {
        long l10 = ab ^ 0x706BDABBEA83L;
        super(d2, d3);
        this.M_ = false;
        this.MF = new ArrayList<ht>();
        this.MT = 1;
        this.MD = (int)yw.c("f", (int)29801, (long)(0x3296B5B8230D7EF3L ^ l10));
        this.M5 = 1;
        this.Ma = new yC((String)((Object)yw.d("\u00c3", (int)yw.c("f", (int)26225, (long)(0x6CEE4BF778CFECE8L ^ l10)), (long)-2648855350555567143L, (long)l10)), 8.0, 8.0, 15.0, 15.0, Color.WHITE, yw.M.q, new Color(255, 255, 255, 64));
        this.MB = n2;
        this.Mo = n2;
        this.Ma.x(6.0);
        this.Ma.X(6.0);
        this.Ma.H(yw.M.Z);
        this.Ma.a(yw.M.g, yw.M.g.brighter());
        this.Ma.M(yw.M.S);
        this.Ma.k(0.75f);
        this.Ma.i(true);
        this.Ma.T(14.0);
        this.Ma.w(10.0);
        this.Ma.Y(5.0f);
        this.Ma.w(true);
        this.Ma.u(true);
        this.Ma.N(this::lambda$new$0);
    }

    public int Z() {
        return this.M5;
    }

    @Nullable
    public Supplier<CompletableFuture<List<ht>>> v() {
        return this.MH;
    }

    private yG Z() {
        yG yG2;
        try {
            yG2 = this.M8 != null ? this.M8 : this;
        }
        catch (O_ o_2) {
            throw yw.a(o_2);
        }
        return yG2;
    }

    @Override
    public void g() {
        block4: {
            try {
                try {
                    if (!this.Ma.f() || !this.Ma.G()) break block4;
                }
                catch (O_ o_2) {
                    throw yw.a(o_2);
                }
                this.Ma.g();
            }
            catch (O_ o_3) {
                throw yw.a(o_3);
            }
        }
    }

    private void X() {
        CompletableFuture<List<ht>> completableFuture = this.M9;
        try {
            if (completableFuture != null) {
                completableFuture.cancel(true);
                this.M9 = null;
                this.r(this.MF, new ArrayList<ht>());
                this.MF.clear();
            }
        }
        catch (O_ o_2) {
            throw yw.a(o_2);
        }
    }

    private static void D() {
        Object[] objectArray = lb;
        lb[0] = "\u0013S\u000e";
        objectArray[1] = Integer.TYPE;
        yw.mb[1] = "java/lang/Integer";
        objectArray[2] = "[\u0018$`*]P\u00175/WEC\u0010<f";
        objectArray[3] = "dvG!o\u007foyVn\u000eqdrR4";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "4/O<\u0012{3pR\u0000\t=T.\u0016i]?7+U>\\Fmy\u001dk\u001dy6rW:b";
    }

    private List lambda$loadNewContent$2(Throwable throwable) {
        this.M9 = null;
        return null;
    }

    @Override
    public void d() {
        try {
            super.d();
            if (this.Ma.f()) {
                this.Ma.d();
            }
        }
        catch (O_ o_2) {
            throw yw.a(o_2);
        }
    }

    @Nullable
    public Supplier<ht> Y() {
        return this.M1;
    }

    public void a(@Nullable Supplier<CompletableFuture<List<ht>>> supplier) {
        this.MH = supplier;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public long f() {
        return this.Mo;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = yw.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                yw.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void Z(@Nullable FS<?> fS2) {
        block4: {
            try {
                try {
                    this.MR = fS2;
                    if (fS2 == null || !fS2.a()) break block4;
                }
                catch (O_ o_2) {
                    throw yw.a(o_2);
                }
                this.M_ = true;
            }
            catch (O_ o_3) {
                throw yw.a(o_3);
            }
        }
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = yw.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = yw.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void y() {
        List<ht> list = this.A();
        double d2 = this.V();
        super.k();
        this.MA = 0;
        for (ht ht2 : list) {
            this.n(ht2, new Object[0]);
        }
        this.R(d2);
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x51A7;
        if (eb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yw", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            yw.eb[n3] = n4;
        }
        return eb[n3];
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Nullable
    public yG k() {
        return this.M8;
    }

    public int b() {
        return this.MD;
    }

    @Override
    public void n(ht ht2, Object ... objectArray) {
        Object object;
        Object[] objectArray2;
        ht ht3;
        yw yw2;
        boolean bl2;
        long l10;
        block13: {
            block12: {
                l10 = ab ^ 0x457516A797D0L;
                try {
                    block11: {
                        try {
                            try {
                                if (this.MT == 1) break block11;
                                if (this.MA <= 0) break block12;
                            }
                            catch (O_ o_2) {
                                throw yw.a(o_2);
                            }
                            if ((this.MA + 1) % this.MT != 0) break block12;
                        }
                        catch (O_ o_3) {
                            throw yw.a(o_3);
                        }
                    }
                    bl2 = true;
                    break block13;
                }
                catch (O_ o_4) {
                    throw yw.a(o_4);
                }
            }
            bl2 = false;
        }
        boolean bl3 = bl2;
        try {
            yw2 = this;
            ht3 = ht2;
            Object[] objectArray3 = new Object[1];
            Object[] objectArray4 = objectArray3;
            objectArray2 = objectArray3;
            int n2 = 0;
            object = bl3 ? yw.d("\u00c3", (int)yw.c("f", (int)21378, (long)(0x789B212FF23DA44AL ^ l10)), (long)-6454127718754523510L, (long)l10) : "";
        }
        catch (O_ o_5) {
            throw yw.a(o_5);
        }
        try {
            objectArray4[n2] = object;
            super.n(ht3, objectArray2);
            ++this.MA;
            if (this.M8 != null) {
                this.P(this.d().R());
                this.i(this.F());
            }
        }
        catch (O_ o_6) {
            throw yw.a(o_6);
        }
    }

    private void lambda$loadNewContent$1(AtomicReference atomicReference, List list, Throwable throwable) {
        block12: {
            block11: {
                try {
                    if (throwable != null) {
                        this.M9 = null;
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw yw.a(o_2);
                }
                try {
                    if (list == null) {
                        this.M9 = null;
                        return;
                    }
                }
                catch (O_ o_3) {
                    throw yw.a(o_3);
                }
                try {
                    if (atomicReference.get() != this.M9) {
                        return;
                    }
                }
                catch (O_ o_4) {
                    throw yw.a(o_4);
                }
                try {
                    this.r(this.MF, list);
                    this.MF.clear();
                    if (!list.isEmpty()) break block11;
                    this.M_ = true;
                    break block12;
                }
                catch (O_ o_5) {
                    throw yw.a(o_5);
                }
            }
            ++this.Mo;
        }
        this.M3 = true;
        this.M9 = null;
    }

    private void s(boolean bl2) {
        block8: {
            block7: {
                try {
                    try {
                        this.Mo = this.MB;
                        if (this.MR == null || !this.MR.a()) break block7;
                    }
                    catch (O_ o_2) {
                        throw yw.a(o_2);
                    }
                    this.M_ = true;
                    break block8;
                }
                catch (O_ o_3) {
                    throw yw.a(o_3);
                }
            }
            this.M_ = false;
        }
        try {
            this.M3 = false;
            this.MA = 0;
            if (!bl2) {
                this.k();
            }
        }
        catch (O_ o_4) {
            throw yw.a(o_4);
        }
        this.X();
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void i() {
        block16: {
            try {
                if (this.M9 != null) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw yw.a(o_2);
            }
            yG yG2 = this.Z();
            try {
                if (this.M3) {
                    this.M3 = false;
                    return;
                }
            }
            catch (O_ o_3) {
                throw yw.a(o_3);
            }
            try {
                if (yG2.V() == 0.0) {
                    return;
                }
            }
            catch (O_ o_4) {
                throw yw.a(o_4);
            }
            int n2 = this.A().size();
            int n3 = 0;
            double d2 = yG2.W() + yG2.b();
            for (ht ht2 : this.A()) {
                try {
                    if (!(ht2.W() + ht2.b() / 2.0 <= d2)) break;
                    ++n3;
                }
                catch (O_ o_5) {
                    throw yw.a(o_5);
                }
            }
            int n4 = n2 - n3;
            try {
                try {
                    if (n4 > this.M5 || this.M_) break block16;
                }
                catch (O_ o_6) {
                    throw yw.a(o_6);
                }
                this.x();
            }
            catch (O_ o_7) {
                throw yw.a(o_7);
            }
        }
    }

    @Override
    public void k() {
        super.k();
        this.s(true);
    }

    public void I() {
        this.s(false);
        this.x();
    }

    public void r(List<ht> list, List<ht> list2) {
        double d2 = this.V();
        for (ht ht2 : list) {
            this.J(ht2);
        }
        for (ht ht2 : list2) {
            this.n(ht2, new Object[0]);
        }
        this.y();
        this.R(d2);
    }

    @Override
    public void E() {
        boolean bl2;
        yC yC2;
        super.E();
        yG yG2 = this.Z();
        try {
            this.Ma.b(this.G() + (this.w() - 18.0));
            this.Ma.M(yG2.W() + 4.0);
            yC2 = this.Ma;
            bl2 = yG2.V() < -yG2.b();
        }
        catch (O_ o_2) {
            throw yw.a(o_2);
        }
        try {
            yC2.N(bl2);
            if (this.Ma.f()) {
                this.Ma.E();
            }
        }
        catch (O_ o_3) {
            throw yw.a(o_3);
        }
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'W' || c10 == 'v' || c10 == '\u00d5' || c10 == '\u00d9') {
                field = yw.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'v' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yw.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yw.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(yw.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

