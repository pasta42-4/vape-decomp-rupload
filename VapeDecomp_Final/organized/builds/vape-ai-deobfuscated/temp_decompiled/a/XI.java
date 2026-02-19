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

import a.B6;
import a.B9;
import a.EP;
import a.FM;
import a.Ff;
import a.HQ;
import a.KX;
import a.OL;
import a.O_;
import a.Oq;
import a.SE;
import a.Sy;
import a.Z3;
import a._V;
import a.d8;
import a.j9;
import a.jE;
import a.rQ;
import a.sM;
import a.x4;
import a.xG;
import a.xp;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class xi
extends xp
implements Sy,
sM {
    private final Ff c;
    private static final Object[] ib;
    private final String f;
    private static int[] E;
    private final List<x4> I;
    private static final String[] jb;
    private boolean i = true;
    private final List<jE<?, ?>> C = new ArrayList();
    private static final long ab;
    protected Oq k;
    private boolean U = true;
    private static final long[] cb;
    private static final Map eb;
    private static final Integer[] db;
    private final int H;
    private boolean p;
    private rQ s;
    private String S;
    private final List<jE<?, ?>> g = new ArrayList();
    private final int M;
    private final B9 y;
    private boolean D;
    private boolean a;

    public void X(KX kX2) {
        block12: {
            try {
                if (kX2.getKey() <= 0) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw xi.b(o_2);
            }
            try {
                if (this.y.Z().isEmpty()) {
                    return;
                }
            }
            catch (O_ o_3) {
                throw xi.b(o_3);
            }
            try {
                try {
                    try {
                        if (!kX2.isDown() || EP.X().M() != null) break block12;
                    }
                    catch (O_ o_4) {
                        throw xi.b(o_4);
                    }
                    if (!this.y.d(kX2.getKey())) break block12;
                }
                catch (O_ o_5) {
                    throw xi.b(o_5);
                }
                kX2.setCanceled(true);
            }
            catch (O_ o_6) {
                throw xi.b(o_6);
            }
        }
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3A30;
        if (db[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = cb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xi", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xi.db[n3] = n4;
        }
        return db[n3];
    }

    protected Predicate<_V> V() {
        return this::lambda$getEventPredicate$0;
    }

    public int N() {
        return this.M;
    }

    public String H() {
        return "";
    }

    public B9 C() {
        return this.y;
    }

    public double e(double d2, boolean bl2) {
        return 0.0;
    }

    public String r() {
        return this.S;
    }

    public int T() {
        return this.H;
    }

    public boolean j() {
        return false;
    }

    @Nullable
    public JsonObject r(boolean bl2) {
        JsonArray jsonArray;
        JsonObject jsonObject;
        long l10;
        block28: {
            l10 = ab ^ 0x7CBDF30E520BL;
            jsonObject = new JsonObject();
            jsonObject.addProperty((String)((Object)xi.e("f", (int)xi.b("t", (int)22052, (long)(0x459ECCC141FA29C3L ^ l10)), (long)5031665970500247948L, (long)l10)), this.O());
            if (this.y.Y()) {
                jsonArray = this.y.w();
                try {
                    block27: {
                        try {
                            try {
                                try {
                                    if (this.H == 0 && jsonArray.size() != 0) break block27;
                                }
                                catch (O_ o_2) {
                                    throw xi.b(o_2);
                                }
                                if (jsonArray.size() != 1) break block28;
                            }
                            catch (O_ o_3) {
                                throw xi.b(o_3);
                            }
                            if (jsonArray.get(0).getAsInt() == this.H) break block28;
                        }
                        catch (O_ o_4) {
                            throw xi.b(o_4);
                        }
                    }
                    jsonObject.add((String)((Object)xi.e("f", (int)xi.b("t", (int)10381, (long)(0x13C83B3106CF576DL ^ l10)), (long)5031665970500247948L, (long)l10)), (JsonElement)jsonArray);
                }
                catch (O_ o_5) {
                    throw xi.b(o_5);
                }
            }
        }
        jsonArray = new JsonArray();
        for (jE<?, ?> jE2 : this.C) {
            try {
                try {
                    if (!jE2.v() || jE2.p()) {
                        continue;
                    }
                }
                catch (O_ o_6) {
                    throw xi.b(o_6);
                }
            }
            catch (O_ o_7) {
                throw xi.b(o_7);
            }
            JsonObject jsonObject2 = jE2.k(bl2);
            try {
                if (jsonObject2.entrySet().size() <= 1) {
                    continue;
                }
            }
            catch (O_ o_8) {
                throw xi.b(o_8);
            }
            jsonArray.add((JsonElement)jsonObject2);
        }
        try {
            if (jsonArray.size() != 0) {
                jsonObject.add((String)((Object)xi.e("f", (int)xi.b("t", (int)7528, (long)(0x3C77E6448C73E299L ^ l10)), (long)5031665970500247948L, (long)l10)), (JsonElement)jsonArray);
            }
        }
        catch (O_ o_9) {
            throw xi.b(o_9);
        }
        try {
            if (this.i != this.U) {
                jsonObject.addProperty((String)((Object)xi.e("f", (int)xi.b("t", (int)9550, (long)(0x4B79DA0F89A65AA2L ^ l10)), (long)5031665970500247948L, (long)l10)), Boolean.valueOf(this.i));
            }
        }
        catch (O_ o_10) {
            throw xi.b(o_10);
        }
        try {
            if (jsonObject.entrySet().size() == 1) {
                return null;
            }
        }
        catch (O_ o_11) {
            throw xi.b(o_11);
        }
        return jsonObject;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00ba' || c10 == 's' || c10 == 'O' || c10 == '\u00c9') {
                field = xi.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00ba' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'O' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xi.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void T(boolean bl2) {
        this.y(bl2, false);
    }

    public void y(boolean bl2, boolean bl3) {
        block28: {
            block27: {
                block25: {
                    block26: {
                        long l10;
                        block24: {
                            l10 = ab ^ 0x38FC0F44FA76L;
                            try {
                                try {
                                    if (!this.j() || xi.e("f", (long)-1321024730869619392L, (long)l10) != false) break block24;
                                }
                                catch (O_ o_2) {
                                    throw xi.b(o_2);
                                }
                                xi.e("f", (long)-1321072160019505338L, (long)l10);
                            }
                            catch (O_ o_3) {
                                throw xi.b(o_3);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (bl3 || this.H()) break block25;
                                        }
                                        catch (O_ o_4) {
                                            throw xi.b(o_4);
                                        }
                                        if (this.k == Oq.p) break block25;
                                    }
                                    catch (O_ o_5) {
                                        throw xi.b(o_5);
                                    }
                                    if (!bl2) break block25;
                                }
                                catch (O_ o_6) {
                                    throw xi.b(o_6);
                                }
                                if (SE.h.c() == null) break block26;
                            }
                            catch (O_ o_7) {
                                throw xi.b(o_7);
                            }
                            SE.h.c().t((String)((Object)xi.e("f", (int)xi.b("t", (int)8249, (long)(0x6D5508CE5AC2F7BAL ^ l10)), (long)-1321430683471836687L, (long)l10)), (String)((Object)xi.e("f", (int)xi.b("t", (int)28027, (long)(0x2D054A4A01AC3AE3L ^ l10)), (long)-1321430683471836687L, (long)l10)) + this.O() + (String)((Object)xi.e("f", (int)xi.b("t", (int)18961, (long)(0xDD66A744EBC9D98L ^ l10)), (long)-1321430683471836687L, (long)l10)), HQ.WARNING, 2500L);
                        }
                        catch (O_ o_8) {
                            throw xi.b(o_8);
                        }
                    }
                    return;
                }
                try {
                    if (!bl2) {
                        this.r();
                    }
                }
                catch (O_ o_9) {
                    throw xi.b(o_9);
                }
                try {
                    try {
                        this.a = bl2;
                        if (!this.a) break block27;
                        this.h();
                        if (!this.a) break block28;
                    }
                    catch (O_ o_10) {
                        throw xi.b(o_10);
                    }
                    Z3.s().A(this, this.V());
                    break block28;
                }
                catch (O_ o_11) {
                    throw xi.b(o_11);
                }
            }
            try {
                this.v();
                if (!this.a) {
                    Z3.s().l(this);
                }
            }
            catch (O_ o_12) {
                throw xi.b(o_12);
            }
        }
        SE.h.U().e(this);
        this.c(bl2, bl3);
    }

    public List<x4> y() {
        return this.I;
    }

    /*
     * Loose catch block
     */
    public void x(JsonObject jsonObject) {
        block26: {
            JsonArray jsonArray;
            long l10;
            block27: {
                l10 = ab ^ 0x76ED2EE0DC74L;
                try {
                    if (this.y.Y()) {
                        this.y.Z().clear();
                    }
                }
                catch (Exception exception) {
                    throw xi.b(exception);
                }
                String string = OL.g(jsonObject, (String)((Object)xi.e("f", (int)xi.b("t", (int)17897, (long)(0x1ECD1B2017E1B466L ^ l10)), (long)-3770889638567727117L, (long)l10)));
                if (string == null) break block26;
                try {
                    block28: {
                        if (!string.equalsIgnoreCase(this.O())) break block26;
                        break block28;
                        catch (Exception exception) {
                            throw xi.b(exception);
                        }
                    }
                    if (!this.y.Y()) break block27;
                }
                catch (Exception exception) {
                    throw xi.b(exception);
                }
                jsonArray = OL.q(jsonObject, (String)((Object)xi.e("f", (int)xi.b("t", (int)13222, (long)(0x6941472CB796C22FL ^ l10)), (long)-3770889638567727117L, (long)l10)));
                if (jsonArray != null) {
                    try {
                        this.y.q(jsonArray, false);
                    }
                    catch (Exception exception) {}
                } else {
                    jsonArray = OL.q(jsonObject, (String)((Object)xi.e("f", (int)xi.b("t", (int)30877, (long)(0x629D20E20CF98901L ^ l10)), (long)-3770889638567727117L, (long)l10)));
                    if (jsonArray != null) {
                        try {
                            this.y.q(jsonArray, true);
                        }
                        catch (Exception exception) {}
                    } else {
                        try {
                            this.y.Z().clear();
                            if (this.H != 0) {
                                this.y.Z().add(this.H);
                            }
                        }
                        catch (Exception exception) {
                            throw xi.b(exception);
                        }
                    }
                }
            }
            if ((jsonArray = jsonObject.getAsJsonArray((String)((Object)xi.e("f", (int)xi.b("t", (int)17782, (long)(0x4BC823292B5134E3L ^ l10)), (long)-3770889638567727117L, (long)l10)))) != null) {
                for (JsonElement jsonElement : jsonArray) {
                    JsonObject jsonObject2 = jsonElement.getAsJsonObject();
                    for (jE<?, ?> jE2 : this.C) {
                        try {
                            if (!jE2.g(jsonObject2)) continue;
                            jE2.C(jsonObject2);
                        }
                        catch (Exception exception) {
                            throw xi.b(exception);
                        }
                    }
                }
            }
            Boolean bl2 = OL.O(jsonObject, (String)((Object)xi.e("f", (int)xi.b("t", (int)4438, (long)(0x14F0CFD6CAFBE0CDL ^ l10)), (long)-3770889638567727117L, (long)l10)));
            try {
                if (bl2 != null) {
                    this.i = bl2;
                }
            }
            catch (Exception exception) {
                throw xi.b(exception);
            }
        }
    }

    public List<jE<?, ?>> Y() {
        return this.g;
    }

    private static Method h(long l10, long l11) {
        int n2 = xi.e(l10, l11);
        Object object = ib[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xi.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xi.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xi.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        xi.ib[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xi.f(358550927889621L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xi.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xi.ib[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xi.f(358550927889621L, 0L);
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = xi.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xi.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean h() {
        return this.a;
    }

    public void b() {
    }

    public void m() {
        boolean bl2;
        xi xi2;
        block8: {
            try {
                try {
                    try {
                        if (!this.Y() || !this.y.Y()) break block8;
                    }
                    catch (O_ o_2) {
                        throw xi.b(o_2);
                    }
                    if (!this.y.Z().isEmpty()) break block8;
                }
                catch (O_ o_3) {
                    throw xi.b(o_3);
                }
                return;
            }
            catch (O_ o_4) {
                throw xi.b(o_4);
            }
        }
        try {
            xi2 = this;
            bl2 = !this.a;
        }
        catch (O_ o_5) {
            throw xi.b(o_5);
        }
        xi2.T(bl2);
    }

    public void p(boolean bl2) {
        this.D = bl2;
    }

    public boolean Z() {
        return this.a;
    }

    public void I() {
        String string;
        Ff ff2;
        try {
            this.c.L(1500L);
            ff2 = this.c.K("\u00a7f" + this.O());
            string = this.Z() ? "\u00a72Enabled" : "\u00a7cDisabled";
        }
        catch (O_ o_2) {
            throw xi.b(o_2);
        }
        ff2.D(string).Q();
        SE.h.c().h(this.c);
    }

    @Override
    public String O() {
        return this.f;
    }

    public x4 K(String string) {
        for (x4 x42 : this.y()) {
            try {
                if (!x42.O().equalsIgnoreCase(string)) continue;
                return x42;
            }
            catch (O_ o_2) {
                throw xi.b(o_2);
            }
        }
        return null;
    }

    public boolean H() {
        return this.i;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xi.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public jE O(String string) {
        for (jE<?, ?> jE2 : this.F()) {
            try {
                try {
                    if (!jE2.x().equalsIgnoreCase(string) && !jE2.O().equalsIgnoreCase(string)) continue;
                }
                catch (O_ o_2) {
                    throw xi.b(o_2);
                }
                return jE2;
            }
            catch (O_ o_3) {
                throw xi.b(o_3);
            }
        }
        return null;
    }

    public boolean J() {
        return this.E(xp.W);
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public boolean w() {
        return this.E(xp.Q);
    }

    public xi(String string, int n2, Oq oq2, String string2) {
        this(string, 0, n2, oq2, string2);
    }

    public boolean m() {
        return this.E(xp.q);
    }

    public void V(xi xi2) {
    }

    public xi(String string, int n2, int n3, Oq oq2, String string2) {
        this.I = new ArrayList<x4>();
        this.c = new Ff(HQ.INFO, "", "", 1000L);
        this.f = string;
        this.H = n2;
        this.M = n3;
        this.k = oq2;
        this.S = string2;
        this.y = this.c();
        if (this.y.Y()) {
            try {
                if (n2 != 0) {
                    this.y.Z().add(n2);
                }
            }
            catch (O_ o_2) {
                throw xi.b(o_2);
            }
        }
    }

    public void U(boolean bl2) {
        this.i = bl2;
    }

    public void C(boolean bl2) {
        block3: {
            block2: {
                try {
                    if (!bl2) break block2;
                    SE.h.S().T(this);
                    break block3;
                }
                catch (O_ o_2) {
                    throw xi.b(o_2);
                }
            }
            SE.h.S().M(this);
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xi.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xi.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    public Oq t() {
        return this.k;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xi.ab = d8.a(4482138444357686142L, 6808586769020980144L, MethodHandles.lookup().lookupClass()).a(273903104918492L);
                xi.ib = new Object[9];
                xi.jb = new String[9];
                xi.ab();
                xi.eb = new HashMap<K, V>(13);
                xi.b(null);
                var0 = xi.ab ^ 15960962377762L;
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
                var8_3 = new long[25];
                var5_4 = 0;
                var6_5 = "[A\u001a\u00bb\u00e1\u00f4\u001c.}\u00de\t$\u001f\u0014\u00d39\u00170_\u0002\u0010Y Mu\u00d8\u0089Fu\u00bf\u00bc\u00c6uV\u00c6v\u009a\u0081\u00efl\t\u00bc\u001b\u001c\u00a2Z\u00fa\u00b0\u0019t(\u00c4\u00bf\t\u00a6\u0082\u009e.T[ %\u001a\u00b7\r\u0003\u00deP\u00fe\u00f4+\u0084w\u0000\u00ee\u00b0\u00e4\nv\u00ceG\u00cd\u00ba\u00c3\u0018\u00c8\u00ffco\u008c5\u0015\u008b\u0094d\u0005\u00f1\u00abQ*\u00bb\u00fa\u001dN\u00feAY`\u00d9q+L\u00ben}&\u001f\u0093<\b\u00e9k\u00d2\u000b\u00ab]d\"\u0000U\u00f5&\u0084\u008e\u00ac\u00cb/\u00a4\u00fdM\u00fd\u00e2\u00a9]\u009c'\u00cd\u00fd\u0089\u00c5)\u00c6e\u0081\u001c<\u0018\u0010\u00c8F\u00fc\u00b9\u00f2\u00c2\u0097\u0003\u00b9o\u00b0{\u00bbe7\u0099\u0010s\u00e7\u00b9\u00dd\u00f0m\u00b9\u0017A";
                var7_6 = "[A\u001a\u00bb\u00e1\u00f4\u001c.}\u00de\t$\u001f\u0014\u00d39\u00170_\u0002\u0010Y Mu\u00d8\u0089Fu\u00bf\u00bc\u00c6uV\u00c6v\u009a\u0081\u00efl\t\u00bc\u001b\u001c\u00a2Z\u00fa\u00b0\u0019t(\u00c4\u00bf\t\u00a6\u0082\u009e.T[ %\u001a\u00b7\r\u0003\u00deP\u00fe\u00f4+\u0084w\u0000\u00ee\u00b0\u00e4\nv\u00ceG\u00cd\u00ba\u00c3\u0018\u00c8\u00ffco\u008c5\u0015\u008b\u0094d\u0005\u00f1\u00abQ*\u00bb\u00fa\u001dN\u00feAY`\u00d9q+L\u00ben}&\u001f\u0093<\b\u00e9k\u00d2\u000b\u00ab]d\"\u0000U\u00f5&\u0084\u008e\u00ac\u00cb/\u00a4\u00fdM\u00fd\u00e2\u00a9]\u009c'\u00cd\u00fd\u0089\u00c5)\u00c6e\u0081\u001c<\u0018\u0010\u00c8F\u00fc\u00b9\u00f2\u00c2\u0097\u0003\u00b9o\u00b0{\u00bbe7\u0099\u0010s\u00e7\u00b9\u00dd\u00f0m\u00b9\u0017A".length();
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
                    var6_5 = "_R'\\8\u00ae\u00c7\u00cb\u00a1\u00b3\u00a7\u009c\r\u00b2\u0099\u00d2";
                    var7_6 = "_R'\\8\u00ae\u00c7\u00cb\u00a1\u00b3\u00a7\u009c\r\u00b2\u0099\u00d2".length();
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
        xi.cb = var8_3;
        xi.db = new Integer[25];
    }

    public List<jE<?, ?>> F() {
        return this.C;
    }

    public xi(String string) {
        this(string, 0, Oq.p);
    }

    public void S(x4 ... x4Array) {
        this.y().addAll(Arrays.asList(x4Array));
    }

    public void S() {
    }

    public static void b(int[] nArray) {
        E = nArray;
    }

    public xi(String string, int n2) {
        this(string, n2, 0, Oq.p, null);
    }

    private boolean lambda$getEventPredicate$0(_V _V2) {
        return this.Z();
    }

    public void K(long l10, boolean bl2) {
        try {
            if (this.s != null) {
                this.s.T(false);
            }
        }
        catch (O_ o_2) {
            throw xi.b(o_2);
        }
        this.s = new rQ(this, l10, bl2);
        new Thread(this.s).start();
    }

    public boolean g() {
        return this.D;
    }

    public void v() {
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xi.e(l10, l11);
            object = ib[n2];
            try {
                if (!(object instanceof String)) break block2;
                xi.ib[n2] = clazz = Class.forName(jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public String toString() {
        long l10 = ab ^ 0x772D10601B6EL;
        return (String)((Object)xi.e("f", (int)xi.b("t", (int)25335, (long)(0x2FB0A606F9125479L ^ l10)), (long)914540900241697001L, (long)l10)) + this.f + '\'' + (String)((Object)xi.e("f", (int)xi.b("t", (int)3504, (long)(0x3ED7CBDE915DBB20L ^ l10)), (long)914540900241697001L, (long)l10)) + this.H + (String)((Object)xi.e("f", (int)xi.b("t", (int)9488, (long)(0x6DFACAD767AB939AL ^ l10)), (long)914540900241697001L, (long)l10)) + this.M + (String)((Object)xi.e("f", (int)xi.b("t", (int)1052, (long)(0x5AB932395FE3328BL ^ l10)), (long)914540900241697001L, (long)l10)) + this.g + (String)((Object)xi.e("f", (int)xi.b("t", (int)11700, (long)(0x12261C82AA521B3CL ^ l10)), (long)914540900241697001L, (long)l10)) + this.I + (String)((Object)xi.e("f", (int)xi.b("t", (int)7179, (long)(0x3E86E925586D2A8CL ^ l10)), (long)914540900241697001L, (long)l10)) + this.k + (String)((Object)xi.e("f", (int)xi.b("t", (int)18834, (long)(0x7CEA1CBD2A24FF11L ^ l10)), (long)914540900241697001L, (long)l10)) + this.a + (String)((Object)xi.e("f", (int)xi.b("t", (int)8412, (long)(0x316FE3F05DF31651L ^ l10)), (long)914540900241697001L, (long)l10)) + this.p + (String)((Object)xi.e("f", (int)xi.b("t", (int)15415, (long)(0x44D390CBC3648AA1L ^ l10)), (long)914540900241697001L, (long)l10)) + this.S + '\'' + (String)((Object)xi.e("f", (int)xi.b("t", (int)9977, (long)(0x1DC41E6822F9907DL ^ l10)), (long)914540900241697001L, (long)l10)) + this.s + (String)((Object)xi.e("f", (int)xi.b("t", (int)5968, (long)(0x1427060B7ED821DCL ^ l10)), (long)914540900241697001L, (long)l10)) + this.U + (String)((Object)xi.e("f", (int)xi.b("t", (int)2595, (long)(0x459AE726959BCB1L ^ l10)), (long)914540900241697001L, (long)l10)) + this.i + (String)((Object)xi.e("f", (int)xi.b("t", (int)5521, (long)(0x1E6161F48591231AL ^ l10)), (long)914540900241697001L, (long)l10)) + this.D + '}';
    }

    public void e(jE<?, ?> jE2, FM ... fMArray) {
        this.C.add(jE2);
        List<FM> list = FM.j(fMArray);
        try {
            if (!list.isEmpty()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw xi.b(o_2);
        }
        this.g.add(jE2);
    }

    public boolean p() {
        return this.U;
    }

    public void W() {
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xi.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void A(j9 j92, j9 j93) {
        try {
            if (this instanceof x4) {
                return;
            }
        }
        catch (O_ o_2) {
            throw xi.b(o_2);
        }
        try {
            if (!this.a) {
                return;
            }
        }
        catch (O_ o_3) {
            throw xi.b(o_3);
        }
        Object t10 = j92.c();
        Object t11 = j93.c();
        try {
            if (((x4)t10).O()) {
                ((xi)t10).T(false);
            }
        }
        catch (O_ o_4) {
            throw xi.b(o_4);
        }
        try {
            if (!((x4)t11).O()) {
                ((xi)t11).T(true);
            }
        }
        catch (O_ o_5) {
            throw xi.b(o_5);
        }
    }

    public String G(int n2) {
        String string;
        block4: {
            string = "";
            if (n2 == 0) {
                string = this.H();
            }
            if (n2 == 1) {
                string = this.t();
                try {
                    if (string != null && !string.isEmpty()) break block4;
                }
                catch (O_ o_2) {
                    throw xi.b(o_2);
                }
                string = this.H();
            }
        }
        return string;
    }

    public static int[] o() {
        return E;
    }

    protected B9 c() {
        return new B6(this);
    }

    private static void ab() {
        Object[] objectArray = ib;
        ib[0] = "}\u0016o";
        objectArray[1] = Integer.TYPE;
        xi.jb[1] = "java/lang/Integer";
        objectArray[2] = "\u0019\u0018\u001e\u0003v%\u0012\u0017\u000fL\u000b=\u0001\u0010\u0006\u0005";
        objectArray[3] = Boolean.TYPE;
        xi.jb[3] = "java/lang/Boolean";
        objectArray[4] = Void.TYPE;
        xi.jb[4] = "java/lang/Void";
        objectArray[5] = "_maT5+Tbp\u001bT%_itA";
        objectArray[6] = "w2j\u001f>T`%kv?R\u001dm>G9@`n/\u001c;8";
        objectArray[7] = "X4\rG<8O#\f.'>2j\u000b\u0011`i[;WW0T";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "5i\u000bp~L\"~\n\u0019u[_5\tu%^0uJp~ foQrw\u001aneJw\u001e";
    }

    private static Field g(long l10, long l11) {
        int n2 = xi.e(l10, l11);
        Object object = ib[n2];
        if (object instanceof String) {
            String string = jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = xi.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xi.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xi.c(clazz3, string2, clazz2)) != null) {
                    xi.ib[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xi.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xi.ib[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xi.f(358550927889621L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public xi(String string, int n2, Oq oq2) {
        this(string, 0, n2, oq2, null);
    }

    public void q(boolean bl2) {
        this.U = bl2;
        this.i = bl2;
    }

    public String t() {
        return "";
    }

    public boolean Y() {
        return this.p;
    }

    public void r() {
    }

    public void N(jE<?, ?> ... jEArray) {
        for (jE<?, ?> jE2 : jEArray) {
            this.e(jE2, new FM[0]);
        }
    }

    public void s(String string) {
        this.S = string;
    }

    public void c(boolean bl2, boolean bl3) {
        for (x4 x42 : this.y()) {
            block7: {
                try {
                    try {
                        if (!x42.W()) break block7;
                        if (x42.Z() == bl2) continue;
                    }
                    catch (O_ o_2) {
                        throw xi.b(o_2);
                    }
                    x42.y(bl2, bl3);
                    continue;
                }
                catch (O_ o_3) {
                    throw xi.b(o_3);
                }
            }
            try {
                if (!x42.O()) continue;
                x42.y(false, bl3);
            }
            catch (O_ o_4) {
                throw xi.b(o_4);
            }
        }
    }

    public void t() {
        this.m();
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (jb[n5] != null) {
            return n5;
        }
        Object object = ib[n5];
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
                n4 = 54;
                break;
            }
            case 2: {
                n4 = 63;
                break;
            }
            case 3: {
                n4 = 60;
                break;
            }
            case 4: {
                n4 = 36;
                break;
            }
            case 5: {
                n4 = 34;
                break;
            }
            case 6: {
                n4 = 4;
                break;
            }
            case 7: {
                n4 = 29;
                break;
            }
            case 8: {
                n4 = 0;
                break;
            }
            case 9: {
                n4 = 41;
                break;
            }
            case 10: {
                n4 = 40;
                break;
            }
            case 11: {
                n4 = 21;
                break;
            }
            case 12: {
                n4 = 50;
                break;
            }
            case 13: {
                n4 = 51;
                break;
            }
            case 14: {
                n4 = 57;
                break;
            }
            case 15: {
                n4 = 44;
                break;
            }
            case 16: {
                n4 = 5;
                break;
            }
            case 17: {
                n4 = 14;
                break;
            }
            case 18: {
                n4 = 16;
                break;
            }
            case 19: {
                n4 = 52;
                break;
            }
            case 20: {
                n4 = 45;
                break;
            }
            case 21: {
                n4 = 35;
                break;
            }
            case 22: {
                n4 = 47;
                break;
            }
            case 23: {
                n4 = 55;
                break;
            }
            case 24: {
                n4 = 39;
                break;
            }
            case 25: {
                n4 = 19;
                break;
            }
            case 26: {
                n4 = 8;
                break;
            }
            case 27: {
                n4 = 37;
                break;
            }
            case 28: {
                n4 = 25;
                break;
            }
            case 29: {
                n4 = 53;
                break;
            }
            case 30: {
                n4 = 22;
                break;
            }
            case 31: {
                n4 = 62;
                break;
            }
            case 32: {
                n4 = 32;
                break;
            }
            case 33: {
                n4 = 42;
                break;
            }
            case 34: {
                n4 = 6;
                break;
            }
            case 35: {
                n4 = 38;
                break;
            }
            case 36: {
                n4 = 58;
                break;
            }
            case 37: {
                n4 = 2;
                break;
            }
            case 38: {
                n4 = 31;
                break;
            }
            case 39: {
                n4 = 12;
                break;
            }
            case 40: {
                n4 = 59;
                break;
            }
            case 41: {
                n4 = 43;
                break;
            }
            case 42: {
                n4 = 20;
                break;
            }
            case 43: {
                n4 = 24;
                break;
            }
            case 44: {
                n4 = 10;
                break;
            }
            case 45: {
                n4 = 9;
                break;
            }
            case 46: {
                n4 = 11;
                break;
            }
            case 47: {
                n4 = 28;
                break;
            }
            case 48: {
                n4 = 56;
                break;
            }
            case 49: {
                n4 = 30;
                break;
            }
            case 50: {
                n4 = 7;
                break;
            }
            case 51: {
                n4 = 48;
                break;
            }
            case 52: {
                n4 = 27;
                break;
            }
            case 53: {
                n4 = 46;
                break;
            }
            case 54: {
                n4 = 3;
                break;
            }
            case 55: {
                n4 = 33;
                break;
            }
            case 56: {
                n4 = 26;
                break;
            }
            case 57: {
                n4 = 18;
                break;
            }
            case 58: {
                n4 = 13;
                break;
            }
            case 59: {
                n4 = 61;
                break;
            }
            case 60: {
                n4 = 49;
                break;
            }
            case 61: {
                n4 = 1;
                break;
            }
            case 62: {
                n4 = 15;
                break;
            }
            default: {
                n4 = 17;
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
        xi.jb[n5] = new String(cArray);
        return n5;
    }

    public void h() {
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean u() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (this.t() == Oq.p || this instanceof xG) break block4;
                    }
                    catch (O_ o_2) {
                        throw xi.b(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw xi.b(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(xi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

