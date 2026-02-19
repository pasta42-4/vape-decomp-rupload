/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.ew;
import com.collections.management.MultiContainerRegistry;
import com.data.conversion.TemporalDataTransformer;
import com.data.serialization.SerializationOrchestrator;
import com.data.streaming.DataStreamOrchestrator629;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.identity.service.UniversalIdentificationService;
import com.security.protocol.EncryptionProtocolHandler397;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Ry {
    private static final Map f;
    @Nullable
    private TemporalDataTransformer h;
    private static final long c;
    private static final String[] j;
    private static final Integer[] e;
    private final long V;
    private static final long[] d;
    @Nullable
    private final Date g;
    private final long u;
    private long G;
    private long R;
    private final String B;
    private final Map<String, Object> s;
    private static final Object[] i;
    private String b;
    @Nullable
    private final ew C;
    private final DataStreamOrchestrator629<TemporalDataTransformer> q;
    private final String r;
    private final Date E;
    private static String Z;
    private final long M;
    @Nullable
    private final UniversalIdentificationService H;
    private final List<String> a;

    private static Field c(long l, long l2) {
        int n = Ry.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = Ry.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Ry.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Ry.a(clazz3, string2, clazz2)) != null) {
                    Ry.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Ry.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Ry.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Ry.b(273489280801268L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public List<String> o() {
        return this.a;
    }

    public static String c() {
        return Z;
    }

    public Map<String, Object> z() {
        return this.s;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Ry.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Ry.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "w\\Y";
        objectArray[1] = Integer.TYPE;
        Ry.j[1] = "java/lang/Integer";
        objectArray[2] = "?Qj+r\u001c4^{d\u000f\u0004'Yr-";
        objectArray[3] = "`\\\u0018L\b\u000bkS\t\u0003i\u0005`X\rY";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "sB-\u0013\u000ftn\u0011?s^w\u001c_t\u0018DulR&\u001655rCt\fMheC6s";
    }

    public Date u() {
        Date date;
        try {
            date = this.g != null ? this.g : this.E;
        }
        catch (RuntimeException runtimeException) {
            throw Ry.a(runtimeException);
        }
        return date;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Ry.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Ry.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ec' || c == 'g' || c == 'C' || c == '\u00d9') {
                field = Ry.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ec' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Ry.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'u' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public DataStreamOrchestrator629<TemporalDataTransformer> e() {
        return this.q;
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

    public void U(long l) {
        this.G = l;
    }

    Ry(long l, @Nullable ew ew2, String string, String string2, List<String> list, Map<String, Object> map, @Nullable String string3, long l2, long l3, long l4, long l5, Date date, @Nullable Date date2, @Nullable TemporalDataTransformer temporalDataTransformer, DataStreamOrchestrator629<TemporalDataTransformer> dataStreamOrchestrator629, @Nullable UniversalIdentificationService universalIdentificationService) {
        this.M = l;
        this.C = ew2;
        this.r = string;
        this.B = string2;
        this.a = list;
        this.s = map;
        this.b = string3;
        this.V = l2;
        this.R = l3;
        this.G = l4;
        this.u = l5;
        this.E = date;
        this.g = date2;
        this.h = temporalDataTransformer;
        this.q = dataStreamOrchestrator629;
        this.H = universalIdentificationService;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Nullable
    public Date A() {
        return this.g;
    }

    @Nullable
    public TemporalDataTransformer d() {
        return this.h;
    }

    public String e() {
        return this.r;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Ry.c = MultiContainerRegistry.a(-3640352446046336726L, -1488912407193303142L, MethodHandles.lookup().lookupClass()).a(67435912797755L);
                Ry.i = new Object[5];
                Ry.j = new String[5];
                Ry.a();
                Ry.f = new HashMap<K, V>(13);
                Ry.N("qu7Xdb");
                var0 = Ry.c ^ 109938380610761L;
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
                var8_3 = new long[27];
                var5_4 = 0;
                var6_5 = ",\u00df\u00e9\u0015f\u009c\u00db\u00f0g\u009d.\u00dfX\u00cec\u00b4\u00ff\u001fU\u00c9na\u00c9\u00b4\u00b9\u0007C-\u008e\u00a5\u00ff<\u00b7\u00bf4>.\u00c5\u008c&\u00c1\u0080\u001b]\u0083j*\u0080&\u00a6\u00bd\u0006\u0082\u00f4\u00df|\u00d4\u00e5H\u00b7\u00de\u00d2\u00fa\u009d\u0090\u0084\"\u001c\u00f4\u0099*\u00f8\u0012\u0095<_!\u00bb3 \u0002IiX\u00b1 \u0099\u0083bz\u00107.-\u0085\u000bMU\u0003\u00ad'\u00d6[7&|\u00c6\u0010x`\u00ccC\u00cd\u00ef\u00c0~\u00a23w)\u00ed\u0091`\u00b6\u0011\u00d0\u00b4\u00ae\u0091L\u00ee\u0094\u00feM\u00aax\u00a5\u00da\u00cf\u00fb\u00bf'\u0018\u00b52\u0085\u0005\u00bf\u00ff))\u0099\u00c6P\u00fep\u00ea<C\u00e4Vtb\u00dd5\u0091\u00e3\u00d9\u00ccY8\u00f4\u00e1\u00e6\u00ad\u0013\u00c4\u008a<\u0011\u00fb\u0012\u0095\u00a7t\u00a9\u000b\u00de\rq\u00f3\u001c\u009aJD\u00a4\u00b0\u00df!\u00d4";
                var7_6 = ",\u00df\u00e9\u0015f\u009c\u00db\u00f0g\u009d.\u00dfX\u00cec\u00b4\u00ff\u001fU\u00c9na\u00c9\u00b4\u00b9\u0007C-\u008e\u00a5\u00ff<\u00b7\u00bf4>.\u00c5\u008c&\u00c1\u0080\u001b]\u0083j*\u0080&\u00a6\u00bd\u0006\u0082\u00f4\u00df|\u00d4\u00e5H\u00b7\u00de\u00d2\u00fa\u009d\u0090\u0084\"\u001c\u00f4\u0099*\u00f8\u0012\u0095<_!\u00bb3 \u0002IiX\u00b1 \u0099\u0083bz\u00107.-\u0085\u000bMU\u0003\u00ad'\u00d6[7&|\u00c6\u0010x`\u00ccC\u00cd\u00ef\u00c0~\u00a23w)\u00ed\u0091`\u00b6\u0011\u00d0\u00b4\u00ae\u0091L\u00ee\u0094\u00feM\u00aax\u00a5\u00da\u00cf\u00fb\u00bf'\u0018\u00b52\u0085\u0005\u00bf\u00ff))\u0099\u00c6P\u00fep\u00ea<C\u00e4Vtb\u00dd5\u0091\u00e3\u00d9\u00ccY8\u00f4\u00e1\u00e6\u00ad\u0013\u00c4\u008a<\u0011\u00fb\u0012\u0095\u00a7t\u00a9\u000b\u00de\rq\u00f3\u001c\u009aJD\u00a4\u00b0\u00df!\u00d4".length();
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
                    var6_5 = "\u00e2];w[v\u00c2\u00ba\u00e8T\u00c9eC\u00ca3_";
                    var7_6 = "\u00e2];w[v\u00c2\u00ba\u00e8T\u00c9eC\u00ca3_".length();
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
        Ry.d = var8_3;
        Ry.e = new Integer[27];
    }

    public long H() {
        return this.M;
    }

    public long t() {
        return this.V;
    }

    public String toString() {
        long l = c ^ 0x43670D9D3E37L;
        return (String)((Object)Ry.b("u", (int)Ry.a("j", (int)20241, (long)(0xA8C8708DACCB8B6L ^ l)), (long)2330175641529712593L, (long)l)) + this.M + (String)((Object)Ry.b("u", (int)Ry.a("j", (int)13927, (long)(0x43973FAC55CD41C3L ^ l)), (long)2330175641529712593L, (long)l)) + this.C + (String)((Object)Ry.b("u", (int)Ry.a("j", (int)10790, (long)(0x2F8C4825B0D45D84L ^ l)), (long)2330175641529712593L, (long)l)) + this.r + '\'' + (String)((Object)Ry.b("u", (int)Ry.a("j", (int)27008, (long)(0x60F0117D68869E37L ^ l)), (long)2330175641529712593L, (long)l)) + this.B + '\'' + (String)((Object)Ry.b("u", (int)Ry.a("j", (int)2394, (long)(0x79FE8C54C0BC7EECL ^ l)), (long)2330175641529712593L, (long)l)) + this.a + (String)((Object)Ry.b("u", (int)Ry.a("j", (int)20306, (long)(0x1C3647900BA338FBL ^ l)), (long)2330175641529712593L, (long)l)) + this.s + (String)((Object)Ry.b("u", (int)Ry.a("j", (int)6106, (long)(0x5D27FB0DE252E062L ^ l)), (long)2330175641529712593L, (long)l)) + this.V + (String)((Object)Ry.b("u", (int)Ry.a("j", (int)17361, (long)(0x4EF054E246413465L ^ l)), (long)2330175641529712593L, (long)l)) + this.R + (String)((Object)Ry.b("u", (int)Ry.a("j", (int)10147, (long)(0x45AFF8A4C3FD00BL ^ l)), (long)2330175641529712593L, (long)l)) + this.G + (String)((Object)Ry.b("u", (int)Ry.a("j", (int)31927, (long)(0x77FD2CF6149A0B12L ^ l)), (long)2330175641529712593L, (long)l)) + this.q + '}';
    }

    public String G() {
        return this.B;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = Ry.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x57F5;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ry", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ry.e[n2] = n3;
        }
        return e[n2];
    }

    public void E(long l) {
        this.R = l;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ry" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ry" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public String b() {
        return this.b.toUpperCase();
    }

    public long j() {
        int n;
        long l;
        try {
            l = this.e().L();
            n = this.d() != null ? 1 : 0;
        }
        catch (RuntimeException runtimeException) {
            throw Ry.a(runtimeException);
        }
        return l + (long)n;
    }

    @Nullable
    public UniversalIdentificationService G() {
        return this.H;
    }

    private static Method d(long l, long l2) {
        int n = Ry.a(l, l2);
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
                clazz3 = Ry.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = Ry.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Ry.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        Ry.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Ry.b(273489280801268L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = Ry.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        Ry.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Ry.b(273489280801268L, 0L);
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

    public static void N(String string) {
        Z = string;
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
                n3 = 8;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 56;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 21;
                break;
            }
            case 5: {
                n3 = 29;
                break;
            }
            case 6: {
                n3 = 45;
                break;
            }
            case 7: {
                n3 = 34;
                break;
            }
            case 8: {
                n3 = 18;
                break;
            }
            case 9: {
                n3 = 2;
                break;
            }
            case 10: {
                n3 = 49;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 1;
                break;
            }
            case 13: {
                n3 = 43;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 33;
                break;
            }
            case 16: {
                n3 = 44;
                break;
            }
            case 17: {
                n3 = 37;
                break;
            }
            case 18: {
                n3 = 57;
                break;
            }
            case 19: {
                n3 = 61;
                break;
            }
            case 20: {
                n3 = 0;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 58;
                break;
            }
            case 23: {
                n3 = 53;
                break;
            }
            case 24: {
                n3 = 47;
                break;
            }
            case 25: {
                n3 = 25;
                break;
            }
            case 26: {
                n3 = 4;
                break;
            }
            case 27: {
                n3 = 5;
                break;
            }
            case 28: {
                n3 = 23;
                break;
            }
            case 29: {
                n3 = 38;
                break;
            }
            case 30: {
                n3 = 7;
                break;
            }
            case 31: {
                n3 = 19;
                break;
            }
            case 32: {
                n3 = 40;
                break;
            }
            case 33: {
                n3 = 14;
                break;
            }
            case 34: {
                n3 = 35;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 28;
                break;
            }
            case 37: {
                n3 = 6;
                break;
            }
            case 38: {
                n3 = 54;
                break;
            }
            case 39: {
                n3 = 51;
                break;
            }
            case 40: {
                n3 = 26;
                break;
            }
            case 41: {
                n3 = 27;
                break;
            }
            case 42: {
                n3 = 20;
                break;
            }
            case 43: {
                n3 = 36;
                break;
            }
            case 44: {
                n3 = 52;
                break;
            }
            case 45: {
                n3 = 31;
                break;
            }
            case 46: {
                n3 = 46;
                break;
            }
            case 47: {
                n3 = 9;
                break;
            }
            case 48: {
                n3 = 3;
                break;
            }
            case 49: {
                n3 = 60;
                break;
            }
            case 50: {
                n3 = 63;
                break;
            }
            case 51: {
                n3 = 10;
                break;
            }
            case 52: {
                n3 = 59;
                break;
            }
            case 53: {
                n3 = 15;
                break;
            }
            case 54: {
                n3 = 41;
                break;
            }
            case 55: {
                n3 = 39;
                break;
            }
            case 56: {
                n3 = 50;
                break;
            }
            case 57: {
                n3 = 42;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 12;
                break;
            }
            case 60: {
                n3 = 62;
                break;
            }
            case 61: {
                n3 = 48;
                break;
            }
            case 62: {
                n3 = 13;
                break;
            }
            default: {
                n3 = 24;
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
        Ry.j[n4] = new String(cArray);
        return n4;
    }

    public void J(String string) {
        this.b = string;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    @Contract(value="!null -> !null; null -> null")
    public static Ry R(@Nullable JsonElement jsonElement) {
        long l;
        block9: {
            l = c ^ 0x1E17536CEE3L;
            if (jsonElement == null) return null;
            try {
                if (!jsonElement.isJsonNull()) break block9;
                return null;
                catch (ParseException parseException) {
                    throw Ry.a(parseException);
                }
            }
            catch (ParseException parseException) {
                throw Ry.a(parseException);
            }
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (JsonElement jsonElement2 : jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)21181, (long)(0x5510110C22A855C4L ^ l)), (long)-3422119028065399035L, (long)l))).getAsJsonArray()) {
            arrayList.add(jsonElement2.getAsString());
        }
        try {
            TemporalDataTransformer temporalDataTransformer;
            Date date;
            Date date2;
            long l2;
            long l3;
            long l4;
            long l5;
            String string;
            Map map;
            ArrayList<String> arrayList2;
            String string2;
            String string3;
            ew ew2;
            long l6;
            Ry ry;
            Ry ry2;
            try {
                Ry ry3;
                ry2 = ry3;
                ry = ry3;
                l6 = jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)22505, (long)(0x3A54E7DEF5FE5087L ^ l)), (long)-3422119028065399035L, (long)l))).getAsLong();
                ew2 = ew.m(jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)23763, (long)(0x15E90AD97D9E5BA9L ^ l)), (long)-3422119028065399035L, (long)l))));
                string3 = jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)8601, (long)(0x3EAAFB217A96A6EEL ^ l)), (long)-3422119028065399035L, (long)l))).getAsString();
                string2 = jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)18864, (long)(0x8C26447DBDB4ED4L ^ l)), (long)-3422119028065399035L, (long)l))).getAsString();
                arrayList2 = arrayList;
                map = (Map)SerializationOrchestrator.q.fromJson(jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)14034, (long)(0x1F84EF246677B1B7L ^ l)), (long)-3422119028065399035L, (long)l))), Map.class);
                string = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)Ry.b("u", (int)Ry.a("j", (int)24809, (long)(0x56B3B32241606786L ^ l)), (long)-3422119028065399035L, (long)l)));
                l5 = jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)23700, (long)(0x75A2079DF6E0DBE0L ^ l)), (long)-3422119028065399035L, (long)l))).getAsLong();
                l4 = jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)17154, (long)(0x5E493F21C288C470L ^ l)), (long)-3422119028065399035L, (long)l))).getAsLong();
                l3 = jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)29966, (long)(0x5B3FBBD847867269L ^ l)), (long)-3422119028065399035L, (long)l))).getAsLong();
                l2 = jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)18547, (long)(0x3FE63EB7402BCF12L ^ l)), (long)-3422119028065399035L, (long)l))).getAsLong();
                date2 = SerializationOrchestrator.k(jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)9501, (long)(0x2F69DFD85DCA2263L ^ l)), (long)-3422119028065399035L, (long)l))).getAsString());
                date = SerializationOrchestrator.k(EncryptionProtocolHandler397.g(jsonObject, (String)((Object)Ry.b("u", (int)Ry.a("j", (int)4004, (long)(0xCBA27280F3988C2L ^ l)), (long)-3422119028065399035L, (long)l))));
                temporalDataTransformer = jsonObject.has((String)((Object)Ry.b("u", (int)Ry.a("j", (int)21246, (long)(0x473113F30A765585L ^ l)), (long)-3422119028065399035L, (long)l))) ? TemporalDataTransformer.f(jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)2583, (long)(0x15FFDB7D78580D68L ^ l)), (long)-3422119028065399035L, (long)l)))) : null;
            }
            catch (ParseException parseException) {
                throw Ry.a(parseException);
            }
            ry2(l6, ew2, string3, string2, arrayList2, map, string, l5, l4, l3, l2, date2, date, temporalDataTransformer, DataStreamOrchestrator629.p(jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)27257, (long)(0x1AF8FD0B26F86D0CL ^ l)), (long)-3422119028065399035L, (long)l))).getAsJsonObject(), TemporalDataTransformer::f), UniversalIdentificationService.o(jsonObject.get((String)((Object)Ry.b("u", (int)Ry.a("j", (int)30414, (long)(0x5CA281002AB3F1B6L ^ l)), (long)-3422119028065399035L, (long)l)))));
            return ry;
        }
        catch (ParseException parseException) {
            throw new RuntimeException(parseException);
        }
    }

    public long B() {
        return this.R;
    }

    @Nullable
    public ew E() {
        return this.C;
    }

    public void N(@Nullable TemporalDataTransformer temporalDataTransformer) {
        this.h = temporalDataTransformer;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = Ry.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Ry.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                Ry.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public int U() {
        long l = this.j();
        try {
            if (l == 0L) {
                return 0;
            }
        }
        catch (RuntimeException runtimeException) {
            throw Ry.a(runtimeException);
        }
        return (int)((double)this.B() / (double)l * 100.0);
    }

    public Date Z() {
        return this.E;
    }

    public long b() {
        return this.u;
    }

    public long l() {
        return this.G;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Ry.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Ry.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

