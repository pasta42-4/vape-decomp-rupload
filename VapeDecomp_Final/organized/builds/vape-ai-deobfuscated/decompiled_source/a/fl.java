/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.database.connection.DatabaseConnectionPool;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.financial.transaction.TransactionProcessor;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.NetworkProtocolAdapter990;
import com.resource.dynamic.DynamicResourceBroker;
import com.runtime.mediation.RuntimeContextMediator;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fl
extends RuntimeContextMediator {
    private DynamicResourceBroker Sy = (DynamicResourceBroker)this.t();
    private static final String[] Jb;
    private double Sr;
    private static final long[] vb;
    private static final Integer[] wb;
    private static final Map xb;
    private static final long fb;
    private static final Object[] Ib;

    @Override
    public void V() {
        try {
            if (this.S()) {
                this.X();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw fl.a(customSystemException);
        }
        this.p();
    }

    @Override
    public double w() {
        try {
            if (this.S()) {
                return 70.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw fl.a(customSystemException);
        }
        return this.Sr + 12.0;
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void f(double d2, double d3, boolean bl) {
        Color color;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10 = d2 - 4.0;
        double d11 = d3 - 4.0;
        ConfigurationManager.S(d10, d11, 8.0, 8.0, this.s(EventDispatchCoordinator1159.y(fl.M.W, 145)));
        if (bl) {
            d9 = d10 + 1.8;
            d8 = d11 + 4.5;
            d7 = d10 + 4.0;
            d6 = d11 + 2.5;
            d5 = d10 + 5.7;
            d4 = d11 + 4.5;
            color = fl.M.Y;
        } else {
            d9 = d10 + 1.8;
            d8 = d11 + 3.0;
            d7 = d10 + 5.7;
            d6 = d11 + 3.0;
            d5 = d10 + 4.0;
            d4 = d11 + 5.0;
            color = fl.M.O;
        }
        ConfigurationManager.m(d9, d8, d7, d6, d5, d4, this.s(color));
    }

    private void H(CryptographicParameterGenerator cryptographicParameterGenerator, String string, double d2, double d3, Color color) {
        block3: {
            long l;
            block2: {
                l = fb ^ 0x6C45E2804135L;
                d2 = (int)d2;
                try {
                    if (!this.R()) break block2;
                    cryptographicParameterGenerator.R(string, d2, d3, this.s(color));
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw fl.a(customSystemException);
                }
            }
            cryptographicParameterGenerator.K(string, d2, d3, color, this.s(new Color((int)fl.f("h", (int)2371, (long)(0x68B54390A5D35C9BL ^ l)), true)));
        }
    }

    private void p() {
        long l = fb ^ 0x7EE4A5784472L;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().T(0.75, true);
        CryptographicParameterGenerator cryptographicParameterGenerator2 = TemporalMetadataResolver.h.W().T(1.2, true);
        double d2 = this.w() / 3.0;
        double d3 = this.b() / 2.0;
        Color color = EventDispatchCoordinator1159.y(Color.WHITE, 51);
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        int n = (int)Math.round(systemConfigurationOrchestrator.F());
        int n2 = (int)Math.round(systemConfigurationOrchestrator.V());
        int n3 = (int)Math.round(systemConfigurationOrchestrator.B());
        double d4 = 10.0;
        this.H(cryptographicParameterGenerator, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)2884, (long)(0x1D23B853BB42DBC9L ^ l)), (long)-2324879410455451812L, (long)l)), this.G() + d4, this.W() + d3 / 2.0 + 2.5, this.s(Color.WHITE));
        this.H(cryptographicParameterGenerator2, String.valueOf(n), this.G() + (d4 += cryptographicParameterGenerator.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)6840, (long)(0x57B94C0BC7E64A37L ^ l)), (long)-2324879410455451812L, (long)l))) + 2.5), this.W() + d3 / 2.0, this.s(Color.WHITE));
        this.f(this.G() + (d4 += Math.max(22.0, 5.0 + cryptographicParameterGenerator2.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)32500, (long)(0x6EDCE460D6D5AE68L ^ l)), (long)-2324879410455451812L, (long)l))) * (double)String.valueOf(n).length())), this.W() + d3 / 2.0 + 4.0, this.E());
        ConfigurationManager.T((double)((int)(this.G() + (d4 += 10.0))), (double)((int)(this.W() + d3 / 2.0)), 8.0, 1.2f, color);
        this.H(cryptographicParameterGenerator, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)10394, (long)(0x60449E3857587816L ^ l)), (long)-2324879410455451812L, (long)l)), this.G() + (d4 += 10.0), this.W() + d3 / 2.0 + 2.5, this.s(Color.WHITE));
        this.H(cryptographicParameterGenerator2, String.valueOf(n2), this.G() + (d4 += cryptographicParameterGenerator.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)30216, (long)(0x2611F73659268DL ^ l)), (long)-2324879410455451812L, (long)l))) + 2.5), this.W() + d3 / 2.0, this.s(Color.WHITE));
        ConfigurationManager.T((double)((int)(this.G() + (d4 += Math.max(22.0, 5.0 + cryptographicParameterGenerator2.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)29212, (long)(0x698BD4E137372281L ^ l)), (long)-2324879410455451812L, (long)l))) * (double)String.valueOf(n2).length())))), (double)((int)(this.W() + d3 / 2.0)), 8.0, 1.2f, color);
        this.H(cryptographicParameterGenerator, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)8946, (long)(0x50B251A86A85F272L ^ l)), (long)-2324879410455451812L, (long)l)), this.G() + (d4 += 10.0), this.W() + d3 / 2.0 + 2.5, this.s(Color.WHITE));
        this.H(cryptographicParameterGenerator2, String.valueOf(n3), this.G() + (d4 += cryptographicParameterGenerator.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)18676, (long)(0x31D361EB80D69877L ^ l)), (long)-2324879410455451812L, (long)l))) + 2.5), this.W() + d3 / 2.0, this.s(Color.WHITE));
        this.f(this.G() + (d4 += Math.max(22.0, 5.0 + cryptographicParameterGenerator2.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)20823, (long)(0x56AF5C44E9F681D3L ^ l)), (long)-2324879410455451812L, (long)l))) * (double)String.valueOf(n3).length())), this.W() + d3 / 2.0 + 4.0, this.y());
        this.Sr = d4;
        d4 = 10.0;
        this.H(cryptographicParameterGenerator, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)18129, (long)(0x6216359D8B4C964FL ^ l)), (long)-2324879410455451812L, (long)l)), this.G() + d4, this.W() + d3 + d3 / 2.0 - 2.5, this.s(Color.WHITE));
        this.H(cryptographicParameterGenerator, this.z(), this.G() + (d4 += cryptographicParameterGenerator.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)20098, (long)(0x988CF96600A9E0AL ^ l)), (long)-2324879410455451812L, (long)l)))), this.W() + d3 + d3 / 2.0 - 2.5, this.s(fl.M.I));
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
                n3 = 6;
                break;
            }
            case 1: {
                n3 = 16;
                break;
            }
            case 2: {
                n3 = 51;
                break;
            }
            case 3: {
                n3 = 10;
                break;
            }
            case 4: {
                n3 = 31;
                break;
            }
            case 5: {
                n3 = 22;
                break;
            }
            case 6: {
                n3 = 44;
                break;
            }
            case 7: {
                n3 = 8;
                break;
            }
            case 8: {
                n3 = 40;
                break;
            }
            case 9: {
                n3 = 1;
                break;
            }
            case 10: {
                n3 = 36;
                break;
            }
            case 11: {
                n3 = 4;
                break;
            }
            case 12: {
                n3 = 33;
                break;
            }
            case 13: {
                n3 = 2;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 15: {
                n3 = 38;
                break;
            }
            case 16: {
                n3 = 12;
                break;
            }
            case 17: {
                n3 = 62;
                break;
            }
            case 18: {
                n3 = 0;
                break;
            }
            case 19: {
                n3 = 58;
                break;
            }
            case 20: {
                n3 = 49;
                break;
            }
            case 21: {
                n3 = 56;
                break;
            }
            case 22: {
                n3 = 24;
                break;
            }
            case 23: {
                n3 = 7;
                break;
            }
            case 24: {
                n3 = 35;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 32;
                break;
            }
            case 27: {
                n3 = 15;
                break;
            }
            case 28: {
                n3 = 30;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 54;
                break;
            }
            case 32: {
                n3 = 59;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 21;
                break;
            }
            case 36: {
                n3 = 52;
                break;
            }
            case 37: {
                n3 = 42;
                break;
            }
            case 38: {
                n3 = 9;
                break;
            }
            case 39: {
                n3 = 11;
                break;
            }
            case 40: {
                n3 = 47;
                break;
            }
            case 41: {
                n3 = 34;
                break;
            }
            case 42: {
                n3 = 61;
                break;
            }
            case 43: {
                n3 = 26;
                break;
            }
            case 44: {
                n3 = 23;
                break;
            }
            case 45: {
                n3 = 29;
                break;
            }
            case 46: {
                n3 = 14;
                break;
            }
            case 47: {
                n3 = 53;
                break;
            }
            case 48: {
                n3 = 3;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 17;
                break;
            }
            case 51: {
                n3 = 28;
                break;
            }
            case 52: {
                n3 = 39;
                break;
            }
            case 53: {
                n3 = 25;
                break;
            }
            case 54: {
                n3 = 46;
                break;
            }
            case 55: {
                n3 = 63;
                break;
            }
            case 56: {
                n3 = 20;
                break;
            }
            case 57: {
                n3 = 43;
                break;
            }
            case 58: {
                n3 = 18;
                break;
            }
            case 59: {
                n3 = 55;
                break;
            }
            case 60: {
                n3 = 27;
                break;
            }
            case 61: {
                n3 = 45;
                break;
            }
            case 62: {
                n3 = 60;
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
        fl.Jb[n4] = new String(cArray);
        return n4;
    }

    private boolean S() {
        boolean bl;
        try {
            if (this.Sy == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw fl.a(customSystemException);
        }
        try {
            bl = this.Sy.r.J() == this.Sy.O;
        }
        catch (CustomSystemException customSystemException) {
            throw fl.a(customSystemException);
        }
        return bl;
    }

    private static int f(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xF30;
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
                throw new RuntimeException("a/fl", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fl.wb[n2] = n3;
        }
        return wb[n2];
    }

    private static Field w(long l, long l2) {
        int n = fl.u(l, l2);
        Object object = Ib[n];
        if (object instanceof String) {
            String string = Jb[n];
            int n2 = string.indexOf(8);
            Class clazz = fl.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fl.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fl.k(clazz3, string2, clazz2)) != null) {
                    fl.Ib[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fl.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fl.Ib[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fl.v(273608941373524L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void X() {
        long l = fb ^ 0x611D571CFD59L;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().T(0.7, true);
        CryptographicParameterGenerator cryptographicParameterGenerator2 = TemporalMetadataResolver.h.W().T(1.1, true);
        double d2 = this.b() / 4.0;
        double d3 = 8.0;
        Color color = EventDispatchCoordinator1159.y(Color.WHITE, 51);
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        int n = (int)Math.round(systemConfigurationOrchestrator.F());
        int n2 = (int)Math.round(systemConfigurationOrchestrator.V());
        int n3 = (int)Math.round(systemConfigurationOrchestrator.B());
        this.H(cryptographicParameterGenerator, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)12048, (long)(0x2495312F629B46B2L ^ l)), (long)7392449363580706423L, (long)l)), this.G() + d3, this.W() + d2 / 2.0, this.s(Color.WHITE));
        this.H(cryptographicParameterGenerator2, String.valueOf(n), this.G() + d3 + cryptographicParameterGenerator.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)29345, (long)(0x5AD4F9DCB3219B08L ^ l)), (long)7392449363580706423L, (long)l))) + 2.5, this.W() + d2 / 2.0 - 2.5, this.s(Color.WHITE));
        this.f(this.G() + this.w() - 12.0, this.W() + d2 / 2.0 + 1.5, this.E());
        this.H(cryptographicParameterGenerator, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)19338, (long)(0x5B9E98D33708A22AL ^ l)), (long)7392449363580706423L, (long)l)), this.G() + d3, this.W() + d2 + d2 / 2.0, this.s(Color.WHITE));
        this.H(cryptographicParameterGenerator2, String.valueOf(n2), this.G() + d3 + cryptographicParameterGenerator.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)12627, (long)(0x20097B8603B6D8E1L ^ l)), (long)7392449363580706423L, (long)l))) + 2.5, this.W() + d2 + d2 / 2.0 - 2.5, this.s(Color.WHITE));
        this.H(cryptographicParameterGenerator, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)401, (long)(0x77D23F0CB628E83BL ^ l)), (long)7392449363580706423L, (long)l)), this.G() + d3, this.W() + d2 * 2.0 + d2 / 2.0, this.s(Color.WHITE));
        this.H(cryptographicParameterGenerator2, String.valueOf(n3), this.G() + d3 + cryptographicParameterGenerator.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)16529, (long)(0x3C56299C81C22934L ^ l)), (long)7392449363580706423L, (long)l))) + 2.5, this.W() + d2 * 2.0 + d2 / 2.0 - 2.5, this.s(Color.WHITE));
        this.f(this.G() + this.w() - 12.0, this.W() + d2 * 2.0 + d2 / 2.0, this.y());
        ConfigurationManager.r(this.G() + d3, this.W() + d2 + 1.5, this.w() - 15.0, 1.0f, color);
        ConfigurationManager.r(this.G() + d3, this.W() + d2 * 2.0 + 1.5, this.w() - 15.0, 1.0f, color);
        ConfigurationManager.r(this.G() + d3, this.W() + d2 * 3.0 + 1.5, this.w() - 15.0, 1.0f, color);
        this.H(cryptographicParameterGenerator, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)16361, (long)(0x1883A85E11B5D648L ^ l)), (long)7392449363580706423L, (long)l)), this.G() + d3, this.W() + d2 * 3.0 + d2 / 2.0 - 2.5, this.s(Color.WHITE));
        this.H(cryptographicParameterGenerator, this.z(), this.G() + d3 + cryptographicParameterGenerator.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)20579, (long)(0x68098DA775EDB9CFL ^ l)), (long)7392449363580706423L, (long)l))) + 4.0, this.W() + d2 * 3.0 + d2 / 2.0 - 2.5, this.s(fl.M.I));
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fl.u(l, l2);
            object = Ib[n];
            try {
                if (!(object instanceof String)) break block2;
                fl.Ib[n] = clazz = Class.forName(Jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method x(long l, long l2) {
        int n = fl.u(l, l2);
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
                clazz3 = fl.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fl.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fl.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        fl.Ib[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fl.v(273608941373524L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fl.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fl.Ib[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fl.v(273608941373524L, 0L);
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

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fl.f(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private float E() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        float f = systemConfigurationOrchestrator.q() % 360.0f;
        if (f < -180.0f) {
            f += 360.0f;
        }
        if (f > 180.0f) {
            f -= 360.0f;
        }
        return f + 180.0f;
    }

    @Override
    public String A() {
        long l = fb ^ 0x16A01629D85EL;
        return fl.l("\u00ed", (int)fl.f("h", (int)30802, (long)(0x6F4C04583E9034F8L ^ l)), (long)4868450823169866608L, (long)l);
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = fl.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fl.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fl.fb = MultiContainerRegistry.a(-7778042846553876292L, 4554149257737309627L, MethodHandles.lookup().lookupClass()).a(18252195997522L);
                fl.Ib = new Object[5];
                fl.Jb = new String[5];
                fl.T();
                fl.xb = new HashMap<K, V>(13);
                var0 = fl.fb ^ 120847834150173L;
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
                var8_3 = new long[21];
                var5_4 = 0;
                var6_5 = ";\u00aasO\u00d7pT\u00dc\u0089\u00c6\u00fb3\u009b9AE]\u00ca\u00a4\u0090\u00a3VI@\u00f6\u0089\u00c4\f\u0082\u00d4\u00f1\u00b0#\u0000@\u0081\u0091\u009f\u008c\u00b4\u0014\u00bdC\u00ee\u000f\u00bcDx6t\u0018\u00bd\u0096\u0086G$\u0014\u00d9\u00ee\u00c28\u00fe\u00a8>\f\u000eME \u0096&\u0099lis\u00e2bWT\u00feFN\u00a3c\u00acM-\b\u00e4\u0014\u009f\u00bbt\u001c\u009e\u00b1\u0010\u00c1[SL-I\u00d9\u00c1?\b\u00ed_\u00c9\u00a3\u0081v3\u0084\u00103\u00f9\u00c3\u00a6\u0087\f\u00dfc=\u00f9\u001f|J!\u00a4\u00f8\u00f9'b\u009b\u00a6\u009a\u008e\u00c1\u0002\u0086WX\u00bap\u00a9\u000e\u00bc\u00ac\u00d9[";
                var7_6 = ";\u00aasO\u00d7pT\u00dc\u0089\u00c6\u00fb3\u009b9AE]\u00ca\u00a4\u0090\u00a3VI@\u00f6\u0089\u00c4\f\u0082\u00d4\u00f1\u00b0#\u0000@\u0081\u0091\u009f\u008c\u00b4\u0014\u00bdC\u00ee\u000f\u00bcDx6t\u0018\u00bd\u0096\u0086G$\u0014\u00d9\u00ee\u00c28\u00fe\u00a8>\f\u000eME \u0096&\u0099lis\u00e2bWT\u00feFN\u00a3c\u00acM-\b\u00e4\u0014\u009f\u00bbt\u001c\u009e\u00b1\u0010\u00c1[SL-I\u00d9\u00c1?\b\u00ed_\u00c9\u00a3\u0081v3\u0084\u00103\u00f9\u00c3\u00a6\u0087\f\u00dfc=\u00f9\u001f|J!\u00a4\u00f8\u00f9'b\u009b\u00a6\u009a\u008e\u00c1\u0002\u0086WX\u00bap\u00a9\u000e\u00bc\u00ac\u00d9[".length();
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
                    var6_5 = "\u00a8\u00c3\u00d9!0\u00c8\u0014\u00fa3s\u00a1>R\u00fa\u00eeI";
                    var7_6 = "\u00a8\u00c3\u00d9!0\u00c8\u0014\u00fa3s\u00a1>R\u00fa\u00eeI".length();
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
        fl.vb = var8_3;
        fl.wb = new Integer[21];
    }

    private boolean y() {
        boolean bl;
        block5: {
            block4: {
                float f = this.E();
                try {
                    try {
                        if (!(f > 90.0f) || !(f < 270.0f)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw fl.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw fl.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private String z() {
        TransactionProcessor transactionProcessor;
        int n;
        int n2;
        block7: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            n2 = (int)Math.floor(systemConfigurationOrchestrator.F());
            n = (int)Math.floor(systemConfigurationOrchestrator.B());
            try {
                if (GeometryCalculator.C() >= 35) {
                    return ApplicationLifecycleManager.c().X(ReflectionUtilityBroker.t(n2, 0, n)).g();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw fl.a(customSystemException);
            }
            transactionProcessor = ApplicationLifecycleManager.c().n(n2, n);
            DatabaseConnectionPool databaseConnectionPool = ApplicationLifecycleManager.c().B();
            try {
                try {
                    if (transactionProcessor != null && databaseConnectionPool != null) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw fl.a(customSystemException);
                }
                return "";
            }
            catch (CustomSystemException customSystemException) {
                throw fl.a(customSystemException);
            }
        }
        NetworkProtocolAdapter990 networkProtocolAdapter990 = transactionProcessor.r(n2, n, ApplicationLifecycleManager.c().B());
        return networkProtocolAdapter990.g();
    }

    public fl() {
        super(DynamicResourceBroker.class);
    }

    private static void T() {
        Object[] objectArray = Ib;
        Ib[0] = "dX%";
        objectArray[1] = Integer.TYPE;
        fl.Jb[1] = "java/lang/Integer";
        objectArray[2] = "\"\\gXg3)Sv\u0017\u001a+:T\u007f^";
        objectArray[3] = "5-T-zt>\"Eb\u001bz5)A8";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\"\u0013\\\u0002Z:\"\u0011\u0013n\b(O\u0016Z\t\u001b2#\u001f\u0018\u0014\u001bSvM\u0019\u0002\biuD\u001d\u0011c";
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fl.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fl.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
    public double b() {
        try {
            if (this.S()) {
                return 90.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw fl.a(customSystemException);
        }
        return 35.0;
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fl.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == 'a' || c == '\u00aa' || c == 'H') {
                field = fl.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fl.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ed' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean u() {
        boolean bl;
        try {
            if (this.Sy == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw fl.a(customSystemException);
        }
        try {
            bl = this.Sy.r.J() == this.Sy.R;
        }
        catch (CustomSystemException customSystemException) {
            throw fl.a(customSystemException);
        }
        return bl;
    }

    private boolean E() {
        boolean bl;
        block5: {
            block4: {
                float f = this.E();
                try {
                    try {
                        if (!(f > 0.0f) || !(f < 180.0f)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw fl.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw fl.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fl.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fl.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

