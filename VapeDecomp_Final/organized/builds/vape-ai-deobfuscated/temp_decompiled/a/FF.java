/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.F8;
import a.I3;
import a.Io;
import a.O_;
import a.Ok;
import a.SB;
import a.SE;
import a.V4;
import a.X_;
import a.Yw;
import a.cb;
import a.d8;
import a.ep;
import a.ht;
import a.rp;
import a.vK;
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
public class ff
extends ht {
    private static final long b;
    private static final String[] ab;
    private boolean F;
    private static final Map V;
    @Nullable
    private vK R;
    private static final Integer[] D;
    private static final long[] v;
    private final rp E;
    private float n = 12.0f;
    private static final Object[] Y;
    private float B = 1.0f;
    private float L = 12.0f;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ff" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean C() {
        try {
            if (this.R == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw ff.a(o_2);
        }
        return this.T();
    }

    private void z() {
        block16: {
            Color color;
            Object object;
            block22: {
                block21: {
                    Object object2;
                    boolean bl2;
                    block20: {
                        String string;
                        block18: {
                            block19: {
                                long l10;
                                block17: {
                                    block15: {
                                        l10 = b ^ 0x73862F18B27AL;
                                        bl2 = this.E.T();
                                        string = this.E.g();
                                        try {
                                            if (!this.E.e()) break block15;
                                            this.g((String)((Object)ff.c("\u00a3", (int)ff.b("f", (int)5520, (long)(0x4B3AE1A83C3700ECL ^ l10)), (long)-5474576024348970794L, (long)l10)) + this.E.k());
                                            this.t(1.0).Q((String)((Object)ff.c("\u00a3", (int)ff.b("f", (int)23677, (long)(0x15B45D20B40C902L ^ l10)), (long)-5474576024348970794L, (long)l10)), this.G() + this.w() / 2.0, this.W() + this.b() / 2.0 - 4.0, ff.M.c);
                                            break block16;
                                        }
                                        catch (O_ o_2) {
                                            throw ff.a(o_2);
                                        }
                                    }
                                    if (this.E.i() != null) {
                                        object = this.E.i();
                                        try {
                                            try {
                                                if (!object.equals(I3.v) || !this.C()) break block17;
                                            }
                                            catch (O_ o_3) {
                                                throw ff.a(o_3);
                                            }
                                            return;
                                        }
                                        catch (O_ o_4) {
                                            throw ff.a(o_4);
                                        }
                                    }
                                }
                                try {
                                    try {
                                        this.g("");
                                        if (string != null) break block18;
                                        if (!this.F) break block19;
                                    }
                                    catch (O_ o_5) {
                                        throw ff.a(o_5);
                                    }
                                    object2 = ff.c("\u00a3", (int)ff.b("f", (int)22225, (long)(0x534D0BD2280EC3A8L ^ l10)), (long)-5474576024348970794L, (long)l10);
                                    break block20;
                                }
                                catch (O_ o_6) {
                                    throw ff.a(o_6);
                                }
                            }
                            object2 = null;
                            break block20;
                        }
                        object2 = string;
                    }
                    object = object2;
                    try {
                        try {
                            if (object == null) break block16;
                            if (!bl2) break block21;
                        }
                        catch (O_ o_7) {
                            throw ff.a(o_7);
                        }
                        color = Color.WHITE;
                        break block22;
                    }
                    catch (O_ o_8) {
                        throw ff.a(o_8);
                    }
                }
                color = ff.M.Y;
            }
            X_.B(color, (float)(this.G() + this.w() / 2.0 - (double)(this.n / 2.0f)), (float)(this.W() + this.b() / 2.0 - (double)(this.L / 2.0f)), (String)object, this.n, this.L, false);
        }
    }

    private void k(V4 v42, double d2, double d3, float f10) {
        F8.C(d2 - 1.0, d3 - 1.0, 10.0, 10.0, ff.M.m, 5.0f);
        F8.G(v42, f10, d2, d3);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = ff.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ff.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = ff.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = Y;
        Y[0] = "+\u000b3";
        objectArray[1] = Integer.TYPE;
        ff.ab[1] = "java/lang/Integer";
        objectArray[2] = "n5l\u000f\r\u0014e:}@p\fv=t\t";
        objectArray[3] = "\u0017\u00173mjA\u001c\u0018\"\"\u000bO\u0017\u0013&x";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ">\u0018T\u001f<yb\u0017Dx0h\u0004@\u0016Gkwe\u001eE\u0014<\u0013=\u0016\u0017G5jt\u0000M\u0016[";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ff" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void k(int n2, double d2, double d3) {
        Object object;
        long l10 = b ^ 0x66DC6332ECFCL;
        try {
            object = n2 >= 10 ? ff.c("\u00a3", (int)ff.b("f", (int)24117, (long)(0x374014A7D26A15CDL ^ l10)), (long)-1549111523960066480L, (long)l10) : (String)((Object)ff.c("\u00a3", (int)ff.b("f", (int)1946, (long)(0x1FF2A9D0C63D4C61L ^ l10)), (long)-1549111523960066480L, (long)l10)) + n2;
        }
        catch (O_ o_2) {
            throw ff.a(o_2);
        }
        CallSite callSite = object;
        F8.C(d2 - 1.0, d3 - 1.0, 10.0, 10.0, ff.M.m, 5.0f);
        this.t(0.8).Q((String)((Object)callSite), d2 + 4.0, d3 + 1.0, ff.M.c);
    }

    public float A() {
        return this.n;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = ff.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public rp C() {
        return this.E;
    }

    private static Field g(long l10, long l11) {
        int n2 = ff.e(l10, l11);
        Object object = Y[n2];
        if (object instanceof String) {
            String string = ab[n2];
            int n3 = string.indexOf(8);
            Class clazz = ff.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = ff.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ff.c(clazz3, string2, clazz2)) != null) {
                    ff.Y[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = ff.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        ff.Y[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ff.f(221181918393941L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public ff(Yw yw2) {
        if (yw2 instanceof vK) {
            this.R = (vK)yw2;
            this.E = this.R.A();
        } else {
            this.E = yw2.A();
        }
    }

    public ff(rp rp2) {
        this.E = rp2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ff.b = d8.a(7337782261762076937L, 7003226188280891815L, MethodHandles.lookup().lookupClass()).a(129136388721723L);
                ff.Y = new Object[5];
                ff.ab = new String[5];
                ff.a();
                ff.V = new HashMap<K, V>(13);
                var0 = ff.b ^ 8776155406249L;
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
                var6_5 = "\u0098\u00e3\u009c\u00baP]\u001f\u00bf\u00b1\u00f7\u00df~{\u00df$\u00ab\u0019\u008f\u0017\u00d1\u009d\u009a\u00c1T";
                var7_6 = "\u0098\u00e3\u009c\u00baP]\u001f\u00bf\u00b1\u00f7\u00df~{\u00df$\u00ab\u0019\u008f\u0017\u00d1\u009d\u009a\u00c1T".length();
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
                    var6_5 = "\u00e7\u00bf\u00c1\u0094\b\u0089\u0016\u00f0\u0006\u00eaI+\u0085\u00cf\u00cd\u00f4";
                    var7_6 = "\u00e7\u00bf\u00c1\u0094\b\u0089\u0016\u00f0\u0006\u00eaI+\u0085\u00cf\u00cd\u00f4".length();
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
        ff.v = var8_3;
        ff.D = new Integer[5];
    }

    public ff(vK vK2) {
        this(vK2.A());
        this.R = vK2;
    }

    public boolean Q() {
        return this.F;
    }

    public void k(float f10) {
        this.n = f10;
    }

    public float Y() {
        return this.L;
    }

    public void h(boolean bl2) {
        this.F = bl2;
    }

    public void w(float f10) {
        this.L = f10;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = ff.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = ff.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 's' || c10 == 'n' || c10 == 'D' || c10 == 'N') {
                field = ff.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'n' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'D' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ff.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method h(long l10, long l11) {
        int n2 = ff.e(l10, l11);
        Object object = Y[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = ab[n2];
                int n4 = string2.indexOf(8);
                clazz3 = ff.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = ff.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ff.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        ff.Y[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ff.f(221181918393941L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = ff.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        ff.Y[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ff.f(221181918393941L, 0L);
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

    public float n() {
        return this.B;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = ff.e(l10, l11);
            object = Y[n2];
            try {
                if (!(object instanceof String)) break block2;
                ff.Y[n2] = clazz = Class.forName(ab[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void G() {
        block6: {
            block4: {
                float f10;
                V4 v42;
                block5: {
                    v42 = this.E.W();
                    try {
                        if (v42 == null || v42.Y()) break block4;
                    }
                    catch (O_ o_2) {
                        throw ff.a(o_2);
                    }
                    this.g("");
                    f10 = this.B;
                    try {
                        if (!(f10 >= 1.0f) || !(SE.h.a().b() > 1.0)) break block5;
                    }
                    catch (O_ o_3) {
                        throw ff.a(o_3);
                    }
                    f10 = 0.95f;
                }
                float f11 = 16.0f * f10;
                F8.G(v42, f10, this.G() + this.w() / 2.0 - (double)(f11 / 2.0f), this.W() + this.b() / 2.0 - (double)(f11 / 2.0f));
                break block6;
            }
            this.z();
        }
    }

    private boolean T() {
        block18: {
            double d2;
            double d3;
            double d4;
            double d5;
            int n2;
            ArrayList<V4> arrayList;
            block21: {
                block20: {
                    double d6;
                    block19: {
                        double d7;
                        block17: {
                            ep ep2 = this.R.G();
                            try {
                                if (ep2 == null) {
                                    return false;
                                }
                            }
                            catch (O_ o_2) {
                                throw ff.a(o_2);
                            }
                            arrayList = new ArrayList<V4>();
                            block12: for (Io io2 : ep2.E()) {
                                for (cb<?> cb2 : io2.A()) {
                                    if (!cb2.A().equals(Ok.MATERIAL)) continue;
                                    SB sB2 = (SB)cb2;
                                    for (rp rp2 : sB2.c()) {
                                        arrayList.add(rp2.W());
                                    }
                                    continue block12;
                                }
                            }
                            try {
                                if (arrayList.isEmpty()) {
                                    return false;
                                }
                            }
                            catch (O_ o_3) {
                                throw ff.a(o_3);
                            }
                            n2 = arrayList.size();
                            d5 = this.G() + 6.0;
                            d4 = this.G() + 18.0;
                            d6 = this.G() + 12.0;
                            d3 = this.W() + 6.0;
                            d7 = this.W() + 12.0;
                            d2 = this.W() + 18.0;
                            try {
                                if (n2 != 1) break block17;
                                F8.G((V4)arrayList.get(0), this.B, this.G() + 7.0, this.W() + 7.0);
                                break block18;
                            }
                            catch (O_ o_4) {
                                throw ff.a(o_4);
                            }
                        }
                        try {
                            if (n2 != 2) break block19;
                            this.k((V4)arrayList.get(0), d5, d7, this.B * 0.5f);
                            this.k((V4)arrayList.get(1), d4, d7, this.B * 0.5f);
                            break block18;
                        }
                        catch (O_ o_5) {
                            throw ff.a(o_5);
                        }
                    }
                    try {
                        if (n2 != 3) break block20;
                        this.k((V4)arrayList.get(0), d6, d3, this.B * 0.5f);
                        this.k((V4)arrayList.get(1), d5, d2, this.B * 0.5f);
                        this.k((V4)arrayList.get(2), d4, d2, this.B * 0.5f);
                        break block18;
                    }
                    catch (O_ o_6) {
                        throw ff.a(o_6);
                    }
                }
                try {
                    if (n2 != 4) break block21;
                    this.k((V4)arrayList.get(0), d5, d3, this.B * 0.5f);
                    this.k((V4)arrayList.get(1), d4, d3, this.B * 0.5f);
                    this.k((V4)arrayList.get(2), d5, d2, this.B * 0.5f);
                    this.k((V4)arrayList.get(3), d4, d2, this.B * 0.5f);
                    break block18;
                }
                catch (O_ o_7) {
                    throw ff.a(o_7);
                }
            }
            this.k((V4)arrayList.get(0), d5, d3, this.B * 0.5f);
            this.k((V4)arrayList.get(1), d4, d3, this.B * 0.5f);
            this.k((V4)arrayList.get(2), d5, d2, this.B * 0.5f);
            this.k(n2 - 3, d4, d2);
        }
        return true;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (ab[n5] != null) {
            return n5;
        }
        Object object = Y[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 17;
                break;
            }
            case 1: {
                n4 = 5;
                break;
            }
            case 2: {
                n4 = 2;
                break;
            }
            case 3: {
                n4 = 22;
                break;
            }
            case 4: {
                n4 = 57;
                break;
            }
            case 5: {
                n4 = 31;
                break;
            }
            case 6: {
                n4 = 6;
                break;
            }
            case 7: {
                n4 = 14;
                break;
            }
            case 8: {
                n4 = 61;
                break;
            }
            case 9: {
                n4 = 33;
                break;
            }
            case 10: {
                n4 = 1;
                break;
            }
            case 11: {
                n4 = 34;
                break;
            }
            case 12: {
                n4 = 3;
                break;
            }
            case 13: {
                n4 = 48;
                break;
            }
            case 14: {
                n4 = 54;
                break;
            }
            case 15: {
                n4 = 49;
                break;
            }
            case 16: {
                n4 = 15;
                break;
            }
            case 17: {
                n4 = 37;
                break;
            }
            case 18: {
                n4 = 60;
                break;
            }
            case 19: {
                n4 = 23;
                break;
            }
            case 20: {
                n4 = 32;
                break;
            }
            case 21: {
                n4 = 50;
                break;
            }
            case 22: {
                n4 = 0;
                break;
            }
            case 23: {
                n4 = 46;
                break;
            }
            case 24: {
                n4 = 63;
                break;
            }
            case 25: {
                n4 = 18;
                break;
            }
            case 26: {
                n4 = 12;
                break;
            }
            case 27: {
                n4 = 38;
                break;
            }
            case 28: {
                n4 = 26;
                break;
            }
            case 29: {
                n4 = 30;
                break;
            }
            case 30: {
                n4 = 58;
                break;
            }
            case 31: {
                n4 = 11;
                break;
            }
            case 32: {
                n4 = 9;
                break;
            }
            case 33: {
                n4 = 51;
                break;
            }
            case 34: {
                n4 = 56;
                break;
            }
            case 35: {
                n4 = 42;
                break;
            }
            case 36: {
                n4 = 25;
                break;
            }
            case 37: {
                n4 = 24;
                break;
            }
            case 38: {
                n4 = 16;
                break;
            }
            case 39: {
                n4 = 35;
                break;
            }
            case 40: {
                n4 = 59;
                break;
            }
            case 41: {
                n4 = 53;
                break;
            }
            case 42: {
                n4 = 62;
                break;
            }
            case 43: {
                n4 = 7;
                break;
            }
            case 44: {
                n4 = 52;
                break;
            }
            case 45: {
                n4 = 55;
                break;
            }
            case 46: {
                n4 = 43;
                break;
            }
            case 47: {
                n4 = 10;
                break;
            }
            case 48: {
                n4 = 47;
                break;
            }
            case 49: {
                n4 = 45;
                break;
            }
            case 50: {
                n4 = 40;
                break;
            }
            case 51: {
                n4 = 21;
                break;
            }
            case 52: {
                n4 = 29;
                break;
            }
            case 53: {
                n4 = 19;
                break;
            }
            case 54: {
                n4 = 44;
                break;
            }
            case 55: {
                n4 = 8;
                break;
            }
            case 56: {
                n4 = 36;
                break;
            }
            case 57: {
                n4 = 4;
                break;
            }
            case 58: {
                n4 = 28;
                break;
            }
            case 59: {
                n4 = 39;
                break;
            }
            case 60: {
                n4 = 41;
                break;
            }
            case 61: {
                n4 = 13;
                break;
            }
            case 62: {
                n4 = 20;
                break;
            }
            default: {
                n4 = 27;
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
        ff.ab[n5] = new String(cArray);
        return n5;
    }

    public void r(float f10) {
        this.B = f10;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x217A;
        if (D[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = v[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])V.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    V.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/ff", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ff.D[n3] = n4;
        }
        return D[n3];
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ff.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ff.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

