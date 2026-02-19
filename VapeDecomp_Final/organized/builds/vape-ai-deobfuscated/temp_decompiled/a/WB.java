/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.Cb;
import a.F8;
import a.O_;
import a.RH;
import a.SE;
import a.bE;
import a.cz;
import a.d8;
import a.f1;
import a.hF;
import a.hU;
import a.kf;
import a.rv;
import a.wB;
import a.wr;
import a.y5;
import a.yG;
import a.yx;
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
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wb
extends yG {
    private boolean dQ;
    private final Runnable dN;
    private static final long[] bb;
    private yG dy;
    private final yG di;
    private final y5 dY;
    public static final double dG = 324.0;
    private static final Object[] lb;
    public static final double dh = 240.0;
    private static final Map fb;
    private static final long ab;
    private final yG d_;
    private static final String[] mb;
    private static final Integer[] eb;

    private void lambda$new$0() {
        this.m();
        this.dN.run();
    }

    private void lambda$new$1() {
        this.e(false);
        this.dY.v();
    }

    static yG c(wb wb2) {
        return wb2.d_;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = wb.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void m() {
        ArrayList<String> arrayList;
        boolean bl2;
        long l10 = ab ^ 0x6A00B97CD167L;
        String string = this.dY.o().a().trim();
        try {
            boolean bl3 = bl2 = !string.isEmpty();
        }
        catch (O_ o_2) {
            throw wb.a(o_2);
        }
        if (!bl2) {
            arrayList = new ArrayList<String>(SE.h.u().f());
        } else {
            ArrayList arrayList2;
            hF hF2 = this.dY.o().V();
            try {
                arrayList2 = hF2 != null ? hF2.U() : new ArrayList();
            }
            catch (O_ o_3) {
                throw wb.a(o_3);
            }
            arrayList = arrayList2;
        }
        this.d_.k();
        double d2 = 0.0;
        for (String string2 : arrayList) {
            try {
                if (this.dY.t(string2)) {
                    continue;
                }
            }
            catch (O_ o_4) {
                throw wb.a(o_4);
            }
            RH rH2 = new RH(string2);
            wr wr2 = new wr(0.0, 0.0, 1.0, 1.0, rH2);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            rH2.l(new rv(this, atomicBoolean, wr2, rH2));
            double d3 = wr2.w();
            try {
                if (d2 + d3 >= this.d_.w()) {
                    break;
                }
            }
            catch (O_ o_5) {
                throw wb.a(o_5);
            }
            d2 += d3;
            this.d_.n(wr2, wb.d("\u00fa", (int)wb.c("h", (int)11680, (long)(0x186D55A130DE8D27L ^ l10)), (long)6682335563310332207L, (long)l10));
        }
    }

    private void e(boolean bl2) {
        boolean bl3;
        block8: {
            block7: {
                boolean bl4;
                try {
                    bl4 = this.dQ != bl2;
                }
                catch (O_ o_2) {
                    throw wb.a(o_2);
                }
                bl3 = bl4;
                try {
                    this.dQ = bl2;
                    if (!this.dQ) break block7;
                    this.dy.N(false);
                    this.dY.C().N(true);
                    this.di.w(44.0);
                    this.di.P(44.0);
                    this.d_.N(true);
                    break block8;
                }
                catch (O_ o_3) {
                    throw wb.a(o_3);
                }
            }
            this.dy.N(true);
            this.dY.C().N(false);
            this.di.w(26.0);
            this.di.P(26.0);
            this.d_.N(false);
        }
        try {
            this.dY.h(true);
            this.di.h(true);
            if (bl3) {
                this.m();
            }
        }
        catch (O_ o_4) {
            throw wb.a(o_4);
        }
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "C\u0016l";
        objectArray[1] = Integer.TYPE;
        wb.mb[1] = "java/lang/Integer";
        objectArray[2] = "L(L\u0014\r$G'][p<T T\u0012";
        objectArray[3] = "}}/>\u001e\u0004vr>q\u007f\n}y:+";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "f4M\u0015$+3wUdp)_3FXk)4{I\rvRfrUZ}j\"nG\n\u001b";
    }

    public y5 h() {
        return this.dY;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = wb.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00ec' || c10 == 'C' || c10 == 'Q' || c10 == 'R') {
                field = wb.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00ec' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wb.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ee' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00fa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$null$2(AtomicBoolean atomicBoolean, String string) {
        while (atomicBoolean.get()) {
            block7: {
                try {
                    Thread.sleep(200L);
                }
                catch (InterruptedException interruptedException) {
                    SE.W(interruptedException);
                }
                String string2 = this.dY.o().a().trim();
                try {
                    if (!string2.equalsIgnoreCase(string)) break block7;
                    if (!string2.isEmpty()) continue;
                }
                catch (InterruptedException interruptedException) {
                    throw wb.a(interruptedException);
                }
                atomicBoolean.set(false);
                return;
            }
            try {
                this.dN.run();
            }
            catch (Throwable throwable) {
                SE.W(throwable);
            }
            atomicBoolean.set(false);
            return;
        }
    }

    private void I() {
        block3: {
            block2: {
                try {
                    if (!this.dQ) break block2;
                    F8.C(this.di.G(), this.di.W(), this.di.w(), this.di.b(), wb.M.S, 2.0f);
                    F8.g(this.di.G() + 5.0, this.di.W() + this.dY.b(), this.di.G() + this.di.w() - 5.0, this.di.W() + this.dY.b(), 0.75f, wb.M.k);
                    F8.U(this.di.G(), this.di.W(), this.di.w(), this.di.b(), wb.M.k, 2.0f, 0.75f, 1.0f);
                    break block3;
                }
                catch (O_ o_2) {
                    throw wb.a(o_2);
                }
            }
            F8.U(this.dY.G(), this.dY.W(), this.dY.w(), this.dY.b(), wb.M.k, 2.0f, 0.75f, 1.0f);
        }
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = wb.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                wb.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static void E(wb wb2) {
        wb2.I();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void L() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.dY.o().g().add(0, (arg_0, arg_1) -> this.lambda$addInputListener$3(atomicBoolean, arg_0, arg_1));
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = wb.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = wb.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = wb.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = wb.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void lambda$addCategoryContainers$4(cz cz2) {
        f1 f12 = Ao.D(f1.class);
        try {
            if (f12.v() != cz2) {
                f12.z(cz2);
                f12.D().I();
            }
        }
        catch (O_ o_2) {
            throw wb.a(o_2);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                wb.ab = d8.a(-3308027248531286145L, -5422661896137536316L, MethodHandles.lookup().lookupClass()).a(176919955119242L);
                wb.lb = new Object[5];
                wb.mb = new String[5];
                wb.x();
                wb.fb = new HashMap<K, V>(13);
                var0 = wb.ab ^ 18773052549033L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u000b\u0011\u00c3\u00f0\u00a0\u00f3\u00ad\u00f4Uo\u00be0d\u00cf\u00b1\u009a~\u00f7\u007f\u00f5\u0098{\u00c0\u0015";
                var7_6 = "\u000b\u0011\u00c3\u00f0\u00a0\u00f3\u00ad\u00f4Uo\u00be0d\u00cf\u00b1\u009a~\u00f7\u007f\u00f5\u0098{\u00c0\u0015".length();
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
                    var6_5 = "ok\u00cd\u009fB\u00fe\u00d5\u00ac\u00d727\u00f8P\u0019J\b";
                    var7_6 = "ok\u00cd\u009fB\u00fe\u00d5\u00ac\u00d727\u00f8P\u0019J\b".length();
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
        wb.bb = var8_3;
        wb.eb = new Integer[5];
    }

    private static Method l(long l10, long l11) {
        int n2 = wb.i(l10, l11);
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
                clazz3 = wb.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = wb.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wb.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        wb.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wb.j(225652435050616L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = wb.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        wb.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wb.j(225652435050616L, 0L);
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

    static y5 f(wb wb2) {
        return wb2.dY;
    }

    private static Field k(long l10, long l11) {
        int n2 = wb.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = wb.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = wb.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wb.e(clazz3, string2, clazz2)) != null) {
                    wb.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = wb.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        wb.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wb.j(225652435050616L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7C3B;
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
                throw new RuntimeException("a/wb", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wb.eb[n3] = n4;
        }
        return eb[n3];
    }

    public wb(double d2, Runnable runnable) {
        long l10 = ab ^ 0x593B98E3668FL;
        super(d2, 42.0);
        this.dQ = false;
        this.d().f((String)((Object)wb.d("\u00fa", (int)wb.c("h", (int)13200, (long)(0x66A208C37C6FA4FEL ^ l10)), (long)-1489460086172692793L, (long)l10)));
        this.dN = runnable;
        this.R();
        Runnable runnable2 = this::lambda$new$0;
        this.dY = new yx(this, (String)((Object)wb.d("\u00fa", (int)wb.c("h", (int)17485, (long)(0x529678ED0235D321L ^ l10)), (long)-1489460086172692793L, (long)l10)), runnable2, d2, 20.0, false, false);
        this.dY.o().M(new kf());
        this.dY.C().C(this::lambda$new$1);
        this.d_ = new yG(d2 - 8.0, 16.0);
        this.d_.i(false);
        this.di = new wB(this, d2, 26.0);
        this.di.i(false);
        this.di.d().f((String)((Object)wb.d("\u00fa", (int)wb.c("h", (int)27401, (long)(0x5E3BF913BD63FC63L ^ l10)), (long)-1489460086172692793L, (long)l10)));
        this.di.n(this.dY, new Object[0]);
        this.di.n(new bE(1.0, 4.0), new Object[0]);
        this.di.n(new wr(3.0, 0.0, 4.0, 4.0, this.d_), new Object[0]);
        this.n(this.di, new Object[0]);
        this.n(this.dy, new Object[0]);
        this.L();
        this.e(false);
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
                n4 = 62;
                break;
            }
            case 1: {
                n4 = 30;
                break;
            }
            case 2: {
                n4 = 2;
                break;
            }
            case 3: {
                n4 = 51;
                break;
            }
            case 4: {
                n4 = 56;
                break;
            }
            case 5: {
                n4 = 4;
                break;
            }
            case 6: {
                n4 = 46;
                break;
            }
            case 7: {
                n4 = 41;
                break;
            }
            case 8: {
                n4 = 7;
                break;
            }
            case 9: {
                n4 = 49;
                break;
            }
            case 10: {
                n4 = 11;
                break;
            }
            case 11: {
                n4 = 52;
                break;
            }
            case 12: {
                n4 = 13;
                break;
            }
            case 13: {
                n4 = 21;
                break;
            }
            case 14: {
                n4 = 3;
                break;
            }
            case 15: {
                n4 = 37;
                break;
            }
            case 16: {
                n4 = 33;
                break;
            }
            case 17: {
                n4 = 19;
                break;
            }
            case 18: {
                n4 = 24;
                break;
            }
            case 19: {
                n4 = 50;
                break;
            }
            case 20: {
                n4 = 53;
                break;
            }
            case 21: {
                n4 = 0;
                break;
            }
            case 22: {
                n4 = 28;
                break;
            }
            case 23: {
                n4 = 8;
                break;
            }
            case 24: {
                n4 = 6;
                break;
            }
            case 25: {
                n4 = 12;
                break;
            }
            case 26: {
                n4 = 9;
                break;
            }
            case 27: {
                n4 = 55;
                break;
            }
            case 28: {
                n4 = 34;
                break;
            }
            case 29: {
                n4 = 25;
                break;
            }
            case 30: {
                n4 = 40;
                break;
            }
            case 31: {
                n4 = 20;
                break;
            }
            case 32: {
                n4 = 36;
                break;
            }
            case 33: {
                n4 = 29;
                break;
            }
            case 34: {
                n4 = 54;
                break;
            }
            case 35: {
                n4 = 44;
                break;
            }
            case 36: {
                n4 = 61;
                break;
            }
            case 37: {
                n4 = 5;
                break;
            }
            case 38: {
                n4 = 58;
                break;
            }
            case 39: {
                n4 = 35;
                break;
            }
            case 40: {
                n4 = 23;
                break;
            }
            case 41: {
                n4 = 26;
                break;
            }
            case 42: {
                n4 = 63;
                break;
            }
            case 43: {
                n4 = 32;
                break;
            }
            case 44: {
                n4 = 14;
                break;
            }
            case 45: {
                n4 = 38;
                break;
            }
            case 46: {
                n4 = 27;
                break;
            }
            case 47: {
                n4 = 57;
                break;
            }
            case 48: {
                n4 = 15;
                break;
            }
            case 49: {
                n4 = 42;
                break;
            }
            case 50: {
                n4 = 1;
                break;
            }
            case 51: {
                n4 = 16;
                break;
            }
            case 52: {
                n4 = 43;
                break;
            }
            case 53: {
                n4 = 48;
                break;
            }
            case 54: {
                n4 = 47;
                break;
            }
            case 55: {
                n4 = 59;
                break;
            }
            case 56: {
                n4 = 45;
                break;
            }
            case 57: {
                n4 = 60;
                break;
            }
            case 58: {
                n4 = 31;
                break;
            }
            case 59: {
                n4 = 10;
                break;
            }
            case 60: {
                n4 = 39;
                break;
            }
            case 61: {
                n4 = 17;
                break;
            }
            case 62: {
                n4 = 22;
                break;
            }
            default: {
                n4 = 18;
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
        wb.mb[n5] = new String(cArray);
        return n5;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void R() {
        long l10 = ab ^ 0x16D04FE368B2L;
        this.dy = new yG(this.w(), 20.0);
        this.dy.i(false);
        this.dy.d().f((String)((Object)wb.d("\u00fa", (int)wb.c("h", (int)10589, (long)(0x4214825445B6300DL ^ l10)), (long)-1915982459803156230L, (long)l10)));
        for (cz cz2 : cz.VALUES) {
            hU hU2 = new hU(this, cz2.E().toUpperCase(), 0.7, wb.M.Y, wb.M.u, cz2);
            hU2.u(7.0f);
            hU2.f(true);
            hU2.q(false);
            double d2 = hU2.d();
            this.getClass();
            hU2.T(d2 + (double)(5.0f * 3.0f));
            hU2.w(14.0);
            hU2.C(() -> wb.lambda$addCategoryContainers$4(cz2));
            this.dy.n(hU2, new Object[0]);
        }
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$addInputListener$3(AtomicBoolean atomicBoolean, char c10, int n2) {
        Ao.st.execute(this::m);
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            String string = this.dY.o().a().trim();
            CompletableFuture.runAsync(() -> this.lambda$null$2(atomicBoolean, string));
        }
    }

    public Cb X() {
        return this.dY.o();
    }

    static void X(wb wb2, boolean bl2) {
        wb2.e(bl2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wb.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(wb.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

