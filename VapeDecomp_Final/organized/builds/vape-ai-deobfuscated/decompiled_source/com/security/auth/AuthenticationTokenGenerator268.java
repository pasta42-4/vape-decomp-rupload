/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.security.auth;

import a.Bj;
import a.ec;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.configuration.management.ConfigurationParameterResolver;
import com.data.processing.CollectionFilterProcessor;
import com.exception.system.CustomSystemException;
import com.game.state.GameStateTracker;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.performance.caching.CacheOptimizationStrategy;
import com.runtime.context.DynamicContextBroker;
import com.security.crypto.SymmetricEncryptionProvider;
import com.security.protocol.EncryptionProtocolHandler397;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Collections;
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
public abstract class AuthenticationTokenGenerator268
extends CollectionFilterProcessor {
    private AuthenticationStateTracker p;
    private static final long a;
    private String d;
    private static final Object[] i;
    private NumericFormattingUtility y;
    private static final long[] e;
    private static final String[] j;
    private static String R;
    private static final Map g;
    private NumericFormattingUtility L;
    private static final Integer[] f;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public String w() {
        return this.d;
    }

    private static Field c(long l, long l2) {
        int n = AuthenticationTokenGenerator268.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = AuthenticationTokenGenerator268.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AuthenticationTokenGenerator268.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AuthenticationTokenGenerator268.a(clazz3, string2, clazz2)) != null) {
                    AuthenticationTokenGenerator268.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AuthenticationTokenGenerator268.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AuthenticationTokenGenerator268.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AuthenticationTokenGenerator268.b(232991119657763L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void U(String string) {
        R = string;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AuthenticationTokenGenerator268.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    protected AuthenticationTokenGenerator268(String string) {
        long l = a ^ 0x41EFD78B1804L;
        this.y = NumericFormattingUtility.y(this, (String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)31549, (long)(0x6C420FEEAF0472ADL ^ l)), (long)-6790861334590491193L, (long)l)), (String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)10685, (long)(0x2A505062A14F2024L ^ l)), (long)-6790861334590491193L, (long)l)), "", 1.0, 100.0, 200.0, 1000.0, 1.0);
        this.p = AuthenticationStateTracker.w(this, (String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)23229, (long)(0x7C372CB0FBEBD33EL ^ l)), (long)-6790861334590491193L, (long)l)), false);
        this.L = NumericFormattingUtility.P(this, (String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)26676, (long)(0x536272D7C25A61B3L ^ l)), (long)-6790861334590491193L, (long)l)), (String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)17497, (long)(0x173004E5202CDD4L ^ l)), (long)-6790861334590491193L, (long)l)), "", 1.0, 100.0, 200.0, 1000.0);
        this.d = string;
        this.p.w().add(this.L);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/BE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static AuthenticationTokenGenerator268 I(String string) {
        long l = a ^ 0x533FEEC9FF21L;
        try {
            if (string.startsWith((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)2479, (long)(0x70103CE83055E715L ^ l)), (long)5109071306323563234L, (long)l)))) {
                return new SymmetricEncryptionProvider();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenGenerator268.a(customSystemException);
        }
        try {
            if (string.startsWith((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)17032, (long)(0x3775846E0DADAC37L ^ l)), (long)5109071306323563234L, (long)l)))) {
                return new CacheOptimizationStrategy(string);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenGenerator268.a(customSystemException);
        }
        return new GameStateTracker(string);
    }

    public JsonObject h() {
        long l = a ^ 0x67C5DB5EB07BL;
        JsonObject jsonObject = new JsonObject();
        String string = (String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)6235, (long)(0x6364EA694D3A39BCL ^ l)), (long)701758565724577208L, (long)l)) + ec.A(this.d);
        jsonObject.addProperty((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)14126, (long)(0x44DA2D45966616F6L ^ l)), (long)701758565724577208L, (long)l)), string);
        jsonObject.add((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)19294, (long)(0x611508FD8FA36ABFL ^ l)), (long)701758565724577208L, (long)l)), (JsonElement)this.w());
        jsonObject.add((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)27867, (long)(0x77C358111E6D4D31L ^ l)), (long)701758565724577208L, (long)l)), (JsonElement)this.y.k(false));
        jsonObject.add((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)18248, (long)(0x7858AD645DD466B9L ^ l)), (long)701758565724577208L, (long)l)), (JsonElement)this.p.k(false));
        jsonObject.add((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)20250, (long)(0x2DED2B25B68A6EECL ^ l)), (long)701758565724577208L, (long)l)), (JsonElement)this.L.k(false));
        return jsonObject;
    }

    public AuthenticationStateTracker C() {
        return this.p;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AuthenticationTokenGenerator268.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                AuthenticationTokenGenerator268.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public NumericFormattingUtility m() {
        return this.L;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2844;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/BE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AuthenticationTokenGenerator268.f[n2] = n3;
        }
        return f[n2];
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = i[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 54;
                break;
            }
            case 1: {
                n3 = 25;
                break;
            }
            case 2: {
                n3 = 43;
                break;
            }
            case 3: {
                n3 = 16;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 21;
                break;
            }
            case 6: {
                n3 = 56;
                break;
            }
            case 7: {
                n3 = 5;
                break;
            }
            case 8: {
                n3 = 31;
                break;
            }
            case 9: {
                n3 = 32;
                break;
            }
            case 10: {
                n3 = 60;
                break;
            }
            case 11: {
                n3 = 38;
                break;
            }
            case 12: {
                n3 = 12;
                break;
            }
            case 13: {
                n3 = 14;
                break;
            }
            case 14: {
                n3 = 17;
                break;
            }
            case 15: {
                n3 = 42;
                break;
            }
            case 16: {
                n3 = 39;
                break;
            }
            case 17: {
                n3 = 44;
                break;
            }
            case 18: {
                n3 = 53;
                break;
            }
            case 19: {
                n3 = 50;
                break;
            }
            case 20: {
                n3 = 37;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 49;
                break;
            }
            case 23: {
                n3 = 30;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 61;
                break;
            }
            case 26: {
                n3 = 63;
                break;
            }
            case 27: {
                n3 = 15;
                break;
            }
            case 28: {
                n3 = 48;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 30: {
                n3 = 62;
                break;
            }
            case 31: {
                n3 = 52;
                break;
            }
            case 32: {
                n3 = 8;
                break;
            }
            case 33: {
                n3 = 27;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 18;
                break;
            }
            case 36: {
                n3 = 0;
                break;
            }
            case 37: {
                n3 = 19;
                break;
            }
            case 38: {
                n3 = 58;
                break;
            }
            case 39: {
                n3 = 46;
                break;
            }
            case 40: {
                n3 = 3;
                break;
            }
            case 41: {
                n3 = 55;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 51;
                break;
            }
            case 44: {
                n3 = 45;
                break;
            }
            case 45: {
                n3 = 28;
                break;
            }
            case 46: {
                n3 = 34;
                break;
            }
            case 47: {
                n3 = 1;
                break;
            }
            case 48: {
                n3 = 41;
                break;
            }
            case 49: {
                n3 = 9;
                break;
            }
            case 50: {
                n3 = 13;
                break;
            }
            case 51: {
                n3 = 20;
                break;
            }
            case 52: {
                n3 = 24;
                break;
            }
            case 53: {
                n3 = 2;
                break;
            }
            case 54: {
                n3 = 47;
                break;
            }
            case 55: {
                n3 = 6;
                break;
            }
            case 56: {
                n3 = 4;
                break;
            }
            case 57: {
                n3 = 40;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 35;
                break;
            }
            case 60: {
                n3 = 36;
                break;
            }
            case 61: {
                n3 = 29;
                break;
            }
            case 62: {
                n3 = 26;
                break;
            }
            default: {
                n3 = 59;
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
        AuthenticationTokenGenerator268.j[n4] = new String(cArray);
        return n4;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AuthenticationTokenGenerator268.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AuthenticationTokenGenerator268.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public AuthenticationTokenGenerator268 Q(JsonObject jsonObject) {
        block29: {
            long l;
            block28: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                block23: {
                                    l = a ^ 0x6067A3876CCAL;
                                    try {
                                        this.d = EncryptionProtocolHandler397.G(jsonObject, (String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)810, (long)(0x5B97F8486AA17E62L ^ l)), (long)-3095061387689328375L, (long)l)));
                                        if (jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)29125, (long)(0x5DECBEEA87B38C89L ^ l)), (long)-3095061387689328375L, (long)l))) == null || !jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)8193, (long)(0x25E0BE6996995D44L ^ l)), (long)-3095061387689328375L, (long)l))).isJsonArray()) break block23;
                                    }
                                    catch (Exception exception) {
                                        throw AuthenticationTokenGenerator268.a(exception);
                                    }
                                    try {
                                        this.q(jsonObject.getAsJsonArray((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)13202, (long)(0x1C08FA7575554ECBL ^ l)), (long)-3095061387689328375L, (long)l))), false);
                                    }
                                    catch (Exception exception) {}
                                    break block25;
                                }
                                try {
                                    try {
                                        if (jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)31110, (long)(0x19CB94F7F3BD84DEL ^ l)), (long)-3095061387689328375L, (long)l))) == null || jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)32322, (long)(0x8D0EC73AF2C0306L ^ l)), (long)-3095061387689328375L, (long)l))).isJsonNull()) break block24;
                                    }
                                    catch (Exception exception) {
                                        throw AuthenticationTokenGenerator268.a(exception);
                                    }
                                    this.E(Collections.singletonList(jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)15411, (long)(0x3F4E85AA7E38C166L ^ l)), (long)-3095061387689328375L, (long)l))).getAsInt()));
                                    break block25;
                                }
                                catch (Exception exception) {
                                    throw AuthenticationTokenGenerator268.a(exception);
                                }
                            }
                            try {
                                if (jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)22089, (long)(0x105F39FE436A2B08L ^ l)), (long)-3095061387689328375L, (long)l))) == null || jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)29620, (long)(0x6F48646A67CD0EFBL ^ l)), (long)-3095061387689328375L, (long)l))).isJsonNull()) break block26;
                            }
                            catch (Exception exception) {
                                throw AuthenticationTokenGenerator268.a(exception);
                            }
                            int n = jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)24436, (long)(0x69ABEEE61CAD2228L ^ l)), (long)-3095061387689328375L, (long)l))).getAsInt();
                            if (n > 0) {
                                n = ConfigurationParameterResolver.S(n);
                            }
                            this.E(Collections.singletonList(n));
                            break block25;
                        }
                        this.Z().clear();
                    }
                    try {
                        try {
                            if (jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)7303, (long)(0x79D996D8C76161D4L ^ l)), (long)-3095061387689328375L, (long)l))) == null || jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)906, (long)(0x48AF79D9F04CFEC1L ^ l)), (long)-3095061387689328375L, (long)l))).isJsonNull()) break block27;
                        }
                        catch (Exception exception) {
                            throw AuthenticationTokenGenerator268.a(exception);
                        }
                        this.p.C(jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)18532, (long)(0x4557FE2B26AEB52AL ^ l)), (long)-3095061387689328375L, (long)l))).getAsJsonObject());
                    }
                    catch (Exception exception) {
                        throw AuthenticationTokenGenerator268.a(exception);
                    }
                }
                try {
                    try {
                        if (jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)146, (long)(0x731F57661703FDC8L ^ l)), (long)-3095061387689328375L, (long)l))) == null || jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)10039, (long)(0xAF295FB76695A65L ^ l)), (long)-3095061387689328375L, (long)l))).isJsonNull()) break block28;
                    }
                    catch (Exception exception) {
                        throw AuthenticationTokenGenerator268.a(exception);
                    }
                    this.y.C(jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)24252, (long)(0x26FDDE462BAD23E3L ^ l)), (long)-3095061387689328375L, (long)l))).getAsJsonObject());
                }
                catch (Exception exception) {
                    throw AuthenticationTokenGenerator268.a(exception);
                }
            }
            try {
                try {
                    if (jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)26492, (long)(0x1845B19A01979A36L ^ l)), (long)-3095061387689328375L, (long)l))) == null || jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)5799, (long)(0xDB0592A6AF66BFAL ^ l)), (long)-3095061387689328375L, (long)l))).isJsonNull()) break block29;
                }
                catch (Exception exception) {
                    throw AuthenticationTokenGenerator268.a(exception);
                }
                this.L.C(jsonObject.get((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)25785, (long)(0x269A255C9A3319FBL ^ l)), (long)-3095061387689328375L, (long)l))).getAsJsonObject());
            }
            catch (Exception exception) {
                throw AuthenticationTokenGenerator268.a(exception);
            }
        }
        return this;
    }

    @Override
    public boolean v() {
        return false;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AuthenticationTokenGenerator268.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AuthenticationTokenGenerator268.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/BE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void G() {
    }

    @Override
    public String D() {
        long l = a ^ 0x7946317B414EL;
        return String.format((String)((Object)AuthenticationTokenGenerator268.b("\u00d0", (int)AuthenticationTokenGenerator268.a("i", (int)4943, (long)(0x5F43F27B78A438DL ^ l)), (long)-538115072116118387L, (long)l)), DynamicContextBroker.u, DynamicContextBroker.u, this.t(), DynamicContextBroker.u, DynamicContextBroker.u, this.w());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AuthenticationTokenGenerator268.a = MultiContainerRegistry.a(-1999242669623947347L, 7433701062949242331L, MethodHandles.lookup().lookupClass()).a(242967472548052L);
                AuthenticationTokenGenerator268.i = new Object[5];
                AuthenticationTokenGenerator268.j = new String[5];
                AuthenticationTokenGenerator268.a();
                AuthenticationTokenGenerator268.g = new HashMap<K, V>(13);
                AuthenticationTokenGenerator268.U("capcLc");
                var0 = AuthenticationTokenGenerator268.a ^ 78515951257073L;
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
                var8_3 = new long[33];
                var5_4 = 0;
                var6_5 = "\u00fbLp\u00a5\u00a8\u0098\u0006T[\u00ab\u00e3\u00e0F,'\u00e4VH\u00f6\u00ee\u0085X=\u0083\u0001\u00fe\u0000\u0097\u0080g\u00df\u009f\u00cb'\u00b2\u00a0\u00d7\u001a\u00bbC\u00c6\u009b{!\u009bF\u00a3\u0012@6\u008e\u0087c\u00d9\n\u00f4\u00eb\u00fe\u00ff\u00d9\u008aI\u00e8\u00ec\u008e\n\u00de\u000f\u00df\u0098\u00bf\u001f\u0006\u00ed\u001b(\u00b3\u009ea\u008aN\u0080\u0099/\u00a9Y\u00cf\u0004\u00bcC\u00d9zL?\u00a6\u007f\u00cat\u00e0\u0090\u008b\u00ad\u0088|\u00ac f\u008e}\u00a1\u00e0\u00b4\u009dM-\u00c2\u00f6\u009e0X\u00f7il$\u00ca\u009b_\u00ee\npa\u00d7\u00e8\u00b7$-M3;@\u0091\u0018\u00e7\u0081\u00d6\u0007\n\u00e2\u00c2m\u00c3\u00d7\u008eq\u00e0\t\u00ffi\u00bb\u0083*\u00b6\u00fe\u00d3\u00dct\u00e9\u00a9\u00b4c\u00f1\u00fe\u00c2\u00ac=\u0012\u0012\u0002q\u00e0g\u00c9\u0007\u00d2\u001d\u00c75Y\u00a0nx\t\u008f\u001f\u00bf\u0097\u0000\u00c1\u00f3E\u008f5'!\u00a8\u001f\u0094\u00a4\u00f8\u00baVZ\u00ee\u00c8\u00f3$\u00e6<FB\u00e1\u009al\u00b7\u00e4\u00a2\u00f3\u008f\u0097\u00b2\u00cc\u00dfM\u0088\u00fb\u0010`\u0007\u0080\u00b7>\u009d\u001a\u00f4k-MW";
                var7_6 = "\u00fbLp\u00a5\u00a8\u0098\u0006T[\u00ab\u00e3\u00e0F,'\u00e4VH\u00f6\u00ee\u0085X=\u0083\u0001\u00fe\u0000\u0097\u0080g\u00df\u009f\u00cb'\u00b2\u00a0\u00d7\u001a\u00bbC\u00c6\u009b{!\u009bF\u00a3\u0012@6\u008e\u0087c\u00d9\n\u00f4\u00eb\u00fe\u00ff\u00d9\u008aI\u00e8\u00ec\u008e\n\u00de\u000f\u00df\u0098\u00bf\u001f\u0006\u00ed\u001b(\u00b3\u009ea\u008aN\u0080\u0099/\u00a9Y\u00cf\u0004\u00bcC\u00d9zL?\u00a6\u007f\u00cat\u00e0\u0090\u008b\u00ad\u0088|\u00ac f\u008e}\u00a1\u00e0\u00b4\u009dM-\u00c2\u00f6\u009e0X\u00f7il$\u00ca\u009b_\u00ee\npa\u00d7\u00e8\u00b7$-M3;@\u0091\u0018\u00e7\u0081\u00d6\u0007\n\u00e2\u00c2m\u00c3\u00d7\u008eq\u00e0\t\u00ffi\u00bb\u0083*\u00b6\u00fe\u00d3\u00dct\u00e9\u00a9\u00b4c\u00f1\u00fe\u00c2\u00ac=\u0012\u0012\u0002q\u00e0g\u00c9\u0007\u00d2\u001d\u00c75Y\u00a0nx\t\u008f\u001f\u00bf\u0097\u0000\u00c1\u00f3E\u008f5'!\u00a8\u001f\u0094\u00a4\u00f8\u00baVZ\u00ee\u00c8\u00f3$\u00e6<FB\u00e1\u009al\u00b7\u00e4\u00a2\u00f3\u008f\u0097\u00b2\u00cc\u00dfM\u0088\u00fb\u0010`\u0007\u0080\u00b7>\u009d\u001a\u00f4k-MW".length();
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
                    var6_5 = "\u00d7\u00c4\u00cb\u00ac,8\u00cbfb\u00d5u5\u00b9\\~;";
                    var7_6 = "\u00d7\u00c4\u00cb\u00ac,8\u00cbfb\u00d5u5\u00b9\\~;".length();
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
        AuthenticationTokenGenerator268.e = var8_3;
        AuthenticationTokenGenerator268.f = new Integer[33];
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "\u000b\u007fF";
        objectArray[1] = Integer.TYPE;
        AuthenticationTokenGenerator268.j[1] = "java/lang/Integer";
        objectArray[2] = "0|[i-?;sJ&P'(tCo";
        objectArray[3] = "\u000e>YxPg\u00051H71i\u000e:Lm";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0011Gx<\b\"E\u001bj]\u0011=/\\{4\u0005?\u0011]|mz|\u0015M}>\u0000~IBe]";
    }

    public abstract Bj K();

    private static Method d(long l, long l2) {
        int n = AuthenticationTokenGenerator268.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = AuthenticationTokenGenerator268.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AuthenticationTokenGenerator268.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AuthenticationTokenGenerator268.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AuthenticationTokenGenerator268.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AuthenticationTokenGenerator268.b(232991119657763L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AuthenticationTokenGenerator268.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AuthenticationTokenGenerator268.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AuthenticationTokenGenerator268.b(232991119657763L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'c' || c == '\u00fb' || c == 'J' || c == '\u00a3') {
                field = AuthenticationTokenGenerator268.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'c' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AuthenticationTokenGenerator268.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    public NumericFormattingUtility F() {
        return this.y;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AuthenticationTokenGenerator268.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static String v() {
        return R;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AuthenticationTokenGenerator268.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AuthenticationTokenGenerator268.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

