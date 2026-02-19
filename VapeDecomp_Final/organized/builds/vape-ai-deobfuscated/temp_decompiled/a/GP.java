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
package a;

import a.BY;
import a.FS;
import a.HI;
import a.J9;
import a.JX;
import a.Ry;
import a._5;
import a.cM;
import a.cz;
import a.d8;
import a.hA;
import a.ht;
import a.zy;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
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

public class Gp {
    private static final long[] b;
    private static final String[] f;
    private static final Map d;
    private static final Integer[] c;
    private final String Q;
    private static final long a;
    private static final Object[] e;
    private static ht[] U;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Gp.a = d8.a(-131528493952758418L, 2693065538900364820L, MethodHandles.lookup().lookupClass()).a(2595565480604L);
                Gp.e = new Object[5];
                Gp.f = new String[5];
                Gp.a();
                Gp.d = new HashMap<K, V>(13);
                Gp.K(new ht[5]);
                var0 = Gp.a ^ 117823510556481L;
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
        Gp.b = var8_3;
        Gp.c = new Integer[58];
    }

    public CompletableFuture<zy<Boolean>> s(JX jX2) {
        return this.Q(jX2.H());
    }

    public CompletableFuture<zy<Boolean>> c(long l10, List<Long> list) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$markReviewsAsRead$26(l10, list, string));
    }

    public CompletableFuture<zy<FS<_5>>> T(cz cz2, long l10, @Nullable String string, @Nullable List<String> list) {
        String string2 = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$listPublicProfiles$4(list, cz2, l10, string, string2));
    }

    public CompletableFuture<zy<FS<hA>>> f(long l10, long l11) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$listPublicProfileReviews$18(string, l10, l11));
    }

    private static List lambda$null$0(JsonElement jsonElement) {
        ArrayList<String> arrayList = new ArrayList<String>();
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        for (JsonElement jsonElement2 : jsonArray) {
            arrayList.add(jsonElement2.getAsString());
        }
        return arrayList;
    }

    private zy lambda$createPublicProfile$10(String string, JsonObject jsonObject) {
        long l10 = a ^ 0x1C3D8DE2678AL;
        try {
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)19850, (long)(0xC27671B1E242365L ^ l10)), (long)8049437328965580665L, (long)l10)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)951, (long)(0x4D2951737749ED76L ^ l10)), (long)8049437328965580665L, (long)l10)), jsonObject, Gp::lambda$null$9);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private zy lambda$viewPublicProfileReviews$8(String string, long l10, long l11) {
        long l12 = a ^ 0x4E25A77449F7L;
        try {
            return BY.H(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)14116, (long)(0x54496D8AF0FA77BCL ^ l12)), (long)4740050163154098436L, (long)l12)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)17488, (long)(0x6BCA0410CE4504F7L ^ l12)), (long)4740050163154098436L, (long)l12)) + l10 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)4988, (long)(0x1F5A5377D096D3D0L ^ l12)), (long)4740050163154098436L, (long)l12)) + l11, Gp::lambda$null$7);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<zy<Boolean>> r(long l10, String string) {
        String string2 = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$reportPublicProfileResponse$24(string, string2, l10));
    }

    private zy lambda$reportPublicProfileResponse$24(String string, String string2, long l10) {
        long l11 = a ^ 0xCDEBD0EFDE9L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)29984, (long)(0x5F2CCB875C4A0195L ^ l11)), (long)-732318203091374822L, (long)l11)), string);
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)11865, (long)(0x211BE191CD0ADAFEL ^ l11)), (long)-732318203091374822L, (long)l11)) + string2 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)30263, (long)(0x785349B98C7C829FL ^ l11)), (long)-732318203091374822L, (long)l11)) + l10, jsonObject, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = Gp.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private zy lambda$updatePublicProfile$15(String string, long l10) {
        long l11 = a ^ 0x690498D3125L;
        try {
            return BY.H(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)8673, (long)(0x706FD1BC79FE999BL ^ l11)), (long)4114674016209101270L, (long)l11)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)19253, (long)(0x68C20D7BD7EA7372L ^ l11)), (long)4114674016209101270L, (long)l11)) + l10 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)1489, (long)(0x74386D2B38BBBDA1L ^ l11)), (long)4114674016209101270L, (long)l11)), cM::x);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static Field c(long l10, long l11) {
        int n2 = Gp.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = Gp.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = Gp.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Gp.a(clazz3, string2, clazz2)) != null) {
                    Gp.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = Gp.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        Gp.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Gp.b(271076211045380L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private zy lambda$deletePublicProfile$11(String string, long l10) {
        long l11 = a ^ 0x17C7F8DE7CCAL;
        try {
            return BY.N(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)27239, (long)(0x1C2F6FED0909FF9L ^ l11)), (long)8427733950280969273L, (long)l11)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)680, (long)(0x6D20E22297217702L ^ l11)), (long)8427733950280969273L, (long)l11)) + l10 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)16023, (long)(0x45844856A83E4B25L ^ l11)), (long)8427733950280969273L, (long)l11)), null, JsonElement::getAsBoolean);
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
                n4 = 23;
                break;
            }
            case 1: {
                n4 = 56;
                break;
            }
            case 2: {
                n4 = 48;
                break;
            }
            case 3: {
                n4 = 34;
                break;
            }
            case 4: {
                n4 = 3;
                break;
            }
            case 5: {
                n4 = 36;
                break;
            }
            case 6: {
                n4 = 29;
                break;
            }
            case 7: {
                n4 = 28;
                break;
            }
            case 8: {
                n4 = 58;
                break;
            }
            case 9: {
                n4 = 5;
                break;
            }
            case 10: {
                n4 = 14;
                break;
            }
            case 11: {
                n4 = 0;
                break;
            }
            case 12: {
                n4 = 59;
                break;
            }
            case 13: {
                n4 = 6;
                break;
            }
            case 14: {
                n4 = 7;
                break;
            }
            case 15: {
                n4 = 11;
                break;
            }
            case 16: {
                n4 = 17;
                break;
            }
            case 17: {
                n4 = 62;
                break;
            }
            case 18: {
                n4 = 46;
                break;
            }
            case 19: {
                n4 = 55;
                break;
            }
            case 20: {
                n4 = 49;
                break;
            }
            case 21: {
                n4 = 44;
                break;
            }
            case 22: {
                n4 = 4;
                break;
            }
            case 23: {
                n4 = 12;
                break;
            }
            case 24: {
                n4 = 52;
                break;
            }
            case 25: {
                n4 = 54;
                break;
            }
            case 26: {
                n4 = 8;
                break;
            }
            case 27: {
                n4 = 21;
                break;
            }
            case 28: {
                n4 = 22;
                break;
            }
            case 29: {
                n4 = 31;
                break;
            }
            case 30: {
                n4 = 51;
                break;
            }
            case 31: {
                n4 = 60;
                break;
            }
            case 32: {
                n4 = 15;
                break;
            }
            case 33: {
                n4 = 1;
                break;
            }
            case 34: {
                n4 = 27;
                break;
            }
            case 35: {
                n4 = 38;
                break;
            }
            case 36: {
                n4 = 2;
                break;
            }
            case 37: {
                n4 = 18;
                break;
            }
            case 38: {
                n4 = 45;
                break;
            }
            case 39: {
                n4 = 40;
                break;
            }
            case 40: {
                n4 = 57;
                break;
            }
            case 41: {
                n4 = 43;
                break;
            }
            case 42: {
                n4 = 10;
                break;
            }
            case 43: {
                n4 = 39;
                break;
            }
            case 44: {
                n4 = 63;
                break;
            }
            case 45: {
                n4 = 33;
                break;
            }
            case 46: {
                n4 = 13;
                break;
            }
            case 47: {
                n4 = 37;
                break;
            }
            case 48: {
                n4 = 24;
                break;
            }
            case 49: {
                n4 = 61;
                break;
            }
            case 50: {
                n4 = 20;
                break;
            }
            case 51: {
                n4 = 9;
                break;
            }
            case 52: {
                n4 = 16;
                break;
            }
            case 53: {
                n4 = 47;
                break;
            }
            case 54: {
                n4 = 35;
                break;
            }
            case 55: {
                n4 = 30;
                break;
            }
            case 56: {
                n4 = 26;
                break;
            }
            case 57: {
                n4 = 50;
                break;
            }
            case 58: {
                n4 = 19;
                break;
            }
            case 59: {
                n4 = 32;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 25;
                break;
            }
            case 62: {
                n4 = 42;
                break;
            }
            default: {
                n4 = 41;
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
        Gp.f[n5] = new String(cArray);
        return n5;
    }

    private static Ry lambda$null$5(JsonElement jsonElement) {
        return Ry.R((JsonElement)jsonElement.getAsJsonObject());
    }

    private zy lambda$createPublicProfileReviewResponse$21(String string, String string2, long l10) {
        long l11 = a ^ 0x52861820726EL;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)13840, (long)(0x1BA77043807B4D16L ^ l11)), (long)8813850280203461277L, (long)l11)), string);
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)8051, (long)(0x37912E98C2B96452L ^ l11)), (long)8813850280203461277L, (long)l11)) + string2 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)14283, (long)(0x2540381FD5584CE9L ^ l11)), (long)8813850280203461277L, (long)l11)) + l10, jsonObject, JX::T);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void K(ht[] htArray) {
        U = htArray;
    }

    public CompletableFuture<zy<Boolean>> V(long l10, String string) {
        String string2 = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$reportPublicProfileReview$23(string, string2, l10));
    }

    private zy lambda$downloadPublicProfile$14(String string, long l10) {
        long l11 = a ^ 0x107FAFB7BFF9L;
        try {
            return BY.H(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)3061, (long)(0x78DA813D7899BD5DL ^ l11)), (long)-5204379030667202806L, (long)l11)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)8429, (long)(0x130A4EC7E0639670L ^ l11)), (long)-5204379030667202806L, (long)l11)) + l10 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)22790, (long)(0x56C1AD3F44336FB2L ^ l11)), (long)-5204379030667202806L, (long)l11)), cM::x);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<zy<J9>> z(long l10) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$regenerateShareCode$27(l10, string));
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public CompletableFuture<zy<Ry>> A(JsonObject jsonObject) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$editPublicProfile$13(string, jsonObject));
    }

    public CompletableFuture<zy<FS<hA>>> M(long l10, long l11) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$viewPublicProfileReviews$8(string, l10, l11));
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = Gp.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = Gp.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public CompletableFuture<zy<hA>> z(long l10, boolean bl2, @Nullable String string) {
        String string2 = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$createPublicProfileReview$19(l10, string, bl2, string2));
    }

    private zy lambda$reportPublicProfileReview$23(String string, String string2, long l10) {
        long l11 = a ^ 0x1174018DB9C2L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)19853, (long)(0x4981E4C5FEB6FD0FL ^ l11)), (long)-5621242391560394447L, (long)l11)), string);
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)25737, (long)(0x2467267C55DB5419L ^ l11)), (long)-5621242391560394447L, (long)l11)) + string2 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)5546, (long)(0x2597A1EF925BA53EL ^ l11)), (long)-5621242391560394447L, (long)l11)) + l10, jsonObject, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<zy<JX>> k(hA hA2, String string) {
        return this.R(hA2.V(), string);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e4' || c10 == '\u00d1' || c10 == '\u00e6' || c10 == '\u00c3') {
                field = Gp.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Gp.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private zy lambda$regenerateShareCode$27(long l10, String string) {
        long l11 = a ^ 0x7A1C03FD11F8L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)32403, (long)(0x1FF28E92392CE600L ^ l11)), (long)1857522347764629771L, (long)l11)), (Number)l10);
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)8005, (long)(0x7786E65168FF87C4L ^ l11)), (long)1857522347764629771L, (long)l11)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)13422, (long)(0x240E766582FDACF7L ^ l11)), (long)1857522347764629771L, (long)l11)), jsonObject, J9::o);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Gp.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = Gp.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private zy lambda$markReviewsAsRead$26(long l10, List list, String string) {
        long l11 = a ^ 0x499E3289C155L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)21376, (long)(0x337E15AD8C629B9FL ^ l11)), (long)-3933316782237380186L, (long)l11)), (Number)l10);
            JsonArray jsonArray = new JsonArray();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                long l12 = (Long)iterator.next();
                jsonArray.add((JsonElement)new JsonPrimitive((Number)l12));
            }
            jsonObject.add((String)((Object)Gp.b("c", (int)Gp.a("t", (int)15360, (long)(0x253BEDF1D76CF43BL ^ l11)), (long)-3933316782237380186L, (long)l11)), (JsonElement)jsonArray);
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)6296, (long)(0x5F2BAD04AF425085L ^ l11)), (long)-3933316782237380186L, (long)l11)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)27105, (long)(0x189C8C0A7EAFA1CEL ^ l11)), (long)-3933316782237380186L, (long)l11)), jsonObject, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private zy lambda$listPublicProfiles$4(List list, cz cz2, long l10, String string, String string2) {
        long l11 = a ^ 0x36691CCD4C2L;
        try {
            JsonArray jsonArray = new JsonArray();
            if (list != null) {
                for (String string3 : list) {
                    jsonArray.add((JsonElement)new JsonPrimitive(string3));
                }
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)11972, (long)(0x5B1A8C5BA50DF37DL ^ l11)), (long)-2522781320813378511L, (long)l11)), cz2.X());
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)5630, (long)(0x5749660D20BD487BL ^ l11)), (long)-2522781320813378511L, (long)l11)), (Number)l10);
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)135, (long)(0x3FC0A2CC8198DD1FL ^ l11)), (long)-2522781320813378511L, (long)l11)), string);
            jsonObject.add((String)((Object)Gp.b("c", (int)Gp.a("t", (int)22933, (long)(0x8A139EB9393843BL ^ l11)), (long)-2522781320813378511L, (long)l11)), (JsonElement)jsonArray);
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)2916, (long)(0x33D3033C88F2D6F1L ^ l11)), (long)-2522781320813378511L, (long)l11)) + string2 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)21782, (long)(0x7FF81C483CAB089DL ^ l11)), (long)-2522781320813378511L, (long)l11)), jsonObject, Gp::lambda$null$3);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static FS lambda$null$3(JsonElement jsonElement) {
        return FS.p(jsonElement.getAsJsonObject(), Gp::lambda$null$2);
    }

    private zy lambda$deletePublicProfileReview$20(String string, long l10) {
        long l11 = a ^ 0x154A21D72184L;
        try {
            return BY.N(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)17043, (long)(0x6F6CEF6FB7F3EA4AL ^ l11)), (long)3007087258692383095L, (long)l11)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)7640, (long)(0x2910F2104452B50FL ^ l11)), (long)3007087258692383095L, (long)l11)) + l10, null, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<zy<List<String>>> C() {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$getMostPopularTags$1(string));
    }

    public CompletableFuture<zy<Boolean>> I(long l10) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$deletePublicProfileReview$20(string, l10));
    }

    public CompletableFuture<zy<Ry>> d(long l10) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$viewPublicProfile$6(string, l10));
    }

    private zy lambda$createPublicProfileReview$19(long l10, String string, boolean bl2, String string2) {
        long l11 = a ^ 0x33B50B00B589L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)2287, (long)(0x1A0BDC4D7321B400L ^ l11)), (long)-4776499431893506694L, (long)l11)), (Number)l10);
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)23146, (long)(0x7C52E6FF61D8E6A1L ^ l11)), (long)-4776499431893506694L, (long)l11)), string);
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)12295, (long)(0x488824FCC9400CD0L ^ l11)), (long)-4776499431893506694L, (long)l11)), Boolean.valueOf(bl2));
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)4175, (long)(0x4E8BACCCE3662CACL ^ l11)), (long)-4776499431893506694L, (long)l11)) + string2 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)3996, (long)(0xD88402907703376L ^ l11)), (long)-4776499431893506694L, (long)l11)), jsonObject, hA::f);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<zy<Ry>> w(JsonObject jsonObject) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$createPublicProfile$10(string, jsonObject));
    }

    public CompletableFuture<zy<cM>> X(long l10) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$downloadPublicProfile$14(string, l10));
    }

    public CompletableFuture<zy<Boolean>> Q(long l10) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$deletePublicProfileReviewResponse$22(string, l10));
    }

    private static Ry lambda$null$9(JsonElement jsonElement) {
        return Ry.R((JsonElement)jsonElement.getAsJsonObject());
    }

    public CompletableFuture<zy<Boolean>> n(long l10) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$markAllReviewsAsRead$25(l10, string));
    }

    private static hA lambda$null$16(JsonElement jsonElement) {
        return hA.f((JsonElement)jsonElement.getAsJsonObject());
    }

    public CompletableFuture<zy<JX>> R(long l10, String string) {
        String string2 = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$createPublicProfileReviewResponse$21(string, string2, l10));
    }

    public CompletableFuture<zy<Boolean>> T(long l10) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$deletePublicProfile$11(string, l10));
    }

    public CompletableFuture<zy<Boolean>> w(hA hA2) {
        return this.I(hA2.V());
    }

    private static Method d(long l10, long l11) {
        int n2 = Gp.a(l10, l11);
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
                clazz3 = Gp.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = Gp.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Gp.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        Gp.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Gp.b(271076211045380L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = Gp.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        Gp.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Gp.b(271076211045380L, 0L);
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

    private zy lambda$deletePublicProfileReviewResponse$22(String string, long l10) {
        long l11 = a ^ 0x47473B9FB975L;
        try {
            return BY.N(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)23208, (long)(0x39FF31423F7A6A9BL ^ l11)), (long)-5671716516140226170L, (long)l11)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)27982, (long)(0x9DDA7E53F2A5D44L ^ l11)), (long)-5671716516140226170L, (long)l11)) + l10, null, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<zy<Boolean>> l(Ry ry2) {
        return this.n(ry2.H());
    }

    public Gp(String string) {
        this.Q = string;
    }

    public CompletableFuture<zy<Boolean>> H(Ry ry2, List<Long> list) {
        return this.c(ry2.H(), list);
    }

    private zy lambda$editPublicProfile$13(String string, JsonObject jsonObject) {
        long l10 = a ^ 0x13B70DD5CC96L;
        try {
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)21811, (long)(0x223D53E2429A10CCL ^ l10)), (long)-4275790641307018139L, (long)l10)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)26560, (long)(0x748725E8AD4F2212L ^ l10)), (long)-4275790641307018139L, (long)l10)), jsonObject, Gp::lambda$null$12);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public CompletableFuture<zy<hA>> A(Ry ry2, boolean bl2, @Nullable String string) {
        return this.z(ry2.H(), bl2, string);
    }

    public CompletableFuture<zy<cM>> i(long l10) {
        String string = HI.q();
        return CompletableFuture.supplyAsync(() -> this.lambda$updatePublicProfile$15(string, l10));
    }

    private zy lambda$markAllReviewsAsRead$25(long l10, String string) {
        long l11 = a ^ 0x7A1AA8980354L;
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)Gp.b("c", (int)Gp.a("t", (int)903, (long)(0xEAB4D5C36F589B4L ^ l11)), (long)822820340537840551L, (long)l11)), (Number)l10);
            return BY.U(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)4908, (long)(0x7043E9DB165F1920L ^ l11)), (long)822820340537840551L, (long)l11)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)8814, (long)(0x1BF0224AD00BA863L ^ l11)), (long)822820340537840551L, (long)l11)), jsonObject, JsonElement::getAsBoolean);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static ht[] f() {
        return U;
    }

    private static FS lambda$null$7(JsonElement jsonElement) {
        return FS.p(jsonElement.getAsJsonObject(), hA::f);
    }

    public CompletableFuture<zy<FS<hA>>> E(Ry ry2, long l10) {
        return this.f(ry2.H(), l10);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = Gp.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private zy lambda$getMostPopularTags$1(String string) {
        long l10 = a ^ 0x3487932E9DECL;
        try {
            return BY.H(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)14171, (long)(0x15B0FD9797DBA3CBL ^ l10)), (long)-7650648058089190113L, (long)l10)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)25559, (long)(0x276160B757CF777EL ^ l10)), (long)-7650648058089190113L, (long)l10)), Gp::lambda$null$0);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static FS lambda$null$17(JsonElement jsonElement) {
        return FS.p(jsonElement.getAsJsonObject(), Gp::lambda$null$16);
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

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x177;
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
                throw new RuntimeException("a/Gp", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Gp.c[n3] = n4;
        }
        return c[n3];
    }

    private zy lambda$listPublicProfileReviews$18(String string, long l10, long l11) {
        long l12 = a ^ 0x57BB8210756BL;
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        try {
            return BY.H(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)19530, (long)(0x4439003625D9B062L ^ l12)), (long)9030864165193983384L, (long)l12)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)11107, (long)(0xB397D1AF0815779L ^ l12)), (long)9030864165193983384L, (long)l12)) + l10 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)6848, (long)(0x8E977E3C88DE6D5L ^ l12)), (long)9030864165193983384L, (long)l12)) + l11, Gp::lambda$null$17);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\t\u00194";
        objectArray[1] = Integer.TYPE;
        Gp.f[1] = "java/lang/Integer";
        objectArray[2] = "`5\"m\u0019\bk:3\"d\u0010x=:k";
        objectArray[3] = "RuG\u0016a\u0007YzVY\u0000\tRqR\u0003";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\\]k\\\u0000'\u000eE}=\u001af5\u0015)ALeM\u001dk\u0001\u0011\u001d\fL{F\u0015aNV)Gq";
    }

    private static Ry lambda$null$12(JsonElement jsonElement) {
        return Ry.R((JsonElement)jsonElement.getAsJsonObject());
    }

    private static _5 lambda$null$2(JsonElement jsonElement) {
        return _5.Y(jsonElement.getAsJsonObject());
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

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = Gp.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                Gp.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private zy lambda$viewPublicProfile$6(String string, long l10) {
        long l11 = a ^ 0x7A99414262C2L;
        try {
            return BY.H(this.Q + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)31872, (long)(0x6754902B4522173FL ^ l11)), (long)7709386575660134961L, (long)l11)) + string + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)25189, (long)(0x3114738C9EE989D7L ^ l11)), (long)7709386575660134961L, (long)l11)) + l10 + (String)((Object)Gp.b("c", (int)Gp.a("t", (int)10812, (long)(0x473BFB7E35EE4193L ^ l11)), (long)7709386575660134961L, (long)l11)), Gp::lambda$null$5);
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
            return MethodHandles.lookup().findStatic(Gp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(Gp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

