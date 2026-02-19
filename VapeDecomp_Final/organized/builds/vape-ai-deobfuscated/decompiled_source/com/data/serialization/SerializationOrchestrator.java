/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
package com.data.serialization;

import com.collections.management.MultiContainerRegistry;
import com.encryption.core.CryptoExceptionHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.security.ssl.CustomTrustManager;
import com.transaction.monitoring.TransactionStatusTracker;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class SerializationOrchestrator {
    public static final Gson q;
    private static final DateFormat e;
    private static final Object[] f;
    private static final String[] g;
    private static final long a;
    private static final Map d;
    private static final Integer[] c;
    private static final long[] b;
    private static int[] Q;

    @Nullable
    @Contract(value="null -> null")
    public static Date k(@Nullable String string) throws ParseException {
        try {
            if (string == null) {
                return null;
            }
        }
        catch (ParseException parseException) {
            throw SerializationOrchestrator.a(parseException);
        }
        return e.parse(string);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x486A;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/BY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SerializationOrchestrator.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 19;
                break;
            }
            case 1: {
                n3 = 25;
                break;
            }
            case 2: {
                n3 = 55;
                break;
            }
            case 3: {
                n3 = 56;
                break;
            }
            case 4: {
                n3 = 44;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 7: {
                n3 = 30;
                break;
            }
            case 8: {
                n3 = 38;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 48;
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
                n3 = 17;
                break;
            }
            case 14: {
                n3 = 62;
                break;
            }
            case 15: {
                n3 = 24;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 58;
                break;
            }
            case 18: {
                n3 = 46;
                break;
            }
            case 19: {
                n3 = 0;
                break;
            }
            case 20: {
                n3 = 42;
                break;
            }
            case 21: {
                n3 = 61;
                break;
            }
            case 22: {
                n3 = 28;
                break;
            }
            case 23: {
                n3 = 1;
                break;
            }
            case 24: {
                n3 = 5;
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
                n3 = 33;
                break;
            }
            case 28: {
                n3 = 11;
                break;
            }
            case 29: {
                n3 = 41;
                break;
            }
            case 30: {
                n3 = 57;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 54;
                break;
            }
            case 33: {
                n3 = 32;
                break;
            }
            case 34: {
                n3 = 35;
                break;
            }
            case 35: {
                n3 = 26;
                break;
            }
            case 36: {
                n3 = 45;
                break;
            }
            case 37: {
                n3 = 21;
                break;
            }
            case 38: {
                n3 = 9;
                break;
            }
            case 39: {
                n3 = 16;
                break;
            }
            case 40: {
                n3 = 20;
                break;
            }
            case 41: {
                n3 = 49;
                break;
            }
            case 42: {
                n3 = 40;
                break;
            }
            case 43: {
                n3 = 6;
                break;
            }
            case 44: {
                n3 = 3;
                break;
            }
            case 45: {
                n3 = 31;
                break;
            }
            case 46: {
                n3 = 63;
                break;
            }
            case 47: {
                n3 = 18;
                break;
            }
            case 48: {
                n3 = 39;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 47;
                break;
            }
            case 51: {
                n3 = 34;
                break;
            }
            case 52: {
                n3 = 12;
                break;
            }
            case 53: {
                n3 = 60;
                break;
            }
            case 54: {
                n3 = 7;
                break;
            }
            case 55: {
                n3 = 29;
                break;
            }
            case 56: {
                n3 = 2;
                break;
            }
            case 57: {
                n3 = 36;
                break;
            }
            case 58: {
                n3 = 51;
                break;
            }
            case 59: {
                n3 = 37;
                break;
            }
            case 60: {
                n3 = 23;
                break;
            }
            case 61: {
                n3 = 13;
                break;
            }
            case 62: {
                n3 = 10;
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
        SerializationOrchestrator.g[n4] = new String(cArray);
        return n4;
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

    public static <R> R w(String string, Class<R> clazz) throws Exception {
        return (R)SerializationOrchestrator.r(string, arg_0 -> SerializationOrchestrator.lambda$get$1(clazz, arg_0));
    }

    public static <R> TransactionStatusTracker<R> N(String string, Object object, Function<JsonElement, R> function) throws Exception {
        long l = a ^ 0x22391C9C33B9L;
        return TransactionStatusTracker.w(SerializationOrchestrator.r(string, (String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)30300, (long)(0x56268FDBCFF71C8EL ^ l)), (long)-6719623219687807933L, (long)l)), JsonObject.class, object), function);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SerializationOrchestrator.a = MultiContainerRegistry.a(7604886590060666465L, 3121468522068743284L, MethodHandles.lookup().lookupClass()).a(76991821506515L);
                var11 = SerializationOrchestrator.a ^ 16448855772128L;
                SerializationOrchestrator.f = new Object[5];
                SerializationOrchestrator.g = new String[5];
                SerializationOrchestrator.a();
                SerializationOrchestrator.d = new HashMap<K, V>(13);
                SerializationOrchestrator.w(new int[5]);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[14];
                var3_4 = 0;
                var4_5 = "\u00a7\u00cb\u0083\u00dbJ\u00ec\u00f4z\u0089\u00026\u00f0\u00de\u00e5u\u00df\u00c9\u00fe3\u00bfR\u00f7\u00fe\u008f\u0017\u00d6\t\u00d6\u00c9\u0086\u00b0\u00a17\u008d\u00d2r\t\u00be\u00c6\u00ed$:8g\u0084d\u00ffuq\u009e7\u00eb\u00da\u00138\u00eb\u008a\u0014\u00b4\u0004lT]\u00b8\u00b3l\u008c\u00a8:\t\u0099OS\u00ad\u0002~\u00c8\u0012=\u00b5\u0000\u00e0\u00c8\u00ec\u0002V\u00c5\rH\u00e9\u00b1\u00d3\u00ea\u001b\u0014Y";
                var5_6 = "\u00a7\u00cb\u0083\u00dbJ\u00ec\u00f4z\u0089\u00026\u00f0\u00de\u00e5u\u00df\u00c9\u00fe3\u00bfR\u00f7\u00fe\u008f\u0017\u00d6\t\u00d6\u00c9\u0086\u00b0\u00a17\u008d\u00d2r\t\u00be\u00c6\u00ed$:8g\u0084d\u00ffuq\u009e7\u00eb\u00da\u00138\u00eb\u008a\u0014\u00b4\u0004lT]\u00b8\u00b3l\u008c\u00a8:\t\u0099OS\u00ad\u0002~\u00c8\u0012=\u00b5\u0000\u00e0\u00c8\u00ec\u0002V\u00c5\rH\u00e9\u00b1\u00d3\u00ea\u001b\u0014Y".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "Y\u00b7oz\u00e0\u0003i\u00af\u00a5t\u000f/1L8e";
                    var5_6 = "Y\u00b7oz\u00e0\u0003i\u00af\u00a5t\u000f/1L8e".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        SerializationOrchestrator.b = var6_3;
        SerializationOrchestrator.c = new Integer[14];
        SerializationOrchestrator.q = new GsonBuilder().serializeNulls().create();
        SerializationOrchestrator.e = new SimpleDateFormat((String)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)9523, (long)(6006914995347388338L ^ var11)), (long)1938296632183495706L, (long)var11));
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SerializationOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SerializationOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SerializationOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SerializationOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static <R> R q(String string, Class<R> clazz, Object object) throws Exception {
        long l = a ^ 0x6CB44DFCDDF2L;
        return SerializationOrchestrator.r(string, (String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)8735, (long)(0x4CAC51D383B12688L ^ l)), (long)5545150250436151816L, (long)l)), clazz, object);
    }

    public static void w(int[] nArray) {
        Q = nArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object lambda$request$0(Object object, String string, String string2, Class clazz, HttpURLConnection httpURLConnection) {
        long l = a ^ 0x59401F43F5C6L;
        try {
            block19: {
                byte[] byArray;
                String string3;
                try {
                    string3 = object != null ? q.toJson(object) : null;
                }
                catch (Throwable throwable) {
                    throw SerializationOrchestrator.a(throwable);
                }
                String string4 = string3;
                try {
                    byArray = string4 != null ? string4.getBytes(StandardCharsets.UTF_8) : null;
                }
                catch (Throwable throwable) {
                    throw SerializationOrchestrator.a(throwable);
                }
                byte[] byArray2 = byArray;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod(string);
                if (string4 != null) {
                    DataOutputStream dataOutputStream;
                    block20: {
                        httpURLConnection.setRequestProperty((String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)10660, (long)(0x3352A1C12370502L ^ l)), (long)7259909465184756284L, (long)l)), (String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)3222, (long)(0x560244FACF6EA036L ^ l)), (long)7259909465184756284L, (long)l)));
                        httpURLConnection.setRequestProperty((String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)2342, (long)(0x7D48C5C9EC89A58DL ^ l)), (long)7259909465184756284L, (long)l)), (String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)16345, (long)(0x3077C78275B09378L ^ l)), (long)7259909465184756284L, (long)l)));
                        httpURLConnection.setRequestProperty((String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)32132, (long)(0x2F3B937FE9FC5126L ^ l)), (long)7259909465184756284L, (long)l)), Integer.toString(byArray2.length));
                        dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        Throwable throwable = null;
                        try {
                            dataOutputStream.write(byArray2);
                            if (dataOutputStream == null) break block19;
                            if (throwable == null) break block20;
                        }
                        catch (Throwable throwable5) {
                            try {
                                throwable = throwable5;
                                throw throwable5;
                            }
                            catch (Throwable throwable6) {
                                block21: {
                                    try {
                                        if (dataOutputStream == null) throw throwable6;
                                        if (throwable == null) break block21;
                                    }
                                    catch (Throwable throwable2) {
                                        throw SerializationOrchestrator.a(throwable2);
                                    }
                                    try {
                                        dataOutputStream.close();
                                        throw throwable6;
                                    }
                                    catch (Throwable throwable8) {
                                        throwable.addSuppressed(throwable8);
                                        throw throwable6;
                                    }
                                }
                                dataOutputStream.close();
                                throw throwable6;
                            }
                        }
                        try {
                            dataOutputStream.close();
                        }
                        catch (Throwable throwable4) {
                            throwable.addSuppressed(throwable4);
                        }
                        break block19;
                    }
                    dataOutputStream.close();
                }
            }
            int n = httpURLConnection.getResponseCode();
            try {
                if (n == 200) return q.fromJson((Reader)new InputStreamReader(httpURLConnection.getInputStream()), clazz);
                throw new CryptoExceptionHandler(string2, string, n);
            }
            catch (Throwable throwable) {
                throw SerializationOrchestrator.a(throwable);
            }
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static Method d(long l, long l2) {
        int n = SerializationOrchestrator.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = SerializationOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SerializationOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SerializationOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SerializationOrchestrator.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SerializationOrchestrator.b(246545320249980L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SerializationOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SerializationOrchestrator.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SerializationOrchestrator.b(246545320249980L, 0L);
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SerializationOrchestrator.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                SerializationOrchestrator.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/BY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "|\u001b0";
        objectArray[1] = Integer.TYPE;
        SerializationOrchestrator.g[1] = "java/lang/Integer";
        objectArray[2] = "!\t\\R7\u0018*\u0006M\u001dJ\u00009\u0001DT";
        objectArray[3] = "oS\u0019\u000f<\u0016d\\\b@]\u0018oW\f\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "m\u001a\r,Q4b[TF\u0004$\u000fZQ(\u00116u@RzofnA\u0001'\u0015:jD\u0014F";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f9' || c == '\u00da' || c == 'Q' || c == 'z') {
                field = SerializationOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SerializationOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static <R> R a(String string, Class<R> clazz) throws Exception {
        long l = a ^ 0x4516DA747B6FL;
        return SerializationOrchestrator.r(string, (String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)19719, (long)(0x6A5D9C5E62396F00L ^ l)), (long)-1555574313319207787L, (long)l)), clazz, null);
    }

    public static <R> TransactionStatusTracker<R> H(String string, Function<JsonElement, R> function) throws Exception {
        return TransactionStatusTracker.w(SerializationOrchestrator.w(string, JsonObject.class), function);
    }

    public static int[] M() {
        return Q;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SerializationOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static <R> R r(String string, String string2, Class<R> clazz, @Nullable Object object) throws Exception {
        return (R)SerializationOrchestrator.r(string, arg_0 -> SerializationOrchestrator.lambda$request$0(object, string2, string, clazz, arg_0));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/BY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static <T> T r(String string, Function<HttpURLConnection, T> function) throws Exception {
        long l = a ^ 0xC7AAC61698EL;
        try {
            TrustManager[] trustManagerArray = new TrustManager[]{new CustomTrustManager()};
            SSLContext sSLContext = SSLContext.getInstance((String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)10488, (long)(0x5A221ADD8FAC981FL ^ l)), (long)-538122933236138380L, (long)l)));
            sSLContext.init(null, trustManagerArray, new SecureRandom());
            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
            try {
                httpURLConnection.setRequestProperty((String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)9173, (long)(0x1E760BA6B6CD9334L ^ l)), (long)-538122933236138380L, (long)l)), (String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)14042, (long)(0x43EAE70D14B80638L ^ l)), (long)-538122933236138380L, (long)l)));
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection)httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                }
            }
            catch (Throwable throwable) {
                throw SerializationOrchestrator.a(throwable);
            }
            return function.apply(httpURLConnection);
        }
        catch (Throwable throwable) {
            throw new Exception(throwable);
        }
    }

    private static Object lambda$get$1(Class clazz, HttpURLConnection httpURLConnection) {
        try {
            return q.fromJson((Reader)new InputStreamReader(httpURLConnection.getInputStream()), clazz);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    private static Field c(long l, long l2) {
        int n = SerializationOrchestrator.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = SerializationOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SerializationOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SerializationOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    SerializationOrchestrator.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SerializationOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SerializationOrchestrator.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SerializationOrchestrator.b(246545320249980L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SerializationOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static <R> TransactionStatusTracker<R> U(String string, Object object, Function<JsonElement, R> function) throws Exception {
        long l = a ^ 0x56C63139DC53L;
        return TransactionStatusTracker.w(SerializationOrchestrator.r(string, (String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)31584, (long)(0x15043DDC7B187E59L ^ l)), (long)5572481848542448553L, (long)l)), JsonObject.class, object), function);
    }

    public static <R> R F(String string, Class<R> clazz, Object object) throws Exception {
        long l = a ^ 0x5C7F103F4771L;
        return SerializationOrchestrator.r(string, (String)((Object)SerializationOrchestrator.b("\u00d9", (int)SerializationOrchestrator.a("w", (int)4601, (long)(0x4D7A598A89218FE6L ^ l)), (long)-2992813413208829813L, (long)l)), clazz, object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SerializationOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(SerializationOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

