/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.BZ;
import a.CS;
import a.C_;
import a.O_;
import a.Sz;
import a.bE;
import a.bM;
import a.bQ;
import a.bt;
import a.d8;
import a.hL;
import a.yG;
import a.yp;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class y4
extends yp {
    @Nullable
    private Consumer<BZ> CI;
    private static final double Cv = 10.0;
    private final CS b;
    private static final String[] jb;
    private final bM CB;
    private static final long[] bb;
    private final CS C9;
    private static final long ab;
    private static final Object[] fb;
    private static final Map eb;
    private static final Integer[] db;
    @Nullable
    private BZ V;
    private final bt CY;

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "7<]";
        objectArray[1] = Integer.TYPE;
        y4.jb[1] = "java/lang/Integer";
        objectArray[2] = "m\r&\u0003lkf\u00027L\u0011su\u0005>\u0005";
        objectArray[3] = "lA\fx; gN\u001d7Z.lE\u0019m";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "S\u0014PPu\f\u001d\u0005Q0|\u001bl\\\u000b@w[\f[X]w`U\u001aHM(X\u0000\bZ\u0000\u0017";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l10, long l11) {
        int n2 = y4.e(l10, l11);
        Object object = fb[n2];
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
                clazz3 = y4.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = y4.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = y4.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        y4.fb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = y4.f(264443829735382L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = y4.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        y4.fb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = y4.f(264443829735382L, 0L);
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

    public y4(String string, @Nullable BZ bZ2, BZ ... bZArray) {
        long l10 = ab ^ 0x316724A0D31CL;
        super(new yG(108.0, 135.0));
        this.b = new CS((String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)24367, (long)(0x14201A2615F7547EL ^ l10)), (long)-188450359648540898L, (long)l10)), 5.0f, 5.0f, Color.WHITE);
        this.C9 = new CS((String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)9802, (long)(0x73EB22CC3324AD1EL ^ l10)), (long)-188450359648540898L, (long)l10)), 2.0f, 2.0f, Color.GRAY);
        this.V = bZ2;
        this.L.d().f((String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)28181, (long)(0x1D4D4B75EB94E540L ^ l10)), (long)-188450359648540898L, (long)l10)));
        this.L.i(true);
        this.L.C(true);
        this.L.Q(y4.M.Y);
        this.L.n(new bE(0.0, 10.0), new Object[0]);
        bQ bQ2 = new bQ(string, 1.0, Color.WHITE);
        bQ2.q(true);
        bQ2.w(12.0);
        bQ2.T(this.L.w());
        this.L.n(bQ2, new Object[0]);
        this.L.n(new bE(0.0, 4.0), new Object[0]);
        yG yG2 = new yG(this.L.w(), 104.0);
        yG2.i(false);
        yG2.Q(this.L.l());
        yG2.C(true);
        yG2.d().f((String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)21926, (long)(0x34D0EB4A6A625EFBL ^ l10)), (long)-188450359648540898L, (long)l10)));
        yG2.i(yG2.b());
        this.L.n(yG2, y4.c("\u00eb", (int)y4.b("o", (int)10257, (long)(0xCA458FFFEFAA343L ^ l10)), (long)-188450359648540898L, (long)l10));
        for (BZ bZ3 : bZArray) {
            hL hL2 = new hL(bZ3.T());
            hL2.T(yG2.w());
            hL2.w(12.0);
            hL2.C(() -> this.lambda$new$1(bZ3));
            yG2.n(hL2, y4.c("\u00eb", (int)y4.b("o", (int)8181, (long)(0x51387C314C5094A3L ^ l10)), (long)-188450359648540898L, (long)l10));
            yG2.n(new bE(0.0, 2.0), y4.c("\u00eb", (int)y4.b("o", (int)9011, (long)(0xAFEE8C77247A86FL ^ l10)), (long)-188450359648540898L, (long)l10));
        }
        this.CY = new bt((String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)4191, (long)(0x73AE943641B0FL ^ l10)), (long)-188450359648540898L, (long)l10)), 0.65f, y4.M.w);
        this.CB = new bM("", (String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)3728, (long)(0x7C24E97595B585CEL ^ l10)), (long)-188450359648540898L, (long)l10)), 58.0, 0.65f, y4.M.c, false);
        this.CB.T(this.CB.x());
        this.b.g((String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)25201, (long)(0x277D932E4D4CE922L ^ l10)), (long)-188450359648540898L, (long)l10)));
        this.o(this.CY, this.CB, this.b, this.C9);
        this.n(true);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
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

    private void lambda$null$0(BZ bZ2) {
        try {
            if (this.D != null) {
                Ao.z(this.D);
                this.D = null;
            }
        }
        catch (O_ o_2) {
            throw y4.a(o_2);
        }
        this.V = bZ2;
        Consumer<BZ> consumer = this.CI;
        try {
            if (consumer != null) {
                consumer.accept(bZ2);
            }
        }
        catch (O_ o_3) {
            throw y4.a(o_3);
        }
    }

    @Nullable
    public BZ Q() {
        return this.V;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                y4.ab = d8.a(-3639403100166348907L, -4525946676348855126L, MethodHandles.lookup().lookupClass()).a(242309244193522L);
                y4.fb = new Object[5];
                y4.jb = new String[5];
                y4.i();
                y4.eb = new HashMap<K, V>(13);
                var0 = y4.ab ^ 140022435651726L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "0\u00b2\u0005pA\u00f4F\u00b7e\u001a\u00da?\u00f64.\u00e8JH\u001d8\u00fa\u00c0m\u00a2.\u00ab\u0093Z\u00ff\u00b4\u001ek\f>\u0001\u00ca\u0082\\:\u0098\u009f\u000eP\u00fc\u00ab\u00da\u00dc\u00ea\u001f\t%\u0094u\u0015\n\u0003\u008f3\"%\u00a9N?\u00ae#\u00e6\u008d\u0002\u0005\u00f4f\u000fN\u0085*n\u00a5i\u00bc\u00ebC \u00c5\u0088\u00c3\u00c1w\u00b2";
                var7_6 = "0\u00b2\u0005pA\u00f4F\u00b7e\u001a\u00da?\u00f64.\u00e8JH\u001d8\u00fa\u00c0m\u00a2.\u00ab\u0093Z\u00ff\u00b4\u001ek\f>\u0001\u00ca\u0082\\:\u0098\u009f\u000eP\u00fc\u00ab\u00da\u00dc\u00ea\u001f\t%\u0094u\u0015\n\u0003\u008f3\"%\u00a9N?\u00ae#\u00e6\u008d\u0002\u0005\u00f4f\u000fN\u0085*n\u00a5i\u00bc\u00ebC \u00c5\u0088\u00c3\u00c1w\u00b2".length();
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
                    var6_5 = "0\u000f:\u0001:\u0002eu\u00d5\u00ba\u00ed\u00ae\u0085:\u0099\u0087";
                    var7_6 = "0\u000f:\u0001:\u0002eu\u00d5\u00ba\u00ed\u00ae\u0085:\u0099\u0087".length();
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
        y4.bb = var8_3;
        y4.db = new Integer[13];
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7634;
        if (db[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
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
                throw new RuntimeException("a/y4", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            y4.db[n3] = n4;
        }
        return db[n3];
    }

    @Override
    public void G() {
        double d2;
        CS cS2;
        String string;
        bM bM2;
        boolean bl2;
        CS cS3;
        try {
            this.CY.b(this.G());
            this.CY.M(this.W());
            cS3 = this.b;
            bl2 = this.V == null;
        }
        catch (O_ o_2) {
            throw y4.a(o_2);
        }
        try {
            cS3.N(bl2);
            this.b.b(this.CY.G() + this.CY.D() + 5.0);
            this.b.M(this.W() - 1.0);
            this.CB.b(this.CY.G() + this.CY.D() + 8.0);
            this.CB.M(this.W() + 2.0);
            bM2 = this.CB;
            string = this.V != null ? this.V.T() : "";
        }
        catch (O_ o_3) {
            throw y4.a(o_3);
        }
        try {
            bM2.d(string);
            cS2 = this.C9;
            d2 = this.b.f() ? this.b.G() + this.b.w() + 4.0 : this.CB.G() + this.CB.u() + 2.0;
        }
        catch (O_ o_4) {
            throw y4.a(o_4);
        }
        cS2.b(d2);
        this.C9.M(this.W() + 2.0);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = y4.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = y4.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = y4.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (jb[n5] != null) {
            return n5;
        }
        Object object = fb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 43;
                break;
            }
            case 1: {
                n4 = 0;
                break;
            }
            case 2: {
                n4 = 44;
                break;
            }
            case 3: {
                n4 = 41;
                break;
            }
            case 4: {
                n4 = 14;
                break;
            }
            case 5: {
                n4 = 55;
                break;
            }
            case 6: {
                n4 = 7;
                break;
            }
            case 7: {
                n4 = 53;
                break;
            }
            case 8: {
                n4 = 21;
                break;
            }
            case 9: {
                n4 = 38;
                break;
            }
            case 10: {
                n4 = 18;
                break;
            }
            case 11: {
                n4 = 48;
                break;
            }
            case 12: {
                n4 = 23;
                break;
            }
            case 13: {
                n4 = 5;
                break;
            }
            case 14: {
                n4 = 1;
                break;
            }
            case 15: {
                n4 = 63;
                break;
            }
            case 16: {
                n4 = 57;
                break;
            }
            case 17: {
                n4 = 31;
                break;
            }
            case 18: {
                n4 = 17;
                break;
            }
            case 19: {
                n4 = 59;
                break;
            }
            case 20: {
                n4 = 36;
                break;
            }
            case 21: {
                n4 = 54;
                break;
            }
            case 22: {
                n4 = 56;
                break;
            }
            case 23: {
                n4 = 24;
                break;
            }
            case 24: {
                n4 = 20;
                break;
            }
            case 25: {
                n4 = 8;
                break;
            }
            case 26: {
                n4 = 29;
                break;
            }
            case 27: {
                n4 = 11;
                break;
            }
            case 28: {
                n4 = 39;
                break;
            }
            case 29: {
                n4 = 52;
                break;
            }
            case 30: {
                n4 = 27;
                break;
            }
            case 31: {
                n4 = 3;
                break;
            }
            case 32: {
                n4 = 50;
                break;
            }
            case 33: {
                n4 = 22;
                break;
            }
            case 34: {
                n4 = 13;
                break;
            }
            case 35: {
                n4 = 49;
                break;
            }
            case 36: {
                n4 = 46;
                break;
            }
            case 37: {
                n4 = 61;
                break;
            }
            case 38: {
                n4 = 47;
                break;
            }
            case 39: {
                n4 = 16;
                break;
            }
            case 40: {
                n4 = 25;
                break;
            }
            case 41: {
                n4 = 2;
                break;
            }
            case 42: {
                n4 = 19;
                break;
            }
            case 43: {
                n4 = 15;
                break;
            }
            case 44: {
                n4 = 9;
                break;
            }
            case 45: {
                n4 = 51;
                break;
            }
            case 46: {
                n4 = 33;
                break;
            }
            case 47: {
                n4 = 32;
                break;
            }
            case 48: {
                n4 = 34;
                break;
            }
            case 49: {
                n4 = 40;
                break;
            }
            case 50: {
                n4 = 35;
                break;
            }
            case 51: {
                n4 = 4;
                break;
            }
            case 52: {
                n4 = 62;
                break;
            }
            case 53: {
                n4 = 6;
                break;
            }
            case 54: {
                n4 = 37;
                break;
            }
            case 55: {
                n4 = 45;
                break;
            }
            case 56: {
                n4 = 28;
                break;
            }
            case 57: {
                n4 = 42;
                break;
            }
            case 58: {
                n4 = 30;
                break;
            }
            case 59: {
                n4 = 58;
                break;
            }
            case 60: {
                n4 = 10;
                break;
            }
            case 61: {
                n4 = 26;
                break;
            }
            case 62: {
                n4 = 60;
                break;
            }
            default: {
                n4 = 12;
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
        y4.jb[n5] = new String(cArray);
        return n5;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$new$1(BZ bZ2) {
        long l10 = ab ^ 0x5E04110348D6L;
        C_.T(this.V(), (String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)24437, (long)(0x493239272FFC4FE8L ^ l10)), (long)7397182206058773716L, (long)l10)), (String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)10113, (long)(0x3524DC1211BCB714L ^ l10)), (long)7397182206058773716L, (long)l10)), (String)((Object)y4.c("\u00eb", (int)y4.b("o", (int)320, (long)(0x6255CC48E88111D1L ^ l10)), (long)7397182206058773716L, (long)l10)), () -> this.lambda$null$0(bZ2), 100.0, null, null);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = y4.e(l10, l11);
            object = fb[n2];
            try {
                if (!(object instanceof String)) break block2;
                y4.fb[n2] = clazz = Class.forName(jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Nullable
    public Consumer<BZ> a() {
        return this.CI;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = y4.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void Z(Sz sz2) {
        super.Z(sz2);
    }

    public void K(@Nullable Consumer<BZ> consumer) {
        this.CI = consumer;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = y4.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = y4.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00fc' || c10 == 'j' || c10 == '\u00f8' || c10 == '\u00ca') {
                field = y4.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = y4.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c3' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(long l10, long l11) {
        int n2 = y4.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            String string = jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = y4.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = y4.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = y4.c(clazz3, string2, clazz2)) != null) {
                    y4.fb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = y4.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        y4.fb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = y4.f(264443829735382L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(y4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

