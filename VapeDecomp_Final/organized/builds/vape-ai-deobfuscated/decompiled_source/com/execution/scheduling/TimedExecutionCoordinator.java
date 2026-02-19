/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.execution.scheduling;

import a.Ne;
import com.analytics.computation.MetricsCalculationEngine;
import com.app.communication.protocol.MessageProtocolInterface;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.exception.system.CustomSystemException;
import com.graphics.palette.ColorPaletteGenerator1110;
import com.graphics.rendering.GraphicalRenderingController1075;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.system.resource.ResourceAllocationTracker1227;
import com.temporal.metadata.TemporalMetadataResolver;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TimedExecutionCoordinator
extends GraphicalRenderingController1075 {
    private static final String[] p;
    private static final long d;
    private final ResourceAllocationTracker1227 j;
    private long W = Long.MAX_VALUE;
    private final ColorPaletteGenerator1110 i = new ColorPaletteGenerator1110();
    private boolean O;
    private static int Q;
    private static final Object[] m;
    private long H;
    private static final long f;

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TimedExecutionCoordinator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void e() {
        Color color;
        double d2;
        double d3;
        String string;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        long l = d ^ 0x6205EEF84E50L;
        try {
            if (!this.O) {
                this.O = true;
                this.I(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        float f = (float)(1.0 / TemporalMetadataResolver.h.a().b());
        boolean bl = GL11.glIsEnabled((int)3042);
        float f2 = 1.0f / f;
        try {
            if (ConfigurationManager.U()) {
                Ne.h.J(f2, f2, f2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        double d4 = this.G();
        double d5 = this.R();
        double d6 = this.S();
        double d7 = this.s();
        boolean bl2 = this.N().T(GraphicsBufferAllocator.b());
        this.j.Z((int)d6 * 2, (int)d7 * 2);
        this.j.q((int)d4, (int)d5, 20.0f, 3.0f);
        Color color2 = this.V();
        Color color3 = new Color(0, 0, 0, 173);
        Color color4 = new Color(48, 48, 48, 255);
        if (bl2) {
            color3 = new Color(0, 0, 0, 200);
            color4 = new Color(60, 60, 60, 255);
        }
        try {
            ConfigurationManager.o(d4, d5, d6, d7, color3, true, 3.0f, 1.0f);
            ConfigurationManager.U(d4, d5, d6, d7, color4, 3.0f, 1.0f, 1.0f);
            StateTrackingCoordinator.d(color2, (float)d4 - 4.0f, (float)d5 - 6.0f, this.t(), 1.0f, true);
            if (this.q().equals((Object)CryptoConfigurationRegistry383.ALERT)) {
                StateTrackingCoordinator.d(color2, (float)d4 - 2.0f, (float)d5, (String)((Object)TimedExecutionCoordinator.b("\u00fa", (int)((int)TimedExecutionCoordinator.f), (long)4632009946630318570L, (long)l)), 0.65f, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        try {
            cryptographicParameterGenerator = TemporalMetadataResolver.h.W().u(0.9, true);
            string = this.U();
            d3 = d4 + 23.0;
            d2 = d5 + 8.0;
            color = this.q().equals((Object)CryptoConfigurationRegistry383.ALERT) ? new Color(this.q().o()) : this.i.c;
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        cryptographicParameterGenerator.R(string, d3, d2, color);
        this.V().u(d4 + 23.0, d5 + 21.0);
        double d8 = this.r();
        try {
            if (d8 < 100.0) {
                ConfigurationManager.o(d4 + 1.0, d5 + d7 - 1.5, d6 * d8 - 1.0, 0.5, new Color(this.q().o()), false, 1.0f, 1.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        try {
            if (d8 <= 0.0) {
                this.B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        try {
            if (ConfigurationManager.U()) {
                Ne.h.J(f, f, f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        try {
            Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
            if (bl) {
                GL11.glEnable((int)3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
    }

    private double G() {
        return this.W() + 3.0 + (double)ApplicationLifecycleManager.e() / TemporalMetadataResolver.h.a().b() / 2.0;
    }

    @Override
    public double S() {
        double d2 = 18.0;
        double d3 = 100.0 + d2;
        return Math.max(d3, super.S()) + d2;
    }

    public static void U(int n) {
        Q = n;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TimedExecutionCoordinator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TimedExecutionCoordinator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public double r() {
        return Math.max(Math.min((double)(this.W - System.currentTimeMillis()) / (double)this.H, 1.0), 0.0);
    }

    private double R() {
        return this.h() + (double)ApplicationLifecycleManager.b() / TemporalMetadataResolver.h.a().b() / 2.0;
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "T_\n";
        objectArray[1] = Integer.TYPE;
        TimedExecutionCoordinator.p[1] = "java/lang/Integer";
        objectArray[2] = "M$pGL6F+a\b1.U,hA";
        objectArray[3] = "\u0018~\u0014M\u0015V\u0013q\u0005\u0002tX\u0018z\u0001X";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "x;DJ%gg&U!!a\u0016n\f^!v{5]B1\u001a/:R_7*in\u000eXJ";
    }

    @Override
    public void z(double d2, double d3) {
        try {
            if (!this.N().O(d2, d3)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        this.B();
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TimedExecutionCoordinator.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                TimedExecutionCoordinator.m[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (p[n4] != null) {
            return n4;
        }
        Object object = m[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 34;
                break;
            }
            case 1: {
                n3 = 62;
                break;
            }
            case 2: {
                n3 = 38;
                break;
            }
            case 3: {
                n3 = 17;
                break;
            }
            case 4: {
                n3 = 18;
                break;
            }
            case 5: {
                n3 = 60;
                break;
            }
            case 6: {
                n3 = 39;
                break;
            }
            case 7: {
                n3 = 46;
                break;
            }
            case 8: {
                n3 = 3;
                break;
            }
            case 9: {
                n3 = 58;
                break;
            }
            case 10: {
                n3 = 36;
                break;
            }
            case 11: {
                n3 = 45;
                break;
            }
            case 12: {
                n3 = 43;
                break;
            }
            case 13: {
                n3 = 4;
                break;
            }
            case 14: {
                n3 = 0;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 30;
                break;
            }
            case 17: {
                n3 = 53;
                break;
            }
            case 18: {
                n3 = 15;
                break;
            }
            case 19: {
                n3 = 20;
                break;
            }
            case 20: {
                n3 = 59;
                break;
            }
            case 21: {
                n3 = 19;
                break;
            }
            case 22: {
                n3 = 22;
                break;
            }
            case 23: {
                n3 = 26;
                break;
            }
            case 24: {
                n3 = 55;
                break;
            }
            case 25: {
                n3 = 50;
                break;
            }
            case 26: {
                n3 = 21;
                break;
            }
            case 27: {
                n3 = 1;
                break;
            }
            case 28: {
                n3 = 23;
                break;
            }
            case 29: {
                n3 = 32;
                break;
            }
            case 30: {
                n3 = 56;
                break;
            }
            case 31: {
                n3 = 37;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 35;
                break;
            }
            case 34: {
                n3 = 9;
                break;
            }
            case 35: {
                n3 = 14;
                break;
            }
            case 36: {
                n3 = 51;
                break;
            }
            case 37: {
                n3 = 7;
                break;
            }
            case 38: {
                n3 = 41;
                break;
            }
            case 39: {
                n3 = 13;
                break;
            }
            case 40: {
                n3 = 44;
                break;
            }
            case 41: {
                n3 = 63;
                break;
            }
            case 42: {
                n3 = 57;
                break;
            }
            case 43: {
                n3 = 10;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 2;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 42;
                break;
            }
            case 48: {
                n3 = 8;
                break;
            }
            case 49: {
                n3 = 33;
                break;
            }
            case 50: {
                n3 = 49;
                break;
            }
            case 51: {
                n3 = 48;
                break;
            }
            case 52: {
                n3 = 6;
                break;
            }
            case 53: {
                n3 = 28;
                break;
            }
            case 54: {
                n3 = 29;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 47;
                break;
            }
            case 57: {
                n3 = 40;
                break;
            }
            case 58: {
                n3 = 16;
                break;
            }
            case 59: {
                n3 = 31;
                break;
            }
            case 60: {
                n3 = 52;
                break;
            }
            case 61: {
                n3 = 11;
                break;
            }
            case 62: {
                n3 = 12;
                break;
            }
            default: {
                n3 = 61;
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
        TimedExecutionCoordinator.p[n4] = new String(cArray);
        return n4;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Fk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public TimedExecutionCoordinator(CryptoConfigurationRegistry383 cryptoConfigurationRegistry383, String string, MessageProtocolInterface messageProtocolInterface, double d2, double d3, long l) {
        super(cryptoConfigurationRegistry383, string, messageProtocolInterface, d2, d3);
        this.j = new ResourceAllocationTracker1227(0, 0);
        this.H = l;
    }

    public long S() {
        return this.W;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = TimedExecutionCoordinator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TimedExecutionCoordinator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public boolean i() {
        boolean bl;
        try {
            bl = this.W() >= 1.0;
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        return bl;
    }

    @Override
    public double s() {
        return super.s();
    }

    public boolean Z() {
        boolean bl;
        try {
            bl = System.currentTimeMillis() >= this.W;
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        return bl;
    }

    @Override
    public void B() {
        this.R(5.0);
    }

    public static int o() {
        int n = TimedExecutionCoordinator.J();
        try {
            if (n == 0) {
                return 90;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TimedExecutionCoordinator.b(customSystemException);
        }
        return 0;
    }

    public static int J() {
        return Q;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = MultiContainerRegistry.a(2800386938600838315L, 1230549156725116263L, MethodHandles.lookup().lookupClass()).a(63952857422463L);
        m = new Object[5];
        p = new String[5];
        TimedExecutionCoordinator.a();
        long l = d ^ 0x78CA7ACEE771L;
        TimedExecutionCoordinator.U(107);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 7052548916383562837L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                f = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void I(long l) {
        this.H = l;
        this.W = System.currentTimeMillis() + l;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e8' || c == 'E' || c == '\u00f9' || c == '\u00e0') {
                field = TimedExecutionCoordinator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TimedExecutionCoordinator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'L' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(long l, long l2) {
        int n = TimedExecutionCoordinator.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = p[n];
                int n3 = string2.indexOf(8);
                clazz3 = TimedExecutionCoordinator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TimedExecutionCoordinator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TimedExecutionCoordinator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        TimedExecutionCoordinator.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TimedExecutionCoordinator.b(232831738224832L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TimedExecutionCoordinator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TimedExecutionCoordinator.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TimedExecutionCoordinator.b(232831738224832L, 0L);
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

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private MetricsCalculationEngine N() {
        return new MetricsCalculationEngine(this.G(), this.R(), this.S(), this.s());
    }

    private static Field c(long l, long l2) {
        int n = TimedExecutionCoordinator.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = TimedExecutionCoordinator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TimedExecutionCoordinator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TimedExecutionCoordinator.a(clazz3, string2, clazz2)) != null) {
                    TimedExecutionCoordinator.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TimedExecutionCoordinator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TimedExecutionCoordinator.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TimedExecutionCoordinator.b(232831738224832L, 0L);
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
            return MethodHandles.lookup().findStatic(TimedExecutionCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

