/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.O_;
import a.bJ;
import a.d8;
import a.f1;
import a.fB;
import a.hW;
import a.yG;
import a.yS;
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
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class yq
extends yS {
    @Nullable
    private hW BE;
    private static final Map pb;
    private static int Bk;
    protected boolean BX = true;
    protected yG BM;
    protected yG Ba;
    private static final long[] mb;
    protected final f1 Bs;
    @Nullable
    private CompletableFuture<?> Bq;
    @Nullable
    private fB Bu;
    private static final String[] Db;
    private static final long bb;
    private static final Object[] Cb;
    private static final Integer[] ob;

    public void v() {
        long l10 = bb ^ 0x33657E78F1E7L;
        this.BM.d().f((String)((Object)yq.i("\u00d6", (int)yq.c("d", (int)10229, (long)(0x2C3D32F99A8DB7L ^ l10)), (long)3174784035142495669L, (long)l10)));
        this.BM.i(false);
        this.BM.k();
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = yq.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    @Nullable
    public fB z() {
        return this.Bu;
    }

    @Nullable
    public hW o() {
        return this.BE;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = yq.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = yq.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                yq.bb = d8.a(2624732973291746670L, 341689244563423922L, MethodHandles.lookup().lookupClass()).a(85204524665044L);
                yq.Cb = new Object[5];
                yq.Db = new String[5];
                yq.db();
                yq.pb = new HashMap<K, V>(13);
                yq.F(48);
                var0 = yq.bb ^ 57799813078090L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u0095b\u00f2\u009b\u00bf\u00fb-\\`\u00ec\u0005\u00d9zB\u0082\u00966\u00c5M:4\u00ad\u00aa\u008e";
                var7_6 = "\u0095b\u00f2\u009b\u00bf\u00fb-\\`\u00ec\u0005\u00d9zB\u0082\u00966\u00c5M:4\u00ad\u00aa\u008e".length();
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
                    var6_5 = "\u0018\u00e3#\u0094\u001a\u0086\u00d5\u00fd\u0097k\u00a23Hw\u00cc\u00b7";
                    var7_6 = "\u0018\u00e3#\u0094\u001a\u0086\u00d5\u00fd\u0097k\u00a23Hw\u00cc\u00b7".length();
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
        yq.mb = var8_3;
        yq.ob = new Integer[5];
    }

    private static CallSite i(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method p(long l10, long l11) {
        int n2 = yq.m(l10, l11);
        Object object = Cb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = Db[n2];
                int n4 = string2.indexOf(8);
                clazz3 = yq.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = yq.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yq.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        yq.Cb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yq.n(270168361496481L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = yq.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        yq.Cb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yq.n(270168361496481L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = yq.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void F(int n2) {
        Bk = n2;
    }

    @Nullable
    public CompletableFuture<?> K() {
        return this.Bq;
    }

    public void T() {
        block6: {
            CompletableFuture<?> completableFuture = this.Bq;
            try {
                try {
                    try {
                        if (completableFuture == null || completableFuture.isCancelled()) break block6;
                    }
                    catch (O_ o_2) {
                        throw yq.e(o_2);
                    }
                    if (completableFuture.isCompletedExceptionally()) break block6;
                }
                catch (O_ o_3) {
                    throw yq.e(o_3);
                }
                completableFuture.cancel(true);
            }
            catch (O_ o_4) {
                throw yq.e(o_4);
            }
        }
    }

    private static O_ e(O_ o_2) {
        return o_2;
    }

    public void m() {
        long l10 = bb ^ 0x4BEDBD3ECD08L;
        this.Ba.d().f((String)((Object)yq.i("\u00d6", (int)yq.c("d", (int)27418, (long)(0x2C762EC42345FDB4L ^ l10)), (long)1216079422260105562L, (long)l10)));
        this.Ba.k();
    }

    public static int Q() {
        int n2 = yq.v();
        try {
            if (n2 == 0) {
                return 57;
            }
        }
        catch (O_ o_2) {
            throw yq.e(o_2);
        }
        return 0;
    }

    public void x(@Nullable fB fB2) {
        this.Bu = fB2;
    }

    public void X(@Nullable CompletableFuture<?> completableFuture) {
        this.Bq = completableFuture;
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (Db[n5] != null) {
            return n5;
        }
        Object object = Cb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 54;
                break;
            }
            case 1: {
                n4 = 53;
                break;
            }
            case 2: {
                n4 = 4;
                break;
            }
            case 3: {
                n4 = 32;
                break;
            }
            case 4: {
                n4 = 45;
                break;
            }
            case 5: {
                n4 = 49;
                break;
            }
            case 6: {
                n4 = 27;
                break;
            }
            case 7: {
                n4 = 57;
                break;
            }
            case 8: {
                n4 = 41;
                break;
            }
            case 9: {
                n4 = 0;
                break;
            }
            case 10: {
                n4 = 56;
                break;
            }
            case 11: {
                n4 = 33;
                break;
            }
            case 12: {
                n4 = 37;
                break;
            }
            case 13: {
                n4 = 15;
                break;
            }
            case 14: {
                n4 = 55;
                break;
            }
            case 15: {
                n4 = 30;
                break;
            }
            case 16: {
                n4 = 38;
                break;
            }
            case 17: {
                n4 = 29;
                break;
            }
            case 18: {
                n4 = 11;
                break;
            }
            case 19: {
                n4 = 39;
                break;
            }
            case 20: {
                n4 = 59;
                break;
            }
            case 21: {
                n4 = 8;
                break;
            }
            case 22: {
                n4 = 24;
                break;
            }
            case 23: {
                n4 = 5;
                break;
            }
            case 24: {
                n4 = 42;
                break;
            }
            case 25: {
                n4 = 34;
                break;
            }
            case 26: {
                n4 = 58;
                break;
            }
            case 27: {
                n4 = 47;
                break;
            }
            case 28: {
                n4 = 6;
                break;
            }
            case 29: {
                n4 = 51;
                break;
            }
            case 30: {
                n4 = 31;
                break;
            }
            case 31: {
                n4 = 62;
                break;
            }
            case 32: {
                n4 = 14;
                break;
            }
            case 33: {
                n4 = 23;
                break;
            }
            case 34: {
                n4 = 18;
                break;
            }
            case 35: {
                n4 = 48;
                break;
            }
            case 36: {
                n4 = 36;
                break;
            }
            case 37: {
                n4 = 21;
                break;
            }
            case 38: {
                n4 = 28;
                break;
            }
            case 39: {
                n4 = 19;
                break;
            }
            case 40: {
                n4 = 17;
                break;
            }
            case 41: {
                n4 = 20;
                break;
            }
            case 42: {
                n4 = 16;
                break;
            }
            case 43: {
                n4 = 13;
                break;
            }
            case 44: {
                n4 = 10;
                break;
            }
            case 45: {
                n4 = 2;
                break;
            }
            case 46: {
                n4 = 52;
                break;
            }
            case 47: {
                n4 = 46;
                break;
            }
            case 48: {
                n4 = 7;
                break;
            }
            case 49: {
                n4 = 1;
                break;
            }
            case 50: {
                n4 = 3;
                break;
            }
            case 51: {
                n4 = 43;
                break;
            }
            case 52: {
                n4 = 44;
                break;
            }
            case 53: {
                n4 = 35;
                break;
            }
            case 54: {
                n4 = 63;
                break;
            }
            case 55: {
                n4 = 22;
                break;
            }
            case 56: {
                n4 = 50;
                break;
            }
            case 57: {
                n4 = 40;
                break;
            }
            case 58: {
                n4 = 12;
                break;
            }
            case 59: {
                n4 = 9;
                break;
            }
            case 60: {
                n4 = 61;
                break;
            }
            case 61: {
                n4 = 60;
                break;
            }
            case 62: {
                n4 = 25;
                break;
            }
            default: {
                n4 = 26;
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
        yq.Db[n5] = new String(cArray);
        return n5;
    }

    protected void J() {
        long l10 = bb ^ 0x6B35B07B9D8FL;
        this.i(false);
        this.I().f();
        this.I().i(false);
        this.T().f();
        this.T().i(false);
        this.getClass();
        double d2 = 5.0f * 4.0f;
        this.T(this.Bs.w() - d2);
        double d3 = this.Bs.b() - this.Bs.Q().b() - 2.0 - d2;
        this.getClass();
        this.w(d3 - 5.0);
        yG yG2 = this.T();
        try {
            this.T().Y(false);
            this.T().d().f((String)((Object)yq.i("\u00d6", (int)yq.c("d", (int)21712, (long)(0x51568C2652E512FBL ^ l10)), (long)4640749489064018397L, (long)l10)));
            this.T().i(this.T().b());
            this.n(yG2, new Object[0]);
            this.BM = new yG(yG2.w(), 30.0);
            this.BM.d().f((String)((Object)yq.i("\u00d6", (int)yq.c("d", (int)28618, (long)(0x37507CB326E729E2L ^ l10)), (long)4640749489064018397L, (long)l10)));
            this.BM.i(false);
            this.Ba = this.BX ? new yG(yG2.w() - 1.0, yG2.b() - this.BM.b()) : new yG(yG2.w() - 1.0, yG2.b());
        }
        catch (O_ o_2) {
            throw yq.e(o_2);
        }
        this.Ba.i(this.Ba.b() + 2.0);
        this.Ba.i(false);
        this.Ba.Q(Color.MAGENTA);
        yG2.n(this.Ba, new Object[0]);
        if (this.BX) {
            yG2.n(this.BM, new Object[0]);
            bJ bJ2 = new bJ(this.BM.w(), 1.0, 1.0, 0.0, yq.M.w);
            bJ2.k(false);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x64E;
        if (ob[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = mb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])pb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    pb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yq", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            yq.ob[n3] = n4;
        }
        return ob[n3];
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'b' || c10 == '\u00fc' || c10 == '\u00cc' || c10 == '\u00ff') {
                field = yq.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yq.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = yq.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = yq.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public yq(f1 f12) {
        super(-1.0, -1.0, new yG(-1.0, -1.0), new yG(-1.0, -1.0));
        this.Bs = f12;
        this.J();
    }

    private static Method g(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Field o(long l10, long l11) {
        int n2 = yq.m(l10, l11);
        Object object = Cb[n2];
        if (object instanceof String) {
            String string = Db[n2];
            int n3 = string.indexOf(8);
            Class clazz = yq.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = yq.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yq.g(clazz3, string2, clazz2)) != null) {
                    yq.Cb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = yq.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        yq.Cb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yq.n(270168361496481L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void Z() {
        long l10 = bb ^ 0x616A8210815DL;
        this.I().d().f((String)((Object)yq.i("\u00d6", (int)yq.c("d", (int)4623, (long)(0x5DC5BF5B6F13C8F1L ^ l10)), (long)6680328419065437455L, (long)l10)));
        this.I().i(false);
        this.I().k();
    }

    public void F(@Nullable hW hW2) {
        try {
            if (this.BE != null) {
                this.BE.e(false);
            }
        }
        catch (O_ o_2) {
            throw yq.e(o_2);
        }
        this.BE = hW2;
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = yq.m(l10, l11);
            object = Cb[n2];
            try {
                if (!(object instanceof String)) break block2;
                yq.Cb[n2] = clazz = Class.forName(Db[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static int v() {
        return Bk;
    }

    private static void db() {
        Object[] objectArray = Cb;
        Cb[0] = "g`:";
        objectArray[1] = Integer.TYPE;
        yq.Db[1] = "java/lang/Integer";
        objectArray[2] = "0W\n'\u0016B;X\u001bhkZ(_\u0012!";
        objectArray[3] = "\u0010Z{@\r\t\u001bUj\u000fl\u0007\u0010^nU";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u000e<\u001c~(3\u0013i\u0015B1yl5Tr'<\u0007o\t0+\u0002Uh\u00030<<\f2\u001c+Z";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yq.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(yq.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

