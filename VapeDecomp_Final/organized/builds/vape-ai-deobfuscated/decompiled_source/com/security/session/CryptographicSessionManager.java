/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package com.security.session;

import a.Yw;
import a.a;
import a.vM;
import com.app.network.response.ResponseHandlingStrategy;
import com.collections.management.MultiContainerRegistry;
import com.data.registry.DynamicEntityRegistry;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.logging.interceptor.LoggingInterceptor;
import com.security.context.ReplicableSecurityContext;
import com.security.protocol.EncryptionProtocolHandler397;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class CryptographicSessionManager
extends LoggingInterceptor
implements Cloneable {
    private static final Object[] e;
    private static final String[] f;
    private final List<ReplicableSecurityContext> h;
    private static final long a;
    protected UUID q;
    private static final long[] b;
    private static final Integer[] c;
    private static String[] Z;
    private static final Map d;

    public UUID u() {
        return this.q;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ep" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicSessionManager.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicSessionManager.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicSessionManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public ResponseHandlingStrategy D(Yw yw) {
        ResponseHandlingStrategy responseHandlingStrategy;
        block3: {
            block2: {
                responseHandlingStrategy = new ResponseHandlingStrategy(this);
                boolean bl = yw instanceof vM;
                try {
                    yw.e(responseHandlingStrategy);
                    if (!bl) break block2;
                    TemporalMetadataResolver.h.w().m().n(null, responseHandlingStrategy);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicSessionManager.b(customSystemException);
                }
            }
            TemporalMetadataResolver.h.w().u().n(null, responseHandlingStrategy);
        }
        return responseHandlingStrategy;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void x(String string) {
        this.g = string;
    }

    public CryptographicSessionManager(ResponseHandlingStrategy responseHandlingStrategy) {
        this(responseHandlingStrategy.t());
        this.q = UUID.randomUUID();
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0003\u0011&";
        objectArray[1] = Integer.TYPE;
        CryptographicSessionManager.f[1] = "java/lang/Integer";
        objectArray[2] = "\u000b\u001c@\t z\u0000\u0013QF]b\u0013\u0014X\u000f";
        objectArray[3] = "\u000eun@\u0018\"\u0005z\u007f\u000fy,\u000eq{U";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0018~=7pC\u001di6\u0006!Q#.=t#\u0016Y-7yr*\u001ay2}+J\u001b(;>J";
    }

    @Override
    public List<ReplicableSecurityContext> E() {
        return this.h;
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

    public CryptographicSessionManager(boolean bl) {
        this(null, "");
        this.F(bl);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicSessionManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicSessionManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public CryptographicSessionManager(JsonObject jsonObject) {
        long l = a ^ 0x1800A0DE0AE1L;
        this(EncryptionProtocolHandler397.t(jsonObject, a.a.cs((int)CryptographicSessionManager.a("z", (int)15682, (long)(0x700DB88A09FC4C52L ^ l)))), jsonObject.get(a.a.cs((int)CryptographicSessionManager.a("z", (int)19446, (long)(0x6905B375F173BAE8L ^ l)))).getAsString());
        JsonArray jsonArray = jsonObject.getAsJsonArray((String)((Object)CryptographicSessionManager.b("\u00ee", (int)CryptographicSessionManager.a("z", (int)16386, (long)(0x16098C2356D23116L ^ l)), (long)7397237364955105937L, (long)l)));
        for (JsonElement jsonElement : jsonArray) {
            this.B(new ReplicableSecurityContext(jsonElement.getAsJsonObject()));
        }
    }

    public void Q(ReplicableSecurityContext replicableSecurityContext) {
        this.h.remove(replicableSecurityContext);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicSessionManager.a = MultiContainerRegistry.a(-2261249031755428812L, -5531798771679870280L, MethodHandles.lookup().lookupClass()).a(188543441236892L);
                CryptographicSessionManager.e = new Object[5];
                CryptographicSessionManager.f = new String[5];
                CryptographicSessionManager.a();
                CryptographicSessionManager.d = new HashMap<K, V>(13);
                var0 = CryptographicSessionManager.a ^ 54072312466245L;
                CryptographicSessionManager.R(null);
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00cb\u00f2\u0097\u00918&\u0011-d\u00f3*\u00c4\u00f6\u00a9{;\u00f1 <\u00ca\u0090\u00e2\u00a8\u0014\u00a1`F\u00deJB\u00db*dM\u00d6\u00ba\u00f1&]\u00a2b\u0010Z\u00c7r\u001c\u0099\u009a\u001e\u009c@\u0094L\u009d\u00f7e";
                var7_6 = "\u00cb\u00f2\u0097\u00918&\u0011-d\u00f3*\u00c4\u00f6\u00a9{;\u00f1 <\u00ca\u0090\u00e2\u00a8\u0014\u00a1`F\u00deJB\u00db*dM\u00d6\u00ba\u00f1&]\u00a2b\u0010Z\u00c7r\u001c\u0099\u009a\u001e\u009c@\u0094L\u009d\u00f7e".length();
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
                    var6_5 = "\u00d3)lXW\u00dc\u0092\u00e1\u00da\u00802\u00f4^\u00f7\u00f0_";
                    var7_6 = "\u00d3)lXW\u00dc\u0092\u00e1\u00da\u00802\u00f4^\u00f7\u00f0_".length();
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
        CryptographicSessionManager.b = var8_3;
        CryptographicSessionManager.c = new Integer[9];
    }

    public CryptographicSessionManager r() {
        CryptographicSessionManager cryptographicSessionManager = new CryptographicSessionManager(this.u(), this.O());
        for (ReplicableSecurityContext replicableSecurityContext : this.h) {
            cryptographicSessionManager.B(replicableSecurityContext.L());
        }
        return cryptographicSessionManager;
    }

    public void B(ReplicableSecurityContext replicableSecurityContext) {
        this.h.add(replicableSecurityContext);
    }

    public static String[] I() {
        return Z;
    }

    CryptographicSessionManager(@Nullable UUID uUID, String string) {
        super(string);
        this.h = new ArrayList<ReplicableSecurityContext>();
        this.q = uUID != null ? uUID : UUID.randomUUID();
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
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
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 50;
                break;
            }
            case 2: {
                n3 = 43;
                break;
            }
            case 3: {
                n3 = 59;
                break;
            }
            case 4: {
                n3 = 37;
                break;
            }
            case 5: {
                n3 = 22;
                break;
            }
            case 6: {
                n3 = 0;
                break;
            }
            case 7: {
                n3 = 26;
                break;
            }
            case 8: {
                n3 = 13;
                break;
            }
            case 9: {
                n3 = 33;
                break;
            }
            case 10: {
                n3 = 25;
                break;
            }
            case 11: {
                n3 = 23;
                break;
            }
            case 12: {
                n3 = 11;
                break;
            }
            case 13: {
                n3 = 52;
                break;
            }
            case 14: {
                n3 = 10;
                break;
            }
            case 15: {
                n3 = 51;
                break;
            }
            case 16: {
                n3 = 48;
                break;
            }
            case 17: {
                n3 = 47;
                break;
            }
            case 18: {
                n3 = 58;
                break;
            }
            case 19: {
                n3 = 24;
                break;
            }
            case 20: {
                n3 = 3;
                break;
            }
            case 21: {
                n3 = 56;
                break;
            }
            case 22: {
                n3 = 1;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 41;
                break;
            }
            case 25: {
                n3 = 49;
                break;
            }
            case 26: {
                n3 = 63;
                break;
            }
            case 27: {
                n3 = 16;
                break;
            }
            case 28: {
                n3 = 28;
                break;
            }
            case 29: {
                n3 = 39;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 27;
                break;
            }
            case 32: {
                n3 = 42;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 30;
                break;
            }
            case 35: {
                n3 = 53;
                break;
            }
            case 36: {
                n3 = 31;
                break;
            }
            case 37: {
                n3 = 40;
                break;
            }
            case 38: {
                n3 = 2;
                break;
            }
            case 39: {
                n3 = 14;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 54;
                break;
            }
            case 42: {
                n3 = 29;
                break;
            }
            case 43: {
                n3 = 36;
                break;
            }
            case 44: {
                n3 = 21;
                break;
            }
            case 45: {
                n3 = 44;
                break;
            }
            case 46: {
                n3 = 45;
                break;
            }
            case 47: {
                n3 = 61;
                break;
            }
            case 48: {
                n3 = 6;
                break;
            }
            case 49: {
                n3 = 8;
                break;
            }
            case 50: {
                n3 = 15;
                break;
            }
            case 51: {
                n3 = 62;
                break;
            }
            case 52: {
                n3 = 5;
                break;
            }
            case 53: {
                n3 = 17;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 57;
                break;
            }
            case 56: {
                n3 = 20;
                break;
            }
            case 57: {
                n3 = 9;
                break;
            }
            case 58: {
                n3 = 38;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 35;
                break;
            }
            case 61: {
                n3 = 18;
                break;
            }
            case 62: {
                n3 = 34;
                break;
            }
            default: {
                n3 = 7;
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
        CryptographicSessionManager.f[n4] = new String(cArray);
        return n4;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicSessionManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x17BF;
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
                throw new RuntimeException("a/ep", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicSessionManager.c[n2] = n3;
        }
        return c[n2];
    }

    public void F(boolean bl) {
        DynamicEntityRegistry dynamicEntityRegistry;
        CallSite callSite;
        StringBuilder stringBuilder;
        long l = a ^ 0x75C2DE5C3BDBL;
        try {
            stringBuilder = new StringBuilder();
            callSite = bl ? CryptographicSessionManager.b("\u00ee", (int)CryptographicSessionManager.a("z", (int)25152, (long)(0x17D245ED915FA268L ^ l)), (long)6310152149672623019L, (long)l) : CryptographicSessionManager.b("\u00ee", (int)CryptographicSessionManager.a("z", (int)5049, (long)(0x3CB7AC01728F5396L ^ l)), (long)6310152149672623019L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager.b(customSystemException);
        }
        String string = stringBuilder.append((String)((Object)callSite)).append((String)((Object)CryptographicSessionManager.b("\u00ee", (int)CryptographicSessionManager.a("z", (int)26731, (long)(0x5FFCFA17B725A846L ^ l)), (long)6310152149672623019L, (long)l))).toString();
        int n = 1;
        try {
            dynamicEntityRegistry = !bl ? TemporalMetadataResolver.h.w().m() : TemporalMetadataResolver.h.w().u();
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager.b(customSystemException);
        }
        for (CryptographicSessionManager cryptographicSessionManager : dynamicEntityRegistry.x()) {
            try {
                if (!cryptographicSessionManager.O().equalsIgnoreCase(string + n)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicSessionManager.b(customSystemException);
            }
            ++n;
        }
        this.g = string + n;
    }

    public static void R(String[] stringArray) {
        Z = stringArray;
    }

    public JsonObject t() {
        long l = a ^ 0x826E3BAECB5L;
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (ReplicableSecurityContext replicableSecurityContext : this.h) {
            jsonArray.add((JsonElement)replicableSecurityContext.l());
        }
        jsonObject.addProperty((String)((Object)CryptographicSessionManager.b("\u00ee", (int)CryptographicSessionManager.a("z", (int)20613, (long)(0x459A0A98E00647C0L ^ l)), (long)-9152347886271222587L, (long)l)), this.q.toString());
        jsonObject.addProperty((String)((Object)CryptographicSessionManager.b("\u00ee", (int)CryptographicSessionManager.a("z", (int)6017, (long)(0x12454514A34500C3L ^ l)), (long)-9152347886271222587L, (long)l)), this.O());
        jsonObject.add((String)((Object)CryptographicSessionManager.b("\u00ee", (int)CryptographicSessionManager.a("z", (int)10719, (long)(0x79701D5155A3E98L ^ l)), (long)-9152347886271222587L, (long)l)), (JsonElement)jsonArray);
        return jsonObject;
    }

    private static Field c(long l, long l2) {
        int n = CryptographicSessionManager.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicSessionManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicSessionManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicSessionManager.a(clazz3, string2, clazz2)) != null) {
                    CryptographicSessionManager.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicSessionManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicSessionManager.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicSessionManager.b(232312963440083L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = CryptographicSessionManager.a(l, l2);
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
                clazz3 = CryptographicSessionManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicSessionManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicSessionManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicSessionManager.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicSessionManager.b(232312963440083L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicSessionManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicSessionManager.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicSessionManager.b(232312963440083L, 0L);
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptographicSessionManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicSessionManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ep" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ef' || c == 'A' || c == '\u00cb' || c == 'H') {
                field = CryptographicSessionManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicSessionManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ee' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicSessionManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicSessionManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

