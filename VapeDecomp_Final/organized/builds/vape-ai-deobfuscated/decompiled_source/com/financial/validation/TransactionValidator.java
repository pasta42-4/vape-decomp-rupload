/*
 * Decompiled with CFR 0.152.
 */
package com.financial.validation;

import a.Ne;
import a.z6;
import com.analytics.computation.AnalyticsComputationEngine;
import com.app.graphics.GraphicsRenderingUtility1454;
import com.app.math.NumericStreamProcessor;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.math.conversion.NumericTransformationEngine1112;
import com.security.exchange.SecureDataExchanger793;
import com.system.configuration.ConfigurationManager;
import com.user.identity.UserIdentityManager;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TransactionValidator
extends AnalyticsComputationEngine {
    private static final String[] f;
    private static boolean i;
    private static final long b;
    private static final Object[] e;
    private static final long d;
    private NumericStreamProcessor G = new NumericStreamProcessor(0.5, 0.0, 1.0);

    public TransactionValidator(UserIdentityManager userIdentityManager, double[] dArray) {
        super(userIdentityManager, dArray);
        this.Z(18.0);
        this.w(18.0);
    }

    @Override
    public void G() {
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TransactionValidator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransactionValidator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/R3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransactionValidator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ee' || c == 'X' || c == '\u00da' || c == 'N') {
                field = TransactionValidator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ee' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransactionValidator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'o' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fe' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void A() {
        super.A();
        this.G.o();
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = TransactionValidator.a(l, l2);
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
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = TransactionValidator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransactionValidator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransactionValidator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransactionValidator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransactionValidator.b(236857734132023L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransactionValidator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransactionValidator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransactionValidator.b(236857734132023L, 0L);
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
    public void D(boolean bl) {
        float f;
        double d2;
        Color color;
        block13: {
            Color color2;
            int n;
            long l;
            block12: {
                l = b ^ 0x406271EDC8FL;
                Color color3 = GraphicsRenderingUtility1454.U(this.d());
                double d3 = this.G.h();
                n = (int)(100.0 + 150.0 * d3);
                color = color3;
                color2 = color = new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
                if (color3.equals(GraphicsRenderingUtility1454.P(-1))) {
                    color2 = new Color(0, 0, 0, n);
                }
                double d4 = 0.0;
                d2 = 0.0;
                double d5 = 1.0;
                double d6 = 5.0;
                double d7 = 2.5;
                try {
                    if (!bl) break block12;
                    ConfigurationManager.r(-3.5f, (float)(d2 - 2.5) - 1.0f, 7.0f, 2.0f, 1.0f, Color.WHITE);
                    ConfigurationManager.T(-2.5, (double)((float)(d2 - 2.5)), 5.0, 1.0, color2);
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionValidator.c(customSystemException);
                }
            }
            float f2 = 12.0f;
            float f3 = 0.0f - f2 / 2.0f;
            float f4 = (float)d2 - f2;
            StateTrackingCoordinator.B(Color.WHITE, f3, f4, (String)((Object)TransactionValidator.a("\u00fe", (int)((int)d), (long)-5149011178567474277L, (long)l)), f2, f2, false);
            ConfigurationManager.r(-2.5f, (float)((d2 -= 7.7) - 2.5), 5.0f, 2.0f, 1.0f, new Color(0, 0, 0, n));
            ConfigurationManager.T(-2.5, (double)((float)(d2 - 2.5)), 5.0, 1.0, color2);
        }
        boolean bl2 = false;
        List<NumericStreamProcessor> list = this.g();
        int n = list.size() - 1;
        while (true) {
            block15: {
                block14: {
                    try {
                        if (n < 0) break;
                        if (list.get(n).C()) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionValidator.c(customSystemException);
                    }
                    this.h(40.0, 0.0, d2, 5.0, 1.0, color, list.get(n));
                    bl2 = true;
                    break block15;
                }
                list.remove(n);
            }
            --n;
        }
        try {
            float f5 = f = bl ? 0.0f : 7.7f;
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator.c(customSystemException);
        }
        if (bl2) {
            double d8 = this.G.h();
            float f6 = -45.0f;
            double d9 = Math.min(d8, 0.98);
            double d10 = 500.0 - 500.0 * d9 - 2.0;
            double d11 = 4.0 + (7.0 - d8 * 7.0);
            double d12 = 4.0 - d8 * 4.0 + 1.0;
            for (int i = 0; i < 4; ++i) {
                double d13 = Math.cos(Math.toRadians(f6)) * (d10 + 1.0);
                double d14 = Math.sin(Math.toRadians(f6)) * (d10 + 1.0);
                if (ConfigurationManager.U()) {
                    SecureDataExchanger793 secureDataExchanger793 = z6.D.i();
                    Ne.h.z();
                    z6.D.i().E(secureDataExchanger793);
                } else {
                    Ne.h.z();
                }
                Ne.h.m(0.0 + d13, 0.0 + d14 - (double)f, 0.0);
                Ne.h.f(f6, 0.0f, 0.0f, 1.0f);
                ConfigurationManager.C(0.0, 0.0, d11 * d12, 0.5 * d12, new ColorCompositionEngine(Color.BLACK).I(255), 1.0f);
                ConfigurationManager.C(0.0, 0.0, d11 * d12, 0.5 * d12, new ColorCompositionEngine(Color.WHITE).I(255), 1.0f);
                Ne.h.X();
                f6 += 90.0f;
            }
        }
    }

    public static boolean V() {
        boolean bl = TransactionValidator.Z();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator.c(customSystemException);
        }
        return false;
    }

    private static Field c(long l, long l2) {
        int n = TransactionValidator.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = TransactionValidator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransactionValidator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransactionValidator.a(clazz3, string2, clazz2)) != null) {
                    TransactionValidator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransactionValidator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransactionValidator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransactionValidator.b(236857734132023L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public NumericTransformationEngine1112 n() {
        return NumericTransformationEngine1112.V(this.P(), this.K(), this.N());
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = TransactionValidator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransactionValidator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static boolean Z() {
        return i;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TransactionValidator.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                TransactionValidator.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(-5465720729927007478L, -8085790319878728517L, MethodHandles.lookup().lookupClass()).a(5650050473969L);
        e = new Object[5];
        f = new String[5];
        TransactionValidator.b();
        long l = b ^ 0x7BF6744349E7L;
        TransactionValidator.M(false);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 3394996827216815175L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static void M(boolean bl) {
        i = bl;
    }

    public void h(double d2, double d3, double d4, double d5, double d6, Color color, NumericStreamProcessor numericStreamProcessor) {
        double d7 = numericStreamProcessor.h();
        ConfigurationManager.r((float)(d3 - d5 / 2.0 - d6 - d2 / 2.0 * d7), (float)(d4 - d5 / 2.0 - d6 - d2 / 2.0 * d7), (float)(d5 + d6 * 2.0 + d2 * d7), 2.0f, 1.5f, new Color(26, 25, 26, (int)((1.0 - d7) * 100.0)));
        d6 = 0.0;
        ConfigurationManager.r((float)(d3 - d5 / 2.0 - d6 - d2 / 2.0 * d7), (float)(d4 - d5 / 2.0 - d6 - d2 / 2.0 * d7), (float)(d5 + d6 * 2.0 + d2 * d7), 2.0f, 1.0f, new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((1.0 - d7) * 255.0)));
    }

    private static void b() {
        Object[] objectArray = e;
        e[0] = "L\u000fL";
        objectArray[1] = Integer.TYPE;
        TransactionValidator.f[1] = "java/lang/Integer";
        objectArray[2] = "\bwP\u001eL\u0019\u0003xAQ1\u0001\u0010\u007fH\u0018";
        objectArray[3] = "3F\"6`O8I3y\u0001A3B7#";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "c\u00105tFf3P<\u001fUb\u000f\u0012e Y'fQ*\"^\u00196O,n\u0005e?\u00124'>";
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

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 22;
                break;
            }
            case 1: {
                n3 = 59;
                break;
            }
            case 2: {
                n3 = 28;
                break;
            }
            case 3: {
                n3 = 27;
                break;
            }
            case 4: {
                n3 = 61;
                break;
            }
            case 5: {
                n3 = 58;
                break;
            }
            case 6: {
                n3 = 1;
                break;
            }
            case 7: {
                n3 = 0;
                break;
            }
            case 8: {
                n3 = 6;
                break;
            }
            case 9: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 63;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 39;
                break;
            }
            case 13: {
                n3 = 60;
                break;
            }
            case 14: {
                n3 = 8;
                break;
            }
            case 15: {
                n3 = 41;
                break;
            }
            case 16: {
                n3 = 37;
                break;
            }
            case 17: {
                n3 = 4;
                break;
            }
            case 18: {
                n3 = 51;
                break;
            }
            case 19: {
                n3 = 48;
                break;
            }
            case 20: {
                n3 = 14;
                break;
            }
            case 21: {
                n3 = 26;
                break;
            }
            case 22: {
                n3 = 33;
                break;
            }
            case 23: {
                n3 = 56;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 44;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 47;
                break;
            }
            case 28: {
                n3 = 13;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 21;
                break;
            }
            case 31: {
                n3 = 32;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 3;
                break;
            }
            case 34: {
                n3 = 55;
                break;
            }
            case 35: {
                n3 = 42;
                break;
            }
            case 36: {
                n3 = 15;
                break;
            }
            case 37: {
                n3 = 35;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 18;
                break;
            }
            case 41: {
                n3 = 46;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 31;
                break;
            }
            case 44: {
                n3 = 29;
                break;
            }
            case 45: {
                n3 = 24;
                break;
            }
            case 46: {
                n3 = 45;
                break;
            }
            case 47: {
                n3 = 43;
                break;
            }
            case 48: {
                n3 = 50;
                break;
            }
            case 49: {
                n3 = 38;
                break;
            }
            case 50: {
                n3 = 62;
                break;
            }
            case 51: {
                n3 = 52;
                break;
            }
            case 52: {
                n3 = 7;
                break;
            }
            case 53: {
                n3 = 20;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 17;
                break;
            }
            case 56: {
                n3 = 9;
                break;
            }
            case 57: {
                n3 = 10;
                break;
            }
            case 58: {
                n3 = 30;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 25;
                break;
            }
            case 61: {
                n3 = 57;
                break;
            }
            case 62: {
                n3 = 12;
                break;
            }
            default: {
                n3 = 49;
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
        TransactionValidator.f[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransactionValidator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

