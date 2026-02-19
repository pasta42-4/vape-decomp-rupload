/*
 * Decompiled with CFR 0.152.
 */
package com.concurrent.resource;

import a.CV;
import a.bE;
import com.app.analytics.time.TimeSeriesAnalyzer;
import com.app.resource.management.ResourceLifecycleManager2327;
import com.collections.management.MultiContainerRegistry;
import com.compression.io.StreamCompressionManager;
import com.crypto.cipher.SymmetricCipherManager;
import com.data.adaptive.AdaptiveDataTransformer;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.theme.GraphicalThemeRenderer;
import com.reflection.utils.ReflectionUtilityHandler;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CryptoSecurityProvider;
import com.security.modes.CryptographicModeEnum866;
import com.system.configuration.ConfigurationManager;
import com.system.resource.ResourceAllocator2470;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.UIRenderingCoordinator;
import com.ui.rendering.VisualRenderContext;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ThreadSafeResourceCoordinator
extends GraphicalRenderEngine1082 {
    private static final Map fb;
    private GraphicalThemeRenderer vI;
    private static final long[] bb;
    private GraphicalRenderEngine1082 vm;
    private SymmetricCipherManager vd;
    private GraphicalThemeRenderer vq;
    private static final long ab;
    private GraphicalRenderEngine1082 v7;
    private VisualRenderContext v8;
    private static final String[] mb;
    private static final Object[] lb;
    private AtomicBoolean vM;
    private UIRenderingCoordinator vG;
    private GraphicalThemeRenderer vB;
    private GraphicalRenderEngine1082 vU;
    private static String vY;
    private CV v5;
    private static final Integer[] eb;

    @Override
    public void E() {
        Color color;
        GraphicalThemeRenderer graphicalThemeRenderer;
        block7: {
            double d2;
            UIRenderingCoordinator uIRenderingCoordinator;
            block6: {
                try {
                    this.vB.w(17.0);
                    this.vB.Y(8.0);
                    ConfigurationManager.A(this.G() - 3.0, this.W(), this.w() + 7.0, this.b(), new Color(255, 255, 255, 10));
                    super.E();
                    if (!this.v7.f()) break block6;
                    ConfigurationManager.r(this.v5.G() + 4.0, this.v5.W() + 13.0, this.v5.w() - 20.0, 1.0f, ThreadSafeResourceCoordinator.M.k);
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ThreadSafeResourceCoordinator.a(customSystemException);
                }
            }
            try {
                this.vG.V(TemporalMetadataResolver.h.O().n().j());
                uIRenderingCoordinator = this.vG;
                d2 = this.s() ? this.w() - 36.0 : this.w() - 26.0;
            }
            catch (CustomSystemException customSystemException) {
                throw ThreadSafeResourceCoordinator.a(customSystemException);
            }
            uIRenderingCoordinator.v(d2);
        }
        try {
            graphicalThemeRenderer = this.vI;
            color = this.s() ? ThreadSafeResourceCoordinator.M.Z : ThreadSafeResourceCoordinator.M.E;
        }
        catch (CustomSystemException customSystemException) {
            throw ThreadSafeResourceCoordinator.a(customSystemException);
        }
        graphicalThemeRenderer.H(color);
    }

    private static Method l(long l, long l2) {
        int n = ThreadSafeResourceCoordinator.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ThreadSafeResourceCoordinator.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ThreadSafeResourceCoordinator.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ThreadSafeResourceCoordinator.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ThreadSafeResourceCoordinator.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ThreadSafeResourceCoordinator.j(223402545705036L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ThreadSafeResourceCoordinator.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ThreadSafeResourceCoordinator.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ThreadSafeResourceCoordinator.j(223402545705036L, 0L);
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

    static AtomicBoolean R(ThreadSafeResourceCoordinator threadSafeResourceCoordinator) {
        return threadSafeResourceCoordinator.vM;
    }

    public static void f(String string) {
        vY = string;
    }

    @Override
    public void G() {
        super.G();
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    private static void lambda$inputOnEnter$1(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(false);
    }

    public static void V(AtomicBoolean atomicBoolean, String string, Consumer<String> consumer, Consumer<String> consumer2) {
        block7: {
            try {
                if (atomicBoolean.get()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ThreadSafeResourceCoordinator.a(customSystemException);
            }
            try {
                try {
                    if (!string.isEmpty() && !string.equals(TemporalMetadataResolver.h.O().n().j())) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ThreadSafeResourceCoordinator.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ThreadSafeResourceCoordinator.a(customSystemException);
            }
        }
        atomicBoolean.set(true);
        SecureContextBroker572.h().c().x(string, arg_0 -> ThreadSafeResourceCoordinator.lambda$inputOnEnter$0(consumer, consumer2, arg_0), () -> ThreadSafeResourceCoordinator.lambda$inputOnEnter$1(atomicBoolean));
    }

    private void y() {
        if (this.vU.f()) {
            this.vU.N(false);
            this.v7.N(true);
            CryptoSecurityProvider cryptoSecurityProvider = TemporalMetadataResolver.h.O().n();
            String string = cryptoSecurityProvider.j();
            this.v5.y(string);
        } else {
            this.vU.N(true);
            this.v7.N(false);
        }
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void a() {
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ThreadSafeResourceCoordinator.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ThreadSafeResourceCoordinator.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static void z(ThreadSafeResourceCoordinator threadSafeResourceCoordinator) {
        threadSafeResourceCoordinator.y();
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (mb[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 48;
                break;
            }
            case 1: {
                n3 = 27;
                break;
            }
            case 2: {
                n3 = 16;
                break;
            }
            case 3: {
                n3 = 21;
                break;
            }
            case 4: {
                n3 = 54;
                break;
            }
            case 5: {
                n3 = 6;
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
                n3 = 43;
                break;
            }
            case 9: {
                n3 = 19;
                break;
            }
            case 10: {
                n3 = 22;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 32;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 15;
                break;
            }
            case 15: {
                n3 = 33;
                break;
            }
            case 16: {
                n3 = 1;
                break;
            }
            case 17: {
                n3 = 37;
                break;
            }
            case 18: {
                n3 = 9;
                break;
            }
            case 19: {
                n3 = 61;
                break;
            }
            case 20: {
                n3 = 24;
                break;
            }
            case 21: {
                n3 = 26;
                break;
            }
            case 22: {
                n3 = 56;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 24: {
                n3 = 10;
                break;
            }
            case 25: {
                n3 = 51;
                break;
            }
            case 26: {
                n3 = 14;
                break;
            }
            case 27: {
                n3 = 34;
                break;
            }
            case 28: {
                n3 = 8;
                break;
            }
            case 29: {
                n3 = 50;
                break;
            }
            case 30: {
                n3 = 3;
                break;
            }
            case 31: {
                n3 = 23;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 45;
                break;
            }
            case 34: {
                n3 = 60;
                break;
            }
            case 35: {
                n3 = 63;
                break;
            }
            case 36: {
                n3 = 2;
                break;
            }
            case 37: {
                n3 = 17;
                break;
            }
            case 38: {
                n3 = 11;
                break;
            }
            case 39: {
                n3 = 38;
                break;
            }
            case 40: {
                n3 = 58;
                break;
            }
            case 41: {
                n3 = 40;
                break;
            }
            case 42: {
                n3 = 28;
                break;
            }
            case 43: {
                n3 = 29;
                break;
            }
            case 44: {
                n3 = 42;
                break;
            }
            case 45: {
                n3 = 57;
                break;
            }
            case 46: {
                n3 = 53;
                break;
            }
            case 47: {
                n3 = 18;
                break;
            }
            case 48: {
                n3 = 52;
                break;
            }
            case 49: {
                n3 = 31;
                break;
            }
            case 50: {
                n3 = 39;
                break;
            }
            case 51: {
                n3 = 44;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 55;
                break;
            }
            case 54: {
                n3 = 62;
                break;
            }
            case 55: {
                n3 = 13;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 49;
                break;
            }
            case 58: {
                n3 = 46;
                break;
            }
            case 59: {
                n3 = 5;
                break;
            }
            case 60: {
                n3 = 59;
                break;
            }
            case 61: {
                n3 = 47;
                break;
            }
            case 62: {
                n3 = 25;
                break;
            }
            default: {
                n3 = 41;
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
        ThreadSafeResourceCoordinator.mb[n4] = new String(cArray);
        return n4;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ThreadSafeResourceCoordinator.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                ThreadSafeResourceCoordinator.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field k(long l, long l2) {
        int n = ThreadSafeResourceCoordinator.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = ThreadSafeResourceCoordinator.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ThreadSafeResourceCoordinator.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ThreadSafeResourceCoordinator.e(clazz3, string2, clazz2)) != null) {
                    ThreadSafeResourceCoordinator.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ThreadSafeResourceCoordinator.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ThreadSafeResourceCoordinator.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ThreadSafeResourceCoordinator.j(223402545705036L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void lambda$inputOnEnter$0(Consumer consumer, Consumer consumer2, TimeSeriesAnalyzer timeSeriesAnalyzer) {
        block11: {
            long l;
            block10: {
                l = ab ^ 0x199191498738L;
                try {
                    if (timeSeriesAnalyzer.a() != CryptographicModeEnum866.SUCCESSFUL) break block10;
                    TemporalMetadataResolver.h.r().I(timeSeriesAnalyzer.F());
                    consumer.accept(timeSeriesAnalyzer.F());
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw ThreadSafeResourceCoordinator.a(customSystemException);
                }
            }
            if (timeSeriesAnalyzer.a() == CryptographicModeEnum866.COOLDOWN) {
                String string = timeSeriesAnalyzer.l() / 1000L + (String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)15321, (long)(0x4F6D26F035EDE611L ^ l)), (long)-936953249610763343L, (long)l));
                consumer2.accept((String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)20773, (long)(0xE9E2952F89F8CE6L ^ l)), (long)-936953249610763343L, (long)l)) + string);
            } else {
                block14: {
                    block13: {
                        block12: {
                            try {
                                if (timeSeriesAnalyzer.a() != CryptographicModeEnum866.USERNAME_VALIDATION_FAILED) break block12;
                                consumer2.accept(ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)10057, (long)(0xA2193E8BA37FA8EL ^ l)), (long)-936953249610763343L, (long)l));
                                break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ThreadSafeResourceCoordinator.a(customSystemException);
                            }
                        }
                        try {
                            if (timeSeriesAnalyzer.a() != CryptographicModeEnum866.BANNED) break block13;
                            consumer2.accept(ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)20343, (long)(0x117631D4D2B192B9L ^ l)), (long)-936953249610763343L, (long)l));
                            break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ThreadSafeResourceCoordinator.a(customSystemException);
                        }
                    }
                    try {
                        if (timeSeriesAnalyzer.a() != CryptographicModeEnum866.USERNAME_TAKEN) break block14;
                        consumer2.accept(ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)24201, (long)(0x94FB42F95080343L ^ l)), (long)-936953249610763343L, (long)l));
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ThreadSafeResourceCoordinator.a(customSystemException);
                    }
                }
                consumer2.accept(ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)27440, (long)(0x45157E09561E36FDL ^ l)), (long)-936953249610763343L, (long)l));
            }
        }
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "\u001e\u001cQ";
        objectArray[1] = Integer.TYPE;
        ThreadSafeResourceCoordinator.mb[1] = "java/lang/Integer";
        objectArray[2] = "LhDFt\u0012GgU\t\t\nT`\\@";
        objectArray[3] = "T)r=\u0017I_&crvGT-g(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0010!*+/U\u0016p~O4W})\"*`R\u0012/'.f,Dhc&0W\u0001nv0_";
    }

    public ThreadSafeResourceCoordinator() {
        long l = ab ^ 0x47EF65AF885BL;
        super(104.0, 16.0);
        this.vB = new GraphicalThemeRenderer((String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)21822, (long)(0x4E4A176693A70798L ^ l)), (long)-172232427078714158L, (long)l)), 1.4);
        this.vd = new SymmetricCipherManager(100.0);
        this.vm = new GraphicalRenderEngine1082(20.0, 16.0);
        this.vI = new GraphicalThemeRenderer((String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)17065, (long)(0x4AF87E40C431900CL ^ l)), (long)-172232427078714158L, (long)l)), 0.6, ThreadSafeResourceCoordinator.M.Z, ThreadSafeResourceCoordinator.M.q, 10.0, 10.0);
        this.vq = new GraphicalThemeRenderer((String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)2180, (long)(0x1937C42CAFADDA28L ^ l)), (long)-172232427078714158L, (long)l)), 0.6, ThreadSafeResourceCoordinator.M.w);
        this.vU = new GraphicalRenderEngine1082(104.0, 16.0);
        this.v7 = new GraphicalRenderEngine1082(104.0, 16.0);
        this.vM = new AtomicBoolean();
        this.v5 = new AdaptiveDataTransformer(this, (String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)25815, (long)(0x1146A5707A91367DL ^ l)), (long)-172232427078714158L, (long)l)), 10000L);
        this.v8 = new VisualRenderContext((String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)19891, (long)(0x6CB3F03DA69A1F11L ^ l)), (long)-172232427078714158L, (long)l)), 0.8, false, ThreadSafeResourceCoordinator.M.S);
        this.vB.w(16.0);
        this.vB.H(Color.WHITE);
        this.vB.R(Color.WHITE);
        this.vG = new ResourceAllocator2470(this, "", 0.6, 0.8, 0.1, this.s() ? this.w() - 36.0 : this.w() - 26.0, true, false, ThreadSafeResourceCoordinator.M.w, this);
        this.i(false);
        this.i(16.0);
        this.d().J(true);
        this.v5.O().H((String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)8276, (long)(0x6DDC818999B1F2F3L ^ l)), (long)-172232427078714158L, (long)l)));
        this.vd.i(false);
        this.vq.Y(10.0);
        this.vq.P(10.0);
        this.vI.Y(10.0);
        this.vI.P(10.0);
        this.vq.N(ThreadSafeResourceCoordinator.M.k);
        this.vm.d().J(true);
        this.vm.i(false);
        this.vm.Y(25.0);
        this.vd.o(new bE(2.0, 1.0), this.vB, this.vG);
        this.vm.o(this.vI);
        this.vm.o(new bE(2.0, 1.0));
        this.vm.o(this.vq);
        this.vU.n(this.vd, new Object[0]);
        this.vU.n(this.vm, ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)15413, (long)(0x2263667AF80A6E96L ^ l)), (long)-172232427078714158L, (long)l));
        this.vU.i(false);
        this.v7.n(this.v5, new Object[0]);
        this.v7.n(this.v8, new Object[0]);
        this.v7.N(false);
        this.v7.i(false);
        this.v5.I(false);
        this.v5.o(16);
        this.vI.N(ThreadSafeResourceCoordinator.M.E);
        this.v8.P(10.0);
        this.v8.Y(22.0);
        this.v7.d().J(true);
        this.vI.g((String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)18997, (long)(0x3EE522AE242189DL ^ l)), (long)-172232427078714158L, (long)l)));
        this.vq.g((String)((Object)ThreadSafeResourceCoordinator.d("\u00d4", (int)ThreadSafeResourceCoordinator.c("u", (int)32537, (long)(0x4CC386575AB1ADB6L ^ l)), (long)-172232427078714158L, (long)l)));
        this.n(this.vU, new Object[0]);
        this.n(this.v7, new Object[0]);
        this.vq.N(new ReflectionUtilityHandler(this));
        this.vI.N(new ResourceLifecycleManager2327(this));
        this.v8.N(new StreamCompressionManager(this));
    }

    public static String i() {
        return vY;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ThreadSafeResourceCoordinator.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ThreadSafeResourceCoordinator.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'B' || c == '\u00c5' || c == '\u00dc' || c == 'C') {
                field = ThreadSafeResourceCoordinator.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ThreadSafeResourceCoordinator.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'o' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void u() {
    }

    @Override
    public void C() {
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ThreadSafeResourceCoordinator.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void d() {
        super.d();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ThreadSafeResourceCoordinator.ab = MultiContainerRegistry.a(8906155330060405668L, -1792829080940049660L, MethodHandles.lookup().lookupClass()).a(8684675821973L);
                ThreadSafeResourceCoordinator.lb = new Object[5];
                ThreadSafeResourceCoordinator.mb = new String[5];
                ThreadSafeResourceCoordinator.x();
                ThreadSafeResourceCoordinator.fb = new HashMap<K, V>(13);
                var0 = ThreadSafeResourceCoordinator.ab ^ 38022204523735L;
                ThreadSafeResourceCoordinator.f(null);
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
                var8_3 = new long[15];
                var5_4 = 0;
                var6_5 = "\u009fB\u00e5*}\n\u00a4`\u0015\u00f4PG(\u00cc\u001b=0\u00cf\u00aeF?\u00eab\u0005?\u00d8\u00a1\u00de\u00c9\u00cfR]\u009cqX\u00f9\u0004Mh%2\u00b1\u0085\u0003l\u00f5\u00b0\u009a=k\u00cbl\u008f\u008d\u00f5w\u00eb\u0093\u00b8\u00c8\u00c0'l\r\u00c8\u008d\u00abOL\u00c4\u00ebE\u00b9\u00bc\u007fA\u0093\u0004\u00b9\u001ey\u001c\u009d0\u0083|=\u009d\t+\u00da\rj\u00a7\u0007\u00f6\r\u00c0\u0084\u00002G\u00ea\"";
                var7_6 = "\u009fB\u00e5*}\n\u00a4`\u0015\u00f4PG(\u00cc\u001b=0\u00cf\u00aeF?\u00eab\u0005?\u00d8\u00a1\u00de\u00c9\u00cfR]\u009cqX\u00f9\u0004Mh%2\u00b1\u0085\u0003l\u00f5\u00b0\u009a=k\u00cbl\u008f\u008d\u00f5w\u00eb\u0093\u00b8\u00c8\u00c0'l\r\u00c8\u008d\u00abOL\u00c4\u00ebE\u00b9\u00bc\u007fA\u0093\u0004\u00b9\u001ey\u001c\u009d0\u0083|=\u009d\t+\u00da\rj\u00a7\u0007\u00f6\r\u00c0\u0084\u00002G\u00ea\"".length();
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
                    var6_5 = "\u0001N\u0001:>\u00c9\u00a0\u007f\u0094\u00a7w\u0081\u00ff\u0013\u00a6\u00e4";
                    var7_6 = "\u0001N\u0001:>\u00c9\u00a0\u007f\u0094\u00a7w\u0081\u00ff\u0013\u00a6\u00e4".length();
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
        ThreadSafeResourceCoordinator.bb = var8_3;
        ThreadSafeResourceCoordinator.eb = new Integer[15];
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void i() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ThreadSafeResourceCoordinator.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F33;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
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
                throw new RuntimeException("a/wQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ThreadSafeResourceCoordinator.eb[n2] = n3;
        }
        return eb[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ThreadSafeResourceCoordinator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ThreadSafeResourceCoordinator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

