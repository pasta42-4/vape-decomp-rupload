/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.rendering.adaptive;

import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonObject;
import com.graphics.color.ColorCompositionEngine;
import com.numeric.precision.NumericPrecisionTransformer;
import com.ui.rendering.GraphicalRenderingController;
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
public class AdaptiveRenderingEngine
extends ConfigurationProfileResolver<Object[], AdaptiveRenderingEngine> {
    private static final long d;
    public static final int g;
    private static final Map o;
    private final NumericPrecisionTransformer D;
    private static final Integer[] k;
    private static final Object[] s;
    private final NumericPrecisionTransformer t;
    private boolean n;
    private final AuthenticationStateTracker X;
    private final List<ConfigurationProfileResolver<?, ?>> h;
    private static final String[] x;
    private final NumericPrecisionTransformer m;
    private static final long[] e;
    private final NumericPrecisionTransformer a;

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

    public static AdaptiveRenderingEngine M(Object object, String string, Color color, int n) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float f = fArray[0];
        float f2 = fArray[1];
        float f3 = fArray[2];
        return AdaptiveRenderingEngine.J(object, string, f * 255.0f, f3 * 255.0f, f2 * 255.0f, n);
    }

    public Object[] C() {
        return this.c();
    }

    public int G() {
        return Color.HSBtoRGB(this.h(), this.x(), this.Z());
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AdaptiveRenderingEngine.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AdaptiveRenderingEngine.d(classArray2[i], string, clazz2, n, classArray);
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

    private static Method h(long l, long l2) {
        int n = AdaptiveRenderingEngine.e(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = x[n];
                int n3 = string2.indexOf(8);
                clazz3 = AdaptiveRenderingEngine.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AdaptiveRenderingEngine.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdaptiveRenderingEngine.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        AdaptiveRenderingEngine.s[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdaptiveRenderingEngine.f(223551690492578L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AdaptiveRenderingEngine.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AdaptiveRenderingEngine.s[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdaptiveRenderingEngine.f(223551690492578L, 0L);
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
    public void F(boolean bl) {
        super.F(bl);
        this.m.F(bl);
        this.t.F(bl);
        this.a.F(bl);
        this.D.F(bl);
        this.X.F(bl);
    }

    @Override
    public boolean i() {
        return this.n;
    }

    public float D() {
        return ((Double)this.D.J()).floatValue() / (float)this.D.p();
    }

    public NumericPrecisionTransformer P() {
        return this.t;
    }

    public NumericPrecisionTransformer Q() {
        return this.m;
    }

    public ColorCompositionEngine L() {
        this.D();
        int n = Color.HSBtoRGB(this.h(), this.x(), this.Z());
        ColorCompositionEngine colorCompositionEngine = new ColorCompositionEngine(n);
        colorCompositionEngine.I(((Double)this.D.J()).intValue());
        return colorCompositionEngine;
    }

    AdaptiveRenderingEngine(Object object, String string, double d2, double d3, double d4, double d5) {
        long l = d ^ 0x94485CE2874L;
        super(object, string, new Object[0]);
        this.n = false;
        String string2 = "";
        this.m = NumericPrecisionTransformer.t(this, string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)1343, (long)(0x146A8E2A275E3C4EL ^ l)), (long)-3150747702905483002L, (long)l)), string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)23130, (long)(0x799255FC52AF6322L ^ l)), (long)-3150747702905483002L, (long)l)), "", 0.0, d2, 255.0);
        this.t = NumericPrecisionTransformer.t(this, string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)30813, (long)(0x20D748E2E4134136L ^ l)), (long)-3150747702905483002L, (long)l)), string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)6725, (long)(0x4D26CA79FFDE2339L ^ l)), (long)-3150747702905483002L, (long)l)), "", 0.0, d3, 255.0);
        this.a = NumericPrecisionTransformer.t(this, string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)17072, (long)(0x21B0E664F36D7BD2L ^ l)), (long)-3150747702905483002L, (long)l)), string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)9370, (long)(0x43554ED9188E9DE8L ^ l)), (long)-3150747702905483002L, (long)l)), "", 0.0, d4, 255.0);
        this.D = NumericPrecisionTransformer.t(this, string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)16448, (long)(0x782C496089F0F933L ^ l)), (long)-3150747702905483002L, (long)l)), string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)26619, (long)(0x182E31A6EC8FDE95L ^ l)), (long)-3150747702905483002L, (long)l)), "", 0.0, d5, 255.0);
        this.X = AuthenticationStateTracker.v(this, string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)19139, (long)(0x45AF934015ACF3A0L ^ l)), (long)-3150747702905483002L, (long)l)), string + (String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)14716, (long)(0x4B7A03DF17138016L ^ l)), (long)-3150747702905483002L, (long)l)), false);
        this.h = Arrays.asList(this.m, this.t, this.a, this.D, this.X);
        Object[] objectArray = new Object[this.h.size()];
        try {
            for (int i = 0; i < this.h.size(); ++i) {
                objectArray[i] = this.h.get(i).u();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
        }
        this.N = objectArray;
    }

    private static void a() {
        Object[] objectArray = s;
        s[0] = "Io\f";
        objectArray[1] = Integer.TYPE;
        AdaptiveRenderingEngine.x[1] = "java/lang/Integer";
        objectArray[2] = "\fs^F4e\u0007|O\tI}\u0014{F@";
        objectArray[3] = "6m\u001c8)x=b\rwHv6i\t-";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "v:$T\u0011}6m%=\u0004mLq4E\u0011t sfXo/50\"F\u0001-vrg=";
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = AdaptiveRenderingEngine.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AdaptiveRenderingEngine.d(classArray[i], string, clazz2);
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

    public NumericPrecisionTransformer H() {
        return this.D;
    }

    public float Z() {
        return ((Double)this.t.J()).floatValue() / (float)this.t.p();
    }

    public void Z() {
        double d2;
        block2: {
            this.F(true);
            d2 = (Double)this.Q().J() + (Double)GraphicalRenderingController.K.T.J();
            try {
                if (!(d2 > this.Q().p()) && !(d2 < this.Q().q())) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            d2 = this.Q().q();
        }
        this.m.r(d2);
        this.F(false);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveRenderingEngine.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void l(Object[] objectArray) {
        try {
            if (objectArray.length < this.h.size()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
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
        if (d4 > ((NumericPrecisionTransformer)this.A()).p()) {
            d4 = (Double)((ConfigurationProfileResolver)this.A()).J();
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
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            double d2 = (Double)this.m.J();
            this.E(EventDispatchCoordinator1159.b(this.h(), this.Z(), this.x()));
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AdaptiveRenderingEngine.e(l, l2);
            object = s[n];
            try {
                if (!(object instanceof String)) break block2;
                AdaptiveRenderingEngine.s[n] = clazz = Class.forName(x[n]);
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
                ((ConfigurationProfileResolver)this.A()).W();
                this.P().W();
                this.H().W();
                this.X.W();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
        }
    }

    public static AdaptiveRenderingEngine C(Object object, String string, Color color) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float f = fArray[0];
        float f2 = fArray[1];
        float f3 = fArray[2];
        int n = color.getAlpha();
        return AdaptiveRenderingEngine.J(object, string, f * 255.0f, f3 * 255.0f, f2 * 255.0f, n);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void z(boolean bl) {
        this.n = bl;
    }

    public Object[] c() {
        Object[] objectArray = new Object[this.h.size()];
        try {
            for (int i = 0; i < this.h.size(); ++i) {
                objectArray[i] = this.h.get(i).J();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6D39;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveRenderingEngine.k[n2] = n3;
        }
        return k[n2];
    }

    @Override
    public boolean C(JsonObject jsonObject) {
        block28: {
            long l;
            block29: {
                l = d ^ 0x5BDB34857173L;
                try {
                    try {
                        if (!super.C(jsonObject)) break block28;
                        if (!jsonObject.has((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)17458, (long)(0x3164B868903F2450L ^ l)), (long)-8268299712998963199L, (long)l)))) break block29;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveRenderingEngine.a(customSystemException);
                    }
                    this.m.r(jsonObject.get((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)12617, (long)(0x6CDF9C08AF925138L ^ l)), (long)-8268299712998963199L, (long)l))).getAsDouble() / 96.0 * 255.0);
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveRenderingEngine.a(customSystemException);
                }
            }
            try {
                if (jsonObject.has((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)9479, (long)(0x72FB9E1DD8284570L ^ l)), (long)-8268299712998963199L, (long)l)))) {
                    this.m.r(jsonObject.get((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)24199, (long)(0x2390B6729555BEF7L ^ l)), (long)-8268299712998963199L, (long)l))).getAsDouble());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            try {
                if (jsonObject.has((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)2131, (long)(0x31A6EA69AFB9E820L ^ l)), (long)-8268299712998963199L, (long)l)))) {
                    this.a.r(jsonObject.get((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)22339, (long)(0x6E3147D06798373DL ^ l)), (long)-8268299712998963199L, (long)l))).getAsDouble() / 96.0 * 255.0);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            try {
                if (jsonObject.has((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)24267, (long)(0x4D4128FFA14DBEB1L ^ l)), (long)-8268299712998963199L, (long)l)))) {
                    this.a.r(jsonObject.get((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)21823, (long)(0x6B7DFFBF159BB551L ^ l)), (long)-8268299712998963199L, (long)l))).getAsDouble());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            try {
                if (jsonObject.has((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)32041, (long)(0x86B57999F0D1D42L ^ l)), (long)-8268299712998963199L, (long)l)))) {
                    this.t.r(jsonObject.get((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)3443, (long)(0x31A80312F1EE6D0FL ^ l)), (long)-8268299712998963199L, (long)l))).getAsDouble() / 96.0 * 255.0);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            try {
                if (jsonObject.has((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)26367, (long)(0x38005DE319C186A7L ^ l)), (long)-8268299712998963199L, (long)l)))) {
                    this.t.r(jsonObject.get((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)25865, (long)(0x4BE051D354018550L ^ l)), (long)-8268299712998963199L, (long)l))).getAsDouble());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            try {
                if (jsonObject.has((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)32285, (long)(0x6985910AD00B1E64L ^ l)), (long)-8268299712998963199L, (long)l)))) {
                    this.D.r(jsonObject.get((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)14318, (long)(0x3DE20EAECC805793L ^ l)), (long)-8268299712998963199L, (long)l))).getAsDouble() / 96.0 * 255.0);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            try {
                if (jsonObject.has((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)5910, (long)(0x34C8945279F0F779L ^ l)), (long)-8268299712998963199L, (long)l)))) {
                    this.D.r(jsonObject.get((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)11777, (long)(0x410614121D1CCE6BL ^ l)), (long)-8268299712998963199L, (long)l))).getAsDouble());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            try {
                if (jsonObject.has((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)27982, (long)(0x59E508BE33778D29L ^ l)), (long)-8268299712998963199L, (long)l)))) {
                    this.X.H(jsonObject.get((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)11871, (long)(0x68B158F0B5A1CE3CL ^ l)), (long)-8268299712998963199L, (long)l))).getAsBoolean());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveRenderingEngine.a(customSystemException);
            }
            return true;
        }
        return false;
    }

    public Object[] b() {
        return this.c();
    }

    private void G(NumericPrecisionTransformer numericPrecisionTransformer) {
        try {
            if ((Double)numericPrecisionTransformer.J() < numericPrecisionTransformer.q()) {
                numericPrecisionTransformer.r(numericPrecisionTransformer.q());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
        }
        try {
            if ((Double)numericPrecisionTransformer.J() > numericPrecisionTransformer.p()) {
                numericPrecisionTransformer.r(numericPrecisionTransformer.p());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
        }
    }

    private static Field g(long l, long l2) {
        int n = AdaptiveRenderingEngine.e(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            String string = x[n];
            int n2 = string.indexOf(8);
            Class clazz = AdaptiveRenderingEngine.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AdaptiveRenderingEngine.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdaptiveRenderingEngine.c(clazz3, string2, clazz2)) != null) {
                    AdaptiveRenderingEngine.s[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AdaptiveRenderingEngine.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AdaptiveRenderingEngine.s[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdaptiveRenderingEngine.f(223551690492578L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public boolean p() {
        boolean bl;
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
                                    catch (CustomSystemException customSystemException) {
                                        throw AdaptiveRenderingEngine.a(customSystemException);
                                    }
                                    if (!this.a.p()) break block12;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveRenderingEngine.a(customSystemException);
                                }
                                if (!this.t.p()) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveRenderingEngine.a(customSystemException);
                            }
                            if (!this.D.p()) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveRenderingEngine.a(customSystemException);
                        }
                        if (!this.X.p()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveRenderingEngine.a(customSystemException);
                    }
                    bl = true;
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveRenderingEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == '\u00da' || c == '\u00ba' || c == 'n') {
                field = AdaptiveRenderingEngine.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdaptiveRenderingEngine.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ce' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static AdaptiveRenderingEngine J(Object object, String string, double d2, double d3, double d4, double d5) {
        return new AdaptiveRenderingEngine(object, string, d2, d3, d4, d5);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AdaptiveRenderingEngine.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public AdaptiveRenderingEngine E() {
        AdaptiveRenderingEngine adaptiveRenderingEngine = new AdaptiveRenderingEngine(null, this.O(), this.h() * 255.0f, this.Z() * 255.0f, this.x() * 255.0f, this.D() * 255.0f);
        adaptiveRenderingEngine.t(this.u());
        adaptiveRenderingEngine.m.M((Double)this.m.u());
        adaptiveRenderingEngine.t.M((Double)this.t.u());
        adaptiveRenderingEngine.a.M((Double)this.a.u());
        adaptiveRenderingEngine.D.M((Double)this.D.u());
        adaptiveRenderingEngine.X.t(this.X.u());
        return adaptiveRenderingEngine;
    }

    public void n(boolean bl) {
        this.X.H(bl);
        this.l(this.c());
    }

    public boolean g(Color color) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (Math.abs(color.getRed() - this.L().getRed()) >= 2 || Math.abs(color.getGreen() - this.L().getGreen()) >= 2) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveRenderingEngine.a(customSystemException);
                            }
                            if (Math.abs(color.getBlue() - this.L().getBlue()) >= 2) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveRenderingEngine.a(customSystemException);
                        }
                        if (Math.abs(color.getAlpha() - this.L().getAlpha()) >= 2) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveRenderingEngine.a(customSystemException);
                    }
                    bl = true;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveRenderingEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AdaptiveRenderingEngine.d = MultiContainerRegistry.a(-5458455469801364685L, 7524399424322044653L, MethodHandles.lookup().lookupClass()).a(47924841456758L);
                AdaptiveRenderingEngine.s = new Object[5];
                AdaptiveRenderingEngine.x = new String[5];
                AdaptiveRenderingEngine.a();
                AdaptiveRenderingEngine.o = new HashMap<K, V>(13);
                var0 = AdaptiveRenderingEngine.d ^ 67570536745843L;
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
        AdaptiveRenderingEngine.e = var8_3;
        AdaptiveRenderingEngine.k = new Integer[34];
        AdaptiveRenderingEngine.g = (int)AdaptiveRenderingEngine.b("w", (int)886, (long)(var0 ^ 5708069882402019598L));
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
    public NumericPrecisionTransformer A() {
        return this.a;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (x[n4] != null) {
            return n4;
        }
        Object object = s[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 48;
                break;
            }
            case 1: {
                n3 = 18;
                break;
            }
            case 2: {
                n3 = 38;
                break;
            }
            case 3: {
                n3 = 15;
                break;
            }
            case 4: {
                n3 = 0;
                break;
            }
            case 5: {
                n3 = 35;
                break;
            }
            case 6: {
                n3 = 16;
                break;
            }
            case 7: {
                n3 = 57;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 52;
                break;
            }
            case 11: {
                n3 = 55;
                break;
            }
            case 12: {
                n3 = 44;
                break;
            }
            case 13: {
                n3 = 41;
                break;
            }
            case 14: {
                n3 = 30;
                break;
            }
            case 15: {
                n3 = 28;
                break;
            }
            case 16: {
                n3 = 4;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 11;
                break;
            }
            case 19: {
                n3 = 59;
                break;
            }
            case 20: {
                n3 = 63;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 21;
                break;
            }
            case 23: {
                n3 = 17;
                break;
            }
            case 24: {
                n3 = 7;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 33;
                break;
            }
            case 27: {
                n3 = 12;
                break;
            }
            case 28: {
                n3 = 53;
                break;
            }
            case 29: {
                n3 = 1;
                break;
            }
            case 30: {
                n3 = 22;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 27;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 23;
                break;
            }
            case 35: {
                n3 = 51;
                break;
            }
            case 36: {
                n3 = 39;
                break;
            }
            case 37: {
                n3 = 56;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 5;
                break;
            }
            case 40: {
                n3 = 9;
                break;
            }
            case 41: {
                n3 = 37;
                break;
            }
            case 42: {
                n3 = 3;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 62;
                break;
            }
            case 46: {
                n3 = 36;
                break;
            }
            case 47: {
                n3 = 24;
                break;
            }
            case 48: {
                n3 = 54;
                break;
            }
            case 49: {
                n3 = 47;
                break;
            }
            case 50: {
                n3 = 14;
                break;
            }
            case 51: {
                n3 = 6;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 31;
                break;
            }
            case 54: {
                n3 = 26;
                break;
            }
            case 55: {
                n3 = 61;
                break;
            }
            case 56: {
                n3 = 58;
                break;
            }
            case 57: {
                n3 = 8;
                break;
            }
            case 58: {
                n3 = 60;
                break;
            }
            case 59: {
                n3 = 49;
                break;
            }
            case 60: {
                n3 = 25;
                break;
            }
            case 61: {
                n3 = 10;
                break;
            }
            case 62: {
                n3 = 50;
                break;
            }
            default: {
                n3 = 20;
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
        AdaptiveRenderingEngine.x[n4] = new String(cArray);
        return n4;
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

    @Override
    public JsonObject k(boolean bl) {
        long l = d ^ 0x5BA8936BD6A2L;
        JsonObject jsonObject = this.y();
        try {
            if (!this.m.p()) {
                jsonObject.addProperty((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)31902, (long)(0x38704B685D943B3DL ^ l)), (long)3066979127192268752L, (long)l)), (Number)this.m.J());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
        }
        try {
            if (!this.a.p()) {
                jsonObject.addProperty((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)27842, (long)(0x67E770C7DB642B75L ^ l)), (long)3066979127192268752L, (long)l)), (Number)this.a.J());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
        }
        try {
            if (!this.t.p()) {
                jsonObject.addProperty((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)12478, (long)(0x27FB9B3011387707L ^ l)), (long)3066979127192268752L, (long)l)), (Number)this.t.J());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
        }
        try {
            if (!this.D.p()) {
                jsonObject.addProperty((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)25447, (long)(0x4E0D6C45DC56A4D6L ^ l)), (long)3066979127192268752L, (long)l)), (Number)this.D.J());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
        }
        try {
            if (!this.X.p()) {
                jsonObject.addProperty((String)((Object)AdaptiveRenderingEngine.d("\u00f4", (int)AdaptiveRenderingEngine.b("w", (int)12200, (long)(0x4C944E5CAF3D6818L ^ l)), (long)3066979127192268752L, (long)l)), this.X.s());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveRenderingEngine.a(customSystemException);
        }
        return jsonObject;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveRenderingEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AdaptiveRenderingEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

