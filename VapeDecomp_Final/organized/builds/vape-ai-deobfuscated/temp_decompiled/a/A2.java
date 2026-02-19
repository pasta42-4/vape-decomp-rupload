/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package a;

import a.Bw;
import a.OL;
import a.OT;
import a.O_;
import a.Oq;
import a.Sy;
import a.WU;
import a.d8;
import a.jE;
import a.jn;
import a.xi;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a2
implements Sy {
    private static final long[] b;
    private boolean i;
    private boolean L;
    private final xi m;
    private static final long a;
    private static final String[] f;
    private final WU<jn, Bw> U;
    private final JsonObject r;
    private static final Object[] e;
    private static final Map d;
    private final OT y;
    private static final Integer[] c;
    private final List<WU<?, ?>> W;

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = a2.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                a2.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public String A() {
        return this.U.T().t();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = a2.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = a2.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean Q() {
        try {
            if (this.m.t() == Oq.p) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw a2.a(o_2);
        }
        for (WU<?, ?> wU2 : this.o()) {
            try {
                if (wU2.p()) continue;
                return true;
            }
            catch (O_ o_3) {
                throw a2.a(o_3);
            }
        }
        try {
            if (this.M()) {
                return true;
            }
        }
        catch (O_ o_4) {
            throw a2.a(o_4);
        }
        try {
            if (this.S()) {
                return true;
            }
        }
        catch (O_ o_5) {
            throw a2.a(o_5);
        }
        return false;
    }

    public WU<jn, Bw> u() {
        return this.U;
    }

    public a2(OT oT2, xi xi2, JsonObject jsonObject) {
        JsonArray jsonArray;
        Object object;
        JsonElement jsonElement;
        LinkedHashMap<String, JsonObject> linkedHashMap;
        block21: {
            long l10 = a ^ 0x6A3974ACA9C6L;
            this.y = oT2;
            this.m = xi2;
            this.W = new ArrayList();
            this.r = jsonObject;
            linkedHashMap = new LinkedHashMap<String, JsonObject>();
            if (jsonObject != null) {
                block20: {
                    JsonArray jsonArray2 = jsonObject.getAsJsonArray((String)((Object)a2.b("\u00e4", (int)a2.a("h", (int)15782, (long)(0x39FC222E402426E6L ^ l10)), (long)-274399539861019797L, (long)l10)));
                    if (jsonArray2 != null) {
                        Iterator object2 = jsonArray2.iterator();
                        while (object2.hasNext()) {
                            jsonElement = (JsonElement)object2.next();
                            if (jsonElement.isJsonNull()) continue;
                            try {
                                if (!jsonElement.isJsonObject()) {
                                    continue;
                                }
                            }
                            catch (O_ o_2) {
                                throw a2.a(o_2);
                            }
                            object = jsonElement.getAsJsonObject();
                            String string = OL.g((JsonObject)object, (String)((Object)a2.b("\u00e4", (int)a2.a("h", (int)4785, (long)(0xE6C3194B7DD89F6L ^ l10)), (long)-274399539861019797L, (long)l10)));
                            try {
                                if (string == null) {
                                    continue;
                                }
                            }
                            catch (O_ o_3) {
                                throw a2.a(o_3);
                            }
                            linkedHashMap.put(string, (JsonObject)object);
                        }
                    }
                    if ((jsonArray = OL.q(jsonObject, (String)((Object)a2.b("\u00e4", (int)a2.a("h", (int)32213, (long)(0xDE3D2FE49936694L ^ l10)), (long)-274399539861019797L, (long)l10)))) == null) {
                        jsonArray = new JsonArray();
                    }
                    Boolean bl2 = OL.O(jsonObject, (String)((Object)a2.b("\u00e4", (int)a2.a("h", (int)30875, (long)(0x1C79BD46971FE3D8L ^ l10)), (long)-274399539861019797L, (long)l10)));
                    try {
                        if (bl2 == null) break block20;
                        this.L = bl2;
                        break block21;
                    }
                    catch (O_ o_4) {
                        throw a2.a(o_4);
                    }
                }
                this.L = xi2.p();
            } else {
                jsonArray = new JsonArray();
                this.L = xi2.p();
            }
        }
        this.U = new WU(oT2, new jn((Object)null, "", new Bw(OL.V(jsonArray, false), false)));
        for (jE jE2 : xi2.F()) {
            jsonElement = (JsonObject)linkedHashMap.get(jE2.x());
            try {
                if (jsonElement == null) {
                    this.W.add(new WU(oT2, jE2));
                    continue;
                }
            }
            catch (O_ o_5) {
                throw a2.a(o_5);
            }
            object = new WU(oT2, jE2);
            ((WU)object).u((JsonObject)jsonElement);
            this.W.add((WU<?, ?>)object);
        }
        try {
            if (this.y.P() != null) {
                this.i = this.y.P().q().contains(this.m);
            }
        }
        catch (O_ o_6) {
            throw a2.a(o_6);
        }
    }

    public JsonObject H() {
        JsonObject jsonObject;
        long l10;
        block22: {
            l10 = a ^ 0x4E3F851BD9FAL;
            jsonObject = new JsonObject();
            try {
                try {
                    jsonObject.addProperty((String)((Object)a2.b("\u00e4", (int)a2.a("h", (int)3362, (long)(0x378FF0E3B324665AL ^ l10)), (long)-8355013949246483625L, (long)l10)), this.m.O());
                    if (!this.m.C().Y() || !this.M()) break block22;
                }
                catch (O_ o_2) {
                    throw a2.a(o_2);
                }
                jsonObject.add((String)((Object)a2.b("\u00e4", (int)a2.a("h", (int)4249, (long)(0x22B646FFF1FE7BE7L ^ l10)), (long)-8355013949246483625L, (long)l10)), (JsonElement)this.U.T().w());
            }
            catch (O_ o_3) {
                throw a2.a(o_3);
            }
        }
        JsonArray jsonArray = new JsonArray();
        for (WU<?, ?> wU2 : this.W) {
            try {
                try {
                    if (!((jE)wU2.n()).v() || wU2.p()) {
                        continue;
                    }
                }
                catch (O_ o_4) {
                    throw a2.a(o_4);
                }
            }
            catch (O_ o_5) {
                throw a2.a(o_5);
            }
            JsonObject jsonObject2 = wU2.L();
            try {
                if (jsonObject2.entrySet().size() <= 1) {
                    continue;
                }
            }
            catch (O_ o_6) {
                throw a2.a(o_6);
            }
            jsonArray.add((JsonElement)wU2.L());
        }
        try {
            if (jsonArray.size() != 0) {
                jsonObject.add((String)((Object)a2.b("\u00e4", (int)a2.a("h", (int)24928, (long)(0x625E57F0E0870A1AL ^ l10)), (long)-8355013949246483625L, (long)l10)), (JsonElement)jsonArray);
            }
        }
        catch (O_ o_7) {
            throw a2.a(o_7);
        }
        try {
            if (this.L != this.m.p()) {
                jsonObject.addProperty((String)((Object)a2.b("\u00e4", (int)a2.a("h", (int)22381, (long)(0x68229F6E059FBC14L ^ l10)), (long)-8355013949246483625L, (long)l10)), Boolean.valueOf(this.L));
            }
        }
        catch (O_ o_8) {
            throw a2.a(o_8);
        }
        try {
            if (jsonObject.entrySet().size() == 1) {
                return null;
            }
        }
        catch (O_ o_9) {
            throw a2.a(o_9);
        }
        return jsonObject;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a2.a = d8.a(-3661261098885295087L, 313831279515453513L, MethodHandles.lookup().lookupClass()).a(93389310219802L);
                a2.e = new Object[5];
                a2.f = new String[5];
                a2.a();
                a2.d = new HashMap<K, V>(13);
                var0 = a2.a ^ 85045680820858L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u00b3ihg\u00a5\u00b7\"5\u000f\u00a3\u00ce\u00b2\u00c1\u00be\u000ef\u00c3\u00bb\\h\u00bd\n\u00eb\u00a6\u00a3\u00a2:35\u0016\u00aa.FvK)K\u00e3{\u000e\u008f\u0089\u00d5\u00fa\u008b\u0083\"\u00ca";
                var7_6 = "\u00b3ihg\u00a5\u00b7\"5\u000f\u00a3\u00ce\u00b2\u00c1\u00be\u000ef\u00c3\u00bb\\h\u00bd\n\u00eb\u00a6\u00a3\u00a2:35\u0016\u00aa.FvK)K\u00e3{\u000e\u008f\u0089\u00d5\u00fa\u008b\u0083\"\u00ca".length();
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
                    var6_5 = "a\u00a9oK\u00c4ZN*\u00fc\u00d1\u00d4\u0096\u00a7L\u00e7\u00ab";
                    var7_6 = "a\u00a9oK\u00c4ZN*\u00fc\u00d1\u00d4\u0096\u00a7L\u00e7\u00ab".length();
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
        a2.b = var8_3;
        a2.c = new Integer[8];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = a2.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6774;
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
                throw new RuntimeException("a/a2", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            a2.c[n3] = n4;
        }
        return c[n3];
    }

    public void o(boolean bl2) {
        this.i = bl2;
    }

    @Override
    public String O() {
        return this.m.O();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public boolean M() {
        return this.U.T().E();
    }

    public List<WU<?, ?>> o() {
        return this.W;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/a2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/a2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int b() {
        int n2;
        block10: {
            n2 = 0;
            try {
                if (this.M()) {
                    n2 += 2;
                }
            }
            catch (O_ o_2) {
                throw a2.a(o_2);
            }
            try {
                if (this.S()) {
                    ++n2;
                }
            }
            catch (O_ o_3) {
                throw a2.a(o_3);
            }
            try {
                try {
                    if (!this.M() || !this.S()) break block10;
                }
                catch (O_ o_4) {
                    throw a2.a(o_4);
                }
                ++n2;
            }
            catch (O_ o_5) {
                throw a2.a(o_5);
            }
        }
        return n2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = a2.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public boolean S() {
        return this.i;
    }

    public void n() {
        this.U.T().E(new ArrayList<Integer>());
    }

    public xi O() {
        return this.m;
    }

    private static Method d(long l10, long l11) {
        int n2 = a2.a(l10, l11);
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
                clazz3 = a2.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = a2.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = a2.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        a2.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = a2.b(272727809766155L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = a2.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        a2.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = a2.b(272727809766155L, 0L);
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
            if (c10 == '\u00f4' || c10 == '\u00da' || c10 == 'w' || c10 == 'C') {
                field = a2.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00f4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = a2.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00cf' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "*>e";
        objectArray[1] = Integer.TYPE;
        a2.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0013.\u0012(\b\u0015\u0018!\u0003gu\r\u000b&\n.";
        objectArray[3] = "\r}q)b\u001d\u0006r`f\u0003\u0013\ryd<";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "J5hc5U\u00124c\u000e`St<<>wF\u0016>pe1(M{;n4U\u0018ams\u000b";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = a2.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = a2.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field c(long l10, long l11) {
        int n2 = a2.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = a2.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = a2.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = a2.a(clazz3, string2, clazz2)) != null) {
                    a2.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = a2.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        a2.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = a2.b(272727809766155L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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
                n4 = 61;
                break;
            }
            case 1: {
                n4 = 11;
                break;
            }
            case 2: {
                n4 = 12;
                break;
            }
            case 3: {
                n4 = 52;
                break;
            }
            case 4: {
                n4 = 48;
                break;
            }
            case 5: {
                n4 = 2;
                break;
            }
            case 6: {
                n4 = 13;
                break;
            }
            case 7: {
                n4 = 6;
                break;
            }
            case 8: {
                n4 = 17;
                break;
            }
            case 9: {
                n4 = 32;
                break;
            }
            case 10: {
                n4 = 59;
                break;
            }
            case 11: {
                n4 = 16;
                break;
            }
            case 12: {
                n4 = 40;
                break;
            }
            case 13: {
                n4 = 51;
                break;
            }
            case 14: {
                n4 = 33;
                break;
            }
            case 15: {
                n4 = 15;
                break;
            }
            case 16: {
                n4 = 22;
                break;
            }
            case 17: {
                n4 = 4;
                break;
            }
            case 18: {
                n4 = 37;
                break;
            }
            case 19: {
                n4 = 10;
                break;
            }
            case 20: {
                n4 = 30;
                break;
            }
            case 21: {
                n4 = 20;
                break;
            }
            case 22: {
                n4 = 46;
                break;
            }
            case 23: {
                n4 = 41;
                break;
            }
            case 24: {
                n4 = 58;
                break;
            }
            case 25: {
                n4 = 29;
                break;
            }
            case 26: {
                n4 = 28;
                break;
            }
            case 27: {
                n4 = 49;
                break;
            }
            case 28: {
                n4 = 0;
                break;
            }
            case 29: {
                n4 = 53;
                break;
            }
            case 30: {
                n4 = 8;
                break;
            }
            case 31: {
                n4 = 50;
                break;
            }
            case 32: {
                n4 = 62;
                break;
            }
            case 33: {
                n4 = 39;
                break;
            }
            case 34: {
                n4 = 24;
                break;
            }
            case 35: {
                n4 = 5;
                break;
            }
            case 36: {
                n4 = 23;
                break;
            }
            case 37: {
                n4 = 35;
                break;
            }
            case 38: {
                n4 = 3;
                break;
            }
            case 39: {
                n4 = 18;
                break;
            }
            case 40: {
                n4 = 44;
                break;
            }
            case 41: {
                n4 = 31;
                break;
            }
            case 42: {
                n4 = 63;
                break;
            }
            case 43: {
                n4 = 9;
                break;
            }
            case 44: {
                n4 = 60;
                break;
            }
            case 45: {
                n4 = 56;
                break;
            }
            case 46: {
                n4 = 21;
                break;
            }
            case 47: {
                n4 = 45;
                break;
            }
            case 48: {
                n4 = 47;
                break;
            }
            case 49: {
                n4 = 42;
                break;
            }
            case 50: {
                n4 = 57;
                break;
            }
            case 51: {
                n4 = 34;
                break;
            }
            case 52: {
                n4 = 27;
                break;
            }
            case 53: {
                n4 = 54;
                break;
            }
            case 54: {
                n4 = 36;
                break;
            }
            case 55: {
                n4 = 19;
                break;
            }
            case 56: {
                n4 = 14;
                break;
            }
            case 57: {
                n4 = 7;
                break;
            }
            case 58: {
                n4 = 55;
                break;
            }
            case 59: {
                n4 = 38;
                break;
            }
            case 60: {
                n4 = 25;
                break;
            }
            case 61: {
                n4 = 1;
                break;
            }
            case 62: {
                n4 = 26;
                break;
            }
            default: {
                n4 = 43;
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
        a2.f[n5] = new String(cArray);
        return n5;
    }

    public List<WU<?, ?>> j(boolean bl2) {
        ArrayList arrayList = new ArrayList();
        for (WU<?, ?> wU2 : this.o()) {
            try {
                try {
                    if (wU2.H() && !bl2) {
                        continue;
                    }
                }
                catch (O_ o_2) {
                    throw a2.a(o_2);
                }
            }
            catch (O_ o_3) {
                throw a2.a(o_3);
            }
            arrayList.add(wU2);
        }
        return arrayList;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(a2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

