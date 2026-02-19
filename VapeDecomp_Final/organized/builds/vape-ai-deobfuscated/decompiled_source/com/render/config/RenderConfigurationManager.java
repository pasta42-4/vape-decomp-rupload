/*
 * Decompiled with CFR 0.152.
 */
package com.render.config;

import a.hQ;
import com.app.math.NumericStreamProcessor;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderConfigurationManager
extends hQ {
    private static final String[] eb;
    private boolean L;
    private static final long bb;
    private boolean b;
    private final NumericStreamProcessor V;
    private static final Object[] db;
    private boolean D;
    private static final long ab;
    private final String PD;
    private final float Y = 4.0f;
    private final Color Pt;
    private final double P3;

    public RenderConfigurationManager(String string) {
        this(string, 0.9);
    }

    private void i() {
        block6: {
            block5: {
                try {
                    if (!this.b) break block5;
                    this.V.L();
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderConfigurationManager.a(customSystemException);
                }
            }
            try {
                if (this.V.d()) {
                    this.V.D();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RenderConfigurationManager.a(customSystemException);
            }
        }
    }

    @Override
    public void g() {
        this.L = true;
    }

    @Override
    public void U() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = RenderConfigurationManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = RenderConfigurationManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (eb[n4] != null) {
            return n4;
        }
        Object object = db[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 40;
                break;
            }
            case 1: {
                n3 = 12;
                break;
            }
            case 2: {
                n3 = 55;
                break;
            }
            case 3: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 27;
                break;
            }
            case 5: {
                n3 = 47;
                break;
            }
            case 6: {
                n3 = 9;
                break;
            }
            case 7: {
                n3 = 28;
                break;
            }
            case 8: {
                n3 = 36;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 15;
                break;
            }
            case 11: {
                n3 = 53;
                break;
            }
            case 12: {
                n3 = 39;
                break;
            }
            case 13: {
                n3 = 25;
                break;
            }
            case 14: {
                n3 = 3;
                break;
            }
            case 15: {
                n3 = 59;
                break;
            }
            case 16: {
                n3 = 51;
                break;
            }
            case 17: {
                n3 = 32;
                break;
            }
            case 18: {
                n3 = 34;
                break;
            }
            case 19: {
                n3 = 37;
                break;
            }
            case 20: {
                n3 = 8;
                break;
            }
            case 21: {
                n3 = 16;
                break;
            }
            case 22: {
                n3 = 46;
                break;
            }
            case 23: {
                n3 = 44;
                break;
            }
            case 24: {
                n3 = 7;
                break;
            }
            case 25: {
                n3 = 6;
                break;
            }
            case 26: {
                n3 = 14;
                break;
            }
            case 27: {
                n3 = 57;
                break;
            }
            case 28: {
                n3 = 26;
                break;
            }
            case 29: {
                n3 = 29;
                break;
            }
            case 30: {
                n3 = 1;
                break;
            }
            case 31: {
                n3 = 19;
                break;
            }
            case 32: {
                n3 = 0;
                break;
            }
            case 33: {
                n3 = 50;
                break;
            }
            case 34: {
                n3 = 31;
                break;
            }
            case 35: {
                n3 = 61;
                break;
            }
            case 36: {
                n3 = 18;
                break;
            }
            case 37: {
                n3 = 35;
                break;
            }
            case 38: {
                n3 = 23;
                break;
            }
            case 39: {
                n3 = 45;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 21;
                break;
            }
            case 42: {
                n3 = 24;
                break;
            }
            case 43: {
                n3 = 5;
                break;
            }
            case 44: {
                n3 = 43;
                break;
            }
            case 45: {
                n3 = 52;
                break;
            }
            case 46: {
                n3 = 60;
                break;
            }
            case 47: {
                n3 = 33;
                break;
            }
            case 48: {
                n3 = 20;
                break;
            }
            case 49: {
                n3 = 63;
                break;
            }
            case 50: {
                n3 = 58;
                break;
            }
            case 51: {
                n3 = 30;
                break;
            }
            case 52: {
                n3 = 62;
                break;
            }
            case 53: {
                n3 = 54;
                break;
            }
            case 54: {
                n3 = 11;
                break;
            }
            case 55: {
                n3 = 10;
                break;
            }
            case 56: {
                n3 = 42;
                break;
            }
            case 57: {
                n3 = 38;
                break;
            }
            case 58: {
                n3 = 48;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 56;
                break;
            }
            case 61: {
                n3 = 2;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 22;
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
        RenderConfigurationManager.eb[n4] = new String(cArray);
        return n4;
    }

    private static Method h(long l, long l2) {
        int n = RenderConfigurationManager.e(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = eb[n];
                int n3 = string2.indexOf(8);
                clazz3 = RenderConfigurationManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = RenderConfigurationManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = RenderConfigurationManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        RenderConfigurationManager.db[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = RenderConfigurationManager.f(237347543313018L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = RenderConfigurationManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        RenderConfigurationManager.db[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = RenderConfigurationManager.f(237347543313018L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean J() {
        return this.b;
    }

    public NumericStreamProcessor L() {
        return this.V;
    }

    public String a() {
        return this.PD;
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    if (!this.L || this.s()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderConfigurationManager.a(customSystemException);
                }
                this.L = false;
            }
            catch (CustomSystemException customSystemException) {
                throw RenderConfigurationManager.a(customSystemException);
            }
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == 'X' || c == '\u00f2' || c == '\u00cf') {
                field = RenderConfigurationManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = RenderConfigurationManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public RenderConfigurationManager(String string, double d2, boolean bl) {
        this.getClass();
        this.V = new NumericStreamProcessor(0.15, 0.0, 3.0);
        this.Y = 4.0f;
        this.Pt = RenderConfigurationManager.M.Z;
        this.PD = string;
        this.P3 = d2;
        this.b = bl;
        this.N(this::lambda$new$0);
        this.i();
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = RenderConfigurationManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = RenderConfigurationManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = MultiContainerRegistry.a(8074709659893308719L, -44201218753887464L, MethodHandles.lookup().lookupClass()).a(155115077100831L);
        db = new Object[5];
        eb = new String[5];
        RenderConfigurationManager.n();
        long l = ab ^ 0x1A8A0C34AA53L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 7082464550288034490L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                bb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public boolean K() {
        return this.D;
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

    private static Field g(long l, long l2) {
        int n = RenderConfigurationManager.e(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            String string = eb[n];
            int n2 = string.indexOf(8);
            Class clazz = RenderConfigurationManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = RenderConfigurationManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = RenderConfigurationManager.c(clazz3, string2, clazz2)) != null) {
                    RenderConfigurationManager.db[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = RenderConfigurationManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        RenderConfigurationManager.db[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = RenderConfigurationManager.f(237347543313018L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void e(boolean bl) {
        block6: {
            block7: {
                boolean bl2;
                try {
                    bl2 = this.b != bl;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderConfigurationManager.a(customSystemException);
                }
                boolean bl3 = bl2;
                try {
                    try {
                        this.b = bl;
                        if (!bl3) break block6;
                        if (!this.V.F()) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RenderConfigurationManager.a(customSystemException);
                    }
                    this.i();
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderConfigurationManager.a(customSystemException);
                }
            }
            this.V.c();
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void n() {
        Object[] objectArray = db;
        db[0] = "\u0002h)";
        objectArray[1] = Integer.TYPE;
        RenderConfigurationManager.eb[1] = "java/lang/Integer";
        objectArray[2] = "\u0018X;QB,\u0013W*\u001e?4\u0000P#W";
        objectArray[3] = "/G|00($Hm\u007fQ&/Ci%";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "WS^\b\u001d\u0003\u0002[Qv\u0017F<BK\u0015D\u0002\u0002X_M|\u0004^\u0001J\u0010\u001eRS\u0003\u0019v";
    }

    @Override
    public void G() {
        Color color;
        Color color2;
        double d2;
        double d3;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        long l;
        block14: {
            block13: {
                CryptographicParameterGenerator cryptographicParameterGenerator2;
                block12: {
                    block11: {
                        l = ab ^ 0x432FEEAA5CA8L;
                        try {
                            try {
                                if (!this.b || !this.D) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RenderConfigurationManager.a(customSystemException);
                            }
                            cryptographicParameterGenerator2 = this.t(this.P3);
                            break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RenderConfigurationManager.a(customSystemException);
                        }
                    }
                    cryptographicParameterGenerator2 = this.L(this.P3);
                }
                cryptographicParameterGenerator = cryptographicParameterGenerator2;
                double d4 = cryptographicParameterGenerator.B(this.PD);
                d3 = this.W() + this.b() / 2.0 - d4 / 2.0;
                d2 = this.W() + this.b() / 2.0 - (double)(this.Y / 2.0f);
                Color color3 = RenderConfigurationManager.M.g;
                color2 = RenderConfigurationManager.M.n;
                if (this.L) {
                    color3 = RenderConfigurationManager.M.T;
                    color2 = RenderConfigurationManager.M.c;
                }
                if (this.b) {
                    color3 = RenderConfigurationManager.M.T;
                    color2 = RenderConfigurationManager.M.c;
                    if (this.L) {
                        color2 = EventDispatchCoordinator1159.P(color2, 30.0);
                    }
                }
                try {
                    try {
                        ConfigurationManager.A(this.G(), this.W() + 1.0, this.w() - 2.0, this.b() - 2.5, color3);
                        ConfigurationManager.S(this.G(), this.W() + 1.5, this.w(), this.b() - 3.0, color3);
                        if (!this.b && !this.L) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RenderConfigurationManager.a(customSystemException);
                    }
                    color = color2;
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderConfigurationManager.a(customSystemException);
                }
            }
            color = this.Pt;
        }
        float f = (float)this.G() + (float)this.w();
        this.getClass();
        StateTrackingCoordinator.B(color, f - 5.0f - 5.0f + this.V.t().floatValue(), (float)d2, (String)((Object)RenderConfigurationManager.b("\u00ce", (int)((int)bb), (long)8938338135576854579L, (long)l)), this.Y, this.Y, false);
        double d5 = this.G();
        this.getClass();
        cryptographicParameterGenerator.R(this.PD, d5 + (double)(5.0f * 2.0f), d3, color2);
    }

    public RenderConfigurationManager(String string, double d2) {
        this(string, d2, false);
    }

    public void Z(boolean bl) {
        this.D = bl;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = RenderConfigurationManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public double z() {
        return 18.0;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = RenderConfigurationManager.e(l, l2);
            object = db[n];
            try {
                if (!(object instanceof String)) break block2;
                RenderConfigurationManager.db[n] = clazz = Class.forName(eb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public double e() {
        return 110.0;
    }

    private void lambda$new$0() {
        boolean bl;
        RenderConfigurationManager renderConfigurationManager;
        try {
            renderConfigurationManager = this;
            bl = !this.b;
        }
        catch (CustomSystemException customSystemException) {
            throw RenderConfigurationManager.a(customSystemException);
        }
        renderConfigurationManager.e(bl);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RenderConfigurationManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

