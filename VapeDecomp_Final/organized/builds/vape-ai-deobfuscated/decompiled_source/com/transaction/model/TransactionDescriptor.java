/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.transaction.model;

import a.Ry;
import a.ec;
import com.collections.management.MultiContainerRegistry;
import com.data.processing.CollectionFilterProcessor;
import com.data.serialization.JsonPayloadOrchestrator;
import com.data.serialization.SerializationOrchestrator;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.protocol.EncryptionProtocolHandler397;
import com.system.timing.TimestampCorrelationService;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TransactionDescriptor
extends CollectionFilterProcessor
implements Comparable<TransactionDescriptor> {
    @Nullable
    private Integer e;
    private static final long a;
    private long N;
    private String U;
    private boolean Q = true;
    private UUID D = UUID.randomUUID();
    private JsonObject L;
    private boolean S;
    private JsonObject q;
    @Deprecated
    private boolean H;
    private static final Map g;
    private static final Object[] l;
    @Nullable
    private Ry u;
    private JsonObject o;
    private static final String[] m;
    private String A;
    private boolean R;
    private String r;
    public static final int K;
    @Nullable
    private TimestampCorrelationService k;
    private static int F;
    private static final Integer[] f;
    private JsonObject z = new JsonObject();
    @Nullable
    private UUID E;
    private boolean t;
    private static final long[] d;
    private int P;

    @Override
    public void E(List<Integer> list) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Integer n : list) {
            if (n < 0) {
                int n2 = n + 100;
                try {
                    if (n2 <= 1) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionDescriptor.a(customSystemException);
                }
            }
            arrayList.add(n);
        }
        super.E(arrayList);
    }

    public void y(@NotNull Integer n) {
        this.e = n;
    }

    public void I(boolean bl) {
        this.t = bl;
    }

    public List<ContextualExecutionFramework> q() {
        return TemporalMetadataResolver.h.U().Z(this.z);
    }

    public boolean t() {
        return this.t;
    }

    public TransactionDescriptor(String string, String string2, boolean bl) {
        this.L = new JsonObject();
        this.r = string;
        this.A = string2;
        this.S = bl;
        this.l();
    }

    public JsonObject I(boolean bl) {
        CallSite callSite;
        JsonObject jsonObject;
        String string;
        CallSite callSite2;
        JsonObject jsonObject2;
        JsonObject jsonObject3;
        long l;
        block16: {
            l = a ^ 0x4DA1C315C16CL;
            jsonObject3 = new JsonObject();
            try {
                jsonObject3.addProperty((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)31719, (long)(0x3476BF92B67BCF0FL ^ l)), (long)-3116145792666320491L, (long)l)), this.D.toString());
                if (this.E != null) {
                    jsonObject3.addProperty((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)2644, (long)(0x6E3305B3DCAFBE9DL ^ l)), (long)-3116145792666320491L, (long)l)), this.E.toString());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionDescriptor.a(customSystemException);
            }
            try {
                block17: {
                    try {
                        try {
                            if (!bl) break block16;
                            if (this.A == null) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionDescriptor.a(customSystemException);
                        }
                        if (!this.A.isEmpty()) break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionDescriptor.a(customSystemException);
                    }
                }
                this.A = TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)9593, (long)(0x23472F8991389184L ^ l)), (long)-3116145792666320491L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionDescriptor.a(customSystemException);
            }
        }
        try {
            jsonObject2 = jsonObject3;
            callSite2 = TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)7793, (long)(0x753852A6FE712A98L ^ l)), (long)-3116145792666320491L, (long)l);
            string = this.r.length() > 48 ? this.r.substring(0, 47) : this.r;
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        try {
            jsonObject2.addProperty((String)((Object)callSite2), string);
            jsonObject = jsonObject3;
            callSite = bl ? TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)8522, (long)(0x3955AD551BD415A7L ^ l)), (long)-3116145792666320491L, (long)l) : TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)19038, (long)(0xB4FBCF95FB3FEA2L ^ l)), (long)-3116145792666320491L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        try {
            jsonObject.addProperty((String)((Object)callSite), this.A);
            this.q.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)3482, (long)(0x585C7B0976DB947L ^ l)), (long)-3116145792666320491L, (long)l)), (JsonElement)this.w());
            this.q.addProperty((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)14528, (long)(0x2D5C1E4B9D480C3AL ^ l)), (long)-3116145792666320491L, (long)l)), (Number)this.Q());
            jsonObject3.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)21721, (long)(0x5C9751362F126014L ^ l)), (long)-3116145792666320491L, (long)l)), (JsonElement)this.q);
            jsonObject3.addProperty((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)1871, (long)(0x7BD484381A54338EL ^ l)), (long)-3116145792666320491L, (long)l)), Boolean.valueOf(this.H));
            jsonObject3.addProperty((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)21047, (long)(0x7050C2B39F8DE6E1L ^ l)), (long)-3116145792666320491L, (long)l)), (Number)this.N);
            if (this.U != null) {
                jsonObject3.addProperty((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)4990, (long)(0x36C6AA25DD8E2781L ^ l)), (long)-3116145792666320491L, (long)l)), this.U);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        return jsonObject3;
    }

    public static int P() {
        int n = TransactionDescriptor.z();
        try {
            if (n == 0) {
                return 73;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        return 0;
    }

    @Override
    public boolean v() {
        return TemporalMetadataResolver.h.o().W().equals(this);
    }

    public String o() {
        return this.A;
    }

    public boolean D() {
        return this.S;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TransactionDescriptor.a = MultiContainerRegistry.a(6264259561206973135L, 6672815745100912938L, MethodHandles.lookup().lookupClass()).a(178486695842268L);
                TransactionDescriptor.l = new Object[5];
                TransactionDescriptor.m = new String[5];
                TransactionDescriptor.c();
                TransactionDescriptor.g = new HashMap<K, V>(13);
                var0 = TransactionDescriptor.a ^ 6915904396989L;
                TransactionDescriptor.A(24);
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
                var8_3 = new long[70];
                var5_4 = 0;
                var6_5 = ",U\u00ce\u008d%LeN\u00a2\u00d33\u00e5L\u00e5B\u00abA\u00c2W\u00d5R)kO\u00e6\u000b\u00a5\u00db\u008fY\u0001\u00dd\b\u00b8\u0013\u00f0\u00bd\u008dp\u00f1\u00ca3\u0087\\ahL\u00ce\u0084\u00da\u00c6p\u0002\u00f8\u00d1P}\u00c9l\u0083\u00eb\u00f2\u0089\u0093n\u00b3\u00b5g\u00e9\u0085o@\u00df\u00c7i^\u00e6\u00d3\u00e0\u0005\u008c5\u00bf\u0092!\u00bb\u00e2\u00a4\u00ff\u00eb\u00b3;\u009b\u0016\u0006\u0099\u00f1\u0006^\u009a\u00b2\u0018\u00de7\u00b5\u00f5*\u00d9\u00f2\u0002\u0015\u00e7\u00ec\u0006\u009b\u009d\u00a3\u00e7F\u00c2\u0097.F`\u00e6\u00bc\u00da6\u00d3Lj\u00deO\u00e7+\u00db\u00c35p\u0013\u00a0\u00cfu\u00ef\u00f4\u00106eA\u009d\u00c3\u00a6\u00ba1\u00da\u00de\u0083\u0012\nt\u00cb\u00a7\u00a1\u00aa\r\u00fb\u00c359m\u0096\u00faMwi\u00ddB\u00d2`>s\u00d9\u001b\u00d5C\u0010\u00f1\u00a3bV\u0082\u0093\u00a8\u0086\u00f3\u00bdw\u00f9\u00d0\u0091\u00c7U\u00b58\u00bf\u001cc:[w\u00b5\u00a4\u00d2\u00e4e\u0012CL\u008f\u0011\u0095(\n\u0088\u0084\u009f\u00cd\u00c0}\u00ac\u0012\u00ac\u00bc\u00f0\u009d\u00a0[\u001f\u00ac\u00f7p\u00f4\u00ca\r[\u00bf\u00847\u0096\u00a3-\u00a3n&e\u00ca2.\u0014=\u00cd}\u00ca\u00af\u00b4\u0095:ME\rS\u0086\u008d\u00bf\u0013\u00fe\u00d0\u00c2\u00d8s\u00f4\u00f4\u00cf\u00be8\u00de\u00e0\u0004oR\u00dc\u0000/og<M&\u00b5zjb\u0081d\u001e\u0015\u00e8m-+Q\u00ae^\u009b\u00acE\u0097n\u00c9\u0016\u0085\u001d}`R\u00e22CZld\u00d7{2\u0096z\u000b\u00ee\u00e3\u00b9s\u00fb\u00d4\u00e5\"\u007f\u00c7\u0000J=\u00bf\u0090N+\u00dfj\\\u009e\u00ed\u00fbz\u00d1:m\u001c`\u00b4s\u00d5\u00e4G\u00baY`\u00d9(\u00c0wLh\u00b5\"\u00a7\u0085\u0007\u00ba=\u00ff\u00ec\u00d5\u00f1b\u00b3F\u00c9\u0000\u00c9d\u00b5\u00fc\f\u00e2<\u00b3sH\u0098\u00ff\u00b9Aw\u00cf\u00c8\u00b33\u00c2\u00a4k\u00fd+R\u0015\u0017\u00fdf\u00c4\u00b4\u0003\u0097\u00b7\u0099\u00e3i\u0007VV\u008e;\u00d4\u00b4Ji\u00f5\u00e4\u001f\u00f4/\u00aa\u0019\u008aGVp\u00db\u0097T\u00b0\u0011\u0091\u00fa\u00dcJ\u00cfC\u00d4P\u00a7<\u0005?|8\u008aJ\u001c\u00bc\u00e2\u0005\u001b\u0019\u00a9\u000fM\r\u008f,*C\u000e=k\u0090\u00e2\u0010\u0018\u00e4\u00ecJT*\u0089\u00c2\u00c8be\u0001/`\u00d6\u008c[\u00eb\u00ecq\u00c6vz\u00c5\u0010\u00c3\u00e2X<G\u00e8>m\u0010F\u00c9b\u00a1\u0018\u00b4\u00d99\u00ce\u0017\u00cf\u00a2YcC\u00ed";
                var7_6 = ",U\u00ce\u008d%LeN\u00a2\u00d33\u00e5L\u00e5B\u00abA\u00c2W\u00d5R)kO\u00e6\u000b\u00a5\u00db\u008fY\u0001\u00dd\b\u00b8\u0013\u00f0\u00bd\u008dp\u00f1\u00ca3\u0087\\ahL\u00ce\u0084\u00da\u00c6p\u0002\u00f8\u00d1P}\u00c9l\u0083\u00eb\u00f2\u0089\u0093n\u00b3\u00b5g\u00e9\u0085o@\u00df\u00c7i^\u00e6\u00d3\u00e0\u0005\u008c5\u00bf\u0092!\u00bb\u00e2\u00a4\u00ff\u00eb\u00b3;\u009b\u0016\u0006\u0099\u00f1\u0006^\u009a\u00b2\u0018\u00de7\u00b5\u00f5*\u00d9\u00f2\u0002\u0015\u00e7\u00ec\u0006\u009b\u009d\u00a3\u00e7F\u00c2\u0097.F`\u00e6\u00bc\u00da6\u00d3Lj\u00deO\u00e7+\u00db\u00c35p\u0013\u00a0\u00cfu\u00ef\u00f4\u00106eA\u009d\u00c3\u00a6\u00ba1\u00da\u00de\u0083\u0012\nt\u00cb\u00a7\u00a1\u00aa\r\u00fb\u00c359m\u0096\u00faMwi\u00ddB\u00d2`>s\u00d9\u001b\u00d5C\u0010\u00f1\u00a3bV\u0082\u0093\u00a8\u0086\u00f3\u00bdw\u00f9\u00d0\u0091\u00c7U\u00b58\u00bf\u001cc:[w\u00b5\u00a4\u00d2\u00e4e\u0012CL\u008f\u0011\u0095(\n\u0088\u0084\u009f\u00cd\u00c0}\u00ac\u0012\u00ac\u00bc\u00f0\u009d\u00a0[\u001f\u00ac\u00f7p\u00f4\u00ca\r[\u00bf\u00847\u0096\u00a3-\u00a3n&e\u00ca2.\u0014=\u00cd}\u00ca\u00af\u00b4\u0095:ME\rS\u0086\u008d\u00bf\u0013\u00fe\u00d0\u00c2\u00d8s\u00f4\u00f4\u00cf\u00be8\u00de\u00e0\u0004oR\u00dc\u0000/og<M&\u00b5zjb\u0081d\u001e\u0015\u00e8m-+Q\u00ae^\u009b\u00acE\u0097n\u00c9\u0016\u0085\u001d}`R\u00e22CZld\u00d7{2\u0096z\u000b\u00ee\u00e3\u00b9s\u00fb\u00d4\u00e5\"\u007f\u00c7\u0000J=\u00bf\u0090N+\u00dfj\\\u009e\u00ed\u00fbz\u00d1:m\u001c`\u00b4s\u00d5\u00e4G\u00baY`\u00d9(\u00c0wLh\u00b5\"\u00a7\u0085\u0007\u00ba=\u00ff\u00ec\u00d5\u00f1b\u00b3F\u00c9\u0000\u00c9d\u00b5\u00fc\f\u00e2<\u00b3sH\u0098\u00ff\u00b9Aw\u00cf\u00c8\u00b33\u00c2\u00a4k\u00fd+R\u0015\u0017\u00fdf\u00c4\u00b4\u0003\u0097\u00b7\u0099\u00e3i\u0007VV\u008e;\u00d4\u00b4Ji\u00f5\u00e4\u001f\u00f4/\u00aa\u0019\u008aGVp\u00db\u0097T\u00b0\u0011\u0091\u00fa\u00dcJ\u00cfC\u00d4P\u00a7<\u0005?|8\u008aJ\u001c\u00bc\u00e2\u0005\u001b\u0019\u00a9\u000fM\r\u008f,*C\u000e=k\u0090\u00e2\u0010\u0018\u00e4\u00ecJT*\u0089\u00c2\u00c8be\u0001/`\u00d6\u008c[\u00eb\u00ecq\u00c6vz\u00c5\u0010\u00c3\u00e2X<G\u00e8>m\u0010F\u00c9b\u00a1\u0018\u00b4\u00d99\u00ce\u0017\u00cf\u00a2YcC\u00ed".length();
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
                    var6_5 = "tH\"6\u00ed\u0095\u00c1iG\u008cM\u008b-\u009d;\u0082";
                    var7_6 = "tH\"6\u00ed\u0095\u00c1iG\u008cM\u008b-\u009d;\u0082".length();
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
        TransactionDescriptor.d = var8_3;
        TransactionDescriptor.f = new Integer[70];
        TransactionDescriptor.K = (int)TransactionDescriptor.a("o", (int)22127, (long)(var0 ^ 3797767606963567947L));
    }

    @Nullable
    public TimestampCorrelationService p() {
        return this.k;
    }

    @Nullable
    public Ry N() {
        return this.u;
    }

    public boolean r() {
        return this.R;
    }

    public void m(boolean bl) {
        this.S = bl;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'l' || c == 'k' || c == '\u00c2' || c == '\u00f3') {
                field = TransactionDescriptor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransactionDescriptor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public String L() {
        long l = a ^ 0x458CC6E1C57L;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)18079, (long)(0x4159310170892F5DL ^ l)), (long)719010305894522030L, (long)l)));
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.N), ZoneId.systemDefault());
        return dateTimeFormatter.format(localDateTime);
    }

    public void s() {
        this.M(true);
    }

    public int Q() {
        return TemporalMetadataResolver.h.o().T().indexOf(this);
    }

    private void v() {
        this.L = TemporalMetadataResolver.h.U().w();
    }

    public void y() {
        long l = a ^ 0x78F21401C880L;
        this.A = TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)9648, (long)(0x727D58FDFE8A18BBL ^ l)), (long)-2509335422075680647L, (long)l);
        this.l();
        this.q = this.v(false);
        this.o = this.v(true);
        this.a();
        this.q.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)1417, (long)(0x4017E8007A538A7L ^ l)), (long)-2509335422075680647L, (long)l)), (JsonElement)this.z);
        this.o.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)53, (long)(0x84E2043D85A3D2DL ^ l)), (long)-2509335422075680647L, (long)l)), (JsonElement)this.z);
        this.v();
        this.q.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)6715, (long)(0x4A2058724F112771L ^ l)), (long)-2509335422075680647L, (long)l)), (JsonElement)this.L);
        this.o.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)3229, (long)(0xE14B73708D1B1ADL ^ l)), (long)-2509335422075680647L, (long)l)), (JsonElement)this.L);
    }

    @Nullable
    public UUID k() {
        return this.E;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void X(int n) {
        this.P = n;
    }

    public int h(@NotNull TransactionDescriptor transactionDescriptor) {
        return Integer.compare(this.Q(), transactionDescriptor.Q());
    }

    public TransactionDescriptor P(JsonObject jsonObject) {
        long l;
        block30: {
            block29: {
                block28: {
                    block27: {
                        l = a ^ 0x5AD7DF08C793L;
                        String string = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)11398, (long)(0x7A3BD75AA1AE1E82L ^ l)), (long)-3297146615615797398L, (long)l)));
                        try {
                            if (string != null) {
                                this.D = UUID.fromString(string);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionDescriptor.a(customSystemException);
                        }
                        String string2 = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)8942, (long)(0x22B9A212923510D2L ^ l)), (long)-3297146615615797398L, (long)l)));
                        try {
                            try {
                                if (string2 == null) break block27;
                                this.r = string2;
                                if (!this.r.startsWith((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)16454, (long)(0x78C2A5B4368F267L ^ l)), (long)-3297146615615797398L, (long)l)))) break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransactionDescriptor.a(customSystemException);
                            }
                            this.r = ec.c(this.r.split((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)29234, (long)(0x29F136ED5CBD403DL ^ l)), (long)-3297146615615797398L, (long)l)))[1]);
                            break block28;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionDescriptor.a(customSystemException);
                        }
                    }
                    this.r = TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)1948, (long)(0x2D29942527D0359DL ^ l)), (long)-3297146615615797398L, (long)l);
                }
                String string = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)28313, (long)(0x53E55613A5FE5CBFL ^ l)), (long)-3297146615615797398L, (long)l)));
                try {
                    if (string == null) break block29;
                    this.E = UUID.fromString(string);
                    break block30;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionDescriptor.a(customSystemException);
                }
            }
            this.R = true;
        }
        String string = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)23852, (long)(0x29689C0E42166F38L ^ l)), (long)-3297146615615797398L, (long)l)));
        try {
            if (string != null) {
                this.A = string;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        String string3 = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)31867, (long)(0x3AA090B29105CE20L ^ l)), (long)-3297146615615797398L, (long)l)));
        try {
            if (string3 != null) {
                this.A = string3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        Boolean bl = EncryptionProtocolHandler397.O(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)10259, (long)(0x305DE8DDC72A9A02L ^ l)), (long)-3297146615615797398L, (long)l)));
        try {
            if (bl != null) {
                this.H = bl;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        JsonObject jsonObject2 = EncryptionProtocolHandler397.F(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)5857, (long)(0x1C85C78847D124DEL ^ l)), (long)-3297146615615797398L, (long)l)));
        try {
            if (jsonObject2 != null) {
                this.u(jsonObject2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        Long l2 = EncryptionProtocolHandler397.v(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)9714, (long)(0x60B217D7C5817DCL ^ l)), (long)-3297146615615797398L, (long)l)));
        try {
            if (l2 != null) {
                this.L(l2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        String string4 = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)25148, (long)(0x6CFC0E72BA985017L ^ l)), (long)-3297146615615797398L, (long)l)));
        try {
            if (string4 != null) {
                this.U = string4;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        this.k = TimestampCorrelationService.F(jsonObject.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)19906, (long)(0x670F4BA6FFB17FE5L ^ l)), (long)-3297146615615797398L, (long)l))));
        return this;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TransactionDescriptor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransactionDescriptor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void c() {
        Object[] objectArray = l;
        l[0] = "`w7";
        objectArray[1] = Integer.TYPE;
        TransactionDescriptor.m[1] = "java/lang/Integer";
        objectArray[2] = "Qq\u0007Ps\u007fZ~\u0016\u001f\u000egIy\u001fV";
        objectArray[3] = "w1u )\u0018|>doH\u0016w5`5";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0004\n;5D;@\b$XE\":\u0017t3U(@X\">.c\u0000\u0007$aAbT_#X";
    }

    public void G(Ry ry) {
        this.u = ry;
    }

    public void q(UUID uUID) {
        this.D = uUID;
    }

    public JsonObject r() {
        return this.z;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = TransactionDescriptor.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 37;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 59;
                break;
            }
            case 3: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 13;
                break;
            }
            case 5: {
                n3 = 56;
                break;
            }
            case 6: {
                n3 = 49;
                break;
            }
            case 7: {
                n3 = 45;
                break;
            }
            case 8: {
                n3 = 0;
                break;
            }
            case 9: {
                n3 = 30;
                break;
            }
            case 10: {
                n3 = 21;
                break;
            }
            case 11: {
                n3 = 1;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 32;
                break;
            }
            case 14: {
                n3 = 22;
                break;
            }
            case 15: {
                n3 = 39;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 60;
                break;
            }
            case 18: {
                n3 = 54;
                break;
            }
            case 19: {
                n3 = 48;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 33;
                break;
            }
            case 22: {
                n3 = 24;
                break;
            }
            case 23: {
                n3 = 34;
                break;
            }
            case 24: {
                n3 = 41;
                break;
            }
            case 25: {
                n3 = 31;
                break;
            }
            case 26: {
                n3 = 46;
                break;
            }
            case 27: {
                n3 = 62;
                break;
            }
            case 28: {
                n3 = 2;
                break;
            }
            case 29: {
                n3 = 57;
                break;
            }
            case 30: {
                n3 = 9;
                break;
            }
            case 31: {
                n3 = 53;
                break;
            }
            case 32: {
                n3 = 5;
                break;
            }
            case 33: {
                n3 = 29;
                break;
            }
            case 34: {
                n3 = 8;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 19;
                break;
            }
            case 38: {
                n3 = 23;
                break;
            }
            case 39: {
                n3 = 61;
                break;
            }
            case 40: {
                n3 = 36;
                break;
            }
            case 41: {
                n3 = 12;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 7;
                break;
            }
            case 44: {
                n3 = 15;
                break;
            }
            case 45: {
                n3 = 25;
                break;
            }
            case 46: {
                n3 = 38;
                break;
            }
            case 47: {
                n3 = 40;
                break;
            }
            case 48: {
                n3 = 16;
                break;
            }
            case 49: {
                n3 = 27;
                break;
            }
            case 50: {
                n3 = 18;
                break;
            }
            case 51: {
                n3 = 51;
                break;
            }
            case 52: {
                n3 = 47;
                break;
            }
            case 53: {
                n3 = 52;
                break;
            }
            case 54: {
                n3 = 11;
                break;
            }
            case 55: {
                n3 = 3;
                break;
            }
            case 56: {
                n3 = 50;
                break;
            }
            case 57: {
                n3 = 44;
                break;
            }
            case 58: {
                n3 = 14;
                break;
            }
            case 59: {
                n3 = 58;
                break;
            }
            case 60: {
                n3 = 20;
                break;
            }
            case 61: {
                n3 = 6;
                break;
            }
            case 62: {
                n3 = 42;
                break;
            }
            default: {
                n3 = 43;
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
        TransactionDescriptor.m[n4] = new String(cArray);
        return n4;
    }

    public void a() {
        this.z = TemporalMetadataResolver.h.U().J();
    }

    public UUID J() {
        return this.D;
    }

    public JsonObject p() {
        return this.q;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/BZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void j(boolean bl) {
        this.R = bl;
    }

    public String T() {
        return this.r;
    }

    public void e(JsonObject jsonObject) {
        this.o = jsonObject;
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

    public void T(boolean bl) {
        this.H = bl;
    }

    private static Method d(long l, long l2) {
        int n = TransactionDescriptor.a(l, l2);
        Object object = TransactionDescriptor.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = TransactionDescriptor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransactionDescriptor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransactionDescriptor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransactionDescriptor.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransactionDescriptor.b(227050071596327L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransactionDescriptor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransactionDescriptor.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransactionDescriptor.b(227050071596327L, 0L);
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

    public JsonObject b() {
        return this.o;
    }

    @Override
    public void G() {
        TemporalMetadataResolver.h.o().A(this);
    }

    @Nullable
    public JsonPayloadOrchestrator X(boolean bl) {
        block10: {
            JsonObject jsonObject;
            long l;
            block9: {
                block8: {
                    l = a ^ 0x669693EA4B7DL;
                    try {
                        try {
                            if (!bl || this.o == null) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionDescriptor.a(customSystemException);
                        }
                        jsonObject = this.b();
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionDescriptor.a(customSystemException);
                    }
                }
                jsonObject = this.p();
            }
            JsonObject jsonObject2 = jsonObject;
            try {
                try {
                    if (jsonObject2.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)26859, (long)(0x12C8B2E507FD5636L ^ l)), (long)6831981379668167556L, (long)l))) == null || jsonObject2.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)717, (long)(0x487384BBEC7C3C2FL ^ l)), (long)6831981379668167556L, (long)l))).isJsonNull()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionDescriptor.a(customSystemException);
                }
                return new JsonPayloadOrchestrator(this, jsonObject2.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)12378, (long)(0x18D826DD7D500EAAL ^ l)), (long)6831981379668167556L, (long)l))).getAsJsonArray());
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionDescriptor.a(customSystemException);
            }
        }
        return null;
    }

    public void M(boolean bl) {
        block45: {
            long l;
            block44: {
                ContextualExecutionFramework contextualExecutionFramework2;
                JsonArray jsonArray;
                block43: {
                    block42: {
                        block41: {
                            block40: {
                                block39: {
                                    block38: {
                                        block37: {
                                            l = a ^ 0x4CA6CE405C65L;
                                            try {
                                                try {
                                                    if (!bl || !TemporalMetadataResolver.h.F().j.s().booleanValue()) break block37;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw TransactionDescriptor.a(customSystemException);
                                                }
                                                TemporalMetadataResolver.h.U().k();
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw TransactionDescriptor.a(customSystemException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)12199, (long)(0x531F75FFE77D0661L ^ l)), (long)5316561956350352540L, (long)l))) == null || this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)29324, (long)(0x451683DF1C61DB4BL ^ l)), (long)5316561956350352540L, (long)l))).isJsonNull()) break block38;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw TransactionDescriptor.a(customSystemException);
                                            }
                                            TemporalMetadataResolver.h.Z().d(this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)4104, (long)(0x4D4F52A649A039F3L ^ l)), (long)5316561956350352540L, (long)l))).getAsJsonArray());
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw TransactionDescriptor.a(customSystemException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)12617, (long)(0x41876E1824279888L ^ l)), (long)5316561956350352540L, (long)l))) == null || this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)28900, (long)(0x4A8B098D563E593DL ^ l)), (long)5316561956350352540L, (long)l))).isJsonNull()) break block39;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw TransactionDescriptor.a(customSystemException);
                                        }
                                        TemporalMetadataResolver.h.U().T(this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)3612, (long)(0x289DC8044EE6A7CFL ^ l)), (long)5316561956350352540L, (long)l))).getAsJsonArray());
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw TransactionDescriptor.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        if (this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)21160, (long)(0x5A2D917813E7B72L ^ l)), (long)5316561956350352540L, (long)l))) == null || this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)24821, (long)(0x649861EDA23C491FL ^ l)), (long)5316561956350352540L, (long)l))).isJsonNull()) break block40;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw TransactionDescriptor.a(customSystemException);
                                    }
                                    TemporalMetadataResolver.h.S().n(this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)15430, (long)(0xD2FB6718D1E1588L ^ l)), (long)5316561956350352540L, (long)l))).getAsJsonObject());
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw TransactionDescriptor.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)24310, (long)(0x6B9C3B8C1C66F739L ^ l)), (long)5316561956350352540L, (long)l))) == null || this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)1107, (long)(0x3D7C2F8894DFADB5L ^ l)), (long)5316561956350352540L, (long)l))).isJsonNull()) break block41;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw TransactionDescriptor.a(customSystemException);
                                }
                                TemporalMetadataResolver.h.E().D(this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)31830, (long)(0x59FCC3B30CE8558AL ^ l)), (long)5316561956350352540L, (long)l))).getAsJsonArray());
                            }
                            catch (CustomSystemException customSystemException) {
                                throw TransactionDescriptor.a(customSystemException);
                            }
                        }
                        try {
                            if (this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)13473, (long)(0x4E78DA7781CC1D0DL ^ l)), (long)5316561956350352540L, (long)l))) == null || this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)23228, (long)(0x506FA120C83DF34DL ^ l)), (long)5316561956350352540L, (long)l))).isJsonNull()) break block42;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionDescriptor.a(customSystemException);
                        }
                        jsonArray = this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)4462, (long)(0x6AFC27C7882C38A2L ^ l)), (long)5316561956350352540L, (long)l))).getAsJsonArray();
                        TemporalMetadataResolver.h.m().q(jsonArray);
                    }
                    try {
                        try {
                            if (!bl || !TemporalMetadataResolver.h.F().j.s().booleanValue()) break block43;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw TransactionDescriptor.a(customSystemException);
                        }
                        this.C();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionDescriptor.a(customSystemException);
                    }
                }
                for (ContextualExecutionFramework contextualExecutionFramework2 : TemporalMetadataResolver.h.U().q()) {
                    try {
                        if (!contextualExecutionFramework2.Z()) continue;
                        contextualExecutionFramework2.c(true, true);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionDescriptor.a(customSystemException);
                    }
                }
                try {
                    try {
                        TemporalMetadataResolver.h.U().V();
                        GraphicalRenderingController.j();
                        GraphicalRenderingController.z();
                        if (this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)32286, (long)(0x514C5A38460DD7FDL ^ l)), (long)5316561956350352540L, (long)l))) == null || this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)29555, (long)(0x8DCE4F31CDC5AA5L ^ l)), (long)5316561956350352540L, (long)l))).isJsonNull()) break block44;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionDescriptor.a(customSystemException);
                    }
                    if (!TemporalMetadataResolver.h.F().t.s().booleanValue()) break block44;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionDescriptor.a(customSystemException);
                }
                jsonArray = this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)25631, (long)(0x103947B6E3F9CDC4L ^ l)), (long)5316561956350352540L, (long)l))).getAsJsonArray();
                contextualExecutionFramework2 = new JsonArray();
                contextualExecutionFramework2.add((JsonElement)jsonArray);
                GraphicalRenderingController.K.N((JsonArray)contextualExecutionFramework2);
            }
            try {
                try {
                    if (this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)879, (long)(0x65D8139DA55F2A84L ^ l)), (long)5316561956350352540L, (long)l))) == null || this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)17087, (long)(0x3D0E70B7E6D8EB16L ^ l)), (long)5316561956350352540L, (long)l))).isJsonNull()) break block45;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionDescriptor.a(customSystemException);
                }
                this.U = this.q.get((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)23954, (long)(0x36620ECA7ED6F47FL ^ l)), (long)5316561956350352540L, (long)l))).getAsString();
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionDescriptor.a(customSystemException);
            }
        }
    }

    public JsonObject m() {
        long l = a ^ 0xDD07D609524L;
        JsonObject jsonObject = (JsonObject)SerializationOrchestrator.q.fromJson((JsonElement)this.o, JsonObject.class);
        try {
            if (jsonObject != null) {
                jsonObject.remove((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)18080, (long)(0x37FA206C4F62A619L ^ l)), (long)-9184676267516062243L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        return jsonObject;
    }

    @Nullable
    public Integer g() {
        return this.e;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int z() {
        return F;
    }

    public void F(@Nullable UUID uUID) {
        this.E = uUID;
    }

    public static void A(int n) {
        F = n;
    }

    public void C() {
        TemporalMetadataResolver.h.U().o(this);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TransactionDescriptor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void c(JsonObject jsonObject) {
        this.l();
        this.u(jsonObject);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransactionDescriptor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Deprecated
    public boolean W() {
        return this.H;
    }

    public void W(boolean bl) {
        this.Q = bl;
    }

    public void X() {
        TemporalMetadataResolver.h.U().X(this.L);
    }

    private static Field c(long l, long l2) {
        int n = TransactionDescriptor.a(l, l2);
        Object object = TransactionDescriptor.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = TransactionDescriptor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransactionDescriptor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransactionDescriptor.a(clazz3, string2, clazz2)) != null) {
                    TransactionDescriptor.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransactionDescriptor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransactionDescriptor.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransactionDescriptor.b(227050071596327L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public int v() {
        return this.P;
    }

    public TransactionDescriptor(String string, String string2) {
        this(string, string2, false);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = TransactionDescriptor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransactionDescriptor.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void L(long l) {
        this.N = l;
    }

    public long F() {
        return this.N;
    }

    @Override
    public String D() {
        long l = a ^ 0x40233AD5ED25L;
        return String.format((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)14668, (long)(0x2C2AD65552BCA1D2L ^ l)), (long)-538122518518829604L, (long)l)), DynamicContextBroker.u, DynamicContextBroker.u, this.t(), DynamicContextBroker.u, DynamicContextBroker.u, this.T());
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/BZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void l() {
        this.N = System.currentTimeMillis();
    }

    public JsonObject v(boolean bl) {
        long l = a ^ 0x38310C24AD46L;
        JsonObject jsonObject = new JsonObject();
        jsonObject.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)11808, (long)(0x7520945BA54276E6L ^ l)), (long)-5121916066196705857L, (long)l)), (JsonElement)TemporalMetadataResolver.h.U().N(bl));
        jsonObject.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)24385, (long)(0x77A01307BD66079DL ^ l)), (long)-5121916066196705857L, (long)l)), (JsonElement)TemporalMetadataResolver.h.S().d());
        jsonObject.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)29319, (long)(0x244AF4B8F453AA0AL ^ l)), (long)-5121916066196705857L, (long)l)), (JsonElement)TemporalMetadataResolver.h.Z().R());
        jsonObject.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)18198, (long)(0x68C792E153C11FF6L ^ l)), (long)-5121916066196705857L, (long)l)), (JsonElement)TemporalMetadataResolver.h.E().w());
        jsonObject.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)23319, (long)(0x5FED34997D0C83F9L ^ l)), (long)-5121916066196705857L, (long)l)), (JsonElement)TemporalMetadataResolver.h.m().u());
        jsonObject.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)24554, (long)(0x6E624FBDD3EA8761L ^ l)), (long)-5121916066196705857L, (long)l)), (JsonElement)GraphicalRenderingController.K.P());
        return jsonObject;
    }

    public void R(String string) {
        this.r = string;
        this.R = true;
    }

    public boolean T() {
        return this.Q;
    }

    private void u(JsonObject jsonObject) {
        long l = a ^ 0x193F4B4CCE55L;
        this.q = jsonObject;
        JsonArray jsonArray = EncryptionProtocolHandler397.q(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)5221, (long)(0x701A0BE6E6462F87L ^ l)), (long)-2596204823693832532L, (long)l)));
        try {
            if (jsonArray != null) {
                this.q.add((String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)19672, (long)(0x79AA65CCF6DE7704L ^ l)), (long)-2596204823693832532L, (long)l)), (JsonElement)jsonArray);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        JsonArray jsonArray2 = EncryptionProtocolHandler397.q(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)6452, (long)(0x4C8FE0E91D4422FAL ^ l)), (long)-2596204823693832532L, (long)l)));
        try {
            if (jsonArray2 != null) {
                this.q(jsonArray2, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        JsonObject jsonObject2 = EncryptionProtocolHandler397.F(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)5173, (long)(0x61FF04F566F82FECL ^ l)), (long)-2596204823693832532L, (long)l)));
        try {
            if (jsonObject2 != null) {
                this.z = jsonObject2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        JsonObject jsonObject3 = EncryptionProtocolHandler397.F(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)6959, (long)(0x15282C578B3A0F0L ^ l)), (long)-2596204823693832532L, (long)l)));
        try {
            if (jsonObject3 != null) {
                this.L = jsonObject3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
        Integer n = EncryptionProtocolHandler397.m(jsonObject, (String)((Object)TransactionDescriptor.c("\u00c7", (int)TransactionDescriptor.a("o", (int)25279, (long)(0x7969102FCFB0D94DL ^ l)), (long)-2596204823693832532L, (long)l)));
        try {
            if (n != null) {
                this.e = n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionDescriptor.a(customSystemException);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TransactionDescriptor.a(l, l2);
            object = TransactionDescriptor.l[n];
            try {
                if (!(object instanceof String)) break block2;
                TransactionDescriptor.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6025;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
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
                throw new RuntimeException("a/BZ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TransactionDescriptor.f[n2] = n3;
        }
        return f[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransactionDescriptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(TransactionDescriptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

