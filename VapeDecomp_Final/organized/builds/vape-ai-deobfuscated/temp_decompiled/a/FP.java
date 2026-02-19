/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.EP;
import a.F8;
import a.G5;
import a.Ji;
import a.KX;
import a.Ky;
import a.O_;
import a.R_;
import a.SE;
import a.X_;
import a.ai;
import a.ap;
import a.d8;
import a.jz;
import a.kX;
import a.s0;
import a.t1;
import a.tU;
import a.wN;
import java.awt.Color;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fp
extends wN {
    private final ap wn;
    public R_ wq;
    private final ap wf;
    private final ap w4;
    private static final long[] vb;
    private static final String[] Jb;
    private final ap w6;
    private static final Map xb;
    private jz wH;
    private ArrayList<ap> wM;
    private final ap w3;
    private final ap wE;
    private final ap wy;
    private static final long fb;
    private static final Object[] Ib;
    private t1 wi = EP.N();
    private boolean wF = false;
    private static final Integer[] wb;

    private static Method l(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = fp.k(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = fp.l(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int f(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x75D9;
        if (wb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = vb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])xb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    xb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fp", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fp.wb[n3] = n4;
        }
        return wb[n3];
    }

    private static int u(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (Jb[n5] != null) {
            return n5;
        }
        Object object = Ib[n5];
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
                n4 = 8;
                break;
            }
            case 2: {
                n4 = 53;
                break;
            }
            case 3: {
                n4 = 19;
                break;
            }
            case 4: {
                n4 = 43;
                break;
            }
            case 5: {
                n4 = 54;
                break;
            }
            case 6: {
                n4 = 4;
                break;
            }
            case 7: {
                n4 = 33;
                break;
            }
            case 8: {
                n4 = 32;
                break;
            }
            case 9: {
                n4 = 13;
                break;
            }
            case 10: {
                n4 = 30;
                break;
            }
            case 11: {
                n4 = 27;
                break;
            }
            case 12: {
                n4 = 62;
                break;
            }
            case 13: {
                n4 = 18;
                break;
            }
            case 14: {
                n4 = 51;
                break;
            }
            case 15: {
                n4 = 3;
                break;
            }
            case 16: {
                n4 = 28;
                break;
            }
            case 17: {
                n4 = 9;
                break;
            }
            case 18: {
                n4 = 58;
                break;
            }
            case 19: {
                n4 = 44;
                break;
            }
            case 20: {
                n4 = 42;
                break;
            }
            case 21: {
                n4 = 0;
                break;
            }
            case 22: {
                n4 = 24;
                break;
            }
            case 23: {
                n4 = 60;
                break;
            }
            case 24: {
                n4 = 31;
                break;
            }
            case 25: {
                n4 = 45;
                break;
            }
            case 26: {
                n4 = 21;
                break;
            }
            case 27: {
                n4 = 38;
                break;
            }
            case 28: {
                n4 = 10;
                break;
            }
            case 29: {
                n4 = 7;
                break;
            }
            case 30: {
                n4 = 40;
                break;
            }
            case 31: {
                n4 = 61;
                break;
            }
            case 32: {
                n4 = 6;
                break;
            }
            case 33: {
                n4 = 23;
                break;
            }
            case 34: {
                n4 = 20;
                break;
            }
            case 35: {
                n4 = 16;
                break;
            }
            case 36: {
                n4 = 52;
                break;
            }
            case 37: {
                n4 = 36;
                break;
            }
            case 38: {
                n4 = 34;
                break;
            }
            case 39: {
                n4 = 41;
                break;
            }
            case 40: {
                n4 = 26;
                break;
            }
            case 41: {
                n4 = 56;
                break;
            }
            case 42: {
                n4 = 55;
                break;
            }
            case 43: {
                n4 = 17;
                break;
            }
            case 44: {
                n4 = 35;
                break;
            }
            case 45: {
                n4 = 63;
                break;
            }
            case 46: {
                n4 = 39;
                break;
            }
            case 47: {
                n4 = 48;
                break;
            }
            case 48: {
                n4 = 14;
                break;
            }
            case 49: {
                n4 = 57;
                break;
            }
            case 50: {
                n4 = 50;
                break;
            }
            case 51: {
                n4 = 5;
                break;
            }
            case 52: {
                n4 = 37;
                break;
            }
            case 53: {
                n4 = 25;
                break;
            }
            case 54: {
                n4 = 47;
                break;
            }
            case 55: {
                n4 = 15;
                break;
            }
            case 56: {
                n4 = 22;
                break;
            }
            case 57: {
                n4 = 12;
                break;
            }
            case 58: {
                n4 = 49;
                break;
            }
            case 59: {
                n4 = 1;
                break;
            }
            case 60: {
                n4 = 2;
                break;
            }
            case 61: {
                n4 = 11;
                break;
            }
            case 62: {
                n4 = 46;
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
        fp.Jb[n5] = new String(cArray);
        return n5;
    }

    public void a(KX kX2) {
        boolean bl2;
        boolean bl3;
        int n2;
        fp fp2;
        try {
            fp2 = this;
            n2 = kX2.getKey();
            bl3 = kX2.isDown();
            bl2 = kX.C() < 35;
        }
        catch (O_ o_2) {
            throw fp.a(o_2);
        }
        fp2.X(n2, bl3, bl2);
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fp.f(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00df' || c10 == '\u00ea' || c10 == 'd' || c10 == 'G') {
                field = fp.w(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00df' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fp.x(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'l' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ec' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void Q(ap ap2, double d2, double d3, double d4, double d5, String string) {
        boolean bl2;
        Color color;
        double d6;
        double d7;
        double d9;
        double d10;
        long l10 = fb ^ 0x7953859AC6CDL;
        tU tU2 = ap2.G;
        G5 g5 = SE.h.W().u(0.9, false);
        try {
            d10 = d2;
            d9 = d3 - 0.5;
            d7 = d4;
            d6 = d5 + 0.5;
            color = this.s(ap2.C().k());
            bl2 = !ap2.b();
        }
        catch (O_ o_2) {
            throw fp.a(o_2);
        }
        F8.c(d10, d9, d7, d6, color, bl2, 1.0f, 1.0f, 3.0f, new Color(0, 0, 0, 152));
        if (ap2.equals(this.wn)) {
            double d11 = 30.0;
            F8.A(d2 + d4 / 2.0 - d11 / 2.0, d3 + 2.0, d11, 1.5, this.u(ap2.B().k(), 10));
        }
        if (string != null) {
            float f10 = 4.4f;
            X_.B(this.s(ap2.B().k()), (float)(d2 + d4 / 2.5 - 4.0), (float)d3 + 2.0f, string, f10, f10, false);
        } else {
            Object object = ap2 == this.wE ? fp.l("\u00ec", (int)fp.f("p", (int)5177, (long)(0x319F926EFFA4F31BL ^ l10)), (long)1367493641051775016L, (long)l10) : (ap2 == this.w6 ? fp.l("\u00ec", (int)fp.f("p", (int)17275, (long)(0x489A0F8354A245AL ^ l10)), (long)1367493641051775016L, (long)l10) : (ap2 == this.wn ? "" : s0.X(tU2.t())));
            g5.R((String)object, d2 + d4 / 2.5 - g5.D((String)object) / 2.0, d3 + 3.0, this.s(ap2.B().k()));
        }
    }

    private static void T() {
        Object[] objectArray = Ib;
        Ib[0] = "lE\u0018";
        objectArray[1] = Integer.TYPE;
        fp.Jb[1] = "java/lang/Integer";
        objectArray[2] = "J6c[3\\A9r\u0014NDR>{]";
        objectArray[3] = "2sz8\u000f\u00179|kwn\u00192wo-";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ">iP\\Sjm~\u001b!Ik\u000e5Z\u0010[\u007foe\nFD\u00107q\tMHs50\f\u001e\"";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fp.fb = d8.a(4132344062318898800L, 2811704807783994466L, MethodHandles.lookup().lookupClass()).a(59719465700510L);
                fp.Ib = new Object[5];
                fp.Jb = new String[5];
                fp.T();
                fp.xb = new HashMap<K, V>(13);
                var0 = fp.fb ^ 94139805100280L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "DyLnl\u00f9\u00dd}5Ua\u009b\u00041dlQ_\u00c2j8\u0015\u00cc\u00e1.\u00cb\"v{\u00d2\u00ab\u00c4\u00da\u00fb\u00ec6!\u00dekE7w\u00d4@\u00c2\u008b\u0000)\u0097\u00e1\u009c\u00f9\u00d8k\u00f7\u0012\u00cdN\u00b2\u00c8=\u00b75\f";
                var7_6 = "DyLnl\u00f9\u00dd}5Ua\u009b\u00041dlQ_\u00c2j8\u0015\u00cc\u00e1.\u00cb\"v{\u00d2\u00ab\u00c4\u00da\u00fb\u00ec6!\u00dekE7w\u00d4@\u00c2\u008b\u0000)\u0097\u00e1\u009c\u00f9\u00d8k\u00f7\u0012\u00cdN\u00b2\u00c8=\u00b75\f".length();
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
                    var6_5 = "\u0007\u008a:8H\u008a\u0082/#\u001f!\u00b5\u0003<7\u000e";
                    var7_6 = "\u0007\u008a:8H\u008a\u0082/#\u001f!\u00b5\u0003<7\u000e".length();
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
        fp.vb = var8_3;
        fp.wb = new Integer[10];
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = fp.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = fp.l(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean K() {
        return super.R();
    }

    public void P() {
        for (ap ap2 : this.wM) {
            this.s(ap2.G, false);
        }
    }

    public fp() {
        super(jz.class);
        this.wM = new ArrayList();
        this.w3 = new ap(this, this.wi.s());
        this.wy = new ap(this, this.wi.w());
        this.w4 = new ap(this, this.wi.y());
        this.wf = new ap(this, this.wi.h());
        this.wE = new ai(this, this.wi.G());
        this.w6 = new ai(this, this.wi.D());
        this.wn = new ai(this, this.wi.r());
        this.wH = (jz)this.t();
        this.wq = new R_(this);
        this.o(this.wq);
        this.wM.add(this.w3);
        this.wM.add(this.wy);
        this.wM.add(this.w4);
        this.wM.add(this.wf);
        this.wM.add(this.wE);
        this.wM.add(this.w6);
        this.wM.add(this.wn);
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = fp.f(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void s(tU tU2, boolean bl2) {
        this.X(tU2.t(), bl2, false);
    }

    public R_ w() {
        return this.wq;
    }

    @Override
    public boolean R() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.K() || this.wH.r.s().booleanValue()) break block4;
                    }
                    catch (O_ o_2) {
                        throw fp.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw fp.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private boolean k() {
        boolean bl2;
        try {
            if (this.wH == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw fp.a(o_2);
        }
        try {
            bl2 = this.wH.N.J() == this.wH.h;
        }
        catch (O_ o_3) {
            throw fp.a(o_3);
        }
        return bl2;
    }

    private static Field w(long l10, long l11) {
        int n2 = fp.u(l10, l11);
        Object object = Ib[n2];
        if (object instanceof String) {
            String string = Jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = fp.v(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = fp.v(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fp.k(clazz3, string2, clazz2)) != null) {
                    fp.Ib[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = fp.l(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        fp.Ib[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fp.v(250080986389393L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void T(double d2, double d3) {
        long l10 = fb ^ 0x65AD9D855558L;
        X_.d(this.s(this.wE.C().k()), (float)d2, (float)d3, (String)((Object)fp.l("\u00ec", (int)fp.f("p", (int)23167, (long)(0x65E490E64D18AEC1L ^ l10)), (long)-9119986303971052611L, (long)l10)), 0.75f, false);
        X_.d(this.s(this.w6.C().k()), (float)(d2 + 20.0), (float)d3, (String)((Object)fp.l("\u00ec", (int)fp.f("p", (int)23074, (long)(0x7A6EDF28BCE5AE91L ^ l10)), (long)-9119986303971052611L, (long)l10)), 0.75f, false);
        X_.d(this.s(new Color(225, 225, 225)), (float)(d2 + 21.5), (float)(d3 + 7.0), (String)((Object)fp.l("\u00ec", (int)fp.f("p", (int)9752, (long)(0x6B2225FF0E81D2AEL ^ l10)), (long)-9119986303971052611L, (long)l10)), 0.216f, false);
    }

    private static CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void V() {
        double d2;
        double d3;
        double d4;
        block23: {
            block22: {
                CallSite callSite;
                double d5;
                double d6;
                double d7;
                double d9;
                ap ap2;
                fp fp2;
                CallSite callSite2;
                double d10;
                double d11;
                double d12;
                double d13;
                ap ap3;
                fp fp3;
                CallSite callSite3;
                double d14;
                double d15;
                double d16;
                double d17;
                ap ap4;
                fp fp4;
                CallSite callSite4;
                double d18;
                double d19;
                double d20;
                double d21;
                ap ap5;
                fp fp5;
                double d22;
                long l10;
                block21: {
                    l10 = fb ^ 0x9BF5374807L;
                    try {
                        try {
                            if (this.wH == null || !this.wH.r.s().booleanValue()) break block21;
                        }
                        catch (O_ o_2) {
                            throw fp.a(o_2);
                        }
                        this.M(true);
                        this.wq.o(true);
                        this.wq.b(this.G());
                        this.wq.M(this.W());
                        this.wq.T(55.0);
                        this.wq.w(10.0);
                        return;
                    }
                    catch (O_ o_3) {
                        throw fp.a(o_3);
                    }
                }
                this.M(false);
                this.wq.o(false);
                int n2 = 17;
                try {
                    double d23 = d22 = this.Y() ? this.W() + 4.0 : this.W() + 2.0;
                }
                catch (O_ o_4) {
                    throw fp.a(o_4);
                }
                if (this.Y()) {
                    d4 = this.G() + 51.0 + 10.0;
                    d3 = d22 - 6.0;
                } else {
                    d4 = this.G();
                    d3 = d22 + 40.0;
                }
                try {
                    fp5 = this;
                    ap5 = this.w3;
                    d21 = this.G() + 19.0;
                    d20 = d22 - 2.0;
                    d19 = 17.0;
                    d18 = 17.0;
                    callSite4 = this.k() ? fp.l("\u00ec", (int)fp.f("p", (int)18767, (long)(0x21DAD3C2318BA0A0L ^ l10)), (long)-7192202490587992350L, (long)l10) : null;
                }
                catch (O_ o_5) {
                    throw fp.a(o_5);
                }
                try {
                    fp5.Q(ap5, d21, d20, d19, d18, (String)((Object)callSite4));
                    fp4 = this;
                    ap4 = this.w4;
                    d17 = this.G();
                    d16 = d22 + 19.0;
                    d15 = 17.0;
                    d14 = 17.0;
                    callSite3 = this.k() ? fp.l("\u00ec", (int)fp.f("p", (int)9470, (long)(0x47A4649E85A64D10L ^ l10)), (long)-7192202490587992350L, (long)l10) : null;
                }
                catch (O_ o_6) {
                    throw fp.a(o_6);
                }
                try {
                    fp4.Q(ap4, d17, d16, d15, d14, (String)((Object)callSite3));
                    fp3 = this;
                    ap3 = this.wy;
                    d13 = this.G() + 19.0;
                    d12 = d22 + 19.0;
                    d11 = 17.0;
                    d10 = 17.0;
                    callSite2 = this.k() ? fp.l("\u00ec", (int)fp.f("p", (int)23015, (long)(0x6ED614C07A7FB007L ^ l10)), (long)-7192202490587992350L, (long)l10) : null;
                }
                catch (O_ o_7) {
                    throw fp.a(o_7);
                }
                try {
                    fp3.Q(ap3, d13, d12, d11, d10, (String)((Object)callSite2));
                    fp2 = this;
                    ap2 = this.wf;
                    d9 = this.G() + 38.0;
                    d7 = d22 + 19.0;
                    d6 = 17.0;
                    d5 = 17.0;
                    callSite = this.k() ? fp.l("\u00ec", (int)fp.f("p", (int)387, (long)(0x59A1BB0141EB6869L ^ l10)), (long)-7192202490587992350L, (long)l10) : null;
                }
                catch (O_ o_8) {
                    throw fp.a(o_8);
                }
                fp2.Q(ap2, d9, d7, d6, d5, (String)((Object)callSite));
                if (this.P()) {
                    this.Q(this.wn, this.G(), d22 + 39.5, 55.25, 11.0, null);
                    d3 += 14.0;
                }
                try {
                    if (!this.Y()) break block22;
                    this.T(d4 - 2.0, d3);
                    this.wq.T(40.0);
                    break block23;
                }
                catch (O_ o_9) {
                    throw fp.a(o_9);
                }
            }
            this.Q(this.wE, d4, d3, 26.35, 16.0, null);
            this.Q(this.w6, d4 + 26.35 + 2.0, d3, 26.35, 16.0, null);
            this.wq.T(55.0);
        }
        try {
            d2 = this.Y() ? 22.0 : 17.0;
        }
        catch (O_ o_10) {
            throw fp.a(o_10);
        }
        double d24 = d2;
        this.wq.b(d4);
        this.wq.M(d3 + d24);
        this.wq.w(10.0);
        this.wE.Z.Q(0.01);
    }

    private static Method k(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private boolean P() {
        try {
            if (this.wH == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw fp.a(o_2);
        }
        return this.wH.Z.s();
    }

    @Override
    public double w() {
        block5: {
            try {
                try {
                    if (this.wH == null || !this.wH.r.s().booleanValue()) break block5;
                }
                catch (O_ o_2) {
                    throw fp.a(o_2);
                }
                return 75.0;
            }
            catch (O_ o_3) {
                throw fp.a(o_3);
            }
        }
        double d2 = 54.0;
        if (this.Y()) {
            d2 += 48.0;
        }
        return d2;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public String A() {
        long l10 = fb ^ 0x1F30C9B897A7L;
        return fp.l("\u00ec", (int)fp.f("p", (int)13600, (long)(0x1C4994114911036DL ^ l10)), (long)4868450965673308482L, (long)l10);
    }

    @Override
    public void d() {
        boolean bl2;
        block8: {
            block7: {
                boolean bl3;
                try {
                    bl3 = !Ao.K.k();
                }
                catch (O_ o_2) {
                    throw fp.a(o_2);
                }
                bl2 = bl3;
                try {
                    if (this.wF == bl2) {
                        return;
                    }
                }
                catch (O_ o_3) {
                    throw fp.a(o_3);
                }
                try {
                    if (!this.wF) break block7;
                    this.P();
                    break block8;
                }
                catch (O_ o_4) {
                    throw fp.a(o_4);
                }
            }
            this.I();
        }
        this.wF = bl2;
    }

    private void X(int n2, boolean bl2, boolean bl3) {
        for (ap ap2 : this.wM) {
            block13: {
                int n3 = ap2.G.t();
                try {
                    if (n3 < 0) {
                        continue;
                    }
                }
                catch (O_ o_2) {
                    throw fp.a(o_2);
                }
                if (bl3) {
                    n3 = Ji.S(n3);
                }
                try {
                    try {
                        try {
                            try {
                                if (n3 != n2) continue;
                                if (bl2 == ap2.h) break block13;
                            }
                            catch (O_ o_3) {
                                throw fp.a(o_3);
                            }
                            ap2.U();
                            if (bl2) break block13;
                        }
                        catch (O_ o_4) {
                            throw fp.a(o_4);
                        }
                        if (ap2.b()) break block13;
                    }
                    catch (O_ o_5) {
                        throw fp.a(o_5);
                    }
                    ap2.h();
                }
                catch (O_ o_6) {
                    throw fp.a(o_6);
                }
            }
            ap2.h = bl2;
        }
    }

    @Override
    public double b() {
        block8: {
            try {
                try {
                    if (this.wH == null || !this.wH.r.s().booleanValue()) break block8;
                }
                catch (O_ o_2) {
                    throw fp.a(o_2);
                }
                return 20.0;
            }
            catch (O_ o_3) {
                throw fp.a(o_3);
            }
        }
        double d2 = 0.0;
        if (this.Y()) {
            d2 += 40.0;
            if (this.P()) {
                d2 += 14.0;
            }
        } else {
            d2 += 72.0;
            if (this.P()) {
                d2 += 14.0;
            }
        }
        return d2;
    }

    public void N(Ky ky2) {
        for (ap ap2 : this.wM) {
            block12: {
                int n2 = ap2.G.t();
                try {
                    if (kX.C() < 35) {
                        n2 += 100;
                    }
                }
                catch (O_ o_2) {
                    throw fp.a(o_2);
                }
                try {
                    try {
                        try {
                            try {
                                if (n2 != ky2.getButton()) continue;
                                if (ky2.getButtonState() == ap2.h) break block12;
                            }
                            catch (O_ o_3) {
                                throw fp.a(o_3);
                            }
                            ap2.U();
                            if (ky2.getButtonState()) break block12;
                        }
                        catch (O_ o_4) {
                            throw fp.a(o_4);
                        }
                        if (ap2.b()) break block12;
                    }
                    catch (O_ o_5) {
                        throw fp.a(o_5);
                    }
                    ap2.h();
                }
                catch (O_ o_6) {
                    throw fp.a(o_6);
                }
            }
            ap2.h = ky2.getButtonState();
        }
    }

    public void I() {
        for (ap ap2 : this.wM) {
            this.s(ap2.G, ap2.G.X());
        }
    }

    private static Method x(long l10, long l11) {
        int n2 = fp.u(l10, l11);
        Object object = Ib[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = Jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = fp.v(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = fp.v(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fp.k(clazz, string, clazz2, n3, classArray2)) != null) {
                        fp.Ib[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fp.v(250080986389393L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = fp.l(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        fp.Ib[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fp.v(250080986389393L, 0L);
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

    private boolean Y() {
        boolean bl2;
        try {
            if (this.wH == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw fp.a(o_2);
        }
        try {
            bl2 = this.wH.T.J() == this.wH.K;
        }
        catch (O_ o_3) {
            throw fp.a(o_3);
        }
        return bl2;
    }

    private static Class v(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = fp.u(l10, l11);
            object = Ib[n2];
            try {
                if (!(object instanceof String)) break block2;
                fp.Ib[n2] = clazz = Class.forName(Jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fp.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fp.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

