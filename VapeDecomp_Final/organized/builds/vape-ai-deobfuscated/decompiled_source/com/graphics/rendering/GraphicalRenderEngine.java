/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.graphics.rendering;

import a.tl;
import a.z6;
import com.analytics.computation.MetricsCalculationEngine;
import com.collections.management.MultiContainerRegistry;
import com.core.management.ResourceAllocator1845;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.crypto.CryptographicSecurityManager396;
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
import org.lwjgl.opengl.GL11;

public class GraphicalRenderEngine
extends CryptographicSecurityManager396 {
    private static final Object[] db;
    private static final String[] eb;
    private static final long F;
    private static final long n;
    private Color R;

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public GraphicalRenderEngine(String string, double d2, double d3, Color color, Color color2, boolean bl, boolean bl2) {
        super(string, "", d2, d3, color, bl, bl2);
        this.R = color2;
    }

    @Override
    public double u() {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        int n = ResourceAllocator1845.A.r(this.D);
        try {
            cryptographicParameterGenerator = this.D.Q() ? this.t(this.D.H()) : this.L(this.D.H());
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderEngine.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        try {
            if (n >= 0) {
                return cryptographicParameterGenerator2.D(this.B().substring(0, n));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderEngine.a(customSystemException);
        }
        return 0.0;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GraphicalRenderEngine.i(l, l2);
            object = db[n];
            try {
                if (!(object instanceof String)) break block2;
                GraphicalRenderEngine.db[n] = clazz = Class.forName(eb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GraphicalRenderEngine.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GraphicalRenderEngine.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void i() {
        Object[] objectArray = db;
        db[0] = "e7~";
        objectArray[1] = Integer.TYPE;
        GraphicalRenderEngine.eb[1] = "java/lang/Integer";
        objectArray[2] = "xw\"e1|sx3*Ld`\u007f:c";
        objectArray[3] = "vAd\\\u0006=}Nu\u0013g3vEqI";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "'_^\by=dI@pu\"\u0019FHKl'f\u0007\u0002\u000e\u001e`i\u0001\u0002Ol?s^Ip";
    }

    private static Method l(long l, long l2) {
        int n = GraphicalRenderEngine.i(l, l2);
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
                clazz3 = GraphicalRenderEngine.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GraphicalRenderEngine.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GraphicalRenderEngine.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        GraphicalRenderEngine.db[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GraphicalRenderEngine.j(248092432883817L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GraphicalRenderEngine.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GraphicalRenderEngine.db[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GraphicalRenderEngine.j(248092432883817L, 0L);
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

    /*
     * Enabled aggressive block sorting
     */
    static {
        n = MultiContainerRegistry.a(-6021090709514115573L, 490252532547965001L, MethodHandles.lookup().lookupClass()).a(171206422567795L);
        db = new Object[5];
        eb = new String[5];
        GraphicalRenderEngine.i();
        long l = n ^ 0x686D676925C3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 1810634342085850255L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                F = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void z(Color color) {
        this.R = color;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int i(long l, long l2) {
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
                n3 = 9;
                break;
            }
            case 1: {
                n3 = 42;
                break;
            }
            case 2: {
                n3 = 43;
                break;
            }
            case 3: {
                n3 = 38;
                break;
            }
            case 4: {
                n3 = 25;
                break;
            }
            case 5: {
                n3 = 37;
                break;
            }
            case 6: {
                n3 = 18;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 31;
                break;
            }
            case 9: {
                n3 = 16;
                break;
            }
            case 10: {
                n3 = 39;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 26;
                break;
            }
            case 13: {
                n3 = 0;
                break;
            }
            case 14: {
                n3 = 2;
                break;
            }
            case 15: {
                n3 = 23;
                break;
            }
            case 16: {
                n3 = 61;
                break;
            }
            case 17: {
                n3 = 40;
                break;
            }
            case 18: {
                n3 = 51;
                break;
            }
            case 19: {
                n3 = 13;
                break;
            }
            case 20: {
                n3 = 45;
                break;
            }
            case 21: {
                n3 = 47;
                break;
            }
            case 22: {
                n3 = 5;
                break;
            }
            case 23: {
                n3 = 53;
                break;
            }
            case 24: {
                n3 = 62;
                break;
            }
            case 25: {
                n3 = 27;
                break;
            }
            case 26: {
                n3 = 35;
                break;
            }
            case 27: {
                n3 = 60;
                break;
            }
            case 28: {
                n3 = 14;
                break;
            }
            case 29: {
                n3 = 28;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 36;
                break;
            }
            case 32: {
                n3 = 4;
                break;
            }
            case 33: {
                n3 = 34;
                break;
            }
            case 34: {
                n3 = 22;
                break;
            }
            case 35: {
                n3 = 1;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 11;
                break;
            }
            case 38: {
                n3 = 21;
                break;
            }
            case 39: {
                n3 = 48;
                break;
            }
            case 40: {
                n3 = 56;
                break;
            }
            case 41: {
                n3 = 10;
                break;
            }
            case 42: {
                n3 = 3;
                break;
            }
            case 43: {
                n3 = 8;
                break;
            }
            case 44: {
                n3 = 20;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 54;
                break;
            }
            case 48: {
                n3 = 57;
                break;
            }
            case 49: {
                n3 = 58;
                break;
            }
            case 50: {
                n3 = 44;
                break;
            }
            case 51: {
                n3 = 46;
                break;
            }
            case 52: {
                n3 = 49;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 52;
                break;
            }
            case 55: {
                n3 = 63;
                break;
            }
            case 56: {
                n3 = 24;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 17;
                break;
            }
            case 59: {
                n3 = 33;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 19;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 7;
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
        GraphicalRenderEngine.eb[n4] = new String(cArray);
        return n4;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GraphicalRenderEngine.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d1' || c == '\u00c7' || c == '\u00e3' || c == '\u00ee') {
                field = GraphicalRenderEngine.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GraphicalRenderEngine.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'o' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = GraphicalRenderEngine.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GraphicalRenderEngine.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public Color m() {
        return this.R;
    }

    @Override
    public void y(double d2, double d3) {
        String string;
        StringBuilder stringBuilder;
        block69: {
            block67: {
                block68: {
                    String string2;
                    StringBuilder stringBuilder2;
                    boolean bl;
                    boolean bl2;
                    int n;
                    long l;
                    block62: {
                        MetricsCalculationEngine metricsCalculationEngine;
                        block66: {
                            String string3;
                            CryptographicParameterGenerator cryptographicParameterGenerator;
                            block65: {
                                CryptographicParameterGenerator cryptographicParameterGenerator2;
                                block64: {
                                    block63: {
                                        block58: {
                                            block61: {
                                                CryptographicParameterGenerator cryptographicParameterGenerator3;
                                                block60: {
                                                    block59: {
                                                        l = GraphicalRenderEngine.n ^ 0x2579F3BC2B26L;
                                                        n = ResourceAllocator1845.A.r(this.D);
                                                        try {
                                                            try {
                                                                if (n != this.B().length() - 1) break block58;
                                                                if (!this.D.Q()) break block59;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw GraphicalRenderEngine.a(customSystemException);
                                                            }
                                                            cryptographicParameterGenerator3 = this.t(this.D.H());
                                                            break block60;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw GraphicalRenderEngine.a(customSystemException);
                                                        }
                                                    }
                                                    cryptographicParameterGenerator3 = this.L(this.D.H());
                                                }
                                                cryptographicParameterGenerator = cryptographicParameterGenerator3;
                                                try {
                                                    if (!this.V) break block61;
                                                    cryptographicParameterGenerator.Y(this.B(), d2, d3, this.B);
                                                    break block62;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalRenderEngine.a(customSystemException);
                                                }
                                            }
                                            cryptographicParameterGenerator.R(this.B(), d2, d3, this.B);
                                            break block62;
                                        }
                                        try {
                                            try {
                                                if (n < 0) break block62;
                                                if (!this.D.Q()) break block63;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicalRenderEngine.a(customSystemException);
                                            }
                                            cryptographicParameterGenerator2 = this.t(this.D.H());
                                            break block64;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalRenderEngine.a(customSystemException);
                                        }
                                    }
                                    cryptographicParameterGenerator2 = this.L(this.D.H());
                                }
                                cryptographicParameterGenerator = cryptographicParameterGenerator2;
                                string3 = this.B().substring(0, n);
                                double d4 = cryptographicParameterGenerator.D(string3);
                                double d5 = cryptographicParameterGenerator.B(string3);
                                metricsCalculationEngine = new MetricsCalculationEngine(d2, d3, this.x(), d5);
                                try {
                                    GraphicsBufferAllocator.e(metricsCalculationEngine.K() - 1.0, metricsCalculationEngine.q(), metricsCalculationEngine.t() + 1.0, metricsCalculationEngine.V());
                                    if (!this.V) break block65;
                                    cryptographicParameterGenerator.Y(string3, metricsCalculationEngine.K(), metricsCalculationEngine.q(), this.B);
                                    break block66;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicalRenderEngine.a(customSystemException);
                                }
                            }
                            cryptographicParameterGenerator.R(string3, metricsCalculationEngine.K(), metricsCalculationEngine.q(), this.B);
                        }
                        GraphicsBufferAllocator.F();
                        if (ConfigurationManager.U()) {
                            Color color;
                            ColorCompositionEngine colorCompositionEngine;
                            double d6;
                            double d7;
                            double d8;
                            double d9;
                            double d10;
                            double d11;
                            double d12;
                            double d13;
                            ColorCompositionEngine colorCompositionEngine2 = new ColorCompositionEngine(this.R);
                            try {
                                colorCompositionEngine2.I(0);
                                d13 = metricsCalculationEngine.K() + metricsCalculationEngine.t() - 6.0;
                                d12 = metricsCalculationEngine.q();
                                d11 = metricsCalculationEngine.K() + metricsCalculationEngine.t() - 6.0;
                                d10 = metricsCalculationEngine.q() + metricsCalculationEngine.V();
                                d9 = metricsCalculationEngine.K() + metricsCalculationEngine.t();
                                d8 = metricsCalculationEngine.q() + metricsCalculationEngine.V();
                                d7 = metricsCalculationEngine.K() + metricsCalculationEngine.t();
                                d6 = metricsCalculationEngine.q();
                                colorCompositionEngine = colorCompositionEngine2;
                                color = this.R == null ? new Color(0, 0, 0, 0) : this.R;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            z6.d(d13, d12, d11, d10, d9, d8, d7, d6, colorCompositionEngine, color);
                        } else {
                            Color color;
                            boolean bl3 = GL11.glIsEnabled((int)3042);
                            boolean bl4 = GL11.glIsEnabled((int)3553);
                            boolean bl5 = GL11.glIsEnabled((int)2896);
                            boolean bl6 = GL11.glIsEnabled((int)3008);
                            boolean bl7 = GL11.glIsEnabled((int)2884);
                            try {
                                if (!bl3) {
                                    tl.N();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            try {
                                if (bl4) {
                                    tl.R();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            try {
                                if (bl5) {
                                    tl.P();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            try {
                                if (!bl6) {
                                    tl.s();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            try {
                                if (bl7) {
                                    tl.M();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            GL11.glShadeModel((int)7425);
                            ColorCompositionEngine colorCompositionEngine = new ColorCompositionEngine(this.R);
                            try {
                                colorCompositionEngine.I(0);
                                GraphicsBufferAllocator.Y(colorCompositionEngine);
                                GL11.glBegin((int)7);
                                GL11.glVertex2d((double)(metricsCalculationEngine.K() + metricsCalculationEngine.t() - 6.0), (double)metricsCalculationEngine.q());
                                GL11.glVertex2d((double)(metricsCalculationEngine.K() + metricsCalculationEngine.t() - 6.0), (double)(metricsCalculationEngine.q() + metricsCalculationEngine.V()));
                                color = this.R == null ? new Color(0, 0, 0, 0) : this.R;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            try {
                                GraphicsBufferAllocator.Y(color);
                                GL11.glVertex2d((double)(metricsCalculationEngine.K() + metricsCalculationEngine.t()), (double)(metricsCalculationEngine.q() + metricsCalculationEngine.V()));
                                GL11.glVertex2d((double)(metricsCalculationEngine.K() + metricsCalculationEngine.t()), (double)metricsCalculationEngine.q());
                                GL11.glEnd();
                                GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
                                GL11.glShadeModel((int)7424);
                                if (!bl6) {
                                    tl.Z();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            try {
                                if (bl5) {
                                    tl.T();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            try {
                                if (!bl3) {
                                    tl.j();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            try {
                                if (bl7) {
                                    tl.V();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                            try {
                                if (bl4) {
                                    tl.B();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderEngine.a(customSystemException);
                            }
                        }
                    }
                    try {
                        bl2 = n < this.D.i().length() - 1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderEngine.a(customSystemException);
                    }
                    boolean bl8 = bl2;
                    try {
                        bl = !this.E.equals("");
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderEngine.a(customSystemException);
                    }
                    boolean bl9 = bl;
                    try {
                        stringBuilder2 = new StringBuilder();
                        string2 = bl8 ? this.D.i() : "";
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderEngine.a(customSystemException);
                    }
                    try {
                        try {
                            stringBuilder = stringBuilder2.append(string2);
                            if (!bl9) break block67;
                            if (!bl8) break block68;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderEngine.a(customSystemException);
                        }
                        string = (String)((Object)GraphicalRenderEngine.c("o", (int)((int)F), (long)-6866509846918008978L, (long)l)) + this.E;
                        break block69;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderEngine.a(customSystemException);
                    }
                }
                string = this.E;
                break block69;
            }
            string = "";
        }
        String string4 = stringBuilder.append(string).toString();
        this.g(string4);
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

    private static Field k(long l, long l2) {
        int n = GraphicalRenderEngine.i(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            String string = eb[n];
            int n2 = string.indexOf(8);
            Class clazz = GraphicalRenderEngine.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GraphicalRenderEngine.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GraphicalRenderEngine.e(clazz3, string2, clazz2)) != null) {
                    GraphicalRenderEngine.db[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GraphicalRenderEngine.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GraphicalRenderEngine.db[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GraphicalRenderEngine.j(248092432883817L, 0L);
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
            return MethodHandles.lookup().findStatic(GraphicalRenderEngine.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

