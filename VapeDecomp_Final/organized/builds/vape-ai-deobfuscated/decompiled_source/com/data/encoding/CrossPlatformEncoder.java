/*
 * Decompiled with CFR 0.152.
 */
package com.data.encoding;

import a.Cc;
import a.fS;
import a.hj;
import com.app.security.auth.AuthenticationMediator2331;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.governance.compliance.ComplianceRuleEngine;
import com.graphics.theme.GraphicalThemeRenderer;
import com.hardware.management.HardwareYield;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.protocol.NetworkProtocolEncoder220;
import com.network.protocol.NetworkProtocolInterceptor;
import com.network.security.NetworkSecurityTransformer;
import com.security.encoding.SecureMessageEncoder;
import com.system.configuration.ConfigurationManager;
import com.system.orchestration.SystemOrchestrationManager;
import com.ui.events.UserInteractionEventDispatcher;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CrossPlatformEncoder
extends SecureMessageEncoder {
    private final GraphicalThemeRenderer v;
    private static final long n = MultiContainerRegistry.a(2380957223659391722L, -8069371213524477685L, MethodHandles.lookup().lookupClass()).a(244561433783244L);
    private static final String[] bb;
    private static final Object[] ab;
    private static final Integer[] R;
    private final Cc D;
    private final GraphicalThemeRenderer Y;
    private static final long[] E;
    private final HardwareYield F;
    private final NetworkSecurityTransformer B;
    private static final Map V;

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CrossPlatformEncoder.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CrossPlatformEncoder.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public Cc s() {
        return this.D;
    }

    public void m() {
        List<AbstractComputationKernel> list = GraphicalRenderingController.D(NetworkSecurityTransformer.class).A();
        for (AbstractComputationKernel abstractComputationKernel : list) {
            if (!(abstractComputationKernel instanceof SystemOrchestrationManager)) continue;
            SystemOrchestrationManager systemOrchestrationManager = (SystemOrchestrationManager)abstractComputationKernel;
            systemOrchestrationManager.M();
        }
    }

    private void lambda$new$1() {
        this.P();
    }

    @Override
    public void U() {
    }

    @Override
    public double z() {
        return 16.0;
    }

    public GraphicalThemeRenderer f() {
        return this.Y;
    }

    private static Field g(long l, long l2) {
        int n = CrossPlatformEncoder.e(l, l2);
        Object object = ab[n];
        if (object instanceof String) {
            String string = bb[n];
            int n2 = string.indexOf(8);
            Class clazz = CrossPlatformEncoder.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CrossPlatformEncoder.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CrossPlatformEncoder.c(clazz3, string2, clazz2)) != null) {
                    CrossPlatformEncoder.ab[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CrossPlatformEncoder.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CrossPlatformEncoder.ab[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CrossPlatformEncoder.f(252205751343909L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = ab;
        ab[0] = "I,F";
        objectArray[1] = Integer.TYPE;
        CrossPlatformEncoder.bb[1] = "java/lang/Integer";
        objectArray[2] = "-j0f;w&e!)Fo5b(`";
        objectArray[3] = "}\u001fJ*\u000f|v\u0010[enr}\u001b_?";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Z vERu\u0019/vtP?fs)E[t_/j\u0005WD_7z\u0019K \r$z\u001a;";
    }

    public void y() {
        this.B.E(null);
        GraphicalRenderingController.D(NetworkSecurityTransformer.class).T(this.D.a());
    }

    @Override
    public void d() {
        this.h().A();
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void w(double d2) {
        super.w(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = new Object[5];
        bb = new String[5];
        CrossPlatformEncoder.a();
        V = new HashMap(13);
        long l = n ^ 0x4429E9F3A03DL;
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
        String string = "1\u008fp\u0088\u00ec\u00ad\u0098X\u00a5\u00da\u00c8\u00db\u00b7\u001e\u001b\u00c8\u00dc\u00b9K\u00f8\u00117+\u00ae";
        int n2 = "1\u008fp\u0088\u00ec\u00ad\u0098X\u00a5\u00da\u00c8\u00db\u00b7\u001e\u001b\u00c8\u00dc\u00b9K\u00f8\u00117+\u00ae".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        E = lArray;
        R = new Integer[3];
    }

    public void P() {
        this.m();
        this.D.y("");
        this.y();
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CrossPlatformEncoder.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (bb[n4] != null) {
            return n4;
        }
        Object object = ab[n4];
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
                n3 = 9;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 0;
                break;
            }
            case 4: {
                n3 = 29;
                break;
            }
            case 5: {
                n3 = 35;
                break;
            }
            case 6: {
                n3 = 53;
                break;
            }
            case 7: {
                n3 = 7;
                break;
            }
            case 8: {
                n3 = 8;
                break;
            }
            case 9: {
                n3 = 44;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 14;
                break;
            }
            case 13: {
                n3 = 48;
                break;
            }
            case 14: {
                n3 = 52;
                break;
            }
            case 15: {
                n3 = 56;
                break;
            }
            case 16: {
                n3 = 42;
                break;
            }
            case 17: {
                n3 = 61;
                break;
            }
            case 18: {
                n3 = 17;
                break;
            }
            case 19: {
                n3 = 15;
                break;
            }
            case 20: {
                n3 = 12;
                break;
            }
            case 21: {
                n3 = 55;
                break;
            }
            case 22: {
                n3 = 32;
                break;
            }
            case 23: {
                n3 = 5;
                break;
            }
            case 24: {
                n3 = 10;
                break;
            }
            case 25: {
                n3 = 1;
                break;
            }
            case 26: {
                n3 = 60;
                break;
            }
            case 27: {
                n3 = 26;
                break;
            }
            case 28: {
                n3 = 3;
                break;
            }
            case 29: {
                n3 = 19;
                break;
            }
            case 30: {
                n3 = 36;
                break;
            }
            case 31: {
                n3 = 46;
                break;
            }
            case 32: {
                n3 = 57;
                break;
            }
            case 33: {
                n3 = 63;
                break;
            }
            case 34: {
                n3 = 50;
                break;
            }
            case 35: {
                n3 = 47;
                break;
            }
            case 36: {
                n3 = 45;
                break;
            }
            case 37: {
                n3 = 51;
                break;
            }
            case 38: {
                n3 = 25;
                break;
            }
            case 39: {
                n3 = 34;
                break;
            }
            case 40: {
                n3 = 4;
                break;
            }
            case 41: {
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 62;
                break;
            }
            case 44: {
                n3 = 23;
                break;
            }
            case 45: {
                n3 = 54;
                break;
            }
            case 46: {
                n3 = 33;
                break;
            }
            case 47: {
                n3 = 30;
                break;
            }
            case 48: {
                n3 = 28;
                break;
            }
            case 49: {
                n3 = 43;
                break;
            }
            case 50: {
                n3 = 6;
                break;
            }
            case 51: {
                n3 = 37;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 24;
                break;
            }
            case 54: {
                n3 = 11;
                break;
            }
            case 55: {
                n3 = 49;
                break;
            }
            case 56: {
                n3 = 18;
                break;
            }
            case 57: {
                n3 = 21;
                break;
            }
            case 58: {
                n3 = 41;
                break;
            }
            case 59: {
                n3 = 38;
                break;
            }
            case 60: {
                n3 = 22;
                break;
            }
            case 61: {
                n3 = 20;
                break;
            }
            case 62: {
                n3 = 2;
                break;
            }
            default: {
                n3 = 39;
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
        CrossPlatformEncoder.bb[n4] = new String(cArray);
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

    @Override
    public void g() {
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CrossPlatformEncoder.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CrossPlatformEncoder.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CrossPlatformEncoder.e(l, l2);
            object = ab[n];
            try {
                if (!(object instanceof String)) break block2;
                CrossPlatformEncoder.ab[n] = clazz = Class.forName(bb[n]);
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
        boolean bl;
        block20: {
            block19: {
                double d2;
                Cc cc;
                double d3;
                block18: {
                    block17: {
                        block15: {
                            block16: {
                                this.B.y();
                                bl = ((NetworkConnectionEstablisher)GraphicalRenderingController.K.Z.J()).equals(GraphicalRenderingController.K.Y);
                                try {
                                    try {
                                        if (!GraphicalRenderingController.K.sq.s().booleanValue()) break block15;
                                        this.Y.N(true);
                                        this.Y.b(this.G() + 3.0);
                                        this.Y.M(this.W() + 1.0);
                                        this.Y.T(18.0);
                                        this.Y.w(this.b());
                                        this.Y.S(true);
                                        this.Y.i(true);
                                        this.Y.Q(Color.RED);
                                        if (!this.Y.s()) break block16;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CrossPlatformEncoder.a(customSystemException);
                                    }
                                    this.Y.h(M.j().brighter());
                                    break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CrossPlatformEncoder.a(customSystemException);
                                }
                            }
                            this.Y.h(M.j());
                            break block17;
                        }
                        this.Y.N(false);
                    }
                    this.D.S(true);
                    d3 = this.G() + 6.0;
                    try {
                        if (!this.Y.f() || !bl) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformEncoder.a(customSystemException);
                    }
                    d3 = this.Y.G() + this.Y.w() + 4.0;
                    ConfigurationManager.T(this.Y.G() + this.Y.w() + 1.0, this.W() + 6.0, 6.0, 0.75f, new Color(100, 100, 100, 255));
                }
                try {
                    this.D.b(d3);
                    this.D.M(this.W());
                    cc = this.D;
                    d2 = this.Y.f() ? this.w() - this.Y.w() - this.F.w() - 4.0 : this.w() - this.F.w() - 3.0;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformEncoder.a(customSystemException);
                }
                try {
                    cc.T(d2);
                    this.D.w(this.b());
                    if (this.D.a().isEmpty()) break block19;
                    this.v.N(false);
                    this.F.N(true);
                    this.F.b(this.G() + this.w() - 13.0);
                    this.F.M(this.W() + 1.0);
                    this.F.T(10.0);
                    this.F.w(this.b());
                    break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformEncoder.a(customSystemException);
                }
            }
            this.F.N(false);
            this.v.N(true);
            this.v.b(this.G() + this.w() - 14.0);
            this.v.M(this.W() + 0.5);
            this.v.T(10.0);
            this.v.w(this.b());
        }
        if (!bl) {
            boolean bl2 = this.D.f();
            try {
                this.D.N(false);
                this.v.N(false);
                if (bl2) {
                    this.P();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformEncoder.a(customSystemException);
            }
            this.T(22.0);
            this.Y(22.0);
            this.J(true);
        } else {
            this.D.N(true);
            this.T(110.0);
            this.Y(110.0);
            this.J(true);
        }
    }

    private void lambda$new$2() {
        block3: {
            block2: {
                try {
                    this.D.y("");
                    this.y();
                    if (!NetworkProtocolInterceptor.Jl) break block2;
                    GraphicalRenderingController.D(fS.class).p();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformEncoder.a(customSystemException);
                }
            }
            GraphicalRenderingController.D(NetworkProtocolEncoder220.class).O();
        }
        GraphicalRenderingController.K.T(GraphicalRenderingController.s7);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/C7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = CrossPlatformEncoder.e(l, l2);
        Object object = ab[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = bb[n];
                int n3 = string2.indexOf(8);
                clazz3 = CrossPlatformEncoder.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CrossPlatformEncoder.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CrossPlatformEncoder.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CrossPlatformEncoder.ab[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CrossPlatformEncoder.f(252205751343909L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CrossPlatformEncoder.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CrossPlatformEncoder.ab[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CrossPlatformEncoder.f(252205751343909L, 0L);
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
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == 'D' || c == 'I' || c == 't') {
                field = CrossPlatformEncoder.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CrossPlatformEncoder.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00da' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$new$0() {
        GraphicalRenderingController.d = this.D;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CrossPlatformEncoder.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5391;
        if (R[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = E[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])V.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    V.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/C7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CrossPlatformEncoder.R[n2] = n3;
        }
        return R[n2];
    }

    public CrossPlatformEncoder(NetworkSecurityTransformer networkSecurityTransformer) {
        long l = n ^ 0x678AE977058EL;
        super(networkSecurityTransformer);
        this.v = new GraphicalThemeRenderer((String)((Object)CrossPlatformEncoder.c("\u00a3", (int)CrossPlatformEncoder.b("g", (int)12504, (long)(0x7A79597EE939C57L ^ l)), (long)9159616617873187407L, (long)l)), 0.9);
        this.Y = new hj((String)((Object)CrossPlatformEncoder.c("\u00a3", (int)CrossPlatformEncoder.b("g", (int)11792, (long)(0x24D975EAF462029DL ^ l)), (long)9159616617873187407L, (long)l)));
        this.F = new HardwareYield((String)((Object)CrossPlatformEncoder.c("\u00a3", (int)CrossPlatformEncoder.b("g", (int)25948, (long)(0x18AD43DE84E449D0L ^ l)), (long)9159616617873187407L, (long)l)));
        this.D = new Cc(this);
        this.B = networkSecurityTransformer;
        this.n(true);
        this.v.N(this::lambda$new$0);
        this.F.N(this::lambda$new$1);
        this.D.T(new AuthenticationMediator2331(this));
        this.Y.N(this::lambda$new$2);
        ComplianceRuleEngine complianceRuleEngine = new ComplianceRuleEngine();
        complianceRuleEngine.b(null);
        this.D.M(complianceRuleEngine);
        this.o(this.v, this.F, this.D, this.Y);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/C7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CrossPlatformEncoder.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CrossPlatformEncoder.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

