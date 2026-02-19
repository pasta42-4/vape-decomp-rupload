/*
 * Decompiled with CFR 0.152.
 */
package com.network.transmission;

import com.codec.translation.EncodingProtocolTranslator;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.network.connection.NetworkConnectionEstablisher;
import com.runtime.mediation.RuntimeContextMediator;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TransmissionProtocolHandler
extends RuntimeContextMediator {
    private static final Map xb;
    private static final Integer[] wb;
    private static final String[] Jb;
    private static final Object[] Ib;
    private static final long fb;
    private EncodingProtocolTranslator Kl = (EncodingProtocolTranslator)this.t();
    private static final long[] vb;

    private static void T() {
        Object[] objectArray = Ib;
        Ib[0] = "\u0004@8";
        objectArray[1] = Integer.TYPE;
        TransmissionProtocolHandler.Jb[1] = "java/lang/Integer";
        objectArray[2] = "\u0003\u0016UuL\u001b\b\u0019D:1\u0003\u001b\u001eMs";
        objectArray[3] = "_\u001c\u0004\u000eX0T\u0013\u0015A9>_\u0018\u0011\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "o\u001cZM\u007f$s\u0014G-,c\fF\u0003\u0013})0\u0011[S'\u00185\u0005@R}%e\u000e]\u0010G";
    }

    @Override
    public void V() {
        try {
            if (this.E()) {
                this.Y();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransmissionProtocolHandler.a(customSystemException);
        }
        this.P();
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

    private String c() {
        return LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ROOT).toLowerCase();
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int f(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xB97;
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
                throw new RuntimeException("a/wc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TransmissionProtocolHandler.wb[n2] = n3;
        }
        return wb[n2];
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ea' || c == 'k' || c == 'K' || c == '\u00ee') {
                field = TransmissionProtocolHandler.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransmissionProtocolHandler.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'O' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Method method = TransmissionProtocolHandler.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransmissionProtocolHandler.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private String j() {
        long l = fb ^ 0x2C3FF4042086L;
        int n = LocalTime.now().getMinute();
        String string = String.valueOf(n);
        if (n < 10) {
            string = (String)((Object)TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)1132, (long)(0x5FD6A754FBF87BC9L ^ l)), (long)-850807999848982229L, (long)l)) + string;
        }
        return string;
    }

    private static CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double b() {
        try {
            if (this.E()) {
                return 32.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransmissionProtocolHandler.a(customSystemException);
        }
        return 65.0;
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = TransmissionProtocolHandler.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransmissionProtocolHandler.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TransmissionProtocolHandler.f(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method x(long l, long l2) {
        int n = TransmissionProtocolHandler.u(l, l2);
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
                clazz3 = TransmissionProtocolHandler.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransmissionProtocolHandler.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransmissionProtocolHandler.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransmissionProtocolHandler.Ib[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransmissionProtocolHandler.v(263486683454107L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransmissionProtocolHandler.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransmissionProtocolHandler.Ib[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransmissionProtocolHandler.v(263486683454107L, 0L);
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

    private String Y() {
        int n;
        long l;
        block6: {
            block7: {
                l = fb ^ 0x39A3FC21E69L;
                n = LocalTime.now().getHour();
                try {
                    try {
                        if (this.Kl.h.s().booleanValue()) break block6;
                        if (n <= 12) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransmissionProtocolHandler.a(customSystemException);
                    }
                    n -= 12;
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransmissionProtocolHandler.a(customSystemException);
                }
            }
            if (n == 0) {
                n = 12;
            }
        }
        String string = String.valueOf(n);
        if (n < 10) {
            string = (String)((Object)TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)11752, (long)(0x428F3EFEC40A6CA0L ^ l)), (long)-3828485176829745212L, (long)l)) + string;
        }
        return string;
    }

    @Override
    public String A() {
        long l = fb ^ 0x72B6047C9727L;
        return TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)14279, (long)(0xB1EDE516117FC9L ^ l)), (long)4868404564007087754L, (long)l);
    }

    public TransmissionProtocolHandler() {
        super(EncodingProtocolTranslator.class);
    }

    private void Y() {
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().T(3.0, true);
        CryptographicParameterGenerator cryptographicParameterGenerator2 = TemporalMetadataResolver.h.W().T(1.0, true);
        cryptographicParameterGenerator.R(this.Y(), this.G() - cryptographicParameterGenerator.D(this.Y()) + 30.0, this.W() + 2.0, this.A());
        ConfigurationManager.T(this.G() + 34.0, this.W() + 15.0, 2.0, 0.0, this.A());
        cryptographicParameterGenerator.R(this.j(), this.G() + 39.0, this.W() + 2.0, this.A());
        double d2 = this.G() + 39.0;
        if (!this.Kl.h.s().booleanValue()) {
            cryptographicParameterGenerator2.R(this.o(), d2 += cryptographicParameterGenerator.D(this.j()), this.W() + 18.0, this.A());
        }
        if (this.Kl.G.s().booleanValue()) {
            d2 = this.G() + this.w() - cryptographicParameterGenerator2.D(this.k(true)) - 6.0;
            String string = this.k(true);
            double d3 = cryptographicParameterGenerator2.D(string);
            String string2 = this.c().toLowerCase();
            double d4 = cryptographicParameterGenerator2.D(string2);
            double d5 = d2 + d3 - d4;
            cryptographicParameterGenerator2.R(string, d2, this.W() + 7.0, this.A());
            cryptographicParameterGenerator2.R(string2, d5, this.W() + 15.0, this.A());
        }
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
                n3 = 43;
                break;
            }
            case 1: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 14;
                break;
            }
            case 4: {
                n3 = 25;
                break;
            }
            case 5: {
                n3 = 12;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 7: {
                n3 = 40;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 22;
                break;
            }
            case 10: {
                n3 = 28;
                break;
            }
            case 11: {
                n3 = 35;
                break;
            }
            case 12: {
                n3 = 48;
                break;
            }
            case 13: {
                n3 = 52;
                break;
            }
            case 14: {
                n3 = 11;
                break;
            }
            case 15: {
                n3 = 34;
                break;
            }
            case 16: {
                n3 = 51;
                break;
            }
            case 17: {
                n3 = 5;
                break;
            }
            case 18: {
                n3 = 23;
                break;
            }
            case 19: {
                n3 = 37;
                break;
            }
            case 20: {
                n3 = 45;
                break;
            }
            case 21: {
                n3 = 44;
                break;
            }
            case 22: {
                n3 = 33;
                break;
            }
            case 23: {
                n3 = 21;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 57;
                break;
            }
            case 26: {
                n3 = 31;
                break;
            }
            case 27: {
                n3 = 26;
                break;
            }
            case 28: {
                n3 = 39;
                break;
            }
            case 29: {
                n3 = 2;
                break;
            }
            case 30: {
                n3 = 4;
                break;
            }
            case 31: {
                n3 = 58;
                break;
            }
            case 32: {
                n3 = 1;
                break;
            }
            case 33: {
                n3 = 59;
                break;
            }
            case 34: {
                n3 = 13;
                break;
            }
            case 35: {
                n3 = 20;
                break;
            }
            case 36: {
                n3 = 10;
                break;
            }
            case 37: {
                n3 = 7;
                break;
            }
            case 38: {
                n3 = 30;
                break;
            }
            case 39: {
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 18;
                break;
            }
            case 41: {
                n3 = 17;
                break;
            }
            case 42: {
                n3 = 55;
                break;
            }
            case 43: {
                n3 = 19;
                break;
            }
            case 44: {
                n3 = 36;
                break;
            }
            case 45: {
                n3 = 53;
                break;
            }
            case 46: {
                n3 = 3;
                break;
            }
            case 47: {
                n3 = 9;
                break;
            }
            case 48: {
                n3 = 47;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 27;
                break;
            }
            case 51: {
                n3 = 16;
                break;
            }
            case 52: {
                n3 = 62;
                break;
            }
            case 53: {
                n3 = 42;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 61;
                break;
            }
            case 56: {
                n3 = 56;
                break;
            }
            case 57: {
                n3 = 24;
                break;
            }
            case 58: {
                n3 = 60;
                break;
            }
            case 59: {
                n3 = 63;
                break;
            }
            case 60: {
                n3 = 29;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 15;
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
        TransmissionProtocolHandler.Jb[n4] = new String(cArray);
        return n4;
    }

    private String o() {
        long l = fb ^ 0x128E40F6DD97L;
        int n = LocalTime.now().getHour();
        try {
            if (n >= 12) {
                return TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)27832, (long)(0xC0725C253756E0AL ^ l)), (long)657644363450557498L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransmissionProtocolHandler.a(customSystemException);
        }
        return TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)32203, (long)(0x353AE4AFD78B7F7EL ^ l)), (long)657644363450557498L, (long)l);
    }

    private boolean E() {
        long l = fb ^ 0x7C21DF305C5FL;
        try {
            if (this.Kl == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransmissionProtocolHandler.a(customSystemException);
        }
        return ((NetworkConnectionEstablisher)this.Kl.b.J()).O().equalsIgnoreCase((String)((Object)TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)26224, (long)(0x39E1598C6EF5650BL ^ l)), (long)-8581606066569828878L, (long)l)));
    }

    private void P() {
        float f = (float)(this.G() + this.w());
        float f2 = (float)(this.W() + this.b());
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().T(2.8, true);
        CryptographicParameterGenerator cryptographicParameterGenerator2 = TemporalMetadataResolver.h.W().T(0.85, true);
        this.p();
        float f3 = (float)(this.G() + this.w() / 2.0);
        float f4 = (float)(this.W() + this.b() / 2.0);
        float f5 = (float)(Math.cos((double)((float)(Integer.parseInt(this.Y()) * 30) + Float.parseFloat(this.j()) / 2.0f) * Math.PI / 180.0 - 1.5707963267948966) * 26.0 + (double)f3);
        float f6 = (float)(Math.sin((double)((float)(Integer.parseInt(this.Y()) * 30) + Float.parseFloat(this.j()) / 2.0f) * Math.PI / 180.0 - 1.5707963267948966) * 26.0 + (double)f4);
        try {
            ConfigurationManager.g(f3, f4, f5, f6, 1.8f, this.s(TransmissionProtocolHandler.M.u));
            cryptographicParameterGenerator.R(this.Y(), this.G() - cryptographicParameterGenerator.D(this.Y()) + 28.0, this.W() + 5.0, this.A());
            cryptographicParameterGenerator.R(this.j(), (double)f - cryptographicParameterGenerator.D(this.j()) - 5.0, (double)f2 - cryptographicParameterGenerator.B(this.j()) - 8.0, this.A());
            cryptographicParameterGenerator2.R(this.c(), this.G() + 10.0, (double)f2 - cryptographicParameterGenerator2.B(this.c()) - 16.0, this.A());
            cryptographicParameterGenerator2.R(this.k(false), this.G() + 10.0, (double)f2 - cryptographicParameterGenerator2.B(this.k(false)) - 8.0, this.A());
            if (!this.Kl.h.s().booleanValue()) {
                cryptographicParameterGenerator2.R(this.o(), (double)f - cryptographicParameterGenerator2.D(this.o()) - 5.0, this.W() + 5.0, this.A());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransmissionProtocolHandler.a(customSystemException);
        }
    }

    private String k(boolean bl) {
        Object object;
        long l;
        block4: {
            block3: {
                l = fb ^ 0x66DC2F49D311L;
                String string = ZonedDateTime.now().getZone().getId();
                try {
                    if (string == null || !string.contains((CharSequence)((Object)TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)23, (long)(0x450CA4C864818C20L ^ l)), (long)551154676678863548L, (long)l)))) break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransmissionProtocolHandler.a(customSystemException);
                }
                object = TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)14661, (long)(0x3FC943EDD605357CL ^ l)), (long)551154676678863548L, (long)l);
                break block4;
            }
            object = TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)31898, (long)(0x2A85CE85A9B1F0ACL ^ l)), (long)551154676678863548L, (long)l);
        }
        if (!bl) {
            object = ((String)object).replace((CharSequence)((Object)TransmissionProtocolHandler.l("\u00a3", (int)TransmissionProtocolHandler.f("t", (int)31982, (long)(0x6FD5684896E370DFL ^ l)), (long)551154676678863548L, (long)l)), "");
        }
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern((String)object));
    }

    private void p() {
        float f = (float)(this.G() + this.w() / 2.0);
        float f2 = (float)(this.W() + this.b() / 2.0);
        int n = 0;
        while (true) {
            block21: {
                block22: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n >= 24) break;
                                                            if (n == 8) break block21;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw TransmissionProtocolHandler.a(customSystemException);
                                                        }
                                                        if (n == 9) break block21;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw TransmissionProtocolHandler.a(customSystemException);
                                                    }
                                                    if (n == 10) break block21;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw TransmissionProtocolHandler.a(customSystemException);
                                                }
                                                if (n == 14) break block21;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw TransmissionProtocolHandler.a(customSystemException);
                                            }
                                            if (n == 15) break block21;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw TransmissionProtocolHandler.a(customSystemException);
                                        }
                                        if (n == 16) break block21;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw TransmissionProtocolHandler.a(customSystemException);
                                    }
                                    if (n == 20) break block21;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw TransmissionProtocolHandler.a(customSystemException);
                                }
                                if (n == 21) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransmissionProtocolHandler.a(customSystemException);
                            }
                            if (n != 22) break block22;
                            break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransmissionProtocolHandler.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransmissionProtocolHandler.a(customSystemException);
                    }
                }
                float f3 = (float)(Math.cos((double)(n * 15) * Math.PI / 180.0 - 1.5707963267948966) * 25.0 + (double)f);
                float f4 = (float)(Math.sin((double)(n * 15) * Math.PI / 180.0 - 1.5707963267948966) * 25.0 + (double)f2);
                ConfigurationManager.T((double)(f3 - 1.0f), (double)f4, 0.5, 1.0, this.A());
            }
            ++n;
        }
    }

    private static Field w(long l, long l2) {
        int n = TransmissionProtocolHandler.u(l, l2);
        Object object = Ib[n];
        if (object instanceof String) {
            String string = Jb[n];
            int n2 = string.indexOf(8);
            Class clazz = TransmissionProtocolHandler.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransmissionProtocolHandler.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransmissionProtocolHandler.k(clazz3, string2, clazz2)) != null) {
                    TransmissionProtocolHandler.Ib[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransmissionProtocolHandler.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransmissionProtocolHandler.Ib[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransmissionProtocolHandler.v(263486683454107L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransmissionProtocolHandler.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double w() {
        if (this.E()) {
            double d2 = 70.0;
            if (this.Kl.G.s().booleanValue()) {
                d2 += 24.0;
            }
            if (!this.Kl.h.s().booleanValue()) {
                d2 += 12.0;
            }
            return d2;
        }
        return 70.0;
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TransmissionProtocolHandler.u(l, l2);
            object = Ib[n];
            try {
                if (!(object instanceof String)) break block2;
                TransmissionProtocolHandler.Ib[n] = clazz = Class.forName(Jb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TransmissionProtocolHandler.fb = MultiContainerRegistry.a(-1458347645397179592L, 8869686586692849854L, MethodHandles.lookup().lookupClass()).a(186945618946166L);
                TransmissionProtocolHandler.Ib = new Object[5];
                TransmissionProtocolHandler.Jb = new String[5];
                TransmissionProtocolHandler.T();
                TransmissionProtocolHandler.xb = new HashMap<K, V>(13);
                var0 = TransmissionProtocolHandler.fb ^ 33745250025013L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u00b6\u00fb\u00d0\u0092\u00fdp[\u00d5rU\u0018\u00c6PMNm\u00ab\u00c6\u0086\u0083\u001f=\u00cb\u00a4,:v\u00df\u00d3\u00b5\u0087 `\u00fe'^}\u00d9\u0081\u00da(\u00da\u00da`^X\u00a2m\u00b3\u008e%\u00d28\u009d\u00e3\u00bczZN\u00e3A'\r\u00fa";
                var7_6 = "\u00b6\u00fb\u00d0\u0092\u00fdp[\u00d5rU\u0018\u00c6PMNm\u00ab\u00c6\u0086\u0083\u001f=\u00cb\u00a4,:v\u00df\u00d3\u00b5\u0087 `\u00fe'^}\u00d9\u0081\u00da(\u00da\u00da`^X\u00a2m\u00b3\u008e%\u00d28\u009d\u00e3\u00bczZN\u00e3A'\r\u00fa".length();
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
                    var6_5 = "\u00ad\u00a6\u00a2\u008e\u00b4\u00fa\u00c7\u00c47\u00e0\u00bfQ\u000e:\u0084\u0019";
                    var7_6 = "\u00ad\u00a6\u00a2\u008e\u00b4\u00fa\u00c7\u00c47\u00e0\u00bfQ\u000e:\u0084\u0019".length();
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
        TransmissionProtocolHandler.vb = var8_3;
        TransmissionProtocolHandler.wb = new Integer[10];
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransmissionProtocolHandler.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(TransmissionProtocolHandler.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

