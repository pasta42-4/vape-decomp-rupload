/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.B8;
import a.FK;
import a.Fv;
import a.Gi;
import a.I_;
import a.JF;
import a.Kx;
import a.O_;
import a.SE;
import a.T9;
import a.Tb;
import a.YH;
import a.d8;
import a.fB;
import a.sN;
import a.vi;
import a.w6;
import a.wW;
import a.yG;
import a.zW;
import a.z_;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class w7
extends yG {
    private static final Integer[] eb;
    private static final long[] bb;
    private static int RO;
    private static final Object[] lb;
    private fB RH;
    private static final Map fb;
    private static final long ab;
    private z_ RS;
    private boolean RE;
    private wW Rz;
    boolean Rw;
    private static final String[] mb;

    public static int Y() {
        return RO;
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (mb[n5] != null) {
            return n5;
        }
        Object object = lb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 59;
                break;
            }
            case 1: {
                n4 = 17;
                break;
            }
            case 2: {
                n4 = 62;
                break;
            }
            case 3: {
                n4 = 23;
                break;
            }
            case 4: {
                n4 = 18;
                break;
            }
            case 5: {
                n4 = 13;
                break;
            }
            case 6: {
                n4 = 61;
                break;
            }
            case 7: {
                n4 = 49;
                break;
            }
            case 8: {
                n4 = 44;
                break;
            }
            case 9: {
                n4 = 5;
                break;
            }
            case 10: {
                n4 = 43;
                break;
            }
            case 11: {
                n4 = 63;
                break;
            }
            case 12: {
                n4 = 7;
                break;
            }
            case 13: {
                n4 = 12;
                break;
            }
            case 14: {
                n4 = 9;
                break;
            }
            case 15: {
                n4 = 28;
                break;
            }
            case 16: {
                n4 = 52;
                break;
            }
            case 17: {
                n4 = 51;
                break;
            }
            case 18: {
                n4 = 30;
                break;
            }
            case 19: {
                n4 = 0;
                break;
            }
            case 20: {
                n4 = 25;
                break;
            }
            case 21: {
                n4 = 29;
                break;
            }
            case 22: {
                n4 = 26;
                break;
            }
            case 23: {
                n4 = 42;
                break;
            }
            case 24: {
                n4 = 40;
                break;
            }
            case 25: {
                n4 = 16;
                break;
            }
            case 26: {
                n4 = 38;
                break;
            }
            case 27: {
                n4 = 53;
                break;
            }
            case 28: {
                n4 = 56;
                break;
            }
            case 29: {
                n4 = 2;
                break;
            }
            case 30: {
                n4 = 22;
                break;
            }
            case 31: {
                n4 = 36;
                break;
            }
            case 32: {
                n4 = 54;
                break;
            }
            case 33: {
                n4 = 48;
                break;
            }
            case 34: {
                n4 = 46;
                break;
            }
            case 35: {
                n4 = 20;
                break;
            }
            case 36: {
                n4 = 37;
                break;
            }
            case 37: {
                n4 = 31;
                break;
            }
            case 38: {
                n4 = 55;
                break;
            }
            case 39: {
                n4 = 8;
                break;
            }
            case 40: {
                n4 = 32;
                break;
            }
            case 41: {
                n4 = 35;
                break;
            }
            case 42: {
                n4 = 41;
                break;
            }
            case 43: {
                n4 = 39;
                break;
            }
            case 44: {
                n4 = 50;
                break;
            }
            case 45: {
                n4 = 3;
                break;
            }
            case 46: {
                n4 = 6;
                break;
            }
            case 47: {
                n4 = 60;
                break;
            }
            case 48: {
                n4 = 27;
                break;
            }
            case 49: {
                n4 = 19;
                break;
            }
            case 50: {
                n4 = 1;
                break;
            }
            case 51: {
                n4 = 33;
                break;
            }
            case 52: {
                n4 = 47;
                break;
            }
            case 53: {
                n4 = 34;
                break;
            }
            case 54: {
                n4 = 11;
                break;
            }
            case 55: {
                n4 = 4;
                break;
            }
            case 56: {
                n4 = 58;
                break;
            }
            case 57: {
                n4 = 21;
                break;
            }
            case 58: {
                n4 = 15;
                break;
            }
            case 59: {
                n4 = 10;
                break;
            }
            case 60: {
                n4 = 14;
                break;
            }
            case 61: {
                n4 = 24;
                break;
            }
            case 62: {
                n4 = 45;
                break;
            }
            default: {
                n4 = 57;
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
        w7.mb[n5] = new String(cArray);
        return n5;
    }

    private void z() {
        this.m();
        this.RE = true;
    }

    public static void I(int n2) {
        RO = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(z_ z_2, Tb tb2) {
        long l10 = ab ^ 0x745BA4EB0080L;
        try {
            switch (tb2.l()) {
                case SUCCESS: {
                    Gi.W(new sN(vi.SUCCESS, (String)((Object)w7.d("D", (int)w7.c("t", (int)15769, (long)(0x1D568811F9A2678DL ^ l10)), (long)2699743203302153146L, (long)l10)) + z_2.j() + (String)((Object)w7.d("D", (int)w7.c("t", (int)3007, (long)(0x59372CFDCB50D1AEL ^ l10)), (long)2699743203302153146L, (long)l10))));
                    return;
                }
                case TOO_MANY_INVITES: {
                    Gi.W(new sN(vi.ERROR, (String)((Object)w7.d("D", (int)w7.c("t", (int)17939, (long)(0x60FE1CD55B769C00L ^ l10)), (long)2699743203302153146L, (long)l10))));
                    return;
                }
                case NOT_ONLINE: 
                case ALREADY_INVITED: 
                case FAILED: {
                    Gi.W(new sN(vi.ERROR, (String)((Object)w7.d("D", (int)w7.c("t", (int)4804, (long)(0x3F5D052FCEA2C8D2L ^ l10)), (long)2699743203302153146L, (long)l10)) + z_2.j() + (String)((Object)w7.d("D", (int)w7.c("t", (int)4450, (long)(0x45A6706A88B7CB75L ^ l10)), (long)2699743203302153146L, (long)l10))));
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (O_ o_2) {
            throw w7.a(o_2);
        }
    }

    private void lambda$null$4(z_ z_2, T9 t92) {
        try {
            if (t92.c() == Kx.SUCCESS) {
                this.Rw = true;
                I_.h().c().l(z_2.s(), arg_0 -> this.lambda$null$2(z_2, arg_0), this::lambda$null$3);
            }
        }
        catch (O_ o_2) {
            throw w7.a(o_2);
        }
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7F61;
        if (eb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/w7", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            w7.eb[n3] = n4;
        }
        return eb[n3];
    }

    private void lambda$null$5() {
        this.Rw = false;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = w7.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = w7.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double z() {
        double d2;
        try {
            d2 = this.RE ? super.z() : this.Rz.b();
        }
        catch (O_ o_2) {
            throw w7.a(o_2);
        }
        return d2;
    }

    static void J(w7 w72) {
        w72.R();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private void R() {
        Ao.z(this.RH);
        this.o(this.Rz);
        this.Rz.M(false);
        this.RE = false;
        this.RH.A();
        this.A();
    }

    private void Y() {
        try {
            if (!this.RE) {
                return;
            }
        }
        catch (O_ o_2) {
            throw w7.a(o_2);
        }
        w6 w62 = this.V();
        this.RH.b(this.G());
        this.RH.M(w62.W() + w62.Q().b());
        double d2 = w62.b() - w62.Q().b() - 50.0;
        this.Rz.K().C().B().P(d2);
        this.Rz.K().C().B().i(d2);
        this.Rz.K().C().B().A();
        this.RH.A();
    }

    private void lambda$null$0(z_ z_2, Tb tb2) {
        this.j(z_2, tb2);
    }

    public wW x() {
        return this.Rz;
    }

    private void lambda$null$1() {
        this.Rw = false;
    }

    static void j(w7 w72) {
        w72.z();
    }

    private void lambda$null$2(z_ z_2, Tb tb2) {
        this.j(z_2, tb2);
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Field k(long l10, long l11) {
        int n2 = w7.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = w7.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = w7.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = w7.e(clazz3, string2, clazz2)) != null) {
                    w7.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = w7.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        w7.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = w7.j(259526310906467L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void m() {
        this.J(this.Rz);
        this.RH = Ao.v(this, this.Rz, fB.class);
        this.Rz.M(true);
        this.A();
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c5' || c10 == '\u00f4' || c10 == '\u00d0' || c10 == 'a') {
                field = w7.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c5' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f4' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = w7.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$new$6(z_ z_2) {
        block20: {
            block18: {
                JF jF2;
                long l10;
                block19: {
                    block17: {
                        l10 = ab ^ 0x69313CEE55ABL;
                        try {
                            if (this.Rw) {
                                return;
                            }
                        }
                        catch (O_ o_2) {
                            throw w7.a(o_2);
                        }
                        try {
                            if (z_2.h() == Fv.OFFLINE) {
                                return;
                            }
                        }
                        catch (O_ o_3) {
                            throw w7.a(o_3);
                        }
                        this.Rw = true;
                        jF2 = SE.h.O().p().Q();
                        try {
                            try {
                                if (jF2 == null || jF2.X()) break block17;
                            }
                            catch (O_ o_4) {
                                throw w7.a(o_4);
                            }
                            this.Rw = false;
                            return;
                        }
                        catch (O_ o_5) {
                            throw w7.a(o_5);
                        }
                    }
                    try {
                        try {
                            if (jF2 == null) break block18;
                            if (!jF2.u().contains(z_2)) break block19;
                        }
                        catch (O_ o_6) {
                            throw w7.a(o_6);
                        }
                        this.Rw = false;
                        Gi.W(new sN(vi.ERROR, (String)((Object)w7.d("D", (int)w7.c("t", (int)29760, (long)(0x2A3D078AABFFFB7EL ^ l10)), (long)8096477386085551761L, (long)l10))));
                        return;
                    }
                    catch (O_ o_7) {
                        throw w7.a(o_7);
                    }
                }
                try {
                    if (jF2.H().contains(z_2)) {
                        this.Rw = false;
                        Gi.W(new sN(vi.ERROR, (String)((Object)w7.d("D", (int)w7.c("t", (int)20914, (long)(0xCB49C6171775E8BL ^ l10)), (long)8096477386085551761L, (long)l10))));
                        return;
                    }
                }
                catch (O_ o_8) {
                    throw w7.a(o_8);
                }
                I_.h().c().l(z_2.s(), arg_0 -> this.lambda$null$0(z_2, arg_0), this::lambda$null$1);
                break block20;
            }
            I_.h().c().W(arg_0 -> this.lambda$null$4(z_2, arg_0), this::lambda$null$5);
        }
    }

    private static void D() {
        Object[] objectArray = lb;
        lb[0] = "\u000fEv";
        objectArray[1] = Integer.TYPE;
        w7.mb[1] = "java/lang/Integer";
        objectArray[2] = "T\\/W\u0017Z_S>\u0018jBLT7Q";
        objectArray[3] = "\u001dq\u0014^$5\u0016~\u0005\u0011E;\u001du\u0001K";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "}2G?\u000fb}+US]~L6U\"Me)2L>6<0wA,\fc66BS";
    }

    private void lambda$null$3() {
        this.Rw = false;
    }

    @Override
    public void o(boolean bl2) {
        super.o(bl2);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = w7.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static int H() {
        int n2 = w7.Y();
        try {
            if (n2 == 0) {
                return 106;
            }
        }
        catch (O_ o_2) {
            throw w7.a(o_2);
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                w7.ab = d8.a(2993600323706952633L, -8960824482131438387L, MethodHandles.lookup().lookupClass()).a(162774192566077L);
                w7.lb = new Object[5];
                w7.mb = new String[5];
                w7.D();
                w7.fb = new HashMap<K, V>(13);
                var0 = w7.ab ^ 8226904436873L;
                w7.I(0);
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u00cf$x\u00e1Q\u00e3\u00ad\u00b8\u00cc\u0087\u009f\u00f5\u00c0\u0096\u0080\u00c5\u0004Q\u00e7\u0006\u00b1yN\b\u00e2\u008c\u0098\u00e2.\u00e8\u0089\"\u00e9\u0004C\u0089\u00bd\u0099\u0003>";
                var7_6 = "\u00cf$x\u00e1Q\u00e3\u00ad\u00b8\u00cc\u0087\u009f\u00f5\u00c0\u0096\u0080\u00c5\u0004Q\u00e7\u0006\u00b1yN\b\u00e2\u008c\u0098\u00e2.\u00e8\u0089\"\u00e9\u0004C\u0089\u00bd\u0099\u0003>".length();
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
                    var6_5 = "\u008b\u00181\u008b\u00ccH\u00b5\u00d7O-\u00e9\u00bf\u0095\u0018\u00ed\u00ad";
                    var7_6 = "\u008b\u00181\u008b\u00ccH\u00b5\u00d7O-\u00e9\u00bf\u0095\u0018\u00ed\u00ad".length();
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
        w7.bb = var8_3;
        w7.eb = new Integer[7];
    }

    @Override
    public void E() {
        super.E();
        this.Y();
    }

    private static Method l(long l10, long l11) {
        int n2 = w7.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = w7.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = w7.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = w7.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        w7.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = w7.j(259526310906467L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = w7.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        w7.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = w7.j(259526310906467L, 0L);
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

    public w7(z_ z_2) {
        super(99.0, 24.0);
        this.RS = z_2;
        this.Rz = new wW(z_2);
        this.i(false);
        this.o(this.Rz);
        this.Rz.K().S().F().N(new YH(this));
        this.Rz.X().N(new FK(this));
        this.Rz.K().N(() -> this.lambda$new$6(z_2));
        this.Rz.l().N(new zW(this));
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = w7.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                w7.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void O() {
        SE.h.O().p().h(new B8(SE.h.O().n()));
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = w7.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = w7.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = w7.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public z_ h() {
        return this.Rz.O();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(w7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(w7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

