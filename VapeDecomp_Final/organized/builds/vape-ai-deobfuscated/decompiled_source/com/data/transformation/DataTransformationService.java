/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.V3;
import com.app.logging.core.LoggingInterceptor2041;
import com.app.network.CommunicationProtocolManager1453;
import com.collections.management.MultiContainerRegistry;
import com.config.validation.ConfigurationValidator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.runtime.mediation.RuntimeContextMediator;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.session.CryptoSessionManager819;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.parameters.SystemParameterConfiguration;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.validation.TransactionValidator1298;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DataTransformationService
extends RuntimeContextMediator {
    private static Map<Integer, Integer> Vu;
    private static final Map xb;
    private CryptoSessionManager819 VC = (CryptoSessionManager819)this.t();
    private static final Object[] Ib;
    private static final String[] Jb;
    int Vx;
    private static final long fb;
    private static final Integer[] wb;
    private static final long[] vb;

    private boolean y(V3 v3) {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    try {
                        try {
                            if (GeometryCalculator.C() < 35) break block4;
                            if (v3.G().a()) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationService.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationService.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return TransactionValidator1298.l(v3.n()).D();
    }

    private static int f(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x294C;
        if (wb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = vb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])xb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    xb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataTransformationService.wb[n2] = n3;
        }
        return wb[n2];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void V() {
        ArrayList<V3> arrayList;
        block38: {
            block39: {
                try {
                    if (ApplicationLifecycleManager.U().Y()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationService.a(customSystemException);
                }
                arrayList = this.s();
                try {
                    try {
                        if (!arrayList.isEmpty()) break block38;
                        if (Vu.isEmpty()) break block39;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationService.a(customSystemException);
                    }
                    Vu.clear();
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationService.a(customSystemException);
                }
            }
            return;
        }
        double d2 = this.W();
        double d3 = 30.0;
        this.Vx = 0;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().T(0.85, true);
        if (LoggingInterceptor2041.E().d()) {
            cryptographicParameterGenerator = TemporalMetadataResolver.h.W().E(SystemParameterConfiguration.NOTO, 0.85f, false);
        }
        for (V3 v32 : arrayList) {
            void var13_20;
            String string;
            Object object;
            V3 v32;
            block45: {
                float f;
                block44: {
                    block43: {
                        LinkedList<Integer> linkedList;
                        boolean bl;
                        block42: {
                            block41: {
                                block40: {
                                    bl = false;
                                    linkedList = new LinkedList<Integer>();
                                    try {
                                        if (this.y(v32) || this.VC.b.s().booleanValue()) break block40;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataTransformationService.a(customSystemException);
                                    }
                                    linkedList.add(this.G(v32));
                                    bl = true;
                                }
                                try {
                                    if (!this.y(v32) || this.VC.G.s().booleanValue()) break block41;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataTransformationService.a(customSystemException);
                                }
                                linkedList.add(this.G(v32));
                                bl = true;
                            }
                            try {
                                try {
                                    if (Vu.containsKey(v32.n()) && Vu.get(v32.n()) >= v32.V()) break block42;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataTransformationService.a(customSystemException);
                                }
                                Vu.put(v32.n(), v32.V());
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataTransformationService.a(customSystemException);
                            }
                        }
                        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
                        for (V3 v33 : arrayList) {
                            object = new V3(v33);
                            arrayList2.add(((V3)object).n());
                        }
                        for (Integer n : Vu.keySet()) {
                            try {
                                if (arrayList2.contains(n)) continue;
                                linkedList.add(n);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataTransformationService.a(customSystemException);
                            }
                        }
                        for (Integer n : linkedList) {
                            Vu.remove(n);
                        }
                        try {
                            if (bl) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationService.a(customSystemException);
                        }
                        f = this.M(v32.V(), Vu.get(v32.n()).intValue());
                        Color color = DataTransformationService.M.c;
                        try {
                            if (!(f > 50.0f) || !(f <= 100.0f)) break block43;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationService.a(customSystemException);
                        }
                        Color color2 = DataTransformationService.M.Y;
                        break block45;
                    }
                    try {
                        if (!(f > 25.0f) || !(f <= 50.0f)) break block44;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationService.a(customSystemException);
                    }
                    Color color = DataTransformationService.M.o;
                    break block45;
                }
                if (f <= 25.0f) {
                    Color color = DataTransformationService.M.O;
                }
            }
            this.F((float)(this.G() + 6.0), (float)(d2 + 6.0), v32);
            object = EventDispatchCoordinator1159.y(Color.WHITE, 51);
            try {
                ConfigurationManager.T(this.G() + 30.0, d2 + 10.0, 11.5, 2.0f, (Color)object);
                string = GeometryCalculator.C() >= 35 ? v32.G().j() : LoggingInterceptor2041.f(TransactionValidator1298.l(v32.n()).Y(), new Object[0]);
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationService.a(customSystemException);
            }
            String string2 = string;
            String string3 = this.a(v32.V());
            int n = (int)cryptographicParameterGenerator.D(string2);
            try {
                if (n > this.Vx) {
                    this.Vx = n;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationService.a(customSystemException);
            }
            int n2 = (int)cryptographicParameterGenerator.D(string3);
            try {
                if (n2 > this.Vx) {
                    this.Vx = n2;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationService.a(customSystemException);
            }
            cryptographicParameterGenerator.R(string2, this.G() + 35.0, d2 + 9.0, this.A());
            cryptographicParameterGenerator.K(string3, this.G() + 35.0, d2 + 17.0, this.s((Color)var13_20), this.s(new Color(50, 50, 50, 150)));
            ConfigurationValidator.m(v32, (int)(this.G() + 9.0), (int)(d2 + 10.0), 14, 14, this.L());
            d2 += d3;
        }
    }

    private int G(V3 v3) {
        try {
            if (GeometryCalculator.C() >= 35) {
                return CommunicationProtocolManager1453.s(v3.G());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransformationService.a(customSystemException);
        }
        return TransactionValidator1298.l(v3.n()).u();
    }

    @Override
    public String A() {
        long l = fb ^ 0x145AC5C944E3L;
        return DataTransformationService.l("\u00f4", (int)DataTransformationService.f("r", (int)26060, (long)(0x69AA6DB091FD8F12L ^ l)), (long)4868402898492329287L, (long)l);
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'V' || c == 'M' || c == 'W' || c == '\u00cd') {
                field = DataTransformationService.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'V' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataTransformationService.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'h' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = DataTransformationService.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataTransformationService.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int u(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Jb[n4] != null) {
            return n4;
        }
        Object object = Ib[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 13;
                break;
            }
            case 2: {
                n3 = 21;
                break;
            }
            case 3: {
                n3 = 63;
                break;
            }
            case 4: {
                n3 = 29;
                break;
            }
            case 5: {
                n3 = 7;
                break;
            }
            case 6: {
                n3 = 24;
                break;
            }
            case 7: {
                n3 = 60;
                break;
            }
            case 8: {
                n3 = 51;
                break;
            }
            case 9: {
                n3 = 46;
                break;
            }
            case 10: {
                n3 = 14;
                break;
            }
            case 11: {
                n3 = 48;
                break;
            }
            case 12: {
                n3 = 15;
                break;
            }
            case 13: {
                n3 = 53;
                break;
            }
            case 14: {
                n3 = 58;
                break;
            }
            case 15: {
                n3 = 2;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 54;
                break;
            }
            case 18: {
                n3 = 59;
                break;
            }
            case 19: {
                n3 = 16;
                break;
            }
            case 20: {
                n3 = 45;
                break;
            }
            case 21: {
                n3 = 6;
                break;
            }
            case 22: {
                n3 = 4;
                break;
            }
            case 23: {
                n3 = 20;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 32;
                break;
            }
            case 26: {
                n3 = 19;
                break;
            }
            case 27: {
                n3 = 40;
                break;
            }
            case 28: {
                n3 = 44;
                break;
            }
            case 29: {
                n3 = 56;
                break;
            }
            case 30: {
                n3 = 26;
                break;
            }
            case 31: {
                n3 = 27;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 41;
                break;
            }
            case 34: {
                n3 = 39;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 17;
                break;
            }
            case 37: {
                n3 = 28;
                break;
            }
            case 38: {
                n3 = 1;
                break;
            }
            case 39: {
                n3 = 11;
                break;
            }
            case 40: {
                n3 = 42;
                break;
            }
            case 41: {
                n3 = 10;
                break;
            }
            case 42: {
                n3 = 33;
                break;
            }
            case 43: {
                n3 = 37;
                break;
            }
            case 44: {
                n3 = 9;
                break;
            }
            case 45: {
                n3 = 31;
                break;
            }
            case 46: {
                n3 = 43;
                break;
            }
            case 47: {
                n3 = 62;
                break;
            }
            case 48: {
                n3 = 5;
                break;
            }
            case 49: {
                n3 = 61;
                break;
            }
            case 50: {
                n3 = 52;
                break;
            }
            case 51: {
                n3 = 23;
                break;
            }
            case 52: {
                n3 = 3;
                break;
            }
            case 53: {
                n3 = 25;
                break;
            }
            case 54: {
                n3 = 8;
                break;
            }
            case 55: {
                n3 = 57;
                break;
            }
            case 56: {
                n3 = 22;
                break;
            }
            case 57: {
                n3 = 38;
                break;
            }
            case 58: {
                n3 = 55;
                break;
            }
            case 59: {
                n3 = 50;
                break;
            }
            case 60: {
                n3 = 47;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 30;
                break;
            }
            default: {
                n3 = 36;
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
        DataTransformationService.Jb[n4] = new String(cArray);
        return n4;
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataTransformationService.u(l, l2);
            object = Ib[n];
            try {
                if (!(object instanceof String)) break block2;
                DataTransformationService.Ib[n] = clazz = Class.forName(Jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public double b() {
        int n;
        block4: {
            double d2;
            block6: {
                block5: {
                    n = Vu.size();
                    try {
                        try {
                            if (n != 0) break block4;
                            if (!GraphicalRenderingController.K.P) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationService.a(customSystemException);
                        }
                        d2 = 0.0;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationService.a(customSystemException);
                    }
                }
                d2 = 20.0;
            }
            return d2;
        }
        return 2 + n * 30;
    }

    @Override
    public double w() {
        return 40 + this.Vx;
    }

    private static Field w(long l, long l2) {
        int n = DataTransformationService.u(l, l2);
        Object object = Ib[n];
        if (object instanceof String) {
            String string = Jb[n];
            int n2 = string.indexOf(8);
            Class clazz = DataTransformationService.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataTransformationService.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataTransformationService.k(clazz3, string2, clazz2)) != null) {
                    DataTransformationService.Ib[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataTransformationService.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataTransformationService.Ib[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataTransformationService.v(245938659526407L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void F(float f, float f2, V3 v3) {
        block7: {
            float f3;
            Color color;
            block6: {
                float f4;
                block8: {
                    block5: {
                        f4 = this.M(v3.V(), Vu.get(v3.n()).intValue());
                        color = DataTransformationService.M.Y;
                        try {
                            if (!(f4 > 25.0f) || !(f4 <= 50.0f)) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationService.a(customSystemException);
                        }
                        color = DataTransformationService.M.o;
                        break block8;
                    }
                    if (f4 <= 25.0f) {
                        color = DataTransformationService.M.O;
                    }
                }
                f3 = 360.0f * (f4 / 100.0f);
                try {
                    ConfigurationManager.r(f - 0.5f, f2 - 0.5f, 21.25f, 1.8f, 1.0f, this.s(new Color(0, 0, 0, 200)));
                    if (f3 != 360.0f) break block6;
                    ConfigurationManager.r(f - 1.0f, f2 - 1.0f, 22.0f, 2.5f, 1.0f, this.s(color));
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataTransformationService.a(customSystemException);
                }
            }
            ConfigurationManager.V(f - 1.0f, f2 - 1.0f, 22.0f, 2.0f, 0.5f, 270.0f, -f3, this.s(color));
        }
    }

    private static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataTransformationService.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataTransformationService.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void T() {
        Object[] objectArray = Ib;
        Ib[0] = "z\u0016=";
        objectArray[1] = Integer.TYPE;
        DataTransformationService.Jb[1] = "java/lang/Integer";
        objectArray[2] = "\u0004'\u000bV\n\u0017\u000f(\u001a\u0019w\u000f\u001c/\u0013P";
        objectArray[3] = "VFLf{\"]I])\u001a,VBYs";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "o5iSc-j1kox'T70S(1-<a\u001e\u0013flt2\u000b)9m){o";
    }

    private ArrayList<V3> s() {
        ArrayList<V3> arrayList;
        block11: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            Collection collection = systemConfigurationOrchestrator.A();
            arrayList = new ArrayList<V3>();
            for (Object e : collection) {
                V3 v3 = new V3(e);
                arrayList.add(v3);
            }
            try {
                block12: {
                    try {
                        try {
                            try {
                                try {
                                    if (!arrayList.isEmpty() || GraphicalRenderingController.K.P) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataTransformationService.a(customSystemException);
                                }
                                arrayList.add(V3.H(1, 6500, 0));
                                arrayList.add(V3.H(2, 5000, 0));
                                arrayList.add(V3.H(12, 1000, 0));
                                if (!Vu.containsKey(1)) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataTransformationService.a(customSystemException);
                            }
                            if (!Vu.containsKey(2)) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataTransformationService.a(customSystemException);
                        }
                        if (Vu.containsKey(12)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataTransformationService.a(customSystemException);
                    }
                }
                Vu.put(1, 10000);
                Vu.put(2, 10000);
                Vu.put(12, 10000);
            }
            catch (CustomSystemException customSystemException) {
                throw DataTransformationService.a(customSystemException);
            }
        }
        return arrayList;
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public DataTransformationService() {
        super(CryptoSessionManager819.class);
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataTransformationService.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method k(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataTransformationService.fb = MultiContainerRegistry.a(7205418541371910976L, 8032520873521021405L, MethodHandles.lookup().lookupClass()).a(223365671760003L);
                DataTransformationService.Ib = new Object[5];
                DataTransformationService.Jb = new String[5];
                DataTransformationService.T();
                DataTransformationService.xb = new HashMap<K, V>(13);
                var0 = DataTransformationService.fb ^ 8814653674318L;
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
                var6_5 = "@\u0011\u0083Gb\u0096\u001e\u00156\u00f2\u00c4V\u00d4\u0097\u00b5F";
                var7_6 = "@\u0011\u0083Gb\u0096\u001e\u00156\u00f2\u00c4V\u00d4\u0097\u00b5F".length();
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
                    var6_5 = "r.Dg\u00ff\u00bb\u00c3\u00aa\u00cd&\u00d9\u00ab\u0094\u00a9\u00feg";
                    var7_6 = "r.Dg\u00ff\u00bb\u00c3\u00aa\u00cd&\u00d9\u00ab\u0094\u00a9\u00feg".length();
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
        DataTransformationService.vb = var8_3;
        DataTransformationService.wb = new Integer[4];
        DataTransformationService.Vu = new HashMap<Integer, Integer>();
    }

    private String a(int n) {
        long l = fb ^ 0x6471481A2DE2L;
        int n2 = n / 20;
        int n3 = n2 / 60;
        String string = String.valueOf(n3);
        String string2 = String.valueOf(n2 -= n3 * 60);
        if (n3 < 10) {
            string = (String)((Object)DataTransformationService.l("\u00f4", (int)DataTransformationService.f("r", (int)20925, (long)(0x712D1E5FFC98D263L ^ l)), (long)3067367579603264582L, (long)l)) + string;
        }
        if (n2 < 10) {
            string2 = (String)((Object)DataTransformationService.l("\u00f4", (int)DataTransformationService.f("r", (int)21047, (long)(0x5F555AAFFE13D1EAL ^ l)), (long)3067367579603264582L, (long)l)) + string2;
        }
        return string + (String)((Object)DataTransformationService.l("\u00f4", (int)DataTransformationService.f("r", (int)8280, (long)(0x3B7A795299EBA384L ^ l)), (long)3067367579603264582L, (long)l)) + string2;
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataTransformationService.f(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method x(long l, long l2) {
        int n = DataTransformationService.u(l, l2);
        Object object = Ib[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataTransformationService.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataTransformationService.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataTransformationService.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataTransformationService.Ib[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataTransformationService.v(245938659526407L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataTransformationService.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataTransformationService.Ib[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataTransformationService.v(245938659526407L, 0L);
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

    private float M(float f, float f2) {
        return f / f2 * 100.0f;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataTransformationService.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DataTransformationService.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

