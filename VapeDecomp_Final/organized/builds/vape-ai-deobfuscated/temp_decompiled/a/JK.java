/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package a;

import a.Ao;
import a.O_;
import a.Rs;
import a.d8;
import a.jE;
import a.jU;
import a.js;
import a.k2;
import com.google.gson.JsonObject;
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
public class jk
extends jE<Object[], jk> {
    private static final long d;
    public static final int g;
    private static final Map o;
    private final js D;
    private static final Integer[] k;
    private static final Object[] s;
    private final js t;
    private boolean n;
    private final jU X;
    private final List<jE<?, ?>> h;
    private static final String[] x;
    private final js m;
    private static final long[] e;
    private final js a;

    @Override
    public void i(String string) {
    }

    public void E(Color color) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        this.m.r((double)fArray[0] * this.m.p());
        this.a.r((double)fArray[1] * this.a.p());
        this.t.r((double)fArray[2] * this.t.p());
        this.D.r(Double.valueOf(color.getAlpha()));
    }

    public static jk M(Object object, String string, Color color, int n2) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float f10 = fArray[0];
        float f11 = fArray[1];
        float f12 = fArray[2];
        return jk.J(object, string, f10 * 255.0f, f12 * 255.0f, f11 * 255.0f, n2);
    }

    public Object[] C() {
        return this.c();
    }

    public int G() {
        return Color.HSBtoRGB(this.h(), this.x(), this.Z());
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = jk.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = jk.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void J() {
        super.H(this.c());
    }

    private static Method h(long l10, long l11) {
        int n2 = jk.e(l10, l11);
        Object object = s[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = x[n2];
                int n4 = string2.indexOf(8);
                clazz3 = jk.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = jk.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = jk.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        jk.s[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = jk.f(223551690492578L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = jk.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        jk.s[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = jk.f(223551690492578L, 0L);
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

    @Override
    public void F(boolean bl2) {
        super.F(bl2);
        this.m.F(bl2);
        this.t.F(bl2);
        this.a.F(bl2);
        this.D.F(bl2);
        this.X.F(bl2);
    }

    @Override
    public boolean i() {
        return this.n;
    }

    public float D() {
        return ((Double)this.D.J()).floatValue() / (float)this.D.p();
    }

    public js P() {
        return this.t;
    }

    public js Q() {
        return this.m;
    }

    public k2 L() {
        this.D();
        int n2 = Color.HSBtoRGB(this.h(), this.x(), this.Z());
        k2 k22 = new k2(n2);
        k22.I(((Double)this.D.J()).intValue());
        return k22;
    }

    jk(Object object, String string, double d2, double d3, double d4, double d5) {
        long l10 = d ^ 0x94485CE2874L;
        super(object, string, new Object[0]);
        this.n = false;
        String string2 = "";
        this.m = js.t(this, string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)1343, (long)(0x146A8E2A275E3C4EL ^ l10)), (long)-3150747702905483002L, (long)l10)), string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)23130, (long)(0x799255FC52AF6322L ^ l10)), (long)-3150747702905483002L, (long)l10)), "", 0.0, d2, 255.0);
        this.t = js.t(this, string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)30813, (long)(0x20D748E2E4134136L ^ l10)), (long)-3150747702905483002L, (long)l10)), string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)6725, (long)(0x4D26CA79FFDE2339L ^ l10)), (long)-3150747702905483002L, (long)l10)), "", 0.0, d3, 255.0);
        this.a = js.t(this, string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)17072, (long)(0x21B0E664F36D7BD2L ^ l10)), (long)-3150747702905483002L, (long)l10)), string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)9370, (long)(0x43554ED9188E9DE8L ^ l10)), (long)-3150747702905483002L, (long)l10)), "", 0.0, d4, 255.0);
        this.D = js.t(this, string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)16448, (long)(0x782C496089F0F933L ^ l10)), (long)-3150747702905483002L, (long)l10)), string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)26619, (long)(0x182E31A6EC8FDE95L ^ l10)), (long)-3150747702905483002L, (long)l10)), "", 0.0, d5, 255.0);
        this.X = jU.v(this, string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)19139, (long)(0x45AF934015ACF3A0L ^ l10)), (long)-3150747702905483002L, (long)l10)), string + (String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)14716, (long)(0x4B7A03DF17138016L ^ l10)), (long)-3150747702905483002L, (long)l10)), false);
        this.h = Arrays.asList(this.m, this.t, this.a, this.D, this.X);
        Object[] objectArray = new Object[this.h.size()];
        try {
            for (int i10 = 0; i10 < this.h.size(); ++i10) {
                objectArray[i10] = this.h.get(i10).u();
            }
        }
        catch (O_ o_2) {
            throw jk.a(o_2);
        }
        this.N = objectArray;
    }

    private static void a() {
        Object[] objectArray = s;
        s[0] = "Io\f";
        objectArray[1] = Integer.TYPE;
        jk.x[1] = "java/lang/Integer";
        objectArray[2] = "\fs^F4e\u0007|O\tI}\u0014{F@";
        objectArray[3] = "6m\u001c8)x=b\rwHv6i\t-";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "v:$T\u0011}6m%=\u0004mLq4E\u0011t sfXo/50\"F\u0001-vrg=";
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = jk.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = jk.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void D() {
        this.G(this.m);
        this.G(this.t);
        this.G(this.a);
        this.G(this.D);
    }

    public js H() {
        return this.D;
    }

    public float Z() {
        return ((Double)this.t.J()).floatValue() / (float)this.t.p();
    }

    public void Z() {
        double d2;
        block2: {
            this.F(true);
            d2 = (Double)this.Q().J() + (Double)Ao.K.T.J();
            try {
                if (!(d2 > this.Q().p()) && !(d2 < this.Q().q())) break block2;
            }
            catch (O_ o_2) {
                throw jk.a(o_2);
            }
            d2 = this.Q().q();
        }
        this.m.r(d2);
        this.F(false);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = jk.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void l(Object[] objectArray) {
        try {
            if (objectArray.length < this.h.size()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw jk.a(o_2);
        }
        double d2 = (Double)objectArray[0];
        double d3 = (Double)objectArray[1];
        double d4 = (Double)objectArray[2];
        double d5 = (Double)objectArray[3];
        if (d2 > this.Q().p()) {
            d2 = (Double)this.Q().J();
        }
        if (d3 > this.P().p()) {
            d3 = (Double)this.P().J();
        }
        if (d4 > ((js)this.A()).p()) {
            d4 = (Double)((jE)this.A()).J();
        }
        if (d5 > this.H().p()) {
            d5 = (Double)this.H().J();
        }
        super.H(objectArray);
        this.m.r(d2);
        this.t.r(d3);
        this.a.r(d4);
        this.D.r(d5);
        this.X.H(Boolean.valueOf((Boolean)objectArray[4]));
        this.M();
    }

    public void k() {
        block2: {
            try {
                this.F(true);
                if (!this.n || !this.j()) break block2;
            }
            catch (O_ o_2) {
                throw jk.a(o_2);
            }
            double d2 = (Double)this.m.J();
            this.E(Rs.b(this.h(), this.Z(), this.x()));
            this.m.r(d2);
        }
        this.F(false);
    }

    public boolean j() {
        return this.X.s();
    }

    public float x() {
        return ((Double)this.a.J()).floatValue() / (float)this.a.p();
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = jk.e(l10, l11);
            object = s[n2];
            try {
                if (!(object instanceof String)) break block2;
                jk.s[n2] = clazz = Class.forName(x[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void W() {
        try {
            super.W();
            if (this.s()) {
                this.Q().W();
                ((jE)this.A()).W();
                this.P().W();
                this.H().W();
                this.X.W();
            }
        }
        catch (O_ o_2) {
            throw jk.a(o_2);
        }
    }

    public static jk C(Object object, String string, Color color) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float f10 = fArray[0];
        float f11 = fArray[1];
        float f12 = fArray[2];
        int n2 = color.getAlpha();
        return jk.J(object, string, f10 * 255.0f, f12 * 255.0f, f11 * 255.0f, n2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void z(boolean bl2) {
        this.n = bl2;
    }

    public Object[] c() {
        Object[] objectArray = new Object[this.h.size()];
        try {
            for (int i10 = 0; i10 < this.h.size(); ++i10) {
                objectArray[i10] = this.h.get(i10).J();
            }
        }
        catch (O_ o_2) {
            throw jk.a(o_2);
        }
        return objectArray;
    }

    public double Y() {
        return this.m.p();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6D39;
        if (k[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jk", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jk.k[n3] = n4;
        }
        return k[n3];
    }

    @Override
    public boolean C(JsonObject jsonObject) {
        block28: {
            long l10;
            block29: {
                l10 = d ^ 0x5BDB34857173L;
                try {
                    try {
                        if (!super.C(jsonObject)) break block28;
                        if (!jsonObject.has((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)17458, (long)(0x3164B868903F2450L ^ l10)), (long)-8268299712998963199L, (long)l10)))) break block29;
                    }
                    catch (O_ o_2) {
                        throw jk.a(o_2);
                    }
                    this.m.r(jsonObject.get((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)12617, (long)(0x6CDF9C08AF925138L ^ l10)), (long)-8268299712998963199L, (long)l10))).getAsDouble() / 96.0 * 255.0);
                }
                catch (O_ o_3) {
                    throw jk.a(o_3);
                }
            }
            try {
                if (jsonObject.has((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)9479, (long)(0x72FB9E1DD8284570L ^ l10)), (long)-8268299712998963199L, (long)l10)))) {
                    this.m.r(jsonObject.get((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)24199, (long)(0x2390B6729555BEF7L ^ l10)), (long)-8268299712998963199L, (long)l10))).getAsDouble());
                }
            }
            catch (O_ o_4) {
                throw jk.a(o_4);
            }
            try {
                if (jsonObject.has((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)2131, (long)(0x31A6EA69AFB9E820L ^ l10)), (long)-8268299712998963199L, (long)l10)))) {
                    this.a.r(jsonObject.get((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)22339, (long)(0x6E3147D06798373DL ^ l10)), (long)-8268299712998963199L, (long)l10))).getAsDouble() / 96.0 * 255.0);
                }
            }
            catch (O_ o_5) {
                throw jk.a(o_5);
            }
            try {
                if (jsonObject.has((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)24267, (long)(0x4D4128FFA14DBEB1L ^ l10)), (long)-8268299712998963199L, (long)l10)))) {
                    this.a.r(jsonObject.get((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)21823, (long)(0x6B7DFFBF159BB551L ^ l10)), (long)-8268299712998963199L, (long)l10))).getAsDouble());
                }
            }
            catch (O_ o_6) {
                throw jk.a(o_6);
            }
            try {
                if (jsonObject.has((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)32041, (long)(0x86B57999F0D1D42L ^ l10)), (long)-8268299712998963199L, (long)l10)))) {
                    this.t.r(jsonObject.get((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)3443, (long)(0x31A80312F1EE6D0FL ^ l10)), (long)-8268299712998963199L, (long)l10))).getAsDouble() / 96.0 * 255.0);
                }
            }
            catch (O_ o_7) {
                throw jk.a(o_7);
            }
            try {
                if (jsonObject.has((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)26367, (long)(0x38005DE319C186A7L ^ l10)), (long)-8268299712998963199L, (long)l10)))) {
                    this.t.r(jsonObject.get((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)25865, (long)(0x4BE051D354018550L ^ l10)), (long)-8268299712998963199L, (long)l10))).getAsDouble());
                }
            }
            catch (O_ o_8) {
                throw jk.a(o_8);
            }
            try {
                if (jsonObject.has((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)32285, (long)(0x6985910AD00B1E64L ^ l10)), (long)-8268299712998963199L, (long)l10)))) {
                    this.D.r(jsonObject.get((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)14318, (long)(0x3DE20EAECC805793L ^ l10)), (long)-8268299712998963199L, (long)l10))).getAsDouble() / 96.0 * 255.0);
                }
            }
            catch (O_ o_9) {
                throw jk.a(o_9);
            }
            try {
                if (jsonObject.has((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)5910, (long)(0x34C8945279F0F779L ^ l10)), (long)-8268299712998963199L, (long)l10)))) {
                    this.D.r(jsonObject.get((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)11777, (long)(0x410614121D1CCE6BL ^ l10)), (long)-8268299712998963199L, (long)l10))).getAsDouble());
                }
            }
            catch (O_ o_10) {
                throw jk.a(o_10);
            }
            try {
                if (jsonObject.has((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)27982, (long)(0x59E508BE33778D29L ^ l10)), (long)-8268299712998963199L, (long)l10)))) {
                    this.X.H(jsonObject.get((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)11871, (long)(0x68B158F0B5A1CE3CL ^ l10)), (long)-8268299712998963199L, (long)l10))).getAsBoolean());
                }
            }
            catch (O_ o_11) {
                throw jk.a(o_11);
            }
            return true;
        }
        return false;
    }

    public Object[] b() {
        return this.c();
    }

    private void G(js js2) {
        try {
            if ((Double)js2.J() < js2.q()) {
                js2.r(js2.q());
            }
        }
        catch (O_ o_2) {
            throw jk.a(o_2);
        }
        try {
            if ((Double)js2.J() > js2.p()) {
                js2.r(js2.p());
            }
        }
        catch (O_ o_3) {
            throw jk.a(o_3);
        }
    }

    private static Field g(long l10, long l11) {
        int n2 = jk.e(l10, l11);
        Object object = s[n2];
        if (object instanceof String) {
            String string = x[n2];
            int n3 = string.indexOf(8);
            Class clazz = jk.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = jk.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = jk.c(clazz3, string2, clazz2)) != null) {
                    jk.s[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = jk.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        jk.s[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = jk.f(223551690492578L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean p() {
        boolean bl2;
        block13: {
            block12: {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (!super.p() || !this.m.p()) break block12;
                                    }
                                    catch (O_ o_2) {
                                        throw jk.a(o_2);
                                    }
                                    if (!this.a.p()) break block12;
                                }
                                catch (O_ o_3) {
                                    throw jk.a(o_3);
                                }
                                if (!this.t.p()) break block12;
                            }
                            catch (O_ o_4) {
                                throw jk.a(o_4);
                            }
                            if (!this.D.p()) break block12;
                        }
                        catch (O_ o_5) {
                            throw jk.a(o_5);
                        }
                        if (!this.X.p()) break block12;
                    }
                    catch (O_ o_6) {
                        throw jk.a(o_6);
                    }
                    bl2 = true;
                    break block13;
                }
                catch (O_ o_7) {
                    throw jk.a(o_7);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00fc' || c10 == '\u00da' || c10 == '\u00ba' || c10 == 'n') {
                field = jk.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = jk.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ce' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static jk J(Object object, String string, double d2, double d3, double d4, double d5) {
        return new jk(object, string, d2, d3, d4, d5);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = jk.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public jk E() {
        jk jk2 = new jk(null, this.O(), this.h() * 255.0f, this.Z() * 255.0f, this.x() * 255.0f, this.D() * 255.0f);
        jk2.t(this.u());
        jk2.m.M((Double)this.m.u());
        jk2.t.M((Double)this.t.u());
        jk2.a.M((Double)this.a.u());
        jk2.D.M((Double)this.D.u());
        jk2.X.t(this.X.u());
        return jk2;
    }

    public void n(boolean bl2) {
        this.X.H(bl2);
        this.l(this.c());
    }

    public boolean g(Color color) {
        boolean bl2;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (Math.abs(color.getRed() - this.L().getRed()) >= 2 || Math.abs(color.getGreen() - this.L().getGreen()) >= 2) break block8;
                            }
                            catch (O_ o_2) {
                                throw jk.a(o_2);
                            }
                            if (Math.abs(color.getBlue() - this.L().getBlue()) >= 2) break block8;
                        }
                        catch (O_ o_3) {
                            throw jk.a(o_3);
                        }
                        if (Math.abs(color.getAlpha() - this.L().getAlpha()) >= 2) break block8;
                    }
                    catch (O_ o_4) {
                        throw jk.a(o_4);
                    }
                    bl2 = true;
                    break block9;
                }
                catch (O_ o_5) {
                    throw jk.a(o_5);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                jk.d = d8.a(-5458455469801364685L, 7524399424322044653L, MethodHandles.lookup().lookupClass()).a(47924841456758L);
                jk.s = new Object[5];
                jk.x = new String[5];
                jk.a();
                jk.o = new HashMap<K, V>(13);
                var0 = jk.d ^ 67570536745843L;
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
                var8_3 = new long[34];
                var5_4 = 0;
                var6_5 = "\u00fa\u0012\u00fd\u0088\u000f\u0013D\u00f9Yy\u0096\u0014&\u0015ohF\u0005\u00bem\u0095\u00eb_4(9\u0002\u00ceU\u0094\u000f\u00f1l\u00b7[]\u00f6W\u00fcU\u00afU]W\u00a5\u0087\u0085\u00d8\u00a2\u00bf\u000e\u0017f\u008c\u0096\u0016\u0093}[\u00f9\u00c9h\u001d\u008fQ\u007f\u00a1\u00a0DE\u00da\u001f\u00d5\u00a9\u00d6\u00e4\u00c6\u00ff\u00a8\u00bd\u0003MX\u00ff+\u00bb&.A\u00f8\u00db\u008d\u00ec\u00e4\u001b\u0093aH\u0093WO3\u00d4\u00b4\u00b6\\\u00a3\u00c1\u00ca\u00ec1\u0002\u00c9\u001f\u00af\u00bd%\u009b\u00016Vx\u00d0&\u00ee@\u009e\u00984-\u00d1;\u000e\u00d0%f\u00a32\u00c6\u00ecv8\u008e\u0002\u009fL\u00b5q@\u000f\u00ff\u0082\u0014\u00feD\u00f3}V\u00ca\u00b3M\u00e39,vy&\u00bc\u00e5x\u0002\u00f1\u00fb@_\u0086\u008e\u001a\u00d58\u0001\u0016r\u0013\u00ae\u00b7`\u00b9F\u00a3\u00ddDH4\u00ce\u0089\u00f6q\u0005\u001ek7\u00e3~v\u00aa1\u00ecf\u00b9\u00a5\nI\u00ea\u0093LC.\u00c0\u00f4!\u0090WX\u0086\u00dc\u009b\u001f\u0004\u00daF~\u000e\u0006\u00ab\u00c38\u0013T\u0018A\u00cc\u00b8V\u00fc2\u00aa\u00be\u0088\u0093|(m\u00d6bE";
                var7_6 = "\u00fa\u0012\u00fd\u0088\u000f\u0013D\u00f9Yy\u0096\u0014&\u0015ohF\u0005\u00bem\u0095\u00eb_4(9\u0002\u00ceU\u0094\u000f\u00f1l\u00b7[]\u00f6W\u00fcU\u00afU]W\u00a5\u0087\u0085\u00d8\u00a2\u00bf\u000e\u0017f\u008c\u0096\u0016\u0093}[\u00f9\u00c9h\u001d\u008fQ\u007f\u00a1\u00a0DE\u00da\u001f\u00d5\u00a9\u00d6\u00e4\u00c6\u00ff\u00a8\u00bd\u0003MX\u00ff+\u00bb&.A\u00f8\u00db\u008d\u00ec\u00e4\u001b\u0093aH\u0093WO3\u00d4\u00b4\u00b6\\\u00a3\u00c1\u00ca\u00ec1\u0002\u00c9\u001f\u00af\u00bd%\u009b\u00016Vx\u00d0&\u00ee@\u009e\u00984-\u00d1;\u000e\u00d0%f\u00a32\u00c6\u00ecv8\u008e\u0002\u009fL\u00b5q@\u000f\u00ff\u0082\u0014\u00feD\u00f3}V\u00ca\u00b3M\u00e39,vy&\u00bc\u00e5x\u0002\u00f1\u00fb@_\u0086\u008e\u001a\u00d58\u0001\u0016r\u0013\u00ae\u00b7`\u00b9F\u00a3\u00ddDH4\u00ce\u0089\u00f6q\u0005\u001ek7\u00e3~v\u00aa1\u00ecf\u00b9\u00a5\nI\u00ea\u0093LC.\u00c0\u00f4!\u0090WX\u0086\u00dc\u009b\u001f\u0004\u00daF~\u000e\u0006\u00ab\u00c38\u0013T\u0018A\u00cc\u00b8V\u00fc2\u00aa\u00be\u0088\u0093|(m\u00d6bE".length();
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
                    var6_5 = "'\u00c8\u0088\u0083\"x\u009a\u009e\n\u0082N4\b\u00d6\u0014\u00f6";
                    var7_6 = "'\u00c8\u0088\u0083\"x\u009a\u009e\n\u0082N4\b\u00d6\u0014\u00f6".length();
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
        jk.e = var8_3;
        jk.k = new Integer[34];
        jk.g = (int)jk.b("w", (int)886, (long)(var0 ^ 5708069882402019598L));
    }

    public double w() {
        return this.m.q();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public float h() {
        return ((Double)this.m.J()).floatValue() / (float)this.m.p();
    }

    @Override
    public js A() {
        return this.a;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (x[n5] != null) {
            return n5;
        }
        Object object = s[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 48;
                break;
            }
            case 1: {
                n4 = 18;
                break;
            }
            case 2: {
                n4 = 38;
                break;
            }
            case 3: {
                n4 = 15;
                break;
            }
            case 4: {
                n4 = 0;
                break;
            }
            case 5: {
                n4 = 35;
                break;
            }
            case 6: {
                n4 = 16;
                break;
            }
            case 7: {
                n4 = 57;
                break;
            }
            case 8: {
                n4 = 2;
                break;
            }
            case 9: {
                n4 = 34;
                break;
            }
            case 10: {
                n4 = 52;
                break;
            }
            case 11: {
                n4 = 55;
                break;
            }
            case 12: {
                n4 = 44;
                break;
            }
            case 13: {
                n4 = 41;
                break;
            }
            case 14: {
                n4 = 30;
                break;
            }
            case 15: {
                n4 = 28;
                break;
            }
            case 16: {
                n4 = 4;
                break;
            }
            case 17: {
                n4 = 29;
                break;
            }
            case 18: {
                n4 = 11;
                break;
            }
            case 19: {
                n4 = 59;
                break;
            }
            case 20: {
                n4 = 63;
                break;
            }
            case 21: {
                n4 = 32;
                break;
            }
            case 22: {
                n4 = 21;
                break;
            }
            case 23: {
                n4 = 17;
                break;
            }
            case 24: {
                n4 = 7;
                break;
            }
            case 25: {
                n4 = 19;
                break;
            }
            case 26: {
                n4 = 33;
                break;
            }
            case 27: {
                n4 = 12;
                break;
            }
            case 28: {
                n4 = 53;
                break;
            }
            case 29: {
                n4 = 1;
                break;
            }
            case 30: {
                n4 = 22;
                break;
            }
            case 31: {
                n4 = 40;
                break;
            }
            case 32: {
                n4 = 27;
                break;
            }
            case 33: {
                n4 = 46;
                break;
            }
            case 34: {
                n4 = 23;
                break;
            }
            case 35: {
                n4 = 51;
                break;
            }
            case 36: {
                n4 = 39;
                break;
            }
            case 37: {
                n4 = 56;
                break;
            }
            case 38: {
                n4 = 45;
                break;
            }
            case 39: {
                n4 = 5;
                break;
            }
            case 40: {
                n4 = 9;
                break;
            }
            case 41: {
                n4 = 37;
                break;
            }
            case 42: {
                n4 = 3;
                break;
            }
            case 43: {
                n4 = 42;
                break;
            }
            case 44: {
                n4 = 43;
                break;
            }
            case 45: {
                n4 = 62;
                break;
            }
            case 46: {
                n4 = 36;
                break;
            }
            case 47: {
                n4 = 24;
                break;
            }
            case 48: {
                n4 = 54;
                break;
            }
            case 49: {
                n4 = 47;
                break;
            }
            case 50: {
                n4 = 14;
                break;
            }
            case 51: {
                n4 = 6;
                break;
            }
            case 52: {
                n4 = 13;
                break;
            }
            case 53: {
                n4 = 31;
                break;
            }
            case 54: {
                n4 = 26;
                break;
            }
            case 55: {
                n4 = 61;
                break;
            }
            case 56: {
                n4 = 58;
                break;
            }
            case 57: {
                n4 = 8;
                break;
            }
            case 58: {
                n4 = 60;
                break;
            }
            case 59: {
                n4 = 49;
                break;
            }
            case 60: {
                n4 = 25;
                break;
            }
            case 61: {
                n4 = 10;
                break;
            }
            case 62: {
                n4 = 50;
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
        jk.x[n5] = new String(cArray);
        return n5;
    }

    private static O_ a(O_ o_2) {
        return o_2;
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

    @Override
    public JsonObject k(boolean bl2) {
        long l10 = d ^ 0x5BA8936BD6A2L;
        JsonObject jsonObject = this.y();
        try {
            if (!this.m.p()) {
                jsonObject.addProperty((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)31902, (long)(0x38704B685D943B3DL ^ l10)), (long)3066979127192268752L, (long)l10)), (Number)this.m.J());
            }
        }
        catch (O_ o_2) {
            throw jk.a(o_2);
        }
        try {
            if (!this.a.p()) {
                jsonObject.addProperty((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)27842, (long)(0x67E770C7DB642B75L ^ l10)), (long)3066979127192268752L, (long)l10)), (Number)this.a.J());
            }
        }
        catch (O_ o_3) {
            throw jk.a(o_3);
        }
        try {
            if (!this.t.p()) {
                jsonObject.addProperty((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)12478, (long)(0x27FB9B3011387707L ^ l10)), (long)3066979127192268752L, (long)l10)), (Number)this.t.J());
            }
        }
        catch (O_ o_4) {
            throw jk.a(o_4);
        }
        try {
            if (!this.D.p()) {
                jsonObject.addProperty((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)25447, (long)(0x4E0D6C45DC56A4D6L ^ l10)), (long)3066979127192268752L, (long)l10)), (Number)this.D.J());
            }
        }
        catch (O_ o_5) {
            throw jk.a(o_5);
        }
        try {
            if (!this.X.p()) {
                jsonObject.addProperty((String)((Object)jk.d("\u00f4", (int)jk.b("w", (int)12200, (long)(0x4C944E5CAF3D6818L ^ l10)), (long)3066979127192268752L, (long)l10)), this.X.s());
            }
        }
        catch (O_ o_6) {
            throw jk.a(o_6);
        }
        return jsonObject;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(jk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

