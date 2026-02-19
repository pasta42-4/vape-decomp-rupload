/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.CM;
import a.CR;
import a.G9;
import a.Gi;
import a.Gn;
import a.O_;
import a.Ou;
import a.SE;
import a.So;
import a.Wz;
import a.YK;
import a.a;
import a.b6;
import a.bE;
import a.bJ;
import a.bY;
import a.ba;
import a.bt;
import a.d8;
import a.fB;
import a.fY;
import a.fh;
import a.hI;
import a.hs;
import a.ht;
import a.i3;
import a.jr;
import a.kE;
import a.w5;
import a.wC;
import a.wP;
import a.wa;
import a.wh;
import a.wo;
import a.wt;
import a.wv;
import a.y1;
import a.y2;
import a.y3;
import a.yE;
import a.yG;
import a.yc;
import a.yy;
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
public class f0
extends fh {
    private static int[] gP;
    private final yG g1;
    private final yG gw;
    private yE gG;
    private final wP gL;
    private hs gJ;
    private wt gj;
    private CR gv;
    private fB ge;
    private i3 g3;
    private bY gY;
    private yE gV;
    private yE gR;
    private final wo gn;
    private b6 gS;
    private fB gX;
    private final w5 gF;
    private fB g4;
    private yG gI;
    private static final String[] xb;
    private bt gM;
    private static final Object[] wb;
    private yE gi;
    private yE gC;
    private static final long eb;
    private yy gf;
    private yE g8;
    private y2<jr> gt;
    private yE gk;
    private yE gl;
    private fB go;
    private static final Integer[] sb;
    private final y3 gs;
    private static final long[] rb;
    private yE gU;
    private yE g6;
    private yE gD;
    private final yG g9;
    private static final Map tb;
    private yE gE;
    private yE gZ;
    private CM ga;

    private static O_ a(O_ o_2) {
        return o_2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void d() {
        block27: {
            block32: {
                block33: {
                    block28: {
                        block31: {
                            block30: {
                                block26: {
                                    long l10;
                                    block25: {
                                        l10 = eb ^ 0x77DAF8F5BCB8L;
                                        try {
                                            super.d();
                                            if (SE.h.O() == null) {
                                                return;
                                            }
                                        }
                                        catch (O_ o_2) {
                                            throw f0.a(o_2);
                                        }
                                        int n2 = SE.h.O().u().C().size();
                                        try {
                                            if (n2 <= 0) break block25;
                                            this.gJ.u((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)5636, (long)(0x112472C3248DD066L ^ l10)), (long)-6911847159274086666L, (long)l10)));
                                            break block26;
                                        }
                                        catch (O_ o_3) {
                                            throw f0.a(o_3);
                                        }
                                    }
                                    this.gJ.u((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)18080, (long)(0x125B1F83617580C1L ^ l10)), (long)-6911847159274086666L, (long)l10)));
                                }
                                try {
                                    block29: {
                                        try {
                                            try {
                                                try {
                                                    this.gJ.N(false);
                                                    if (!this.gf.P().booleanValue()) break block27;
                                                    if (!YK.C.U().equals((Object)Gn.ONLINE)) break block28;
                                                }
                                                catch (O_ o_4) {
                                                    throw f0.a(o_4);
                                                }
                                                if (SE.h.M().q().size() > 0) break block29;
                                            }
                                            catch (O_ o_5) {
                                                throw f0.a(o_5);
                                            }
                                            if (SE.h.O().p().Q() == null) break block30;
                                        }
                                        catch (O_ o_6) {
                                            throw f0.a(o_6);
                                        }
                                    }
                                    this.P(this.gF);
                                    break block31;
                                }
                                catch (O_ o_7) {
                                    throw f0.a(o_7);
                                }
                            }
                            this.P(this.gn);
                        }
                        this.gJ.N(true);
                        break block33;
                    }
                    this.P(this.gL);
                }
                try {
                    if (this.go == null) break block32;
                    this.gI.N(false);
                    return;
                }
                catch (O_ o_8) {
                    throw f0.a(o_8);
                }
            }
            try {
                if (this.gI == null) return;
                this.gI.N(true);
                return;
            }
            catch (O_ o_9) {
                throw f0.a(o_9);
            }
        }
        try {
            if (this.gI != null) {
                this.gI.N(false);
            }
        }
        catch (O_ o_10) {
            throw f0.a(o_10);
        }
        try {
            if (!this.L().f()) {
                this.L().N(true);
            }
        }
        catch (O_ o_11) {
            throw f0.a(o_11);
        }
        try {
            if (!YK.C.U().equals((Object)Gn.ONLINE)) return;
            this.gJ.N(true);
            return;
        }
        catch (O_ o_12) {
            throw f0.a(o_12);
        }
    }

    private static int e(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6678;
        if (sb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = rb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])tb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    tb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/f0", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f0.sb[n3] = n4;
        }
        return sb[n3];
    }

    private static Method i(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    public void I() {
        Ao.X(this);
        this.go = null;
        this.ge = null;
        this.g4 = null;
        this.gX = null;
        this.N().x();
    }

    private void O() {
        block3: {
            block2: {
                long l10 = eb ^ 0x153048738C3EL;
                try {
                    if (this.g4 != null) break block2;
                    this.g4 = this.C(this.g1, this.gj, fY.class);
                    this.N().b((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)31501, (long)(0x7643F4590F378DE8L ^ l10)), (long)-8029270198426341776L, (long)l10)), false);
                    break block3;
                }
                catch (O_ o_2) {
                    throw f0.a(o_2);
                }
            }
            Ao.z(this.g4);
            this.g4 = null;
            this.N().x();
        }
    }

    private void U4() {
        long l10 = eb ^ 0x711E78D9DA2L;
        this.gY = new bY(SE.h.j().u);
        this.gE = new yE(SE.h.j().b);
        this.gZ = new yE(SE.h.j().A);
        this.gi = new yE(SE.h.j().Z);
        this.gl = new yE(SE.h.j().r);
        Wz wz2 = YK.C.q().f();
        this.gM = new bt((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)28096, (long)(0x7EDAE376E1A28AA6L ^ l10)), (long)-9147268884022886420L, (long)l10)), 0.75, f0.M.n);
        this.gR = new yE(wz2.P);
        this.gC = new yE(wz2.h);
        this.gD = new yE(wz2.l);
        this.g6 = new yE(wz2.p);
        this.gG = new yE(wz2.Y);
        this.gV = new yE(wz2.A);
        Ou ou2 = YK.C.q();
        this.gt = new y2(ou2.q());
        this.g8 = new yE(ou2.M());
        this.gU = new yE(ou2.P());
        this.gk = new yE(ou2.C());
        y1 y12 = new y1((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)32323, (long)(0xE59F257704993CL ^ l10)), (long)-9147268884022886420L, (long)l10)), (String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)31652, (long)(0x4C52AC5C86031CC3L ^ l10)), (long)-9147268884022886420L, (long)l10)), 0.9, 7);
        y12.E(wa.class);
        this.V(this.j((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)20966, (long)(0x770B1F28A99DB69BL ^ l10)), (long)-9147268884022886420L, (long)l10)), this.gE, this.gY, this.gZ, this.gi, this.gl, new ba(SE.h.a().W), new bJ(90.0, 2.0, 0.5, 4.0, f0.M.S), new bE(1.0, 2.0), this.gM, this.gt, this.g8, this.gU, this.gk));
        this.V(this.j((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)21131, (long)(0x6D66F63C2B65B5F5L ^ l10)), (long)-9147268884022886420L, (long)l10)), this.gR, this.gC, this.gD, this.g6, this.gG, this.gV));
        ba ba2 = new ba((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)3804, (long)(0x7CE48EB62F25E9B9L ^ l10)), (long)-9147268884022886420L, (long)l10)), YK.C.q().X(), f0.M.n);
        ba2.I().n(20);
        this.V(ba2);
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = f0.e(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void Z() {
        try {
            if (this.go != null) {
                this.T();
            }
        }
        catch (O_ o_2) {
            throw f0.a(o_2);
        }
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00cf' || c10 == '\u00d3' || c10 == 't' || c10 == 'R') {
                field = f0.s(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00cf' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00d3' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 't' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f0.t(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e1' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static int[] L() {
        return gP;
    }

    private static Method t(long l10, long l11) {
        int n2 = f0.q(l10, l11);
        Object object = wb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = xb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = f0.r(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = f0.r(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f0.i(clazz, string, clazz2, n3, classArray2)) != null) {
                        f0.wb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f0.r(217517559621645L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = f0.j(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        f0.wb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f0.r(217517559621645L, 0L);
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

    public static void w(int[] nArray) {
        gP = nArray;
    }

    private static Method j(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = f0.i(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = f0.j(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public wh f() {
        return this.gF.o();
    }

    public void P() {
        try {
            this.I();
            Gi.I();
            if (!this.gf.P().booleanValue()) {
                this.gf.S((Boolean)false);
            }
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    private static Field s(long l10, long l11) {
        int n2 = f0.q(l10, l11);
        Object object = wb[n2];
        if (object instanceof String) {
            String string = xb[n2];
            int n3 = string.indexOf(8);
            Class clazz = f0.r(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = f0.r(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f0.i(clazz3, string2, clazz2)) != null) {
                    f0.wb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = f0.j(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        f0.wb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f0.r(217517559621645L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                f0.eb = d8.a(-556070031357519937L, 8486799990360379315L, MethodHandles.lookup().lookupClass()).a(212143587155112L);
                f0.wb = new Object[5];
                f0.xb = new String[5];
                f0.eb();
                f0.tb = new HashMap<K, V>(13);
                f0.w(new int[2]);
                var0 = f0.eb ^ 83637521039977L;
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
                var6_5 = "\u001eZ\u00f4v7a:\u008c :\u00c7\u008a\u0014\u00dd\u009d\u00a2o\u00a74\u00c1\u00cb\u00c9(\u00d1)=\u00cc\u00da6:\u0011\u00a3r\u00c8\u00faFg\u000fK\u00f0{p\u000b\u00ce\u00ac\u00107\u008cz\u00eb\u00ff\u0085\u00aeE\u00f0a|\u0017J{DWr\u00e0\u0014AU\u00dfh\u0091\u0015,\u00ed(\u00c6w\u0012:\u00f1[2\u00ee\u00da\u00c5\u00adtf\u000e\u0096\u00cc\b\u00bd\u001f\u0007(\u0093\u0004s\u007f\u00e3\\k\u00f2\u00adt?\u00c5\u00fe\u00c0jA\u0088?7\u00f1\u00df\u0013\u00da/\u001d\u008b;[\u00cc\u008by\u00fa\u0013\u00c6\u007fvo\u00bf\u00fc\u00c0M";
                var7_6 = "\u001eZ\u00f4v7a:\u008c :\u00c7\u008a\u0014\u00dd\u009d\u00a2o\u00a74\u00c1\u00cb\u00c9(\u00d1)=\u00cc\u00da6:\u0011\u00a3r\u00c8\u00faFg\u000fK\u00f0{p\u000b\u00ce\u00ac\u00107\u008cz\u00eb\u00ff\u0085\u00aeE\u00f0a|\u0017J{DWr\u00e0\u0014AU\u00dfh\u0091\u0015,\u00ed(\u00c6w\u0012:\u00f1[2\u00ee\u00da\u00c5\u00adtf\u000e\u0096\u00cc\b\u00bd\u001f\u0007(\u0093\u0004s\u007f\u00e3\\k\u00f2\u00adt?\u00c5\u00fe\u00c0jA\u0088?7\u00f1\u00df\u0013\u00da/\u001d\u008b;[\u00cc\u008by\u00fa\u0013\u00c6\u007fvo\u00bf\u00fc\u00c0M".length();
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
                    var6_5 = "ze\t#\u0019\u00f5(\u009e\u00c7K\u00f7\u00c9b\u00b2Ua";
                    var7_6 = "ze\t#\u0019\u00f5(\u009e\u00c7K\u00f7\u00c9b\u00b2Ua".length();
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
        f0.rb = var8_3;
        f0.sb = new Integer[19];
    }

    public yG S() {
        return this.gw;
    }

    public wt O() {
        return this.gj;
    }

    private static Class r(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = f0.q(l10, l11);
            object = wb[n2];
            try {
                if (!(object instanceof String)) break block2;
                f0.wb[n2] = clazz = Class.forName(xb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void v() {
        this.N().A(this.gJ);
        this.gJ.N(new So(this));
        this.N().g().N(new kE(this));
    }

    public CR u() {
        return this.gv;
    }

    public f0() {
        long l10 = eb ^ 0x44902BF356FFL;
        super(a.cs((int)f0.e("t", (int)7143, (long)(0x4C1195D9D028B7C6L ^ l10))), a.cs((int)f0.e("t", (int)30607, (long)(0x4062A3D70CFB5BA6L ^ l10))));
        this.g1 = new yG(104.0, 150.0);
        this.gw = new yG(104.0, 150.0);
        this.g9 = new yG(104.0, 130.0);
        this.gf = new yc(this, (String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)22962, (long)(0x7F955F31387BF59DL ^ l10)), (long)5355656180782478513L, (long)l10)), (String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)731, (long)(0x3428CCDDC9112EF6L ^ l10)), (long)5355656180782478513L, (long)l10)), true);
        this.gs = new y3();
        this.gj = new wt();
        this.gJ = new hs((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)17849, (long)(0x722A33BD21EAE995L ^ l10)), (long)5355656180782478513L, (long)l10)), 1.0, new Color(180, 180, 180), Color.WHITE, 13.0, 13.0);
        this.gS = new b6(f0.M.S);
        this.gF = new w5();
        this.gn = new wo();
        this.gL = new wP();
        this.g3 = new G9(this);
        this.N(false);
        this.T(103.0);
        this.Y(false);
        this.B(true);
        this.v();
        this.U4();
        this.UH();
        this.P(this.gn);
        this.gJ.g((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)26616, (long)(0x409F64D316EC4BDFL ^ l10)), (long)5355656180782478513L, (long)l10)));
        this.gf.P("", "");
        this.gv = new CR(this);
        this.l(this.g3);
        this.N().n(0.8f);
    }

    private static CallSite j(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void Z(boolean bl2) {
        block8: {
            block7: {
                try {
                    try {
                        this.I();
                        if (bl2) break block7;
                        if (this.ge != null) break block8;
                    }
                    catch (O_ o_2) {
                        throw f0.a(o_2);
                    }
                    this.ge = this.C(this.g9, this.gs, fY.class);
                    break block8;
                }
                catch (O_ o_3) {
                    throw f0.a(o_3);
                }
            }
            try {
                if (this.ge != null) {
                    Ao.z(this.ge);
                    this.ge = null;
                }
            }
            catch (O_ o_4) {
                throw f0.a(o_4);
            }
        }
    }

    public wo A() {
        return this.gn;
    }

    private void J() {
        try {
            if (this.gX == null) {
                this.gX = this.C(this, this.gv, fB.class);
            }
        }
        catch (O_ o_2) {
            throw f0.a(o_2);
        }
        this.y(this.gX);
        this.gX.b(this.G());
        this.gX.M(this.W());
    }

    public w5 l() {
        return this.gF;
    }

    public fB C(ht ht2, ht ht3, Class<? extends fB> clazz) {
        fB fB2 = Ao.v(ht2, ht3, clazz);
        fB2.l(this.g3);
        return fB2;
    }

    private void UH() {
        long l10 = eb ^ 0x2675C79508F8L;
        this.gw.i(150.0);
        this.gw.Y(false);
        this.gw.d().f((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)6441, (long)(0x3685887F26226B00L ^ l10)), (long)1464934378182044342L, (long)l10)));
        this.gw.n(new bE(0.0, 2.0), new Object[0]);
        this.gw.n(this.gf, new Object[0]);
        this.gw.n(new bE(1.0, 4.0), new Object[0]);
        this.gw.n(this.g9, new Object[0]);
        this.g1.i(150.0);
        this.g1.Y(false);
        this.g1.d().f((String)((Object)f0.j("\u00ff", (int)f0.e("t", (int)15926, (long)(0x67844BEC1F184C19L ^ l10)), (long)1464934378182044342L, (long)l10)));
        this.g1.n(this.gw, new Object[0]);
        this.n(this.g1, new Object[0]);
    }

    private void P(yG yG2) {
        try {
            if (this.gI != yG2) {
                this.g9.f();
                this.g9.n(yG2, new Object[0]);
                this.gI = yG2;
                this.T();
                this.I();
            }
        }
        catch (O_ o_2) {
            throw f0.a(o_2);
        }
    }

    static void e(f0 f02) {
        f02.O();
    }

    static fB h(f0 f02) {
        return f02.g4;
    }

    public void p() {
        try {
            if (this.go != null) {
                this.T();
            }
        }
        catch (O_ o_2) {
            throw f0.a(o_2);
        }
        try {
            if (this.ga == null) {
                this.ga = new CM();
            }
        }
        catch (O_ o_3) {
            throw f0.a(o_3);
        }
        this.go = this.C(this.g1, this.ga, fY.class);
        this.L().N(false);
        this.gJ.N(false);
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = f0.e(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static int q(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (xb[n5] != null) {
            return n5;
        }
        Object object = wb[n5];
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
                n4 = 20;
                break;
            }
            case 2: {
                n4 = 54;
                break;
            }
            case 3: {
                n4 = 13;
                break;
            }
            case 4: {
                n4 = 1;
                break;
            }
            case 5: {
                n4 = 55;
                break;
            }
            case 6: {
                n4 = 15;
                break;
            }
            case 7: {
                n4 = 19;
                break;
            }
            case 8: {
                n4 = 16;
                break;
            }
            case 9: {
                n4 = 38;
                break;
            }
            case 10: {
                n4 = 45;
                break;
            }
            case 11: {
                n4 = 27;
                break;
            }
            case 12: {
                n4 = 44;
                break;
            }
            case 13: {
                n4 = 56;
                break;
            }
            case 14: {
                n4 = 41;
                break;
            }
            case 15: {
                n4 = 51;
                break;
            }
            case 16: {
                n4 = 58;
                break;
            }
            case 17: {
                n4 = 30;
                break;
            }
            case 18: {
                n4 = 9;
                break;
            }
            case 19: {
                n4 = 57;
                break;
            }
            case 20: {
                n4 = 43;
                break;
            }
            case 21: {
                n4 = 49;
                break;
            }
            case 22: {
                n4 = 26;
                break;
            }
            case 23: {
                n4 = 10;
                break;
            }
            case 24: {
                n4 = 59;
                break;
            }
            case 25: {
                n4 = 35;
                break;
            }
            case 26: {
                n4 = 53;
                break;
            }
            case 27: {
                n4 = 3;
                break;
            }
            case 28: {
                n4 = 5;
                break;
            }
            case 29: {
                n4 = 37;
                break;
            }
            case 30: {
                n4 = 47;
                break;
            }
            case 31: {
                n4 = 14;
                break;
            }
            case 32: {
                n4 = 33;
                break;
            }
            case 33: {
                n4 = 22;
                break;
            }
            case 34: {
                n4 = 36;
                break;
            }
            case 35: {
                n4 = 39;
                break;
            }
            case 36: {
                n4 = 17;
                break;
            }
            case 37: {
                n4 = 24;
                break;
            }
            case 38: {
                n4 = 2;
                break;
            }
            case 39: {
                n4 = 12;
                break;
            }
            case 40: {
                n4 = 62;
                break;
            }
            case 41: {
                n4 = 52;
                break;
            }
            case 42: {
                n4 = 63;
                break;
            }
            case 43: {
                n4 = 34;
                break;
            }
            case 44: {
                n4 = 60;
                break;
            }
            case 45: {
                n4 = 29;
                break;
            }
            case 46: {
                n4 = 18;
                break;
            }
            case 47: {
                n4 = 21;
                break;
            }
            case 48: {
                n4 = 61;
                break;
            }
            case 49: {
                n4 = 0;
                break;
            }
            case 50: {
                n4 = 7;
                break;
            }
            case 51: {
                n4 = 31;
                break;
            }
            case 52: {
                n4 = 50;
                break;
            }
            case 53: {
                n4 = 32;
                break;
            }
            case 54: {
                n4 = 6;
                break;
            }
            case 55: {
                n4 = 25;
                break;
            }
            case 56: {
                n4 = 4;
                break;
            }
            case 57: {
                n4 = 40;
                break;
            }
            case 58: {
                n4 = 11;
                break;
            }
            case 59: {
                n4 = 28;
                break;
            }
            case 60: {
                n4 = 46;
                break;
            }
            case 61: {
                n4 = 48;
                break;
            }
            case 62: {
                n4 = 8;
                break;
            }
            default: {
                n4 = 42;
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
        f0.xb[n5] = new String(cArray);
        return n5;
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = f0.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = f0.j(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public yy J() {
        return this.gf;
    }

    public void l() {
        Ao.D(f0.class).J().S((Boolean)false);
        this.L().N(true);
    }

    @Override
    public void Y() {
        long l10 = eb ^ 0x2F0B630B5859L;
        if (this.G() == null) {
            boolean bl2 = YK.C.U().equals((Object)Gn.ONLINE);
            List<ht> list = this.o();
            for (ht ht2 : list) {
                if (ht2 instanceof hI) {
                    hI hI2 = (hI)ht2;
                    try {
                        if (hI2.S().equals(f0.j("\u00ff", (int)f0.e("t", (int)19863, (long)(0x59EDC7547DAA6F1AL ^ l10)), (long)4969009089113897495L, (long)l10))) {
                            hI2.N(bl2);
                            continue;
                        }
                    }
                    catch (O_ o_2) {
                        throw f0.a(o_2);
                    }
                    try {
                        if (!hI2.S().equals(f0.j("\u00ff", (int)f0.e("t", (int)10752, (long)(0x11FD338639F8088CL ^ l10)), (long)4969009089113897495L, (long)l10))) continue;
                        hI2.N(bl2);
                        continue;
                    }
                    catch (O_ o_3) {
                        throw f0.a(o_3);
                    }
                }
                try {
                    if (!(ht2 instanceof ba)) continue;
                    ht2.N(bl2);
                }
                catch (O_ o_4) {
                    throw f0.a(o_4);
                }
            }
            this.gM.N(bl2);
            this.gt.N(bl2);
            this.g8.N(bl2);
            this.gU.N(bl2);
            this.gk.N(bl2);
        }
        super.Y();
    }

    public wC v() {
        return this.gs.g();
    }

    @Override
    public void E() {
        this.J();
        this.A();
        super.E();
    }

    private static void eb() {
        Object[] objectArray = wb;
        wb[0] = "I=\u001a";
        objectArray[1] = Integer.TYPE;
        f0.xb[1] = "java/lang/Integer";
        objectArray[2] = "T\u0007q\n7%_\b`EJ=L\u000fi\f";
        objectArray[3] = "P-p\u001f~a[\"aP\u001foP)e\n";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "e\u0018Wl\u001ada\u0006\u001c]\u000e \u0001\u000eW$\u0019=l\u0016\u001c'ebeMF6\\ax\u000b\u001c]";
    }

    static CR G(f0 f02) {
        return f02.gv;
    }

    @Override
    public void V() {
        super.V();
        this.Z(this.gf.P());
    }

    public wv O() {
        return this.gF.r();
    }

    public void T() {
        try {
            if (this.go == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw f0.a(o_2);
        }
        this.N().x();
        Ao.z(this.go);
        this.go = null;
        this.L().N(true);
        this.gJ.N(true);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f0.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(f0.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

