/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.hr;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.data.compression.DataCompressionNegotiator;
import com.exception.system.CustomSystemException;
import com.graphics.theme.GraphicalThemeRenderer;
import com.hardware.management.HardwareYield;
import com.network.configuration.NetworkConfigurationManager1825;
import com.security.crypto.CipherContextManager1101;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.theme.UserInterfaceThemeManager;
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
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class C_
extends AbstractComputationKernel {
    private static final long R = MultiContainerRegistry.a(4680031051222459900L, 7698540772734031967L, MethodHandles.lookup().lookupClass()).a(211711271114650L);
    private final hr F;
    private final DataCompressionNegotiator n;
    private final boolean Y;
    private boolean D;
    private static final Object[] eb = new Object[5];
    private UserInterfaceThemeManager L;
    private static final long[] ab;
    private final GraphicalThemeRenderer V;
    private Color E;
    private final hr b;
    private static final String[] fb;
    private double B;
    private static final Integer[] bb;
    private double v;
    private static final Map db;

    /*
     * Enabled aggressive block sorting
     */
    static {
        fb = new String[5];
        C_.a();
        db = new HashMap(13);
        long l = R ^ 0x5B34D92E2D0CL;
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
        String string = "D\u0092\u0092\u008c\u0082RWK\u00d3\u0092ow6O|\u00ab";
        int n2 = "D\u0092\u0092\u008c\u0082RWK\u00d3\u0092ow6O|\u00ab".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        ab = lArray;
        bb = new Integer[2];
    }

    public static CompletableFuture<Void> T(CipherSessionManager cipherSessionManager, String string, String string2, String string3, Runnable runnable, double d2, @Nullable String string4, @Nullable Runnable runnable2) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        C_ c_ = new C_(string, string2, string3);
        try {
            if (d2 != -1.0) {
                c_.f(d2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw C_.a(customSystemException);
        }
        try {
            if (string4 != null) {
                c_.F.N(true);
                c_.F.z(string4);
                c_.F.A(C_.M.n);
                c_.F.P(Color.WHITE);
                c_.F.f(true);
                c_.F.G(true);
                c_.b.Q(C_.M.Y, C_.M.u);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw C_.a(customSystemException);
        }
        NetworkConfigurationManager1825 networkConfigurationManager1825 = GraphicalRenderingController.v(cipherSessionManager, c_, NetworkConfigurationManager1825.class);
        c_.Z().N(() -> C_.lambda$createStandard$0(networkConfigurationManager1825, runnable, completableFuture));
        c_.u().N(() -> C_.lambda$createStandard$1(networkConfigurationManager1825, completableFuture));
        c_.p().N(() -> C_.lambda$createStandard$2(networkConfigurationManager1825, runnable2, completableFuture));
        networkConfigurationManager1825.r(cipherSessionManager, networkConfigurationManager1825);
        return completableFuture;
    }

    @Override
    public void G() {
        double d2 = this.B;
        double d3 = 0.0;
        if (!this.Y) {
            d2 -= 20.0;
            d3 += 20.0;
        }
        try {
            this.v = d2;
            ConfigurationManager.S(this.G(), this.W(), 100.0, d2, this.l());
            if (this.D) {
                ConfigurationManager.U(this.G(), this.W(), 100.0, d2, this.E, 2.0f, 1.0f, 1.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw C_.a(customSystemException);
        }
        try {
            if (this.Y) {
                this.L.b(this.G() + (100.0 - this.L.w()) / 2.0);
                this.L.M(this.W() + 10.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw C_.a(customSystemException);
        }
        this.V.b(this.G() + 100.0 - this.V.w() - 2.0);
        this.V.M(this.W() + 2.0);
        this.n.b(this.G() + 5.0);
        this.n.Y(this.w() - 10.0);
        this.n.M(this.W() + 32.0 - d3);
        double d4 = this.n.B();
        this.b.b(this.G() + (100.0 - this.b.w()) / 2.0);
        this.b.M(this.n.W() + d4 + 10.0);
        if (this.F.f()) {
            this.F.T(36.0);
            this.F.Q(C_.M.E, C_.M.E);
            this.F.q(false);
            double d5 = this.F.w() + this.b.w() + 5.0;
            double d6 = this.G() + this.w() / 2.0 - d5 / 2.0;
            this.b.b(d6);
            this.F.b(this.b.G() + this.F.w() + 2.5);
            this.F.M(this.b.W());
        }
    }

    public void F(Color color) {
        this.E = color;
    }

    public void f(double d2) {
        this.B = d2;
    }

    private static Field g(long l, long l2) {
        int n = C_.e(l, l2);
        Object object = eb[n];
        if (object instanceof String) {
            String string = fb[n];
            int n2 = string.indexOf(8);
            Class clazz = C_.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = C_.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = C_.c(clazz3, string2, clazz2)) != null) {
                    C_.eb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = C_.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        C_.eb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = C_.f(262939688235288L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public hr p() {
        return this.F;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xB81;
        if (bb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ab[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])db.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    db.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/C_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            C_.bb[n2] = n3;
        }
        return bb[n2];
    }

    @Override
    public double e() {
        return 100.0;
    }

    public C_(String string, String string2, @Nullable String string3) {
        long l = R ^ 0x2DDE9F0E4D69L;
        this.V = new HardwareYield((String)((Object)C_.c("l", (int)C_.b("p", (int)14349, (long)(0x5B5015E7249B8901L ^ l)), (long)4219030605276286240L, (long)l)), 1.0, new Color(255, 255, 255, 0), new Color(255, 255, 255, 25), 10.0, 10.0);
        this.v = 0.0;
        this.B = 80.0;
        this.E = C_.M.k;
        this.D = true;
        this.n = new DataCompressionNegotiator(string, 0.9f, C_.M.n);
        this.b = new hr(string2, 0.7, C_.M.O, C_.M.b, 36.0, 14.0);
        this.F = new hr((String)((Object)C_.c("l", (int)C_.b("p", (int)16416, (long)(0x65C8F9F63EE3712DL ^ l)), (long)4219030605276286240L, (long)l)), 0.7, C_.M.O, C_.M.b, 36.0, 14.0);
        this.F.N(false);
        this.i(false);
        this.Q(C_.M.g.brighter());
        this.b.q(false);
        this.b.A(Color.WHITE);
        this.b.P(Color.WHITE);
        try {
            this.Y = string3 != null;
            if (this.Y) {
                this.L = new UserInterfaceThemeManager(string3, 12.0f, 12.0f, Color.white);
                this.o(this.L);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw C_.a(customSystemException);
        }
        this.o(this.b, this.V, this.n, this.F);
    }

    private static Method h(long l, long l2) {
        int n = C_.e(l, l2);
        Object object = eb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n];
                int n3 = string2.indexOf(8);
                clazz3 = C_.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = C_.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = C_.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        C_.eb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = C_.f(262939688235288L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = C_.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        C_.eb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = C_.f(262939688235288L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dd' || c == '\u00ef' || c == 'S' || c == '\u00d9') {
                field = C_.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dd' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'S' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = C_.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'q' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'l' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = eb;
        eb[0] = "W+T";
        objectArray[1] = Integer.TYPE;
        C_.fb[1] = "java/lang/Integer";
        objectArray[2] = ":dr6k\u001a1kcy\u0016\u0002\"lj0";
        objectArray[3] = "R{_N\u0018\u0000YtN\u0001y\u000eR\u007fJ[";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "s0P\n-a$8\u0006c/zIoP\u001a|zx(H\u0013;\u0001p,K\u001d:9w'\u0001\bD";
    }

    public boolean X() {
        return this.D;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = C_.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = C_.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public GraphicalThemeRenderer u() {
        return this.V;
    }

    private static void lambda$createStandard$0(CipherContextManager1101 cipherContextManager1101, Runnable runnable, CompletableFuture completableFuture) {
        GraphicalRenderingController.z(cipherContextManager1101);
        runnable.run();
        completableFuture.complete(null);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = C_.e(l, l2);
            object = eb[n];
            try {
                if (!(object instanceof String)) break block2;
                C_.eb[n] = clazz = Class.forName(fb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/C_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
    public double z() {
        return this.v;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = C_.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/C_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fb[n4] != null) {
            return n4;
        }
        Object object = eb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 51;
                break;
            }
            case 1: {
                n3 = 35;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 18;
                break;
            }
            case 4: {
                n3 = 16;
                break;
            }
            case 5: {
                n3 = 40;
                break;
            }
            case 6: {
                n3 = 37;
                break;
            }
            case 7: {
                n3 = 43;
                break;
            }
            case 8: {
                n3 = 41;
                break;
            }
            case 9: {
                n3 = 21;
                break;
            }
            case 10: {
                n3 = 46;
                break;
            }
            case 11: {
                n3 = 56;
                break;
            }
            case 12: {
                n3 = 8;
                break;
            }
            case 13: {
                n3 = 62;
                break;
            }
            case 14: {
                n3 = 5;
                break;
            }
            case 15: {
                n3 = 33;
                break;
            }
            case 16: {
                n3 = 6;
                break;
            }
            case 17: {
                n3 = 32;
                break;
            }
            case 18: {
                n3 = 9;
                break;
            }
            case 19: {
                n3 = 29;
                break;
            }
            case 20: {
                n3 = 63;
                break;
            }
            case 21: {
                n3 = 25;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 27;
                break;
            }
            case 24: {
                n3 = 36;
                break;
            }
            case 25: {
                n3 = 3;
                break;
            }
            case 26: {
                n3 = 31;
                break;
            }
            case 27: {
                n3 = 28;
                break;
            }
            case 28: {
                n3 = 42;
                break;
            }
            case 29: {
                n3 = 48;
                break;
            }
            case 30: {
                n3 = 47;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 52;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 45;
                break;
            }
            case 35: {
                n3 = 50;
                break;
            }
            case 36: {
                n3 = 53;
                break;
            }
            case 37: {
                n3 = 49;
                break;
            }
            case 38: {
                n3 = 14;
                break;
            }
            case 39: {
                n3 = 24;
                break;
            }
            case 40: {
                n3 = 30;
                break;
            }
            case 41: {
                n3 = 54;
                break;
            }
            case 42: {
                n3 = 57;
                break;
            }
            case 43: {
                n3 = 17;
                break;
            }
            case 44: {
                n3 = 7;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 0;
                break;
            }
            case 48: {
                n3 = 26;
                break;
            }
            case 49: {
                n3 = 2;
                break;
            }
            case 50: {
                n3 = 55;
                break;
            }
            case 51: {
                n3 = 61;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 11;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 59;
                break;
            }
            case 56: {
                n3 = 22;
                break;
            }
            case 57: {
                n3 = 12;
                break;
            }
            case 58: {
                n3 = 13;
                break;
            }
            case 59: {
                n3 = 44;
                break;
            }
            case 60: {
                n3 = 60;
                break;
            }
            case 61: {
                n3 = 38;
                break;
            }
            case 62: {
                n3 = 10;
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
        C_.fb[n4] = new String(cArray);
        return n4;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = C_.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = C_.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public Color H() {
        return this.E;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = C_.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void K(boolean bl) {
        this.D = bl;
    }

    public hr Z() {
        return this.b;
    }

    private static void lambda$createStandard$2(CipherContextManager1101 cipherContextManager1101, Runnable runnable, CompletableFuture completableFuture) {
        try {
            GraphicalRenderingController.z(cipherContextManager1101);
            if (runnable != null) {
                runnable.run();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw C_.a(customSystemException);
        }
        completableFuture.complete(null);
    }

    private static void lambda$createStandard$1(CipherContextManager1101 cipherContextManager1101, CompletableFuture completableFuture) {
        GraphicalRenderingController.z(cipherContextManager1101);
        completableFuture.complete(null);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static CompletableFuture<Void> P(CipherSessionManager cipherSessionManager, String string, String string2, String string3, Runnable runnable) {
        return C_.T(cipherSessionManager, string, string2, string3, runnable, -1.0, null, null);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(C_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(C_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

