/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.Ct;
import a.F8;
import a.O_;
import a.Sz;
import a.X4;
import a.b6;
import a.d8;
import a.fW;
import a.h;
import a.rk;
import a.w6;
import a.wV;
import a.wX;
import a.wa;
import a.wf;
import a.wj;
import a.ws;
import a.y1;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f7
extends w6 {
    private rk Em;
    private static final long[] eb;
    private static final long ab;
    private static final Object[] qb;
    private static final Integer[] fb;
    private y1 EB;
    private static final String[] rb;
    private static final Map lb;
    private y1 En;
    private y1 EC;
    private rk Ef;
    private y1 Ey;
    private y1 EX;
    private int Ee;
    private y1 Et;

    private static Field o(long l10, long l11) {
        int n2 = f7.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = f7.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = f7.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f7.g(clazz3, string2, clazz2)) != null) {
                    f7.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = f7.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        f7.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f7.n(227480931643386L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void i() {
        fW fW2;
        block21: {
            block20: {
                long l10 = ab ^ 0x604AB1B1FADBL;
                fW2 = Ao.D(fW.class);
                try {
                    if (fW2 == null) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw f7.a(o_2);
                }
                try {
                    if (this.Ee == 1) {
                        this.Ee = (int)f7.d("x", (int)32535, (long)(0x772BDEF4E724E970L ^ l10));
                        this.Em.c();
                        this.Ef.c();
                    }
                }
                catch (O_ o_3) {
                    throw f7.a(o_3);
                }
                try {
                    if (this.Ee == 3) {
                        this.Ee = (int)f7.d("x", (int)28690, (long)(0x28C3FAFB63B0E67DL ^ l10));
                        this.Em.c();
                        this.Ef.c();
                    }
                }
                catch (O_ o_4) {
                    throw f7.a(o_4);
                }
                try {
                    try {
                        if (this.Ee != 4 || this.Em.t().doubleValue() != this.Em.n()) break block20;
                    }
                    catch (O_ o_5) {
                        throw f7.a(o_5);
                    }
                    this.Ee = 0;
                    this.N(false);
                    return;
                }
                catch (O_ o_6) {
                    throw f7.a(o_6);
                }
            }
            try {
                if (this.Ef.t().doubleValue() != this.Ef.p()) {
                    this.B(true);
                    this.W(new X4(fW2.G(), fW2.W(), fW2.w(), fW2.b()));
                    this.b(fW2.G());
                    this.M(fW2.W() + fW2.b() - 2.0 - this.b() * this.Ef.t());
                    this.A();
                }
            }
            catch (O_ o_7) {
                throw f7.a(o_7);
            }
            try {
                try {
                    if (this.G() == fW2.G() && this.W() == fW2.W()) break block21;
                }
                catch (O_ o_8) {
                    throw f7.a(o_8);
                }
                this.m(fW2.G(), fW2.W() + fW2.b() - 2.0 - this.b() * this.Ef.t());
            }
            catch (O_ o_9) {
                throw f7.a(o_9);
            }
        }
        this.M(fW2.W() + fW2.b() - 2.0 - this.b() * this.Ef.t());
        F8.S(fW2.G(), fW2.W(), fW2.w(), fW2.b(), new Color(0, 0, 0, this.Em.t().intValue()));
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (rb[n5] != null) {
            return n5;
        }
        Object object = qb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 53;
                break;
            }
            case 1: {
                n4 = 48;
                break;
            }
            case 2: {
                n4 = 44;
                break;
            }
            case 3: {
                n4 = 18;
                break;
            }
            case 4: {
                n4 = 28;
                break;
            }
            case 5: {
                n4 = 27;
                break;
            }
            case 6: {
                n4 = 38;
                break;
            }
            case 7: {
                n4 = 49;
                break;
            }
            case 8: {
                n4 = 50;
                break;
            }
            case 9: {
                n4 = 54;
                break;
            }
            case 10: {
                n4 = 11;
                break;
            }
            case 11: {
                n4 = 30;
                break;
            }
            case 12: {
                n4 = 23;
                break;
            }
            case 13: {
                n4 = 1;
                break;
            }
            case 14: {
                n4 = 60;
                break;
            }
            case 15: {
                n4 = 24;
                break;
            }
            case 16: {
                n4 = 17;
                break;
            }
            case 17: {
                n4 = 61;
                break;
            }
            case 18: {
                n4 = 14;
                break;
            }
            case 19: {
                n4 = 51;
                break;
            }
            case 20: {
                n4 = 19;
                break;
            }
            case 21: {
                n4 = 39;
                break;
            }
            case 22: {
                n4 = 37;
                break;
            }
            case 23: {
                n4 = 22;
                break;
            }
            case 24: {
                n4 = 26;
                break;
            }
            case 25: {
                n4 = 16;
                break;
            }
            case 26: {
                n4 = 6;
                break;
            }
            case 27: {
                n4 = 25;
                break;
            }
            case 28: {
                n4 = 34;
                break;
            }
            case 29: {
                n4 = 31;
                break;
            }
            case 30: {
                n4 = 21;
                break;
            }
            case 31: {
                n4 = 8;
                break;
            }
            case 32: {
                n4 = 56;
                break;
            }
            case 33: {
                n4 = 36;
                break;
            }
            case 34: {
                n4 = 9;
                break;
            }
            case 35: {
                n4 = 57;
                break;
            }
            case 36: {
                n4 = 29;
                break;
            }
            case 37: {
                n4 = 5;
                break;
            }
            case 38: {
                n4 = 55;
                break;
            }
            case 39: {
                n4 = 42;
                break;
            }
            case 40: {
                n4 = 32;
                break;
            }
            case 41: {
                n4 = 2;
                break;
            }
            case 42: {
                n4 = 10;
                break;
            }
            case 43: {
                n4 = 15;
                break;
            }
            case 44: {
                n4 = 12;
                break;
            }
            case 45: {
                n4 = 35;
                break;
            }
            case 46: {
                n4 = 52;
                break;
            }
            case 47: {
                n4 = 33;
                break;
            }
            case 48: {
                n4 = 13;
                break;
            }
            case 49: {
                n4 = 45;
                break;
            }
            case 50: {
                n4 = 20;
                break;
            }
            case 51: {
                n4 = 4;
                break;
            }
            case 52: {
                n4 = 58;
                break;
            }
            case 53: {
                n4 = 41;
                break;
            }
            case 54: {
                n4 = 47;
                break;
            }
            case 55: {
                n4 = 62;
                break;
            }
            case 56: {
                n4 = 59;
                break;
            }
            case 57: {
                n4 = 3;
                break;
            }
            case 58: {
                n4 = 40;
                break;
            }
            case 59: {
                n4 = 7;
                break;
            }
            case 60: {
                n4 = 46;
                break;
            }
            case 61: {
                n4 = 63;
                break;
            }
            case 62: {
                n4 = 43;
                break;
            }
            default: {
                n4 = 0;
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
        f7.rb[n5] = new String(cArray);
        return n5;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method p(long l10, long l11) {
        int n2 = f7.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = f7.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = f7.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f7.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        f7.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f7.n(227480931643386L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = f7.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        f7.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f7.n(227480931643386L, 0L);
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    public y1 E() {
        return this.EB;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = f7.d(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "bU\u0014";
        objectArray[1] = Integer.TYPE;
        f7.rb[1] = "java/lang/Integer";
        objectArray[2] = "0\u001e1d&F;\u0011 +[^(\u0016)b";
        objectArray[3] = "2%J\u001bu\u001a9*[T\u0014\u00142!_\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "n)rI{4,%6'n5^->H?+fw0\u0018fNgkeK{<ajt_\u0005";
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = f7.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                f7.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public y1 d() {
        return this.EC;
    }

    @Override
    public String A() {
        long l10 = ab ^ 0x5683223F98B7L;
        return f7.e("\u00eb", (int)f7.d("x", (int)28230, (long)(0x2833005A8BF81A40L ^ l10)), (long)4868456149972945993L, (long)l10);
    }

    public f7() {
        long l10 = ab ^ 0xACB4C9F6023L;
        this.Em = new rk(0.15, 0.0, 100.0);
        this.Ef = new rk(0.15, 0.0, 1.0);
        this.EB = new y1((String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)28783, (long)(0x2ACD523D7F94FCE4L ^ l10)), (long)-4970734450031397667L, (long)l10)), (String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)24435, (long)(0xAE6C16B5FC0D3E5L ^ l10)), (long)-4970734450031397667L, (long)l10)), 0.9, 6);
        this.Ey = new y1((String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)20076, (long)(0xC9500AC7243C2FCL ^ l10)), (long)-4970734450031397667L, (long)l10)), (String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)31345, (long)(0x4B76D8184F6276E2L ^ l10)), (long)-4970734450031397667L, (long)l10)), 0.9, 7);
        this.EC = new y1((String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)14692, (long)(0x5A6889330A14B5FEL ^ l10)), (long)-4970734450031397667L, (long)l10)), (String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)4694, (long)(0x6492C353877B9EDEL ^ l10)), (long)-4970734450031397667L, (long)l10)), 0.9, 7);
        this.En = new y1((String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)6708, (long)(0x2DB5D2664DBA96A0L ^ l10)), (long)-4970734450031397667L, (long)l10)), (String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)7832, (long)(0x4A112AAC05319204L ^ l10)), (long)-4970734450031397667L, (long)l10)), 0.9, 7);
        this.Et = new y1((String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)30110, (long)(0x1DA0953C7B1FF907L ^ l10)), (long)-4970734450031397667L, (long)l10)), (String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)499, (long)(0x6D6537995F468D6BL ^ l10)), (long)-4970734450031397667L, (long)l10)), 0.9, 7);
        this.EX = new y1((String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)4729, (long)(0x1774A57BD9EB1EE7L ^ l10)), (long)-4970734450031397667L, (long)l10)), (String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)10116, (long)(0x3B770B38F6372B0EL ^ l10)), (long)-4970734450031397667L, (long)l10)), 0.9, 7);
        this.Ol = false;
        this.B(false);
        this.Q(f7.M.W);
        this.d().m(false);
        this.d().f((String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)22481, (long)(0x71756438787ADB4CL ^ l10)), (long)-4970734450031397667L, (long)l10)));
        Ct ct2 = new Ct(this, (String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)7848, (long)(0x6A5DA93149F1239L ^ l10)), (long)-4970734450031397667L, (long)l10)), (String)((Object)f7.e("\u00eb", (int)f7.d("x", (int)14859, (long)(0x797FD867428DB69EL ^ l10)), (long)-4970734450031397667L, (long)l10)), 0.7);
        ct2.t().y();
        ct2.t().N(new h(this));
        this.EB.E(wj.class);
        this.Ey.E(ws.class);
        this.EC.E(wV.class);
        this.En.E(wX.class);
        this.Et.E(wa.class);
        this.EX.E(wf.class);
        this.a(ct2);
        this.n(new b6(f7.M.S), new Object[0]);
        this.o(this.EB, this.Ey, this.EC, this.En, this.Et, this.EX);
        this.N(false);
        this.B(false, false);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void w(int n2) {
        this.Ee = n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                f7.ab = d8.a(1524833145600909104L, 6078446324050547424L, MethodHandles.lookup().lookupClass()).a(14781759980808L);
                f7.qb = new Object[5];
                f7.rb = new String[5];
                f7.T();
                f7.lb = new HashMap<K, V>(13);
                var0 = f7.ab ^ 113369387887716L;
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
                var8_3 = new long[19];
                var5_4 = 0;
                var6_5 = "T&\u00ef\u00f0\rNUMZ\u00fe\u00ee\u00a1\u00ec\u0003\u00b1\u008e\u00b7\u00bc\u0095\u00ad\u00d5o\u00dcX\u00ba\u00ca\u0089\u000bb\u0011\u00cbd\u00b6\u0092$\u0088\fN\b\u00c8+>\u00c1Vh\u00c25\u0012^\u0097\u00c8P\u00da\u008f\u00900$\u0002\u00d1\u009e\u00d7\u00cc\u0097\u00a2\u00a7\u000f\u00fe\u008dq\u00d5R\u0088S\u0083\u00b8\u00a1\u0094\u00e8f\u00eaj#\u00bd\u008d*\u0011N\u00d8O\u009f\u00f7i~\u0084\u0089\u001b\u008b,\u00ed\u00bdI\u00f3\u00e9\u0003\u0004!\u00bfa}6s${\u00ef\r\u00c4\u0095\u0006\u009c\u00f05\u0089\u0089\u00ee\u00c3J=q\u00a2Xcmn\u00b4\u009b\u00b6";
                var7_6 = "T&\u00ef\u00f0\rNUMZ\u00fe\u00ee\u00a1\u00ec\u0003\u00b1\u008e\u00b7\u00bc\u0095\u00ad\u00d5o\u00dcX\u00ba\u00ca\u0089\u000bb\u0011\u00cbd\u00b6\u0092$\u0088\fN\b\u00c8+>\u00c1Vh\u00c25\u0012^\u0097\u00c8P\u00da\u008f\u00900$\u0002\u00d1\u009e\u00d7\u00cc\u0097\u00a2\u00a7\u000f\u00fe\u008dq\u00d5R\u0088S\u0083\u00b8\u00a1\u0094\u00e8f\u00eaj#\u00bd\u008d*\u0011N\u00d8O\u009f\u00f7i~\u0084\u0089\u001b\u008b,\u00ed\u00bdI\u00f3\u00e9\u0003\u0004!\u00bfa}6s${\u00ef\r\u00c4\u0095\u0006\u009c\u00f05\u0089\u0089\u00ee\u00c3J=q\u00a2Xcmn\u00b4\u009b\u00b6".length();
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
                    var6_5 = "\u0016\u0012\b\u00c8\u00e4.kr\u00c0E\u0091\u001b}U!\u00ad";
                    var7_6 = "\u0016\u0012\b\u00c8\u00e4.kr\u00c0E\u0091\u001b}U!\u00ad".length();
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
        f7.eb = var8_3;
        f7.fb = new Integer[19];
    }

    @Override
    public void a() {
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = f7.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = f7.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void Z(Sz sz2) {
        long l10 = ab ^ 0x172ED674C2AEL;
        try {
            if (!this.s()) {
                this.Ee = (int)f7.d("x", (int)24062, (long)(0x484766E6E09FF3E8L ^ l10));
            }
        }
        catch (O_ o_2) {
            throw f7.a(o_2);
        }
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00b5' || c10 == '\u00f3' || c10 == '\u00e9' || c10 == 'E') {
                field = f7.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00b5' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f7.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ed' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00eb' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int d(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x379F;
        if (fb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = eb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/f7", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f7.fb[n3] = n4;
        }
        return fb[n3];
    }

    public y1 a() {
        return this.EX;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = f7.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void u() {
    }

    @Override
    public y1 F() {
        return this.Ey;
    }

    public int D() {
        return this.Ee;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = f7.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = f7.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static int J(f7 f72, int n2) {
        f72.Ee = n2;
        return f72.Ee;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f7.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(f7.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

