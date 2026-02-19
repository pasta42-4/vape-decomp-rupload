/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Io;
import a.OL;
import a.O_;
import a.SE;
import a.Yw;
import a._N;
import a.a;
import a.d8;
import a.eA;
import a.ei;
import a.vM;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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

public class ep
extends eA
implements Cloneable {
    private static final Object[] e;
    private static final String[] f;
    private final List<Io> h;
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

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = ep.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                ep.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = ep.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public ei D(Yw yw2) {
        ei ei2;
        block3: {
            block2: {
                ei2 = new ei(this);
                boolean bl2 = yw2 instanceof vM;
                try {
                    yw2.e(ei2);
                    if (!bl2) break block2;
                    SE.h.w().m().n(null, ei2);
                    break block3;
                }
                catch (O_ o_2) {
                    throw ep.b(o_2);
                }
            }
            SE.h.w().u().n(null, ei2);
        }
        return ei2;
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

    public ep(ei ei2) {
        this(ei2.t());
        this.q = UUID.randomUUID();
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0003\u0011&";
        objectArray[1] = Integer.TYPE;
        ep.f[1] = "java/lang/Integer";
        objectArray[2] = "\u000b\u001c@\t z\u0000\u0013QF]b\u0013\u0014X\u000f";
        objectArray[3] = "\u000eun@\u0018\"\u0005z\u007f\u000fy,\u000eq{U";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0018~=7pC\u001di6\u0006!Q#.=t#\u0016Y-7yr*\u001ay2}+J\u001b(;>J";
    }

    @Override
    public List<Io> E() {
        return this.h;
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

    public ep(boolean bl2) {
        this(null, "");
        this.F(bl2);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = ep.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = ep.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public ep(JsonObject jsonObject) {
        long l10 = a ^ 0x1800A0DE0AE1L;
        this(OL.t(jsonObject, a.a.cs((int)ep.a("z", (int)15682, (long)(0x700DB88A09FC4C52L ^ l10)))), jsonObject.get(a.a.cs((int)ep.a("z", (int)19446, (long)(0x6905B375F173BAE8L ^ l10)))).getAsString());
        JsonArray jsonArray = jsonObject.getAsJsonArray((String)((Object)ep.b("\u00ee", (int)ep.a("z", (int)16386, (long)(0x16098C2356D23116L ^ l10)), (long)7397237364955105937L, (long)l10)));
        for (JsonElement jsonElement : jsonArray) {
            this.B(new Io(jsonElement.getAsJsonObject()));
        }
    }

    public void Q(Io io2) {
        this.h.remove(io2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ep.a = d8.a(-2261249031755428812L, -5531798771679870280L, MethodHandles.lookup().lookupClass()).a(188543441236892L);
                ep.e = new Object[5];
                ep.f = new String[5];
                ep.a();
                ep.d = new HashMap<K, V>(13);
                var0 = ep.a ^ 54072312466245L;
                ep.R(null);
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
        ep.b = var8_3;
        ep.c = new Integer[9];
    }

    public ep r() {
        ep ep2 = new ep(this.u(), this.O());
        for (Io io2 : this.h) {
            ep2.B(io2.L());
        }
        return ep2;
    }

    public void B(Io io2) {
        this.h.add(io2);
    }

    public static String[] I() {
        return Z;
    }

    ep(@Nullable UUID uUID, String string) {
        super(string);
        this.h = new ArrayList<Io>();
        this.q = uUID != null ? uUID : UUID.randomUUID();
    }

    private static O_ b(O_ o_2) {
        return o_2;
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
                n4 = 12;
                break;
            }
            case 1: {
                n4 = 50;
                break;
            }
            case 2: {
                n4 = 43;
                break;
            }
            case 3: {
                n4 = 59;
                break;
            }
            case 4: {
                n4 = 37;
                break;
            }
            case 5: {
                n4 = 22;
                break;
            }
            case 6: {
                n4 = 0;
                break;
            }
            case 7: {
                n4 = 26;
                break;
            }
            case 8: {
                n4 = 13;
                break;
            }
            case 9: {
                n4 = 33;
                break;
            }
            case 10: {
                n4 = 25;
                break;
            }
            case 11: {
                n4 = 23;
                break;
            }
            case 12: {
                n4 = 11;
                break;
            }
            case 13: {
                n4 = 52;
                break;
            }
            case 14: {
                n4 = 10;
                break;
            }
            case 15: {
                n4 = 51;
                break;
            }
            case 16: {
                n4 = 48;
                break;
            }
            case 17: {
                n4 = 47;
                break;
            }
            case 18: {
                n4 = 58;
                break;
            }
            case 19: {
                n4 = 24;
                break;
            }
            case 20: {
                n4 = 3;
                break;
            }
            case 21: {
                n4 = 56;
                break;
            }
            case 22: {
                n4 = 1;
                break;
            }
            case 23: {
                n4 = 19;
                break;
            }
            case 24: {
                n4 = 41;
                break;
            }
            case 25: {
                n4 = 49;
                break;
            }
            case 26: {
                n4 = 63;
                break;
            }
            case 27: {
                n4 = 16;
                break;
            }
            case 28: {
                n4 = 28;
                break;
            }
            case 29: {
                n4 = 39;
                break;
            }
            case 30: {
                n4 = 55;
                break;
            }
            case 31: {
                n4 = 27;
                break;
            }
            case 32: {
                n4 = 42;
                break;
            }
            case 33: {
                n4 = 46;
                break;
            }
            case 34: {
                n4 = 30;
                break;
            }
            case 35: {
                n4 = 53;
                break;
            }
            case 36: {
                n4 = 31;
                break;
            }
            case 37: {
                n4 = 40;
                break;
            }
            case 38: {
                n4 = 2;
                break;
            }
            case 39: {
                n4 = 14;
                break;
            }
            case 40: {
                n4 = 32;
                break;
            }
            case 41: {
                n4 = 54;
                break;
            }
            case 42: {
                n4 = 29;
                break;
            }
            case 43: {
                n4 = 36;
                break;
            }
            case 44: {
                n4 = 21;
                break;
            }
            case 45: {
                n4 = 44;
                break;
            }
            case 46: {
                n4 = 45;
                break;
            }
            case 47: {
                n4 = 61;
                break;
            }
            case 48: {
                n4 = 6;
                break;
            }
            case 49: {
                n4 = 8;
                break;
            }
            case 50: {
                n4 = 15;
                break;
            }
            case 51: {
                n4 = 62;
                break;
            }
            case 52: {
                n4 = 5;
                break;
            }
            case 53: {
                n4 = 17;
                break;
            }
            case 54: {
                n4 = 4;
                break;
            }
            case 55: {
                n4 = 57;
                break;
            }
            case 56: {
                n4 = 20;
                break;
            }
            case 57: {
                n4 = 9;
                break;
            }
            case 58: {
                n4 = 38;
                break;
            }
            case 59: {
                n4 = 60;
                break;
            }
            case 60: {
                n4 = 35;
                break;
            }
            case 61: {
                n4 = 18;
                break;
            }
            case 62: {
                n4 = 34;
                break;
            }
            default: {
                n4 = 7;
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
        ep.f[n5] = new String(cArray);
        return n5;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = ep.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x17BF;
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
                throw new RuntimeException("a/ep", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ep.c[n3] = n4;
        }
        return c[n3];
    }

    public void F(boolean bl2) {
        _N _N2;
        CallSite callSite;
        StringBuilder stringBuilder;
        long l10 = a ^ 0x75C2DE5C3BDBL;
        try {
            stringBuilder = new StringBuilder();
            callSite = bl2 ? ep.b("\u00ee", (int)ep.a("z", (int)25152, (long)(0x17D245ED915FA268L ^ l10)), (long)6310152149672623019L, (long)l10) : ep.b("\u00ee", (int)ep.a("z", (int)5049, (long)(0x3CB7AC01728F5396L ^ l10)), (long)6310152149672623019L, (long)l10);
        }
        catch (O_ o_2) {
            throw ep.b(o_2);
        }
        String string = stringBuilder.append((String)((Object)callSite)).append((String)((Object)ep.b("\u00ee", (int)ep.a("z", (int)26731, (long)(0x5FFCFA17B725A846L ^ l10)), (long)6310152149672623019L, (long)l10))).toString();
        int n2 = 1;
        try {
            _N2 = !bl2 ? SE.h.w().m() : SE.h.w().u();
        }
        catch (O_ o_3) {
            throw ep.b(o_3);
        }
        for (ep ep2 : _N2.x()) {
            try {
                if (!ep2.O().equalsIgnoreCase(string + n2)) {
                    continue;
                }
            }
            catch (O_ o_4) {
                throw ep.b(o_4);
            }
            ++n2;
        }
        this.g = string + n2;
    }

    public static void R(String[] stringArray) {
        Z = stringArray;
    }

    public JsonObject t() {
        long l10 = a ^ 0x826E3BAECB5L;
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (Io io2 : this.h) {
            jsonArray.add((JsonElement)io2.l());
        }
        jsonObject.addProperty((String)((Object)ep.b("\u00ee", (int)ep.a("z", (int)20613, (long)(0x459A0A98E00647C0L ^ l10)), (long)-9152347886271222587L, (long)l10)), this.q.toString());
        jsonObject.addProperty((String)((Object)ep.b("\u00ee", (int)ep.a("z", (int)6017, (long)(0x12454514A34500C3L ^ l10)), (long)-9152347886271222587L, (long)l10)), this.O());
        jsonObject.add((String)((Object)ep.b("\u00ee", (int)ep.a("z", (int)10719, (long)(0x79701D5155A3E98L ^ l10)), (long)-9152347886271222587L, (long)l10)), (JsonElement)jsonArray);
        return jsonObject;
    }

    private static Field c(long l10, long l11) {
        int n2 = ep.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = ep.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = ep.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ep.a(clazz3, string2, clazz2)) != null) {
                    ep.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = ep.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        ep.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ep.b(232312963440083L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l10, long l11) {
        int n2 = ep.a(l10, l11);
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
                clazz3 = ep.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = ep.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ep.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        ep.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ep.b(232312963440083L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = ep.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        ep.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ep.b(232312963440083L, 0L);
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ep.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = ep.b(classArray[i10], string, clazz2);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00ef' || c10 == 'A' || c10 == '\u00cb' || c10 == 'H') {
                field = ep.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'A' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ep.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ee' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            return MethodHandles.lookup().findStatic(ep.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ep.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

