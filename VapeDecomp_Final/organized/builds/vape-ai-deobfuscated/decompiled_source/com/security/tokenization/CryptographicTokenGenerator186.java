/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  org.jetbrains.annotations.Nullable
 */
package com.security.tokenization;

import a.Ry;
import com.collections.management.MultiContainerRegistry;
import com.config.management.ConfigurationParameterManager454;
import com.core.computation.AbstractComputationKernel;
import com.data.archival.TemporalDataArchiver;
import com.data.conversion.TemporalDataTransformer;
import com.data.serialization.SerializationOrchestrator;
import com.data.streaming.DataStreamOrchestrator629;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.identity.management.UniqueIdentifierManager;
import com.identity.service.UniversalIdentificationService;
import com.logging.context.LoggingContextManager;
import com.security.cipher.CipherModeRegistry;
import com.transaction.monitoring.TransactionStatusTracker;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class CryptographicTokenGenerator186 {
    private static final long[] b;
    private static final String[] f;
    private static final Map d;
    private static final Integer[] c;
    private final String Q;
    private static final long a;
    private static final Object[] e;
    private static AbstractComputationKernel[] U;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicTokenGenerator186.a = MultiContainerRegistry.a(-131528493952758418L, 2693065538900364820L, MethodHandles.lookup().lookupClass()).a(2595565480604L);
                CryptographicTokenGenerator186.e = new Object[5];
                CryptographicTokenGenerator186.f = new String[5];
                CryptographicTokenGenerator186.a();
                CryptographicTokenGenerator186.d = new HashMap<K, V>(13);
                CryptographicTokenGenerator186.K(new AbstractComputationKernel[5]);
                var0 = CryptographicTokenGenerator186.a ^ 117823510556481L;
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
                var8_3 = new long[58];
                var5_4 = 0;
                var6_5 = "}4\u00fc\u00ee\u00d6\u00c31\u001b\u00cdv^*\u008e:\u00b0\u0083\u00f6\u00b8\u00dc^U\u00f4\u008d\u00cf\u0094\u00fe\u001fg\u0018\u009fRL\u00e9\u0003\u00d1w\u00cb\u00ca\u00abzZ\b\u009a\u00ac}o{R\u0015\u00ac\u00c0\bEt\u0014\u0018.\u008fjJ\u00e5\u0014_#\u00adX\u0087\u00cd\u00bf)\u00d5\u00b1b\u00bcN\u00c5\u0007t\u00076B\u0086]5\u00a4\u00d2\u00ab\u0093\u00a9\u0018\u00ae\u0001\u000f\u0002\u00f7a\u00d32\u001c\u009eE\u000ej8\u00c2\u00ef^\u0087\u00b8Lu\u008e\u00cf\u00d2s\u00a2\u00f5\u009e\u001fF\u00ae\u00b7g\u00a4U\u0003\u0015.h3\u0004\u0082\u00d9R(\u0001\u0094n\u00cc`\u00b7\u00a5?X\u001d\u00f2\u00f6v\u0099#\u0094\u00f71^\u00c5\u00d0#\u0088\u00db\u00d1\u0019\u0005;\u00ce\u0017\u00ad\u00c0\u00c8l S\u00cb%\u00b5\u00cf\u000e\"\u00f2\u0019&\u001f\u00d5M\u0016x\u0081u\u00e8\u0087]\u00cf\u00eb\u00f3=+\u0002\u00f5X|\u00d6\u00e4K\u00c1\u00a5,\u0016hx\u00b2r\u000f\u00b4\u008c\u00cb\u001f\\K\u0007leO\u00c1wD\u0019D\u00c9\u00c7\u00cfe\u00f8\u00ab\u00b8\u00e2\u00ce\u00c9\u0011\u0085\u0093\u00ce+\u0012\u000f\u008b\u0090h\u00f7\u00d1?\u00eak\u00943]`\u00e4^/\u0095\u00c7T\u00d6\u00d4fz\u00ed\u00f6\u008a\u001b\u00d4\t-\u00eb\u0012\u00f0\u00ad\u00bb\u00a9\u0089a\u00ef]\u00fd\u00b3\u00d7d\u00d1\u00f7\u00c1\u0098n\riy\u0099\u00f9\u00dbA\u0016\u00baP\u009fB`\u00a0\u00d0cJ\fN:\u00fc,$#\u0003\u0094\u00fb\u00b9\u00110\u00f0*(\u00db\u00b1\u00c9\u0013\u00b7D9\u00cb\u00ba\u00ec6\u0003K\u0087K\u008a\u00d9]\u00d5!H\u00c7\u00aeqp\u00aa\u008c\u00af\u008e\u00e7]6\u00a9\u00a9B\u00dd\u001a\u0013\u009e\u0081\u008d\u00d4\u0088>\u0092?\u0091\u00feT\u00b0\u0095\u00f4\u0005\u00ce\u0004s\u0007_\u0092Mp\u00ca\u00ca\u00dc\u00e7\u00ca\u00d5\u00a6\u00c8\u001b\u00e5\u00ff\u008c\u009f?\u00e3\u0097\u00ba/@\u00fa\u0088\u00e4f;n\u00a5\u00b4Eu\u00af\u00a5\u00b9\\*\u00a8P\u0093\u00d8c\u0089\u0017\b\u00b5\u00bc\u009b\u00a7\u00c7Um\u00f1\u009f\u00c2\u00c3im\u00ed\u00ce]\u00d5\u0096\u008e\u00e2\u00af";
                var7_6 = "}4\u00fc\u00ee\u00d6\u00c31\u001b\u00cdv^*\u008e:\u00b0\u0083\u00f6\u00b8\u00dc^U\u00f4\u008d\u00cf\u0094\u00fe\u001fg\u0018\u009fRL\u00e9\u0003\u00d1w\u00cb\u00ca\u00abzZ\b\u009a\u00ac}o{R\u0015\u00ac\u00c0\bEt\u0014\u0018.\u008fjJ\u00e5\u0014_#\u00adX\u0087\u00cd\u00bf)\u00d5\u00b1b\u00bcN\u00c5\u0007t\u00076B\u0086]5\u00a4\u00d2\u00ab\u0093\u00a9\u0018\u00ae\u0001\u000f\u0002\u00f7a\u00d32\u001c\u009eE\u000ej8\u00c2\u00ef^\u0087\u00b8Lu\u008e\u00cf\u00d2s\u00a2\u00f5\u009e\u001fF\u00ae\u00b7g\u00a4U\u0003\u0015.h3\u0004\u0082\u00d9R(\u0001\u0094n\u00cc`\u00b7\u00a5?X\u001d\u00f2\u00f6v\u0099#\u0094\u00f71^\u00c5\u00d0#\u0088\u00db\u00d1\u0019\u0005;\u00ce\u0017\u00ad\u00c0\u00c8l S\u00cb%\u00b5\u00cf\u000e\"\u00f2\u0019&\u001f\u00d5M\u0016x\u0081u\u00e8\u0087]\u00cf\u00eb\u00f3=+\u0002\u00f5X|\u00d6\u00e4K\u00c1\u00a5,\u0016hx\u00b2r\u000f\u00b4\u008c\u00cb\u001f\\K\u0007leO\u00c1wD\u0019D\u00c9\u00c7\u00cfe\u00f8\u00ab\u00b8\u00e2\u00ce\u00c9\u0011\u0085\u0093\u00ce+\u0012\u000f\u008b\u0090h\u00f7\u00d1?\u00eak\u00943]`\u00e4^/\u0095\u00c7T\u00d6\u00d4fz\u00ed\u00f6\u008a\u001b\u00d4\t-\u00eb\u0012\u00f0\u00ad\u00bb\u00a9\u0089a\u00ef]\u00fd\u00b3\u00d7d\u00d1\u00f7\u00c1\u0098n\riy\u0099\u00f9\u00dbA\u0016\u00baP\u009fB`\u00a0\u00d0cJ\fN:\u00fc,$#\u0003\u0094\u00fb\u00b9\u00110\u00f0*(\u00db\u00b1\u00c9\u0013\u00b7D9\u00cb\u00ba\u00ec6\u0003K\u0087K\u008a\u00d9]\u00d5!H\u00c7\u00aeqp\u00aa\u008c\u00af\u008e\u00e7]6\u00a9\u00a9B\u00dd\u001a\u0013\u009e\u0081\u008d\u00d4\u0088>\u0092?\u0091\u00feT\u00b0\u0095\u00f4\u0005\u00ce\u0004s\u0007_\u0092Mp\u00ca\u00ca\u00dc\u00e7\u00ca\u00d5\u00a6\u00c8\u001b\u00e5\u00ff\u008c\u009f?\u00e3\u0097\u00ba/@\u00fa\u0088\u00e4f;n\u00a5\u00b4Eu\u00af\u00a5\u00b9\\*\u00a8P\u0093\u00d8c\u0089\u0017\b\u00b5\u00bc\u009b\u00a7\u00c7Um\u00f1\u009f\u00c2\u00c3im\u00ed\u00ce]\u00d5\u0096\u008e\u00e2\u00af".length();
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
                    var6_5 = "m\u00ed\u001d\u008d\u00a6C\u0084\u00fc\u00c1>b\u00cf<\u0088\u00c4\u0018";
                    var7_6 = "m\u00ed\u001d\u008d\u00a6C\u0084\u00fc\u00c1>b\u00cf<\u0088\u00c4\u0018".length();
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
        CryptographicTokenGenerator186.b = var8_3;
        CryptographicTokenGenerator186.c = new Integer[58];
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> s(TemporalDataArchiver temporalDataArchiver) {
        return this.Q(temporalDataArchiver.H());
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> c(long l, List<Long> list) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$markReviewsAsRead$26(l, list, string));
    }

    public CompletableFuture<TransactionStatusTracker<DataStreamOrchestrator629<ConfigurationParameterManager454>>> T(CipherModeRegistry cipherModeRegistry, long l, @Nullable String string, @Nullable List<String> list) {
        String string2 = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$listPublicProfiles$4(list, cipherModeRegistry, l, string, string2));
    }

    public CompletableFuture<TransactionStatusTracker<DataStreamOrchestrator629<TemporalDataTransformer>>> f(long l, long l2) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$listPublicProfileReviews$18(string, l, l2));
    }

    private static List lambda$null$0(JsonElement jsonElement) {
        ArrayList<String> arrayList = new ArrayList<String>();
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        for (JsonElement jsonElement2 : jsonArray) {
            arrayList.add(jsonElement2.getAsString());
        }
        return arrayList;
    }

    private TransactionStatusTracker lambda$createPublicProfile$10(String string, JsonObject jsonObject) {
        long l = a ^ 0x1C3D8DE2678AL;
        try {
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)19850, (long)(0xC27671B1E242365L ^ l)), (long)8049437328965580665L, (long)l)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)951, (long)(0x4D2951737749ED76L ^ l)), (long)8049437328965580665L, (long)l)), jsonObject, CryptographicTokenGenerator186::lambda$null$9);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private TransactionStatusTracker lambda$viewPublicProfileReviews$8(String string, long l, long l2) {
        long l3 = a ^ 0x4E25A77449F7L;
        try {
            return SerializationOrchestrator.H(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)14116, (long)(0x54496D8AF0FA77BCL ^ l3)), (long)4740050163154098436L, (long)l3)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)17488, (long)(0x6BCA0410CE4504F7L ^ l3)), (long)4740050163154098436L, (long)l3)) + l + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)4988, (long)(0x1F5A5377D096D3D0L ^ l3)), (long)4740050163154098436L, (long)l3)) + l2, CryptographicTokenGenerator186::lambda$null$7);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> r(long l, String string) {
        String string2 = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$reportPublicProfileResponse$24(string, string2, l));
    }

    private TransactionStatusTracker lambda$reportPublicProfileResponse$24(String string, String string2, long l) {
        long l2 = a ^ 0xCDEBD0EFDE9L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)29984, (long)(0x5F2CCB875C4A0195L ^ l2)), (long)-732318203091374822L, (long)l2)), string);
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)11865, (long)(0x211BE191CD0ADAFEL ^ l2)), (long)-732318203091374822L, (long)l2)) + string2 + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)30263, (long)(0x785349B98C7C829FL ^ l2)), (long)-732318203091374822L, (long)l2)) + l, jsonObject, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicTokenGenerator186.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private TransactionStatusTracker lambda$updatePublicProfile$15(String string, long l) {
        long l2 = a ^ 0x690498D3125L;
        try {
            return SerializationOrchestrator.H(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)8673, (long)(0x706FD1BC79FE999BL ^ l2)), (long)4114674016209101270L, (long)l2)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)19253, (long)(0x68C20D7BD7EA7372L ^ l2)), (long)4114674016209101270L, (long)l2)) + l + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)1489, (long)(0x74386D2B38BBBDA1L ^ l2)), (long)4114674016209101270L, (long)l2)), UniqueIdentifierManager::x);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static Field c(long l, long l2) {
        int n = CryptographicTokenGenerator186.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicTokenGenerator186.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicTokenGenerator186.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicTokenGenerator186.a(clazz3, string2, clazz2)) != null) {
                    CryptographicTokenGenerator186.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicTokenGenerator186.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicTokenGenerator186.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicTokenGenerator186.b(271076211045380L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private TransactionStatusTracker lambda$deletePublicProfile$11(String string, long l) {
        long l2 = a ^ 0x17C7F8DE7CCAL;
        try {
            return SerializationOrchestrator.N(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)27239, (long)(0x1C2F6FED0909FF9L ^ l2)), (long)8427733950280969273L, (long)l2)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)680, (long)(0x6D20E22297217702L ^ l2)), (long)8427733950280969273L, (long)l2)) + l + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)16023, (long)(0x45844856A83E4B25L ^ l2)), (long)8427733950280969273L, (long)l2)), null, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Gp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 23;
                break;
            }
            case 1: {
                n3 = 56;
                break;
            }
            case 2: {
                n3 = 48;
                break;
            }
            case 3: {
                n3 = 34;
                break;
            }
            case 4: {
                n3 = 3;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 29;
                break;
            }
            case 7: {
                n3 = 28;
                break;
            }
            case 8: {
                n3 = 58;
                break;
            }
            case 9: {
                n3 = 5;
                break;
            }
            case 10: {
                n3 = 14;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 59;
                break;
            }
            case 13: {
                n3 = 6;
                break;
            }
            case 14: {
                n3 = 7;
                break;
            }
            case 15: {
                n3 = 11;
                break;
            }
            case 16: {
                n3 = 17;
                break;
            }
            case 17: {
                n3 = 62;
                break;
            }
            case 18: {
                n3 = 46;
                break;
            }
            case 19: {
                n3 = 55;
                break;
            }
            case 20: {
                n3 = 49;
                break;
            }
            case 21: {
                n3 = 44;
                break;
            }
            case 22: {
                n3 = 4;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 24: {
                n3 = 52;
                break;
            }
            case 25: {
                n3 = 54;
                break;
            }
            case 26: {
                n3 = 8;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 22;
                break;
            }
            case 29: {
                n3 = 31;
                break;
            }
            case 30: {
                n3 = 51;
                break;
            }
            case 31: {
                n3 = 60;
                break;
            }
            case 32: {
                n3 = 15;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 38;
                break;
            }
            case 36: {
                n3 = 2;
                break;
            }
            case 37: {
                n3 = 18;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 57;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 10;
                break;
            }
            case 43: {
                n3 = 39;
                break;
            }
            case 44: {
                n3 = 63;
                break;
            }
            case 45: {
                n3 = 33;
                break;
            }
            case 46: {
                n3 = 13;
                break;
            }
            case 47: {
                n3 = 37;
                break;
            }
            case 48: {
                n3 = 24;
                break;
            }
            case 49: {
                n3 = 61;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 9;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 47;
                break;
            }
            case 54: {
                n3 = 35;
                break;
            }
            case 55: {
                n3 = 30;
                break;
            }
            case 56: {
                n3 = 26;
                break;
            }
            case 57: {
                n3 = 50;
                break;
            }
            case 58: {
                n3 = 19;
                break;
            }
            case 59: {
                n3 = 32;
                break;
            }
            case 60: {
                n3 = 53;
                break;
            }
            case 61: {
                n3 = 25;
                break;
            }
            case 62: {
                n3 = 42;
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
        CryptographicTokenGenerator186.f[n4] = new String(cArray);
        return n4;
    }

    private static Ry lambda$null$5(JsonElement jsonElement) {
        return Ry.R((JsonElement)jsonElement.getAsJsonObject());
    }

    private TransactionStatusTracker lambda$createPublicProfileReviewResponse$21(String string, String string2, long l) {
        long l2 = a ^ 0x52861820726EL;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)13840, (long)(0x1BA77043807B4D16L ^ l2)), (long)8813850280203461277L, (long)l2)), string);
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)8051, (long)(0x37912E98C2B96452L ^ l2)), (long)8813850280203461277L, (long)l2)) + string2 + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)14283, (long)(0x2540381FD5584CE9L ^ l2)), (long)8813850280203461277L, (long)l2)) + l, jsonObject, TemporalDataArchiver::T);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void K(AbstractComputationKernel[] abstractComputationKernelArray) {
        U = abstractComputationKernelArray;
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> V(long l, String string) {
        String string2 = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$reportPublicProfileReview$23(string, string2, l));
    }

    private TransactionStatusTracker lambda$downloadPublicProfile$14(String string, long l) {
        long l2 = a ^ 0x107FAFB7BFF9L;
        try {
            return SerializationOrchestrator.H(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)3061, (long)(0x78DA813D7899BD5DL ^ l2)), (long)-5204379030667202806L, (long)l2)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)8429, (long)(0x130A4EC7E0639670L ^ l2)), (long)-5204379030667202806L, (long)l2)) + l + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)22790, (long)(0x56C1AD3F44336FB2L ^ l2)), (long)-5204379030667202806L, (long)l2)), UniqueIdentifierManager::x);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<TransactionStatusTracker<UniversalIdentificationService>> z(long l) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$regenerateShareCode$27(l, string));
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public CompletableFuture<TransactionStatusTracker<Ry>> A(JsonObject jsonObject) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$editPublicProfile$13(string, jsonObject));
    }

    public CompletableFuture<TransactionStatusTracker<DataStreamOrchestrator629<TemporalDataTransformer>>> M(long l, long l2) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$viewPublicProfileReviews$8(string, l, l2));
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicTokenGenerator186.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicTokenGenerator186.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public CompletableFuture<TransactionStatusTracker<TemporalDataTransformer>> z(long l, boolean bl, @Nullable String string) {
        String string2 = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$createPublicProfileReview$19(l, string, bl, string2));
    }

    private TransactionStatusTracker lambda$reportPublicProfileReview$23(String string, String string2, long l) {
        long l2 = a ^ 0x1174018DB9C2L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)19853, (long)(0x4981E4C5FEB6FD0FL ^ l2)), (long)-5621242391560394447L, (long)l2)), string);
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)25737, (long)(0x2467267C55DB5419L ^ l2)), (long)-5621242391560394447L, (long)l2)) + string2 + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)5546, (long)(0x2597A1EF925BA53EL ^ l2)), (long)-5621242391560394447L, (long)l2)) + l, jsonObject, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<TransactionStatusTracker<TemporalDataArchiver>> k(TemporalDataTransformer temporalDataTransformer, String string) {
        return this.R(temporalDataTransformer.V(), string);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == '\u00d1' || c == '\u00e6' || c == '\u00c3') {
                field = CryptographicTokenGenerator186.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicTokenGenerator186.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private TransactionStatusTracker lambda$regenerateShareCode$27(long l, String string) {
        long l2 = a ^ 0x7A1C03FD11F8L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)32403, (long)(0x1FF28E92392CE600L ^ l2)), (long)1857522347764629771L, (long)l2)), (Number)l);
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)8005, (long)(0x7786E65168FF87C4L ^ l2)), (long)1857522347764629771L, (long)l2)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)13422, (long)(0x240E766582FDACF7L ^ l2)), (long)1857522347764629771L, (long)l2)), jsonObject, UniversalIdentificationService::o);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicTokenGenerator186.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicTokenGenerator186.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private TransactionStatusTracker lambda$markReviewsAsRead$26(long l, List list, String string) {
        long l2 = a ^ 0x499E3289C155L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)21376, (long)(0x337E15AD8C629B9FL ^ l2)), (long)-3933316782237380186L, (long)l2)), (Number)l);
            JsonArray jsonArray = new JsonArray();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                long l3 = (Long)iterator.next();
                jsonArray.add((JsonElement)new JsonPrimitive((Number)l3));
            }
            jsonObject.add((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)15360, (long)(0x253BEDF1D76CF43BL ^ l2)), (long)-3933316782237380186L, (long)l2)), (JsonElement)jsonArray);
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)6296, (long)(0x5F2BAD04AF425085L ^ l2)), (long)-3933316782237380186L, (long)l2)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)27105, (long)(0x189C8C0A7EAFA1CEL ^ l2)), (long)-3933316782237380186L, (long)l2)), jsonObject, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private TransactionStatusTracker lambda$listPublicProfiles$4(List list, CipherModeRegistry cipherModeRegistry, long l, String string, String string2) {
        long l2 = a ^ 0x36691CCD4C2L;
        try {
            JsonArray jsonArray = new JsonArray();
            if (list != null) {
                for (String string3 : list) {
                    jsonArray.add((JsonElement)new JsonPrimitive(string3));
                }
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)11972, (long)(0x5B1A8C5BA50DF37DL ^ l2)), (long)-2522781320813378511L, (long)l2)), cipherModeRegistry.X());
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)5630, (long)(0x5749660D20BD487BL ^ l2)), (long)-2522781320813378511L, (long)l2)), (Number)l);
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)135, (long)(0x3FC0A2CC8198DD1FL ^ l2)), (long)-2522781320813378511L, (long)l2)), string);
            jsonObject.add((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)22933, (long)(0x8A139EB9393843BL ^ l2)), (long)-2522781320813378511L, (long)l2)), (JsonElement)jsonArray);
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)2916, (long)(0x33D3033C88F2D6F1L ^ l2)), (long)-2522781320813378511L, (long)l2)) + string2 + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)21782, (long)(0x7FF81C483CAB089DL ^ l2)), (long)-2522781320813378511L, (long)l2)), jsonObject, CryptographicTokenGenerator186::lambda$null$3);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static DataStreamOrchestrator629 lambda$null$3(JsonElement jsonElement) {
        return DataStreamOrchestrator629.p(jsonElement.getAsJsonObject(), CryptographicTokenGenerator186::lambda$null$2);
    }

    private TransactionStatusTracker lambda$deletePublicProfileReview$20(String string, long l) {
        long l2 = a ^ 0x154A21D72184L;
        try {
            return SerializationOrchestrator.N(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)17043, (long)(0x6F6CEF6FB7F3EA4AL ^ l2)), (long)3007087258692383095L, (long)l2)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)7640, (long)(0x2910F2104452B50FL ^ l2)), (long)3007087258692383095L, (long)l2)) + l, null, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<TransactionStatusTracker<List<String>>> C() {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$getMostPopularTags$1(string));
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> I(long l) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$deletePublicProfileReview$20(string, l));
    }

    public CompletableFuture<TransactionStatusTracker<Ry>> d(long l) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$viewPublicProfile$6(string, l));
    }

    private TransactionStatusTracker lambda$createPublicProfileReview$19(long l, String string, boolean bl, String string2) {
        long l2 = a ^ 0x33B50B00B589L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)2287, (long)(0x1A0BDC4D7321B400L ^ l2)), (long)-4776499431893506694L, (long)l2)), (Number)l);
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)23146, (long)(0x7C52E6FF61D8E6A1L ^ l2)), (long)-4776499431893506694L, (long)l2)), string);
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)12295, (long)(0x488824FCC9400CD0L ^ l2)), (long)-4776499431893506694L, (long)l2)), Boolean.valueOf(bl));
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)4175, (long)(0x4E8BACCCE3662CACL ^ l2)), (long)-4776499431893506694L, (long)l2)) + string2 + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)3996, (long)(0xD88402907703376L ^ l2)), (long)-4776499431893506694L, (long)l2)), jsonObject, TemporalDataTransformer::f);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<TransactionStatusTracker<Ry>> w(JsonObject jsonObject) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$createPublicProfile$10(string, jsonObject));
    }

    public CompletableFuture<TransactionStatusTracker<UniqueIdentifierManager>> X(long l) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$downloadPublicProfile$14(string, l));
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> Q(long l) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$deletePublicProfileReviewResponse$22(string, l));
    }

    private static Ry lambda$null$9(JsonElement jsonElement) {
        return Ry.R((JsonElement)jsonElement.getAsJsonObject());
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> n(long l) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$markAllReviewsAsRead$25(l, string));
    }

    private static TemporalDataTransformer lambda$null$16(JsonElement jsonElement) {
        return TemporalDataTransformer.f((JsonElement)jsonElement.getAsJsonObject());
    }

    public CompletableFuture<TransactionStatusTracker<TemporalDataArchiver>> R(long l, String string) {
        String string2 = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$createPublicProfileReviewResponse$21(string, string2, l));
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> T(long l) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$deletePublicProfile$11(string, l));
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> w(TemporalDataTransformer temporalDataTransformer) {
        return this.I(temporalDataTransformer.V());
    }

    private static Method d(long l, long l2) {
        int n = CryptographicTokenGenerator186.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicTokenGenerator186.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicTokenGenerator186.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicTokenGenerator186.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicTokenGenerator186.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicTokenGenerator186.b(271076211045380L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicTokenGenerator186.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicTokenGenerator186.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicTokenGenerator186.b(271076211045380L, 0L);
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

    private TransactionStatusTracker lambda$deletePublicProfileReviewResponse$22(String string, long l) {
        long l2 = a ^ 0x47473B9FB975L;
        try {
            return SerializationOrchestrator.N(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)23208, (long)(0x39FF31423F7A6A9BL ^ l2)), (long)-5671716516140226170L, (long)l2)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)27982, (long)(0x9DDA7E53F2A5D44L ^ l2)), (long)-5671716516140226170L, (long)l2)) + l, null, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> l(Ry ry) {
        return this.n(ry.H());
    }

    public CryptographicTokenGenerator186(String string) {
        this.Q = string;
    }

    public CompletableFuture<TransactionStatusTracker<Boolean>> H(Ry ry, List<Long> list) {
        return this.c(ry.H(), list);
    }

    private TransactionStatusTracker lambda$editPublicProfile$13(String string, JsonObject jsonObject) {
        long l = a ^ 0x13B70DD5CC96L;
        try {
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)21811, (long)(0x223D53E2429A10CCL ^ l)), (long)-4275790641307018139L, (long)l)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)26560, (long)(0x748725E8AD4F2212L ^ l)), (long)-4275790641307018139L, (long)l)), jsonObject, CryptographicTokenGenerator186::lambda$null$12);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<TransactionStatusTracker<TemporalDataTransformer>> A(Ry ry, boolean bl, @Nullable String string) {
        return this.z(ry.H(), bl, string);
    }

    public CompletableFuture<TransactionStatusTracker<UniqueIdentifierManager>> i(long l) {
        String string = LoggingContextManager.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$updatePublicProfile$15(string, l));
    }

    private TransactionStatusTracker lambda$markAllReviewsAsRead$25(long l, String string) {
        long l2 = a ^ 0x7A1AA8980354L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)903, (long)(0xEAB4D5C36F589B4L ^ l2)), (long)822820340537840551L, (long)l2)), (Number)l);
            return SerializationOrchestrator.U(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)4908, (long)(0x7043E9DB165F1920L ^ l2)), (long)822820340537840551L, (long)l2)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)8814, (long)(0x1BF0224AD00BA863L ^ l2)), (long)822820340537840551L, (long)l2)), jsonObject, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static AbstractComputationKernel[] f() {
        return U;
    }

    private static DataStreamOrchestrator629 lambda$null$7(JsonElement jsonElement) {
        return DataStreamOrchestrator629.p(jsonElement.getAsJsonObject(), TemporalDataTransformer::f);
    }

    public CompletableFuture<TransactionStatusTracker<DataStreamOrchestrator629<TemporalDataTransformer>>> E(Ry ry, long l) {
        return this.f(ry.H(), l);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicTokenGenerator186.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private TransactionStatusTracker lambda$getMostPopularTags$1(String string) {
        long l = a ^ 0x3487932E9DECL;
        try {
            return SerializationOrchestrator.H(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)14171, (long)(0x15B0FD9797DBA3CBL ^ l)), (long)-7650648058089190113L, (long)l)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)25559, (long)(0x276160B757CF777EL ^ l)), (long)-7650648058089190113L, (long)l)), CryptographicTokenGenerator186::lambda$null$0);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static DataStreamOrchestrator629 lambda$null$17(JsonElement jsonElement) {
        return DataStreamOrchestrator629.p(jsonElement.getAsJsonObject(), CryptographicTokenGenerator186::lambda$null$16);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x177;
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
                throw new RuntimeException("a/Gp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicTokenGenerator186.c[n2] = n3;
        }
        return c[n2];
    }

    private TransactionStatusTracker lambda$listPublicProfileReviews$18(String string, long l, long l2) {
        long l3 = a ^ 0x57BB8210756BL;
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        try {
            return SerializationOrchestrator.H(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)19530, (long)(0x4439003625D9B062L ^ l3)), (long)9030864165193983384L, (long)l3)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)11107, (long)(0xB397D1AF0815779L ^ l3)), (long)9030864165193983384L, (long)l3)) + l + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)6848, (long)(0x8E977E3C88DE6D5L ^ l3)), (long)9030864165193983384L, (long)l3)) + l2, CryptographicTokenGenerator186::lambda$null$17);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\t\u00194";
        objectArray[1] = Integer.TYPE;
        CryptographicTokenGenerator186.f[1] = "java/lang/Integer";
        objectArray[2] = "`5\"m\u0019\bk:3\"d\u0010x=:k";
        objectArray[3] = "RuG\u0016a\u0007YzVY\u0000\tRqR\u0003";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\\]k\\\u0000'\u000eE}=\u001af5\u0015)ALeM\u001dk\u0001\u0011\u001d\fL{F\u0015aNV)Gq";
    }

    private static Ry lambda$null$12(JsonElement jsonElement) {
        return Ry.R((JsonElement)jsonElement.getAsJsonObject());
    }

    private static ConfigurationParameterManager454 lambda$null$2(JsonElement jsonElement) {
        return ConfigurationParameterManager454.Y(jsonElement.getAsJsonObject());
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Gp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicTokenGenerator186.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicTokenGenerator186.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private TransactionStatusTracker lambda$viewPublicProfile$6(String string, long l) {
        long l2 = a ^ 0x7A99414262C2L;
        try {
            return SerializationOrchestrator.H(this.Q + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)31872, (long)(0x6754902B4522173FL ^ l2)), (long)7709386575660134961L, (long)l2)) + string + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)25189, (long)(0x3114738C9EE989D7L ^ l2)), (long)7709386575660134961L, (long)l2)) + l + (String)((Object)CryptographicTokenGenerator186.b("c", (int)CryptographicTokenGenerator186.a("t", (int)10812, (long)(0x473BFB7E35EE4193L ^ l2)), (long)7709386575660134961L, (long)l2)), CryptographicTokenGenerator186::lambda$null$5);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicTokenGenerator186.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicTokenGenerator186.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

