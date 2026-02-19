/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.math.precision;

import a.bE;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.event.management.EventDistributionHub;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.transformation.NumericTransformationEngine;
import com.ui.events.UserInteractionEventDispatcher;
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
import org.jetbrains.annotations.Nullable;

public class PrecisionMathOrchestrator
extends NumericTransformationEngine {
    private double MA;
    private double M2;
    private NumericTransformationEngine Md;
    private static final Object[] ob;
    private AbstractComputationKernel M3;
    private double Mp;
    private static final long ab;
    private static final long eb;
    private double Mg;
    private bE MW;
    private bE MO;
    private static final String[] pb;

    public NumericTransformationEngine G() {
        return this.Md;
    }

    @Override
    public void M() {
        super.M();
        this.Md.M();
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = PrecisionMathOrchestrator.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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
    public void u() {
    }

    @Override
    public double z() {
        this.Md.w(this.Md.d().R());
        this.Md.T(this.Md.d().C());
        return this.Md.b() + this.MA + this.M2;
    }

    @Override
    public void i() {
    }

    private static Field k(long l, long l2) {
        int n = PrecisionMathOrchestrator.i(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            String string = pb[n];
            int n2 = string.indexOf(8);
            Class clazz = PrecisionMathOrchestrator.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = PrecisionMathOrchestrator.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = PrecisionMathOrchestrator.e(clazz3, string2, clazz2)) != null) {
                    PrecisionMathOrchestrator.ob[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = PrecisionMathOrchestrator.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        PrecisionMathOrchestrator.ob[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = PrecisionMathOrchestrator.j(247609641830006L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Nullable
    public <T extends AbstractComputationKernel> T w(Class<T> clazz) {
        AbstractComputationKernel abstractComputationKernel;
        try {
            abstractComputationKernel = clazz.isInstance(this.M3) ? (AbstractComputationKernel)clazz.cast(this.M3) : null;
        }
        catch (CustomSystemException customSystemException) {
            throw PrecisionMathOrchestrator.b(customSystemException);
        }
        return (T)abstractComputationKernel;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = PrecisionMathOrchestrator.i(l, l2);
            object = ob[n];
            try {
                if (!(object instanceof String)) break block2;
                PrecisionMathOrchestrator.ob[n] = clazz = Class.forName(pb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AbstractComputationKernel s() {
        return this.M3;
    }

    public PrecisionMathOrchestrator(double d2, double d3, double d4, double d5, AbstractComputationKernel abstractComputationKernel) {
        long l = ab ^ 0x64DEBADB2ABEL;
        this.Md = new GraphicalRenderEngine1082(0.0, 0.0);
        this.MA = d2;
        this.M2 = d3;
        this.Mp = d4;
        this.Mg = d5;
        this.M3 = abstractComputationKernel;
        EventDistributionHub eventDistributionHub = this.d();
        eventDistributionHub.o(false);
        eventDistributionHub.m(false);
        eventDistributionHub.y(false);
        eventDistributionHub.i(false);
        eventDistributionHub.v(false);
        eventDistributionHub.f((String)((Object)PrecisionMathOrchestrator.d("\u00f3", (int)((int)eb), (long)5480337630590466793L, (long)l)));
        this.MW = new bE(0.0, d2);
        this.MO = new bE(d4, 0.0);
        this.Md.o(this.MO, abstractComputationKernel);
        this.o(this.MW, this.Md);
        this.Md.i(false);
        this.i(false);
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (pb[n4] != null) {
            return n4;
        }
        Object object = ob[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 14;
                break;
            }
            case 1: {
                n3 = 63;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 23;
                break;
            }
            case 4: {
                n3 = 61;
                break;
            }
            case 5: {
                n3 = 37;
                break;
            }
            case 6: {
                n3 = 1;
                break;
            }
            case 7: {
                n3 = 30;
                break;
            }
            case 8: {
                n3 = 15;
                break;
            }
            case 9: {
                n3 = 10;
                break;
            }
            case 10: {
                n3 = 55;
                break;
            }
            case 11: {
                n3 = 21;
                break;
            }
            case 12: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 47;
                break;
            }
            case 14: {
                n3 = 50;
                break;
            }
            case 15: {
                n3 = 27;
                break;
            }
            case 16: {
                n3 = 0;
                break;
            }
            case 17: {
                n3 = 25;
                break;
            }
            case 18: {
                n3 = 56;
                break;
            }
            case 19: {
                n3 = 49;
                break;
            }
            case 20: {
                n3 = 36;
                break;
            }
            case 21: {
                n3 = 53;
                break;
            }
            case 22: {
                n3 = 40;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 59;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 20;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 62;
                break;
            }
            case 29: {
                n3 = 58;
                break;
            }
            case 30: {
                n3 = 29;
                break;
            }
            case 31: {
                n3 = 11;
                break;
            }
            case 32: {
                n3 = 38;
                break;
            }
            case 33: {
                n3 = 22;
                break;
            }
            case 34: {
                n3 = 8;
                break;
            }
            case 35: {
                n3 = 31;
                break;
            }
            case 36: {
                n3 = 44;
                break;
            }
            case 37: {
                n3 = 28;
                break;
            }
            case 38: {
                n3 = 43;
                break;
            }
            case 39: {
                n3 = 51;
                break;
            }
            case 40: {
                n3 = 19;
                break;
            }
            case 41: {
                n3 = 57;
                break;
            }
            case 42: {
                n3 = 41;
                break;
            }
            case 43: {
                n3 = 46;
                break;
            }
            case 44: {
                n3 = 13;
                break;
            }
            case 45: {
                n3 = 35;
                break;
            }
            case 46: {
                n3 = 42;
                break;
            }
            case 47: {
                n3 = 34;
                break;
            }
            case 48: {
                n3 = 4;
                break;
            }
            case 49: {
                n3 = 2;
                break;
            }
            case 50: {
                n3 = 18;
                break;
            }
            case 51: {
                n3 = 5;
                break;
            }
            case 52: {
                n3 = 54;
                break;
            }
            case 53: {
                n3 = 45;
                break;
            }
            case 54: {
                n3 = 24;
                break;
            }
            case 55: {
                n3 = 33;
                break;
            }
            case 56: {
                n3 = 60;
                break;
            }
            case 57: {
                n3 = 52;
                break;
            }
            case 58: {
                n3 = 48;
                break;
            }
            case 59: {
                n3 = 7;
                break;
            }
            case 60: {
                n3 = 16;
                break;
            }
            case 61: {
                n3 = 17;
                break;
            }
            case 62: {
                n3 = 32;
                break;
            }
            default: {
                n3 = 9;
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
        PrecisionMathOrchestrator.pb[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = PrecisionMathOrchestrator.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = PrecisionMathOrchestrator.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void U(double d2) {
        this.MA = d2;
        this.MW.w(d2);
        this.MW.i(true);
        this.MW.Q(Color.magenta);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public PrecisionMathOrchestrator(double d2, AbstractComputationKernel abstractComputationKernel) {
        this(d2, d2, abstractComputationKernel);
    }

    private static void D() {
        Object[] objectArray = ob;
        ob[0] = "|\u00166";
        objectArray[1] = Integer.TYPE;
        PrecisionMathOrchestrator.pb[1] = "java/lang/Integer";
        objectArray[2] = "\n)!\bRy\u0001&0G/a\u0012!9\u000e";
        objectArray[3] = "\u0000\u0014__~V\u000b\u001bN\u0010\u001fX\u0000\u0010JJ";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "7N'qN\u0001kKi\u0003]DSH.:YO7\t|`Q?j\u0003kmIQ<J)a6";
    }

    public PrecisionMathOrchestrator(double d2, double d3, AbstractComputationKernel abstractComputationKernel) {
        this(d3, d3, d2, d2, abstractComputationKernel);
    }

    @Override
    public void C() {
    }

    private static Method l(long l, long l2) {
        int n = PrecisionMathOrchestrator.i(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n];
                int n3 = string2.indexOf(8);
                clazz3 = PrecisionMathOrchestrator.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = PrecisionMathOrchestrator.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = PrecisionMathOrchestrator.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        PrecisionMathOrchestrator.ob[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = PrecisionMathOrchestrator.j(247609641830006L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = PrecisionMathOrchestrator.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        PrecisionMathOrchestrator.ob[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = PrecisionMathOrchestrator.j(247609641830006L, 0L);
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

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cb' || c == '\u00fe' || c == '\u00a3' || c == '\u00c1') {
                field = PrecisionMathOrchestrator.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = PrecisionMathOrchestrator.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = MultiContainerRegistry.a(7081227223284677133L, 4836181913236409082L, MethodHandles.lookup().lookupClass()).a(158069140615098L);
        ob = new Object[5];
        pb = new String[5];
        PrecisionMathOrchestrator.D();
        long l = ab ^ 0x74D2F691C210L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -3648552318338632166L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                eb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @Override
    public double e() {
        return this.Md.d().C() + this.Mg;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = PrecisionMathOrchestrator.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = PrecisionMathOrchestrator.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PrecisionMathOrchestrator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

