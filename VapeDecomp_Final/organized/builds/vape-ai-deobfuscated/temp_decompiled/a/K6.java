/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package a;

import a.BY;
import a.BZ;
import a.FV;
import a.IQ;
import a.Nr;
import a.O_;
import a.SE;
import a.YK;
import a._a;
import a._b;
import a.a;
import a.aM;
import a.cM;
import a.d8;
import a.eK;
import a.ec;
import a.su;
import a.zy;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k6 {
    private boolean J = false;
    private static final Map d;
    private static final Object[] f;
    private su e;
    private static final String[] g;
    private final AtomicBoolean r = new AtomicBoolean();
    private static final long a;
    private final Nr y = new Nr();
    private static final long[] b;
    private final SE T;
    static final boolean t;
    private static final Integer[] c;

    /*
     * Loose catch block
     */
    private void Z() {
        if (!YK.C.q().n()) {
            try {
                _b.S().p().i(aM.ONLINE, YK.C.q().U());
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        try {
            block9: {
                boolean[] blArray = a.a.gls();
                boolean bl2 = blArray[0];
                boolean bl3 = blArray[1];
                if (this.J) break block9;
                try {
                    block11: {
                        if (!bl2) break block9;
                        break block11;
                        catch (Exception exception) {
                            throw k6.a(exception);
                        }
                    }
                    YK.C.c().N().F(true);
                    YK.C.c().N().H(bl3);
                    YK.C.c().N().F(false);
                    this.J = true;
                }
                catch (Exception exception) {
                    throw k6.a(exception);
                }
            }
            YK.C.c().l();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
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
            throw new RuntimeException("a/k6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = k6.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l10, long l11) {
        int n2 = k6.a(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n2];
                int n4 = string2.indexOf(8);
                clazz3 = k6.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = k6.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = k6.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        k6.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = k6.b(250334785246834L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = k6.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        k6.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = k6.b(250334785246834L, 0L);
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

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (g[n5] != null) {
            return n5;
        }
        Object object = f[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 33;
                break;
            }
            case 1: {
                n4 = 49;
                break;
            }
            case 2: {
                n4 = 16;
                break;
            }
            case 3: {
                n4 = 38;
                break;
            }
            case 4: {
                n4 = 37;
                break;
            }
            case 5: {
                n4 = 39;
                break;
            }
            case 6: {
                n4 = 53;
                break;
            }
            case 7: {
                n4 = 26;
                break;
            }
            case 8: {
                n4 = 31;
                break;
            }
            case 9: {
                n4 = 4;
                break;
            }
            case 10: {
                n4 = 46;
                break;
            }
            case 11: {
                n4 = 22;
                break;
            }
            case 12: {
                n4 = 1;
                break;
            }
            case 13: {
                n4 = 51;
                break;
            }
            case 14: {
                n4 = 21;
                break;
            }
            case 15: {
                n4 = 6;
                break;
            }
            case 16: {
                n4 = 18;
                break;
            }
            case 17: {
                n4 = 5;
                break;
            }
            case 18: {
                n4 = 27;
                break;
            }
            case 19: {
                n4 = 48;
                break;
            }
            case 20: {
                n4 = 35;
                break;
            }
            case 21: {
                n4 = 28;
                break;
            }
            case 22: {
                n4 = 43;
                break;
            }
            case 23: {
                n4 = 60;
                break;
            }
            case 24: {
                n4 = 55;
                break;
            }
            case 25: {
                n4 = 52;
                break;
            }
            case 26: {
                n4 = 61;
                break;
            }
            case 27: {
                n4 = 29;
                break;
            }
            case 28: {
                n4 = 56;
                break;
            }
            case 29: {
                n4 = 50;
                break;
            }
            case 30: {
                n4 = 32;
                break;
            }
            case 31: {
                n4 = 10;
                break;
            }
            case 32: {
                n4 = 19;
                break;
            }
            case 33: {
                n4 = 47;
                break;
            }
            case 34: {
                n4 = 11;
                break;
            }
            case 35: {
                n4 = 54;
                break;
            }
            case 36: {
                n4 = 7;
                break;
            }
            case 37: {
                n4 = 41;
                break;
            }
            case 38: {
                n4 = 17;
                break;
            }
            case 39: {
                n4 = 25;
                break;
            }
            case 40: {
                n4 = 40;
                break;
            }
            case 41: {
                n4 = 34;
                break;
            }
            case 42: {
                n4 = 62;
                break;
            }
            case 43: {
                n4 = 0;
                break;
            }
            case 44: {
                n4 = 8;
                break;
            }
            case 45: {
                n4 = 23;
                break;
            }
            case 46: {
                n4 = 57;
                break;
            }
            case 47: {
                n4 = 30;
                break;
            }
            case 48: {
                n4 = 14;
                break;
            }
            case 49: {
                n4 = 44;
                break;
            }
            case 50: {
                n4 = 20;
                break;
            }
            case 51: {
                n4 = 13;
                break;
            }
            case 52: {
                n4 = 2;
                break;
            }
            case 53: {
                n4 = 3;
                break;
            }
            case 54: {
                n4 = 15;
                break;
            }
            case 55: {
                n4 = 24;
                break;
            }
            case 56: {
                n4 = 59;
                break;
            }
            case 57: {
                n4 = 58;
                break;
            }
            case 58: {
                n4 = 63;
                break;
            }
            case 59: {
                n4 = 42;
                break;
            }
            case 60: {
                n4 = 36;
                break;
            }
            case 61: {
                n4 = 12;
                break;
            }
            case 62: {
                n4 = 45;
                break;
            }
            default: {
                n4 = 9;
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
        k6.g[n5] = new String(cArray);
        return n5;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public void G() {
        block62: {
            var1_1 = k6.a ^ 122946913071903L;
            try {
                block60: {
                    block61: {
                        block69: {
                            block68: {
                                block59: {
                                    block56: {
                                        block58: {
                                            block66: {
                                                block57: {
                                                    block54: {
                                                        block52: {
                                                            block55: {
                                                                block64: {
                                                                    block53: {
                                                                        var3_2 = new FV();
                                                                        try {
                                                                            if (!this.T.F().X.s().booleanValue()) {
                                                                                this.T.c().e(var3_2, true);
                                                                            }
                                                                        }
                                                                        catch (Throwable v0) {
                                                                            throw k6.a(v0);
                                                                        }
                                                                        this.Z();
                                                                        try {
                                                                            if (SE.h.o().W() != null) {
                                                                                SE.h.o().W().y();
                                                                            }
                                                                        }
                                                                        catch (Throwable var4_4) {
                                                                            SE.W(var4_4);
                                                                        }
                                                                        var4_5 = this.Y(true);
                                                                        var5_6 = this.T.o().Q(true);
                                                                        for (Object var7_8 : this.T.o().T()) {
                                                                            var7_8.m(true);
                                                                        }
                                                                        var6_7 = (zy)_b.S().c().s(var4_5).exceptionally((Function<Throwable, zy>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$storeSettings$1(a.FV java.lang.Throwable ), (Ljava/lang/Throwable;)La/zy;)((FV)var3_2)).join();
                                                                        if (var6_7 == null) break block52;
                                                                        try {
                                                                            block63: {
                                                                                if (!var6_7.b()) break block53;
                                                                                break block63;
                                                                                catch (Throwable v1) {
                                                                                    throw k6.a(v1);
                                                                                }
                                                                            }
                                                                            var3_2.S(1);
                                                                            break block54;
                                                                        }
                                                                        catch (Throwable v2) {
                                                                            throw k6.a(v2);
                                                                        }
                                                                    }
                                                                    if (var6_7.A() == null) break block55;
                                                                    if (var6_7.A().contains((CharSequence)k6.b("n", (int)k6.a("m", (int)26177, (long)(7435662734210930697L ^ var1_1)), (long)-3894124154080570236L, (long)var1_1))) ** GOTO lbl49
                                                                    break block64;
                                                                    catch (Throwable v3) {
                                                                        throw k6.a(v3);
                                                                    }
                                                                }
                                                                try {
                                                                    block65: {
                                                                        if (!var6_7.A().contains((CharSequence)k6.b("n", (int)k6.a("m", (int)17892, (long)(5624839300296031142L ^ var1_1)), (long)-3894124154080570236L, (long)var1_1))) break block55;
                                                                        break block65;
                                                                        catch (Throwable v4) {
                                                                            throw k6.a(v4);
                                                                        }
                                                                    }
                                                                    var3_2.S(3);
                                                                    break block54;
                                                                }
                                                                catch (Throwable v5) {
                                                                    throw k6.a(v5);
                                                                }
                                                            }
                                                            var3_2.S(4);
                                                            break block54;
                                                        }
                                                        try {
                                                            if (var3_2.H() == 1) {
                                                                var3_2.S(5);
                                                            }
                                                        }
                                                        catch (Throwable v6) {
                                                            throw k6.a(v6);
                                                        }
                                                    }
                                                    var7_8 = (zy)_b.S().c().M(var5_6).exceptionally((Function<Throwable, zy>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$storeSettings$2(a.FV java.lang.Throwable ), (Ljava/lang/Throwable;)La/zy;)((FV)var3_2)).join();
                                                    try {
                                                        if (var7_8 == null) break block56;
                                                        if (!var7_8.b()) break block57;
                                                    }
                                                    catch (Throwable v7) {
                                                        throw k6.a(v7);
                                                    }
                                                    var3_2.X(1);
                                                    for (Object var9_10 : this.T.o().T()) {
                                                        var9_10.j(false);
                                                    }
                                                    break block59;
                                                }
                                                if (var7_8.A() == null) break block58;
                                                if (var7_8.A().contains((CharSequence)k6.b("n", (int)k6.a("m", (int)5303, (long)(5991065300987669243L ^ var1_1)), (long)-3894124154080570236L, (long)var1_1))) ** GOTO lbl91
                                                break block66;
                                                catch (Throwable v8) {
                                                    throw k6.a(v8);
                                                }
                                            }
                                            try {
                                                block67: {
                                                    if (!var7_8.A().contains((CharSequence)k6.b("n", (int)k6.a("m", (int)19761, (long)(4667669868427129720L ^ var1_1)), (long)-3894124154080570236L, (long)var1_1))) break block58;
                                                    break block67;
                                                    catch (Throwable v9) {
                                                        throw k6.a(v9);
                                                    }
                                                }
                                                var3_2.X(3);
                                                break block59;
                                            }
                                            catch (Throwable v10) {
                                                throw k6.a(v10);
                                            }
                                        }
                                        var3_2.X(4);
                                        var3_2.G(var7_8.A());
                                        break block59;
                                    }
                                    try {
                                        if (var3_2.Y() != 1) ** GOTO lbl107
                                        var3_2.X(5);
                                    }
                                    catch (Throwable v11) {
                                        throw k6.a(v11);
                                    }
                                }
                                if (var7_8 == null) break block60;
                                if (!var7_8.b()) break block60;
                                break block68;
                                catch (Throwable v12) {
                                    throw k6.a(v12);
                                }
                            }
                            if (k6.t) break block61;
                            break block69;
                            catch (Throwable v13) {
                                throw k6.a(v13);
                            }
                        }
                        try {
                            block70: {
                                if (var7_8.h() != null) break block61;
                                break block70;
                                catch (Throwable v14) {
                                    throw k6.a(v14);
                                }
                            }
                            throw new AssertionError();
                        }
                        catch (Throwable v15) {
                            throw k6.a(v15);
                        }
                    }
                    var8_9 = (IQ)var7_8.h();
                    for (BZ var10_11 : this.T.o().T()) {
                        var11_12 = var8_9.A().values().stream().filter((Predicate<cM>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$storeSettings$3(a.BZ a.cM ), (La/cM;)Z)((BZ)var10_11)).findFirst().orElse(null);
                        try {
                            if (var11_12 == null) {
                                continue;
                            }
                        }
                        catch (Throwable v16) {
                            throw k6.a(v16);
                        }
                        try {
                            if (var11_12.T().equals(var10_11.k())) {
                                continue;
                            }
                        }
                        catch (Throwable v17) {
                            throw k6.a(v17);
                        }
                        var10_11.F(var11_12.T());
                    }
                }
                var3_2.u();
                if (!var3_2.u()) break block62;
                try {
                    block71: {
                        if (!this.T.F().X.s().booleanValue()) break block62;
                        break block71;
                        catch (Throwable v18) {
                            throw k6.a(v18);
                        }
                    }
                    this.T.c().h(var3_2);
                }
                catch (Throwable v19) {
                    throw k6.a(v19);
                }
            }
            catch (Exception var3_3) {
                SE.W(var3_3);
            }
        }
        this.r.set(false);
    }

    public boolean h() {
        return this.r.get();
    }

    public void c() {
        this.r.set(false);
    }

    public void M() {
        try {
            this.r.set(false);
            if (this.e == null) {
                this.e = new su();
                new Thread(this.e).start();
            }
        }
        catch (O_ o_2) {
            throw k6.a(o_2);
        }
        this.e.z();
    }

    private static boolean lambda$storeSettings$3(BZ bZ2, cM cM2) {
        boolean bl2;
        block5: {
            block4: {
                long l10 = a ^ 0x2BFC1079D22AL;
                try {
                    try {
                        if (!cM2.S().equals(bZ2.T()) && !cM2.S().equals((String)((Object)k6.b("n", (int)k6.a("m", (int)361, (long)(0x81E116D1F8ADE1DL ^ l10)), (long)7548049036028147121L, (long)l10)) + ec.A(bZ2.T()))) break block4;
                    }
                    catch (O_ o_2) {
                        throw k6.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw k6.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    public JsonObject Y(boolean bl2) {
        CallSite callSite;
        JsonObject jsonObject;
        long l10 = a ^ 0x5B118CE3C763L;
        JsonObject jsonObject2 = new JsonObject();
        try {
            jsonObject2.add((String)((Object)k6.b("n", (int)k6.a("m", (int)32, (long)(0x1BA77007936BCA16L ^ l10)), (long)9045900376103313656L, (long)l10)), (JsonElement)SE.h.j().P());
            jsonObject = jsonObject2;
            callSite = bl2 ? k6.b("n", (int)k6.a("m", (int)123, (long)(0x6AE71BCAB7634A49L ^ l10)), (long)9045900376103313656L, (long)l10) : k6.b("n", (int)k6.a("m", (int)1712, (long)(0x24BB6420505C4C8CL ^ l10)), (long)9045900376103313656L, (long)l10);
        }
        catch (O_ o_2) {
            throw k6.a(o_2);
        }
        try {
            jsonObject.add((String)((Object)callSite), (JsonElement)SE.h.V().B());
            if (!bl2) {
                jsonObject2.add((String)((Object)k6.b("n", (int)k6.a("m", (int)31201, (long)(0xA31D1814AF133D0L ^ l10)), (long)9045900376103313656L, (long)l10)), (JsonElement)SE.h.o().Q(false));
            }
        }
        catch (O_ o_3) {
            throw k6.a(o_3);
        }
        return jsonObject2;
    }

    private static zy lambda$storeSettings$2(FV fV2, Throwable throwable) {
        block7: {
            block6: {
                Throwable throwable2;
                Throwable throwable3 = throwable;
                while ((throwable2 = throwable.getCause()) != null) {
                    throwable = throwable2;
                }
                try {
                    if (!(throwable instanceof _a)) break block6;
                    fV2.X(((_a)throwable).e());
                    break block7;
                }
                catch (O_ o_2) {
                    throw k6.a(o_2);
                }
            }
            try {
                fV2.X(2);
                if (throwable instanceof IOException) {
                    fV2.j(throwable.getClass().getName());
                    fV2.e(throwable.getMessage());
                }
            }
            catch (O_ o_3) {
                throw k6.a(o_3);
            }
        }
        return null;
    }

    public k6(SE sE2) {
        this.T = sE2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = k6.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = k6.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l10, long l11) {
        int n2 = k6.a(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = k6.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = k6.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = k6.a(clazz3, string2, clazz2)) != null) {
                    k6.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = k6.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        k6.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = k6.b(250334785246834L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static zy lambda$storeSettings$1(FV fV2, Throwable throwable) {
        block4: {
            block3: {
                Throwable throwable2;
                Throwable throwable3 = throwable;
                while ((throwable2 = throwable.getCause()) != null) {
                    throwable = throwable2;
                }
                try {
                    if (!(throwable instanceof _a)) break block3;
                    fV2.S(((_a)throwable).e());
                    break block4;
                }
                catch (O_ o_2) {
                    throw k6.a(o_2);
                }
            }
            fV2.S(2);
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/k6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x37BF;
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
                throw new RuntimeException("a/k6", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            k6.c[n3] = n4;
        }
        return c[n3];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = k6.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = k6.a(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                k6.f[n2] = clazz = Class.forName(g[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00fc' || c10 == '\u00e0' || c10 == '\u00f6' || c10 == 'o') {
                field = k6.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e0' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = k6.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ca' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Loose catch block
     */
    public void F() {
        block23: {
            long l10 = a ^ 0x26952F322634L;
            try {
                String string;
                block25: {
                    zy zy2;
                    block24: {
                        block26: {
                            block22: {
                                boolean bl2 = this.T.r().Z();
                                if (!bl2) {
                                    // empty if block
                                }
                                if (!bl2) break block25;
                                zy2 = (zy)((CompletableFuture)_b.S().c().E().exceptionally(k6::lambda$fetchSettings$0)).join();
                                try {
                                    if (zy2 != null) break block22;
                                    break block23;
                                }
                                catch (Throwable throwable) {
                                    throw k6.a(throwable);
                                }
                            }
                            if (!zy2.b()) break block23;
                            if (t) break block24;
                            break block26;
                            catch (Throwable throwable) {
                                throw k6.a(throwable);
                            }
                        }
                        try {
                            block27: {
                                if (zy2.h() != null) break block24;
                                break block27;
                                catch (Throwable throwable) {
                                    throw k6.a(throwable);
                                }
                            }
                            throw new AssertionError();
                        }
                        catch (Throwable throwable) {
                            throw k6.a(throwable);
                        }
                    }
                    eK eK2 = (eK)zy2.h();
                    HashMap<UUID, JsonObject> hashMap = new HashMap<UUID, JsonObject>();
                    for (cM cM2 : eK2.j().values()) {
                        hashMap.put(cM2.T(), cM2.N());
                    }
                    this.T.u().w(eK2.t().values());
                    JsonObject jsonObject = new JsonObject();
                    try {
                        if (eK2.S() != null) {
                            jsonObject.add((String)((Object)k6.b("n", (int)k6.a("m", (int)11967, (long)(0x6A7E8054177805D7L ^ l10)), (long)-7143267619487612497L, (long)l10)), (JsonElement)eK2.S());
                        }
                    }
                    catch (Throwable throwable) {
                        throw k6.a(throwable);
                    }
                    try {
                        jsonObject.add((String)((Object)k6.b("n", (int)k6.a("m", (int)29548, (long)(0xC88891AE834D808L ^ l10)), (long)-7143267619487612497L, (long)l10)), BY.q.toJsonTree(hashMap));
                        if (eK2.V() != null) {
                            jsonObject.add((String)((Object)k6.b("n", (int)k6.a("m", (int)6174, (long)(0x7EDF2506351C337EL ^ l10)), (long)-7143267619487612497L, (long)l10)), (JsonElement)eK2.V());
                        }
                    }
                    catch (Throwable throwable) {
                        throw k6.a(throwable);
                    }
                    SE.h.M(jsonObject, true);
                    break block23;
                }
                CallSite callSite = k6.b("n", (long)-7143138250368547492L, (long)l10);
                try {
                    string = callSite == null ? "" : new String(ec.S((String)((Object)callSite))).trim();
                }
                catch (Throwable throwable) {
                    throw k6.a(throwable);
                }
                String string2 = string;
                JsonReader jsonReader = new JsonReader((Reader)new StringReader(string2));
                jsonReader.setLenient(true);
                JsonObject jsonObject = (JsonObject)new Gson().fromJson(jsonReader, JsonObject.class);
                if (jsonObject != null) {
                    SE.h.M(jsonObject, false);
                    for (BZ bZ2 : SE.h.o().T()) {
                        bZ2.j(true);
                    }
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    private static zy lambda$fetchSettings$0(Throwable throwable) {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                k6.a = d8.a(-245952097028767205L, -3904362830919393963L, MethodHandles.lookup().lookupClass()).a(121469667752085L);
                k6.f = new Object[6];
                k6.g = new String[6];
                k6.b();
                k6.d = new HashMap<K, V>(13);
                var0 = k6.a ^ 65171285183791L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "\u00e3\u0007gx\u00c5\u00d6\u0017\u00deS\u00b3\u00eaPl\u00a9\u00a8E\u0097\u0003g\u00e5\u00fa\u009b\u0011\"\"\u00c6\u0095x\u0080\u00d5\u00af\u00d2\u000f{r\u00e2]X\u00fb\u009a9Q\u0018\u0013\u00d2\u0088D`A\u00c7\u00b1\u0092\u00af\u008fR$\u0002\u00b1_l/\u00a5\u00ec\u001f\u001a\u00bdH\u00b1\u001d\u00e8\u00f4\u00cd/V\u00bap\ng\u00e4\u00f6";
                var7_6 = "\u00e3\u0007gx\u00c5\u00d6\u0017\u00deS\u00b3\u00eaPl\u00a9\u00a8E\u0097\u0003g\u00e5\u00fa\u009b\u0011\"\"\u00c6\u0095x\u0080\u00d5\u00af\u00d2\u000f{r\u00e2]X\u00fb\u009a9Q\u0018\u0013\u00d2\u0088D`A\u00c7\u00b1\u0092\u00af\u008fR$\u0002\u00b1_l/\u00a5\u00ec\u001f\u001a\u00bdH\u00b1\u001d\u00e8\u00f4\u00cd/V\u00bap\ng\u00e4\u00f6".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00c5;\u00f7'\u00f7\u00e7f\u00e7\u00e8\u008dG\u00ca1\u00d8\u00eeK";
                    var7_6 = "\u00c5;\u00f7'\u00f7\u00e7f\u00e7\u00e8\u008dG\u00ca1\u00d8\u00eeK".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block11;
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
        k6.b = var8_3;
        k6.c = new Integer[12];
        try {
            v8 = k6.class.desiredAssertionStatus() == false;
        }
        catch (O_ v9) {
            throw k6.a(v9);
        }
        k6.t = v8;
    }

    public Nr c() {
        return this.y;
    }

    private static void b() {
        Object[] objectArray = f;
        f[0] = "G\b\"";
        objectArray[1] = Integer.TYPE;
        k6.g[1] = "java/lang/Integer";
        objectArray[2] = "B\u001fZrV\"I\u0010K=+:Z\u0017Bt";
        objectArray[3] = "P\u007fRp_[[pC?>UP{Ge";
        objectArray[4] = "\nB*,l\u0006\u0018\ns\u001cz\u001e`\u0003udm\u0005_\nm-ze";
        Object[] objectArray2 = objectArray;
        objectArray[5] = "uNi2o?g\u00060\u0002}'\u001fJ9ejbuO+9\u0016e}N,b)le\u0007;\u0002";
    }

    public void a() {
        this.r.set(true);
        this.y.I();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = k6.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = k6.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(k6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(k6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

