/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.sync;

import a.RK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.ProtocolInteractionController;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.mediation.RuntimeContextMediator;
import com.security.session.CryptographicSessionManager847;
import com.ui.rendering.GraphicalRenderingController;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MultiThreadResourceSynchronizer
extends RuntimeContextMediator {
    private RK uX;
    private static final Object[] wb;
    private RK u9;
    private static final String[] xb;
    private CryptographicSessionManager847 ug;
    private boolean uj = false;
    private RK uv;
    private static final long vb;
    private static final long fb;
    private RK uH;
    private ArrayList<RK> uq = new ArrayList();

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public double w() {
        double d2;
        try {
            if (this.ug == null) {
                return 70.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
        try {
            d2 = this.ug.T.s() != false ? 26.0 : 54.0;
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
        return d2;
    }

    private static void X() {
        Object[] objectArray = wb;
        wb[0] = "\u007f\u001fp";
        objectArray[1] = Integer.TYPE;
        MultiThreadResourceSynchronizer.xb[1] = "java/lang/Integer";
        objectArray[2] = "\u0002wFx\\\u001f\txW7!\u0007\u001a\u007f^~";
        objectArray[3] = "d&\u001f=Guo)\u000er&{d\"\n(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Px\u0014J1(@y\u00005'1:-TV*;\nq\u000eI)J\u0003e\f\u000b<,@u\n\u0004L";
    }

    private static Field w(long l, long l2) {
        int n = MultiThreadResourceSynchronizer.u(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            String string = xb[n];
            int n2 = string.indexOf(8);
            Class clazz = MultiThreadResourceSynchronizer.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultiThreadResourceSynchronizer.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultiThreadResourceSynchronizer.k(clazz3, string2, clazz2)) != null) {
                    MultiThreadResourceSynchronizer.wb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultiThreadResourceSynchronizer.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultiThreadResourceSynchronizer.wb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultiThreadResourceSynchronizer.v(218117043557335L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void T() {
        boolean bl;
        RK rK;
        boolean bl2;
        double d2;
        block17: {
            for (AbstractComputationKernel abstractComputationKernel : this.A()) {
                if (!(abstractComputationKernel instanceof RK)) continue;
                RK rK2 = (RK)abstractComputationKernel;
                try {
                    if (!rK2.A().y().r()) continue;
                    rK2.N(true);
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiThreadResourceSynchronizer.a(customSystemException);
                }
            }
            d2 = this.W() + 2.0;
            bl2 = this.ug.T.s();
            rK = null;
            bl = false;
            try {
                if (GraphicalRenderingController.K.P || this.u()) break block17;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiThreadResourceSynchronizer.a(customSystemException);
            }
            bl = true;
        }
        for (RK rK3 : this.uq) {
            if (rK3.f()) {
                rK3.b(this.G() + 2.0);
                rK3.M(d2);
                d2 += (double)this.W();
                if (bl2) {
                    d2 += 2.0;
                }
                rK3.Z(false);
                rK = rK3;
            }
            try {
                rK3.I(bl);
                if (bl) {
                    rK3.N(true);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiThreadResourceSynchronizer.a(customSystemException);
            }
            rK3.u(bl2);
        }
        try {
            if (rK != null) {
                rK.Z(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
        try {
            if (!this.uj) {
                this.A();
                this.uj = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'l' || c == 'W' || c == '\u00d1' || c == 'Q') {
                field = MultiThreadResourceSynchronizer.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultiThreadResourceSynchronizer.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultiThreadResourceSynchronizer.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultiThreadResourceSynchronizer.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultiThreadResourceSynchronizer.u(l, l2);
            object = wb[n];
            try {
                if (!(object instanceof String)) break block2;
                MultiThreadResourceSynchronizer.wb[n] = clazz = Class.forName(xb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int u(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (xb[n4] != null) {
            return n4;
        }
        Object object = wb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 2;
                break;
            }
            case 1: {
                n3 = 16;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 56;
                break;
            }
            case 4: {
                n3 = 27;
                break;
            }
            case 5: {
                n3 = 13;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 8;
                break;
            }
            case 8: {
                n3 = 34;
                break;
            }
            case 9: {
                n3 = 28;
                break;
            }
            case 10: {
                n3 = 19;
                break;
            }
            case 11: {
                n3 = 52;
                break;
            }
            case 12: {
                n3 = 5;
                break;
            }
            case 13: {
                n3 = 10;
                break;
            }
            case 14: {
                n3 = 23;
                break;
            }
            case 15: {
                n3 = 51;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 17;
                break;
            }
            case 18: {
                n3 = 4;
                break;
            }
            case 19: {
                n3 = 20;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 30;
                break;
            }
            case 22: {
                n3 = 3;
                break;
            }
            case 23: {
                n3 = 44;
                break;
            }
            case 24: {
                n3 = 11;
                break;
            }
            case 25: {
                n3 = 43;
                break;
            }
            case 26: {
                n3 = 53;
                break;
            }
            case 27: {
                n3 = 54;
                break;
            }
            case 28: {
                n3 = 49;
                break;
            }
            case 29: {
                n3 = 9;
                break;
            }
            case 30: {
                n3 = 41;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 42;
                break;
            }
            case 33: {
                n3 = 47;
                break;
            }
            case 34: {
                n3 = 63;
                break;
            }
            case 35: {
                n3 = 40;
                break;
            }
            case 36: {
                n3 = 1;
                break;
            }
            case 37: {
                n3 = 61;
                break;
            }
            case 38: {
                n3 = 12;
                break;
            }
            case 39: {
                n3 = 26;
                break;
            }
            case 40: {
                n3 = 48;
                break;
            }
            case 41: {
                n3 = 22;
                break;
            }
            case 42: {
                n3 = 38;
                break;
            }
            case 43: {
                n3 = 57;
                break;
            }
            case 44: {
                n3 = 36;
                break;
            }
            case 45: {
                n3 = 50;
                break;
            }
            case 46: {
                n3 = 7;
                break;
            }
            case 47: {
                n3 = 58;
                break;
            }
            case 48: {
                n3 = 59;
                break;
            }
            case 49: {
                n3 = 62;
                break;
            }
            case 50: {
                n3 = 39;
                break;
            }
            case 51: {
                n3 = 37;
                break;
            }
            case 52: {
                n3 = 24;
                break;
            }
            case 53: {
                n3 = 45;
                break;
            }
            case 54: {
                n3 = 55;
                break;
            }
            case 55: {
                n3 = 46;
                break;
            }
            case 56: {
                n3 = 35;
                break;
            }
            case 57: {
                n3 = 31;
                break;
            }
            case 58: {
                n3 = 0;
                break;
            }
            case 59: {
                n3 = 21;
                break;
            }
            case 60: {
                n3 = 33;
                break;
            }
            case 61: {
                n3 = 60;
                break;
            }
            case 62: {
                n3 = 29;
                break;
            }
            default: {
                n3 = 14;
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
        MultiThreadResourceSynchronizer.xb[n4] = new String(cArray);
        return n4;
    }

    private static Method x(long l, long l2) {
        int n = MultiThreadResourceSynchronizer.u(l, l2);
        Object object = wb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = xb[n];
                int n3 = string2.indexOf(8);
                clazz3 = MultiThreadResourceSynchronizer.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultiThreadResourceSynchronizer.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultiThreadResourceSynchronizer.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultiThreadResourceSynchronizer.wb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultiThreadResourceSynchronizer.v(218117043557335L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultiThreadResourceSynchronizer.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultiThreadResourceSynchronizer.wb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultiThreadResourceSynchronizer.v(218117043557335L, 0L);
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

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public String A() {
        long l = fb ^ 0x43960C3AEC82L;
        return MultiThreadResourceSynchronizer.f("\u00e9", (int)((int)vb), (long)4868436836870333915L, (long)l);
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultiThreadResourceSynchronizer.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public double b() {
        int n = 0;
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            try {
                try {
                    if (!(abstractComputationKernel instanceof RK) || !abstractComputationKernel.f()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiThreadResourceSynchronizer.a(customSystemException);
                }
                ++n;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiThreadResourceSynchronizer.a(customSystemException);
            }
        }
        try {
            if (n == 0) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
        try {
            if (this.ug == null) {
                return 20.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
        int n2 = this.W();
        try {
            if (this.ug.T.s().booleanValue()) {
                n2 += 2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
        double d2 = n * n2 + 4;
        if (n == 1) {
            d2 = n2 + 4;
        }
        if (this.ug.T.s().booleanValue()) {
            d2 -= 2.0;
        }
        return d2;
    }

    public MultiThreadResourceSynchronizer() {
        super(CryptographicSessionManager847.class);
        this.ug = (CryptographicSessionManager847)this.t();
        int n = 310;
        int n2 = 311;
        int n3 = 312;
        int n4 = 313;
        if (GameVersionEnumerator.MC_1_21_10.H()) {
            n = 970;
            n2 = 971;
            n3 = 972;
            n4 = 973;
        } else if (GameVersionEnumerator.MC_1_21_0.H()) {
            n = 899;
            n2 = 900;
            n3 = 901;
            n4 = 902;
        } else if (GeometryCalculator.C() >= 50) {
            n = 868;
            n2 = 869;
            n3 = 870;
            n4 = 871;
        } else if (GeometryCalculator.C() >= 37) {
            n = 750;
            n2 = 751;
            n3 = 752;
            n4 = 753;
        } else if (GeometryCalculator.C() >= 35) {
            n = 634;
            n2 = 635;
            n3 = 636;
            n4 = 637;
        }
        this.uX = new RK(this, 5, LightweightExecutionContext.d(ProtocolInteractionController.Y(n)));
        this.u9 = new RK(this, 6, LightweightExecutionContext.d(ProtocolInteractionController.Y(n2)));
        this.uH = new RK(this, 7, LightweightExecutionContext.d(ProtocolInteractionController.Y(n3)));
        this.uv = new RK(this, 8, LightweightExecutionContext.d(ProtocolInteractionController.Y(n4)));
        this.uq.add(this.uX);
        this.uq.add(this.u9);
        this.uq.add(this.uH);
        this.uq.add(this.uv);
        this.o(this.uX, this.u9, this.uH, this.uv);
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

    @Override
    public void V() {
        try {
            if (ApplicationLifecycleManager.U().r()) {
                this.T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int W() {
        int n;
        try {
            if (this.ug == null) {
                return 20;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
        try {
            n = this.ug.T.s() != false ? 22 : 20;
        }
        catch (CustomSystemException customSystemException) {
            throw MultiThreadResourceSynchronizer.a(customSystemException);
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        fb = MultiContainerRegistry.a(1287159385973180802L, -1461253921495721023L, MethodHandles.lookup().lookupClass()).a(177059728523221L);
        wb = new Object[5];
        xb = new String[5];
        MultiThreadResourceSynchronizer.X();
        long l = fb ^ 0x7D9971A07711L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 7625255404911760339L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                vb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = MultiThreadResourceSynchronizer.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultiThreadResourceSynchronizer.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean u() {
        for (RK rK : this.uq) {
            try {
                if (!rK.o().r()) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiThreadResourceSynchronizer.a(customSystemException);
            }
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MultiThreadResourceSynchronizer.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

