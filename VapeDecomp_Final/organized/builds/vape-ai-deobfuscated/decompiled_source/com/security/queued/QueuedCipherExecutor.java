/*
 * Decompiled with CFR 0.152.
 */
package com.security.queued;

import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.distributed.topology.DistributedResourceTopologyManager;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class QueuedCipherExecutor
extends AbstractComputationKernel {
    private DistributedResourceTopologyManager Y;
    private static AbstractComputationKernel[] L;
    private double E;
    private boolean v = false;
    private static final Map R;
    private static final long b;
    private static final String[] ab;
    private static final Integer[] B;
    private final Queue<Long> F;
    private final Queue<Long> D = new LinkedList<Long>();
    private static final Object[] V;
    private static final long[] n;

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ab[n4] != null) {
            return n4;
        }
        Object object = V[n4];
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
                n3 = 50;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 32;
                break;
            }
            case 5: {
                n3 = 46;
                break;
            }
            case 6: {
                n3 = 30;
                break;
            }
            case 7: {
                n3 = 7;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 33;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 47;
                break;
            }
            case 12: {
                n3 = 58;
                break;
            }
            case 13: {
                n3 = 27;
                break;
            }
            case 14: {
                n3 = 14;
                break;
            }
            case 15: {
                n3 = 48;
                break;
            }
            case 16: {
                n3 = 44;
                break;
            }
            case 17: {
                n3 = 8;
                break;
            }
            case 18: {
                n3 = 63;
                break;
            }
            case 19: {
                n3 = 16;
                break;
            }
            case 20: {
                n3 = 52;
                break;
            }
            case 21: {
                n3 = 38;
                break;
            }
            case 22: {
                n3 = 21;
                break;
            }
            case 23: {
                n3 = 31;
                break;
            }
            case 24: {
                n3 = 41;
                break;
            }
            case 25: {
                n3 = 15;
                break;
            }
            case 26: {
                n3 = 10;
                break;
            }
            case 27: {
                n3 = 29;
                break;
            }
            case 28: {
                n3 = 40;
                break;
            }
            case 29: {
                n3 = 37;
                break;
            }
            case 30: {
                n3 = 62;
                break;
            }
            case 31: {
                n3 = 11;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 20;
                break;
            }
            case 34: {
                n3 = 23;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 54;
                break;
            }
            case 37: {
                n3 = 25;
                break;
            }
            case 38: {
                n3 = 39;
                break;
            }
            case 39: {
                n3 = 18;
                break;
            }
            case 40: {
                n3 = 5;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 34;
                break;
            }
            case 43: {
                n3 = 12;
                break;
            }
            case 44: {
                n3 = 0;
                break;
            }
            case 45: {
                n3 = 35;
                break;
            }
            case 46: {
                n3 = 59;
                break;
            }
            case 47: {
                n3 = 60;
                break;
            }
            case 48: {
                n3 = 61;
                break;
            }
            case 49: {
                n3 = 1;
                break;
            }
            case 50: {
                n3 = 42;
                break;
            }
            case 51: {
                n3 = 51;
                break;
            }
            case 52: {
                n3 = 9;
                break;
            }
            case 53: {
                n3 = 57;
                break;
            }
            case 54: {
                n3 = 26;
                break;
            }
            case 55: {
                n3 = 28;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 4;
                break;
            }
            case 58: {
                n3 = 43;
                break;
            }
            case 59: {
                n3 = 56;
                break;
            }
            case 60: {
                n3 = 13;
                break;
            }
            case 61: {
                n3 = 17;
                break;
            }
            case 62: {
                n3 = 19;
                break;
            }
            default: {
                n3 = 55;
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
        QueuedCipherExecutor.ab[n4] = new String(cArray);
        return n4;
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

    public int g(int n) {
        try {
            if (n == 0) {
                return this.g(this.D);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw QueuedCipherExecutor.a(customSystemException);
        }
        try {
            if (n == 1) {
                return this.g(this.F);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw QueuedCipherExecutor.a(customSystemException);
        }
        return 0;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    public double s() {
        return this.L(0.65).D(this.g(this.D) + "");
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void a() {
        block3: {
            String string;
            CryptographicParameterGenerator cryptographicParameterGenerator;
            double d2;
            double d3;
            long l;
            block2: {
                l = b ^ 0x1A940C28CE71L;
                d3 = this.G();
                d2 = this.W();
                cryptographicParameterGenerator = TemporalMetadataResolver.h.W().S(0.65);
                string = this.g(this.D) + "";
                try {
                    if (!this.v) break block2;
                    cryptographicParameterGenerator.Y(string, d3 - cryptographicParameterGenerator.D(string) / 2.0, d2 - cryptographicParameterGenerator.B(string) / 2.0, QueuedCipherExecutor.M.c);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw QueuedCipherExecutor.a(customSystemException);
                }
            }
            String string2 = this.g(this.F) + "";
            cryptographicParameterGenerator.Y((String)((Object)QueuedCipherExecutor.c("\u00c1", (int)QueuedCipherExecutor.b("y", (int)3285, (long)(0x244123E4AB65F6D1L ^ l)), (long)-7871916922622687186L, (long)l)), d3 - cryptographicParameterGenerator.D((String)((Object)QueuedCipherExecutor.c("\u00c1", (int)QueuedCipherExecutor.b("y", (int)26871, (long)(0x688C4C0B7AE392F6L ^ l)), (long)-7871916922622687186L, (long)l))) / 2.0, d2 + cryptographicParameterGenerator.B((String)((Object)QueuedCipherExecutor.c("\u00c1", (int)QueuedCipherExecutor.b("y", (int)3157, (long)(0x784AA2509AF37655L ^ l)), (long)-7871916922622687186L, (long)l))) / 2.0, QueuedCipherExecutor.M.c);
            cryptographicParameterGenerator.Y(string, d3 - cryptographicParameterGenerator.D((String)((Object)QueuedCipherExecutor.c("\u00c1", (int)QueuedCipherExecutor.b("y", (int)19079, (long)(0x27CC4B3FADD1B080L ^ l)), (long)-7871916922622687186L, (long)l))) / 2.0 - cryptographicParameterGenerator.D(string) - 2.0, d2 + cryptographicParameterGenerator.B(string) / 2.0 + (cryptographicParameterGenerator.B((String)((Object)QueuedCipherExecutor.c("\u00c1", (int)QueuedCipherExecutor.b("y", (int)3404, (long)(0xA232665815EF74EL ^ l)), (long)-7871916922622687186L, (long)l))) - cryptographicParameterGenerator.B(string)) / 2.0, QueuedCipherExecutor.M.c);
            cryptographicParameterGenerator.Y(string2, d3 + cryptographicParameterGenerator.D((String)((Object)QueuedCipherExecutor.c("\u00c1", (int)QueuedCipherExecutor.b("y", (int)24159, (long)(0x587A791CAC102459L ^ l)), (long)-7871916922622687186L, (long)l))) / 2.0 + 2.0, d2 + cryptographicParameterGenerator.B(string2) / 2.0 + (cryptographicParameterGenerator.B((String)((Object)QueuedCipherExecutor.c("\u00c1", (int)QueuedCipherExecutor.b("y", (int)14262, (long)(0x78DF94C74901CDB3L ^ l)), (long)-7871916922622687186L, (long)l))) - cryptographicParameterGenerator.B(string2)) / 2.0, QueuedCipherExecutor.M.c);
        }
    }

    public static AbstractComputationKernel[] j() {
        return L;
    }

    public static void v(AbstractComputationKernel[] abstractComputationKernelArray) {
        L = abstractComputationKernelArray;
    }

    @Override
    public void g() {
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = QueuedCipherExecutor.e(l, l2);
            object = V[n];
            try {
                if (!(object instanceof String)) break block2;
                QueuedCipherExecutor.V[n] = clazz = Class.forName(ab[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public QueuedCipherExecutor() {
        this.F = new LinkedList<Long>();
    }

    @Override
    public void d() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void T(int n) {
        try {
            switch (n) {
                case 0: {
                    this.D.add(System.currentTimeMillis() + 1000L);
                    return;
                }
                case 1: {
                    this.F.add(System.currentTimeMillis() + 1000L);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (CustomSystemException customSystemException) {
            throw QueuedCipherExecutor.a(customSystemException);
        }
    }

    public QueuedCipherExecutor(DistributedResourceTopologyManager distributedResourceTopologyManager) {
        this.F = new LinkedList<Long>();
        this.Y = distributedResourceTopologyManager;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/R_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void G() {
        block3: {
            block2: {
                try {
                    if (this.Y == null) break block2;
                    this.L();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw QueuedCipherExecutor.a(customSystemException);
                }
            }
            this.a();
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x68C3;
        if (B[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = QueuedCipherExecutor.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])R.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    R.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/R_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            QueuedCipherExecutor.B[n2] = n3;
        }
        return B[n2];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'd' || c == '\u00d2' || c == 'q' || c == 's') {
                field = QueuedCipherExecutor.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = QueuedCipherExecutor.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'M' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = QueuedCipherExecutor.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = QueuedCipherExecutor.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void U() {
        this.G();
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = QueuedCipherExecutor.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = QueuedCipherExecutor.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = QueuedCipherExecutor.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void i() {
        Object[] objectArray = V;
        V[0] = "\u001cL2";
        objectArray[1] = Integer.TYPE;
        QueuedCipherExecutor.ab[1] = "java/lang/Integer";
        objectArray[2] = "R\u0012\r\"\u000foY\u001d\u001cmrwJ\u001a\u0015$";
        objectArray[3] = "q\"YK<\u001fz-H\u0004]\u0011q&L^";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Jw\u0010n<%Ql\fVk2)lOlnp\u0019.M:\u0000pTw\u000b6y0\u0012x\u0003V";
    }

    public void o(boolean bl) {
        this.v = bl;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/R_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = QueuedCipherExecutor.e(l, l2);
        Object object = V[n];
        if (object instanceof String) {
            String string = ab[n];
            int n2 = string.indexOf(8);
            Class clazz = QueuedCipherExecutor.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = QueuedCipherExecutor.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = QueuedCipherExecutor.c(clazz3, string2, clazz2)) != null) {
                    QueuedCipherExecutor.V[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = QueuedCipherExecutor.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        QueuedCipherExecutor.V[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = QueuedCipherExecutor.f(279927393379498L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void L() {
        block8: {
            long l = b ^ 0x258F6F044B0CL;
            double d2 = this.G();
            double d3 = this.W();
            CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().T(1.0, false);
            String string = String.valueOf(this.g(this.D));
            String string2 = String.valueOf(this.g(this.F));
            if (this.v) {
                double d4;
                double d5;
                CallSite callSite;
                block7: {
                    callSite = QueuedCipherExecutor.c("\u00c1", (int)QueuedCipherExecutor.b("y", (int)5180, (long)(0x73F59E456659EB42L ^ l)), (long)1710358916872588627L, (long)l);
                    d5 = cryptographicParameterGenerator.D(string);
                    d4 = d2 + 11.0;
                    double d6 = 10.0 + cryptographicParameterGenerator.D((String)((Object)callSite)) + 1.5 + 8.0;
                    try {
                        if (!this.Y.K()) break block7;
                        ConfigurationManager.S(this.G(), this.W(), d6, 12.0, this.Y.s(new Color(0, 0, 0, 100)));
                        cryptographicParameterGenerator.R(string, d4 - d5, d3 + 2.0, this.Y.s(QueuedCipherExecutor.M.c));
                        cryptographicParameterGenerator.R((String)((Object)callSite), d4 + 1.5, d3 + 2.0, this.Y.s(QueuedCipherExecutor.M.c));
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw QueuedCipherExecutor.a(customSystemException);
                    }
                }
                cryptographicParameterGenerator.Y(string, d4 - d5, d3 + 2.0, this.Y.s(QueuedCipherExecutor.M.c));
                cryptographicParameterGenerator.Y((String)((Object)callSite), d4 + 1.5, d3 + 2.0, this.Y.s(QueuedCipherExecutor.M.c));
            } else {
                try {
                    if (!this.Y.R()) {
                        ConfigurationManager.c(this.G(), this.W() + 2.0, this.w(), 12.0, this.Y.s(new Color(20, 20, 20, 180)), false, 1.0f, 1.0f, 3.0f, new Color(0, 0, 0, 152));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw QueuedCipherExecutor.a(customSystemException);
                }
                ConfigurationManager.S(d2 + this.w() / 2.0, d3 + 4.0, 1.0, 9.0, this.Y.s(QueuedCipherExecutor.M.c));
                cryptographicParameterGenerator.R(string, d2 + 5.0, d3 + 3.0, this.Y.s(QueuedCipherExecutor.M.c));
                cryptographicParameterGenerator.R(string2, d2 + this.w() - cryptographicParameterGenerator.D(string2) - 5.0, d3 + 3.0, this.Y.s(QueuedCipherExecutor.M.c));
            }
        }
    }

    public int g(Queue<Long> queue) {
        long l = System.currentTimeMillis();
        try {
            while (true) {
                try {
                    if (queue.isEmpty() || queue.peek() >= l) break;
                }
                catch (CustomSystemException customSystemException) {
                    throw QueuedCipherExecutor.a(customSystemException);
                }
                queue.remove();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw QueuedCipherExecutor.a(customSystemException);
        }
        return queue.size();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                QueuedCipherExecutor.b = MultiContainerRegistry.a(5414603959917410009L, -2841737118260798645L, MethodHandles.lookup().lookupClass()).a(52755554415054L);
                QueuedCipherExecutor.V = new Object[5];
                QueuedCipherExecutor.ab = new String[5];
                QueuedCipherExecutor.i();
                QueuedCipherExecutor.R = new HashMap<K, V>(13);
                QueuedCipherExecutor.v(new AbstractComputationKernel[2]);
                var0 = QueuedCipherExecutor.b ^ 17513028645111L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "7\u00fd\u00a8}Y\u00fdJ\u00b7eI\u00b4^tM\u008e\u0094\u00db\u0017V\u00c2\tY\u0010'\u0003I\b\u00fa\u00ec-\u00a2\u00da~@*\u0096\\.5p1\u0086\u008e%\u00dc.\u001c\u001f";
                var7_6 = "7\u00fd\u00a8}Y\u00fdJ\u00b7eI\u00b4^tM\u008e\u0094\u00db\u0017V\u00c2\tY\u0010'\u0003I\b\u00fa\u00ec-\u00a2\u00da~@*\u0096\\.5p1\u0086\u008e%\u00dc.\u001c\u001f".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "!9n\u00d2]\u00f0P\u00ffq(91\u00ee`5\u00bc";
                    var7_6 = "!9n\u00d2]\u00f0P\u00ffq(91\u00ee`5\u00bc".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        QueuedCipherExecutor.n = var8_3;
        QueuedCipherExecutor.B = new Integer[8];
    }

    @Override
    public double z() {
        return 0.0;
    }

    public double n() {
        return this.L(0.65).B(this.g(this.D) + "");
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = QueuedCipherExecutor.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public double e() {
        return 0.0;
    }

    private static Method h(long l, long l2) {
        int n = QueuedCipherExecutor.e(l, l2);
        Object object = V[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = ab[n];
                int n3 = string2.indexOf(8);
                clazz3 = QueuedCipherExecutor.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = QueuedCipherExecutor.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = QueuedCipherExecutor.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        QueuedCipherExecutor.V[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = QueuedCipherExecutor.f(279927393379498L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = QueuedCipherExecutor.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        QueuedCipherExecutor.V[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = QueuedCipherExecutor.f(279927393379498L, 0L);
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(QueuedCipherExecutor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(QueuedCipherExecutor.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

