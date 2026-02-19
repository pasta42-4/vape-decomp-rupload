/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ao;
import a.BZ;
import a.C_;
import a.G5;
import a.OT;
import a.O_;
import a.SE;
import a.d8;
import a.fU;
import a.hY;
import a.iw;
import a.wr;
import a.yG;
import a.yh;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class yo
extends yh {
    private boolean Ae;
    private static final long bb;
    private static final Map mb;
    private int AP;
    private static final long[] eb;
    private float AZ;
    @Nullable
    private iw Ai;
    private static final Integer[] lb;
    private static final String[] pb;
    private final hY A1;
    private static final Object[] ob;
    private OT At;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                yo.bb = d8.a(-6868199305603833497L, 8013206688781795514L, MethodHandles.lookup().lookupClass()).a(33621448646080L);
                yo.ob = new Object[5];
                yo.pb = new String[5];
                yo.D();
                yo.mb = new HashMap<K, V>(13);
                var0 = yo.bb ^ 85479875451621L;
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
                var6_5 = "X\u001bi-_\u00a2z\u00d7\u001fW\u009b\u00fdZ\u00cf\r=\u00b3\u0015W\u00d5\u00d5#\u00c5mm\u00a9}Q\u0096\u0093A\u00f4i\u0005\u00ff\u0082J(\u0095-\u00a2\u00f2\u0098\u007f\u00ae\u00a7\u00c2\u009b\u0082nCF\u00984Cv\u00daN\u00dc\u00e9j'\u00ef\u00db\u00ceN\u0085hA\u00b4\u00c4v\u00c2-\u00aa\u0002\u0098x,&";
                var7_6 = "X\u001bi-_\u00a2z\u00d7\u001fW\u009b\u00fdZ\u00cf\r=\u00b3\u0015W\u00d5\u00d5#\u00c5mm\u00a9}Q\u0096\u0093A\u00f4i\u0005\u00ff\u0082J(\u0095-\u00a2\u00f2\u0098\u007f\u00ae\u00a7\u00c2\u009b\u0082nCF\u00984Cv\u00daN\u00dc\u00e9j'\u00ef\u00db\u00ceN\u0085hA\u00b4\u00c4v\u00c2-\u00aa\u0002\u0098x,&".length();
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
                    var6_5 = "\u0014<\u00e2x\u00b8~\u00c6\u000bd\u00aa\u00b6\u008a\u0080\u00ab\u00dc)";
                    var7_6 = "\u0014<\u00e2x\u00b8~\u00c6\u000bd\u00aa\u00b6\u008a\u0080\u00ab\u00dc)".length();
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
        yo.eb = var8_3;
        yo.lb = new Integer[12];
    }

    private void lambda$new$1(boolean bl2) {
        block7: {
            fU fU2;
            block8: {
                block6: {
                    long l10 = bb ^ 0x145F683A01D1L;
                    fU2 = Ao.D(fU.class);
                    try {
                        if (!bl2) break block6;
                        C_.P(this.V(), (String)((Object)yo.d("w", (int)yo.c("v", (int)25545, (long)(0x7A7D60DF571D5750L ^ l10)), (long)-448894835851668767L, (long)l10)), (String)((Object)yo.d("w", (int)yo.c("v", (int)23904, (long)(0x7FC9C4163B0E9FAL ^ l10)), (long)-448894835851668767L, (long)l10)), (String)((Object)yo.d("w", (int)yo.c("v", (int)4645, (long)(0x469FE9C96306A6B5L ^ l10)), (long)-448894835851668767L, (long)l10)), () -> this.lambda$null$0(fU2));
                        break block7;
                    }
                    catch (O_ o_2) {
                        throw yo.a(o_2);
                    }
                }
                BZ bZ2 = SE.h.o().A();
                BZ bZ3 = this.X().P();
                try {
                    try {
                        bZ2.y();
                        if (bZ3 == null || !bZ3.equals(bZ2)) break block8;
                    }
                    catch (O_ o_3) {
                        throw yo.a(o_3);
                    }
                    this.j(bZ3.X(false));
                }
                catch (O_ o_4) {
                    throw yo.a(o_4);
                }
            }
            fU2.f(this.M());
            fU2.e(this.X());
            Ao.K.T(Ao.o);
        }
    }

    @Override
    public void E() {
        block3: {
            double d2;
            G5 g5;
            G5 g52;
            long l10;
            block2: {
                l10 = bb ^ 0x43692830952DL;
                super.E();
                g52 = this.t(0.8);
                g5 = this.t(0.8);
                d2 = this.A1.g() + 0.5;
                try {
                    if (!this.Ae) break block2;
                    g52.R(this.AP + (String)((Object)yo.d("w", (int)yo.c("v", (int)16894, (long)(0x271B74AFFEAAE193L ^ l10)), (long)7870431432169440797L, (long)l10)), this.G() + (double)this.AZ, d2, yo.M.c);
                    g5.R((String)((Object)yo.d("w", (int)yo.c("v", (int)32294, (long)(0x16613F2E86CFDE48L ^ l10)), (long)7870431432169440797L, (long)l10)), this.G() + (double)this.AZ + g52.D(this.AP + (String)((Object)yo.d("w", (int)yo.c("v", (int)12236, (long)(0x3DE6C4B379D08FAFL ^ l10)), (long)7870431432169440797L, (long)l10))), d2, yo.M.w);
                    break block3;
                }
                catch (O_ o_2) {
                    throw yo.a(o_2);
                }
            }
            g52.R(this.AP + (String)((Object)yo.d("w", (int)yo.c("v", (int)27366, (long)(0x7659FF2D718A4A86L ^ l10)), (long)7870431432169440797L, (long)l10)), this.G() + (double)this.AZ, d2, yo.M.c);
            g5.R((String)((Object)yo.d("w", (int)yo.c("v", (int)2547, (long)(0x3C25BC7415ABA994L ^ l10)), (long)7870431432169440797L, (long)l10)), this.G() + (double)this.AZ + g52.D(this.AP + (String)((Object)yo.d("w", (int)yo.c("v", (int)8490, (long)(0x1EF18ACE2E61814EL ^ l10)), (long)7870431432169440797L, (long)l10))), d2, yo.M.w);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field o(long l10, long l11) {
        int n2 = yo.m(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            String string = pb[n2];
            int n3 = string.indexOf(8);
            Class clazz = yo.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = yo.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yo.g(clazz3, string2, clazz2)) != null) {
                    yo.ob[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = yo.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        yo.ob[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yo.n(230093047027224L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = yo.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void b(boolean bl2) {
        this.Ae = bl2;
        this.AP = this.At.d(bl2).size();
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x4D5E;
        if (lb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = eb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yo", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            yo.lb[n3] = n4;
        }
        return lb[n3];
    }

    private void lambda$null$0(fU fU2) {
        fU2.V();
        this.I();
    }

    public void G(@Nullable iw iw2) {
        this.Ai = iw2;
    }

    @Nullable
    public iw M() {
        return this.Ai;
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (pb[n5] != null) {
            return n5;
        }
        Object object = ob[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 8;
                break;
            }
            case 1: {
                n4 = 12;
                break;
            }
            case 2: {
                n4 = 26;
                break;
            }
            case 3: {
                n4 = 37;
                break;
            }
            case 4: {
                n4 = 63;
                break;
            }
            case 5: {
                n4 = 38;
                break;
            }
            case 6: {
                n4 = 53;
                break;
            }
            case 7: {
                n4 = 44;
                break;
            }
            case 8: {
                n4 = 10;
                break;
            }
            case 9: {
                n4 = 11;
                break;
            }
            case 10: {
                n4 = 58;
                break;
            }
            case 11: {
                n4 = 7;
                break;
            }
            case 12: {
                n4 = 22;
                break;
            }
            case 13: {
                n4 = 56;
                break;
            }
            case 14: {
                n4 = 21;
                break;
            }
            case 15: {
                n4 = 13;
                break;
            }
            case 16: {
                n4 = 32;
                break;
            }
            case 17: {
                n4 = 0;
                break;
            }
            case 18: {
                n4 = 28;
                break;
            }
            case 19: {
                n4 = 46;
                break;
            }
            case 20: {
                n4 = 43;
                break;
            }
            case 21: {
                n4 = 27;
                break;
            }
            case 22: {
                n4 = 61;
                break;
            }
            case 23: {
                n4 = 9;
                break;
            }
            case 24: {
                n4 = 4;
                break;
            }
            case 25: {
                n4 = 24;
                break;
            }
            case 26: {
                n4 = 34;
                break;
            }
            case 27: {
                n4 = 48;
                break;
            }
            case 28: {
                n4 = 6;
                break;
            }
            case 29: {
                n4 = 1;
                break;
            }
            case 30: {
                n4 = 59;
                break;
            }
            case 31: {
                n4 = 39;
                break;
            }
            case 32: {
                n4 = 19;
                break;
            }
            case 33: {
                n4 = 51;
                break;
            }
            case 34: {
                n4 = 40;
                break;
            }
            case 35: {
                n4 = 55;
                break;
            }
            case 36: {
                n4 = 23;
                break;
            }
            case 37: {
                n4 = 18;
                break;
            }
            case 38: {
                n4 = 16;
                break;
            }
            case 39: {
                n4 = 20;
                break;
            }
            case 40: {
                n4 = 36;
                break;
            }
            case 41: {
                n4 = 54;
                break;
            }
            case 42: {
                n4 = 5;
                break;
            }
            case 43: {
                n4 = 57;
                break;
            }
            case 44: {
                n4 = 52;
                break;
            }
            case 45: {
                n4 = 31;
                break;
            }
            case 46: {
                n4 = 42;
                break;
            }
            case 47: {
                n4 = 2;
                break;
            }
            case 48: {
                n4 = 3;
                break;
            }
            case 49: {
                n4 = 45;
                break;
            }
            case 50: {
                n4 = 25;
                break;
            }
            case 51: {
                n4 = 62;
                break;
            }
            case 52: {
                n4 = 30;
                break;
            }
            case 53: {
                n4 = 49;
                break;
            }
            case 54: {
                n4 = 35;
                break;
            }
            case 55: {
                n4 = 50;
                break;
            }
            case 56: {
                n4 = 29;
                break;
            }
            case 57: {
                n4 = 60;
                break;
            }
            case 58: {
                n4 = 33;
                break;
            }
            case 59: {
                n4 = 41;
                break;
            }
            case 60: {
                n4 = 17;
                break;
            }
            case 61: {
                n4 = 47;
                break;
            }
            case 62: {
                n4 = 15;
                break;
            }
            default: {
                n4 = 14;
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
        yo.pb[n5] = new String(cArray);
        return n5;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = yo.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = yo.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void I() {
        try {
            if (this.At != null) {
                this.AP = this.At.d(this.Ae).size();
            }
        }
        catch (O_ o_2) {
            throw yo.a(o_2);
        }
    }

    private static Method p(long l10, long l11) {
        int n2 = yo.m(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = yo.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = yo.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yo.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        yo.ob[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yo.n(230093047027224L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = yo.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        yo.ob[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yo.n(230093047027224L, 0L);
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

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = yo.m(l10, l11);
            object = ob[n2];
            try {
                if (!(object instanceof String)) break block2;
                yo.ob[n2] = clazz = Class.forName(pb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public yo(OT oT2, double d2, boolean bl2) {
        CallSite callSite;
        hY hY2;
        hY hY3;
        long l10 = bb ^ 0x9250778106DL;
        super(110.0);
        this.AZ = 6.0f;
        this.i(false);
        yG yG2 = new yG(d2, 12.0);
        try {
            hY hY4;
            this.o(new wr(2.0, yG2));
            yo yo2 = this;
            hY3 = hY4;
            hY2 = hY4;
            callSite = bl2 ? yo.d("w", (int)yo.c("v", (int)13583, (long)(0x67E32EE5A2891020L ^ l10)), (long)-1695277622406167715L, (long)l10) : yo.d("w", (int)yo.c("v", (int)14843, (long)(0x272DD09201AF1CDAL ^ l10)), (long)-1695277622406167715L, (long)l10);
        }
        catch (O_ o_2) {
            throw yo.a(o_2);
        }
        hY3((String)((Object)callSite), 0.75, false);
        yo2.A1 = hY2;
        this.A1.T(20.0);
        this.A1.w(14.0);
        yG2.n(this.A1, yo.d("w", (int)yo.c("v", (int)31784, (long)(0x4639407CB7AE590AL ^ l10)), (long)-1695277622406167715L, (long)l10));
        yG2.i(false);
        this.A1.c(null);
        this.A1.N(() -> this.lambda$new$1(bl2));
        this.j(oT2);
    }

    private static void D() {
        Object[] objectArray = ob;
        ob[0] = "\f\n\u0007";
        objectArray[1] = Integer.TYPE;
        yo.pb[1] = "java/lang/Integer";
        objectArray[2] = "g1\\u\u0019\\l>M:dD\u007f9Ds";
        objectArray[3] = "`LbV \u0016kCs\u0019A\u0018`HwC";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "c\u00183R8q&\n2<-n_\u0015,B~.2]9VF,.\u001fmA*tfZ8<";
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

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e1' || c10 == 'a' || c10 == 'y' || c10 == 'E') {
                field = yo.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yo.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void j(OT oT2) {
        boolean bl2;
        hY hY2;
        try {
            this.At = oT2;
            this.I();
            hY2 = this.A1;
            bl2 = oT2 != null;
        }
        catch (O_ o_2) {
            throw yo.a(o_2);
        }
        hY2.N(bl2);
        this.A();
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = yo.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public OT X() {
        return this.At;
    }

    public void H(float f10) {
        this.AZ = f10;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = yo.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = yo.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yo.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(yo.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

