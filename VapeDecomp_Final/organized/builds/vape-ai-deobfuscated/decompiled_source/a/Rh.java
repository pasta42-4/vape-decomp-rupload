/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.bm;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.collections.management.MultiContainerRegistry;
import com.config.management.ConfigurationParameterManager454;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.network.connection.NetworkConnectionManager1525;
import com.network.protocol.CommunicationProtocolManager;
import com.security.cryptography.CryptographicContextManager153;
import com.system.configuration.ConfigurationManager;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.theme.UserInterfaceThemeManager;
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
import org.jetbrains.annotations.Nullable;

public class Rh
extends AbstractComputationKernel {
    private static final Object[] fb;
    private final ColorPaletteRenderer b;
    private UserInterfaceThemeManager R;
    private static final long ab;
    private boolean V;
    private CryptographicContextManager153 n;
    private static final Map eb;
    private NetworkConnectionManager1525 L;
    @Nullable
    private ConfigurationParameterManager454 D;
    private CryptographicContextManager153 B;
    private NetworkConnectionManager1525 F;
    private static final Integer[] db;
    private NetworkConnectionManager1525 E;
    private static final String[] jb;
    private static final long[] bb;
    private bm Y;
    private final ColorPaletteRenderer v;

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Rh.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Rh.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Rh.e(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                Rh.fb[n] = clazz = Class.forName(jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(long l, long l2) {
        int n = Rh.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n];
                int n3 = string2.indexOf(8);
                clazz3 = Rh.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = Rh.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Rh.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        Rh.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Rh.f(239246605984624L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = Rh.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        Rh.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Rh.f(239246605984624L, 0L);
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

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (jb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 35;
                break;
            }
            case 1: {
                n3 = 37;
                break;
            }
            case 2: {
                n3 = 29;
                break;
            }
            case 3: {
                n3 = 62;
                break;
            }
            case 4: {
                n3 = 7;
                break;
            }
            case 5: {
                n3 = 1;
                break;
            }
            case 6: {
                n3 = 49;
                break;
            }
            case 7: {
                n3 = 41;
                break;
            }
            case 8: {
                n3 = 45;
                break;
            }
            case 9: {
                n3 = 47;
                break;
            }
            case 10: {
                n3 = 58;
                break;
            }
            case 11: {
                n3 = 10;
                break;
            }
            case 12: {
                n3 = 36;
                break;
            }
            case 13: {
                n3 = 28;
                break;
            }
            case 14: {
                n3 = 21;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 24;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 14;
                break;
            }
            case 19: {
                n3 = 20;
                break;
            }
            case 20: {
                n3 = 13;
                break;
            }
            case 21: {
                n3 = 17;
                break;
            }
            case 22: {
                n3 = 31;
                break;
            }
            case 23: {
                n3 = 26;
                break;
            }
            case 24: {
                n3 = 25;
                break;
            }
            case 25: {
                n3 = 44;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 42;
                break;
            }
            case 28: {
                n3 = 30;
                break;
            }
            case 29: {
                n3 = 57;
                break;
            }
            case 30: {
                n3 = 4;
                break;
            }
            case 31: {
                n3 = 6;
                break;
            }
            case 32: {
                n3 = 61;
                break;
            }
            case 33: {
                n3 = 19;
                break;
            }
            case 34: {
                n3 = 18;
                break;
            }
            case 35: {
                n3 = 34;
                break;
            }
            case 36: {
                n3 = 9;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 3;
                break;
            }
            case 39: {
                n3 = 8;
                break;
            }
            case 40: {
                n3 = 43;
                break;
            }
            case 41: {
                n3 = 27;
                break;
            }
            case 42: {
                n3 = 12;
                break;
            }
            case 43: {
                n3 = 22;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 52;
                break;
            }
            case 46: {
                n3 = 0;
                break;
            }
            case 47: {
                n3 = 11;
                break;
            }
            case 48: {
                n3 = 63;
                break;
            }
            case 49: {
                n3 = 40;
                break;
            }
            case 50: {
                n3 = 46;
                break;
            }
            case 51: {
                n3 = 51;
                break;
            }
            case 52: {
                n3 = 15;
                break;
            }
            case 53: {
                n3 = 16;
                break;
            }
            case 54: {
                n3 = 53;
                break;
            }
            case 55: {
                n3 = 60;
                break;
            }
            case 56: {
                n3 = 54;
                break;
            }
            case 57: {
                n3 = 59;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 56;
                break;
            }
            case 60: {
                n3 = 32;
                break;
            }
            case 61: {
                n3 = 2;
                break;
            }
            case 62: {
                n3 = 38;
                break;
            }
            default: {
                n3 = 23;
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
        Rh.jb[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void G() {
        this.v.C(this.s());
        this.b.C(this.s());
        ConfigurationManager.C(this.G(), this.W(), this.w(), this.b(), Rh.M.g, 2.0f);
        ConfigurationManager.C(this.G(), this.W(), this.w(), this.b(), this.v.k(), 2.0f);
        ConfigurationManager.U(this.G(), this.W(), this.w(), this.b(), this.b.k(), 2.0f, 1.0f, 1.0f);
        if (this.D != null) {
            this.Y.b(this.G() + 8.0);
            this.Y.M(this.W() + 8.0);
            this.n.b(this.G() + 8.0);
            this.n.M(this.Y.W() - 1.0 + this.Y.z() + 4.0);
            double d2 = 10.0;
            double d3 = this.G() + 8.0;
            double d4 = this.W() + this.b() - d2 - 8.0;
            ConfigurationManager.C(d3, d4, this.R.w() + this.B.w() + 1.0, d2, Rh.M.g.brighter(), (float)(d2 / 2.0) - 0.5f);
            if (this.V) {
                double d5 = this.G() + 40.0;
                ConfigurationManager.C(d5, d4, 30.0, d2, new ColorCompositionEngine(Rh.M.A).I(80), (float)(d2 / 2.0) - 0.5f);
                this.t(0.7).Q(this.D.T(), (int)d5 + 15, (int)d4 + 3, Rh.M.A);
            }
            this.R.b(d3 + 5.0);
            this.R.M(d4 + 2.0);
            this.R.t(Rh.M.Z);
            this.B.b(this.R.G() + this.R.w() - 1.5);
            this.B.M(this.R.W() - 1.5);
            this.B.T(12.0 + this.B.D());
        } else {
            double d6 = this.G();
            this.getClass();
            this.L.b(d6 + 5.0);
            double d7 = this.W();
            this.getClass();
            this.L.M(d7 + 5.0);
            double d8 = this.G();
            this.getClass();
            this.F.b(d8 + 5.0);
            this.F.M(this.L.W() + this.L.b() + 2.0);
            double d9 = this.G();
            this.getClass();
            this.E.b(d9 + 5.0 * 1.5);
            this.E.M(this.W() + this.b() - this.E.b() - 8.0);
        }
    }

    public Rh(@Nullable ConfigurationParameterManager454 configurationParameterManager454) {
        long l = ab ^ 0x5A8F43668FA2L;
        this.getClass();
        this.b = new ColorPaletteRenderer(0.15, Rh.M.g, Rh.M.S);
        this.getClass();
        this.v = new ColorPaletteRenderer(0.15, Rh.M.E, Rh.M.y);
        this.T(78.0);
        this.w(72.0);
        if (configurationParameterManager454 != null) {
            Object object;
            CryptographicContextManager153 cryptographicContextManager153;
            CryptographicContextManager153 cryptographicContextManager1532;
            try {
                CryptographicContextManager153 cryptographicContextManager1533;
                this.D = configurationParameterManager454;
                this.Y = new bm(configurationParameterManager454.z(), 0.85);
                this.Y.q(true);
                this.Y.J(true);
                this.Y.T(50.0);
                this.Y.n(50.0);
                this.Y.w(10.0);
                this.Y.B(Rh.M.c);
                this.Y.q(true);
                Rh rh = this;
                cryptographicContextManager1532 = cryptographicContextManager1533;
                cryptographicContextManager153 = cryptographicContextManager1533;
                object = configurationParameterManager454.d() != null ? configurationParameterManager454.d().X() : Rh.c("\u00e6", (int)Rh.b("d", (int)9393, (long)(0x30B9A43D84A53CF3L ^ l)), (long)-4544905540215825242L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw Rh.a(customSystemException);
            }
            cryptographicContextManager1532((String)object, 0.75);
            rh.n = cryptographicContextManager153;
            this.n.S(0.0f);
            this.n.j(0.0f);
            this.B = new CryptographicContextManager153(Long.toString(this.D.B()), 0.7);
            this.B.q(true);
            this.R = new UserInterfaceThemeManager((String)((Object)Rh.c("\u00e6", (int)Rh.b("d", (int)23179, (long)(0x3F324D93FCAC2C8L ^ l)), (long)-4544905540215825242L, (long)l)), 6.0f, 5.0f);
            this.n(true);
            if (configurationParameterManager454.T() != null) {
                try {
                    if (configurationParameterManager454.T().equalsIgnoreCase(GraphicalRenderingController.D(CommunicationProtocolManager.class).r())) {
                        this.V = true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw Rh.a(customSystemException);
                }
            }
            this.o(this.Y, this.n, this.R, this.B);
        } else {
            AbstractComputationKernel[] abstractComputationKernelArray = new AbstractComputationKernel[1];
            this.L = new NetworkConnectionManager1525(60.0, 10.0);
            abstractComputationKernelArray[0] = this.L;
            this.o(abstractComputationKernelArray);
            AbstractComputationKernel[] abstractComputationKernelArray2 = new AbstractComputationKernel[1];
            this.F = new NetworkConnectionManager1525(30.0, 10.0);
            abstractComputationKernelArray2[0] = this.F;
            this.o(abstractComputationKernelArray2);
            AbstractComputationKernel[] abstractComputationKernelArray3 = new AbstractComputationKernel[1];
            this.E = new NetworkConnectionManager1525(25.0, 10.0);
            abstractComputationKernelArray3[0] = this.E;
            this.o(abstractComputationKernelArray3);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Rh.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = Rh.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = MultiContainerRegistry.a(6962350520619690347L, -1551361388972619011L, MethodHandles.lookup().lookupClass()).a(14639322990458L);
        fb = new Object[5];
        jb = new String[5];
        Rh.a();
        eb = new HashMap(13);
        long l = ab ^ 0x413079E6EA99L;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "\"P}\u00d7t\u0003I`XE\u008ae\u008e[\u00c4\u009d";
        int n2 = "\"P}\u00d7t\u0003I`XE\u008ae\u008e[\u00c4\u009d".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        bb = lArray;
        db = new Integer[2];
    }

    private static void a() {
        Object[] objectArray = fb;
        fb[0] = "JP2";
        objectArray[1] = Integer.TYPE;
        Rh.jb[1] = "java/lang/Integer";
        objectArray[2] = "d\\H{c\u0006oSY4\u001e\u001e|TP}";
        objectArray[3] = "\u0017+$D?W\u001c$5\u000b^Y\u0017/1Q";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "GNZ\u000bqF\u0013[\u001ajx^(\u000bHUz@J][[w%\u0011LB\u0006\"\u001bDR\u001b\u0001\u0013";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Rh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e7' || c == '\u00c7' || c == '\u00d2' || c == 'u') {
                field = Rh.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Rh.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '$' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Nullable
    public ConfigurationParameterManager454 z() {
        return this.D;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x58AE;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Rh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Rh.db[n2] = n3;
        }
        return db[n2];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = Rh.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Rh.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l, long l2) {
        int n = Rh.e(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = jb[n];
            int n2 = string.indexOf(8);
            Class clazz = Rh.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Rh.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Rh.c(clazz3, string2, clazz2)) != null) {
                    Rh.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Rh.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Rh.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Rh.f(239246605984624L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Rh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Rh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Rh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

