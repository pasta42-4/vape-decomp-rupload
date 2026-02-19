/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.app.core.interfaces.OperationExecutionInterface;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.hardware.management.HardwareYield;
import com.network.protocol.CommunicationProtocolInterface;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.crypto.CryptographicSecurityManager396;
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

public class NetworkEncryptionManager
extends AbstractComputationKernel {
    private String Y;
    private CryptographicSecurityManager396 v;
    private int D;
    private static final String[] nb;
    private static final Integer[] eb;
    private CommunicationProtocolInterface E;
    private int b;
    private HardwareYield V;
    private Color F;
    private static final long bb;
    private static final Map fb;
    private String n;
    private static int R;
    private float L;
    private static final long[] db;
    private static final Object[] mb;
    private boolean B;

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void A(Color color) {
        this.F = color;
    }

    public NetworkEncryptionManager R(OperationExecutionInterface operationExecutionInterface) {
        this.V.N(operationExecutionInterface);
        return this;
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

    public void f(String string) {
        this.Y = string;
        this.v.d(string);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void v(int n) {
        R = n;
    }

    public static int T() {
        return R;
    }

    public HardwareYield r() {
        return this.V;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'T' || c == '\u00fa' || c == '\u00c5' || c == '\u00d5') {
                field = NetworkEncryptionManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'T' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkEncryptionManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        bb = MultiContainerRegistry.a(6412839142715705820L, 5713174114440183999L, MethodHandles.lookup().lookupClass()).a(700805270682L);
        mb = new Object[5];
        nb = new String[5];
        NetworkEncryptionManager.a();
        fb = new HashMap(13);
        long l = bb ^ 0x27FF592B23C7L;
        NetworkEncryptionManager.v(55);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0005\u0090\u00ad\u00f1\u0094\u00cf\u00f9V\u009f\r\u00cdM\u00faa\u00b4>\u009f\u00d1\u008c-\u0099 |w";
        int n2 = "\u0005\u0090\u00ad\u00f1\u0094\u00cf\u00f9V\u009f\r\u00cdM\u00faa\u00b4>\u009f\u00d1\u008c-\u0099 |w".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        db = lArray;
        eb = new Integer[3];
    }

    @Override
    public double e() {
        return 110.0;
    }

    private static Method h(long l, long l2) {
        int n = NetworkEncryptionManager.e(l, l2);
        Object object = mb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = nb[n];
                int n3 = string2.indexOf(8);
                clazz3 = NetworkEncryptionManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkEncryptionManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkEncryptionManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkEncryptionManager.mb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkEncryptionManager.f(255830796810775L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkEncryptionManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkEncryptionManager.mb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkEncryptionManager.f(255830796810775L, 0L);
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

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkEncryptionManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkEncryptionManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkEncryptionManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkEncryptionManager.e(l, l2);
            object = mb[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkEncryptionManager.mb[n] = clazz = Class.forName(nb[n]);
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
        Color color;
        double d2;
        block20: {
            block21: {
                block18: {
                    block19: {
                        Color color2;
                        block17: {
                            block15: {
                                block16: {
                                    CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.9);
                                    d2 = cryptographicParameterGenerator.B(this.w());
                                    try {
                                        try {
                                            if (!this.O()) break block15;
                                            if (!this.s()) break block16;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw NetworkEncryptionManager.b(customSystemException);
                                        }
                                        color2 = NetworkEncryptionManager.M.c;
                                        break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw NetworkEncryptionManager.b(customSystemException);
                                    }
                                }
                                color2 = NetworkEncryptionManager.M.n;
                                break block17;
                            }
                            try {
                                color2 = this.s() ? NetworkEncryptionManager.M.n : NetworkEncryptionManager.M.w;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkEncryptionManager.b(customSystemException);
                            }
                        }
                        color = color2;
                        try {
                            ConfigurationManager.S(this.G() + this.D(), this.W() + 1.0, this.w() - this.D() * 2.0, this.b() - 2.0, NetworkEncryptionManager.M.g);
                            if (this.s()) {
                                ConfigurationManager.S(this.G() + this.D() + 0.5, this.W() + 1.5, this.w() - this.D() * 2.0 - 1.0, this.b() - 3.0, NetworkEncryptionManager.M.W);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkEncryptionManager.b(customSystemException);
                        }
                        try {
                            try {
                                if (!this.O()) break block18;
                                if (this.n == null) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw NetworkEncryptionManager.b(customSystemException);
                            }
                            ConfigurationManager.x(this.n, this.G() + this.D() + 5.0 + (double)(this.D / 2), this.W() + this.b() / 2.0 - (double)(this.D / 2) + (double)(this.D / 2), this.D, this.D, this.F);
                            break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NetworkEncryptionManager.b(customSystemException);
                        }
                    }
                    ConfigurationManager.T((double)((float)(this.G() + this.D() + 5.0)), (double)((float)(this.W() + this.b() / 2.0 - (double)(this.D / 2))), (double)this.D, 0.5, this.F);
                    break block20;
                }
                try {
                    if (this.n == null) break block21;
                    ConfigurationManager.x(this.n, this.G() + this.D() + 5.0 + (double)(this.D / 2), this.W() + this.b() / 2.0 - (double)(this.D / 2) + (double)(this.D / 2), this.D, this.D, NetworkEncryptionManager.M.Z);
                    break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkEncryptionManager.b(customSystemException);
                }
            }
            ConfigurationManager.r((float)(this.G() + this.D() + 5.0), (float)(this.W() + this.b() / 2.0 - (double)(this.D / 2)), this.D, 1.0f, 0.5f, NetworkEncryptionManager.M.Z);
        }
        this.v.S(color);
        this.v.a(this.w() - 30.0);
        this.v.b(this.G() + this.D() + 15.0);
        this.v.M(this.W() + this.b() / 2.0 - d2 / 2.0);
        this.V.b(this.G() + this.w() - this.D() - 5.0 - 8.0);
        this.V.M(this.W());
        this.V.w(this.b());
    }

    public NetworkEncryptionManager(Color color, String string, String string2) {
        this(color, string, -1);
        this.n = string2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = NetworkEncryptionManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkEncryptionManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = mb;
        mb[0] = "N3(";
        objectArray[1] = Integer.TYPE;
        NetworkEncryptionManager.nb[1] = "java/lang/Integer";
        objectArray[2] = "\u0017LH\u0002]Q\u001cCYM I\u000fDP\u0004";
        objectArray[3] = "\u0005L.\u000b`\u001d\u000eC?D\u0001\u0013\u0005H;\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "1TOH9R0AR&l\u0011T\u001c\b[a\u00050OS\u0017yjmAJAi\u00011W_C\u0007";
    }

    public NetworkEncryptionManager(Color color, String string, int n) {
        long l = bb ^ 0x11911433A880L;
        this.D = (int)NetworkEncryptionManager.b("u", (int)28013, (long)(0x415C6E903FE7C41AL ^ l));
        this.B = true;
        this.V = new HardwareYield((String)((Object)NetworkEncryptionManager.d("h", (int)NetworkEncryptionManager.b("u", (int)22486, (long)(0x3CFD89115B4DFEA2L ^ l)), (long)6316881463939795872L, (long)l)));
        this.L = 5.0f;
        this.F = color;
        this.Y = string;
        this.b = n;
        this.v = new CryptographicSecurityManager396(this.w(), (String)((Object)NetworkEncryptionManager.d("h", (int)NetworkEncryptionManager.b("u", (int)20536, (long)(0x20BD05D877BBF94DL ^ l)), (long)6316881463939795872L, (long)l)), this.w() - 30.0, 0.9, NetworkEncryptionManager.M.n, false);
        this.v.F(false);
        this.o(this.v, this.V);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public NetworkEncryptionManager d(CommunicationProtocolInterface communicationProtocolInterface) {
        this.E = communicationProtocolInterface;
        return this;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7EDE;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = db[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/b7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkEncryptionManager.eb[n2] = n3;
        }
        return eb[n2];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        boolean bl;
        try {
            NetworkEncryptionManager networkEncryptionManager = this;
            bl = !this.B;
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkEncryptionManager.b(customSystemException);
        }
        try {
            networkEncryptionManager.B = bl;
            if (this.E != null) {
                this.E.f();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkEncryptionManager.b(customSystemException);
        }
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (nb[n4] != null) {
            return n4;
        }
        Object object = mb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 41;
                break;
            }
            case 1: {
                n3 = 39;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 61;
                break;
            }
            case 4: {
                n3 = 62;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 6: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 44;
                break;
            }
            case 8: {
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 0;
                break;
            }
            case 11: {
                n3 = 33;
                break;
            }
            case 12: {
                n3 = 51;
                break;
            }
            case 13: {
                n3 = 59;
                break;
            }
            case 14: {
                n3 = 46;
                break;
            }
            case 15: {
                n3 = 35;
                break;
            }
            case 16: {
                n3 = 13;
                break;
            }
            case 17: {
                n3 = 30;
                break;
            }
            case 18: {
                n3 = 48;
                break;
            }
            case 19: {
                n3 = 24;
                break;
            }
            case 20: {
                n3 = 9;
                break;
            }
            case 21: {
                n3 = 55;
                break;
            }
            case 22: {
                n3 = 6;
                break;
            }
            case 23: {
                n3 = 49;
                break;
            }
            case 24: {
                n3 = 10;
                break;
            }
            case 25: {
                n3 = 40;
                break;
            }
            case 26: {
                n3 = 17;
                break;
            }
            case 27: {
                n3 = 22;
                break;
            }
            case 28: {
                n3 = 31;
                break;
            }
            case 29: {
                n3 = 18;
                break;
            }
            case 30: {
                n3 = 56;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 27;
                break;
            }
            case 33: {
                n3 = 50;
                break;
            }
            case 34: {
                n3 = 32;
                break;
            }
            case 35: {
                n3 = 2;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 21;
                break;
            }
            case 38: {
                n3 = 53;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 60;
                break;
            }
            case 41: {
                n3 = 26;
                break;
            }
            case 42: {
                n3 = 12;
                break;
            }
            case 43: {
                n3 = 25;
                break;
            }
            case 44: {
                n3 = 1;
                break;
            }
            case 45: {
                n3 = 4;
                break;
            }
            case 46: {
                n3 = 45;
                break;
            }
            case 47: {
                n3 = 28;
                break;
            }
            case 48: {
                n3 = 5;
                break;
            }
            case 49: {
                n3 = 23;
                break;
            }
            case 50: {
                n3 = 58;
                break;
            }
            case 51: {
                n3 = 37;
                break;
            }
            case 52: {
                n3 = 54;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 11;
                break;
            }
            case 55: {
                n3 = 8;
                break;
            }
            case 56: {
                n3 = 34;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 38;
                break;
            }
            case 59: {
                n3 = 20;
                break;
            }
            case 60: {
                n3 = 19;
                break;
            }
            case 61: {
                n3 = 57;
                break;
            }
            case 62: {
                n3 = 52;
                break;
            }
            default: {
                n3 = 43;
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
        NetworkEncryptionManager.nb[n4] = new String(cArray);
        return n4;
    }

    public boolean Y() {
        return this.s();
    }

    public void m(String string) {
        this.n = string;
    }

    public static int q() {
        int n = NetworkEncryptionManager.T();
        try {
            if (n == 0) {
                return 38;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkEncryptionManager.b(customSystemException);
        }
        return 0;
    }

    public void Z(float f) {
        this.L = f;
    }

    public NetworkEncryptionManager(Color color, String string) {
        this(color, string, -1);
    }

    private double D() {
        return this.L;
    }

    public boolean O() {
        boolean bl;
        try {
            bl = this.E != null ? this.E.t() : this.B;
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkEncryptionManager.b(customSystemException);
        }
        return bl;
    }

    public String w() {
        return this.Y;
    }

    @Override
    public double z() {
        return 17.5;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkEncryptionManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field g(long l, long l2) {
        int n = NetworkEncryptionManager.e(l, l2);
        Object object = mb[n];
        if (object instanceof String) {
            String string = nb[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkEncryptionManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkEncryptionManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkEncryptionManager.c(clazz3, string2, clazz2)) != null) {
                    NetworkEncryptionManager.mb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkEncryptionManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkEncryptionManager.mb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkEncryptionManager.f(255830796810775L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void m(boolean bl) {
        this.B = bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkEncryptionManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(NetworkEncryptionManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

