/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 */
package a;

import a.DA;
import a.NU;
import a.Nn;
import a.SE;
import a._z;
import a.cJ;
import a.d8;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class el {
    private NU k;
    private final String v = "https://user.auth.xboxlive.com/user/authenticate";
    private static final long a;
    private static final Object[] e;
    private static final Map d;
    private static final String[] f;
    private final String J = "https://login.live.com/oauth20_authorize.srf?client_id=000000004C12AE6F&redirect_uri=https://login.live.com/oauth20_desktop.srf&scope=service::user.auth.xboxlive.com::MBI_SSL&display=touch&response_type=token&locale=en";
    private static final Integer[] c;
    private final String W = "https://api.minecraftservices.com/authentication/login_with_xbox";
    private final String r = "https://xsts.auth.xboxlive.com/xsts/authorize";
    private static String[] N;
    private static final long[] b;

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = el.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = el.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = el.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = el.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (f[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 62;
                break;
            }
            case 1: {
                n4 = 49;
                break;
            }
            case 2: {
                n4 = 31;
                break;
            }
            case 3: {
                n4 = 10;
                break;
            }
            case 4: {
                n4 = 30;
                break;
            }
            case 5: {
                n4 = 46;
                break;
            }
            case 6: {
                n4 = 54;
                break;
            }
            case 7: {
                n4 = 33;
                break;
            }
            case 8: {
                n4 = 14;
                break;
            }
            case 9: {
                n4 = 13;
                break;
            }
            case 10: {
                n4 = 7;
                break;
            }
            case 11: {
                n4 = 58;
                break;
            }
            case 12: {
                n4 = 34;
                break;
            }
            case 13: {
                n4 = 61;
                break;
            }
            case 14: {
                n4 = 32;
                break;
            }
            case 15: {
                n4 = 6;
                break;
            }
            case 16: {
                n4 = 35;
                break;
            }
            case 17: {
                n4 = 47;
                break;
            }
            case 18: {
                n4 = 52;
                break;
            }
            case 19: {
                n4 = 38;
                break;
            }
            case 20: {
                n4 = 19;
                break;
            }
            case 21: {
                n4 = 36;
                break;
            }
            case 22: {
                n4 = 3;
                break;
            }
            case 23: {
                n4 = 9;
                break;
            }
            case 24: {
                n4 = 21;
                break;
            }
            case 25: {
                n4 = 51;
                break;
            }
            case 26: {
                n4 = 0;
                break;
            }
            case 27: {
                n4 = 24;
                break;
            }
            case 28: {
                n4 = 27;
                break;
            }
            case 29: {
                n4 = 2;
                break;
            }
            case 30: {
                n4 = 11;
                break;
            }
            case 31: {
                n4 = 44;
                break;
            }
            case 32: {
                n4 = 40;
                break;
            }
            case 33: {
                n4 = 43;
                break;
            }
            case 34: {
                n4 = 48;
                break;
            }
            case 35: {
                n4 = 18;
                break;
            }
            case 36: {
                n4 = 59;
                break;
            }
            case 37: {
                n4 = 22;
                break;
            }
            case 38: {
                n4 = 16;
                break;
            }
            case 39: {
                n4 = 56;
                break;
            }
            case 40: {
                n4 = 57;
                break;
            }
            case 41: {
                n4 = 53;
                break;
            }
            case 42: {
                n4 = 8;
                break;
            }
            case 43: {
                n4 = 41;
                break;
            }
            case 44: {
                n4 = 37;
                break;
            }
            case 45: {
                n4 = 12;
                break;
            }
            case 46: {
                n4 = 29;
                break;
            }
            case 47: {
                n4 = 60;
                break;
            }
            case 48: {
                n4 = 5;
                break;
            }
            case 49: {
                n4 = 55;
                break;
            }
            case 50: {
                n4 = 4;
                break;
            }
            case 51: {
                n4 = 45;
                break;
            }
            case 52: {
                n4 = 17;
                break;
            }
            case 53: {
                n4 = 20;
                break;
            }
            case 54: {
                n4 = 28;
                break;
            }
            case 55: {
                n4 = 23;
                break;
            }
            case 56: {
                n4 = 25;
                break;
            }
            case 57: {
                n4 = 15;
                break;
            }
            case 58: {
                n4 = 39;
                break;
            }
            case 59: {
                n4 = 63;
                break;
            }
            case 60: {
                n4 = 26;
                break;
            }
            case 61: {
                n4 = 42;
                break;
            }
            case 62: {
                n4 = 1;
                break;
            }
            default: {
                n4 = 50;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        el.f[n5] = new String(cArray);
        return n5;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/el" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private String V(String string) throws IOException {
        long l10 = a ^ 0x4222FBF68994L;
        CallSite callSite = el.b("\u00d1", (int)el.a("t", (int)22122, (long)(0x303A157D75D45495L ^ l10)), (long)774914691777788169L, (long)l10);
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty((String)((Object)el.b("\u00d1", (int)el.a("t", (int)5817, (long)(0x3A9E2160BDB21432L ^ l10)), (long)774914691777788169L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)15302, (long)(0x627CDDE3F07CB933L ^ l10)), (long)774914691777788169L, (long)l10)));
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((JsonElement)new JsonPrimitive(string));
        jsonObject2.add((String)((Object)el.b("\u00d1", (int)el.a("t", (int)30645, (long)(0x50730F91167EF537L ^ l10)), (long)774914691777788169L, (long)l10)), (JsonElement)jsonArray);
        jsonObject.add((String)((Object)el.b("\u00d1", (int)el.a("t", (int)25569, (long)(0x5EBFED8BCEA7E123L ^ l10)), (long)774914691777788169L, (long)l10)), (JsonElement)jsonObject2);
        jsonObject.addProperty((String)((Object)el.b("\u00d1", (int)el.a("t", (int)10314, (long)(0x72390C517DF2A89L ^ l10)), (long)774914691777788169L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)31701, (long)(0x6756130705BC7915L ^ l10)), (long)774914691777788169L, (long)l10)));
        jsonObject.addProperty((String)((Object)el.b("\u00d1", (int)el.a("t", (int)26941, (long)(0x15BD3EB95787EBDEL ^ l10)), (long)774914691777788169L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)18978, (long)(0x13122ACE1486C8ADL ^ l10)), (long)774914691777788169L, (long)l10)));
        cJ cJ2 = new cJ((String)((Object)callSite), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)24925, (long)(0x5B45E067F74EE38DL ^ l10)), (long)774914691777788169L, (long)l10))).O((String)((Object)el.b("\u00d1", (int)el.a("t", (int)4283, (long)(0x487C22F56E66123BL ^ l10)), (long)774914691777788169L, (long)l10))).s(el.b("\u00d1", (int)el.a("t", (int)11405, (long)(0x1560644825572E4BL ^ l10)), (long)774914691777788169L, (long)l10), el.b("\u00d1", (int)el.a("t", (int)16191, (long)(0x39F3220BEDDA3DF4L ^ l10)), (long)774914691777788169L, (long)l10)).F(jsonObject.toString());
        JsonObject jsonObject3 = cJ2.M();
        try {
            if (cJ2.t().getResponseCode() != 200) {
                return null;
            }
        }
        catch (IOException iOException) {
            throw el.a(iOException);
        }
        return jsonObject3.get((String)((Object)el.b("\u00d1", (int)el.a("t", (int)13124, (long)(0x32ECA85AD42F31D4L ^ l10)), (long)774914691777788169L, (long)l10))).getAsString();
    }

    public static String[] C() {
        return N;
    }

    private String[] r(String string) throws IOException {
        long l10 = a ^ 0x3987CB533CF0L;
        CallSite callSite = el.b("\u00d1", (int)el.a("t", (int)12159, (long)(0x2F3D9DCD844018FAL ^ l10)), (long)-4637168938688394131L, (long)l10);
        cJ cJ2 = new cJ((String)((Object)callSite), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)1862, (long)(0x2A0A0F5F19F9B0D9L ^ l10)), (long)-4637168938688394131L, (long)l10))).s(el.b("\u00d1", (int)el.a("t", (int)4095, (long)(0x29C60415321A3871L ^ l10)), (long)-4637168938688394131L, (long)l10), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)1242, (long)(0x42E3FA70DE86B352L ^ l10)), (long)-4637168938688394131L, (long)l10)) + string);
        try {
            if (cJ2.t().getResponseCode() != 200) {
                return null;
            }
        }
        catch (IOException iOException) {
            throw el.a(iOException);
        }
        JsonObject jsonObject = cJ2.M();
        String string2 = jsonObject.get((String)((Object)el.b("\u00d1", (int)el.a("t", (int)6529, (long)(0x44FCA76160F9AE1CL ^ l10)), (long)-4637168938688394131L, (long)l10))).getAsString();
        String string3 = jsonObject.get((String)((Object)el.b("\u00d1", (int)el.a("t", (int)10835, (long)(0x3BD1E8EA9B5C9DC5L ^ l10)), (long)-4637168938688394131L, (long)l10))).getAsString();
        return new String[]{string2, string3};
    }

    public el(NU nU) {
        long l10 = a ^ 0x39DA56EC6737L;
        this.J = el.b("\u00d1", (int)el.a("t", (int)27858, (long)(0x15F575BFFC0680AAL ^ l10)), (long)-1989897007845632086L, (long)l10);
        this.v = el.b("\u00d1", (int)el.a("t", (int)7916, (long)(0x187E60B627B8F2DBL ^ l10)), (long)-1989897007845632086L, (long)l10);
        this.r = el.b("\u00d1", (int)el.a("t", (int)31101, (long)(0x74BEF9871BDC1506L ^ l10)), (long)-1989897007845632086L, (long)l10);
        this.W = el.b("\u00d1", (int)el.a("t", (int)20331, (long)(0x9505EA79FA35EL ^ l10)), (long)-1989897007845632086L, (long)l10);
        this.k = nU;
        CookieHandler.setDefault(new CookieManager());
        TrustManager[] trustManagerArray = new TrustManager[]{new _z(this)};
        try {
            SSLContext sSLContext = SSLContext.getInstance((String)((Object)el.b("\u00d1", (int)el.a("t", (int)20579, (long)(0x565E9E7C20E93C28L ^ l10)), (long)-1989897007845632086L, (long)l10)));
            sSLContext.init(null, trustManagerArray, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/el" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = el.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private String d(String string, String string2) throws IOException {
        long l10 = a ^ 0x330CF6F86DFEL;
        CallSite callSite = el.b("\u00d1", (int)el.a("t", (int)26470, (long)(0x325A7C683CE481C3L ^ l10)), (long)-1248766068564189853L, (long)l10);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty((String)((Object)el.b("\u00d1", (int)el.a("t", (int)30713, (long)(0x52AD758A3E70115EL ^ l10)), (long)-1248766068564189853L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)8588, (long)(0x2152F1AF67F9C718L ^ l10)), (long)-1248766068564189853L, (long)l10)) + string + (String)((Object)el.b("\u00d1", (int)el.a("t", (int)12563, (long)(0x7C03975CA2EED7F4L ^ l10)), (long)-1248766068564189853L, (long)l10)) + string2);
        cJ cJ2 = new cJ((String)((Object)callSite), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)32093, (long)(0x575A9564612E1BE9L ^ l10)), (long)-1248766068564189853L, (long)l10))).O((String)((Object)el.b("\u00d1", (int)el.a("t", (int)564, (long)(0x75D1371E50C7E4BCL ^ l10)), (long)-1248766068564189853L, (long)l10))).s(el.b("\u00d1", (int)el.a("t", (int)22867, (long)(0x32A552B26344BFB0L ^ l10)), (long)-1248766068564189853L, (long)l10), el.b("\u00d1", (int)el.a("t", (int)11240, (long)(0x2D530A4E63074D74L ^ l10)), (long)-1248766068564189853L, (long)l10)).F(jsonObject.toString());
        JsonObject jsonObject2 = cJ2.M();
        try {
            if (cJ2.t().getResponseCode() != 200) {
                return null;
            }
        }
        catch (IOException iOException) {
            throw el.a(iOException);
        }
        return jsonObject2.get((String)((Object)el.b("\u00d1", (int)el.a("t", (int)27974, (long)(0x4C588FBA29348BD0L ^ l10)), (long)-1248766068564189853L, (long)l10))).getAsString();
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = el.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                el.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x81A;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/el", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            el.c[n3] = n4;
        }
        return c[n3];
    }

    private static Field c(long l10, long l11) {
        int n2 = el.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = el.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = el.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = el.a(clazz3, string2, clazz2)) != null) {
                    el.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = el.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        el.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = el.b(215641791331134L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private Nn D(String string) throws IOException {
        long l10 = a ^ 0x19595887B8C6L;
        CallSite callSite = el.b("\u00d1", (int)el.a("t", (int)23724, (long)(0x38376F998D96F64L ^ l10)), (long)4292871308302370907L, (long)l10);
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty((String)((Object)el.b("\u00d1", (int)el.a("t", (int)9864, (long)(0x65DC4C72E79F9548L ^ l10)), (long)4292871308302370907L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)1857, (long)(0x7096F1D9B7BD34C6L ^ l10)), (long)4292871308302370907L, (long)l10)));
        jsonObject2.addProperty((String)((Object)el.b("\u00d1", (int)el.a("t", (int)11737, (long)(0x3E0A469A76CC9E6FL ^ l10)), (long)4292871308302370907L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)11485, (long)(0x565356057381F14L ^ l10)), (long)4292871308302370907L, (long)l10)));
        jsonObject2.addProperty((String)((Object)el.b("\u00d1", (int)el.a("t", (int)26458, (long)(0x75C2EED433515495L ^ l10)), (long)4292871308302370907L, (long)l10)), string);
        jsonObject.add((String)((Object)el.b("\u00d1", (int)el.a("t", (int)15518, (long)(0x6865C3D9850E0F5BL ^ l10)), (long)4292871308302370907L, (long)l10)), (JsonElement)jsonObject2);
        jsonObject.addProperty((String)((Object)el.b("\u00d1", (int)el.a("t", (int)10201, (long)(0x640B6B57EBB21454L ^ l10)), (long)4292871308302370907L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)22635, (long)(0x130774991EB5EBB8L ^ l10)), (long)4292871308302370907L, (long)l10)));
        jsonObject.addProperty((String)((Object)el.b("\u00d1", (int)el.a("t", (int)1187, (long)(0x43509BEA66073764L ^ l10)), (long)4292871308302370907L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)8483, (long)(0x7DADF77C12DF92A5L ^ l10)), (long)4292871308302370907L, (long)l10)));
        cJ cJ2 = new cJ((String)((Object)callSite), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)12445, (long)(0x222BAE53194D833CL ^ l10)), (long)4292871308302370907L, (long)l10))).O((String)((Object)el.b("\u00d1", (int)el.a("t", (int)9049, (long)(0x1161DA7BD0C210DDL ^ l10)), (long)4292871308302370907L, (long)l10))).s(el.b("\u00d1", (int)el.a("t", (int)726, (long)(0x15F083DD0007317CL ^ l10)), (long)4292871308302370907L, (long)l10), el.b("\u00d1", (int)el.a("t", (int)11524, (long)(0x2BC06B4EB8E9EDEL ^ l10)), (long)4292871308302370907L, (long)l10)).F(jsonObject.toString());
        JsonObject jsonObject3 = cJ2.M();
        try {
            if (cJ2.t().getResponseCode() != 200) {
                return null;
            }
        }
        catch (IOException iOException) {
            throw el.a(iOException);
        }
        return new Nn(jsonObject3.getAsJsonObject((String)((Object)el.b("\u00d1", (int)el.a("t", (int)16143, (long)(0x48BEB14B43EF8CBBL ^ l10)), (long)4292871308302370907L, (long)l10))).getAsJsonArray((String)((Object)el.b("\u00d1", (int)el.a("t", (int)8803, (long)(0xA3EFB2F599211D1L ^ l10)), (long)4292871308302370907L, (long)l10))).get(0).getAsJsonObject().get((String)((Object)el.b("\u00d1", (int)el.a("t", (int)23332, (long)(0x5ADFE143A2DCE8ACL ^ l10)), (long)4292871308302370907L, (long)l10))).getAsString(), jsonObject3.get((String)((Object)el.b("\u00d1", (int)el.a("t", (int)8061, (long)(0x3C82C3369CAAACB6L ^ l10)), (long)4292871308302370907L, (long)l10))).getAsString());
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "g\u001c>";
        objectArray[1] = Integer.TYPE;
        el.f[1] = "java/lang/Integer";
        objectArray[2] = "f\u0018\u0018Uh)m\u0017\t\u001a\u00151~\u0010\u0000S";
        objectArray[3] = "'(\u001d%\u0011k,'\fjpe',\b0";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\"G\nl3\u001a{G\u001c\u001c%[DT\u0004}\u007f_'\u001e\u0018aN\u0019:B\u0005|7\\{\u0015\u001e\u001c";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                el.a = d8.a(3739987785520483188L, -1859375836548594811L, MethodHandles.lookup().lookupClass()).a(96801727755539L);
                el.e = new Object[5];
                el.f = new String[5];
                el.a();
                el.d = new HashMap<K, V>(13);
                el.x(null);
                var0 = el.a ^ 9592592155961L;
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
                var8_3 = new long[92];
                var5_4 = 0;
                var6_5 = "\u00c6R\u00c0\u0019\u00a6\u0090\u00ddy\u00e7Hh\u00a4'\u0087\u00d2\u007f\u00f0\u00f1\\[\u00aa\u00f7\u0007_/\u00cb\u00fa\u0088\u00a1Oc\u0001\u00db\u0080\u00efFf\u00fe5\u0011\u009b\u00f2#\u00da\u00f5Y5\u0092=\u00d4#\u00e4\u00b8|\u0091\u00e7s\u0091\u00ff\u00ad\b\u00bc!\u00d2&\u0003\u00ae\u00c5\u0018*2\u001d\u00df]n\u008bJ\u0017\u00c6\u00af:z\u008d\u0093\u00c3\u00a9 \u0085^=\u00f4\u00c4\u00d9\u00d1\u00c4\u009a\u0010;5\u00fe8\u00a6\u00f8\u00cc\"\u00f6\u00ac\u0001\u0006\u009c\n\u00b6\u00d1\u001d\u00efw\u001f\u0099\u00e7\u0013\u0098c\u00a1\u00cb\u00b1m\u00f1\u0080\u00cb\u00cf\u00edK\u00e9)\u00cdN\u00a8\u00f7%\u00ac\u00bd\u00caY\u00c9\u00fa\nN\u00e9\u0005\u0093\u00bf\u00a7<?r\u00b8ZVc\u00ae3s\u00b1'Q]\u00f2\u00f5\u00be\f\u0000[n8Q5'\u0090g\f\u00f9\u0086\u0080\u00c1\u008f\u0099\u008a\u0007\u00ca\f\u001f\u00ac\u00bc\u008d\u00f6\u00b6\u00e5\u00ef\u0095Y/V\u00804\u00cb|2zr\u00b5\u00a0\u00c8\u00a0[\u0085\u00bd\u00aeK\u0016\\\u00ac\u0085\u00det\u00fc\u00c3.\u0081 D\u00bcm\u00eb=\u00b0c%\u00ab\u0015\u0002\u009d\u00a5\u00bc\u00ae\u0019\u00ad\u0098\u000b\u0082\u00d4t\u00d6\u00d3\u0080S\u001eY\u00c6\u00c5j@W\u00e9\u00c9\u00b6\u00ba\u0014\u0017\u007f\u0006\u0011\u00d0\u008bPD\u0095\u00c6\u00cb\u0006\u001f\u00c09\u0002|X\u00b2\u009f\u00b0\u00c6\u00d3\u00fem\u0000s4\u008eE\u00c1(d\u00f3\u008c)%\u0092\u00b3\u0083'\u000500E\u00b4C\u00e5\u00a4~\u00c8#\u00b7\u00d8ir\u0089\u001c\u00f5\u00b8-\u0010\u00a4\u0087\u00b6n,\n\u00c8\u00f1@ ;\u00f7\u00c4\u00d6Z\r.dk\u0092\u008a\t\u0003\u00b6\u00c5\u009a\u00d2L( %\u0002\u00dfg\u0097r\u00b0{Q\u008b\u00c9\u00ee\u001e\u001e\u0089X\u00ab\u008c$\u0084\u000f\u00b8\u0006\u00b3\u00cc\u00a2\u00c5\u00bd\u00ba\u0002(\u00ff\u00d8\u0094\u0099\u000f\u0096xY\u0006u]F\u00cf\u00db\u00cb{\u008b\u0015s>T\u0011\u00c9\u00cd\u007f2\u00ecS\u00d7\u00b1\u0019\u00c7\u00e8/6\u001eK\u00b66!\u00da\u00c2\u0081p\u001e!\u00db\u00bc\u00ba\u0003\u00ab\u00ff\u00d5\u00a3\u009e\u00ad=mz!\\\u00d6\u00c4\u00afa\u00d8\\\u00ec\u009d2\u00ea\u0098M\u00f5!97d\u00e1\u0016\u00c9(\u00b3v\u00d8q\u00ba\u0099\u009a\u00ff\u0018C#\u000bk\u00b4\u00b3\u00b7?\u00f0\u001e+}\"\u00a5\r\u001c\u00cd\u00b6K\u00b6\u009a[\u001b\u0084l\u00a1\u0089\u00a3\u00b9\u00b8\u00faRI\u0000\u00f4\u00dfX\u00a6>n\u0017\u00ea\u00f3\u0014\u00d5\u0001\u00fe\n-\u00ed-'\u00f8%\u00d5\u0012}\u00c2\u0018\u00f9\u00dc\u0089\u00c2\u009b\u009e6\u00c2@\u00d8\u0007\u0099\u00b78\u00c0\u0002\u0000I\u009bZj{\u008e\u00dd\u000fv\u00f8\u00cbL\"\u00bd\u00f1\u0088\u00b1~9\u00fe\u0006i\u0003\u00b1\u00dfeP\u00e9\u00b8=\u00f8\u0002\u00dc\u00d9Q\u00c3\u00043\u00e5A\u00ad\u0087+\u00e1o\u0091\u00f2\u00a2\u00dfr\u00a2x\u0092j\u00b0\u0099\u00f5^.~p\u008c\u000f\u001dU#\u00de\u008a\u00a54g\u00e7\u00e1tT\u008f\u00f6*\u00ad\u00c4\u0085\u00e4\u00dbU\u00869\u00dd\u009ft\u00d1\u008f-U\u00c9L\u00eb\bj\u00e6u\u00f9<\u00aa\u00b5\u00ce\u0090\u0018\u00e3nd\u00ab$\u0089tg\u009cD\u0019\u0019\u0084pM}\u00e2\u00cc\u00a4h'\u00f9\u00c8 \u0015c\u00a3\u00dd\u00c7\u00d5\u00f9\u00d1tWY\u0004\u00c9C=\u00ef\u00f0\u00ea\u00e8\u00ba\u0001\u000e\u00d4\u00ec\u00c5X\u009aYk\u00ae4\u00ff";
                var7_6 = "\u00c6R\u00c0\u0019\u00a6\u0090\u00ddy\u00e7Hh\u00a4'\u0087\u00d2\u007f\u00f0\u00f1\\[\u00aa\u00f7\u0007_/\u00cb\u00fa\u0088\u00a1Oc\u0001\u00db\u0080\u00efFf\u00fe5\u0011\u009b\u00f2#\u00da\u00f5Y5\u0092=\u00d4#\u00e4\u00b8|\u0091\u00e7s\u0091\u00ff\u00ad\b\u00bc!\u00d2&\u0003\u00ae\u00c5\u0018*2\u001d\u00df]n\u008bJ\u0017\u00c6\u00af:z\u008d\u0093\u00c3\u00a9 \u0085^=\u00f4\u00c4\u00d9\u00d1\u00c4\u009a\u0010;5\u00fe8\u00a6\u00f8\u00cc\"\u00f6\u00ac\u0001\u0006\u009c\n\u00b6\u00d1\u001d\u00efw\u001f\u0099\u00e7\u0013\u0098c\u00a1\u00cb\u00b1m\u00f1\u0080\u00cb\u00cf\u00edK\u00e9)\u00cdN\u00a8\u00f7%\u00ac\u00bd\u00caY\u00c9\u00fa\nN\u00e9\u0005\u0093\u00bf\u00a7<?r\u00b8ZVc\u00ae3s\u00b1'Q]\u00f2\u00f5\u00be\f\u0000[n8Q5'\u0090g\f\u00f9\u0086\u0080\u00c1\u008f\u0099\u008a\u0007\u00ca\f\u001f\u00ac\u00bc\u008d\u00f6\u00b6\u00e5\u00ef\u0095Y/V\u00804\u00cb|2zr\u00b5\u00a0\u00c8\u00a0[\u0085\u00bd\u00aeK\u0016\\\u00ac\u0085\u00det\u00fc\u00c3.\u0081 D\u00bcm\u00eb=\u00b0c%\u00ab\u0015\u0002\u009d\u00a5\u00bc\u00ae\u0019\u00ad\u0098\u000b\u0082\u00d4t\u00d6\u00d3\u0080S\u001eY\u00c6\u00c5j@W\u00e9\u00c9\u00b6\u00ba\u0014\u0017\u007f\u0006\u0011\u00d0\u008bPD\u0095\u00c6\u00cb\u0006\u001f\u00c09\u0002|X\u00b2\u009f\u00b0\u00c6\u00d3\u00fem\u0000s4\u008eE\u00c1(d\u00f3\u008c)%\u0092\u00b3\u0083'\u000500E\u00b4C\u00e5\u00a4~\u00c8#\u00b7\u00d8ir\u0089\u001c\u00f5\u00b8-\u0010\u00a4\u0087\u00b6n,\n\u00c8\u00f1@ ;\u00f7\u00c4\u00d6Z\r.dk\u0092\u008a\t\u0003\u00b6\u00c5\u009a\u00d2L( %\u0002\u00dfg\u0097r\u00b0{Q\u008b\u00c9\u00ee\u001e\u001e\u0089X\u00ab\u008c$\u0084\u000f\u00b8\u0006\u00b3\u00cc\u00a2\u00c5\u00bd\u00ba\u0002(\u00ff\u00d8\u0094\u0099\u000f\u0096xY\u0006u]F\u00cf\u00db\u00cb{\u008b\u0015s>T\u0011\u00c9\u00cd\u007f2\u00ecS\u00d7\u00b1\u0019\u00c7\u00e8/6\u001eK\u00b66!\u00da\u00c2\u0081p\u001e!\u00db\u00bc\u00ba\u0003\u00ab\u00ff\u00d5\u00a3\u009e\u00ad=mz!\\\u00d6\u00c4\u00afa\u00d8\\\u00ec\u009d2\u00ea\u0098M\u00f5!97d\u00e1\u0016\u00c9(\u00b3v\u00d8q\u00ba\u0099\u009a\u00ff\u0018C#\u000bk\u00b4\u00b3\u00b7?\u00f0\u001e+}\"\u00a5\r\u001c\u00cd\u00b6K\u00b6\u009a[\u001b\u0084l\u00a1\u0089\u00a3\u00b9\u00b8\u00faRI\u0000\u00f4\u00dfX\u00a6>n\u0017\u00ea\u00f3\u0014\u00d5\u0001\u00fe\n-\u00ed-'\u00f8%\u00d5\u0012}\u00c2\u0018\u00f9\u00dc\u0089\u00c2\u009b\u009e6\u00c2@\u00d8\u0007\u0099\u00b78\u00c0\u0002\u0000I\u009bZj{\u008e\u00dd\u000fv\u00f8\u00cbL\"\u00bd\u00f1\u0088\u00b1~9\u00fe\u0006i\u0003\u00b1\u00dfeP\u00e9\u00b8=\u00f8\u0002\u00dc\u00d9Q\u00c3\u00043\u00e5A\u00ad\u0087+\u00e1o\u0091\u00f2\u00a2\u00dfr\u00a2x\u0092j\u00b0\u0099\u00f5^.~p\u008c\u000f\u001dU#\u00de\u008a\u00a54g\u00e7\u00e1tT\u008f\u00f6*\u00ad\u00c4\u0085\u00e4\u00dbU\u00869\u00dd\u009ft\u00d1\u008f-U\u00c9L\u00eb\bj\u00e6u\u00f9<\u00aa\u00b5\u00ce\u0090\u0018\u00e3nd\u00ab$\u0089tg\u009cD\u0019\u0019\u0084pM}\u00e2\u00cc\u00a4h'\u00f9\u00c8 \u0015c\u00a3\u00dd\u00c7\u00d5\u00f9\u00d1tWY\u0004\u00c9C=\u00ef\u00f0\u00ea\u00e8\u00ba\u0001\u000e\u00d4\u00ec\u00c5X\u009aYk\u00ae4\u00ff".length();
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
                    var6_5 = "L\u009e\u00ee<\u00e2\u00b33]8\u00f0\u0017\u0094HQ]\u00a8";
                    var7_6 = "L\u009e\u00ee<\u00e2\u00b33]8\u00f0\u0017\u0094HQ]\u00a8".length();
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
        el.b = var8_3;
        el.c = new Integer[92];
    }

    private String[] q() throws IOException {
        long l10 = a ^ 0x50AAD9151612L;
        cJ cJ2 = new cJ((String)((Object)el.b("\u00d1", (int)el.a("t", (int)16818, (long)(0x10440187CB245CABL ^ l10)), (long)-7690144551301355889L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)31099, (long)(0x452C041AF34CE409L ^ l10)), (long)-7690144551301355889L, (long)l10)));
        Pattern pattern = Pattern.compile((String)((Object)el.b("\u00d1", (int)el.a("t", (int)17687, (long)(0x46A9F58750CF5861L ^ l10)), (long)-7690144551301355889L, (long)l10)));
        String string = cJ2.p();
        Matcher matcher = pattern.matcher(string);
        String string2 = "";
        if (!matcher.find()) {
            return null;
        }
        string2 = matcher.group(1);
        Pattern pattern2 = Pattern.compile((String)((Object)el.b("\u00d1", (int)el.a("t", (int)27085, (long)(0x5428F3AAF7D674D5L ^ l10)), (long)-7690144551301355889L, (long)l10)));
        Matcher matcher2 = pattern2.matcher(string);
        String string3 = "";
        if (!matcher2.find()) {
            return null;
        }
        string3 = matcher2.group(1);
        String string4 = URLEncoder.encode((String)((Object)el.b("\u00d1", (int)el.a("t", (int)15227, (long)(0x764F0236EC87A639L ^ l10)), (long)-7690144551301355889L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)22476, (long)(0x6BA0B8934822CA84L ^ l10)), (long)-7690144551301355889L, (long)l10))) + (String)((Object)el.b("\u00d1", (int)el.a("t", (int)29660, (long)(0x5D0C69D358D9EE9BL ^ l10)), (long)-7690144551301355889L, (long)l10)) + URLEncoder.encode(this.k.o(), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)12115, (long)(0x7CD12554D9A93244L ^ l10)), (long)-7690144551301355889L, (long)l10))) + (String)((Object)el.b("\u00d1", (int)el.a("t", (int)6950, (long)(0x39A4169264EC867DL ^ l10)), (long)-7690144551301355889L, (long)l10)) + URLEncoder.encode((String)((Object)el.b("\u00d1", (int)el.a("t", (int)24162, (long)(0x6E9CB6CEFEADC368L ^ l10)), (long)-7690144551301355889L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)17135, (long)(0x328AB3358594DF98L ^ l10)), (long)-7690144551301355889L, (long)l10))) + (String)((Object)el.b("\u00d1", (int)el.a("t", (int)32473, (long)(0x5C8A6A2460F4E3A8L ^ l10)), (long)-7690144551301355889L, (long)l10)) + URLEncoder.encode(this.k.o(), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)29199, (long)(0x43E89D0CBA4FEF07L ^ l10)), (long)-7690144551301355889L, (long)l10))) + (String)((Object)el.b("\u00d1", (int)el.a("t", (int)4879, (long)(0x74105AE6081F0E6EL ^ l10)), (long)-7690144551301355889L, (long)l10)) + URLEncoder.encode((String)((Object)el.b("\u00d1", (int)el.a("t", (int)3079, (long)(0x73C85319B83B116AL ^ l10)), (long)-7690144551301355889L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)8093, (long)(0x7463193BA9E502C9L ^ l10)), (long)-7690144551301355889L, (long)l10))) + (String)((Object)el.b("\u00d1", (int)el.a("t", (int)16540, (long)(0x1D107F6DA1D65D89L ^ l10)), (long)-7690144551301355889L, (long)l10)) + URLEncoder.encode(this.k.N(), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)20729, (long)(0x3A02F67F91F3CDBAL ^ l10)), (long)-7690144551301355889L, (long)l10))) + (String)((Object)el.b("\u00d1", (int)el.a("t", (int)297, (long)(0x42AFF7FA2751C55L ^ l10)), (long)-7690144551301355889L, (long)l10)) + URLEncoder.encode((String)((Object)el.b("\u00d1", (int)el.a("t", (int)22117, (long)(0xD659B98917C4B29L ^ l10)), (long)-7690144551301355889L, (long)l10)), (String)((Object)el.b("\u00d1", (int)el.a("t", (int)2501, (long)(0x2241F058FF4414C0L ^ l10)), (long)-7690144551301355889L, (long)l10))) + (String)((Object)el.b("\u00d1", (int)el.a("t", (int)22976, (long)(0x539B5DF88AB3C48FL ^ l10)), (long)-7690144551301355889L, (long)l10)) + URLEncoder.encode(string2, (String)((Object)el.b("\u00d1", (int)el.a("t", (int)3086, (long)(0x572C09B44E5D116DL ^ l10)), (long)-7690144551301355889L, (long)l10)));
        byte[] byArray = string4.toString().getBytes(StandardCharsets.UTF_8);
        cJ cJ3 = new cJ(string3, (String)((Object)el.b("\u00d1", (int)el.a("t", (int)22049, (long)(0x1D6FCECFE8F54B3BL ^ l10)), (long)-7690144551301355889L, (long)l10))).s(el.b("\u00d1", (int)el.a("t", (int)22768, (long)(0x6C6C3931D392C5EEL ^ l10)), (long)-7690144551301355889L, (long)l10), el.b("\u00d1", (int)el.a("t", (int)20442, (long)(0x1288E55192BC5290L ^ l10)), (long)-7690144551301355889L, (long)l10)).s(el.b("\u00d1", (int)el.a("t", (int)15077, (long)(0x3668D5064D6AA79EL ^ l10)), (long)-7690144551301355889L, (long)l10), Integer.toString(byArray.length)).F(string4);
        String string5 = cJ3.p();
        HttpURLConnection httpURLConnection = cJ3.t();
        try {
            if (httpURLConnection.getResponseCode() != 200) {
                return null;
            }
        }
        catch (IOException iOException) {
            throw el.a(iOException);
        }
        try {
            if (string5.contains((CharSequence)((Object)el.b("\u00d1", (int)el.a("t", (int)25945, (long)(0x683DCFC5D9A57832L ^ l10)), (long)-7690144551301355889L, (long)l10)))) {
                throw new IllegalStateException((String)((Object)el.b("\u00d1", (int)el.a("t", (int)14029, (long)(0x58121F365AA8AB8CL ^ l10)), (long)-7690144551301355889L, (long)l10)));
            }
        }
        catch (IOException iOException) {
            throw el.a(iOException);
        }
        try {
            if (string5.contains((CharSequence)((Object)el.b("\u00d1", (int)el.a("t", (int)19579, (long)(0x57E3BAB858385124L ^ l10)), (long)-7690144551301355889L, (long)l10)))) {
                throw new IllegalStateException((String)((Object)el.b("\u00d1", (int)el.a("t", (int)16456, (long)(0x3B0B73B301495D1DL ^ l10)), (long)-7690144551301355889L, (long)l10)));
            }
        }
        catch (IOException iOException) {
            throw el.a(iOException);
        }
        String string6 = httpURLConnection.getURL().toString();
        SE.x((String)((Object)el.b("\u00d1", (int)el.a("t", (int)3219, (long)(0x63585C14933291C4L ^ l10)), (long)-7690144551301355889L, (long)l10)) + string6);
        String string7 = string6.split((String)((Object)el.b("\u00d1", (int)el.a("t", (int)7928, (long)(0x384440ADD94283A9L ^ l10)), (long)-7690144551301355889L, (long)l10)))[1];
        String[] stringArray = string7.split((String)((Object)el.b("\u00d1", (int)el.a("t", (int)19434, (long)(0x18E242E38EA156B0L ^ l10)), (long)-7690144551301355889L, (long)l10)));
        String string8 = null;
        String string9 = null;
        for (String string10 : stringArray) {
            if (string10.contains((CharSequence)((Object)el.b("\u00d1", (int)el.a("t", (int)21428, (long)(0x5037AEA67E024EDBL ^ l10)), (long)-7690144551301355889L, (long)l10)))) {
                string8 = string10.split((String)((Object)el.b("\u00d1", (int)el.a("t", (int)25908, (long)(0x34DD45AC88BF785CL ^ l10)), (long)-7690144551301355889L, (long)l10)))[1];
                continue;
            }
            if (!string10.contains((CharSequence)((Object)el.b("\u00d1", (int)el.a("t", (int)8005, (long)(0xAE2B1F3C65E8249L ^ l10)), (long)-7690144551301355889L, (long)l10)))) continue;
            string9 = string10.split((String)((Object)el.b("\u00d1", (int)el.a("t", (int)28793, (long)(0x55A91615E52ED10L ^ l10)), (long)-7690144551301355889L, (long)l10)))[1];
        }
        return new String[]{string8, string9};
    }

    public DA e() throws IOException {
        String string;
        long l10;
        block19: {
            String[] stringArray;
            block18: {
                l10 = a ^ 0x62720D6AE040L;
                stringArray = this.q();
                try {
                    try {
                        if (stringArray != null && stringArray.length >= 2) break block18;
                    }
                    catch (IOException iOException) {
                        throw el.a(iOException);
                    }
                    return null;
                }
                catch (IOException iOException) {
                    throw el.a(iOException);
                }
            }
            Nn nn = this.D(stringArray[0]);
            try {
                if (nn == null) {
                    return null;
                }
            }
            catch (IOException iOException) {
                throw el.a(iOException);
            }
            String string2 = this.V(nn.x);
            try {
                if (string2 == null) {
                    return null;
                }
            }
            catch (IOException iOException) {
                throw el.a(iOException);
            }
            string = this.d(nn.O, string2);
            try {
                if (string == null) {
                    return null;
                }
            }
            catch (IOException iOException) {
                throw el.a(iOException);
            }
            try {
                if (this.k.A() != null && this.k.B() != null) break block19;
            }
            catch (IOException iOException) {
                throw el.a(iOException);
            }
            String[] stringArray2 = this.r(string);
            try {
                if (stringArray2 == null) {
                    return null;
                }
            }
            catch (IOException iOException) {
                throw el.a(iOException);
            }
            this.k.y(stringArray2[0]);
            this.k.g(stringArray2[1]);
        }
        return DA.s(this.k.B(), this.k.A(), string, (String)((Object)el.b("\u00d1", (int)el.a("t", (int)14885, (long)(0x6F55D4D9BD8A5139L ^ l10)), (long)7139661843533467869L, (long)l10)));
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l10, long l11) {
        int n2 = el.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n2];
                int n4 = string2.indexOf(8);
                clazz3 = el.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = el.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = el.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        el.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = el.b(215641791331134L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = el.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        el.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = el.b(215641791331134L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00cb' || c10 == 'A' || c10 == '\u00fd' || c10 == '\u00e3') {
                field = el.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00cb' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'A' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00fd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = el.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void x(String[] stringArray) {
        N = stringArray;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = el.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(el.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(el.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

