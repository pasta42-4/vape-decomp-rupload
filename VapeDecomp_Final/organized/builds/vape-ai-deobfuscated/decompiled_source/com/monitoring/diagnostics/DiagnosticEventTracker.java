/*
 * Decompiled with CFR 0.152.
 */
package com.monitoring.diagnostics;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.geospatial.calculation.GeographicalPositionCalculator;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DiagnosticEventTracker
extends GeographicalPositionCalculator {
    private static final String[] db;
    private int V;
    private int F;
    private static final Object[] bb;
    private static final Integer[] E;
    private static final long[] D;
    private static final long b;
    private static final Map ab;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DiagnosticEventTracker.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DiagnosticEventTracker.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void F(int n) {
        this.V = n;
    }

    @Override
    public void U() {
        this.m();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DiagnosticEventTracker.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ea' || c == '\u00e2' || c == '\u00c5' || c == 'Y') {
                field = DiagnosticEventTracker.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DiagnosticEventTracker.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DiagnosticEventTracker.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DiagnosticEventTracker.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double z() {
        return 30.0;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DiagnosticEventTracker.e(l, l2);
            object = bb[n];
            try {
                if (!(object instanceof String)) break block2;
                DiagnosticEventTracker.bb[n] = clazz = Class.forName(db[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DiagnosticEventTracker.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field g(long l, long l2) {
        int n = DiagnosticEventTracker.e(l, l2);
        Object object = bb[n];
        if (object instanceof String) {
            String string = db[n];
            int n2 = string.indexOf(8);
            Class clazz = DiagnosticEventTracker.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DiagnosticEventTracker.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DiagnosticEventTracker.c(clazz3, string2, clazz2)) != null) {
                    DiagnosticEventTracker.bb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DiagnosticEventTracker.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DiagnosticEventTracker.bb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DiagnosticEventTracker.f(238763546143476L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x100B;
        if (E[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = D[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ab.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ab.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DiagnosticEventTracker.E[n2] = n3;
        }
        return E[n2];
    }

    @Override
    public void d() {
    }

    private void m() {
        CallSite callSite;
        CallSite callSite2;
        double d2;
        double d3;
        long l;
        block31: {
            block30: {
                String string;
                String string2;
                Color color;
                double d4;
                double d5;
                String string3;
                CryptographicParameterGenerator cryptographicParameterGenerator;
                double d6;
                double d7;
                int n;
                CryptographicParameterGenerator cryptographicParameterGenerator2;
                block29: {
                    boolean bl;
                    block28: {
                        Object object;
                        StringBuilder stringBuilder;
                        boolean bl2;
                        block27: {
                            block26: {
                                boolean bl3;
                                boolean bl4;
                                l = b ^ 0x38282FBD8A91L;
                                cryptographicParameterGenerator2 = this.L(0.85);
                                int n2 = this.V - this.F;
                                n = Math.abs(n2);
                                try {
                                    bl4 = n2 < 0;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DiagnosticEventTracker.a(customSystemException);
                                }
                                bl = bl4;
                                try {
                                    bl3 = n2 > 0;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DiagnosticEventTracker.a(customSystemException);
                                }
                                bl2 = bl3;
                                try {
                                    stringBuilder = new StringBuilder();
                                    if (!bl2) break block26;
                                    object = DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)28112, (long)(0x212BD58C8BAA8FE1L ^ l)), (long)8230615300990953823L, (long)l);
                                    break block27;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DiagnosticEventTracker.a(customSystemException);
                                }
                            }
                            try {
                                object = bl ? DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)22141, (long)(0xE224C1BAC6D3447L ^ l)), (long)8230615300990953823L, (long)l) : "";
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DiagnosticEventTracker.a(customSystemException);
                            }
                        }
                        String string4 = stringBuilder.append((String)object).append(n).toString();
                        d7 = cryptographicParameterGenerator2.D(string4) + 5.0;
                        if (d7 < 10.0) {
                            d7 = 10.0;
                        }
                        ConfigurationManager.S(this.G() + 5.0, this.W() + 5.0, d7, 10.0, DiagnosticEventTracker.M.S);
                        d6 = this.W() + 5.0 + 2.0;
                        try {
                            cryptographicParameterGenerator = cryptographicParameterGenerator2;
                            string3 = string4;
                            d5 = this.G() + 5.0 + d7 / 2.0;
                            d4 = d6;
                            if (!bl2) break block28;
                            color = DiagnosticEventTracker.M.Y;
                            break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DiagnosticEventTracker.a(customSystemException);
                        }
                    }
                    try {
                        color = bl ? DiagnosticEventTracker.M.O : DiagnosticEventTracker.M.n;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DiagnosticEventTracker.a(customSystemException);
                    }
                }
                try {
                    cryptographicParameterGenerator.Q(string3, d5, d4, color);
                    cryptographicParameterGenerator2.R(this.O(), this.G() + 10.0 + d7, d6, DiagnosticEventTracker.M.n);
                    string2 = this.V > 9 ? "" + this.V : (String)((Object)DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)1063, (long)(0x224681100866661CL ^ l)), (long)8230615300990953823L, (long)l)) + this.V;
                }
                catch (CustomSystemException customSystemException) {
                    throw DiagnosticEventTracker.a(customSystemException);
                }
                String string5 = string2;
                try {
                    string = this.F > 9 ? "" + this.F : (String)((Object)DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)27720, (long)(0x14B6AB10F99D8E7EL ^ l)), (long)8230615300990953823L, (long)l)) + this.F;
                }
                catch (CustomSystemException customSystemException) {
                    throw DiagnosticEventTracker.a(customSystemException);
                }
                String string6 = string;
                double d8 = cryptographicParameterGenerator2.D(string5);
                double d9 = cryptographicParameterGenerator2.D(string5);
                double d10 = cryptographicParameterGenerator2.D((String)((Object)DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)1595, (long)(0xE2419DE9819640EL ^ l)), (long)8230615300990953823L, (long)l)));
                double d11 = this.G() + this.w() - 5.0 - d9;
                cryptographicParameterGenerator2.R(string6, d11, d6, DiagnosticEventTracker.M.w);
                cryptographicParameterGenerator2.R((String)((Object)DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)1495, (long)(0x26612CC0F59167E3L ^ l)), (long)8230615300990953823L, (long)l)), d11 - 5.0 - d10, d6, DiagnosticEventTracker.M.w);
                cryptographicParameterGenerator2.R(string5, d11 - 10.0 - d10 - d8, d6, DiagnosticEventTracker.M.n);
                d3 = this.W() + 22.5;
                double d12 = 6.0;
                ConfigurationManager.A(this.G() + 5.0, d3 - 0.5, this.w() - 10.0, 1.0, DiagnosticEventTracker.M.S);
                int n3 = this.V + this.F;
                try {
                    if (n3 == 0) {
                        ConfigurationManager.x((String)((Object)DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)6764, (long)(0x7C87B206F9E4F85BL ^ l)), (long)8230615300990953823L, (long)l)), this.G() + this.w() / 2.0, d3, 20.0, 20.0, Color.WHITE);
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DiagnosticEventTracker.a(customSystemException);
                }
                double d13 = (double)n / (double)n3;
                double d14 = this.w() / 2.0 - 5.0 - d12;
                d2 = this.V >= this.F ? this.G() + 5.0 + d14 - d14 * d13 : this.G() + 5.0 + d14 + d12 * 2.0 + d14 * d13;
                try {
                    if (this.V < this.F) break block30;
                    ConfigurationManager.A(d2, d3 - 0.5, this.G() + this.w() / 2.0 - d2, 1.0, DiagnosticEventTracker.M.Y);
                    break block31;
                }
                catch (CustomSystemException customSystemException) {
                    throw DiagnosticEventTracker.a(customSystemException);
                }
            }
            ConfigurationManager.A(this.G() + this.w() / 2.0, d3 - 0.5, d2 - this.G() - this.w() / 2.0, 1.0, DiagnosticEventTracker.M.O);
        }
        try {
            callSite2 = this.V >= this.F ? DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)24740, (long)(0x2EF463CF72E38297L ^ l)), (long)8230615300990953823L, (long)l) : DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)31703, (long)(0x27F47728A58E99E7L ^ l)), (long)8230615300990953823L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw DiagnosticEventTracker.a(customSystemException);
        }
        try {
            ConfigurationManager.x((String)((Object)callSite2), this.G() + this.w() / 2.0, d3, 20.0, 20.0, Color.WHITE);
            callSite = this.V >= this.F ? DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)20128, (long)(0x2B727D442A42AC99L ^ l)), (long)8230615300990953823L, (long)l) : DiagnosticEventTracker.c("\u00f5", (int)DiagnosticEventTracker.b("e", (int)941, (long)(0x73195126B33619FL ^ l)), (long)8230615300990953823L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw DiagnosticEventTracker.a(customSystemException);
        }
        ConfigurationManager.x((String)((Object)callSite), d2, d3, 20.0, 20.0, Color.WHITE);
    }

    @Override
    public void G() {
        this.m();
    }

    @Override
    public double e() {
        return 20.0;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void A(int n) {
        this.F = n;
    }

    private static Method h(long l, long l2) {
        int n = DiagnosticEventTracker.e(l, l2);
        Object object = bb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = db[n];
                int n3 = string2.indexOf(8);
                clazz3 = DiagnosticEventTracker.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DiagnosticEventTracker.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DiagnosticEventTracker.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DiagnosticEventTracker.bb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DiagnosticEventTracker.f(238763546143476L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DiagnosticEventTracker.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DiagnosticEventTracker.bb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DiagnosticEventTracker.f(238763546143476L, 0L);
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

    private static void a() {
        Object[] objectArray = bb;
        bb[0] = "7q6";
        objectArray[1] = Integer.TYPE;
        DiagnosticEventTracker.db[1] = "java/lang/Integer";
        objectArray[2] = "p&?!X\u0007{).n%\u001fh.''";
        objectArray[3] = "l8R*\u0019:g7Cex4l<G?";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "p1X\tuS=o\u000b{dKA\u007fP\u0002cI1k\u000b\u0007\u000f\t qJ\u0015q\u0000:3A{";
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (db[n4] != null) {
            return n4;
        }
        Object object = bb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 52;
                break;
            }
            case 2: {
                n3 = 31;
                break;
            }
            case 3: {
                n3 = 34;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 27;
                break;
            }
            case 6: {
                n3 = 45;
                break;
            }
            case 7: {
                n3 = 56;
                break;
            }
            case 8: {
                n3 = 12;
                break;
            }
            case 9: {
                n3 = 4;
                break;
            }
            case 10: {
                n3 = 47;
                break;
            }
            case 11: {
                n3 = 39;
                break;
            }
            case 12: {
                n3 = 51;
                break;
            }
            case 13: {
                n3 = 13;
                break;
            }
            case 14: {
                n3 = 22;
                break;
            }
            case 15: {
                n3 = 2;
                break;
            }
            case 16: {
                n3 = 41;
                break;
            }
            case 17: {
                n3 = 6;
                break;
            }
            case 18: {
                n3 = 18;
                break;
            }
            case 19: {
                n3 = 53;
                break;
            }
            case 20: {
                n3 = 49;
                break;
            }
            case 21: {
                n3 = 50;
                break;
            }
            case 22: {
                n3 = 24;
                break;
            }
            case 23: {
                n3 = 11;
                break;
            }
            case 24: {
                n3 = 55;
                break;
            }
            case 25: {
                n3 = 5;
                break;
            }
            case 26: {
                n3 = 43;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 46;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 62;
                break;
            }
            case 31: {
                n3 = 35;
                break;
            }
            case 32: {
                n3 = 23;
                break;
            }
            case 33: {
                n3 = 28;
                break;
            }
            case 34: {
                n3 = 1;
                break;
            }
            case 35: {
                n3 = 0;
                break;
            }
            case 36: {
                n3 = 59;
                break;
            }
            case 37: {
                n3 = 15;
                break;
            }
            case 38: {
                n3 = 7;
                break;
            }
            case 39: {
                n3 = 37;
                break;
            }
            case 40: {
                n3 = 26;
                break;
            }
            case 41: {
                n3 = 44;
                break;
            }
            case 42: {
                n3 = 20;
                break;
            }
            case 43: {
                n3 = 19;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 29;
                break;
            }
            case 46: {
                n3 = 58;
                break;
            }
            case 47: {
                n3 = 57;
                break;
            }
            case 48: {
                n3 = 14;
                break;
            }
            case 49: {
                n3 = 61;
                break;
            }
            case 50: {
                n3 = 36;
                break;
            }
            case 51: {
                n3 = 63;
                break;
            }
            case 52: {
                n3 = 32;
                break;
            }
            case 53: {
                n3 = 9;
                break;
            }
            case 54: {
                n3 = 30;
                break;
            }
            case 55: {
                n3 = 60;
                break;
            }
            case 56: {
                n3 = 33;
                break;
            }
            case 57: {
                n3 = 17;
                break;
            }
            case 58: {
                n3 = 42;
                break;
            }
            case 59: {
                n3 = 10;
                break;
            }
            case 60: {
                n3 = 21;
                break;
            }
            case 61: {
                n3 = 25;
                break;
            }
            case 62: {
                n3 = 3;
                break;
            }
            default: {
                n3 = 8;
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
        DiagnosticEventTracker.db[n4] = new String(cArray);
        return n4;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public DiagnosticEventTracker(String string) {
        super(string);
    }

    @Override
    public void g() {
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DiagnosticEventTracker.b = MultiContainerRegistry.a(-6290715216315627772L, 4537372157166295375L, MethodHandles.lookup().lookupClass()).a(220660624775079L);
                DiagnosticEventTracker.bb = new Object[5];
                DiagnosticEventTracker.db = new String[5];
                DiagnosticEventTracker.a();
                DiagnosticEventTracker.ab = new HashMap<K, V>(13);
                var0 = DiagnosticEventTracker.b ^ 29609107090787L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u00ce\u0096\nT\u00c0fSz\u00fb\u00f7\u00dd%\u00c5\u00c0\u00f1\u00a4]\u00de\u000fi\u00e0\u00dbE+\\X\u00c2=\u00beU\u00cc\f.\u00d4`\u00acp\u00ff\u0005R-p\u00b9\u00e5\u0093;JjY\u00cdB\u0000\u00e1\u001d\u0010\u001f\u0001\u0001\u00ed\u00a8\u008eg@\u00a9\u008a\u007f\u0092U\u00de/\u0017%";
                var7_6 = "\u00ce\u0096\nT\u00c0fSz\u00fb\u00f7\u00dd%\u00c5\u00c0\u00f1\u00a4]\u00de\u000fi\u00e0\u00dbE+\\X\u00c2=\u00beU\u00cc\f.\u00d4`\u00acp\u00ff\u0005R-p\u00b9\u00e5\u0093;JjY\u00cdB\u0000\u00e1\u001d\u0010\u001f\u0001\u0001\u00ed\u00a8\u008eg@\u00a9\u008a\u007f\u0092U\u00de/\u0017%".length();
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
                    var6_5 = "\u0099N\u00ac\u00bb\u00c0-\r3\u00d1\u00b6\\0fA\u0016\u0098";
                    var7_6 = "\u0099N\u00ac\u00bb\u00c0-\r3\u00d1\u00b6\\0fA\u0016\u0098".length();
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
        DiagnosticEventTracker.D = var8_3;
        DiagnosticEventTracker.E = new Integer[11];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DiagnosticEventTracker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DiagnosticEventTracker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

