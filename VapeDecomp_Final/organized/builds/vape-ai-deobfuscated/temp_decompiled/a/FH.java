/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.CG;
import a.O_;
import a.SE;
import a._Z;
import a.aq;
import a.b6;
import a.bE;
import a.ct;
import a.d8;
import a.f2;
import a.fY;
import a.hI;
import a.hs;
import a.ht;
import a.n;
import a.vl;
import a.yG;
import a.zC;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fh
extends f2
implements zC {
    private final hs M9;
    private fY Mo;
    private boolean M2;
    private static final String[] vb;
    private static final long ab;
    private static final long[] fb;
    private final hs Mh;
    private yG MM;
    private static final Integer[] lb;
    private static final Object[] ub;
    private fY MA;
    private final String MO;
    private static final Map qb;
    private final CG M3;
    private final List<ht> MX;

    static fY t(fh fh2) {
        return fh2.MA;
    }

    /*
     * Loose catch block
     */
    public void Y() {
        block15: {
            block16: {
                long l10 = ab ^ 0x6F0D9D651B97L;
                if (this.Mo != null) break block16;
                this.M3.X(true);
                try {
                    double d2 = this.w();
                    this.MM = new yG(d2, this.b() - this.M3.b());
                    this.Mo = Ao.v(this, this.MM, fY.class);
                    this.Mo.u(18.0);
                    this.Mo.T(d2);
                    this.MM.d().f((String)((Object)fh.f("J", (int)fh.d("y", (int)29754, (long)(0x2CB7EED99D2770C8L ^ l10)), (long)4968991543703705380L, (long)l10)));
                    this.Mo.A();
                    this.MM.n(new b6(fh.M.S, 0.5, d2), new Object[0]);
                    this.MM.n(new bE(0.0, 0.5), new Object[0]);
                    ArrayList<ht> arrayList = new ArrayList<ht>();
                    for (ht ht2 : this.MX) {
                        block14: {
                            this.MM.o(ht2);
                            ht2.Q(fh.M.a);
                            if (ht2.k() == null) break block14;
                            try {
                                block17: {
                                    if (ht2.k().G() == null) break block14;
                                    break block17;
                                    catch (Exception exception) {
                                        throw fh.a(exception);
                                    }
                                }
                                ht2.Q(fh.M.a);
                            }
                            catch (Exception exception) {
                                throw fh.a(exception);
                            }
                        }
                        try {
                            this.m(ht2, d2);
                            if (!ht2.f()) continue;
                            arrayList.add(ht2);
                        }
                        catch (Exception exception) {
                            throw fh.a(exception);
                        }
                    }
                    try {
                        this.Mo.A();
                        if (arrayList.size() != 1 || !(arrayList.get(0) instanceof hI)) break block15;
                    }
                    catch (Exception exception) {
                        throw fh.a(exception);
                    }
                    hI hI2 = (hI)arrayList.get(0);
                    hI2.l();
                }
                catch (Exception exception) {
                    SE.W(exception);
                }
                break block15;
            }
            try {
                this.M3.x();
                this.X();
                if (this.MA != null) {
                    Ao.z(this.MA);
                    this.MA = null;
                }
            }
            catch (Exception exception) {
                throw fh.a(exception);
            }
        }
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (vb[n5] != null) {
            return n5;
        }
        Object object = ub[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 4;
                break;
            }
            case 1: {
                n4 = 19;
                break;
            }
            case 2: {
                n4 = 3;
                break;
            }
            case 3: {
                n4 = 12;
                break;
            }
            case 4: {
                n4 = 21;
                break;
            }
            case 5: {
                n4 = 41;
                break;
            }
            case 6: {
                n4 = 56;
                break;
            }
            case 7: {
                n4 = 11;
                break;
            }
            case 8: {
                n4 = 53;
                break;
            }
            case 9: {
                n4 = 62;
                break;
            }
            case 10: {
                n4 = 36;
                break;
            }
            case 11: {
                n4 = 9;
                break;
            }
            case 12: {
                n4 = 44;
                break;
            }
            case 13: {
                n4 = 43;
                break;
            }
            case 14: {
                n4 = 34;
                break;
            }
            case 15: {
                n4 = 50;
                break;
            }
            case 16: {
                n4 = 2;
                break;
            }
            case 17: {
                n4 = 15;
                break;
            }
            case 18: {
                n4 = 8;
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
                n4 = 61;
                break;
            }
            case 22: {
                n4 = 55;
                break;
            }
            case 23: {
                n4 = 31;
                break;
            }
            case 24: {
                n4 = 57;
                break;
            }
            case 25: {
                n4 = 45;
                break;
            }
            case 26: {
                n4 = 6;
                break;
            }
            case 27: {
                n4 = 42;
                break;
            }
            case 28: {
                n4 = 30;
                break;
            }
            case 29: {
                n4 = 20;
                break;
            }
            case 30: {
                n4 = 54;
                break;
            }
            case 31: {
                n4 = 23;
                break;
            }
            case 32: {
                n4 = 7;
                break;
            }
            case 33: {
                n4 = 33;
                break;
            }
            case 34: {
                n4 = 49;
                break;
            }
            case 35: {
                n4 = 63;
                break;
            }
            case 36: {
                n4 = 16;
                break;
            }
            case 37: {
                n4 = 37;
                break;
            }
            case 38: {
                n4 = 60;
                break;
            }
            case 39: {
                n4 = 17;
                break;
            }
            case 40: {
                n4 = 32;
                break;
            }
            case 41: {
                n4 = 0;
                break;
            }
            case 42: {
                n4 = 47;
                break;
            }
            case 43: {
                n4 = 14;
                break;
            }
            case 44: {
                n4 = 10;
                break;
            }
            case 45: {
                n4 = 13;
                break;
            }
            case 46: {
                n4 = 51;
                break;
            }
            case 47: {
                n4 = 35;
                break;
            }
            case 48: {
                n4 = 58;
                break;
            }
            case 49: {
                n4 = 18;
                break;
            }
            case 50: {
                n4 = 46;
                break;
            }
            case 51: {
                n4 = 40;
                break;
            }
            case 52: {
                n4 = 1;
                break;
            }
            case 53: {
                n4 = 22;
                break;
            }
            case 54: {
                n4 = 28;
                break;
            }
            case 55: {
                n4 = 26;
                break;
            }
            case 56: {
                n4 = 27;
                break;
            }
            case 57: {
                n4 = 48;
                break;
            }
            case 58: {
                n4 = 38;
                break;
            }
            case 59: {
                n4 = 52;
                break;
            }
            case 60: {
                n4 = 24;
                break;
            }
            case 61: {
                n4 = 5;
                break;
            }
            case 62: {
                n4 = 25;
                break;
            }
            default: {
                n4 = 29;
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
        fh.vb[n5] = new String(cArray);
        return n5;
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

    public CG N() {
        return this.M3;
    }

    public hI j(String string, ht ... htArray) {
        hI hI2 = new hI(string, 0.9, htArray);
        hI2.N(new aq(this, hI2));
        return hI2;
    }

    @Override
    public void V() {
        CallSite callSite;
        hs hs2;
        boolean bl2;
        long l10 = ab ^ 0x764C58ED898AL;
        try {
            this.y();
            this.N().x();
            fh fh2 = this;
            bl2 = !this.M2;
        }
        catch (O_ o_2) {
            throw fh.a(o_2);
        }
        fh2.M2 = bl2;
        for (ht ht2 : this.A()) {
            boolean bl3;
            ht ht3;
            try {
                if (!ht2.b()) {
                    continue;
                }
            }
            catch (O_ o_3) {
                throw fh.a(o_3);
            }
            try {
                ht3 = ht2;
                bl3 = !this.M2;
            }
            catch (O_ o_4) {
                throw fh.a(o_4);
            }
            ht3.N(bl3);
        }
        try {
            if (this.M2) {
                this.z();
            }
        }
        catch (O_ o_5) {
            throw fh.a(o_5);
        }
        try {
            hs2 = this.M9;
            callSite = this.M2 ? fh.f("J", (int)fh.d("y", (int)25174, (long)(0x718B8921DE1474BEL ^ l10)), (long)-2960977964538690247L, (long)l10) : fh.f("J", (int)fh.d("y", (int)2586, (long)(0x7267369CB9859CF6L ^ l10)), (long)-2960977964538690247L, (long)l10);
        }
        catch (O_ o_6) {
            throw fh.a(o_6);
        }
        hs2.u((String)((Object)callSite));
        this.h(true);
    }

    private static Field o(long l10, long l11) {
        int n2 = fh.m(l10, l11);
        Object object = ub[n2];
        if (object instanceof String) {
            String string = vb[n2];
            int n3 = string.indexOf(8);
            Class clazz = fh.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = fh.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fh.g(clazz3, string2, clazz2)) != null) {
                    fh.ub[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = fh.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        fh.ub[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fh.n(237805362594133L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void db() {
        Object[] objectArray = ub;
        ub[0] = "*\u0015\"";
        objectArray[1] = Integer.TYPE;
        fh.vb[1] = "java/lang/Integer";
        objectArray[2] = "9-\nxhW2\"\u001b7\u0015O!%\u0012~";
        objectArray[3] = "\u0007\u000b\u0013jHU\f\u0004\u0002%)[\u0007\u000f\u0006\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u00072C\u0018\u0018\u0013\u001anCu\u0018Wd}\u001b\t\u000fL\u000e|\u001dHs\u0015\u0000gF\u0012\u0014\u0012\u0005m\tu";
    }

    public void z() {
    }

    static fY w(fh fh2, fY fY2) {
        fh2.MA = fY2;
        return fh2.MA;
    }

    public fh(String string, String string2, boolean bl2, boolean bl3) {
        CallSite callSite;
        hs hs2;
        hs hs3;
        long l10 = ab ^ 0x23C146086D1L;
        this.M2 = false;
        this.MX = new ArrayList<ht>();
        this.MO = string2;
        n n2 = this.d();
        try {
            hs hs4;
            n2.o(false);
            n2.y(false);
            n2.m(false);
            n2.i(false);
            n2.f((String)((Object)fh.f("J", (int)fh.d("y", (int)28706, (long)(0x14BDD204040D6994L ^ l10)), (long)-2759850829821998494L, (long)l10)));
            fh fh2 = this;
            hs3 = hs4;
            hs2 = hs4;
            callSite = this.M2 ? fh.f("J", (int)fh.d("y", (int)10777, (long)(0x79BBB8BD61E0B3ABL ^ l10)), (long)-2759850829821998494L, (long)l10) : fh.f("J", (int)fh.d("y", (int)17589, (long)(0x4DD1D5F07449DD04L ^ l10)), (long)-2759850829821998494L, (long)l10);
        }
        catch (O_ o_2) {
            throw fh.a(o_2);
        }
        hs3((String)((Object)callSite), 0.25);
        fh2.M9 = hs2;
        this.M9.N(new ct(this));
        this.Mh = new hs((String)((Object)fh.f("J", (int)fh.d("y", (int)7398, (long)(0x343B232497E00556L ^ l10)), (long)-2759850829821998494L, (long)l10)), 0.9);
        this.Mh.N(new vl(this));
        this.M3 = new CG(this, string, string2);
        this.a(this.M3);
        if (bl2) {
            this.N().w(new _Z(this.M9, false));
        }
        try {
            if (bl3) {
                this.N().A(this.Mh);
                this.N().M().N(this::Y);
            }
        }
        catch (O_ o_3) {
            throw fh.a(o_3);
        }
        this.N().g().N(this::y);
    }

    public void L(String string, boolean bl2) {
        for (ht ht2 : this.H(new ArrayList<ht>(Arrays.asList(this)), 0)) {
            try {
                try {
                    if (!(ht2 instanceof hI) || !((hI)ht2).S().equals(string)) continue;
                }
                catch (O_ o_2) {
                    throw fh.a(o_2);
                }
                ht2.N(bl2);
            }
            catch (O_ o_3) {
                throw fh.a(o_3);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void y() {
        if (this.MA != null) {
            Ao.z(this.MA);
            this.MA = null;
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    this.MX.forEach(arg_0 -> fh.lambda$onSettingsBack$0(arrayList, arg_0));
                    if (arrayList.size() != 1 || !(arrayList.get(0) instanceof hI)) return;
                }
                catch (O_ o_2) {
                    throw fh.a(o_2);
                }
                this.M3.x();
                this.X();
                return;
            }
            catch (O_ o_3) {
                throw fh.a(o_3);
            }
        }
        try {
            if (this.Mo == null) return;
            this.Y();
            return;
        }
        catch (O_ o_4) {
            throw fh.a(o_4);
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public List<ht> o() {
        return this.MX;
    }

    public fY G() {
        return this.Mo;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = fh.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = fh.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = fh.m(l10, l11);
            object = ub[n2];
            try {
                if (!(object instanceof String)) break block2;
                fh.ub[n2] = clazz = Class.forName(vb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fh.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fh.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = fh.h(classArray[i10], string, clazz2);
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
                fh.ab = d8.a(-467743091064023521L, -1914197668021153591L, MethodHandles.lookup().lookupClass()).a(233835358186736L);
                fh.ub = new Object[5];
                fh.vb = new String[5];
                fh.db();
                fh.qb = new HashMap<K, V>(13);
                var0 = fh.ab ^ 41413460184236L;
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
                var6_5 = "Y\u0081_\u00f6<\u00f5\u0010\u00a7v\u0089k\\7\u00a0x\u0086 \u00c5\u0004J\u00a3\u008c;mHK\u00eb+*\u000e\u00a5\u00c9\u0097IP\u009a\u00df\u00db\u00b6\u001a";
                var7_6 = "Y\u0081_\u00f6<\u00f5\u0010\u00a7v\u0089k\\7\u00a0x\u0086 \u00c5\u0004J\u00a3\u008c;mHK\u00eb+*\u000e\u00a5\u00c9\u0097IP\u009a\u00df\u00db\u00b6\u001a".length();
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
                    var6_5 = "\u008b\u00f2\u00fa\u0000\u00f7\u00fa\f\u008e\u00a5\u001c\u00fa\u00dd\u00fe\u00c9\u00d5\u00b0";
                    var7_6 = "\u008b\u00f2\u00fa\u0000\u00f7\u00fa\f\u008e\u00a5\u001c\u00fa\u00dd\u00fe\u00c9\u00d5\u00b0".length();
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
        fh.fb = var8_3;
        fh.lb = new Integer[7];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = fh.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void X() {
        try {
            if (this.Mo != null) {
                Ao.z(this.Mo);
                this.Mo = null;
            }
        }
        catch (O_ o_2) {
            throw fh.a(o_2);
        }
    }

    public void V(ht ... htArray) {
        this.MX.addAll(Arrays.asList(htArray));
        for (ht ht2 : this.MX) {
            try {
                try {
                    ht2.Q(fh.M.E);
                    if (ht2.k() == null || ht2.k().G() == null) continue;
                }
                catch (O_ o_2) {
                    throw fh.a(o_2);
                }
                ht2.Q(fh.M.a);
            }
            catch (O_ o_3) {
                throw fh.a(o_3);
            }
        }
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'H' || c10 == 'B' || c10 == '\u00c7' || c10 == 'G') {
                field = fh.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'H' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fh.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ca' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'J' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public hs L() {
        return this.Mh;
    }

    private void m(ht ht2, double d2) {
        ht2.J(true);
        ht2.T(d2);
        ht2.Y(d2);
        for (ht ht3 : ht2.A()) {
            this.m(ht3, d2);
        }
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    super.d();
                    if (this.MM == null || this.Mo == null) break block4;
                }
                catch (O_ o_2) {
                    throw fh.a(o_2);
                }
                this.MM.A();
                this.Mo.A();
            }
            catch (O_ o_3) {
                throw fh.a(o_3);
            }
        }
    }

    @Override
    public String A() {
        return this.MO;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void lambda$onSettingsBack$0(ArrayList arrayList, ht ht2) {
        try {
            if (ht2.f()) {
                arrayList.add(ht2);
            }
        }
        catch (O_ o_2) {
            throw fh.a(o_2);
        }
    }

    @Override
    public void A() {
        super.h(true);
        this.N().z();
    }

    private static Method p(long l10, long l11) {
        int n2 = fh.m(l10, l11);
        Object object = ub[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = vb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = fh.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = fh.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fh.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        fh.ub[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fh.n(237805362594133L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = fh.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        fh.ub[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fh.n(237805362594133L, 0L);
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

    @Override
    public boolean W() {
        return this.M2;
    }

    public fh(String string, String string2) {
        this(string, string2, true, true);
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x4000;
        if (lb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = fb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])qb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    qb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fh", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fh.lb[n3] = n4;
        }
        return lb[n3];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fh.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fh.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

